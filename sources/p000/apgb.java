package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: apgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apgb extends dcj implements apgd {
    public apgb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    /* renamed from: a */
    public final void mo47175a() {
        mo8528b(13, mo8529bj());
    }

    /* renamed from: a */
    public final void mo47176a(int i, Bundle bundle) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47177a(apga apga) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47178a(apga apga, int i) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47179a(apga apga, int i, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47180a(apga apga, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47181a(apga apga, String str, int i, byte[] bArr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47182a(apga apga, String str, byte[] bArr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47183a(apga apga, String str, int[] iArr, int i, String str2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47184a(apga apga, byte[] bArr) {
        throw null;
    }

    /* renamed from: b */
    public final void mo47186b(apga apga) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apga);
        mo8528b(12, bj);
    }

    /* renamed from: c */
    public final void mo47187c(apga apga) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apga);
        mo8528b(9, bj);
    }

    /* renamed from: d */
    public final void mo47188d(apga apga) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apga);
        mo8528b(14, bj);
    }

    /* renamed from: e */
    public final void mo47189e(apga apga) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apga);
        mo8528b(4, bj);
    }

    /* renamed from: f */
    public final void mo47190f(apga apga) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apga);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo47185a(apga apga, byte[] bArr, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apga);
        bj.writeByteArray(bArr);
        bj.writeString(str);
        mo8528b(7, bj);
    }
}
