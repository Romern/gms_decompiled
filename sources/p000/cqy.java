package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: cqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cqy {

    /* renamed from: a */
    private final Map f11869a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f11870b;

    /* renamed from: c */
    private long f11871c;

    public cqy(long j) {
        this.f11870b = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo3905a(Object obj) {
        return 1;
    }

    /* renamed from: a */
    public final synchronized long mo8171a() {
        return this.f11870b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3908a(Object obj, Object obj2) {
    }

    /* renamed from: b */
    public final synchronized Object mo8173b(Object obj) {
        cqx cqx;
        cqx = (cqx) this.f11869a.get(obj);
        return cqx != null ? cqx.f11867a : null;
    }

    /* renamed from: c */
    public final synchronized Object mo8176c(Object obj) {
        Object obj2;
        cqx cqx = (cqx) this.f11869a.remove(obj);
        if (cqx != null) {
            this.f11871c -= (long) cqx.f11868b;
            obj2 = cqx.f11867a;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    /* renamed from: b */
    public final synchronized Object mo8174b(Object obj, Object obj2) {
        cqx cqx;
        int a = mo3905a(obj2);
        long j = (long) a;
        if (j >= this.f11870b) {
            mo3908a(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f11871c += j;
        }
        Map map = this.f11869a;
        if (obj2 != null) {
            cqx = new cqx(obj2, a);
        } else {
            cqx = null;
        }
        cqx cqx2 = (cqx) map.put(obj, cqx);
        if (cqx2 != null) {
            this.f11871c -= (long) cqx2.f11868b;
            if (!cqx2.f11867a.equals(obj2)) {
                mo3908a(obj, cqx2.f11867a);
            }
        }
        mo8172a(this.f11870b);
        if (cqx2 == null) {
            return null;
        }
        return cqx2.f11867a;
    }

    /* renamed from: a */
    public final synchronized void mo8172a(long j) {
        while (this.f11871c > j) {
            Iterator it = this.f11869a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            cqx cqx = (cqx) entry.getValue();
            this.f11871c -= (long) cqx.f11868b;
            Object key = entry.getKey();
            it.remove();
            mo3908a(key, cqx.f11867a);
        }
    }

    /* renamed from: b */
    public final void mo8175b() {
        mo8172a(0);
    }
}
