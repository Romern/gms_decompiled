package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.google.android.gms.common.server.NetworkCallbacks;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Map;

/* renamed from: aary */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aary extends Request implements NetworkCallbacks {

    /* renamed from: d */
    static final String f56405d = System.getProperty("http.agent");

    /* renamed from: i */
    public static final /* synthetic */ int f56406i = 0;

    /* renamed from: e */
    protected final Context f56407e;

    /* renamed from: f */
    protected final HelpConfig f56408f;

    /* renamed from: g */
    protected final Account f56409g;

    /* renamed from: h */
    protected final Map f56410h;

    /* renamed from: j */
    private final RequestQueue f56411j;

    /* renamed from: k */
    private final Response.Listener f56412k;

    /* renamed from: l */
    private wzh f56413l;

    /* renamed from: m */
    private abcr f56414m;

    /* renamed from: n */
    private String f56415n;

    /* renamed from: o */
    private int f56416o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public aary(Context context, HelpConfig helpConfig, int i, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        this(context, helpConfig, helpConfig != null ? helpConfig.f78829d : null, i, str, listener, errorListener);
    }

    /* renamed from: a */
    public final void mo31679a(int i, abcr abcr) {
        wzh wzh = new wzh();
        wzh.mo29584c();
        this.f56413l = wzh;
        this.f56416o = i;
        this.f56414m = abcr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo31681b() {
        return (int) ceeg.f182447a.mo6606a().mo78933A();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo31682c() {
        return (int) ceeg.f182447a.mo6606a().mo79031z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float mo31683d() {
        return (float) ceeg.f182447a.mo6606a().mo79030y();
    }

    public final void deliverResponse(Object obj) {
        HelpConfig helpConfig;
        wzh wzh = this.f56413l;
        if (!(wzh == null || (helpConfig = this.f56408f) == null)) {
            abcx.m47490a(this.f56407e, helpConfig, this.f56414m, this.f56416o, wzh.mo29582a());
        }
        Response.Listener listener = this.f56412k;
        if (listener != null) {
            listener.onResponse(obj);
        }
    }

    /* renamed from: e */
    public final void mo31684e() {
        this.f56411j.add(this);
    }

    public Map getHeaders() {
        return this.f56410h;
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public void onPreNetworkDispatch() {
        shr.m35316b(3840);
    }

    public aary(Context context, HelpConfig helpConfig, Account account, int i, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.f56407e = context;
        this.f56408f = helpConfig;
        this.f56409g = account;
        this.f56411j = rpr.m34216b().getRequestQueue();
        this.f56412k = listener;
        String str2 = f56405d;
        Map b = sqw.m36043b(Math.max(1, 1), true);
        b.put("User-Agent", str2);
        this.f56410h = b;
        mo31680a(false);
        setShouldCache(false);
        setRetryPolicy(new aarx(this, mo31681b(), mo31682c(), mo31683d()));
        setShouldRetryServerErrors(true);
    }

    /* renamed from: a */
    public final void mo31680a(boolean z) {
        if (this.f56409g != null) {
            if (z) {
                try {
                    gie.m13196b(this.f56407e, this.f56415n);
                } catch (Exception e) {
                    String valueOf = String.valueOf(this.f56409g.name);
                    Log.e("gH_BaseRequest", valueOf.length() == 0 ? new String("Updating auth token failed for ") : "Updating auth token failed for ".concat(valueOf), e);
                    return;
                }
            }
            String a = gie.m13187a(this.f56407e, this.f56409g, "oauth2:https://www.googleapis.com/auth/supportcontent");
            this.f56415n = a;
            shb.m35264a(this.f56410h, a, null);
        }
    }
}
