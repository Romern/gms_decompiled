package p000;

import com.google.android.projection.common.BufferPool;
import java.util.ArrayDeque;

/* renamed from: nwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nwz {

    /* renamed from: a */
    public final ArrayDeque f36853a = new ArrayDeque(16);

    /* renamed from: b */
    private final int f36854b;

    static {
        odk.m28481a("CAR.AUDIO");
    }

    public nwz(int i) {
        this.f36854b = i;
    }

    /* renamed from: a */
    public final nwy mo21774a() {
        return new nwy(this.f36854b);
    }

    /* renamed from: b */
    public final synchronized nwy mo21776b() {
        return (nwy) this.f36853a.poll();
    }

    /* renamed from: c */
    public final synchronized void mo21778c() {
        while (!this.f36853a.isEmpty()) {
            mo21777b((nwy) this.f36853a.poll());
        }
    }

    /* renamed from: d */
    public final synchronized int mo21779d() {
        return this.f36853a.size();
    }

    /* renamed from: a */
    public final synchronized void mo21775a(nwy nwy) {
        this.f36853a.add(nwy);
    }

    /* renamed from: b */
    public final void mo21777b(nwy nwy) {
        BufferPool.m117794a(nwy.f36852b);
    }
}
