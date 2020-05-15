package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;

/* renamed from: apqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apqo extends dcj implements apqq {
    public apqo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
    }

    /* renamed from: a */
    public final void mo47517a(apqn apqn) {
        throw null;
    }

    /* renamed from: b */
    public final void mo47520b(apqn apqn) {
        throw null;
    }

    /* renamed from: c */
    public final void mo47521c(apqn apqn) {
        throw null;
    }

    /* renamed from: a */
    public final void mo47518a(GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, apqn apqn) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getGlobalSearchSourcesCall$Request);
        dcl.m8164a(bj, apqn);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo47519a(SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, apqn apqn) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setIncludeInGlobalSearchCall$Request);
        dcl.m8164a(bj, apqn);
        mo8528b(8, bj);
    }
}
