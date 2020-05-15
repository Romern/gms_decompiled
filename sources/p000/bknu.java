package p000;

import java.util.logging.Logger;

/* renamed from: bknu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bknu {

    /* renamed from: a */
    public static final Logger f124952a = Logger.getLogger("BrowserChannel");

    /* renamed from: b */
    public final bknt f124953b = new bknt(this);

    /* renamed from: c */
    public final bkns f124954c = new bkns(this);

    /* renamed from: d */
    public final bkoj f124955d;

    /* renamed from: e */
    public final bkpj f124956e;

    /* renamed from: f */
    public final bknr f124957f;

    /* renamed from: g */
    public boolean f124958g;

    /* renamed from: h */
    public int f124959h = 0;

    /* renamed from: i */
    public final bkoq f124960i;

    /* renamed from: j */
    public final bknx f124961j;

    /* renamed from: k */
    private bkoa f124962k = null;

    public bknu(bkoj bkoj, bkpj bkpj, bkoq bkoq, bknx bknx, bknr bknr) {
        this.f124955d = bkoj;
        this.f124956e = bkpj;
        this.f124960i = bkoq;
        this.f124961j = bknx;
        this.f124957f = bknr;
    }

    /* renamed from: a */
    public final synchronized void mo66144a() {
        if (this.f124959h == 0) {
            this.f124959h = 1;
            this.f124956e.mo28476a(bkpk.SUCCESS, this.f124953b);
        } else {
            throw new IllegalStateException("Cannot open the channel multiple times.");
        }
    }

    /* renamed from: b */
    public final synchronized void mo66146b() {
        if (this.f124959h != 3) {
            this.f124959h = 3;
            mo66145a(null);
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo66147c() {
        return this.f124959h == 3;
    }

    /* renamed from: a */
    public final synchronized void mo66145a(bkoa bkoa) {
        bkoa bkoa2 = this.f124962k;
        if (bkoa2 != null) {
            bkoa2.mo66148a();
        }
        this.f124962k = bkoa;
    }
}
