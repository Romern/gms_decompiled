package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: jnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jnc {

    /* renamed from: a */
    public static final Logger f22855a = jsy.m17256a("RemoteBeaconSeedFetcher");

    /* renamed from: b */
    public static WeakReference f22856b;

    /* renamed from: c */
    public final bqgj f22857c;

    /* renamed from: d */
    public final List f22858d;

    /* renamed from: e */
    public final Object f22859e;

    /* renamed from: f */
    public final Map f22860f;

    /* renamed from: g */
    public boolean f22861g = false;

    /* renamed from: h */
    public boolean f22862h = true;

    public jnc() {
        bqgj a = snp.m35702a(10);
        this.f22857c = bqgs.m112811a((ExecutorService) a);
        this.f22858d = new ArrayList();
        this.f22859e = new Object();
        this.f22860f = new C1223np();
    }

    /* renamed from: a */
    public final void mo13894a(Map map) {
        synchronized (this.f22859e) {
            if (map == null) {
                f22855a.mo25416d("Could not fetch remote seeds. Notifying callbacks of failure.", new Object[0]);
                for (jnb jnb : this.f22858d) {
                    jnb.mo13893b(null);
                }
            } else {
                C1223np npVar = new C1223np(((C1245ok) map).f26809h);
                npVar.putAll(map);
                f22855a.mo25412b("Successfully fetched remote seeds. Notifying callbacks.", new Object[0]);
                for (jnb jnb2 : this.f22858d) {
                    jnb2.mo13893b(npVar);
                }
            }
            this.f22858d.clear();
            this.f22861g = false;
        }
    }
}
