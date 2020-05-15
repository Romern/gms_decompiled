package p000;

import com.google.android.gms.common.Feature;

/* renamed from: ghy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ghy {

    /* renamed from: a */
    public static final Feature f18275a = new Feature("account_data_service", 6);

    /* renamed from: b */
    public static final Feature f18276b = new Feature("account_data_service_legacy", 1);

    /* renamed from: c */
    public static final Feature f18277c = new Feature("account_data_service_token", 2);

    /* renamed from: d */
    public static final Feature f18278d = new Feature("google_auth_service_token", 3);

    /* renamed from: e */
    public static final Feature f18279e = new Feature("google_auth_service_accounts", 2);

    /* renamed from: f */
    public static final Feature f18280f = new Feature("work_account_client_is_whitelisted", 1);

    /* renamed from: g */
    public static final Feature f18281g;

    static {
        Feature feature = new Feature("config_sync", 1);
        f18281g = feature;
        Feature[] featureArr = {f18275a, f18276b, f18277c, f18278d, f18279e, f18280f, feature};
    }
}
