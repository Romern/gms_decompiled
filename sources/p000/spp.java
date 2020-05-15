package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.ArrayList;

/* renamed from: spp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class spp implements Response.Listener, Response.ErrorListener {

    /* renamed from: a */
    public final ArrayList f44942a;

    /* renamed from: b */
    private VolleyError f44943b;

    /* renamed from: c */
    private final spp f44944c;

    public spp() {
        this(null);
    }

    /* renamed from: a */
    public static spp m35906a() {
        return new spp();
    }

    /* renamed from: b */
    public final spp mo25939b() {
        return new spp(this);
    }

    /* renamed from: c */
    public final void mo25940c() {
        VolleyError volleyError = this.f44943b;
        if (volleyError != null) {
            throw volleyError;
        }
    }

    /* renamed from: d */
    public final boolean mo25941d() {
        return this.f44942a.size() > 0;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        spp spp = this.f44944c;
        if (spp != null) {
            spp.onErrorResponse(volleyError);
        }
        this.f44943b = volleyError;
    }

    private spp(spp spp) {
        this.f44942a = new ArrayList();
        this.f44944c = spp;
    }

    /* renamed from: a */
    public final sio mo25937a(int i) {
        return (sio) this.f44942a.get(i);
    }

    /* renamed from: a */
    public void onResponse(sio sio) {
        this.f44942a.add(sio);
    }
}
