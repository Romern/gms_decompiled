package p000;

import android.content.Context;
import android.os.Handler;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zgp implements zgf, yqk {

    /* renamed from: a */
    private final Context f55031a;

    /* renamed from: b */
    private final Handler f55032b;

    /* renamed from: c */
    private final zhl f55033c;

    /* renamed from: d */
    private final Map f55034d = new HashMap();

    public zgp(Context context, zhl zhl, Handler handler) {
        this.f55031a = context;
        this.f55032b = handler;
        this.f55033c = zhl;
    }

    /* renamed from: a */
    public final bqgg mo19154a() {
        return zge.m45363a();
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
    }

    /* renamed from: b */
    public final bngx mo19161b(caah caah) {
        bngs j = bngx.m109377j();
        for (zgf zgf : this.f55034d.values()) {
            j.mo67666b((Iterable) zgf.mo19161b(caah));
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    public final bqgg mo30669a(cacv cacv) {
        return mo31094b(cacv).mo31114a(cacv);
    }

    /* renamed from: b */
    public final zhi mo31094b(cacv cacv) {
        zhm a = this.f55033c.mo31121a(cacv.f172631b);
        zhi zhi = new zhi(this.f55031a, this.f55032b, a, this.f55033c, yqx.m44621a(cacv.f172633d));
        this.f55034d.put(a.mo31125a(), zhi.f55082c);
        return zhi;
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        for (zgf zgf : this.f55034d.values()) {
            if (zgf.mo19158a(zgh.f55011a)) {
                return zgf.mo19155a(zgh);
            }
        }
        return bqga.m112775a((Object) false);
    }

    /* renamed from: a */
    public final void mo30670a(String str) {
        ((zhi) ((zlf) this.f55034d.remove(str)).f55149a).mo31116b();
    }

    /* renamed from: a */
    public final boolean mo19158a(caae caae) {
        for (zgf zgf : this.f55034d.values()) {
            if (zgf.mo19158a(caae)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo19159a(caah caah) {
        for (zgf zgf : this.f55034d.values()) {
            if (zgf.mo19159a(caah)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo19160a(zgg zgg) {
        for (zgf zgf : this.f55034d.values()) {
            if (zgf.mo19160a(zgg)) {
                return true;
            }
        }
        return false;
    }
}
