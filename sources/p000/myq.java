package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: myq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class myq implements bzrx {

    /* renamed from: a */
    public static final lvn f34950a = new lvn("UploadDataStream");

    /* renamed from: j */
    private static final naf f34951j = naf.UNKNOWN;

    /* renamed from: b */
    public final InputStream f34952b;

    /* renamed from: c */
    public long f34953c;

    /* renamed from: d */
    public long f34954d;

    /* renamed from: e */
    public final AtomicBoolean f34955e;

    /* renamed from: f */
    public final AtomicBoolean f34956f;

    /* renamed from: g */
    public final Lock f34957g;

    /* renamed from: h */
    public final Condition f34958h;

    /* renamed from: i */
    public final Condition f34959i = this.f34957g.newCondition();

    /* renamed from: k */
    private final AtomicBoolean f34960k;

    /* renamed from: l */
    private final AtomicReference f34961l;

    public myq(InputStream inputStream) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f34957g = reentrantLock;
        this.f34958h = reentrantLock.newCondition();
        this.f34952b = inputStream;
        this.f34953c = 0;
        this.f34954d = 0;
        this.f34955e = new AtomicBoolean(true);
        this.f34956f = new AtomicBoolean(false);
        this.f34960k = new AtomicBoolean(false);
        this.f34961l = new AtomicReference(f34951j);
    }

    /* renamed from: a */
    public final int mo20316a(byte[] bArr, int i, int i2) {
        f34950a.logVerbose("[READ]", new Object[0]);
        if (bArr.length - i < i2) {
            throw new IOException("Buffer length must be greater than desired number of bytes.");
        } else if (i2 == 0) {
            return 0;
        } else {
            this.f34957g.lock();
            while (this.f34954d == this.f34953c && this.f34955e.get() && !this.f34960k.get()) {
                try {
                    f34950a.logVerbose("[READ] wait for available data.", new Object[0]);
                    this.f34958h.await();
                } catch (InterruptedException e) {
                    f34950a.mo25418e("InterruptedException when waiting for available data in read method.", new Object[0]);
                    throw new IOException(e);
                } catch (Throwable th) {
                    this.f34957g.unlock();
                    throw th;
                }
            }
            if (!this.f34960k.get()) {
                if (this.f34955e.get()) {
                    int read = this.f34952b.read(bArr, i, Math.min((int) (this.f34953c - this.f34954d), i2));
                    lvn lvn = f34950a;
                    StringBuilder sb = new StringBuilder(35);
                    sb.append("[READ] Read ");
                    sb.append(read);
                    sb.append(" bytes data.");
                    lvn.logVerbose(sb.toString(), new Object[0]);
                    if (read != -1) {
                        long j = this.f34954d + ((long) read);
                        this.f34954d = j;
                        if (this.f34953c == j) {
                            f34950a.logVerbose("[READ] signal data processed.", new Object[0]);
                            this.f34959i.signalAll();
                        }
                        this.f34957g.unlock();
                        return read;
                    }
                }
                this.f34957g.unlock();
                return 0;
            } else if (ccmn.m130690b()) {
                throw new IOException(new nag((naf) this.f34961l.get()));
            } else {
                throw new IOException("Transfer cancelled by framework.");
            }
        }
    }

    /* renamed from: b */
    public final void mo20320b() {
        this.f34957g.lock();
        this.f34957g.unlock();
    }

    /* renamed from: c */
    public final long mo20321c() {
        this.f34957g.lock();
        try {
            return this.f34954d;
        } finally {
            this.f34957g.unlock();
        }
    }

    public final void close() {
        this.f34957g.lock();
        try {
            this.f34952b.close();
        } finally {
            this.f34957g.unlock();
        }
    }

    /* renamed from: d */
    public final long mo20323d() {
        this.f34957g.lock();
        try {
            return this.f34954d;
        } finally {
            this.f34957g.unlock();
        }
    }

    /* renamed from: e */
    public final long mo20324e() {
        this.f34957g.lock();
        this.f34957g.unlock();
        return Long.MAX_VALUE;
    }

    /* renamed from: f */
    public final void mo20325f() {
        this.f34957g.lock();
        this.f34957g.unlock();
    }

    /* renamed from: g */
    public final long mo20326g() {
        this.f34957g.lock();
        this.f34957g.unlock();
        return -1;
    }

    /* renamed from: h */
    public final boolean mo20327h() {
        lvn lvn = f34950a;
        boolean z = this.f34955e.get();
        StringBuilder sb = new StringBuilder(21);
        sb.append("[HAS MORE DATA] ");
        sb.append(z);
        lvn.logVerbose(sb.toString(), new Object[0]);
        this.f34957g.lock();
        try {
            return this.f34955e.get();
        } finally {
            this.f34957g.unlock();
        }
    }

    /* renamed from: a */
    public final long mo20317a(long j) {
        f34950a.logVerbose("[SKIP]", new Object[0]);
        if (j < 0) {
            throw new IOException("Can't skip negative bytes.");
        } else if (j == 0) {
            return j;
        } else {
            this.f34957g.lock();
            while (true) {
                try {
                    if (this.f34954d != this.f34953c || !this.f34955e.get()) {
                        break;
                    } else if (this.f34960k.get()) {
                        break;
                    } else {
                        if (ccnu.m130914b()) {
                            f34950a.logVerbose("[SKIP] Wait for data to become available.", new Object[0]);
                        }
                        this.f34958h.await();
                    }
                } catch (InterruptedException e) {
                    f34950a.mo25418e("InterruptedException when waiting for available data in skip method.", new Object[0]);
                    throw new IOException(e);
                } catch (Throwable th) {
                    this.f34957g.unlock();
                    throw th;
                }
            }
            if (!this.f34960k.get()) {
                if (this.f34955e.get()) {
                    long skip = this.f34952b.skip(Math.min(this.f34953c - this.f34954d, j));
                    long j2 = this.f34954d + skip;
                    this.f34954d = j2;
                    if (j2 == this.f34953c) {
                        this.f34959i.signalAll();
                    }
                    this.f34957g.unlock();
                    return skip;
                }
                this.f34957g.unlock();
                return 0;
            } else if (ccmn.m130690b()) {
                throw new IOException(new nag((naf) this.f34961l.get()));
            } else {
                throw new IOException("Transfer cancelled by framework.");
            }
        }
    }

    /* renamed from: a */
    public final void mo20318a() {
        this.f34957g.lock();
        try {
            this.f34956f.set(true);
            this.f34959i.signalAll();
        } finally {
            this.f34957g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo20319a(naf naf) {
        this.f34957g.lock();
        try {
            this.f34960k.set(true);
            if (ccmn.m130690b() && !this.f34961l.compareAndSet(f34951j, naf)) {
                f34950a.mo25418e("Trying to cancel, but the stream is already cancelled, reason: %s", ((naf) this.f34961l.get()).f35130d);
            }
            this.f34958h.signalAll();
        } finally {
            this.f34957g.unlock();
        }
    }
}
