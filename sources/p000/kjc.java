package p000;

import com.android.volley.Response;
import org.json.JSONObject;

/* renamed from: kjc */
final /* synthetic */ class kjc implements Response.Listener {

    /* renamed from: a */
    private final aic f24236a;

    public kjc(aic aic) {
        this.f24236a = aic;
    }

    public final void onResponse(Object obj) {
        this.f24236a.mo749a((JSONObject) obj);
    }
}
