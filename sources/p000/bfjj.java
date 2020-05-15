package p000;

import java.util.Calendar;
import java.util.Locale;

/* renamed from: bfjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfjj extends bfhp {

    /* renamed from: a */
    final /* synthetic */ bfjk f114172a;

    public bfjj(bfjk bfjk) {
        this.f114172a = bfjk;
    }

    /* renamed from: a */
    public final void mo61492a(bsax bsax) {
        if (this.f114172a.mo61754a()) {
            long c = this.f114172a.f114049c.mo62776c() - this.f114172a.f114176n;
            if (1000 + c >= 10000 && bsax != null && bsax.mo70138j(4) > 0) {
                bfjm bfjm = this.f114172a.f114177o;
                bfjm.f114187c.mo62786f().submit(new bfjl(bfjm, Calendar.getInstance(), bsax));
            } else {
                Locale locale = Locale.US;
                new Object[1][0] = Long.valueOf(c);
            }
            this.f114172a.m97023f(true);
        }
    }

    /* renamed from: a */
    public final void mo60954a(String str) {
        this.f114172a.m97023f(true);
    }
}
