package p000;

import org.json.JSONObject;

/* renamed from: uat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uat {
    /* renamed from: a */
    public static txp m37849a(uih uih, JSONObject jSONObject) {
        String string = jSONObject.getString("operationType");
        txr a = txr.m37691a(string);
        if (a != null) {
            return a.f46951z.mo26921a(uih, jSONObject);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 31);
        sb.append("Action type ");
        sb.append(string);
        sb.append(" is not recognized.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static final txw m37850a(uhn uhn, uln uln) {
        boolean z;
        uih c = uhn.mo27427c(uln.f48132a);
        if (c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        JSONObject jSONObject = new JSONObject(uln.f48133b);
        return new txw(m37849a(c, jSONObject.getJSONObject("forward")), m37849a(c, jSONObject.getJSONObject("reverse")));
    }
}
