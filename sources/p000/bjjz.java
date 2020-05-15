package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bjjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjjz {

    /* renamed from: a */
    final bjkb f122838a;

    /* renamed from: b */
    final bwxs f122839b;

    /* renamed from: c */
    bjjz f122840c;

    /* renamed from: d */
    ArrayList f122841d;

    /* renamed from: e */
    bjka f122842e;

    /* renamed from: f */
    bjka f122843f;

    /* renamed from: g */
    private int f122844g;

    public bjjz(bjkb bjkb, bwxs bwxs) {
        bjka bjka;
        bjka bjka2;
        bjkb bjkb2 = bjkb;
        bwxs bwxs2 = bwxs;
        this.f122838a = bjkb2;
        this.f122839b = bwxs2;
        if ((bwxs2.f161409a & 1) != 0) {
            bjjz a = bjkb2.mo65332a(bwxs2.f161410b);
            this.f122840c = a;
            a.m103743a(this);
        } else {
            this.f122840c = null;
        }
        bxwc bxwc = this.f122839b.f161411c;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bwxq bwxq = (bwxq) bxwc.get(i);
            bjkb bjkb3 = this.f122838a;
            bxwc bxwc2 = bwxq.f161404b;
            int size2 = bxwc2.size();
            int i2 = 0;
            while (true) {
                if (i2 < size2) {
                    bwww bwww = (bwww) bxwc2.get(i2);
                    List list = bjkb3.f122852d;
                    int size3 = list.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        bwww bwww2 = (bwww) list.get(i3);
                        int a2 = bwwv.m122382a(bwww.f161295b);
                        a2 = a2 == 0 ? 1 : a2;
                        int a3 = bwwv.m122382a(bwww2.f161295b);
                        boolean z = a2 == (a3 == 0 ? 1 : a3) && bwww.f161296c == bwww2.f161296c;
                        i3++;
                        int i4 = i2 + 1;
                        if (z) {
                            i2 = i4;
                        }
                    }
                    break;
                }
                int i5 = 0;
                for (bwxu bwxu : new bxvv(bwxq.f161405c, bwxq.f161400d)) {
                    i5 += bwxu.f161420g;
                }
                this.f122844g |= i5;
                bwxv bwxv = bwxq.f161406e;
                bwxv = bwxv == null ? bwxv.f161421d : bwxv;
                if ((bwxv.f161423a & 2) != 0) {
                    if (this.f122842e == null) {
                        bwym bwym = bwxv.f161425c;
                        bwym = bwym == null ? bwym.f161484n : bwym;
                        bjjz bjjz = this.f122840c;
                        if (bjjz != null) {
                            bjka2 = bjjz.mo65318a();
                        } else {
                            bjka2 = null;
                        }
                        this.f122842e = new bjka(bwym, bjka2);
                    }
                    bjka bjka3 = this.f122842e;
                    bwym bwym2 = bwxv.f161425c;
                    bjka3.mo65326a(bwym2 == null ? bwym.f161484n : bwym2, i5);
                }
                if ((bwxv.f161423a & 1) != 0) {
                    if (this.f122843f == null) {
                        bwxj bwxj = bwxv.f161424b;
                        bwxj = bwxj == null ? bwxj.f161360q : bwxj;
                        bjjz bjjz2 = this.f122840c;
                        if (bjjz2 != null) {
                            bjka = bjjz2.mo65320b();
                        } else {
                            bjka = null;
                        }
                        this.f122843f = new bjka(bwxj, bjka);
                    }
                    bjka bjka4 = this.f122843f;
                    bwxj bwxj2 = bwxv.f161424b;
                    bjka4.mo65326a(bwxj2 == null ? bwxj.f161360q : bwxj2, i5);
                }
            }
        }
        if (this.f122842e == null && this.f122840c == null) {
            this.f122842e = new bjka(bwym.f161484n, null);
        }
        if (this.f122843f == null && this.f122840c == null) {
            this.f122843f = new bjka(bwxj.f161360q, null);
        }
    }

    /* renamed from: a */
    private final void m103743a(bjjz bjjz) {
        if (this.f122841d == null) {
            this.f122841d = new ArrayList();
        }
        this.f122841d.add(bjjz);
    }

    /* renamed from: b */
    public final bjka mo65320b() {
        bjka bjka = this.f122843f;
        return bjka == null ? this.f122840c.mo65320b() : bjka;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo65321c() {
        if (this.f122840c == null) {
            bwxs bwxs = this.f122839b;
            if ((bwxs.f161409a & 1) != 0) {
                bjjz a = this.f122838a.mo65332a(bwxs.f161410b);
                this.f122840c = a;
                a.mo65321c();
                this.f122840c.m103743a(this);
                bjka bjka = this.f122842e;
                if (bjka != null) {
                    bjka.mo65325a(this.f122840c.mo65318a());
                }
                bjka bjka2 = this.f122843f;
                if (bjka2 != null) {
                    bjka2.mo65325a(this.f122840c.mo65320b());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo65322d() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f122841d;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((bjjz) arrayList2.get(i)).f122840c = null;
            }
            this.f122841d.clear();
        }
        bjjz bjjz = this.f122840c;
        if (!(bjjz == null || (arrayList = bjjz.f122841d) == null)) {
            arrayList.remove(this);
        }
        this.f122840c = null;
    }

    /* renamed from: a */
    public final bjka mo65318a() {
        bjka bjka = this.f122842e;
        return bjka == null ? this.f122840c.mo65318a() : bjka;
    }

    /* renamed from: a */
    public final boolean mo65319a(bwxu bwxu) {
        bjjz bjjz;
        return bjjo.m103696a(this.f122844g, bwxu) || ((bjjz = this.f122840c) != null && bjjz.mo65319a(bwxu));
    }
}
