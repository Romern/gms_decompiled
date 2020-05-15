package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: azht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azht {

    /* renamed from: c */
    private static azht f99429c;

    /* renamed from: a */
    public final Object f99430a = new Object();

    /* renamed from: b */
    public final Map f99431b = new ConcurrentHashMap();

    /* renamed from: d */
    private final Context f99432d;

    /* renamed from: e */
    private final Map f99433e = new ConcurrentHashMap();

    private azht(Context context) {
        this.f99432d = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized azht m85748a(Context context) {
        azht azht;
        synchronized (azht.class) {
            if (f99429c == null) {
                f99429c = new azht(context);
            }
            azht = f99429c;
        }
        return azht;
    }

    /* renamed from: c */
    private final shl m85749c() {
        return azfn.m85578a(cfgp.m139376b(), (int) cfeo.m138880k(), this.f99432d, cfeo.m138872c());
    }

    /* renamed from: d */
    private static final ClientContext m85750d() {
        ClientContext clientContext = new ClientContext();
        clientContext.f30216f = "com.google.android.gms";
        return clientContext;
    }

    /* renamed from: b */
    public final afjb mo54934b() {
        this.f99433e.put(8, m85750d());
        m85749c();
        afjb afjb = new afjb();
        this.f99431b.put(8, afjb);
        return afjb;
    }

    /* renamed from: a */
    public final afiz mo54931a() {
        this.f99433e.put(2, m85750d());
        afiz afiz = new afiz(m85749c());
        this.f99431b.put(2, afiz);
        return afiz;
    }

    /* renamed from: b */
    public final synchronized ClientContext mo54935b(int i) {
        mo54933a(i);
        return (ClientContext) this.f99433e.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final synchronized ClientContext mo54932a(int i, LocalEntityId localEntityId) {
        ClientContext clientContext;
        mo54933a(i);
        clientContext = (ClientContext) this.f99433e.get(Integer.valueOf(i));
        if (cfec.m138765b()) {
            azoe.m85908a(this.f99432d).mo55115a(clientContext, localEntityId);
        }
        return clientContext;
    }

    /* renamed from: a */
    public final synchronized Object mo54933a(int i) {
        Object obj;
        Object obj2 = this.f99431b.get(Integer.valueOf(i));
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this.f99430a) {
            if (i == 2) {
                obj = mo54931a();
            } else if (i == 4) {
                this.f99433e.put(4, m85750d());
                obj = new afja(m85749c());
                this.f99431b.put(4, obj);
            } else if (i == 8) {
                obj = mo54934b();
            } else if (i == 16) {
                this.f99433e.put(16, m85750d());
                obj = new afjd(m85749c());
                this.f99431b.put(16, obj);
            } else if (i == 32) {
                this.f99433e.put(32, m85750d());
                obj = new afjc(m85749c());
                this.f99431b.put(32, obj);
            } else if (i != 64) {
                obj = null;
            } else {
                this.f99433e.put(64, m85750d());
                obj = new afix(azfn.m85578a(cffd.f183922a.mo6606a().mo81110a(), (int) cfeo.f183719a.mo6606a().mo81095x(), this.f99432d, cfeo.m138872c()));
                this.f99431b.put(64, obj);
            }
        }
        return obj;
    }
}
