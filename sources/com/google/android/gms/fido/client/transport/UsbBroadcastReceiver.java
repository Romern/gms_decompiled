package com.google.android.gms.fido.client.transport;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UsbBroadcastReceiver extends aacn {

    /* renamed from: c */
    private static final sek f31665c = new sek(new String[]{"UsbBroadcastReceiver"}, (short[]) null);

    /* renamed from: a */
    private final xhg f31666a;

    /* renamed from: b */
    private final UsbManager f31667b;

    public UsbBroadcastReceiver(xhg xhg, UsbManager usbManager) {
        super("fido");
        bmxy.m108581a(xhg);
        this.f31666a = xhg;
        this.f31667b = usbManager;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
            if (usbDevice == null) {
                f31665c.mo25418e("Usb intent received, but device is null.", new Object[0]);
            } else if ("com.google.fido.android.gms.fido.client.USB_PERMISSION".equals(action)) {
                this.f31666a.mo29744a(usbDevice);
            } else if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
                if (!this.f31667b.hasPermission(usbDevice)) {
                    xhg xhg = this.f31666a;
                    xhg.f52292k.requestPermission(usbDevice, xhg.f52289h);
                    return;
                }
                this.f31666a.mo29744a(usbDevice);
            } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action)) {
                this.f31666a.f52290i.remove(Integer.valueOf(usbDevice.getDeviceId()));
            }
        }
    }
}
