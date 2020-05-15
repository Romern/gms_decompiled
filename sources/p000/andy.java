package p000;

import com.google.android.gms.common.Feature;

/* renamed from: andy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class andy {

    /* renamed from: a */
    public static final Feature f76701a = new Feature("set_dimensions_api", 1);

    /* renamed from: b */
    public static final Feature f76702b = new Feature("get_serving_version_api", 1);

    /* renamed from: c */
    public static final Feature f76703c = new Feature("get_experiment_tokens_api", 1);

    /* renamed from: d */
    public static final Feature f76704d;

    /* renamed from: e */
    public static final Feature[] f76705e;

    static {
        Feature feature = new Feature("sync_after_api", 1);
        f76704d = feature;
        f76705e = new Feature[]{f76701a, f76702b, f76703c, feature};
    }
}
