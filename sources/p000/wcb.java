package p000;

import com.google.android.chimera.Activity;

/* renamed from: wcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wcb implements cayy {

    /* renamed from: a */
    private final cijl f50479a;

    /* renamed from: b */
    private final cijl f50480b;

    public wcb(cijl cijl, cijl cijl2) {
        this.f50479a = cijl;
        this.f50480b = cijl2;
    }

    /* renamed from: b */
    public final bycm mo6445a() {
        return m41747a((Activity) ((cayz) this.f50479a).f176439a, ((wca) this.f50480b).mo6445a());
    }

    /* renamed from: a */
    public static bycm m41747a(Activity activity, bycl bycl) {
        bycm bycm;
        if (activity.getResources().getConfiguration().orientation != 2 || (bycl.f165664a & 2) == 0) {
            bycm = bycl.f165665b;
            if (bycm == null) {
                bycm = bycm.f165667e;
            }
        } else {
            bycm = bycl.f165666c;
            if (bycm == null) {
                bycm = bycm.f165667e;
            }
        }
        cazf.m127593a(bycm, "Cannot return null from a non-@Nullable @Provides method");
        return bycm;
    }
}
