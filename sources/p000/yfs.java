package p000;

/* renamed from: yfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfs {
    /* renamed from: a */
    public static boolean m43994a(yfr yfr) {
        return bzzp.f172145a.contains(yfr.mo30427f()) && yxy.m44966b(yfr.mo30422b().mo30409a());
    }

    /* renamed from: b */
    public static boolean m43995b(yfr yfr) {
        if (yxy.m44966b(yfr.mo30422b().mo30409a()) && "session_activity_segment".equals(yfr.mo30427f())) {
            return true;
        }
        return yxy.m44965a(yfr.mo30422b().mo30409a()) && yfr.mo30427f().startsWith("__VIRTUAL__");
    }

    /* renamed from: c */
    public static boolean m43996c(yfr yfr) {
        return yxy.m44965a(yfr.mo30422b().mo30409a()) && "user_input".equals(yfr.mo30427f());
    }

    /* renamed from: d */
    public static boolean m43997d(yfr yfr) {
        return yfr.mo30422b().mo30410b() && "detected_sports_session".equals(yfr.mo30427f());
    }
}
