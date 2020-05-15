package p000;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* renamed from: acay */
final /* synthetic */ class acay implements bqeh {

    /* renamed from: a */
    static final bqeh f59408a = new acay();

    private acay() {
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        gid gid = (gid) obj;
        if (gid instanceof gil) {
            return bqga.m112777a((Throwable) new bdqw(gid));
        }
        if (gid instanceof C1020gis) {
            return bqga.m112777a((Throwable) new bdqy(gid));
        }
        if (gid instanceof UserRecoverableAuthException) {
            return bqga.m112777a((Throwable) new bdqx(gid));
        }
        return bqga.m112777a((Throwable) new bdqv(gid));
    }
}
