package p000;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: byqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqb {

    /* renamed from: a */
    public final Deque f167373a = new ArrayDeque(16);

    /* renamed from: b */
    private final boolean f167374b;

    public byqb(boolean z) {
        this.f167374b = z;
    }

    /* renamed from: c */
    private final void m125108c(long j) {
        this.f167373a.pop();
        this.f167373a.push(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo74457a() {
        if (!this.f167373a.isEmpty()) {
            mo74460a("data item not completed, stackSize: %s scope: %s", Integer.valueOf(this.f167373a.size()), Long.valueOf(mo74464d()));
        }
    }

    /* renamed from: b */
    public final void mo74461b() {
        long d = mo74464d();
        if (d == -1 || d == -2) {
            mo74460a("expected non-string scope but found %s", Long.valueOf(d));
        }
    }

    /* renamed from: d */
    public final long mo74464d() {
        if (!this.f167373a.isEmpty()) {
            return ((Long) this.f167373a.peek()).longValue();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo74458a(long j) {
        long d = mo74464d();
        if (d == j) {
            return;
        }
        if (d == -1 || d == -2) {
            mo74460a("expected non-string scope or scope %s but found %s", Long.valueOf(j), Long.valueOf(d));
        }
    }

    /* renamed from: c */
    public final void mo74463c() {
        long d = mo74464d();
        if (d == 1) {
            this.f167373a.pop();
        } else if (d > 1) {
            m125108c(d - 1);
        } else if (d == -4) {
            m125108c(-5);
        } else if (d == -5) {
            m125108c(-4);
        }
    }

    /* renamed from: b */
    public final void mo74462b(long j) {
        this.f167373a.push(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo74459a(String str) {
        if (this.f167374b) {
            throw new IllegalStateException(str);
        }
        throw new IOException(str);
    }

    /* renamed from: a */
    public final void mo74460a(String str, Object... objArr) {
        mo74459a(String.format(str, objArr));
    }
}
