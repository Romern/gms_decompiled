package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: xik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xik {

    /* renamed from: e */
    private static final Logger f52356e = new Logger(new String[]{"BleOperationHandler"}, (short[]) null);

    /* renamed from: a */
    public volatile xif f52357a = xif.NONE;

    /* renamed from: b */
    public xij f52358b = null;

    /* renamed from: c */
    private volatile xiu f52359c = null;

    /* renamed from: d */
    private final xja f52360d = new xja();

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo29806a(int i) {
        try {
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException();
            } else if (i >= 0) {
                if (i != 0) {
                    xja xja = this.f52360d;
                    long j = (long) i;
                    bmxy.m108581a(xja.f52397a);
                    if (!xja.f52397a.await(j, TimeUnit.MILLISECONDS)) {
                        throw new TimeoutException();
                    }
                } else {
                    xja xja2 = this.f52360d;
                    bmxy.m108581a(xja2.f52397a);
                    xja2.f52397a.await();
                }
                this.f52357a = xif.NONE;
                xij xij = this.f52358b;
                if (xij != null) {
                    this.f52358b = null;
                    throw xij;
                }
            } else {
                f52356e.mo25418e("waitForCompletion is called with timeoutMillis %d", Integer.valueOf(i));
                throw new xij("waitForCompletion was called with negative timeout");
            }
        } catch (Throwable th) {
            this.f52357a = xif.NONE;
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo29809b(xif xif) {
        mo29810b(xif, null);
    }

    /* renamed from: b */
    public final void mo29810b(xif xif, xiu xiu) {
        if (xif == xif.DISCONNECT) {
            f52356e.mo25412b("Notify operation DISCONNECT is completed", new Object[0]);
            this.f52360d.mo29825a();
        } else if (this.f52357a == xif && (this.f52359c == null || this.f52359c.equals(xiu))) {
            f52356e.mo25412b("Notify operation %s is completed", this.f52357a);
            this.f52360d.mo29825a();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Unexpected operation; current: %s, callback: %s", this.f52357a, xif));
            if (!(xiu == null && this.f52359c == null)) {
                sb.append(String.format("; current characteristic id: %s, callback characteristic id: %s", this.f52359c, xiu));
            }
            f52356e.mo25412b(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo29807a(xif xif) {
        mo29808a(xif, null);
    }

    /* renamed from: a */
    public final void mo29808a(xif xif, xiu xiu) {
        if (this.f52357a != xif.NONE) {
            f52356e.mo25416d("Overwriting previous operation %s with the new operation %s", this.f52357a, xif);
        }
        this.f52357a = xif;
        this.f52359c = xiu;
        this.f52360d.f52397a = new CountDownLatch(1);
    }
}
