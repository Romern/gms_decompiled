package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;

/* renamed from: agte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agte implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ String f66442a;

    /* renamed from: b */
    final /* synthetic */ agth f66443b;

    public agte(agth agth, String str) {
        this.f66443b = agth;
        this.f66442a = str;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        bnsl bnsl = (bnsl) agth.f66447g.mo68388c();
        bnsl.mo68437a(volleyError);
        bnsl.mo68405a("MDP_SERVER_CARRIER_FAILURE. Error from carrier.");
        agth agth = this.f66443b;
        String str = this.f66442a;
        String valueOf = String.valueOf(volleyError);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54 + String.valueOf(valueOf).length());
        sb.append("MDP_SERVER_CARRIER_FAILURE. Error from carrier:");
        sb.append(str);
        sb.append("\nError:");
        sb.append(valueOf);
        agth.mo6503a(new Status(27007, sb.toString()));
    }
}
