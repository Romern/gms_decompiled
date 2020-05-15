package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: yfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class yfe {

    /* renamed from: a */
    protected final yga f53719a;

    public yfe(yga yga) {
        bmxy.m108582a(yga, "data source manager");
        this.f53719a = yga;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public cadj mo30404a(yhg yhg, cadl cadl) {
        cadi cadi = (cadi) cadj.f172680i.mo74144da();
        if (cadi.f164950c) {
            cadi.mo74035c();
            cadi.f164950c = false;
        }
        cadj cadj = (cadj) cadi.f164949b;
        cadj.f172682a |= 16;
        cadj.f172686e = 4;
        long millis = TimeUnit.NANOSECONDS.toMillis(yhg.mo30385a());
        if (cadi.f164950c) {
            cadi.mo74035c();
            cadi.f164950c = false;
        }
        cadj cadj2 = (cadj) cadi.f164949b;
        cadj2.f172682a |= 1;
        cadj2.f172683b = millis;
        long millis2 = TimeUnit.NANOSECONDS.toMillis(yhg.mo30387b());
        if (cadi.f164950c) {
            cadi.mo74035c();
            cadi.f164950c = false;
        }
        cadj cadj3 = (cadj) cadi.f164949b;
        int i = cadj3.f172682a | 2;
        cadj3.f172682a = i;
        cadj3.f172684c = millis2;
        cadj3.f172688g = cadl.f172698g;
        cadj3.f172682a = i | 32;
        return (cadj) cadi.mo74062i();
    }

    /* renamed from: a */
    public abstract List mo30405a(long j, long j2, long j3, List list, ygc ygc, ydw ydw);

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02a0 A[SYNTHETIC] */
    /* renamed from: a */
    public final List mo30406a(List list, List list2, cadl cadl, ygc ygc, ydw ydw) {
        long j;
        long j2;
        ArrayList arrayList;
        bnre bnre;
        ydw ydw2;
        bngx bngx;
        bnre bnre2;
        ArrayList arrayList2;
        bxwc bxwc;
        bxwc bxwc2;
        ArrayList arrayList3;
        long j3;
        int i;
        long j4;
        cadn cadn;
        char c;
        caae caae;
        caae caae2;
        caae caae3;
        caae caae4;
        caae caae5;
        caae caae6;
        List list3 = list2;
        cadl cadl2 = cadl;
        ydw ydw3 = ydw;
        if (list2.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList4 = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList4.add(mo30404a((yhg) it.next(), cadl2));
        }
        if (cadl.SESSION_BUCKET.equals(cadl2)) {
            Iterator it2 = list2.iterator();
            long j5 = Long.MAX_VALUE;
            long j6 = Long.MIN_VALUE;
            while (it2.hasNext()) {
                yhg yhg = (yhg) it2.next();
                j5 = Math.min(j5, yhg.mo30385a());
                j6 = Math.max(j6, yhg.mo30387b());
            }
            j2 = j5;
            j = j6;
        } else {
            int size = list2.size();
            j2 = ((yhg) list3.get(0)).mo30385a();
            j = ((yhg) list3.get(size - 1)).mo30387b();
        }
        bnre i2 = this.f53719a.mo30457a(list, j2, j, -1, ygc).listIterator();
        while (i2.hasNext()) {
            cadp cadp = (cadp) i2.next();
            if (!list2.isEmpty()) {
                caae caae7 = cadp.f172713b;
                if (caae7 == null) {
                    caae7 = caae.f172323i;
                }
                yed yed = new yed(caae7, list3, ydw3);
                bxwc bxwc3 = cadp.f172714c;
                int size2 = bxwc3.size();
                int i3 = 0;
                while (i3 < size2) {
                    cadn cadn2 = (cadn) bxwc3.get(i3);
                    long j7 = cadn2.f172703c;
                    long j8 = cadn2.f172702b;
                    int size3 = yed.f53688b.size();
                    int i4 = yed.f53687a;
                    int i5 = Integer.MAX_VALUE;
                    while (true) {
                        if (i4 < size3) {
                            bnre2 = i2;
                            yhg yhg2 = (yhg) yed.f53688b.get(i4);
                            if (j7 >= yhg2.mo30387b()) {
                                arrayList3 = arrayList4;
                                j4 = j8;
                                i = size3;
                                bxwc2 = bxwc3;
                                j3 = j7;
                            } else if (j8 <= yhg2.mo30385a()) {
                                arrayList2 = arrayList4;
                                bxwc = bxwc3;
                            } else if (j7 < yhg2.mo30385a() || j8 > yhg2.mo30387b()) {
                                j4 = j8;
                                caae caae8 = cadn2.f172705e;
                                if (caae8 == null) {
                                    caae8 = caae.f172323i;
                                }
                                caah caah = caae8.f172330f;
                                if (caah == null) {
                                    caah = caah.f172333d;
                                }
                                String str = caah.f172336b;
                                i = size3;
                                bxwc bxwc4 = bxwc3;
                                long j9 = cadn2.f172703c;
                                j3 = j7;
                                long j10 = cadn2.f172702b;
                                arrayList3 = arrayList4;
                                long max = Math.max(yhg2.mo30385a(), j9);
                                long min = Math.min(yhg2.mo30387b(), j10);
                                long j11 = min - max;
                                cadn cadn3 = null;
                                if (j11 == 0 && j10 - j9 > 0) {
                                    bxwc2 = bxwc4;
                                } else {
                                    bxwc2 = bxwc4;
                                    switch (str.hashCode()) {
                                        case -1248818137:
                                            if (str.equals("com.google.distance.delta")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1102520626:
                                            if (str.equals("com.google.step_count.delta")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 378060028:
                                            if (str.equals("com.google.activity.segment")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 899666941:
                                            if (str.equals("com.google.calories.expended")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1524007137:
                                            if (str.equals("com.google.cycling.wheel_revolution.cumulative")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    if (c == 0) {
                                        caae caae9 = cadn2.f172705e;
                                        if (caae9 != null) {
                                            caae = caae9;
                                        } else {
                                            caae = caae.f172323i;
                                        }
                                        if ((cadn2.f172701a & 8) != 0) {
                                            caae caae10 = cadn2.f172706f;
                                            caae2 = caae10 != null ? caae10 : caae.f172323i;
                                        } else {
                                            caae2 = null;
                                        }
                                        cadn3 = yyk.m45015a(caae, caae2, max, min, TimeUnit.NANOSECONDS, yyp.m45047a(((caaw) cadn2.f172704d.get(0)).f172382b));
                                    } else if (c == 1 || c == 2) {
                                        double d = (double) j11;
                                        double d2 = (double) (j10 - j9);
                                        Double.isNaN(d);
                                        Double.isNaN(d2);
                                        double d3 = d / d2;
                                        caae caae11 = cadn2.f172705e;
                                        if (caae11 != null) {
                                            caae3 = caae11;
                                        } else {
                                            caae3 = caae.f172323i;
                                        }
                                        if ((cadn2.f172701a & 8) != 0) {
                                            caae caae12 = cadn2.f172706f;
                                            caae4 = caae12 != null ? caae12 : caae.f172323i;
                                        } else {
                                            caae4 = null;
                                        }
                                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                        double d4 = (double) ((caaw) cadn2.f172704d.get(0)).f172382b;
                                        Double.isNaN(d4);
                                        cadn = yyk.m45015a(caae3, caae4, max, min, timeUnit, yyp.m45047a((int) Math.round(d3 * d4)));
                                        if (cadn == null) {
                                            yed.mo30395a(i4, cadn);
                                            i5 = Math.min(i5, i4);
                                        }
                                    } else if (c == 3 || c == 4) {
                                        double d5 = (double) j11;
                                        double d6 = (double) (j10 - j9);
                                        Double.isNaN(d5);
                                        Double.isNaN(d6);
                                        double d7 = d5 / d6;
                                        caae caae13 = cadn2.f172705e;
                                        if (caae13 != null) {
                                            caae5 = caae13;
                                        } else {
                                            caae5 = caae.f172323i;
                                        }
                                        if ((cadn2.f172701a & 8) != 0) {
                                            caae caae14 = cadn2.f172706f;
                                            caae6 = caae14 != null ? caae14 : caae.f172323i;
                                        } else {
                                            caae6 = null;
                                        }
                                        cadn = yyk.m45015a(caae5, caae6, max, min, TimeUnit.NANOSECONDS, yyp.m45046a(d7 * ((caaw) cadn2.f172704d.get(0)).f172383c));
                                        if (cadn == null) {
                                        }
                                    } else {
                                        cadn = j10 <= yhg2.mo30387b() ? cadn2 : null;
                                        if (cadn == null) {
                                        }
                                    }
                                }
                                cadn = cadn3;
                                if (cadn == null) {
                                }
                            } else {
                                yed.mo30395a(i4, cadn2);
                                i5 = Math.min(i5, i4);
                                arrayList3 = arrayList4;
                                j4 = j8;
                                i = size3;
                                bxwc2 = bxwc3;
                                j3 = j7;
                            }
                            i4++;
                            i2 = bnre2;
                            j8 = j4;
                            size3 = i;
                            j7 = j3;
                            arrayList4 = arrayList3;
                            bxwc3 = bxwc2;
                        } else {
                            bnre2 = i2;
                            arrayList2 = arrayList4;
                            bxwc = bxwc3;
                            if (i5 != Integer.MAX_VALUE) {
                                yed.f53687a = i5;
                            }
                        }
                    }
                    i3++;
                    i2 = bnre2;
                    arrayList4 = arrayList2;
                    bxwc3 = bxwc;
                }
                bnre = i2;
                arrayList = arrayList4;
                bngs b = bngx.m109371b(list2.size());
                for (int i6 = 0; i6 < list2.size(); i6++) {
                    caae caae15 = cadp.f172713b;
                    if (caae15 == null) {
                        caae15 = caae.f172323i;
                    }
                    cado a = yyl.m45027a(cadp, ydw.mo30392a(caae15));
                    yfd yfd = (yfd) yed.f53689c.get(i6);
                    if (yfd != null) {
                        a.mo74617a(yfd.mo30382b());
                    }
                    b.mo67668c((cadp) a.mo74062i());
                }
                ydw2 = ydw;
                bngx = b.mo67664a();
            } else {
                bnre = i2;
                ydw2 = ydw3;
                arrayList = arrayList4;
                bngx = bngx.m109376e();
            }
            int i7 = 0;
            while (i7 < list2.size()) {
                ArrayList arrayList5 = arrayList;
                cadj cadj = (cadj) arrayList5.get(i7);
                bxvd bxvd = (bxvd) cadj.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) cadj);
                cadi cadi = (cadi) bxvd;
                cadi.mo74610a((cadp) bngx.get(i7));
                if (!ygc.f53751b) {
                    if (cadi.f164950c) {
                        cadi.mo74035c();
                        cadi.f164950c = false;
                    }
                    cadj cadj2 = (cadj) cadi.f164949b;
                    cadj cadj3 = cadj.f172680i;
                    cadj2.f172682a |= 64;
                    cadj2.f172689h = true;
                }
                arrayList5.set(i7, (cadj) cadi.mo74062i());
                i7++;
                arrayList = arrayList5;
            }
            list3 = list2;
            arrayList4 = arrayList;
            ydw3 = ydw2;
            i2 = bnre;
        }
        return arrayList4;
    }
}
