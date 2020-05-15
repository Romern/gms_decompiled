package p000;

import android.os.Handler;
import com.felicanetworks.mfc.Felica;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cikz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cikz extends cikk {

    /* renamed from: a */
    private final brhc f190577a;

    /* renamed from: b */
    private final brep f190578b;

    /* renamed from: c */
    private final Handler f190579c;

    /* renamed from: d */
    private final String f190580d;

    /* renamed from: e */
    private final String f190581e;

    /* renamed from: f */
    private final brgl f190582f;

    public cikz(brhc brhc, brgl brgl, brep brep, Handler handler, String str, String str2) {
        super(brep);
        this.f190577a = brhc;
        this.f190582f = brgl;
        this.f190578b = brep;
        this.f190579c = handler;
        this.f190580d = str;
        this.f190581e = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69520a(Felica felica) {
        cikn cikn = new cikn();
        srn srn = atgf.f90279a;
        cikn.f190535d = felica.getIDm();
        cikn.f190536e = felica.getContainerIssueInformation();
        cikn.f190537f = felica.getICCode();
        return cikn;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69522a(Object obj) {
        cikn cikn = (cikn) obj;
        srn srn = atgf.f90279a;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        byte[] bArr = cikn.f190535d;
        byte[] bArr2 = cikn.f190536e;
        byte[] bArr3 = cikn.f190537f;
        try {
            jSONObject.put("seInfo", jSONObject2);
            int length = bArr.length;
            if (length == 0) {
                jSONObject2.put("idm", "");
            } else {
                jSONObject2.put("idm", cikn.m150523a(bArr, 0, length - 1));
            }
            int length2 = bArr2.length;
            if (length2 == 0) {
                jSONObject2.put("sdkContainer", "");
            } else {
                jSONObject2.put("sdkContainer", cikn.m150523a(bArr2, 0, length2 - 1));
            }
            int length3 = bArr3.length;
            if (length3 == 0) {
                jSONObject2.put("icCode", "");
            } else {
                jSONObject2.put("icCode", cikn.m150523a(bArr3, 0, length3 - 1));
            }
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("SecureElementDataOperation.onSuccess : ");
            sb.append(valueOf);
            sb.toString();
            this.f190579c.post(new cill(jSONObject, this.f190577a, this.f190582f, this.f190578b, this.f190580d, this.f190581e));
        } catch (JSONException e) {
            this.f190577a.mo69532a("felica", "GetSeInfoOperation.execute : Failed to put the value", e);
            this.f190578b.mo49931a(new bres(bret.UNKNOWN_FELICA_ERROR));
        }
    }
}
