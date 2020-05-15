package p000;

import com.android.volley.Response;
import org.json.JSONObject;

/* renamed from: brgx */
final /* synthetic */ class brgx implements Response.Listener {

    /* renamed from: a */
    private final brgp f142839a;

    public brgx(brgp brgp) {
        this.f142839a = brgp;
    }

    public final void onResponse(Object obj) {
        this.f142839a.mo69527a(new brgs(((JSONObject) obj).toString()));
    }
}
