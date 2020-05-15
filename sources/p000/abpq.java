package p000;

import com.google.android.gms.common.Feature;

/* renamed from: abpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpq {

    /* renamed from: a */
    public static final Feature f57883a = new Feature("mdh_read_sync_status", 1);

    /* renamed from: b */
    public static final Feature f57884b = new Feature("mdh_time_series_write", 1);

    /* renamed from: c */
    public static final Feature f57885c = new Feature("mdh_broadcast_listeners", 1);

    /* renamed from: d */
    public static final Feature f57886d = new Feature("mdd_download_right_now", 1);

    /* renamed from: e */
    public static final Feature f57887e = new Feature("mdd_delayed_download", 1);

    /* renamed from: f */
    public static final Feature f57888f = new Feature("mobstore_write_api", 1);

    /* renamed from: g */
    public static final Feature f57889g;

    /* renamed from: h */
    public static final Feature[] f57890h;

    static {
        Feature feature = new Feature("mobstore_rename", 1);
        f57889g = feature;
        f57890h = new Feature[]{f57883a, f57884b, f57885c, f57886d, f57887e, f57888f, feature};
    }
}
