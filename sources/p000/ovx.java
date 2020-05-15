package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ovx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ovx {

    /* renamed from: b */
    private static final bnsn f38511b = odk.m28481a("CAR.SETUP");

    /* renamed from: d */
    private static final bnhe f38512d = bnhe.m109411a(83, new ovw(C0126R.C0127drawable.car_app_rating_esrb_teen, "T", C0126R.string.car_app_rating_esrb_teen), 81, new ovw(C0126R.C0127drawable.car_app_rating_esrb_everyone, "E", C0126R.string.car_app_rating_esrb_everyone), 1, new ovw(C0126R.C0127drawable.car_app_rating_google_3, "③", 0), 3, new ovw(C0126R.C0127drawable.car_app_rating_google_12, "⑫", 0));

    /* renamed from: a */
    public final ovw f38513a;

    /* renamed from: c */
    private final boolean f38514c;

    public ovx(ovw ovw, boolean z) {
        this.f38513a = ovw;
        this.f38514c = z;
    }

    /* renamed from: a */
    public static Map m29898a(String str) {
        ovw ovw;
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry entry : bmyx.m108640a(';').mo66917a().mo66919b('=').mo66915a(str).entrySet()) {
                List c = bmyx.m108640a(',').mo66925c((CharSequence) entry.getValue());
                boolean z = false;
                if (c.size() > 0) {
                    try {
                        ovw = (ovw) f38512d.get(Integer.valueOf(Integer.parseInt((String) c.get(0))));
                    } catch (NumberFormatException e) {
                        bnsi b = f38511b.mo68387b();
                        b.mo68432a("ovx", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68424a("Cannot parse rating for %s: %s", entry.getKey(), entry.getValue());
                    }
                } else {
                    ovw = null;
                }
                if (ovw == null) {
                    bnsi b2 = f38511b.mo68387b();
                    b2.mo68432a("ovx", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68424a("Unknown rating: %s=%s", entry.getKey(), entry.getValue());
                } else {
                    if (c.size() >= 2 && !((String) c.get(1)).equals("0")) {
                        z = true;
                    }
                    hashMap.put((String) entry.getKey(), new ovx(ovw, z));
                }
            }
            return hashMap;
        } catch (IllegalArgumentException e2) {
            bnsi b3 = f38511b.mo68387b();
            b3.mo68432a("ovx", "a", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b3.mo68420a("Cannot parse app ratings map: %s", str);
            return hashMap;
        }
    }

    /* renamed from: a */
    public final CharSequence mo22710a(Context context) {
        return this.f38514c ? context.getString(C0126R.string.car_app_rating_contains_ads) : "";
    }
}
