package p000;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rra implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aucf f43536a;

    /* renamed from: b */
    final /* synthetic */ long f43537b;

    /* renamed from: c */
    final /* synthetic */ TimeUnit f43538c;

    public rra(aucf aucf, long j, TimeUnit timeUnit) {
        this.f43536a = aucf;
        this.f43537b = j;
        this.f43538c = timeUnit;
    }

    public final void run() {
        this.f43536a.mo50392b((Exception) new TimeoutException(String.format(Locale.US, "Timed out after %d %s", Long.valueOf(this.f43537b), this.f43538c.name())));
    }
}
