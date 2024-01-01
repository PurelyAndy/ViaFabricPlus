/*
 * This file is part of ViaFabricPlus - https://github.com/FlorianMichael/ViaFabricPlus
 * Copyright (C) 2021-2024 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and RK_01/RaphiMC
 * Copyright (C) 2023-2024 contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.florianmichael.viafabricplus.injection.access;

import net.raphimc.vialoader.util.VersionEnum;

public interface IServerInfo {

    VersionEnum viaFabricPlus$forcedVersion();
    void viaFabricPlus$forceVersion(final VersionEnum version);

    boolean viaFabricPlus$passedDirectConnectScreen();
    void viaFabricPlus$passDirectConnectScreen();

    VersionEnum viaFabricPlus$translatingVersion();
    void viaFabricPlus$setTranslatingVersion(final VersionEnum version);

}
