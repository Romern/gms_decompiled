package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: auqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auqo extends dcj implements auqq {
    public auqo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.trustagent.internal.ITrustletServiceCallback");
    }

    /* renamed from: a */
    public final void mo50809a(Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo50810a(boolean z, boolean z2, boolean z3, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        dcl.m8166a(bj, z2);
        dcl.m8166a(bj, z3);
        bj.writeString(str);
        bj.writeString(str2);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final boolean mo50811a() {
        Parcel a = mo8526a(2, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
