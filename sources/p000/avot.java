package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: avot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avot implements avpy {

    /* renamed from: a */
    private static final sek f93675a = avpq.m79018e("DefaultThrottler");

    /* renamed from: b */
    private static final long f93676b = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: c */
    private final avtn f93677c = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: d */
    private final AtomicBoolean f93678d = new AtomicBoolean(false);

    private avot() {
    }

    /* renamed from: a */
    public static avot m78956a() {
        return new avot();
    }

    /* renamed from: b */
    public final void mo51461b() {
        ArrayList arrayList = new ArrayList();
        for (String str : bmyx.m108640a(',').mo66918a((CharSequence) cfsd.f185543a.mo6606a().mo82607o())) {
            arrayList.add(Long.valueOf(Long.parseLong(str)));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bngx bngx = (bngx) this.f93677c.mo51607b(avnp.f93537l);
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i < bngx.size() && i < arrayList.size()) {
                if (elapsedRealtime < ((Long) bngx.get(i)).longValue()) {
                    this.f93677c.mo51606a(avnp.f93537l);
                    break;
                }
                j2 = Math.max(j2, ((Long) bngx.get(i)).longValue() + ((Long) arrayList.get(i)).longValue());
                i++;
            } else {
                j = j2;
            }
        }
        j = j2;
        if (SystemClock.elapsedRealtime() < j) {
            f93675a.mo25414c("Throttling: current time=%d, earliest retry time=%d.", Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(j));
        }
        while (!this.f93678d.get() && SystemClock.elapsedRealtime() < j) {
            SystemClock.sleep(f93676b);
        }
        bngx bngx2 = (bngx) this.f93677c.mo51607b(avnp.f93537l);
        if (!this.f93678d.get()) {
            bngs j3 = bngx.m109377j();
            j3.mo67668c(Long.valueOf(SystemClock.elapsedRealtime()));
            if (bngx2.size() >= 15) {
                j3.mo67666b((Iterable) bngx2.subList(0, 14));
            } else {
                j3.mo67666b((Iterable) bngx2);
            }
            this.f93677c.mo51605a(avnp.f93537l.mo51602b(j3.mo67664a()));
        }
    }

    /* renamed from: c */
    public final void mo51462c() {
        this.f93678d.set(true);
    }
}
