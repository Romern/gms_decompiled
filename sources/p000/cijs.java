package p000;

import com.felicanetworks.mfc.mfi.Card;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cijs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cijs extends brfc {

    /* renamed from: a */
    public static final Integer f190456a = 2;

    /* renamed from: b */
    public static final Integer f190457b = 1;

    /* renamed from: f */
    public final String f190458f;

    static {
        cijs.class.getSimpleName();
    }

    public cijs(brhc brhc, brgl brgl, brgz brgz, String str) {
        super(brhc, brgl, brgz);
        this.f190458f = str;
    }

    /* renamed from: a */
    public final void mo49979a(brep brep) {
        if (brep != null) {
            brep.mo49930a();
            this.f142751d.mo69516a(new cijm(brep));
            return;
        }
        throw new IllegalArgumentException("Invalid Parameter.");
    }

    /* renamed from: b */
    public final void mo49983b(brep brep) {
        srn srn = atgf.f90279a;
        this.f142751d.mo69516a(new cijr(brep));
    }

    /* renamed from: a */
    public final void mo49980a(String str, brep brep) {
        if (str != null) {
            new cijo(this, brep, this, str).start();
            return;
        }
        String valueOf = String.valueOf(brep);
        StringBuilder sb = new StringBuilder(String.valueOf((Object) null).length() + 68 + String.valueOf(valueOf).length());
        sb.append("getSecureElementData Invalid Parameter (accountName = null'callback = ");
        sb.append(valueOf);
        sb.append(").");
        sb.toString();
        throw new IllegalArgumentException("Invalid Parameter.");
    }

    /* renamed from: a */
    public final void mo49981a(String str, Card card, JSONObject jSONObject, brep brep) {
        if (str == null || card == null) {
            String valueOf = String.valueOf(brep);
            String valueOf2 = String.valueOf(card);
            String valueOf3 = String.valueOf(jSONObject);
            int length = String.valueOf(str).length();
            int length2 = String.valueOf(valueOf).length();
            StringBuilder sb = new StringBuilder(length + 87 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb.append("deleteCard Invalid Parameter (accountName = ");
            sb.append(str);
            sb.append("'callback = ");
            sb.append(valueOf);
            sb.append("'felicaCard = ");
            sb.append(valueOf2);
            sb.append("'deleteParam = ");
            sb.append(valueOf3);
            sb.append(").");
            sb.toString();
            throw new IllegalArgumentException("Invalid Parameter.");
        } else if (!jSONObject.isNull("dynamicCardData")) {
            try {
                if (!((JSONObject) jSONObject.get("dynamicCardData")).isNull("linkageData")) {
                    srn srn = atgf.f90279a;
                    this.f142751d.mo69518a(str, new cijq(brep, jSONObject, card), 3);
                    return;
                }
                throw new IllegalArgumentException("Invalid Parameter.");
            } catch (JSONException e) {
                String valueOf4 = String.valueOf(e.toString());
                if (valueOf4.length() == 0) {
                    new String("JSON error occurred ");
                } else {
                    "JSON error occurred ".concat(valueOf4);
                }
                brep.mo49931a(new bres(cijw.QUICPAY_JSON_ERROR));
            }
        } else {
            throw new IllegalArgumentException("Invalid Parameter.");
        }
    }

    /* renamed from: a */
    public final void mo49982a(String str, JSONObject jSONObject, boolean z, boolean z2, String str2, brep brep) {
        if (str == null || ((z2 && str2 == null) || ((!z2 && str2 != null) || (!z && z2)))) {
            String valueOf = String.valueOf(jSONObject);
            String valueOf2 = String.valueOf(brep);
            int length = String.valueOf(str).length();
            int length2 = String.valueOf(valueOf).length();
            StringBuilder sb = new StringBuilder(length + 142 + length2 + String.valueOf(str2).length() + String.valueOf(valueOf2).length());
            sb.append("provisionFelica Invalid Parameter (accountName = ");
            sb.append(str);
            sb.append("'provisionData = ");
            sb.append(valueOf);
            sb.append("'setAsDefault = ");
            sb.append(z);
            sb.append("'deleteLegacy = ");
            sb.append(z2);
            sb.append("'oneTimeDeleteUrl = ");
            sb.append(str2);
            sb.append("'callback = ");
            sb.append(valueOf2);
            sb.append(").");
            sb.toString();
            throw new IllegalArgumentException("Invalid Parameter.");
        } else if (!jSONObject.isNull("dynamicCardData")) {
            try {
                if (!((JSONObject) jSONObject.get("dynamicCardData")).isNull("linkageData")) {
                    new cijp(this, brep, jSONObject, z, this, str2, str).start();
                    return;
                }
                throw new IllegalArgumentException("Invalid Parameter.");
            } catch (JSONException e) {
                String valueOf3 = String.valueOf(e.toString());
                if (valueOf3.length() == 0) {
                    new String("JSON error occurred ");
                } else {
                    "JSON error occurred ".concat(valueOf3);
                }
                brep.mo49931a(new bres(cijw.QUICPAY_JSON_ERROR));
            }
        } else {
            throw new IllegalArgumentException("Invalid Parameter.");
        }
    }
}
