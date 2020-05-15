package p000;

import android.webkit.WebView;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: wcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wcy extends cazu {

    /* renamed from: b */
    private final cazn f50522b;

    /* renamed from: c */
    private final cazn f50523c;

    /* renamed from: d */
    private final cazn f50524d;

    /* renamed from: e */
    private final cazn f50525e;

    public wcy(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4) {
        super(cijl2, cbag.m127657a(wcy.class), cijl);
        this.f50522b = cbac.m127643a(cazn);
        this.f50523c = cbac.m127643a(cazn2);
        this.f50524d = cbac.m127643a(cazn3);
        this.f50525e = cbac.m127643a(cazn4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f50522b.mo75201b(), this.f50523c.mo75201b(), this.f50524d.mo75201b(), this.f50525e.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        WebView webView = (WebView) list.get(1);
        String str = (String) list.get(2);
        bmyl bmyl = (bmyl) list.get(3);
        JSONArray jSONArray = new JSONArray();
        for (JSONObject jSONObject : (List) list.get(0)) {
            jSONArray.put(jSONObject);
        }
        bmyl.mo12292a(new wcx(webView, str, jSONArray));
        return bqga.m112775a((Object) null);
    }
}
