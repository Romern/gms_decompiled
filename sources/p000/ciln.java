package p000;

import android.os.Handler;
import android.os.HandlerThread;
import com.felicanetworks.mfc.mfi.Card;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ciln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciln extends brfc {

    /* renamed from: a */
    private Handler f190646a;

    /* renamed from: b */
    private breo f190647b;

    /* renamed from: f */
    private String f190648f;

    public ciln(brhc brhc, brgl brgl, brgz brgz, breo breo, String str) {
        super(brhc, brgl, brgz);
        if (brgl != null) {
            HandlerThread handlerThread = new HandlerThread("iDsdk");
            handlerThread.start();
            this.f190646a = new Handler(handlerThread.getLooper());
            this.f190647b = breo;
            this.f190648f = str;
            return;
        }
        throw new NullPointerException("The input argument is invalid.");
    }

    /* renamed from: a */
    private static final boolean m150548a(JSONObject jSONObject, String str, int i, int i2) {
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (string == null || string.length() < i || string.length() > i2) {
                    return false;
                }
                StringBuilder sb = new StringBuilder(str.length() + 27 + string.length());
                sb.append("checkJsonObjectData End ");
                sb.append(str);
                sb.append(" = ");
                sb.append(string);
                sb.toString();
                return true;
            } catch (JSONException e) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo49983b(brep brep) {
        this.f190646a.post(new cils(this.f142751d, brep));
        srn srn = atgf.f90279a;
    }

    /* renamed from: a */
    public final void mo49979a(brep brep) {
        this.f190646a.post(new cile(this.f142750c, this.f142751d, brep));
        srn srn = atgf.f90279a;
    }

    /* renamed from: a */
    public final void mo49980a(String str, brep brep) {
        if (str == null) {
            throw new NullPointerException("The input argument is invalid.");
        } else if (!str.equals("")) {
            Handler handler = this.f190646a;
            handler.post(new cilr(this.f142750c, this.f142751d, brep, handler, str, this.f190648f));
            srn srn = atgf.f90279a;
        } else {
            throw new IllegalArgumentException("The input argument is invalid.");
        }
    }

    /* renamed from: a */
    public final void mo49981a(String str, Card card, JSONObject jSONObject, brep brep) {
        if (str == null || card == null) {
            throw new NullPointerException("The input argument is invalid.");
        } else if (str.equals("")) {
            throw new IllegalArgumentException("The input argument is invalid.");
        } else if (m150548a(jSONObject, "cid", 63, 63)) {
            this.f190646a.post(new cilf(str, card, jSONObject, this.f142750c, this.f142751d, this.f142752e, brep, this.f190646a, this.f190647b));
            srn srn = atgf.f90279a;
        } else {
            throw new IllegalArgumentException("The input argument is invalid.");
        }
    }

    /* renamed from: a */
    public final void mo49982a(String str, JSONObject jSONObject, boolean z, boolean z2, String str2, brep brep) {
        String str3;
        if (str == null) {
            throw new NullPointerException("The input argument is invalid.");
        } else if (!str.equals("")) {
            if (jSONObject.has("dynamicCardData")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("dynamicCardData");
                if (m150548a(optJSONObject, "linkageData", 1, Integer.MAX_VALUE)) {
                    str3 = optJSONObject.optString("linkageData");
                    if (str3 != null || str3.isEmpty()) {
                        throw new IllegalArgumentException("The input argument is invalid.");
                    }
                    this.f190646a.post(new cilq(this.f190646a, this.f142750c, this.f142751d, this.f142752e, str, str3, brep, this.f190647b));
                    srn srn = atgf.f90279a;
                    return;
                }
            }
            str3 = null;
            if (str3 != null) {
            }
            throw new IllegalArgumentException("The input argument is invalid.");
        } else {
            throw new IllegalArgumentException("The input argument is invalid.");
        }
    }
}
