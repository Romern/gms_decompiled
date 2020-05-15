package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.server.NetworkCallbacks;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProvider;

/* renamed from: aayq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aayq implements NetworkCallbacks {

    /* renamed from: b */
    static final String f56829b = System.getProperty("http.agent");

    /* renamed from: c */
    protected final Context f56830c;

    /* renamed from: d */
    protected final HelpConfig f56831d;

    /* renamed from: e */
    protected final Account f56832e;

    /* renamed from: f */
    protected final CronetEngine f56833f;

    /* renamed from: g */
    protected final bqgj f56834g;

    /* renamed from: h */
    public wzh f56835h;

    /* renamed from: i */
    public final abcr f56836i;

    /* renamed from: j */
    public String f56837j;

    /* renamed from: k */
    public final int f56838k;

    protected aayq(Context context, HelpConfig helpConfig, Account account, bqgj bqgj, abcr abcr, int i) {
        sdo.m34973b("Must be called from a worker thread.");
        this.f56830c = context;
        this.f56831d = helpConfig;
        this.f56832e = account;
        this.f56833f = (CronetEngine) aayr.m47295b().mo6606a();
        this.f56834g = bqgj;
        this.f56836i = abcr;
        this.f56838k = i;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    protected static int m47281a(String str) {
        char c;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        switch (lowerCase.hashCode()) {
            case -1096862286:
                if (lowerCase.equals("lowest")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1078030475:
                if (lowerCase.equals("medium")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 107348:
                if (lowerCase.equals("low")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3227604:
                if (lowerCase.equals("idle")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 915484836:
                if (lowerCase.equals("highest")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 4;
        }
        if (c == 2) {
            return 2;
        }
        if (c != 3) {
            return c != 4 ? 3 : 0;
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo29518a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo29520b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo29521c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo29523e() {
        return (int) ceeg.m136412q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo31873f() {
        return (int) ceev.f182568a.mo6606a().mo79056h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public double mo31874g() {
        return ceev.f182568a.mo6606a().mo79054f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo31906h() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public UploadDataProvider mo31907i() {
        return null;
    }

    /* renamed from: k */
    public final aays mo31910k() {
        abcr abcr;
        int i;
        abcr abcr2;
        int i2;
        int i3;
        bqgg l = mo31911l();
        try {
            aays aays = (aays) l.get((long) mo29523e(), TimeUnit.SECONDS);
            abcr abcr3 = this.f56836i;
            if (!(abcr3 == null || (i3 = this.f56838k) == 0)) {
                abcx.m47490a(this.f56830c, this.f56831d, abcr3, i3, this.f56835h.mo29582a());
            }
            return aays;
        } catch (TimeoutException e) {
            l.cancel(true);
            if (!(!aaya.m47229b(ceiz.m136965b()) || (abcr = this.f56836i) == null || (i = this.f56838k) == 0)) {
                abcx.m47518d(this.f56830c, this.f56831d, abcr, i);
            }
            throw e;
        } catch (ExecutionException e2) {
            if (!(!aaya.m47229b(ceiz.m136965b()) || (abcr2 = this.f56836i) == null || (i2 = this.f56838k) == 0)) {
                abcx.m47515c(this.f56830c, this.f56831d, abcr2, i2);
            }
            throw e2;
        }
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public void onPreNetworkDispatch() {
        shr.m35316b(3840);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29519a(Map map) {
        map.put("User-Agent", f56829b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final bqgg mo31911l() {
        bobu bobu = new bobu(new bobs((int) ceev.f182568a.mo6606a().mo79055g(), mo31874g(), mo31873f()));
        aayl aayl = new aayl(this);
        aaym aaym = new aaym(this);
        bqgj bqgj = this.f56834g;
        boce boce = new boce();
        boce.f132531a = bmxv.m108566b(bqgj);
        bmxy.m108601b(boce.f132531a.mo66813a(), "Either executor or scheduledExecutorService needs to be set.");
        return new bocg(aayl, bobu, aaym, (Executor) boce.f132531a.mo66811a(boce.f132532b).mo66814b(), bocf.f132535a, boce.f132533c);
    }

    protected aayq(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr, int i) {
        this(context, helpConfig, helpConfig.f78829d, bqgj, abcr, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo31909a(aays aays) {
        if (!aays.mo31912a()) {
            Log.e("gH_CronetBaseRequest", String.format("Received non-success status code %d for %s", Integer.valueOf(aays.f56842a), getClass().getSimpleName()));
            return false;
        } else if (aays.f56844c != null) {
            return true;
        } else {
            String valueOf = String.valueOf(getClass().getSimpleName());
            Log.e("gH_CronetBaseRequest", valueOf.length() == 0 ? new String("Received no data for successful response for ") : "Received no data for successful response for ".concat(valueOf));
            return false;
        }
    }
}
