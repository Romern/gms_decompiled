package p000;

import java.security.SecureRandom;
import java.util.Random;

/* renamed from: bmyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmyj extends Random {

    /* renamed from: a */
    private final boolean f131200a = true;

    /* renamed from: a */
    static final SecureRandom m108623a() {
        return (SecureRandom) bmyk.f131203c.get();
    }

    /* access modifiers changed from: protected */
    public final int next(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean nextBoolean() {
        return m108623a().nextBoolean();
    }

    public final void nextBytes(byte[] bArr) {
        m108623a().nextBytes(bArr);
    }

    public final double nextDouble() {
        return m108623a().nextDouble();
    }

    public final float nextFloat() {
        return m108623a().nextFloat();
    }

    public final double nextGaussian() {
        return m108623a().nextGaussian();
    }

    public final int nextInt() {
        return m108623a().nextInt();
    }

    public final long nextLong() {
        return m108623a().nextLong();
    }

    public final void setSeed(long j) {
        if (!this.f131200a) {
            super.setSeed(j);
            return;
        }
        throw new UnsupportedOperationException("Setting the seed on a thread-local Random object is not permitted");
    }

    public final int nextInt(int i) {
        return m108623a().nextInt(i);
    }
}
