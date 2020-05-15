package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: cjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cjz {

    /* renamed from: a */
    private static final cjq f6967a = new cjx();

    /* renamed from: b */
    private final List f6968b = new ArrayList();

    /* renamed from: c */
    private final Set f6969c = new HashSet();

    /* renamed from: d */
    private final C1241og f6970d;

    /* renamed from: a */
    private final cjq m4383a(cjy cjy) {
        cjq a = cjy.f6965b.mo3929a(this);
        crb.m7382a(a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized List mo3957b(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List list = this.f6968b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cjy cjy = (cjy) list.get(i);
            if (!arrayList.contains(cjy.f6964a) && cjy.mo3953a(cls)) {
                arrayList.add(cjy.f6964a);
            }
        }
        return arrayList;
    }

    public cjz(C1241og ogVar) {
        this.f6970d = ogVar;
    }

    /* renamed from: a */
    public final synchronized cjq mo3954a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (cjy cjy : this.f6968b) {
                if (this.f6969c.contains(cjy)) {
                    z = true;
                } else if (cjy.mo3953a(cls) && cjy.f6964a.isAssignableFrom(cls2)) {
                    this.f6969c.add(cjy);
                    arrayList.add(m4383a(cjy));
                    this.f6969c.remove(cjy);
                }
            }
            if (arrayList.size() > 1) {
                return new cjw(arrayList, this.f6970d);
            } else if (arrayList.size() == 1) {
                return (cjq) arrayList.get(0);
            } else if (z) {
                return f6967a;
            } else {
                throw new cbv(cls, cls2);
            }
        } catch (Throwable th) {
            this.f6969c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized List mo3955a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (cjy cjy : this.f6968b) {
                if (!this.f6969c.contains(cjy) && cjy.mo3953a(cls)) {
                    this.f6969c.add(cjy);
                    arrayList.add(m4383a(cjy));
                    this.f6969c.remove(cjy);
                }
            }
        } catch (Throwable th) {
            this.f6969c.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo3956a(Class cls, Class cls2, cjr cjr) {
        cjy cjy = new cjy(cls, cls2, cjr);
        List list = this.f6968b;
        list.add(list.size(), cjy);
    }
}
