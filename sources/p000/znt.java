package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: znt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class znt implements zns {

    /* renamed from: b */
    private final Map f55570b = new HashMap();

    /* renamed from: c */
    private final Context f55571c;

    /* renamed from: d */
    private final ytp f55572d;

    /* renamed from: e */
    private final bxvd f55573e = bpgs.f137551i.mo74144da();

    public znt(Context context, ytp ytp) {
        this.f55571c = context;
        this.f55572d = ytp;
    }

    /* renamed from: a */
    public final void mo31276a(int i) {
        bxvd bxvd = this.f55573e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgs bpgs = (bpgs) bxvd.f164949b;
        bpgs bpgs2 = bpgs.f137551i;
        bpgs.f137553a |= 4;
        bpgs.f137557e = i;
    }

    /* renamed from: a */
    public final boolean mo31280a() {
        return true;
    }

    /* renamed from: b */
    public final void mo31281b(int i) {
        bxvd bxvd = this.f55573e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgs bpgs = (bpgs) bxvd.f164949b;
        bpgs bpgs2 = bpgs.f137551i;
        bpgs.f137553a |= 1;
        bpgs.f137555c = i;
    }

    /* renamed from: c */
    public final void mo31283c(int i) {
        bxvd bxvd = this.f55573e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgs bpgs = (bpgs) bxvd.f164949b;
        bpgs bpgs2 = bpgs.f137551i;
        bpgs.f137553a |= 2;
        bpgs.f137556d = i;
    }

    /* renamed from: d */
    public final void mo31284d(int i) {
        bxvd bxvd = this.f55573e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgs bpgs = (bpgs) bxvd.f164949b;
        bpgs bpgs2 = bpgs.f137551i;
        bpgs.f137553a |= 16;
        bpgs.f137558f = i;
    }

    /* renamed from: a */
    public final void mo31277a(caah caah, int i, int i2) {
        bxvd bxvd;
        if (this.f55570b.containsKey(caah)) {
            bxvd = (bxvd) this.f55570b.get(caah);
        } else {
            bxvd da = bpgt.f137561e.mo74144da();
            bzzv a = bzzk.m126356a(caah.f172336b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpgt bpgt = (bpgt) da.f164949b;
            bpgt.f137564b = a.f172235aH;
            bpgt.f137563a |= 1;
            this.f55570b.put(caah, da);
            bxvd = da;
        }
        int i3 = ((bpgt) bxvd.f164949b).f137565c + i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgt bpgt2 = (bpgt) bxvd.f164949b;
        bpgt bpgt3 = bpgt.f137561e;
        int i4 = bpgt2.f137563a | 2;
        bpgt2.f137563a = i4;
        bpgt2.f137565c = i3;
        int i5 = bpgt2.f137566d;
        bpgt2.f137563a = i4 | 4;
        bpgt2.f137566d = i5 + i2;
    }

    /* renamed from: b */
    public final void mo31282b(boolean z) {
        bxvd bxvd = this.f55573e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgs bpgs = (bpgs) bxvd.f164949b;
        bpgs bpgs2 = bpgs.f137551i;
        bpgs.f137553a |= 32;
        bpgs.f137559g = z;
    }

    /* renamed from: a */
    public final void mo31278a(String str, long j) {
        for (bxvd bxvd : this.f55570b.values()) {
            bxvd bxvd2 = this.f55573e;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpgs bpgs = (bpgs) bxvd2.f164949b;
            bpgt bpgt = (bpgt) bxvd.mo74062i();
            bpgs bpgs2 = bpgs.f137551i;
            bpgt.getClass();
            if (!bpgs.f137554b.mo73666a()) {
                bpgs.f137554b = bxvk.m124021a(bpgs.f137554b);
            }
            bpgs.f137554b.add(bpgt);
        }
        ytq a = this.f55572d.mo30767a(this.f55571c);
        a.mo30755a(417);
        a.mo30762a(str);
        a.mo30756a(j);
        a.mo30759a((bpgs) this.f55573e.mo74062i());
        a.mo30754a();
    }

    /* renamed from: a */
    public final void mo31279a(boolean z) {
        bxvd bxvd = this.f55573e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgs bpgs = (bpgs) bxvd.f164949b;
        bpgs bpgs2 = bpgs.f137551i;
        bpgs.f137553a |= 64;
        bpgs.f137560h = z;
    }
}
