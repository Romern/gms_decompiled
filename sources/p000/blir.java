package p000;

import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: blir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blir {

    /* renamed from: a */
    public final UUID f126635a;

    /* renamed from: b */
    private final AtomicLong f126636b;

    public blir() {
        UUID randomUUID = UUID.randomUUID();
        long nextLong = new SecureRandom().nextLong();
        this.f126635a = randomUUID;
        this.f126636b = new AtomicLong((nextLong ^ 25214903917L) & 281474976710655L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo66579a() {
        long j;
        long j2;
        long j3;
        do {
            j = this.f126636b.get();
            long j4 = ((j * 25214903917L) + 11) & 281474976710655L;
            j2 = ((25214903917L * j4) + 11) & 281474976710655L;
            j3 = (((long) ((int) (j4 >>> 16))) << 32) + ((long) ((int) (j2 >>> 16)));
        } while (!this.f126636b.compareAndSet(j, j2));
        return j3;
    }
}
