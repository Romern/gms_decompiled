package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: rpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rpc {
    @Deprecated
    /* renamed from: a */
    public static aucb m34200a(aucb aucb) {
        return aucb.mo50363a(new rpb());
    }

    /* renamed from: a */
    public static void m34201a(Status status, aucf aucf) {
        m34202a(status, null, aucf);
    }

    /* renamed from: a */
    public static void m34202a(Status status, Object obj, aucf aucf) {
        if (status.mo17710c()) {
            aucf.mo50391a(obj);
        } else {
            aucf.mo50390a((Exception) new rjp(status));
        }
    }
}
