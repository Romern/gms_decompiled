package p000;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0915ct extends AbstractList {

    /* renamed from: a */
    private final AtomicBoolean f11994a = new AtomicBoolean(false);

    /* renamed from: i */
    final Executor f11995i;

    /* renamed from: j */
    final Executor f11996j;

    /* renamed from: k */
    final C0913cs f11997k;

    /* renamed from: l */
    final C0918cw f11998l;

    /* renamed from: m */
    int f11999m = 0;

    /* renamed from: n */
    public int f12000n = Integer.MAX_VALUE;

    /* renamed from: o */
    public int f12001o = Integer.MIN_VALUE;

    /* renamed from: p */
    public final ArrayList f12002p = new ArrayList();

    public C0915ct(C0918cw cwVar, Executor executor, Executor executor2, C0913cs csVar) {
        this.f11998l = cwVar;
        this.f11995i = executor;
        this.f11996j = executor2;
        this.f11997k = csVar;
        int i = csVar.f11904b;
        int i2 = csVar.f11903a;
    }

    /* renamed from: a */
    public abstract void mo3637a(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8240a(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f12002p.size() - 1; size >= 0; size--) {
                C0911cq cqVar = (C0911cq) ((WeakReference) this.f12002p.get(size)).get();
                if (cqVar != null) {
                    cqVar.mo8128a(i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public abstract void mo3638a(C0915ct ctVar, C0911cq cqVar);

    /* renamed from: b */
    public final void mo8243b(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
        }
        this.f11999m = this.f11998l.f12223e + i;
        mo3637a(i);
        this.f12000n = Math.min(this.f12000n, i);
        this.f12001o = Math.max(this.f12001o, i);
    }

    /* renamed from: c */
    public abstract boolean mo3640c();

    /* renamed from: d */
    public abstract C0077cf mo3641d();

    /* renamed from: e */
    public abstract Object mo3642e();

    /* renamed from: f */
    public boolean mo8245f() {
        return mo8248h();
    }

    /* renamed from: g */
    public final List mo8246g() {
        return !mo8245f() ? new C0923da(this) : this;
    }

    public final Object get(int i) {
        return this.f11998l.get(i);
    }

    /* renamed from: h */
    public boolean mo8248h() {
        return this.f11994a.get();
    }

    /* renamed from: i */
    public final void mo8249i() {
        this.f11994a.set(true);
    }

    public final int size() {
        return this.f11998l.size();
    }

    /* renamed from: a */
    public final void mo8241a(C0911cq cqVar) {
        for (int size = this.f12002p.size() - 1; size >= 0; size--) {
            C0911cq cqVar2 = (C0911cq) ((WeakReference) this.f12002p.get(size)).get();
            if (cqVar2 == null || cqVar2 == cqVar) {
                this.f12002p.remove(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8244b(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f12002p.size() - 1; size >= 0; size--) {
                C0911cq cqVar = (C0911cq) ((WeakReference) this.f12002p.get(size)).get();
                if (cqVar != null) {
                    cqVar.mo8129b(i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8242a(List list, C0911cq cqVar) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                mo3638a((C0915ct) list, cqVar);
            } else if (!this.f11998l.isEmpty()) {
                cqVar.mo8128a(0, this.f11998l.size());
            }
        }
        for (int size = this.f12002p.size() - 1; size >= 0; size--) {
            if (((C0911cq) ((WeakReference) this.f12002p.get(size)).get()) == null) {
                this.f12002p.remove(size);
            }
        }
        this.f12002p.add(new WeakReference(cqVar));
    }
}
