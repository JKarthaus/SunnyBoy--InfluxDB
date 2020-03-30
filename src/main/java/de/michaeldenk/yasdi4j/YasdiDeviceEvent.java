/*
 * yasdi4j -- Java Binding for YASDI
 * Copyright (c) 2008 Michael Denk <code@michaeldenk.de>
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package de.michaeldenk.yasdi4j;

/**
 * An event that indicates that a device was added or removed.
 * 
 * @author Michael Denk <code@michaeldenk.de>
 */
public class YasdiDeviceEvent {
	private YasdiDevice device;

	YasdiDeviceEvent(YasdiDevice device) {
		this.device = device;
	}

	/**
	 * Returns the device that caused this event.
	 */
	public YasdiDevice getDevice() {
		return device;
	}

	/**
	 * Returns the name of the device that caused this event.
	 * 
	 * @deprecated
	 */
	@Deprecated
	public String getDeviceName() {
		return device.getName();
	}

	@Override
	public String toString() {
		return getClass().getName() + "[" + device + "]";
	}
}