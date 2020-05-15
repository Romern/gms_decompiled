package p000;

import android.os.Handler;
import com.felicanetworks.mfc.mfi.Card;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cilg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cilg implements Runnable {

    /* renamed from: a */
    private final String f190607a;

    /* renamed from: b */
    private final Card f190608b;

    /* renamed from: c */
    private final JSONObject f190609c;

    /* renamed from: d */
    private final brhc f190610d;

    /* renamed from: e */
    private final brep f190611e;

    /* renamed from: f */
    private final Handler f190612f;

    /* renamed from: g */
    private final breo f190613g;

    /* renamed from: h */
    private final brgl f190614h;

    /* renamed from: i */
    private final brgz f190615i;

    public cilg(String str, Card card, JSONObject jSONObject, brhc brhc, brgl brgl, brgz brgz, brep brep, Handler handler, breo breo) {
        this.f190607a = str;
        this.f190608b = card;
        this.f190609c = jSONObject;
        this.f190610d = brhc;
        this.f190614h = brgl;
        this.f190615i = brgz;
        this.f190611e = brep;
        this.f190612f = handler;
        this.f190613g = breo;
    }

    public final void run() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        if (this.f190613g.f142688a != 2) {
            str = "https://ve.m.idbrand.smt.docomo.ne.jp/idbrand02/kensho/deleteCard";
        } else {
            str = "https://idbrand.smt.docomo.ne.jp/idbrand02/real/deleteCard";
        }
        brgq a = brgq.m114009a(str, hashMap, new brgr(this.f190609c, null));
        try {
            this.f190609c.put("processingType", "PermanentDelete");
            this.f190615i.mo69530a(a, new cilc(this.f190607a, this.f190608b, this.f190610d, this.f190614h, this.f190611e, this.f190612f));
        } catch (JSONException e) {
            this.f190610d.mo69532a("postpaid", "unknown server error", e);
            this.f190611e.mo49931a(new bres(ciki.SERVER_ERROR));
        }
    }
}
