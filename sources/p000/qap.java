package p000;

import android.os.Handler;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: qap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qap implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ Handler f40816a;

    /* renamed from: b */
    final /* synthetic */ pjp f40817b;

    public qap(Handler handler, pjp pjp) {
        this.f40816a = handler;
        this.f40817b = pjp;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f40816a.post(new qao(this.f40817b, volleyError));
    }
}
