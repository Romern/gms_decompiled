package p000;

import com.google.android.gms.common.Feature;

/* renamed from: aopn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopn {

    /* renamed from: a */
    public static final Feature f78651a = new Feature("verify_with_recaptcha_v2_internal", 1);

    /* renamed from: b */
    public static final Feature f78652b = new Feature("init", 2);

    /* renamed from: c */
    public static final Feature f78653c = new Feature("execute", 4);

    /* renamed from: d */
    public static final Feature f78654d;

    /* renamed from: e */
    public static final Feature[] f78655e;

    static {
        Feature feature = new Feature("close", 2);
        f78654d = feature;
        f78655e = new Feature[]{f78651a, f78652b, f78653c, feature};
    }
}
