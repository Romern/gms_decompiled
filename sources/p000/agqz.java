package p000;

import android.content.Context;

/* renamed from: agqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agqz {

    /* renamed from: d */
    public static final srn f66303d = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: e */
    private static agqz f66304e;

    /* renamed from: a */
    agrq f66305a;

    /* renamed from: b */
    public agqu f66306b;

    /* renamed from: c */
    public final agyo f66307c = new agyo();

    /* renamed from: f */
    private String f66308f;

    private agqz() {
    }

    /* renamed from: a */
    public static agqz m54893a() {
        agqz agqz;
        synchronized (agqz.class) {
            if (f66304e == null) {
                f66304e = new agqz();
            }
            agqz = f66304e;
        }
        return agqz;
    }

    /* renamed from: b */
    public static bwbv m54895b(bwbv bwbv) {
        if (!cfmj.m140158g()) {
            return null;
        }
        return bwbv;
    }

    /* renamed from: b */
    public static boolean m54896b() {
        return cfmj.m140161j() && agpk.m54726a().mo35843c() != null;
    }

    /* renamed from: a */
    public static boolean m54894a(bwbv bwbv) {
        if (!cfmj.m140157f()) {
            return false;
        }
        bszx a = bszx.m116352a(bwbv.f158782d);
        if (a == null) {
            a = bszx.UNRECOGNIZED;
        }
        return a == bszx.GCORE_MSG_TYPE_HIDDEN && bwbu.m121732a(bwbv.f158779a) == bwbu.f158773d;
    }

    /* renamed from: a */
    public final String mo35966a(Context context) {
        String str;
        String str2;
        synchronized (this) {
            if (this.f66308f == null) {
                if (context != null) {
                    try {
                        str2 = aaks.m21407a(context);
                    } finally {
                    }
                } else {
                    str2 = null;
                }
                this.f66308f = str2;
                if (str2 != null && !str2.equals(null)) {
                    f66303d.mo26019b(agyt.m55307c()).mo68420a("Token changed from: %s.", (Object) null);
                }
            }
            str = this.f66308f;
        }
        return str;
    }
}
