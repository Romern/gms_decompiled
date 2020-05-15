package p000;

import com.google.android.gms.common.Feature;

/* renamed from: axdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axdw {

    /* renamed from: a */
    public static final Feature f95842a = new Feature("confirm_transaction_api", 1);

    /* renamed from: b */
    public static final Feature f95843b = new Feature("get_eligibility_api", 1);

    /* renamed from: c */
    public static final Feature f95844c = new Feature("get_recipient_eligibility_api", 1);

    /* renamed from: d */
    public static final Feature f95845d;

    /* renamed from: e */
    public static final Feature[] f95846e;

    static {
        Feature feature = new Feature("get_transaction_details_api", 1);
        f95845d = feature;
        f95846e = new Feature[]{f95842a, f95843b, f95844c, feature};
    }
}
