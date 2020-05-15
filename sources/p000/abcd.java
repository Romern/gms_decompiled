package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

/* renamed from: abcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abcd extends dcj implements abcf {
    public abcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    /* renamed from: a */
    public final void mo31996a() {
        mo8530c(7, mo8529bj());
    }

    /* renamed from: b */
    public final void mo31998b() {
        mo8530c(8, mo8529bj());
    }

    /* renamed from: c */
    public final void mo32004c() {
        mo8528b(10, mo8529bj());
    }

    /* renamed from: d */
    public final void mo32006d() {
        mo8528b(11, mo8529bj());
    }

    /* renamed from: e */
    public final void mo32007e() {
        mo8528b(12, mo8529bj());
    }

    /* renamed from: f */
    public final void mo32008f() {
        mo8528b(14, mo8529bj());
    }

    /* renamed from: g */
    public final void mo32009g() {
        mo8528b(16, mo8529bj());
    }

    /* renamed from: h */
    public final void mo32010h() {
        mo8528b(19, mo8529bj());
    }

    /* renamed from: a */
    public final void mo32000a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(9, bj);
    }

    /* renamed from: b */
    public final void mo32003b(byte[] bArr) {
        Parcel bj = mo8529bj();
        bj.writeByteArray(bArr);
        mo8528b(15, bj);
    }

    /* renamed from: c */
    public final void mo32005c(byte[] bArr) {
        Parcel bj = mo8529bj();
        bj.writeByteArray(bArr);
        mo8528b(18, bj);
    }

    /* renamed from: a */
    public final void mo31999a(GoogleHelp googleHelp) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, googleHelp);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo32001a(InProductHelp inProductHelp) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, inProductHelp);
        mo8528b(17, bj);
    }

    /* renamed from: a */
    public final void mo32002a(byte[] bArr) {
        Parcel bj = mo8529bj();
        bj.writeByteArray(bArr);
        mo8528b(13, bj);
    }
}
