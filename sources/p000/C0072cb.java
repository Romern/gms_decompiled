package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: cb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0072cb extends C0915ct {

    /* renamed from: a */
    final C0067by f6371a;

    /* renamed from: b */
    int f6372b = 0;

    /* renamed from: c */
    int f6373c = 0;

    /* renamed from: d */
    int f6374d = 0;

    /* renamed from: e */
    int f6375e = 0;

    /* renamed from: f */
    boolean f6376f = false;

    /* renamed from: g */
    final boolean f6377g;

    /* renamed from: h */
    final C0085cn f6378h = new C0085cn(this);

    public C0072cb(C0067by byVar, Executor executor, Executor executor2, C0913cs csVar) {
        super(new C0918cw(), executor, executor2, csVar);
        this.f6371a = byVar;
        this.f11999m = -1;
        if (this.f6371a.mo3791c()) {
            mo8249i();
        } else {
            C0067by byVar2 = this.f6371a;
            C0913cs csVar2 = this.f11997k;
            int i = csVar2.f11907e;
            int i2 = csVar2.f11903a;
            boolean z = csVar2.f11905c;
            byVar2.mo3609a(i, this.f11995i, this.f6378h);
        }
        if (this.f6371a.mo3611a()) {
            int i3 = this.f11997k.f11906d;
        }
        this.f6377g = false;
    }

    /* renamed from: a */
    public final void mo3636a() {
        if (this.f6372b == 0) {
            this.f6372b = 1;
            C0918cw cwVar = this.f11998l;
            int i = cwVar.f12220b;
            int i2 = cwVar.f12223e;
            ((List) cwVar.f12221c.get(0)).get(0);
            this.f11996j.execute(new C0068bz(this));
        }
    }

    /* renamed from: b */
    public final void mo3639b() {
        if (this.f6373c == 0) {
            this.f6373c = 1;
            C0918cw cwVar = this.f11998l;
            int i = cwVar.f12220b;
            int i2 = cwVar.f12225g;
            int i3 = cwVar.f12223e;
            ArrayList arrayList = cwVar.f12221c;
            List list = (List) arrayList.get(arrayList.size() - 1);
            list.get(list.size() - 1);
            this.f11996j.execute(new C0070ca(this));
        }
    }

    /* renamed from: c */
    public final boolean mo3640c() {
        return true;
    }

    /* renamed from: d */
    public final C0077cf mo3641d() {
        return this.f6371a;
    }

    /* renamed from: e */
    public final Object mo3642e() {
        return this.f6371a.mo3612b();
    }

    /* renamed from: a */
    public final void mo3637a(int i) {
        int i2 = this.f11997k.f11904b;
        C0918cw cwVar = this.f11998l;
        int i3 = cwVar.f12220b;
        int i4 = (i + 11) - (cwVar.f12225g + i3);
        int max = Math.max(10 - (i - i3), this.f6374d);
        this.f6374d = max;
        if (max > 0) {
            mo3636a();
        }
        int max2 = Math.max(i4, this.f6375e);
        this.f6375e = max2;
        if (max2 > 0) {
            mo3639b();
        }
    }

    /* renamed from: a */
    public final void mo3638a(C0915ct ctVar, C0911cq cqVar) {
        C0918cw cwVar = ctVar.f11998l;
        C0918cw cwVar2 = this.f11998l;
        int i = cwVar2.f12228j - cwVar.f12228j;
        int i2 = cwVar2.f12227i - cwVar.f12227i;
        int i3 = cwVar.f12222d;
        int i4 = cwVar.f12220b;
        if (cwVar.isEmpty() || i < 0 || i2 < 0 || this.f11998l.f12222d != Math.max(i3 - i, 0) || this.f11998l.f12220b != Math.max(i4 - i2, 0) || this.f11998l.f12225g != cwVar.f12225g + i + i2) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (i != 0) {
            int min = Math.min(i3, i);
            int i5 = i - min;
            int i6 = cwVar.f12220b + cwVar.f12225g;
            if (min != 0) {
                cqVar.mo8129b(i6, min);
            }
            if (i5 != 0) {
                cqVar.mo8128a(i6 + min, i5);
            }
        }
        if (i2 != 0) {
            int min2 = Math.min(i4, i2);
            int i7 = i2 - min2;
            if (min2 != 0) {
                cqVar.mo8129b(i4, min2);
            }
            if (i7 != 0) {
                cqVar.mo8128a(0, i7);
            }
        }
    }
}
