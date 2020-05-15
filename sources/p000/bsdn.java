package p000;

import com.google.location.bluemoon.inertialanchor.Pose;
import java.util.List;

/* renamed from: bsdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdn extends bsdi implements btvl, bsdp {

    /* renamed from: c */
    public final bsdq f144183c;

    /* renamed from: d */
    private final boolean f144184d;

    /* renamed from: e */
    private double f144185e;

    /* renamed from: f */
    private double f144186f;

    /* renamed from: a */
    public final void mo70272a() {
        this.f144185e = Double.NEGATIVE_INFINITY;
        this.f144186f = 0.0d;
        this.f144183c.mo70278a();
    }

    /* renamed from: a */
    public final void mo62282a(float f, float f2, long j) {
    }

    /* renamed from: a */
    public final void mo62284a(long j, float f) {
    }

    /* renamed from: d */
    public final void mo62286d() {
    }

    public bsdn(bsfy bsfy, boolean z) {
        super(bsfy);
        this.f144184d = z;
        bsdq bsdq = new bsdq();
        this.f144183c = bsdq;
        bsdq.f144202a.mo70276a(this);
        mo70272a();
    }

    /* renamed from: a */
    public final void mo70273a(double d, double d2) {
        mo70266a(new bsfs(d, d2));
    }

    /* renamed from: a */
    public final void mo62281a(float f) {
        bsdq bsdq = this.f144183c;
        double d = (double) f;
        if (d > 0.0d) {
            double min = Math.min(d, 1000.0d);
            bsdq.f144203b = min;
            bsdq.mo70279b();
            bsdq.f144202a.mo70275a(min);
        }
    }

    /* renamed from: a */
    public final void mo62283a(long j) {
        if (this.f144170b == 1) {
            mo70272a();
            mo70266a(new bsfs(bsgk.m115737a(j)));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bsdv.a(bsdv, bsdv, bsdv, boolean):void
     arg types: [bsdv, bsdv, bsdv, int]
     candidates:
      bsdv.a(double, double, double, double):void
      bsdv.a(bsdv, bsdv, bsdv, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x017b, code lost:
        if (r8 > (r5 + p000.bsdo.f144188b)) goto L_0x017d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0186  */
    /* renamed from: a */
    public final void mo62285a(Pose pose) {
        double d;
        char c;
        double d2;
        boolean z;
        Pose pose2 = pose;
        if (pose2 != null && this.f144170b == 1) {
            for (bsgn bsgn : bsgm.f144529a) {
            }
            double a = bsgk.m115737a(pose2.timestampNanos);
            bsdq bsdq = this.f144183c;
            bsdv bsdv = pose2.attitude;
            double d3 = bsdv.f144222a;
            double d4 = bsdv.f144223b;
            double d5 = bsdv.f144224c;
            double d6 = bsdv.f144225d;
            bsdv bsdv2 = bsdq.f144205d;
            if (bsdv2 != null) {
                d = a;
                if ((bsdv2.f144222a * d3) + (bsdv2.f144223b * d4) + (bsdv2.f144224c * d5) + (bsdv2.f144225d * d6) < 0.0d) {
                    d3 = -d3;
                    d4 = -d4;
                    d5 = -d5;
                    d6 = -d6;
                }
            } else {
                d = a;
            }
            bsdq.f144206e.mo70282a(bsdq.f144204c[0].mo70280a(d3), bsdq.f144204c[1].mo70280a(d4), bsdq.f144204c[2].mo70280a(d5), bsdq.f144204c[3].mo70280a(d6));
            bsdq.f144206e.mo70284b();
            if (bsdq.f144205d == null) {
                bsdv bsdv3 = bsdq.f144206e;
                bsdv bsdv4 = new bsdv();
                bsdv3.mo70283a(bsdv4);
                bsdq.f144205d = bsdv4;
            }
            bsdv bsdv5 = bsdq.f144205d;
            bsdv bsdv6 = bsdq.f144206e;
            bsdv bsdv7 = bsdq.f144207f;
            bsdv.m115368a(bsdv6, bsdv5, bsdv7, true);
            bsdv7.mo70284b();
            bsdv bsdv8 = bsdq.f144207f;
            bsdx bsdx = bsdq.f144212k;
            double atan2 = Math.atan2(bsdv8.f144224c, bsdv8.f144225d);
            double d7 = atan2 + atan2;
            bsdt.m115365a(-d7, bsdw.f144227b, bsdq.f144208g);
            bsdv.m115368a(bsdq.f144208g, bsdv8, bsdq.f144209h, false);
            bsdv bsdv9 = bsdq.f144209h;
            bsds bsds = bsdq.f144210i;
            bsdv9.mo70284b();
            bsdw bsdw = bsdq.f144211j;
            bsdw.f144228c = bsdv9.f144222a;
            bsdw.f144229d = bsdv9.f144223b;
            bsdw.f144230e = bsdv9.f144224c;
            double a2 = bsdw.mo70285a();
            double d8 = bsdv9.f144225d;
            bsdw bsdw2 = bsdq.f144211j;
            bsdw2.mo70288c();
            double atan22 = Math.atan2(a2, d8);
            bsds.mo70281a(bsdw2, atan22 + atan22);
            bsds bsds2 = bsdq.f144210i;
            double d9 = bsds2.f144217a;
            bsdw bsdw3 = bsds2.f144218b;
            double d10 = bsdw3.f144228c;
            double d11 = bsdw3.f144229d;
            bsdx.f144231a = d7;
            bsdx.f144232b = d9;
            bsdw bsdw4 = bsdx.f144233c;
            bsdw4.f144228c = d10;
            bsdw4.f144229d = d11;
            bsdw4.f144230e = 0.0d;
            bsdo bsdo = bsdq.f144202a;
            bsdx bsdx2 = bsdq.f144212k;
            double[] dArr = bsdo.f144195i;
            int i = bsdo.f144196j;
            dArr[i] = bsdx2.f144232b * bsdo.f144193g;
            bsdo.f144191e += bsdx2.f144231a;
            int a3 = bsdo.m115354a(dArr, i);
            boolean z2 = true;
            boolean z3 = true;
            int i2 = 0;
            while (true) {
                if (i2 < dArr.length) {
                    if (i2 != a3 && dArr[i2] < dArr[a3]) {
                        z2 = false;
                    }
                    if (i2 != a3 && dArr[i2] > dArr[a3]) {
                        z3 = false;
                    }
                    if (!z2 && !z3) {
                        c = 1;
                        break;
                    } else {
                        i2++;
                        d = d;
                    }
                } else if (z2) {
                    c = 2;
                } else {
                    c = 3;
                }
            }
            double[] dArr2 = bsdo.f144195i;
            double d12 = dArr2[bsdo.m115354a(dArr2, bsdo.f144196j)];
            double length = (double) (bsdo.f144195i.length >> 1);
            double d13 = bsdo.f144194h;
            Double.isNaN(length);
            double d14 = d - (length * d13);
            if (c == 3) {
                if (d12 <= bsdo.f144187a) {
                    double d15 = bsdo.f144198l.f144220a;
                    if (d15 > bsdo.f144189c) {
                    }
                    if (!bsdo.f144190d) {
                        bsdu bsdu = bsdo.f144198l;
                        double d16 = bsdu.f144220a;
                        long j = bsdu.f144221b;
                        long j2 = 1 + j;
                        double d17 = (double) j;
                        Double.isNaN(d17);
                        double d18 = (double) j2;
                        Double.isNaN(d18);
                        bsdu.f144220a = ((d16 * d17) + d12) / d18;
                        bsdu.f144221b = j2;
                    }
                    d2 = d;
                }
                bsdo.f144201o = d12;
                bsdo.f144190d = true;
                if (!bsdo.f144190d) {
                }
                d2 = d;
            } else if (c == 2) {
                if (bsdo.f144190d) {
                    double d19 = bsdo.f144199m;
                    double d20 = bsdo.f144201o;
                    if (d20 <= d19 || d20 <= d12) {
                        z = false;
                    } else {
                        z = (d20 - d12) / (d20 - d19) > 0.5d;
                    }
                    double d21 = d14 - bsdo.f144200n;
                    if (!z && d21 <= 3.0d) {
                        d2 = d;
                    } else {
                        List list = bsdo.f144197k;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ((bsdp) list.get(i3)).mo70273a(d, bsdo.f144191e);
                        }
                        d2 = d;
                        bsdo.mo70277b();
                    }
                } else {
                    d2 = d;
                }
                if (!bsdo.f144190d) {
                    bsdo.f144199m = d12;
                    bsdo.f144200n = d14;
                }
                bsdo.f144192f = d14;
                bsdo.f144191e = 0.0d;
            } else {
                d2 = d;
            }
            int i4 = bsdo.f144196j + 1;
            bsdo.f144196j = i4;
            if (i4 > bsdo.f144195i.length - 1) {
                bsdo.f144196j = 0;
            }
            bsdq.f144206e.mo70283a(bsdq.f144205d);
            double d22 = bsdq.f144213l;
            double d23 = bsdq.f144212k.f144231a;
            bsdq.f144213l = d22 + d23;
            boolean z4 = this.f144184d;
            if (z4) {
                this.f144186f += d23;
            }
            if (d2 - this.f144185e >= 0.1d) {
                mo70266a(new bsfs(d2, this.f144183c.f144213l, this.f144186f));
                this.f144186f = 0.0d;
                this.f144185e = d2;
            } else if (!z4) {
                this.f144186f += d23;
            }
        }
    }
}
