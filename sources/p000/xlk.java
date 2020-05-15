package p000;

import android.hardware.usb.UsbDeviceConnection;

/* renamed from: xlk */
final /* synthetic */ class xlk implements Runnable {

    /* renamed from: a */
    private final xlm f52662a;

    public xlk(xlm xlm) {
        this.f52662a = xlm;
    }

    public final void run() {
        xlm xlm = this.f52662a;
        xmh xmh = xlm.f52667a;
        UsbDeviceConnection usbDeviceConnection = xmh.f52740e;
        if (usbDeviceConnection != null) {
            xmh.f52740e = null;
            usbDeviceConnection.releaseInterface(xmh.f52737b.getInterface(xmh.f52738c));
            usbDeviceConnection.close();
        }
        xlm.f52669c.set(false);
    }
}
