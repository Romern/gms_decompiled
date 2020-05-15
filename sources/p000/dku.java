package p000;

import java.io.Closeable;
import java.security.MessageDigest;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: dku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dku extends MessageDigest implements Closeable {

    /* renamed from: c */
    private static final C1245ok f13429c = new C1245ok();

    /* renamed from: a */
    private final MessageDigest f13430a;

    /* renamed from: b */
    private final ReentrantLock f13431b = new ReentrantLock();

    private dku(MessageDigest messageDigest) {
        super(messageDigest.getAlgorithm());
        this.f13430a = messageDigest;
    }

    /* renamed from: a */
    public static dku m8755a(String str) {
        dku dku;
        synchronized (dku.class) {
            dku = (dku) f13429c.get(str);
            if (dku == null) {
                dku = new dku(MessageDigest.getInstance(str));
                f13429c.put(str, dku);
            }
        }
        dku.f13431b.lock();
        dku.f13430a.reset();
        return dku;
    }

    /* renamed from: b */
    private final void m8756b() {
        if (!this.f13431b.isHeldByCurrentThread()) {
            throw new IllegalStateException("Attempting to use SharedMessageDigest after release()");
        }
    }

    public final void close() {
        mo9223a();
    }

    public final int digest(byte[] bArr, int i, int i2) {
        m8756b();
        return this.f13430a.digest(bArr, i, i2);
    }

    /* access modifiers changed from: protected */
    public final byte[] engineDigest() {
        throw new bmzt();
    }

    /* access modifiers changed from: protected */
    public final int engineGetDigestLength() {
        return this.f13430a.getDigestLength();
    }

    /* access modifiers changed from: protected */
    public final void engineReset() {
        throw new bmzt();
    }

    /* access modifiers changed from: protected */
    public final void engineUpdate(byte b) {
        throw new bmzt();
    }

    public final void reset() {
        m8756b();
        this.f13430a.reset();
    }

    public final String toString() {
        return this.f13430a.toString();
    }

    public final void update(byte b) {
        m8756b();
        this.f13430a.update(b);
    }

    public final byte[] digest() {
        m8756b();
        return this.f13430a.digest();
    }

    /* access modifiers changed from: protected */
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        throw new bmzt();
    }

    public final void update(byte[] bArr) {
        m8756b();
        this.f13430a.update(bArr);
    }

    public final byte[] digest(byte[] bArr) {
        m8756b();
        return this.f13430a.digest(bArr);
    }

    public final void update(byte[] bArr, int i, int i2) {
        m8756b();
        this.f13430a.update(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo9223a() {
        m8756b();
        this.f13431b.unlock();
    }
}
