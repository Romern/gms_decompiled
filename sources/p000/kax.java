package p000;

import com.google.android.gms.common.Feature;

/* renamed from: kax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kax {

    /* renamed from: a */
    public static final Feature f23671a = new Feature("sms_code_autofill", 2);

    /* renamed from: b */
    public static final Feature f23672b = new Feature("sms_code_browser", 1);

    /* renamed from: c */
    public static final Feature f23673c = new Feature("sms_retrieve", 1);

    /* renamed from: d */
    public static final Feature f23674d;

    /* renamed from: e */
    public static final Feature[] f23675e;

    static {
        Feature feature = new Feature("user_consent", 3);
        f23674d = feature;
        f23675e = new Feature[]{f23671a, f23672b, f23673c, feature};
    }
}
