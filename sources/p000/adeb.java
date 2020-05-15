package p000;

import com.google.android.gms.common.Feature;

/* renamed from: adeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adeb {

    /* renamed from: a */
    public static final Feature f61479a = new Feature("device_enabled_api", 1);

    /* renamed from: b */
    public static final Feature f61480b = new Feature("instant_app_removed_api", 1);

    /* renamed from: c */
    public static final Feature f61481c = new Feature("instant_app_installed_api", 1);

    /* renamed from: d */
    public static final Feature f61482d;

    static {
        Feature feature = new Feature("instant_app_uninstalled_api", 1);
        f61482d = feature;
        Feature[] featureArr = {f61479a, f61480b, f61481c, feature};
    }
}
