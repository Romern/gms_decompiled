package p000;

import android.content.Context;
import android.os.Looper;
import java.io.PrintWriter;

/* renamed from: zjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zjx implements zgf {

    /* renamed from: a */
    private final zjv f55263a;

    /* renamed from: b */
    private final zki f55264b = new zki();

    static {
        zvt.m46581a();
    }

    public zjx(Context context, Looper looper, aesh aesh, ytp ytp) {
        this.f55263a = zjv.m45616a(context, looper, aesh, ytp);
    }

    /* renamed from: a */
    public final bqgg mo19154a() {
        return this.f55263a.mo31184b();
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
    }

    /* renamed from: b */
    public final bngx mo19161b(caah caah) {
        if (!mo19159a(caah)) {
            return bngx.m109376e();
        }
        return bngx.m109356a(this.f55263a.mo31185b(caah));
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        if (!mo19158a(zgh.f55011a)) {
            return bqga.m112775a((Object) false);
        }
        zki zki = this.f55264b;
        zkg zkg = new zkg();
        zkg.f55292a = zgh.f55012b;
        zkg.mo31199a(zgh.f55013c, zgh.f55014d);
        zki.mo31205a(zkg.mo31198a());
        return this.f55263a.mo31180a(zgh);
    }

    /* renamed from: a */
    public final boolean mo19158a(caae caae) {
        bnrd a = this.f55263a.f55252b.values().iterator();
        while (a.hasNext()) {
            if (caae.f172326b.equals(((caae) a.next()).f172326b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo19159a(caah caah) {
        return zjw.f55262c.contains(caah);
    }

    /* renamed from: a */
    public final boolean mo19160a(zgg zgg) {
        if (this.f55264b.mo31204a(zgg) == null) {
            return false;
        }
        this.f55263a.mo31182a(zgg);
        return true;
    }
}
