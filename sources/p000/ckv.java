package p000;

import com.android.volley.DefaultRetryPolicy;

/* renamed from: ckv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ckv implements cjq {

    /* renamed from: a */
    public static final cdj f6991a = cdj.m3994a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf((int) DefaultRetryPolicy.DEFAULT_TIMEOUT_MS));

    /* renamed from: b */
    private final cjo f6992b;

    public ckv() {
        this(null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cjp mo3930a(Object obj, int i, int i2, cdk cdk) {
        cjd cjd = (cjd) obj;
        cjo cjo = this.f6992b;
        if (cjo != null) {
            cjn a = cjn.m4362a(cjd);
            Object b = cjo.f6947a.mo8173b(a);
            a.mo3946a();
            cjd cjd2 = (cjd) b;
            if (cjd2 == null) {
                cjo cjo2 = this.f6992b;
                cjo2.f6947a.mo8174b(cjn.m4362a(cjd), cjd);
            } else {
                cjd = cjd2;
            }
        }
        return new cjp(cjd, new cec(cjd, ((Integer) cdk.mo3739a(f6991a)).intValue()));
    }

    public ckv(cjo cjo) {
        this.f6992b = cjo;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3931a(Object obj) {
        cjd cjd = (cjd) obj;
        return true;
    }
}
