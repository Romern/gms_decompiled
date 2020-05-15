package p000;

import android.content.Context;
import android.util.ArraySet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: aykd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aykd {

    /* renamed from: a */
    final Map f97822a = new HashMap();

    /* renamed from: b */
    final Set f97823b = ayka.m84135a(chpw.m149305d());

    /* renamed from: c */
    final Set f97824c = ayka.m84135a(chpw.m149304c());

    /* renamed from: d */
    final Set f97825d = ayka.m84135a(chpw.m149303b());

    /* renamed from: e */
    final Set f97826e = ayka.m84135a(chpw.m149306e());

    /* renamed from: f */
    final Set f97827f = new ArraySet();

    /* renamed from: g */
    final aykc f97828g;

    /* renamed from: h */
    final bnkd f97829h = bndu.m109109r();

    /* renamed from: i */
    final bnkd f97830i = bndu.m109109r();

    /* renamed from: j */
    final bnkd f97831j = bndu.m109109r();

    /* renamed from: k */
    final bnkd f97832k = bndu.m109108a(3, 100);

    /* renamed from: l */
    final bnkd f97833l = bndu.m109109r();

    /* renamed from: m */
    final bnkd f97834m = bndu.m109109r();

    /* renamed from: n */
    final bnkd f97835n = bndu.m109109r();

    /* renamed from: o */
    final bnkd f97836o = bndu.m109109r();

    /* renamed from: p */
    final bnkd f97837p = bndu.m109109r();

    /* renamed from: q */
    final bnkd f97838q = bndu.m109109r();

    /* renamed from: r */
    final bymq f97839r;

    /* renamed from: s */
    final Context f97840s;

    public aykd(bymq bymq, Context context, aykc aykc) {
        bymq bymq2 = bymq.f167050h;
        this.f97839r = bymq;
        this.f97840s = context;
        this.f97828g = aykc;
    }

    /* renamed from: a */
    private static void m84142a(Context context, long j) {
        aykk.m84185f(context).mo24387e("InvalidConfigMissingElements").mo24368a(j);
    }

    /* renamed from: b */
    public final void mo54052b(long j, bky bky) {
        bnkd bnkd = this.f97838q;
        Long valueOf = Long.valueOf(j);
        if (!bnkd.mo67309b(valueOf, Long.valueOf(bky.f5054b))) {
            ayka.m84138a((bxvd) this.f97822a.get(valueOf), bky);
            m84144a(this.f97835n.mo67124a(valueOf), bky);
            this.f97838q.mo67268a(valueOf, Long.valueOf(bky.f5054b));
        }
    }

    /* renamed from: c */
    public final void mo54054c(bxvd bxvd, long j, long j2) {
        for (bkp bkp : this.f97828g.f97819h.mo67124a(Long.valueOf(j))) {
            bxvd.mo73992a(bkp);
        }
        for (Long l : this.f97828g.f97817f.mo67124a(Long.valueOf(j))) {
            mo54053b(bxvd, l.longValue(), j2);
        }
    }

    /* renamed from: a */
    public static final void m84143a(bxvd bxvd, long j, bky bky) {
        bxwc bxwc = bky.f5070r;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bkp bkp = (bkp) bxwc.get(i);
            if (bkp.f5013a == j) {
                bxvd.mo73992a(bkp);
            }
        }
    }

    /* renamed from: b */
    public final void mo54053b(bxvd bxvd, long j, long j2) {
        Map map = this.f97828g.f97812a;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            m84142a(this.f97840s, j2);
        } else if (m84145a(bnon.f131923a, j, this.f97830i.mo67124a(Long.valueOf(((bky) bxvd.f164949b).f5054b)))) {
            bkf bkf = (bkf) this.f97828g.f97812a.get(valueOf);
            if (bkf.f4959a == 3) {
                for (Long l : this.f97828g.f97816e.mo67124a(valueOf)) {
                    mo54053b(bxvd, l.longValue(), j2);
                }
            }
            bxvd.mo73991a(bkf);
        }
    }

    /* renamed from: a */
    private static void m84144a(List list, bky bky) {
        bxvw bxvw = bky.f5067o;
        int size = bxvw.size();
        for (int i = 0; i < size; i++) {
            Long l = (Long) bxvw.get(i);
            if (!list.contains(l)) {
                list.add(l);
            }
        }
    }

    /* renamed from: a */
    public static boolean m84145a(Set set, long j, List list) {
        Long valueOf = Long.valueOf(j);
        if (list.contains(valueOf) || set.contains(valueOf)) {
            return false;
        }
        list.add(valueOf);
        return true;
    }

    /* renamed from: a */
    public final void mo54046a(long j) {
        boolean z;
        Map map = this.f97822a;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            bxvd da = bky.f5051v.mo74144da();
            if (chpj.m149279b()) {
                int f = (int) (((j - chpw.m149307f()) >> 12) & 1);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bky bky = (bky) da.f164949b;
                bky.f5053a |= 64;
                if (f == 0) {
                    z = false;
                } else {
                    z = true;
                }
                bky.f5071s = z;
            }
            this.f97822a.put(valueOf, da);
            if (chnv.m149212b()) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bky bky2 = (bky) da.f164949b;
                bky2.f5053a |= 1;
                bky2.f5054b = j;
            }
        }
    }

    /* renamed from: a */
    public final void mo54047a(long j, long j2, long j3) {
        bxvd bxvd = (bxvd) this.f97822a.get(Long.valueOf(j2));
        for (Long l : this.f97828g.f97818g.mo67124a(Long.valueOf(j3))) {
            long longValue = l.longValue();
            Map map = this.f97828g.f97814c;
            Long valueOf = Long.valueOf(longValue);
            if (!map.containsKey(valueOf)) {
                m84142a(this.f97840s, j);
            } else {
                if (m84145a(this.f97824c, longValue, this.f97831j.mo67124a(Long.valueOf(j2)))) {
                    bxvd.mo73990a((bkd) this.f97828g.f97814c.get(valueOf));
                }
                if (!this.f97824c.contains(valueOf)) {
                    for (blb blb : this.f97828g.f97820i.mo67124a(valueOf)) {
                        if (m84145a(this.f97826e, blb.f5079a, this.f97834m.mo67124a(Long.valueOf(j2))) && !this.f97824c.contains(Long.valueOf(longValue))) {
                            bxvd.mo73994a(blb);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54048a(long j, bky bky) {
        bnkd bnkd = this.f97838q;
        Long valueOf = Long.valueOf(j);
        if (!bnkd.mo67309b(valueOf, Long.valueOf(bky.f5054b))) {
            bxvd bxvd = (bxvd) this.f97822a.get(valueOf);
            ayka.m84138a(bxvd, bky);
            bxwc bxwc = bky.f5062j;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bks bks = (bks) bxwc.get(i);
                bnkd bnkd2 = this.f97829h;
                Long valueOf2 = Long.valueOf(j);
                if (!bnkd2.mo67309b(valueOf2, Long.valueOf(bks.f5031c))) {
                    bxvd.mo73993a(bks);
                    this.f97829h.mo67268a(valueOf2, Long.valueOf(bks.f5031c));
                }
            }
            bxwc bxwc2 = bky.f5061i;
            int size2 = bxwc2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bkf bkf = (bkf) bxwc2.get(i2);
                bnkd bnkd3 = this.f97830i;
                Long valueOf3 = Long.valueOf(j);
                if (!bnkd3.mo67309b(valueOf3, Long.valueOf(bkf.f4961c))) {
                    bxvd.mo73991a(bkf);
                    this.f97830i.mo67268a(valueOf3, Long.valueOf(bkf.f4961c));
                }
            }
            bxwc bxwc3 = bky.f5064l;
            int size3 = bxwc3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                bkc bkc = (bkc) bxwc3.get(i3);
                if (m84145a(this.f97825d, bkc.f4947a, this.f97833l.mo67124a(Long.valueOf(j)))) {
                    bxvd.mo73989a(bkc);
                }
            }
            bxwc bxwc4 = bky.f5065m;
            int size4 = bxwc4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                blb blb = (blb) bxwc4.get(i4);
                if (m84145a(this.f97826e, blb.f5079a, this.f97834m.mo67124a(Long.valueOf(j)))) {
                    bxvd.mo73994a(blb);
                }
            }
            bnkd bnkd4 = this.f97835n;
            Long valueOf4 = Long.valueOf(j);
            m84144a(bnkd4.mo67124a(valueOf4), bky);
            this.f97838q.mo67268a(valueOf4, Long.valueOf(bky.f5054b));
        }
    }

    /* renamed from: a */
    public final void mo54049a(bxvd bxvd, long j, long j2) {
        bkw bkw;
        bkw bkw2;
        bkw bkw3;
        bkw bkw4;
        Map map = this.f97828g.f97813b;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            m84142a(this.f97840s, j2);
        } else if (m84145a(bnon.f131923a, j, this.f97829h.mo67124a(Long.valueOf(((bky) bxvd.f164949b).f5054b)))) {
            bks bks = (bks) this.f97828g.f97813b.get(valueOf);
            if (bks.f5029a != 2) {
                for (Long l : this.f97828g.f97815d.mo67124a(valueOf)) {
                    mo54049a(bxvd, l.longValue(), j2);
                }
            } else {
                mo54053b(bxvd, ((bkw) bks.f5030b).f5043b, j2);
                if (bks.f5029a == 2) {
                    bkw = (bkw) bks.f5030b;
                } else {
                    bkw = bkw.f5040e;
                }
                if ((bkw.f5042a & 2) != 0) {
                    if (bks.f5029a == 2) {
                        bkw4 = (bkw) bks.f5030b;
                    } else {
                        bkw4 = bkw.f5040e;
                    }
                    mo54053b(bxvd, bkw4.f5044c, j2);
                }
                if (bks.f5029a == 2) {
                    bkw2 = (bkw) bks.f5030b;
                } else {
                    bkw2 = bkw.f5040e;
                }
                if ((bkw2.f5042a & 8) != 0) {
                    if (bks.f5029a == 2) {
                        bkw3 = (bkw) bks.f5030b;
                    } else {
                        bkw3 = bkw.f5040e;
                    }
                    mo54053b(bxvd, bkw3.f5045d, j2);
                }
            }
            bxvd.mo73993a(bks);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r0.f167055d != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (r5.f167055d != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0084, code lost:
        if (r5.f167053b == false) goto L_0x0087;
     */
    /* renamed from: a */
    public final boolean mo54050a(bkq bkq) {
        int a;
        if ((bkq.f5018a & 1) != 0 && !this.f97839r.f167053b) {
            int a2 = bkh.m3255a(bkq.f5019b);
            if (a2 != 0 && a2 == 2 && !this.f97839r.f167054c) {
                return false;
            }
            int a3 = bkh.m3255a(bkq.f5019b);
            if (a3 != 0 && a3 == 3) {
                if (!chob.m149222b()) {
                    bymq bymq = this.f97839r;
                    if (bymq.f167054c) {
                    }
                }
                return false;
            }
            if (chob.m149222b() && (a = bkh.m3255a(bkq.f5019b)) != 0 && a == 4) {
                bymq bymq2 = this.f97839r;
                if (!bymq2.f167054c || !bymq2.f167053b) {
                    return false;
                }
            }
        }
        if (chpz.m149332i() && (bkq.f5018a & 1) == 0) {
            if (!chob.m149222b()) {
                bymq bymq3 = this.f97839r;
                if (bymq3.f167054c) {
                }
            }
            if (chob.m149222b()) {
                bymq bymq4 = this.f97839r;
                if (bymq4.f167054c) {
                }
            }
            if (!this.f97839r.f167053b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo54051a(Set set, long j, bkq bkq, List list, List list2, List list3) {
        Long valueOf = Long.valueOf(j);
        if (!list2.contains(valueOf) && !list3.contains(valueOf)) {
            list3.add(valueOf);
        }
        if (set.contains(valueOf) || list.contains(valueOf)) {
            return false;
        }
        list.add(valueOf);
        return mo54050a(bkq);
    }
}
