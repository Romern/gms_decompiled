package com.google.android.gms.fido.u2f.api.controller;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UsbBroadcastReceiver extends aacn {

    /* renamed from: c */
    private static final sek f31951c = new sek(new String[]{"UsbBroadcastReceiver"}, (short[]) null);

    /* renamed from: a */
    final xzt f31952a;

    /* renamed from: b */
    private final UsbManager f31953b;

    public UsbBroadcastReceiver(xzt xzt, UsbManager usbManager) {
        super("fido");
        bmxy.m108581a(xzt);
        this.f31952a = xzt;
        bmxy.m108581a(usbManager);
        this.f31953b = usbManager;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        synchronized (this) {
            String action = intent.getAction();
            UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
            if ("com.google.fido.u2f.api.USB_PERMISSION".equals(action)) {
                this.f31952a.f53481e.remove(Integer.valueOf(usbDevice.getDeviceId()));
                if (intent.getBooleanExtra("permission", false)) {
                    f31951c.mo25412b("Permission granted for device (%d)", Integer.valueOf(usbDevice.getDeviceId()));
                    try {
                        this.f31952a.f53480d.put(Integer.valueOf(usbDevice.getDeviceId()), xmh.m43169a(usbDevice, this.f31953b));
                        f31951c.mo25412b("Device (%d) is confirmed to be a U2F device", Integer.valueOf(usbDevice.getDeviceId()));
                    } catch (xmm e) {
                        f31951c.mo25412b("Device (%d) is not a valid U2F device", Integer.valueOf(usbDevice.getDeviceId()));
                    }
                } else {
                    f31951c.mo25412b("Permission denied for device (%d)", Integer.valueOf(usbDevice.getDeviceId()));
                }
            } else if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
                if (!this.f31953b.hasPermission(usbDevice)) {
                    f31951c.mo25412b("Requesting permission for device (%d)", Integer.valueOf(usbDevice.getDeviceId()));
                    this.f31952a.mo30289a(usbDevice);
                } else {
                    f31951c.mo25412b("Already have permission for device (%d)", Integer.valueOf(usbDevice.getDeviceId()));
                    try {
                        this.f31952a.f53480d.put(Integer.valueOf(usbDevice.getDeviceId()), xmh.m43169a(usbDevice, this.f31953b));
                    } catch (xmm e2) {
                        f31951c.mo25412b("Device (%d) is not a valid U2F device", Integer.valueOf(usbDevice.getDeviceId()));
                    }
                }
            } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action)) {
                f31951c.mo25412b("Device (%d) removed", Integer.valueOf(usbDevice.getDeviceId()));
                this.f31952a.f53481e.remove(Integer.valueOf(usbDevice.getDeviceId()));
                this.f31952a.f53480d.remove(Integer.valueOf(usbDevice.getDeviceId()));
                if (this.f31952a.f53480d.isEmpty() && this.f31952a.f53482f == 3) {
                    this.f31952a.mo30291g();
                    this.f31952a.f53482f = 4;
                }
            } else {
                f31951c.mo25412b("Received unexpected action: %s", action);
            }
        }
        if (!this.f31952a.f53481e.isEmpty() || this.f31952a.f53480d.size() != 1) {
            f31951c.mo25412b("Not starting state machine. Still pending device approval.", new Object[0]);
        } else {
            this.f31952a.mo30290f();
        }
    }
}
