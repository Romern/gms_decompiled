package p000;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: atou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atou implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aucf f90614a;

    /* renamed from: b */
    final /* synthetic */ long f90615b;

    /* renamed from: c */
    final /* synthetic */ TimeUnit f90616c;

    public atou(aucf aucf, long j, TimeUnit timeUnit) {
        this.f90614a = aucf;
        this.f90615b = j;
        this.f90616c = timeUnit;
    }

    public final void run() {
        this.f90614a.mo50392b((Exception) new TimeoutException(String.format(Locale.US, "Timed out after %d %s", Long.valueOf(this.f90615b), this.f90616c.name())));
    }
}
