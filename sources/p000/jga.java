package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: jga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jga extends dcj implements jgc {
    public jga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.managed.internal.IEmmService");
    }

    /* renamed from: a */
    public final void mo13709a(jfz jfz, String str, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, jfz);
        bj.writeString(str);
        dcl.m8165a(bj, bundle);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo13710a(jfz jfz, String str, String str2) {
        throw null;
    }
}
