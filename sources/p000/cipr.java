package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: cipr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cipr extends ciqt {

    /* renamed from: b */
    public static final long f191203b = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: c */
    public static final long f191204c = TimeUnit.MILLISECONDS.toNanos(f191203b);

    /* renamed from: d */
    static cipr f191205d;

    /* renamed from: a */
    private boolean f191206a;

    /* renamed from: e */
    public cipr f191207e;

    /* renamed from: h */
    private long f191208h;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* renamed from: a */
    private static synchronized void m150703a(cipr cipr, long j, boolean z) {
        cipr cipr2;
        cipr cipr3;
        synchronized (cipr.class) {
            if (f191205d == null) {
                f191205d = new cipr();
                new cipq().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0) {
                if (z) {
                    cipr.f191208h = Math.min(j, cipr.mo86358g() - nanoTime) + nanoTime;
                    long a = cipr.mo86270a(nanoTime);
                    cipr2 = f191205d;
                    while (true) {
                        cipr3 = cipr2.f191207e;
                        if (cipr3 == null || a < cipr3.mo86270a(nanoTime)) {
                            cipr.f191207e = cipr2.f191207e;
                            cipr2.f191207e = cipr;
                        } else {
                            cipr2 = cipr2.f191207e;
                        }
                    }
                    cipr.f191207e = cipr2.f191207e;
                    cipr2.f191207e = cipr;
                    if (cipr2 == f191205d) {
                        cipr.class.notify();
                    }
                }
            }
            if (j != 0) {
                cipr.f191208h = j + nanoTime;
            } else if (z) {
                cipr.f191208h = cipr.mo86358g();
            } else {
                throw new AssertionError();
            }
            long a2 = cipr.mo86270a(nanoTime);
            cipr2 = f191205d;
            while (true) {
                cipr3 = cipr2.f191207e;
                if (cipr3 == null) {
                    break;
                }
                break;
                cipr2 = cipr2.f191207e;
            }
            cipr.f191207e = cipr2.f191207e;
            cipr2.f191207e = cipr;
            if (cipr2 == f191205d) {
            }
        }
    }

    /* renamed from: a */
    public final long mo86270a(long j) {
        return this.f191208h - j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo74999a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final IOException mo86272b(IOException iOException) {
        return mo86274d() ? mo74998a(iOException) : iOException;
    }

    /* renamed from: c */
    public final void mo86273c() {
        if (!this.f191206a) {
            long j = this.f191264g;
            boolean f = mo86357f();
            if (j != 0 || f) {
                this.f191206a = true;
                m150703a(this, j, f);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* renamed from: d */
    public final boolean mo86274d() {
        if (!this.f191206a) {
            return false;
        }
        this.f191206a = false;
        return m150704a(this);
    }

    /* renamed from: a */
    private static synchronized boolean m150704a(cipr cipr) {
        boolean z;
        synchronized (cipr.class) {
            cipr cipr2 = f191205d;
            while (true) {
                if (cipr2 != null) {
                    cipr cipr3 = cipr2.f191207e;
                    if (cipr3 == cipr) {
                        cipr2.f191207e = cipr.f191207e;
                        cipr.f191207e = null;
                        z = false;
                        break;
                    }
                    cipr2 = cipr3;
                } else {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IOException mo74998a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86271a(boolean z) {
        if (mo86274d() && z) {
            throw mo74998a((IOException) null);
        }
    }
}
