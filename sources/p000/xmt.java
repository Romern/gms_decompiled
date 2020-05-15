package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: xmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xmt extends dcj implements xmv {
    public xmt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService");
    }

    /* renamed from: a */
    public final void mo29638a(rnt rnt, String str, long j) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        bj.writeLong(j);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo29639a(rnt rnt, String str, byte[] bArr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo29642a(xmz xmz, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo29640a(xmy xmy, String str, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, xmy);
        bj.writeString(str);
        bj.writeInt(i);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo29641a(xmy xmy, String str, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, xmy);
        bj.writeString(str);
        bj.writeByteArray(bArr);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo29643a(xnc xnc, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, xnc);
        bj.writeString(str);
        mo8528b(5, bj);
    }
}
