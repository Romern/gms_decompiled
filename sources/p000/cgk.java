package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cgk implements cfb, cds {

    /* renamed from: a */
    private final cfa f6795a;

    /* renamed from: b */
    private final cfc f6796b;

    /* renamed from: c */
    private int f6797c;

    /* renamed from: d */
    private int f6798d = -1;

    /* renamed from: e */
    private cdg f6799e;

    /* renamed from: f */
    private List f6800f;

    /* renamed from: g */
    private int f6801g;

    /* renamed from: h */
    private volatile cjp f6802h;

    /* renamed from: i */
    private File f6803i;

    /* renamed from: j */
    private cgl f6804j;

    public cgk(cfc cfc, cfa cfa) {
        this.f6796b = cfc;
        this.f6795a = cfa;
    }

    /* renamed from: c */
    private final boolean m4193c() {
        return this.f6801g < this.f6800f.size();
    }

    /* renamed from: a */
    public final void mo3761a(Exception exc) {
        this.f6795a.mo3792a(this.f6804j, exc, this.f6802h.f6950c, 4);
    }

    /* renamed from: b */
    public final void mo3789b() {
        cjp cjp = this.f6802h;
        if (cjp != null) {
            cjp.f6950c.mo3754c();
        }
    }

    /* renamed from: a */
    public final void mo3762a(Object obj) {
        this.f6795a.mo3793a(this.f6799e, obj, this.f6802h.f6950c, 4, this.f6804j);
    }

    /* renamed from: a */
    public final boolean mo3788a() {
        List list;
        List d = this.f6796b.mo3802d();
        boolean z = false;
        if (d.isEmpty()) {
            return false;
        }
        cfc cfc = this.f6796b;
        cby cby = cfc.f6651c.f6425c;
        Class<?> cls = cfc.f6652d.getClass();
        Class cls2 = cfc.f6655g;
        Class cls3 = cfc.f6658j;
        cpp cpp = cby.f6442g;
        cra cra = (cra) cpp.f11778a.getAndSet(null);
        if (cra == null) {
            cra = new cra(cls, cls2, cls3);
        } else {
            cra.mo8183a(cls, cls2, cls3);
        }
        synchronized (cpp.f11779b) {
            list = (List) cpp.f11779b.get(cra);
        }
        cpp.f11778a.set(cra);
        if (list == null) {
            list = new ArrayList();
            for (Class cls4 : cby.f6436a.mo3949a(cls)) {
                List b = cby.f6438c.mo8092b(cls4, cls2);
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    Class cls5 = (Class) b.get(i);
                    if (!cby.f6441f.mo4036b(cls5, cls3).isEmpty() && !list.contains(cls5)) {
                        list.add(cls5);
                    }
                }
            }
            cpp cpp2 = cby.f6442g;
            List unmodifiableList = Collections.unmodifiableList(list);
            synchronized (cpp2.f11779b) {
                cpp2.f11779b.put(new cra(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (!list.isEmpty()) {
            while (true) {
                if (this.f6800f != null && m4193c()) {
                    this.f6802h = null;
                    while (!z && m4193c()) {
                        List list2 = this.f6800f;
                        int i2 = this.f6801g;
                        this.f6801g = i2 + 1;
                        File file = this.f6803i;
                        cfc cfc2 = this.f6796b;
                        this.f6802h = ((cjq) list2.get(i2)).mo3930a(file, cfc2.f6653e, cfc2.f6654f, cfc2.f6656h);
                        if (this.f6802h != null && this.f6796b.mo3797a(this.f6802h.f6950c.mo3747a())) {
                            this.f6802h.f6950c.mo3751a(this.f6796b.f6662n, this);
                            z = true;
                        }
                    }
                    return z;
                }
                int i3 = this.f6798d + 1;
                this.f6798d = i3;
                if (i3 >= list.size()) {
                    int i4 = this.f6797c + 1;
                    this.f6797c = i4;
                    if (i4 >= d.size()) {
                        return false;
                    }
                    this.f6798d = 0;
                }
                cdg cdg = (cdg) d.get(this.f6797c);
                Class cls6 = (Class) list.get(this.f6798d);
                cdo c = this.f6796b.mo3800c(cls6);
                cgr b2 = this.f6796b.mo3799b();
                cfc cfc3 = this.f6796b;
                this.f6804j = new cgl(b2, cdg, cfc3.f6661m, cfc3.f6653e, cfc3.f6654f, c, cls6, cfc3.f6656h);
                File a = this.f6796b.mo3795a().mo3902a(this.f6804j);
                this.f6803i = a;
                if (a != null) {
                    this.f6799e = cdg;
                    this.f6800f = this.f6796b.mo3796a(a);
                    this.f6801g = 0;
                }
            }
        } else if (File.class.equals(this.f6796b.f6658j)) {
            return false;
        } else {
            String valueOf = String.valueOf(this.f6796b.f6652d.getClass());
            String valueOf2 = String.valueOf(this.f6796b.f6658j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
            sb.append("Failed to find any load path from ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            throw new IllegalStateException(sb.toString());
        }
    }
}
