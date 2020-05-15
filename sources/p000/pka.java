package p000;

import com.google.android.gms.cast.CastDevice;
import java.util.concurrent.TimeUnit;

/* renamed from: pka */
final /* synthetic */ class pka implements pjb {

    /* renamed from: a */
    private final pkd f39417a;

    public pka(pkd pkd) {
        this.f39417a = pkd;
    }

    /* renamed from: a */
    public final void mo23233a(String str, String str2) {
        pkd pkd = this.f39417a;
        pjc pjc = pkd.f39429i;
        if (pjc != null && pjc.f39230a.mo17494a().equals(str)) {
            pkd.f39423c.mo23861b("Session endpoint doesn't change. Ignore the message.");
            return;
        }
        pkd.f39433m.clear();
        pkd.f39433m.addAll(pkd.f39429i.f39321j);
        pkd.f39423c.mo23857a("%s is switching to endpoint device %s", pkd.f39230a, str);
        if (!str2.equals(pkd.f39426f)) {
            pkd.f39423c.mo23856a("The endpoint device has a different session from %s. Exit.", pkd.f39230a);
            pkd.f39424d.mo23456a(pkd.f39426f, pkd);
            pkd.mo23291a(2902);
            return;
        }
        pkd.f39424d.mo23455a(str2, str);
        pkd.f39428h = pkd.f39231b.schedule(new pjy(pkd), pie.f39207c, TimeUnit.MILLISECONDS);
        pkd.mo23291a(2016);
        CastDevice a = pkd.f39424d.mo23451a(str);
        if (a != null) {
            pkd.f39423c.mo23856a("The endpoint device of %s is online. Reconnecting to it.", pkd.f39230a);
            pkd.mo23292a(a, a.f29723k);
            return;
        }
        pnu c = pkd.f39424d.mo23464c(pkd.f39230a.mo17494a());
        if (c != null) {
            c.mo23511b();
            pkd.f39431k = str;
            if (pkd.f39430j == null) {
                pkd.f39430j = new pjz(pkd);
            }
            pkd.f39424d.mo23459a(pkd.f39430j);
            pkd.f39432l = true;
            pkd.f39423c.mo23856a("Waiting for the endpoint device of %s to come online.", pkd.f39230a);
            return;
        }
        pkd.f39423c.mo23675c("PublishedSessionDeviceEntry is unavailable for %s", pkd.f39230a);
        pkd.mo23294h();
    }
}
