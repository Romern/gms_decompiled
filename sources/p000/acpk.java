package p000;

import android.os.Build;
import android.os.Trace;

/* renamed from: acpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acpk implements Runnable {

    /* renamed from: a */
    public final acpn f60416a;

    /* renamed from: b */
    final /* synthetic */ acpl f60417b;

    protected acpk(acpl acpl, acpn acpn) {
        this.f60417b = acpl;
        this.f60416a = acpn;
    }

    public final void run() {
        absg.m48202d("AsyncScheduler running task %s", this.f60416a);
        this.f60417b.f60424g.set(Integer.valueOf(this.f60416a.f60437h));
        acpl acpl = this.f60417b;
        acpn acpn = this.f60416a;
        synchronized (acpl.f60418a) {
            if (acpn.f60438i == 4) {
                acpl.mo32993b(acpn);
            }
            acpl.f60425h.mo49114a(acpn.mo32998d(), cemj.m137338b());
            acpl.f60425h.mo49122c(String.valueOf(acpn.mo32998d()).concat("-pending"));
        }
        try {
            acpn acpn2 = this.f60416a;
            boolean z = true;
            acpn2.mo32996a(1, 2);
            try {
                if (acaw.m48794k()) {
                    int i = Build.VERSION.SDK_INT;
                    Trace.beginSection(acpn2.mo32998d());
                }
                if (acpn2.mo33002g()) {
                    acry acry = acpn2.f60440k;
                    if (acsf.f60663a.get() != null) {
                        z = false;
                    }
                    sdo.m34970a(z);
                    acsf.f60663a.set(acry);
                }
                acpv.m49684a(acpn2);
                acpn2.f60442m = acpn2.mo11132a();
                acpn2.mo32428b(acpn2.f60442m);
            } catch (RuntimeException e) {
                acpn2.mo32997a(e);
            } catch (Throwable th) {
                acpn2.mo32996a(2, 3);
                if (acaw.m48794k()) {
                    int i2 = Build.VERSION.SDK_INT;
                    Trace.endSection();
                }
                if (acpn2.mo33002g()) {
                    acsf.m49795a(acpn2.f60440k);
                    acpn2.f60440k.mo33049a(acpn2.mo32998d(), acpn2.mo33000f());
                }
                acpv.m49689b(acpn2);
                throw th;
            }
            acpn2.f60441l.open();
            acpn2.mo32996a(2, 3);
            if (acaw.m48794k()) {
                int i3 = Build.VERSION.SDK_INT;
                Trace.endSection();
            }
            if (acpn2.mo33002g()) {
                acsf.m49795a(acpn2.f60440k);
                acpn2.f60440k.mo33049a(acpn2.mo32998d(), acpn2.mo33000f());
            }
            acpv.m49689b(acpn2);
        } finally {
            this.f60416a.mo32999e();
            this.f60417b.mo32989a(this.f60416a);
            this.f60417b.f60424g.set(null);
        }
    }

    public final String toString() {
        return this.f60416a.mo32998d();
    }
}
