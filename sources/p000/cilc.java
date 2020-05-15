package p000;

import android.os.Handler;
import com.felicanetworks.mfc.mfi.Card;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cilc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cilc extends cilb {

    /* renamed from: a */
    private final String f190585a;

    /* renamed from: b */
    private final Card f190586b;

    /* renamed from: c */
    private final Handler f190587c;

    /* renamed from: d */
    private final brep f190588d;

    /* renamed from: e */
    private final brhc f190589e;

    /* renamed from: f */
    private final brgl f190590f;

    public cilc(String str, Card card, brhc brhc, brgl brgl, brep brep, Handler handler) {
        super(brep);
        this.f190585a = str;
        this.f190586b = card;
        this.f190589e = brhc;
        this.f190590f = brgl;
        this.f190588d = brep;
        this.f190587c = handler;
    }

    /* renamed from: a */
    public final void mo69527a(brgs brgs) {
        ciki ciki;
        try {
            JSONObject jSONObject = new JSONObject(brgs.f142833a);
            if (!jSONObject.has("iDResult")) {
                ciki = ciki.SERVER_ERROR;
                ciki.m150513a(ciki);
            } else {
                String optString = jSONObject.optString("iDResult");
                if (optString != null) {
                    if (!optString.isEmpty()) {
                        ciki = !optString.equals("00000") ? ciki.m150512a(optString) : null;
                    }
                }
                ciki = ciki.SERVER_ERROR;
                ciki.m150513a(ciki);
            }
            if (ciki == null) {
                String optString2 = jSONObject.optString("linkageData");
                if (optString2 != null) {
                    if (!optString2.isEmpty()) {
                        this.f190587c.post(new cilh(this.f190585a, this.f190586b, this.f190589e, this.f190590f, this.f190588d, optString2));
                        return;
                    }
                }
                ciki ciki2 = ciki.SERVER_ERROR;
                ciki.m150513a(ciki2);
                this.f190588d.mo49931a(new bres(ciki2));
                return;
            }
            this.f190588d.mo49931a(new bres(ciki));
        } catch (JSONException e) {
            ciki ciki3 = ciki.SERVER_ERROR;
            ciki.m150513a(ciki3);
            this.f190588d.mo49931a(new bres(ciki3));
        }
    }
}
