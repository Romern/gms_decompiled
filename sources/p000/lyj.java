package p000;

import android.os.SystemClock;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/* renamed from: lyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class lyj {
    /* renamed from: a */
    public abstract bnic mo19724a();

    /* renamed from: a */
    public final Object mo19748a(ClientContext clientContext, Object obj, lyn lyn) {
        int i = 0;
        while (true) {
            try {
                return lyn.mo19733a(clientContext, obj);
            } catch (chuw e) {
                if (!mo19724a().contains(e.f189236a)) {
                    break;
                }
                int i2 = i + 1;
                long j = (long) i2;
                if (j == mo19725b()) {
                    break;
                }
                SystemClock.sleep(mo19726c() + TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, (double) i)) + ThreadLocalRandom.current().nextLong(mo19727d()));
                if (j < mo19725b()) {
                    i = i2;
                } else {
                    throw new AssertionError("impossible");
                }
                throw e;
            }
        }
        throw e;
    }

    /* renamed from: b */
    public abstract long mo19725b();

    /* renamed from: c */
    public abstract long mo19726c();

    /* renamed from: d */
    public abstract long mo19727d();

    /* renamed from: e */
    public abstract lxk mo19728e();
}
