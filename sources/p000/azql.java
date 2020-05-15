package p000;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

/* renamed from: azql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azql {

    /* renamed from: a */
    public static final String f99893a;

    /* renamed from: d */
    private static final String f99894d;

    /* renamed from: b */
    public final Context f99895b;

    /* renamed from: c */
    public final azrk f99896c;

    /* renamed from: e */
    private final Map f99897e = new HashMap();

    /* renamed from: f */
    private final String f99898f;

    /* renamed from: g */
    private final bqgj f99899g;

    /* renamed from: h */
    private azqs f99900h;

    static {
        azua e = azub.m86259e();
        e.mo55295a("");
        e.mo55296a(false);
        e.mo55297b("Unable to parse request.");
        f99894d = ((JSONObject) e.mo55293a().mo55298f().mo66814b()).toString();
        azua e2 = azub.m86259e();
        e2.mo55295a("");
        e2.mo55296a(false);
        e2.mo55297b("Failed to create response.");
        f99893a = ((JSONObject) e2.mo55293a().mo55298f().mo66814b()).toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    public azql(Context context, String str, azqs azqs, azrk azrk, bqgj bqgj) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "context must be provided");
        bmxy.m108589a(!TextUtils.isEmpty(str), "name must be provided.");
        if (azqs != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108589a(z2, "webView must be provided.");
        bmxy.m108589a(azrk != null ? true : z3, "bridgeImpl must be provided.");
        bmxy.m108589a(true, (Object) "executor must be provided");
        this.f99895b = context.getApplicationContext();
        this.f99898f = str;
        this.f99900h = azqs;
        this.f99896c = azrk;
        this.f99899g = bqgj;
    }

    /* renamed from: b */
    private static String m86174b(azub azub) {
        bmxv f = azub.mo55298f();
        return f.mo66813a() ? ((JSONObject) f.mo66814b()).toString() : f99893a;
    }

    /* renamed from: a */
    public final void mo55224a() {
        Method[] methods = this.f99896c.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(azqt.class)) {
                this.f99897e.put(method.getName(), method);
            }
        }
        if (!this.f99897e.isEmpty()) {
            Object[] objArr = {this.f99898f, Integer.valueOf(this.f99897e.size())};
            this.f99900h.mo55059a(this, this.f99898f);
            return;
        }
        azoj.m85933c("AsyncJsBridge", "Async bridge implementation has no methods annotated with @JsMethod.", new Object[0]);
        azph.m85998a(this.f99895b).mo55126a(1714, 62);
    }

    @JavascriptInterface
    public String callNativeMethod(String str) {
        azub azub;
        bmxv a = aztz.m86250a(str);
        if (!a.mo66813a()) {
            azoj.m85933c("AsyncJsBridge", "Failed to parse request as JSON.", new Object[0]);
            azph.m85998a(this.f99895b).mo55126a(1715, 60);
            return f99894d;
        }
        aztz aztz = (aztz) a.mo66814b();
        Method method = (Method) this.f99897e.get(aztz.mo55229b());
        if (method == null) {
            azoj.m85933c("AsyncJsBridge", "Native method %s not found.", aztz.mo55229b());
            azph.m85998a(this.f99895b).mo55126a(1716, 62);
            azua e = azub.m86259e();
            e.mo55295a(aztz.mo55228a());
            e.mo55296a(false);
            String valueOf = String.valueOf(aztz.mo55229b());
            e.mo55297b(valueOf.length() == 0 ? new String("Native method not found: ") : "Native method not found: ".concat(valueOf));
            return m86174b(e.mo55293a());
        }
        try {
            bqga.m112781a(this.f99899g.mo25819b(new azqj(this, method, aztz)), new azqk(this, method, aztz), azox.f99803a);
            azua e2 = azub.m86259e();
            e2.mo55295a(aztz.mo55228a());
            e2.mo55296a(true);
            azub = e2.mo55293a();
        } catch (RejectedExecutionException e3) {
            azoj.m85931a("AsyncJsBridge", e3, "Caught RejectedExecutionException when invoking method %s", method.getName());
            azph.m85998a(this.f99895b).mo55126a(1717, 61);
            azua e4 = azub.m86259e();
            e4.mo55295a(aztz.mo55228a());
            e4.mo55296a(false);
            e4.mo55297b("Exception in native method.");
            azub = e4.mo55293a();
        }
        return m86174b(azub);
    }

    /* renamed from: b */
    public final void mo55226b() {
        if (this.f99900h != null) {
            new Object[1][0] = this.f99898f;
            azrk azrk = this.f99896c;
            List list = azrk.f99943b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((ConcurrentMap) list.get(i)).clear();
            }
            azrk.f99943b.clear();
            this.f99900h.mo55060b(this.f99898f);
            this.f99900h = null;
            return;
        }
        azoj.m85933c("AsyncJsBridge", "Could not dispose null WebView proxy", new Object[0]);
    }

    /* renamed from: a */
    public final void mo55225a(azub azub) {
        if (this.f99900h != null) {
            this.f99900h.mo54821a(String.format("%s.onNativeMethodCompleted(%s)", this.f99898f, m86174b(azub)));
            return;
        }
        azoj.m85933c("AsyncJsBridge", "Cannot complete native method call on null webView proxy", new Object[0]);
    }
}
