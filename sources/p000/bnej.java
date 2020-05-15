package p000;

import java.util.Map;

/* renamed from: bnej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnej extends bndi {

    /* renamed from: a */
    final /* synthetic */ bnel f131517a;

    /* renamed from: b */
    private final Object f131518b;

    /* renamed from: c */
    private int f131519c;

    public bnej(bnel bnel, int i) {
        this.f131517a = bnel;
        this.f131518b = bnel.f131524d[i];
        this.f131519c = i;
    }

    /* renamed from: a */
    private final void m109125a() {
        int i = this.f131519c;
        if (i == -1 || i >= this.f131517a.size() || !bmxi.m108538a(this.f131518b, this.f131517a.f131524d[this.f131519c])) {
            this.f131519c = this.f131517a.mo67421a(this.f131518b);
        }
    }

    public final Object getKey() {
        return this.f131518b;
    }

    public final Object getValue() {
        Map d = this.f131517a.mo67433d();
        if (d != null) {
            return d.get(this.f131518b);
        }
        m109125a();
        int i = this.f131519c;
        if (i != -1) {
            return this.f131517a.f131525e[i];
        }
        return null;
    }

    public final Object setValue(Object obj) {
        Map d = this.f131517a.mo67433d();
        if (d != null) {
            return d.put(this.f131518b, obj);
        }
        m109125a();
        int i = this.f131519c;
        if (i == -1) {
            this.f131517a.put(this.f131518b, obj);
            return null;
        }
        Object[] objArr = this.f131517a.f131525e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
