package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: yob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yob extends yll {

    /* renamed from: c */
    private final yix f54261c;

    /* renamed from: d */
    private final yjw f54262d = new yjw(1);

    /* renamed from: e */
    private final yfr f54263e;

    /* renamed from: f */
    private final float f54264f;

    public yob(yoa yoa) {
        super(yoa);
        yix yix = yoa.f54256a;
        bmxy.m108581a(yix);
        this.f54261c = yix;
        this.f54264f = yoa.f54260e;
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b("com.google.distance.delta");
        a.mo30420a(yfl.f53726a);
        a.mo30419a(bzzr.m126369a(this.f53897b.mo30613a("from_steps"), yoa.f54257b));
        this.f54263e = a.mo30415a();
    }

    /* renamed from: b */
    public final String mo30564b() {
        return "DistanceFromStepsTransformation";
    }

    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f54263e;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.Set, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        float f;
        bngx bngx;
        yhu yhu;
        float f2;
        int i;
        List list2 = list;
        yhg yhg2 = yhg;
        ygx a = yjy.m44261a(list2, "com.google.step_count.delta");
        if (a == null) {
            return yhy.m44167a(this.f54263e).mo30520b();
        }
        bngx a2 = yjy.m44257a(yjy.m44261a(list2, "com.google.activity.segment"));
        bngx a3 = yjy.m44257a(yjy.m44261a(list2, "com.google.height"));
        if (list.size() > 3) {
            ypq.m44538a("Input contains more than 4 data streams", Level.FINE, "Input contains more than 4 data streams", new Object[0]);
        }
        yhx a4 = yhy.m44167a(this.f54263e);
        yhu yhu2 = (yhu) bnjd.m109589b(a3, (Object) null);
        if (yhu2 != null) {
            f = yhu2.mo30510b(0);
        } else {
            f = 1.7f;
        }
        yhx a5 = yjy.m44266a(yhy, a.mo30474b());
        yhu yhu3 = (yhu) bnjd.m109589b(a2, (Object) null);
        if (yhu3 == null) {
            yfw yfw = (yfw) yhg2;
            bngx = bngx.m109356a(ynz.m44470a(yfw.f53737a, yfw.f53738b, 7));
        } else {
            bnqr bnqr = new bnqr();
            yfw yfw2 = (yfw) yhg2;
            if (yfw2.f53737a < yhu3.mo30385a()) {
                bnqr.mo68343b(bnoa.m109932b(Long.valueOf(yfw2.f53737a), Long.valueOf(yhu3.mo30385a())), 7);
            }
            int size = a2.size();
            int i2 = 0;
            while (i2 < size) {
                yhu yhu4 = (yhu) a2.get(i2);
                if (yhu3.mo30387b() < yhu4.mo30385a()) {
                    bnqr.mo68343b(bnoa.m109932b(Long.valueOf(yhu3.mo30387b()), Long.valueOf(yhu4.mo30385a())), 7);
                }
                bnoa b = bnoa.m109932b(Long.valueOf(yhu4.mo30385a()), Long.valueOf(yhu4.mo30387b()));
                if (ygv.f53773c.mo30462a(yhu4.mo30511d()) || yhu4.mo30517j() != 3) {
                    i = yhu4.mo30517j();
                } else {
                    i = 7;
                }
                bnqr.mo68343b(b, Integer.valueOf(i));
                i2++;
                yhu3 = yhu4;
            }
            if (yhu3.mo30387b() < yfw2.f53738b) {
                bnqr.mo68343b(bnoa.m109932b(Long.valueOf(yhu3.mo30387b()), Long.valueOf(yfw2.f53738b)), 7);
            }
            bngx = bngx.m109355a(bnjd.m109575a((Iterable) bnqr.mo68341a().entrySet(), yny.f54255a));
        }
        bnjq h = bnjr.m109626h(this.f54262d.mo30579a(a.mo30473a(), bngx, yhg2, a5).iterator());
        bnre i3 = bngx.listIterator();
        while (i3.hasNext()) {
            ynz ynz = (ynz) i3.next();
            if (!yfp.m43967a(ynz, yhg2)) {
                while (true) {
                    if (!h.hasNext() || yfp.m43976d((yhg) h.mo67862a(), ynz)) {
                        yhu = null;
                    } else {
                        yhu = (yhu) h.next();
                        if (yfp.m43975c(yhu, ynz)) {
                            continue;
                        } else if (!yfp.m43977e(yhu, ynz)) {
                            ypq.m44539a("Unaligned step delta data.  Step delta: %s activity segment: %s", yhu, ynz);
                        }
                    }
                    if (yhu != null) {
                        if (yfp.m43973b(yhu, yhg2)) {
                            long a6 = yhf.m44092a(yhu);
                            int j = yhu.mo30517j();
                            int d = ynz.mo30631d();
                            if (yix.m44207a(d)) {
                                float f3 = (float) j;
                                f2 = this.f54261c.mo30551a(d, f3 / (((float) a6) / ((float) TimeUnit.SECONDS.toNanos(1))), f) * f3;
                            } else {
                                f2 = 0.0f;
                            }
                            yfr d2 = yhu.mo30511d();
                            long seconds = TimeUnit.NANOSECONDS.toSeconds(yhf.m44092a(yhu));
                            if (seconds == 0) {
                                ypq.m44538a("Too short duration for activity segment [%s]", Level.FINE, "Too short duration for activity segment [%s]", yhu);
                            } else {
                                float f4 = f2 / ((float) seconds);
                                if (f4 < this.f54264f) {
                                    ypq.m44538a("Speed %f less than minimum speed %f", Level.FINE, "Speed %f less than minimum speed %f", Float.valueOf(f4), Float.valueOf(this.f54264f));
                                } else {
                                    yht a7 = a4.mo30521c().mo30504a(yhu);
                                    a7.mo30506a(d2);
                                    a7.mo30503a().mo30432a((double) f2);
                                }
                            }
                        }
                    }
                    if (yhu == null) {
                        break;
                    }
                }
            }
        }
        return a4.mo30520b();
    }
}
