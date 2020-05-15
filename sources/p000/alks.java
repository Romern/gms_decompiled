package p000;

import com.google.android.gms.common.Feature;

/* renamed from: alks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alks {

    /* renamed from: a */
    public static final Feature f73598a = new Feature("bulk_lookup_api", 2);

    /* renamed from: b */
    public static final Feature f73599b = new Feature("backup_and_sync_api", 3);

    /* renamed from: c */
    public static final Feature f73600c = new Feature("backup_and_sync_suggestion_api", 1);

    /* renamed from: d */
    public static final Feature f73601d = new Feature("sync_high_res_photo_api", 1);

    /* renamed from: e */
    public static final Feature f73602e = new Feature("get_first_full_sync_status_api", 1);

    /* renamed from: f */
    public static final Feature f73603f;

    /* renamed from: g */
    public static final Feature[] f73604g;

    static {
        Feature feature = new Feature("account_categories_api", 1);
        f73603f = feature;
        f73604g = new Feature[]{f73598a, f73599b, f73600c, f73601d, f73602e, feature};
    }
}
