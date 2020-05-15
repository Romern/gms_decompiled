package p000;

import com.google.android.gms.cast.CastDevice;
import java.util.concurrent.TimeUnit;

/* renamed from: pjv */
final /* synthetic */ class pjv implements pjb {

    /* renamed from: a */
    private final pjx f39398a;

    public pjv(pjx pjx) {
        this.f39398a = pjx;
    }

    /* renamed from: a */
    public final void mo23233a(String str, String str2) {
        pjx pjx = this.f39398a;
        pjc pjc = pjx.f39404g;
        if (pjc != null && pjc.f39230a.mo17494a().equals(str)) {
            pjx.f39400c.mo23861b("Session endpoint doesn't change. Ignore the message.");
            return;
        }
        pjx.f39400c.mo23857a("%s is switching to endpoint device %s", pjx.f39230a, str);
        if (!pjx.f39410m && !ccyt.f180279a.mo6606a().mo77082a()) {
            pjx.f39400c.mo23861b("Session following is disallowed. No-op.");
        } else if (!str2.equals(pjx.f39412o)) {
            pjx.f39400c.mo23856a("The endpoint device has a different session from %s. Exit.", pjx.f39230a);
            pjx.mo23289k();
            pjx.mo23286h();
            pjx.f39413p = 1;
            pjx.f39409l.f39236e.mo23195c(2900);
        } else {
            pjx.f39401d.mo23455a(str2, str);
            pjx.f39403f = pjx.f39231b.schedule(new pjt(pjx), pie.f39207c, TimeUnit.MILLISECONDS);
            pjx.mo23286h();
            pjx.f39413p = 4;
            pjx.f39409l.f39236e.mo23192b(2900);
            CastDevice a = pjx.f39401d.mo23451a(str);
            if (a != null) {
                pjx.f39400c.mo23856a("The endpoint device of %s is online. Reconnecting to it.", pjx.f39230a);
                pjx.mo23285a(a, a.f29723k);
                return;
            }
            pnu b = pjx.f39401d.mo23461b(str2);
            if (b != null) {
                b.mo23511b();
                pjx.f39406i = str;
                if (pjx.f39405h == null) {
                    pjx.f39405h = new pju(pjx);
                }
                pjx.f39401d.mo23459a(pjx.f39405h);
                pjx.f39407j = true;
                pjx.f39400c.mo23856a("Waiting for the endpoint device of %s to come online.", pjx.f39230a);
                return;
            }
            pjx.f39400c.mo23675c("PublishedSessionDeviceEntry is unavailable for %s", pjx.f39230a);
            pjx.mo23284a(2903);
        }
    }
}
