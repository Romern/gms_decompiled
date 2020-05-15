package p000;

import com.felicanetworks.mfc.Felica;

/* renamed from: buiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buiv implements bulo {

    /* renamed from: h */
    public static final bfni f153980h = new bfni(0, 0, 0);

    /* renamed from: a */
    public final bulp f153981a;

    /* renamed from: b */
    public final bukn f153982b;

    /* renamed from: c */
    public bukm f153983c;

    /* renamed from: d */
    public bujd f153984d;

    /* renamed from: e */
    public int f153985e = 100000;

    /* renamed from: f */
    public int f153986f = Felica.MAX_TIMEOUT;

    /* renamed from: g */
    public boolean f153987g = true;

    /* renamed from: i */
    public bumi f153988i = new bumi(null);

    public buiv(bulp bulp) {
        int i;
        int i2;
        this.f153981a = bulp;
        this.f153982b = new bukn();
        if (mo72715a()) {
            bulp bulp2 = this.f153981a;
            buki buki = bulp2.f154180u;
            long proksConfig = bulp2.f154166g.proksConfig() & 8;
            if (!buki.f154092e) {
                if (proksConfig == 0) {
                    i = 50;
                } else {
                    i = 300;
                }
                buki.f154089b = new bujz(i);
                buki.f154090c = new bujz(i);
                if (proksConfig == 0) {
                    i2 = 40;
                } else {
                    i2 = 100;
                }
                buki.f154091d = new bujz(i2);
                buki.f154092e = true;
            }
        }
        bulp.f154179t = this;
        bsax bsax = bulp.f154177r;
        if (bsax != null) {
            mo72714a(bsax);
        }
    }

    /* renamed from: a */
    public final void mo72714a(bsax bsax) {
        if (bsax.mo70137i(79)) {
            this.f153985e = bsax.mo70114b(79);
        }
        if (bsax.mo70137i(80)) {
            this.f153986f = bsax.mo70114b(80);
        }
        if (bsax.mo70137i(81)) {
            this.f153987g = bsax.mo70113a(81);
        }
    }

    /* renamed from: a */
    public final boolean mo72715a() {
        return (this.f153981a.f154166g.proksConfig() & 4) != 0;
    }
}
