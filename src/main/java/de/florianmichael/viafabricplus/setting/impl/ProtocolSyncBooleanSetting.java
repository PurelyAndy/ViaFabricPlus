package de.florianmichael.viafabricplus.setting.impl;

import com.google.gson.JsonObject;
import de.florianmichael.viafabricplus.platform.ProtocolRange;
import de.florianmichael.viafabricplus.setting.SettingGroup;
import de.florianmichael.viafabricplus.setting.groups.GeneralSettings;
import de.florianmichael.vialoadingbase.ViaLoadingBase;

public class ProtocolSyncBooleanSetting extends BooleanSetting {
    private final ProtocolRange protocolRange;

    public ProtocolSyncBooleanSetting(SettingGroup parent, String name, ProtocolRange protocolRange) {
        super(parent, name, true);

        this.protocolRange = protocolRange;
    }

    @Override
    public void write(JsonObject object) {
        object.addProperty(getName(), getValue());
    }

    @Override
    public void read(JsonObject object) {
        if (!object.has(getName())) return;

        setValue(object.get(getName()).getAsBoolean());
    }

    @Override
    public Boolean getValue() {
        if (GeneralSettings.getClassWrapper().automaticallyChangeValuesBasedOnTheCurrentVersion.getValue()) return this.getProtocolRange().contains(ViaLoadingBase.getTargetVersion());

        return super.getValue();
    }

    public ProtocolRange getProtocolRange() {
        return protocolRange;
    }
}
