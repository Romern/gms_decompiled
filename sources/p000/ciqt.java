package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ciqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ciqt {

    /* renamed from: f */
    public static final ciqt f191261f = new ciqs();

    /* renamed from: a */
    private boolean f191262a;

    /* renamed from: b */
    private long f191263b;

    /* renamed from: g */
    public long f191264g;

    /* renamed from: a */
    public ciqt mo86354a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("timeout < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            this.f191264g = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: b */
    public ciqt mo86355b(long j) {
        this.f191262a = true;
        this.f191263b = j;
        return this;
    }

    /* renamed from: e */
    public void mo86356e() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f191262a && this.f191263b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: f */
    public boolean mo86357f() {
        return this.f191262a;
    }

    /* renamed from: g */
    public long mo86358g() {
        if (this.f191262a) {
            return this.f191263b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: h */
    public ciqt mo86359h() {
        this.f191264g = 0;
        return this;
    }

    /* renamed from: i */
    public ciqt mo86360i() {
        this.f191262a = false;
        return this;
    }
}
