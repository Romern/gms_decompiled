package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zlu implements zgf {

    /* renamed from: a */
    public static final srn f55408a = zvt.m46581a();

    /* renamed from: b */
    public final Intent f55409b;

    /* renamed from: c */
    public final ConcurrentMap f55410c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Context f55411d;

    /* renamed from: e */
    private final bngx f55412e;

    /* renamed from: f */
    private final AtomicReference f55413f = new AtomicReference();

    public zlu(Context context, Intent intent, List list) {
        this.f55411d = context;
        this.f55409b = intent;
        this.f55412e = bngx.m109368a((Collection) list);
    }

    /* renamed from: b */
    private final bqgg m45708b() {
        synchronized (this.f55413f) {
            bqgg bqgg = (bqgg) this.f55413f.get();
            if (bqgg != null) {
                return bqgg;
            }
            yuj yuj = new yuj(this.f55413f);
            skh.m35531a().mo25690a(this.f55411d, this.f55409b, yuj.f54644c, 1);
            bqgg a = bqdx.m112673a(yuj, new zln(), bqfb.INSTANCE);
            this.f55413f.set(a);
            return a;
        }
    }

    /* renamed from: a */
    public final bqgg mo19154a() {
        return zge.m45363a();
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        if (!mo19158a(zgh.f55011a)) {
            return bqga.m112775a((Object) false);
        }
        bqgy c = bqgy.m112818c();
        bqga.m112781a(m45708b(), new zlr(zgh, new zlq(this, zgh, c), c), bqfb.INSTANCE);
        return c;
    }

    /* renamed from: a */
    public final void mo31225a(Status status, zgh zgh) {
        caae caae;
        if (status.mo17710c() && (caae = (caae) this.f55410c.put(zgh.f55012b, zgh.f55011a)) != null) {
            bnsl bnsl = (bnsl) f55408a.mo68388c();
            bnsl.mo68432a("zlu", "a", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("Updating the data source for listener %s from %s to %s", zgh.f55012b, caae.f172326b, zgh.f55011a.f172326b);
        }
    }

    /* renamed from: b */
    public final bngx mo19161b(caah caah) {
        if (!mo19159a(caah)) {
            return bngx.m109376e();
        }
        bqgy c = bqgy.m112818c();
        try {
            bqga.m112781a(m45708b(), new zlp(this, caah, new zlo(this, caah, c), c), bqfb.INSTANCE);
            return (bngx) c.get(300, TimeUnit.MILLISECONDS);
        } catch (SecurityException e) {
            bnsl bnsl = (bnsl) f55408a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zlu", "b", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to connect to FitnessSensorService");
            return bngx.m109376e();
        } catch (InterruptedException e2) {
            bnsl bnsl2 = (bnsl) f55408a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("zlu", "b", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Interrupted while waiting on FitnessSensorService");
            return bngx.m109376e();
        } catch (ExecutionException e3) {
            bnsl bnsl3 = (bnsl) f55408a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("zlu", "b", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Execution exception waiting on FitnessSensorService");
            return bngx.m109376e();
        } catch (TimeoutException e4) {
            bnsl bnsl4 = (bnsl) f55408a.mo68390d();
            bnsl4.mo68432a("zlu", "b", 183, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68420a("Application %s didn't respond in time", this.f55409b.getPackage());
            return bngx.m109376e();
        }
    }

    /* renamed from: a */
    public final boolean mo19158a(caae caae) {
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        if (!mo19159a(caah) || (caae.f172325a & 64) == 0) {
            return false;
        }
        bzzz bzzz = caae.f172332h;
        if (bzzz == null) {
            bzzz = bzzz.f172298f;
        }
        if (bzzz.f172301b.equals(this.f55409b.getPackage())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo19159a(caah caah) {
        return this.f55412e.contains(caah);
    }

    /* renamed from: a */
    public final boolean mo19160a(zgg zgg) {
        caae caae = (caae) this.f55410c.get(zgg);
        if (caae == null) {
            bnsl bnsl = (bnsl) f55408a.mo68388c();
            bnsl.mo68432a("zlu", "a", 255, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Couldn't find a data source for listener %s", zgg);
            return false;
        }
        bqga.m112781a(m45708b(), new zlt(caae, new zls(this, zgg)), bqfb.INSTANCE);
        return true;
    }
}
