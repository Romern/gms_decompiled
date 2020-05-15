package p000;

import java.io.PrintWriter;
import java.util.Collection;

/* renamed from: zgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zgk implements zgf {

    /* renamed from: a */
    private final zgj f55027a;

    /* renamed from: b */
    private final zki f55028b = new zki();

    /* renamed from: c */
    private final String f55029c;

    static {
        zvt.m46581a();
    }

    public zgk(zgj zgj, String str) {
        this.f55027a = zgj;
        this.f55029c = str;
    }

    /* renamed from: a */
    public final bqgg mo19154a() {
        return this.f55027a.mo31089b();
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
    }

    /* renamed from: b */
    public final bngx mo19161b(caah caah) {
        if (!mo19159a(caah)) {
            return bngx.m109376e();
        }
        return bngx.m109368a((Collection) this.f55027a.mo31085a());
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        if (!mo19158a(zgh.f55011a)) {
            return bqga.m112775a((Object) false);
        }
        zki zki = this.f55028b;
        zkg zkg = new zkg();
        zkg.f55292a = zgh.f55012b;
        zkg.mo31199a(zgh.f55013c, zgh.f55014d);
        zki.mo31205a(zkg.mo31198a());
        return this.f55027a.mo31087a(this.f55029c, zgh);
    }

    /* renamed from: a */
    public final boolean mo19158a(caae caae) {
        String str = caae.f172326b;
        bnrd a = this.f55027a.mo31085a().iterator();
        while (a.hasNext()) {
            if (((caae) a.next()).f172326b.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo19159a(caah caah) {
        return bzzn.f172114h.equals(caah);
    }

    /* renamed from: a */
    public final boolean mo19160a(zgg zgg) {
        if (this.f55028b.mo31204a(zgg) == null) {
            return false;
        }
        this.f55027a.mo31088a(zgg);
        return true;
    }
}
