package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bkmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkmx implements bknr, bkmz {

    /* renamed from: a */
    public final bknj f124911a;

    /* renamed from: b */
    public volatile long f124912b = 0;

    /* renamed from: c */
    public bknu f124913c;

    /* renamed from: d */
    private final Map f124914d = new HashMap();

    /* renamed from: e */
    private final bkoj f124915e;

    public bkmx(bknj bknj, String str, String str2) {
        this.f124911a = bknj;
        bkmu bkmu = new bkmu(this);
        bkoh a = bknj.mo66133a(str, str2);
        a.mo66164a(bkmu);
        this.f124915e = a.mo66163a();
    }

    /* renamed from: a */
    public final synchronized void mo66127a() {
        bknu bknu = this.f124913c;
        if (bknu != null) {
            bknu.mo66146b();
            this.f124913c = null;
        }
        bknu bknu2 = new bknu(this.f124915e, ((bknd) this.f124911a).f124920a, new bkoq(this.f124911a), new bknx(this.f124911a), this);
        this.f124913c = bknu2;
        bknu2.mo66144a();
    }

    /* renamed from: b */
    public final synchronized void mo66131b() {
        bknu bknu = this.f124913c;
        if (bknu != null) {
            bknu.mo66146b();
            this.f124913c = null;
        }
    }

    /* renamed from: c */
    public final synchronized void mo66132c() {
        if (this.f124913c == null) {
            mo66127a();
        }
    }

    /* renamed from: a */
    public final void mo66128a(int i, int i2) {
        if (this.f124913c != null) {
            if (i == 2) {
                this.f124911a.mo66135a(i2);
            }
            if (this.f124913c.mo66147c()) {
                ((bknd) this.f124911a).f124920a.mo28476a(i != 5 ? bkpk.FAILURE : bkpk.SUCCESS, new bkmw(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo66129a(Class cls, bkno bkno) {
        List list = (List) this.f124914d.get(cls);
        if (list == null) {
            list = new ArrayList();
            this.f124914d.put(cls, list);
        }
        list.add(bkno);
    }

    /* renamed from: a */
    public final void mo66130a(Object obj) {
        List<bkno> list;
        if (this.f124913c != null && (list = (List) this.f124914d.get(obj.getClass())) != null) {
            for (bkno bkno : list) {
                bkno.mo66110a(obj);
            }
        }
    }
}
