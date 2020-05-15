package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: jln */
final /* synthetic */ class jln implements Response.ErrorListener {

    /* renamed from: a */
    private final bqgy f22761a;

    public jln(bqgy bqgy) {
        this.f22761a = bqgy;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f22761a.mo69136a((Throwable) volleyError);
    }
}
