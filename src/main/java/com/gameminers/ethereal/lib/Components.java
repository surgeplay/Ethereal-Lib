/*
 *  Ethereal Lib
 *  Copyright (C) 2014-2015 Aesen Vismea and Falkreon
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.gameminers.ethereal.lib;

import java.awt.Window;

import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.border.EmptyBorder;

public class Components {

	public static Box createPaddedBox(int axis) {
		Box box = new Box(axis);
		box.setBorder(new EmptyBorder(8, 8, 8, 8));
		return box;
	}
	
	public static JMenuItem createAboutDialogMenuItem(Window owner, String product) {
		JMenuItem item = new JMenuItem("About…");
		item.addActionListener(new AboutButtonListener(owner, product));
		return item;
	}

	public static <T extends JComponent> T center(T component) {
		component.setAlignmentX(0.5f);
		return component;
	}

}
