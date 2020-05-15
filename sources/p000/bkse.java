package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: bkse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bkse {

    /* renamed from: a */
    protected final bksm f125203a;

    /* renamed from: b */
    final bkqy f125204b;

    /* renamed from: c */
    final bkqw f125205c;

    /* renamed from: d */
    protected final bksc f125206d;

    /* renamed from: e */
    private boolean f125207e;

    public bkse(bksm bksm, bkqy bkqy, bkqw bkqw, boolean z) {
        this.f125203a = bksm;
        this.f125204b = bkqy;
        this.f125205c = bkqw;
        this.f125206d = new bksc(z);
    }

    /* renamed from: a */
    public abstract bkqi mo66314a();

    /* renamed from: a */
    public abstract bkqi mo66315a(blhg blhg);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo66316a(bkqo bkqo);

    /* renamed from: a */
    public abstract void mo66317a(String str, bksd bksd);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66318a(String str, blhg blhg) {
        Map b = this.f125203a.mo66335b(str);
        if (!b.isEmpty()) {
            ArrayList arrayList = new ArrayList(b.values());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bkqt bkqt = (bkqt) arrayList.get(i);
                mo66316a(bkqt);
                this.f125203a.mo66331a(bkqt.mo66247d(), true);
                ((bksk) bkqt).mo66295a(blhg, this.f125205c, this.f125206d);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo66319b(blhg blhg);

    /* renamed from: b */
    public abstract boolean mo66320b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo66321c() {
        bkww.m106783b(!this.f125207e, "Already committed this change.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo66322c(blhg blhg);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo66323d() {
        this.f125207e = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo66325e(blhg blhg) {
        mo66326f(blhg);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo66326f(blhg blhg) {
        mo66319b(blhg);
        String str = blhg.f126523c;
        bksb a = this.f125203a.mo66331a(str, true);
        if (a != null) {
            mo66316a(a);
            int l = a.mo66255l();
            a.mo66295a(blhg, this.f125205c, this.f125206d);
            int l2 = a.mo66255l();
            mo66318a(str, blhg);
            this.f125203a.f125222f += l2 - l;
            mo66322c(blhg);
            return;
        }
        String valueOf = String.valueOf(blhg);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(valueOf).length());
        sb.append("No object with ID ");
        sb.append(str);
        sb.append(" when applying: ");
        sb.append(valueOf);
        throw new bkrh(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo66324d(blhg blhg) {
        bksb bksb;
        int i;
        Integer num;
        blhg blhg2 = blhg;
        blhf blhf = blhf.KIND_NOT_SET;
        boolean z = false;
        int i2 = 0;
        switch (blhg2.f126522b.ordinal()) {
            case 0:
                return;
            case 1:
                String str = blhg2.f126523c;
                blgr a = blhg.mo66530a();
                bksb a2 = this.f125203a.mo66330a(str);
                if (a2 != null) {
                    mo66324d(a2.mo66252i());
                } else {
                    bksm bksm = this.f125203a;
                    if (bksm.mo66330a(str) == null) {
                        z = true;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
                    sb.append("Object with ID ");
                    sb.append(str);
                    sb.append(" already exists.");
                    bkww.m106783b(z, sb.toString());
                    bksr bksr = bksm.f125218b;
                    blhn c = blhp.m107177c();
                    c.mo66552a(str);
                    blhp a3 = c.mo66550a();
                    blgq blgq = blgq.KIND_NOT_SET;
                    int ordinal = a.f126464b.ordinal();
                    if (ordinal == 1) {
                        bksb = new bksi(bksr.f125240a, a3);
                    } else if (ordinal == 2) {
                        bksb = new bksh(bksr.f125240a, a3);
                    } else if (ordinal == 3) {
                        bksb = new bksj(bksr.f125240a, a3);
                    } else if (ordinal == 4) {
                        bksb = new bksk(bksr.f125240a, a3);
                    } else if (ordinal == 5) {
                        bksb = new bksv(a.mo66505a().f126529b, bksr.f125240a, a3);
                    } else {
                        throw new bkrm(bksz.m106570a("", a));
                    }
                    bksm.f125220d.put(str, bksb);
                    bksm.f125222f += bksb.mo66255l();
                }
                mo66322c(blhg);
                return;
            case 2:
                String str2 = blhg2.f126523c;
                if (!str2.equals("root")) {
                    for (String str3 : this.f125203a.mo66332a()) {
                        this.f125203a.mo66330a(str3).mo66298a(str2, this.f125205c, this.f125206d);
                    }
                    bksm bksm2 = this.f125203a;
                    bksm2.mo66336d();
                    bksm2.f125220d.remove(str2);
                    mo66322c(blhg);
                    return;
                }
                throw new bkrl("The root object can not be destroyed.");
            case 3:
            case 6:
            case 7:
            case 9:
                mo66326f(blhg);
                return;
            case 4:
            default:
                throw new AssertionError();
            case 5:
                mo66325e(blhg);
                return;
            case 8:
                mo66319b(blhg);
                blhd f = blhg.mo66536f();
                String str4 = blhg2.f126523c;
                String str5 = f.f126502d;
                bksh bksh = (bksh) this.f125203a.mo66331a(str4, true);
                bksh bksh2 = (bksh) this.f125203a.mo66331a(str5, true);
                mo66316a(bksh);
                mo66316a(bksh2);
                if (bksh2 != null) {
                    bkqw bkqw = this.f125205c;
                    bksc bksc = this.f125206d;
                    bksh2.mo66305q();
                    blhd f2 = blhg.mo66536f();
                    int i3 = f2.f126501c;
                    int i4 = f2.f126500b;
                    bksh bksh3 = (bksh) bksh2.f125189b.mo66329b(blhg2.f126523c);
                    ArrayList arrayList = new ArrayList(bksh3.f125210c.subList(i4, i4 + 1));
                    bksh2.f125210c.addAll(f2.f126501c, arrayList);
                    int size = arrayList.size();
                    for (i2++; i2 < size; i2++) {
                        blhp blhp = (blhp) arrayList.get(i2);
                        bksh2.f125211d += bkta.m106585a(blhp);
                        bksh2.mo66297a(blhp);
                    }
                    if (bksc.f125195a) {
                        bksc.mo66309a(new bkrt(bksh2, bkqw, bksc.mo66313d(), i3, arrayList, bksh3, Integer.valueOf(i4)));
                    }
                }
                bkqw bkqw2 = this.f125205c;
                bksc bksc2 = this.f125206d;
                bksh.mo66305q();
                blhd f3 = blhg.mo66536f();
                int i5 = f3.f126500b;
                int i6 = f3.f126501c;
                String str6 = f3.f126502d;
                if (str6.equals(blhg2.f126523c) && i6 < i5) {
                    i = i5 + 1;
                } else {
                    i = i5;
                }
                List<blhp> subList = bksh.f125210c.subList(i, i + 1);
                if (bksc2.f125195a) {
                    bkqm bkqm = (bkqm) bksh.f125189b.mo66329b(str6);
                    ArrayList arrayList2 = new ArrayList(subList);
                    List d = bksc2.mo66313d();
                    if (bkqm != null) {
                        num = Integer.valueOf(i6);
                    } else {
                        num = null;
                    }
                    bksc2.mo66309a(new bkru(bksh, bkqw2, d, i, arrayList2, bkqm, num));
                }
                for (blhp blhp2 : subList) {
                    bksh.f125211d -= bkta.m106585a(blhp2);
                    bksh.mo66300b(blhp2);
                }
                subList.clear();
                if (!str5.equals(str4)) {
                    mo66318a(str5, blhg2);
                }
                mo66318a(str4, blhg2);
                mo66322c(blhg);
                return;
            case 10:
                blgo h = blhg.mo66538h();
                this.f125206d.mo66310a(h.f126451b);
                for (blhg blhg3 : h.mo66501a()) {
                    mo66324d(blhg3);
                }
                this.f125206d.mo66312c();
                return;
        }
    }
}
