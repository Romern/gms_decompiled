package p000;

import com.google.android.gms.common.Feature;

/* renamed from: wzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzj {

    /* renamed from: a */
    public static final Feature f51600a = new Feature("is_user_verifying_platform_authenticator_available", 1);

    /* renamed from: b */
    public static final Feature f51601b = new Feature("is_user_verifying_platform_authenticator_available_for_credential", 1);

    /* renamed from: c */
    public static final Feature f51602c = new Feature("zero_party_api_sign", 1);

    /* renamed from: d */
    public static final Feature f51603d;

    /* renamed from: e */
    public static final Feature[] f51604e;

    static {
        Feature feature = new Feature("zero_party_api_register", 1);
        f51603d = feature;
        f51604e = new Feature[]{f51600a, f51601b, f51602c, feature};
    }
}
