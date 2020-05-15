package p000;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: agbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agbj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ agbl f65129a;

    /* renamed from: b */
    private final agbk f65130b;

    public agbj(agbl agbl, agbk agbk) {
        this.f65129a = agbl;
        this.f65130b = agbk;
    }

    public final void run() {
        C1240of ofVar;
        try {
            agbl agbl = this.f65129a;
            agcm agcm = agbl.f65147a;
            agbt agbt = agbl.f65150d;
            agaq agaq = new agaq();
            String str = this.f65129a.f65148b;
            agbk agbk = this.f65130b;
            ofVar = new agag(agbt, agaq, str, agbk.f65144l, agbk.f65146n, agbk.f65145m).call();
        } catch (Exception e) {
            bnsl bnsl = (bnsl) agbl.f65147a.f65218b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("agbj", "run", 319, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to run EnqueueMdnsQueryCallable for subtype: %s", TextUtils.join(",", this.f65130b.f65144l));
            ofVar = null;
        }
        synchronized (this.f65129a.f65152f) {
            if (cczu.f180328a.mo6606a().mo77140u()) {
                agbk agbk2 = this.f65130b;
                int i = agbk.f65131a;
                if (agbk2.f65138f != this.f65129a.f65155i) {
                    return;
                }
            }
            if (cczu.f180328a.mo6606a().mo77133n()) {
                if (this.f65129a.f65156j == null) {
                    return;
                }
            }
            if (ofVar != null) {
                for (agbb agbb : this.f65129a.f65153g) {
                    agbb.mo23437a((List) ofVar.f26799b, ((Integer) ofVar.f26798a).intValue());
                }
            }
            agbk agbk3 = this.f65130b;
            int i2 = agbk3.f65145m + 1;
            agbk3.f65145m = i2;
            if (i2 > 65536) {
                agbk3.f65145m = 1;
            }
            agbk3.f65146n = false;
            int i3 = agbk3.f65141i + 1;
            agbk3.f65141i = i3;
            if (i3 == agbk3.f65139g) {
                agbk3.f65141i = 0;
                if (agbk3.f65136d) {
                    agbk3.f65146n = true;
                }
                if (agbk3.f65143k) {
                    agbk3.f65143k = false;
                    if (agbk3.f65137e) {
                        agbk3.f65139g = agbk.f65133c;
                    }
                }
                int i4 = agbk3.f65140h;
                agbk3.f65142j = i4;
                if (i4 < agbk.f65131a) {
                    int i5 = agbk3.f65140h;
                    agbk3.f65140h = Math.min(i5 + i5, agbk.f65131a);
                }
            } else {
                agbk3.f65142j = agbk.f65132b;
            }
            agbl agbl2 = this.f65129a;
            agbl2.f65156j = ((sny) agbl2.f65151e).schedule(new agbj(agbl2, agbk3), (long) agbk3.f65142j, TimeUnit.MILLISECONDS);
        }
    }
}
