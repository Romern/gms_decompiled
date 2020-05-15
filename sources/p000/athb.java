package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.Card;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: athb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class athb extends brfc {

    /* renamed from: a */
    public final String f90352a;

    /* renamed from: b */
    public final int f90353b;

    /* renamed from: f */
    private final Context f90354f;

    public athb(brhc brhc, brgl brgl, brgz brgz, String str, Context context, int i) {
        super(brhc, brgl, brgz);
        this.f90352a = str;
        this.f90354f = context;
        this.f90353b = i;
    }

    /* renamed from: a */
    public final bepm mo49978a() {
        return bepm.m95391a(this.f90354f);
    }

    /* renamed from: b */
    public final void mo49983b(brep brep) {
        new Thread(new atha(this, brep)).start();
    }

    /* renamed from: a */
    public final void mo49979a(brep brep) {
        new Thread(new atgw(brep, this)).start();
    }

    /* renamed from: a */
    public final void mo49980a(String str, brep brep) {
        new Thread(new atgx(this, brep)).start();
    }

    /* renamed from: a */
    public final void mo49981a(String str, Card card, JSONObject jSONObject, brep brep) {
        if (!jSONObject.isNull("dynamicCardData") || !jSONObject.isNull("cid")) {
            if (!jSONObject.isNull("dynamicCardData")) {
                try {
                    if (((JSONObject) jSONObject.get("dynamicCardData")).isNull("cardId")) {
                        throw new IllegalArgumentException("Invalid Parameter.");
                    }
                } catch (JSONException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    sb.append("JSON error occurred ");
                    sb.append(valueOf);
                    sb.toString();
                    brep.mo49931a(new bres(atgv.APTEST_JSON_ERROR));
                    return;
                }
            }
            new Thread(new atgz(this, brep, jSONObject)).start();
            return;
        }
        throw new IllegalArgumentException("Invalid Parameter.");
    }

    /* renamed from: a */
    public final void mo49982a(String str, JSONObject jSONObject, boolean z, boolean z2, String str2, brep brep) {
        if (!jSONObject.isNull("dynamicCardData")) {
            try {
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("dynamicCardData");
                if (jSONObject2.isNull("cardId")) {
                    throw new IllegalArgumentException("Invalid Parameter.");
                } else if (jSONObject2.isNull("displayCardNumber")) {
                    throw new IllegalArgumentException("Invalid Parameter.");
                } else if (jSONObject2.isNull("expirationMonth")) {
                    throw new IllegalArgumentException("Invalid Parameter.");
                } else if (!jSONObject2.isNull("expirationYear")) {
                    new Thread(new atgy(this, brep, jSONObject, z)).start();
                } else {
                    throw new IllegalArgumentException("Invalid Parameter.");
                }
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("JSON error occurred ");
                sb.append(valueOf);
                sb.toString();
                brep.mo49931a(new bres(atgv.APTEST_JSON_ERROR));
            }
        } else {
            throw new IllegalArgumentException("Invalid Parameter.");
        }
    }
}
