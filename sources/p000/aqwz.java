package p000;

import com.google.android.gms.common.Feature;

/* renamed from: aqwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwz {

    /* renamed from: a */
    public static final Feature f87013a = new Feature("post_setup_pair", 4);

    /* renamed from: b */
    public static final Feature f87014b = new Feature("managed_account_setup", 2);

    /* renamed from: c */
    public static final Feature f87015c = new Feature("esim_activation_setup", 2);

    /* renamed from: d */
    public static final Feature f87016d = new Feature("source_bootstrap_api", 2);

    /* renamed from: e */
    public static final Feature f87017e = new Feature("source_direct_transfer_api", 1);

    /* renamed from: f */
    public static final Feature f87018f = new Feature("target_direct_transfer_api", 1);

    /* renamed from: g */
    public static final Feature f87019g = new Feature("post_setup_api", 1);

    /* renamed from: h */
    public static final Feature f87020h = new Feature("source_direct_transfer_with_progress_api", 1);

    /* renamed from: i */
    public static final Feature f87021i;

    /* renamed from: j */
    public static final Feature[] f87022j;

    static {
        Feature feature = new Feature("target_direct_transfer_with_progress_api", 1);
        f87021i = feature;
        f87022j = new Feature[]{f87013a, f87014b, f87015c, f87016d, f87017e, f87018f, f87019g, f87020h, feature};
    }
}
