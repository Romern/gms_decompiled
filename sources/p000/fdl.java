package p000;

import com.android.volley.Response;
import org.json.JSONObject;

/* renamed from: fdl */
final /* synthetic */ class fdl implements Response.Listener {

    /* renamed from: a */
    private final fdn f16321a;

    public fdl(fdn fdn) {
        this.f16321a = fdn;
    }

    public final void onResponse(Object obj) {
        fdn fdn = this.f16321a;
        fdn.f16324b.mo2450b(new epm(3, fdn.f16325c, (JSONObject) obj));
    }
}
