package p000;

import java.util.List;
import java.util.Map;

/* renamed from: altx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class altx implements alua {

    /* renamed from: a */
    final amok f74274a;

    /* renamed from: b */
    final List f74275b;

    /* renamed from: c */
    private final String f74276c;

    public altx(String str, amok amok, List list) {
        this.f74276c = str;
        this.f74274a = amok;
        this.f74275b = list;
    }

    /* renamed from: a */
    public final int mo40779a() {
        amoi amoi = (amoi) amoj.f75618d.mo74144da();
        amok amok = this.f74274a;
        if (amoi.f164950c) {
            amoi.mo74035c();
            amoi.f164950c = false;
        }
        amoj amoj = (amoj) amoi.f164949b;
        amok.getClass();
        amoj.f75621b = amok;
        amoj.f75620a |= 1;
        amoi.mo41223a(this.f74275b);
        amoj amoj2 = (amoj) amoi.mo74062i();
        int i = amoj2.f164961ai;
        if (i != -1) {
            return i;
        }
        int b = bxxm.f165037a.mo74228a(amoj2).mo74223b(amoj2);
        amoj2.f164961ai = b;
        return b;
    }

    /* renamed from: b */
    public final String mo40781b() {
        return this.f74276c;
    }

    /* renamed from: c */
    public final Map mo40782c() {
        return bnoj.f131912b;
    }

    /* renamed from: a */
    public final byte[] mo40780a(int i) {
        amoi amoi = (amoi) amoj.f75618d.mo74144da();
        amok amok = this.f74274a;
        if (amoi.f164950c) {
            amoi.mo74035c();
            amoi.f164950c = false;
        }
        amoj amoj = (amoj) amoi.f164949b;
        amok.getClass();
        amoj.f75621b = amok;
        amoj.f75620a |= 1;
        amoj amoj2 = (amoj) amoi.mo74062i();
        int i2 = amoj2.f164961ai;
        if (i2 == -1) {
            i2 = bxxm.f165037a.mo74228a(amoj2).mo74223b(amoj2);
            amoj2.f164961ai = i2;
        }
        int i3 = 0;
        while (i3 < this.f74275b.size()) {
            amol amol = (amol) this.f74275b.get(i3);
            int i4 = amol.f164961ai;
            if (i4 == -1) {
                i4 = bxxm.f165037a.mo74228a(amol).mo74223b(amol);
                amol.f164961ai = i4;
            }
            i2 += i4;
            if (i2 > i) {
                break;
            }
            i3++;
        }
        amoi.mo41223a(this.f74275b.subList(0, i3));
        return ((amoj) amoi.mo74062i()).mo73642k();
    }
}
