package p000;

import android.hardware.usb.UsbAccessory;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: mfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mfw extends dcj implements mfy {
    public mfw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.d2d.migrate.service.IBoundD2dSourceService");
    }

    /* renamed from: a */
    public final void mo19953a() {
        mo8530c(4, mo8529bj());
    }

    /* renamed from: c */
    public final void mo19957c() {
        mo8530c(5, mo8529bj());
    }

    /* renamed from: d */
    public final void mo19958d() {
        mo8530c(6, mo8529bj());
    }

    /* renamed from: e */
    public final void mo19959e() {
        mo8530c(7, mo8529bj());
    }

    /* renamed from: f */
    public final void mo19960f() {
        mo8530c(8, mo8529bj());
    }

    /* renamed from: a */
    public final void mo19954a(UsbAccessory usbAccessory) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, usbAccessory);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo19955a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo19956a(String str, mgb mgb) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8164a(bj, mgb);
        mo8530c(1, bj);
    }
}
