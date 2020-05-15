package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: cjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cjv implements cdt, cds {

    /* renamed from: a */
    private final List f6955a;

    /* renamed from: b */
    private final C1241og f6956b;

    /* renamed from: c */
    private int f6957c = 0;

    /* renamed from: d */
    private cbs f6958d;

    /* renamed from: e */
    private cds f6959e;

    /* renamed from: f */
    private List f6960f;

    /* renamed from: g */
    private boolean f6961g;

    public cjv(List list, C1241og ogVar) {
        this.f6956b = ogVar;
        crb.m7385a((Collection) list);
        this.f6955a = list;
    }

    /* renamed from: e */
    private final void m4370e() {
        if (this.f6961g) {
            return;
        }
        if (this.f6957c < this.f6955a.size() - 1) {
            this.f6957c++;
            mo3751a(this.f6958d, this.f6959e);
            return;
        }
        crb.m7382a((Object) this.f6960f);
        this.f6959e.mo3761a((Exception) new cgd("Fetch failed", new ArrayList(this.f6960f)));
    }

    /* renamed from: a */
    public final Class mo3747a() {
        return ((cdt) this.f6955a.get(0)).mo3747a();
    }

    /* renamed from: b */
    public final void mo3753b() {
        List list = this.f6960f;
        if (list != null) {
            this.f6956b.mo8189a(list);
        }
        this.f6960f = null;
        List list2 = this.f6955a;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((cdt) list2.get(i)).mo3753b();
        }
    }

    /* renamed from: c */
    public final void mo3754c() {
        this.f6961g = true;
        List list = this.f6955a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cdt) list.get(i)).mo3754c();
        }
    }

    /* renamed from: d */
    public final int mo3755d() {
        return ((cdt) this.f6955a.get(0)).mo3755d();
    }

    /* renamed from: a */
    public final void mo3751a(cbs cbs, cds cds) {
        this.f6958d = cbs;
        this.f6959e = cds;
        this.f6960f = (List) this.f6956b.mo8188a();
        ((cdt) this.f6955a.get(this.f6957c)).mo3751a(cbs, this);
        if (this.f6961g) {
            mo3754c();
        }
    }

    /* renamed from: a */
    public final void mo3761a(Exception exc) {
        List list = this.f6960f;
        crb.m7382a((Object) list);
        list.add(exc);
        m4370e();
    }

    /* renamed from: a */
    public final void mo3762a(Object obj) {
        if (obj != null) {
            this.f6959e.mo3762a(obj);
        } else {
            m4370e();
        }
    }
}
