package p000;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonObjectRequest;
import java.io.File;
import org.chromium.net.CronetEngine;
import org.json.JSONObject;

/* renamed from: tvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tvk implements tuu {

    /* renamed from: a */
    public final C1231nx f46715a = new C1231nx(4194304);

    /* renamed from: b */
    private final ImageLoader f46716b;

    /* renamed from: c */
    private final RequestQueue f46717c;

    public tvk(Context context) {
        Context applicationContext = context.getApplicationContext();
        RequestQueue requestQueue = new RequestQueue(new DiskBasedCache(new File(applicationContext.getCacheDir(), "pwm_volley"), 10485760), new tvj(new tvi((CronetEngine) tur.f46699a.mo6606a()), context.getApplicationInfo().uid));
        requestQueue.start();
        this.f46717c = requestQueue;
        C1231nx nxVar = new C1231nx(4194304);
        this.f46716b = new ImageLoader(this.f46717c, new tvg(nxVar));
    }

    /* renamed from: a */
    public final void mo26817a() {
        this.f46717c.cancelAll(tvf.f46710a);
        this.f46717c.stop();
    }

    /* renamed from: a */
    public final void mo26818a(String str, tus tus) {
        this.f46716b.get(str, new tvh(tus));
    }

    /* renamed from: a */
    public final void mo26819a(String str, tuy tuy) {
        JSONObject jSONObject = (JSONObject) this.f46715a.mo15546a(str);
        if (jSONObject != null) {
            tuy.mo26820a(jSONObject);
            return;
        }
        this.f46717c.add(new JsonObjectRequest(0, str, null, new tvd(this, str, tuy), new tve()));
    }
}
