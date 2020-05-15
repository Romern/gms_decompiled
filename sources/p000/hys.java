package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: hys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hys extends dcj implements hyu {
    public hys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    /* renamed from: a */
    public final void mo12817a(hyo hyo) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hyo);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo12818a(hyy hyy) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12820a(String str, hyy hyy) {
        throw null;
    }

    /* renamed from: b */
    public final void mo12822b(rnt rnt) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12819a(String str, hyr hyr) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8164a(bj, hyr);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo12821a(rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        mo8528b(3, bj);
    }
}
