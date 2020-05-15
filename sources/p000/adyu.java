package p000;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* renamed from: adyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class adyu implements Closeable {

    /* renamed from: a */
    protected final adzb f62946a;

    /* renamed from: b */
    private int f62947b = 0;

    public adyu(adzb adzb) {
        this.f62946a = adzb;
    }

    /* renamed from: a */
    public final synchronized boolean mo33942a() {
        return this.f62947b > 0;
    }

    /* renamed from: b */
    public final synchronized void mo33944b() {
        int i = this.f62947b;
        if (i != 0) {
            if (i <= 1) {
                mo33948d();
                i = this.f62947b;
            }
            this.f62947b = i - 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo33945b(long j, TimeUnit timeUnit);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo33946c();

    public final void close() {
        mo33944b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo33948d();

    /* renamed from: e */
    public final synchronized void mo33949e() {
        int i = this.f62947b;
        if (i <= 0) {
            mo33946c();
            i = this.f62947b;
        }
        this.f62947b = i + 1;
    }

    public final synchronized void finalize() {
        if (this.f62947b > 0) {
            throw new IllegalStateException("Lock wasn't released correctly");
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo33943a(long j, TimeUnit timeUnit) {
        int i = this.f62947b;
        if (i > 0) {
            this.f62947b = i + 1;
            return true;
        } else if (!mo33945b(j, timeUnit)) {
            return false;
        } else {
            this.f62947b++;
            return true;
        }
    }
}
