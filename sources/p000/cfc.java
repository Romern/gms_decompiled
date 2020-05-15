package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: cfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfc {

    /* renamed from: a */
    public final List f6649a = new ArrayList();

    /* renamed from: b */
    public final List f6650b = new ArrayList();

    /* renamed from: c */
    public cbr f6651c;

    /* renamed from: d */
    public Object f6652d;

    /* renamed from: e */
    public int f6653e;

    /* renamed from: f */
    public int f6654f;

    /* renamed from: g */
    public Class f6655g;

    /* renamed from: h */
    public cdk f6656h;

    /* renamed from: i */
    public Map f6657i;

    /* renamed from: j */
    public Class f6658j;

    /* renamed from: k */
    public boolean f6659k;

    /* renamed from: l */
    public boolean f6660l;

    /* renamed from: m */
    public cdg f6661m;

    /* renamed from: n */
    public cbs f6662n;

    /* renamed from: o */
    public cfn f6663o;

    /* renamed from: p */
    public boolean f6664p;

    /* renamed from: q */
    public boolean f6665q;

    /* renamed from: r */
    public cfs f6666r;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final chj mo3795a() {
        return this.f6666r.mo3821a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final cgg mo3798b(Class cls) {
        cgg cgg;
        cgg cgg2;
        cgg cgg3;
        int i;
        Class cls2 = cls;
        cby cby = this.f6651c.f6425c;
        Class cls3 = this.f6655g;
        Class cls4 = this.f6658j;
        cpo cpo = cby.f6443h;
        cra cra = (cra) cpo.f11777c.getAndSet(null);
        if (cra == null) {
            cra = new cra();
        }
        cra.mo8183a(cls2, cls3, cls4);
        synchronized (cpo.f11776b) {
            cgg = (cgg) cpo.f11776b.get(cra);
        }
        cpo.f11777c.set(cra);
        if (cpo.f11775a.equals(cgg)) {
            return null;
        }
        if (cgg != null) {
            return cgg;
        }
        ArrayList arrayList = new ArrayList();
        List b = cby.f6438c.mo8092b(cls2, cls3);
        int size = b.size();
        int i2 = 0;
        while (i2 < size) {
            Class cls5 = (Class) b.get(i2);
            List b2 = cby.f6441f.mo4036b(cls5, cls4);
            int size2 = b2.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 >= size2) {
                    break;
                }
                Class cls6 = (Class) b2.get(i3);
                arrayList.add(new cfj(cls, cls5, cls6, cby.f6438c.mo8089a(cls2, cls5), cby.f6441f.mo4034a(cls5, cls6), cby.f6444i));
                i3++;
                cls5 = cls5;
                i2 = i2;
                b2 = b2;
                size2 = size2;
            }
            i2 = i;
        }
        if (!arrayList.isEmpty()) {
            cgg2 = new cgg(cls, cls3, cls4, arrayList, cby.f6444i);
        } else {
            cgg2 = null;
        }
        cpo cpo2 = cby.f6443h;
        synchronized (cpo2.f11776b) {
            C1223np npVar = cpo2.f11776b;
            cra cra2 = new cra(cls2, cls3, cls4);
            if (cgg2 == null) {
                cgg3 = cpo.f11775a;
            } else {
                cgg3 = cgg2;
            }
            npVar.put(cra2, cgg3);
        }
        return cgg2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final cgr mo3799b() {
        return this.f6651c.f6424b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final cdo mo3800c(Class cls) {
        cdo cdo = (cdo) this.f6657i.get(cls);
        if (cdo == null) {
            Iterator it = this.f6657i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    cdo = (cdo) entry.getValue();
                    break;
                }
            }
        }
        if (cdo != null) {
            return cdo;
        }
        if (!this.f6657i.isEmpty() || !this.f6664p) {
            return cli.f7019b;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 115);
        sb.append("Missing transformation for ");
        sb.append(valueOf);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo3802d() {
        int i;
        if (!this.f6660l) {
            this.f6660l = true;
            this.f6650b.clear();
            List c = mo3801c();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                cjp cjp = (cjp) c.get(i2);
                if (!this.f6650b.contains(cjp.f6948a)) {
                    this.f6650b.add(cjp.f6948a);
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < cjp.f6949b.size()) {
                    if (!this.f6650b.contains(cjp.f6949b.get(i))) {
                        this.f6650b.add((cdg) cjp.f6949b.get(i));
                    }
                    i++;
                }
            }
        }
        return this.f6650b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo3796a(File file) {
        return this.f6651c.f6425c.mo3662a(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3797a(Class cls) {
        return mo3798b(cls) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List mo3801c() {
        if (!this.f6659k) {
            this.f6659k = true;
            this.f6649a.clear();
            List a = this.f6651c.f6425c.mo3662a(this.f6652d);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                cjp a2 = ((cjq) a.get(i)).mo3930a(this.f6652d, this.f6653e, this.f6654f, this.f6656h);
                if (a2 != null) {
                    this.f6649a.add(a2);
                }
            }
        }
        return this.f6649a;
    }
}
