package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: ypx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ypx extends yiy {

    /* renamed from: c */
    private static final long f54364c = TimeUnit.MINUTES.toNanos(1);

    /* renamed from: d */
    private final long f54365d;

    /* renamed from: e */
    private final long f54366e;

    /* renamed from: f */
    private final long f54367f;

    /* renamed from: g */
    private final float f54368g;

    /* renamed from: h */
    private final float f54369h;

    public ypx(ypw ypw) {
        super(ypw);
        this.f54365d = ypw.f54362d;
        this.f54366e = ypw.f54363e;
        this.f54367f = ypw.f54359a;
        this.f54368g = ypw.f54360b;
        this.f54369h = ypw.f54361c;
    }

    /* renamed from: a */
    private final yfr m44556a(String str, caaq caaq) {
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b("com.google.step_count.delta");
        a.mo30420a(yfl.f53726a);
        a.mo30419a(bzzr.m126369a(this.f53897b.mo30613a("derive_step_deltas"), str));
        if (caaq != null) {
            a.mo30418a(caaq);
        }
        return a.mo30415a();
    }

    /* renamed from: b */
    public final String mo30564b() {
        return "DeriveStepDeltas";
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0246  */
    /* renamed from: e */
    public final List mo30571e(List list, yhg yhg, yhy yhy) {
        int i;
        ygx ygx;
        long j;
        long j2;
        yjz yjz;
        long j3;
        long j4;
        yhu yhu;
        int i2;
        int i3;
        ygx ygx2;
        Level level;
        ypx ypx = this;
        yhg yhg2 = yhg;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            ygx ygx3 = (ygx) list.get(i4);
            yhx a = yhy.m44168a(ypx.m44556a(ygx3.mo30474b().mo30425e(), ygx3.mo30474b().mo30428g()), ygx3.mo30473a().size());
            bngx a2 = ygx3.mo30473a();
            if (a2.isEmpty()) {
                ygx = a.mo30520b();
                i = size;
            } else {
                ypt ypt = new ypt(a, ygx3.mo30474b(), ypx.f54368g, ypx.f54365d);
                bnre i5 = a2.listIterator();
                yhu yhu2 = (yhu) i5.next();
                long b = yhu2.mo30387b();
                int j5 = yhu2.mo30517j();
                if (!ygx3.mo30474b().mo30422b().mo30411c()) {
                    long a3 = yhu2.mo30385a();
                    i = size;
                    if (a3 >= ((yfw) yhg2).f53737a) {
                        i5.previous();
                        b = a3;
                        j5 = 0;
                    }
                } else {
                    i = size;
                }
                yjz yjz2 = new yjz(i5, ypx.f54366e, yhg2);
                ypq.m44537a();
                while (true) {
                    if (!yjz2.hasNext()) {
                        break;
                    }
                    yhu yhu3 = (yhu) yjz2.next();
                    long a4 = yhu3.mo30385a();
                    long b2 = yhu3.mo30387b();
                    int j6 = yhu3.mo30517j();
                    long a5 = yhu3.mo30385a();
                    if (a5 == yhu2.mo30385a()) {
                        yjz = yjz2;
                    } else if (a5 < j) {
                        yjz = yjz2;
                    } else if (yhu2.mo30385a() == 0 || yhu2.mo30385a() == yhu2.mo30387b()) {
                        yjz = yjz2;
                        if (yhu3.mo30517j() <= yhu2.mo30517j()) {
                            i2 = j6;
                            yhu = yhu2;
                            j2 = 0;
                            j4 = a4;
                            j3 = j;
                            if (i2 < 0 && j6 == 0) {
                                yhu2 = yhu;
                                j = j3;
                                yjz2 = yjz;
                            } else {
                                long f = yhu3.mo30513f();
                                if (i2 >= 0) {
                                    boolean z = !ygx3.mo30474b().mo30422b().mo30411c();
                                    if (j2 <= 0) {
                                        ygx2 = ygx3;
                                    } else if (f > 0) {
                                        long abs = Math.abs(f - j2);
                                        ygx2 = ygx3;
                                        long j7 = b2 - j4;
                                        if (abs > f54364c && abs > ((long) (((float) j7) * 3.0f))) {
                                            i3 = j6;
                                        }
                                    } else {
                                        ygx2 = ygx3;
                                    }
                                    float a6 = ypt.m44546a((float) i2, j4, b2);
                                    if (a6 > 0.0f) {
                                        i3 = j6;
                                        if ((((long) i2) <= ypx.f54367f || z) && a6 <= ypx.f54369h) {
                                            yfw yfw = (yfw) yhg2;
                                            if (b2 > yfw.f53738b) {
                                                break;
                                            }
                                            long j8 = yfw.f53737a;
                                            if (b2 > j8) {
                                                if (j4 < j8) {
                                                    ypq.m44538a("Delta's start time earlier than transformation window. Update delta's start time. transformation window: [%tT - %tT], original delta: %d [%tT - %tT].", Level.FINE, "Delta's start time earlier than transformation window. Update delta's start time. transformation window: [%tT - %tT], original delta: %d [%tT - %tT].", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(yfw.f53737a)), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(yfw.f53738b)), Integer.valueOf(i2), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j4)), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(b2)));
                                                    j4 = yfw.f53737a;
                                                }
                                                if (ypt.f54347d != j4 || b2 - ypt.f54346c > ypt.f54344a) {
                                                    ypt.mo30652a();
                                                    ypt.f54346c = j4;
                                                }
                                                ypt.f54345b += i2;
                                                ypt.f54347d = b2;
                                            }
                                            ypx = this;
                                            yhg2 = yhg;
                                            yhu2 = yhu3;
                                            j = b2;
                                            yjz2 = yjz;
                                            ygx3 = ygx2;
                                            j5 = i3;
                                        }
                                    } else {
                                        i3 = j6;
                                    }
                                } else {
                                    ygx2 = ygx3;
                                    i3 = j6;
                                }
                                level = i2 != 0 ? Level.CONFIG : Level.FINE;
                                if (ypq.m44541a(level)) {
                                    ypq.m44538a("One or more invalid step counts. delta=%s, start=%tT, end=%tT, datapoint=%s", level, "One or more invalid step counts. delta=%s, start=%tT, end=%tT, datapoint=%s", Integer.valueOf(i2), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j4)), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(b2)), yhu3);
                                }
                                ypx = this;
                                yhg2 = yhg;
                                yhu2 = yhu3;
                                j = b2;
                                yjz2 = yjz;
                                ygx3 = ygx2;
                                j5 = i3;
                            }
                        }
                    } else {
                        yjz = yjz2;
                        i2 = j6;
                        yhu = yhu2;
                        j2 = 0;
                        j4 = a4;
                        j3 = j;
                        if (i2 < 0) {
                            yhu2 = yhu;
                            j = j3;
                            yjz2 = yjz;
                        }
                        long f2 = yhu3.mo30513f();
                        if (i2 >= 0) {
                        }
                        if (i2 != 0) {
                        }
                        if (ypq.m44541a(level)) {
                        }
                        ypx = this;
                        yhg2 = yhg;
                        yhu2 = yhu3;
                        j = b2;
                        yjz2 = yjz;
                        ygx3 = ygx2;
                        j5 = i3;
                    }
                    i2 = j6 - j5;
                    yhu = yhu2;
                    j2 = yhu2.mo30513f();
                    j3 = j;
                    j4 = j3;
                    if (i2 < 0) {
                    }
                    long f22 = yhu3.mo30513f();
                    if (i2 >= 0) {
                    }
                    if (i2 != 0) {
                    }
                    if (ypq.m44541a(level)) {
                    }
                    ypx = this;
                    yhg2 = yhg;
                    yhu2 = yhu3;
                    j = b2;
                    yjz2 = yjz;
                    ygx3 = ygx2;
                    j5 = i3;
                }
                ypt.mo30652a();
                ygx = ypt.f54348e.mo30520b();
            }
            arrayList.add(ygx);
            i4++;
            ypx = this;
            yhg2 = yhg;
            size = i;
        }
        return arrayList;
    }

    /* renamed from: a */
    public final bngx mo30570a(List list) {
        if (list == null || list.isEmpty()) {
            return bngx.m109356a(m44556a("{source_stream_id}", null));
        }
        bngs b = bngx.m109371b(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            yfr yfr = (yfr) list.get(i);
            if ("com.google.step_count.cumulative".equals(yfr.mo30423c())) {
                b.mo67668c(m44556a(yfr.mo30425e(), yfr.mo30428g()));
            }
        }
        return b.mo67664a();
    }
}
