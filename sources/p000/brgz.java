package p000;

import com.android.volley.RequestQueue;
import org.json.JSONObject;

/* renamed from: brgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brgz {

    /* renamed from: a */
    private final RequestQueue f142841a;

    public brgz(RequestQueue requestQueue) {
        this.f142841a = requestQueue;
    }

    /* renamed from: a */
    public final void mo69530a(brgq brgq, brgp brgp) {
        JSONObject jSONObject = brgq.f142830c.f142831a;
        if (jSONObject == null) {
            this.f142841a.add(new brgu(brgq.f142828a, new brgv(brgp), new brgw(brgp), brgq.f142830c.toString(), brgq.f142829b));
        } else {
            this.f142841a.add(new brgt(brgq.f142828a, jSONObject, new brgx(brgp), new brgy(brgp), brgq.f142829b));
        }
    }
}
