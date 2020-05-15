package p000;

import com.google.android.gms.common.Feature;

/* renamed from: sxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sxu {

    /* renamed from: a */
    public static final Feature f45398a = new Feature("asterism_consent", 3);

    /* renamed from: b */
    public static final Feature f45399b = new Feature("one_time_verification", 1);

    /* renamed from: c */
    public static final Feature f45400c = new Feature("carrier_auth", 1);

    /* renamed from: d */
    public static final Feature f45401d;

    /* renamed from: e */
    public static final Feature[] f45402e;

    static {
        Feature feature = new Feature("verify_phone_number", 1);
        f45401d = feature;
        f45402e = new Feature[]{f45398a, f45399b, f45400c, feature};
    }
}
