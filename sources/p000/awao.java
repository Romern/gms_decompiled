package p000;

import com.google.android.gms.common.Feature;

/* renamed from: awao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awao {

    /* renamed from: a */
    public static final Feature f94133a = new Feature("wallet", 1);

    /* renamed from: b */
    public static final Feature f94134b = new Feature("wallet_biometric_auth_keys", 1);

    /* renamed from: c */
    public static final Feature f94135c = new Feature("wallet_payment_dynamic_update", 2);

    /* renamed from: d */
    public static final Feature f94136d = new Feature("wallet_1p_initialize_buyflow", 1);

    /* renamed from: e */
    public static final Feature f94137e;

    /* renamed from: f */
    public static final Feature[] f94138f;

    static {
        Feature feature = new Feature("wallet_warm_up_ui_process", 1);
        f94137e = feature;
        f94138f = new Feature[]{f94133a, f94134b, f94135c, f94136d, feature};
    }
}
