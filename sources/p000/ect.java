package p000;

import java.util.Arrays;
import java.util.TimeZone;

/* renamed from: ect */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ect {

    /* renamed from: a */
    public TimeZone f14699a;

    /* renamed from: b */
    public ecs f14700b;

    /* renamed from: c */
    public ecq f14701c;

    /* renamed from: d */
    private long[] f14702d;

    public ect(bxln bxln) {
        mo9970a(bxln);
    }

    /* renamed from: a */
    public final long mo9969a(long j) {
        int i;
        long b = dqt.m9103b(j, this.f14699a);
        int binarySearch = Arrays.binarySearch(this.f14702d, b);
        if (binarySearch < 0) {
            i = (-binarySearch) - 1;
        } else {
            i = binarySearch + 1;
        }
        Object[] objArr = {Integer.valueOf(i), Long.valueOf(this.f14702d[i]), Long.valueOf(this.f14702d[i] - b)};
        return this.f14702d[i] - b;
    }

    /* renamed from: a */
    public final void mo9970a(bxln bxln) {
        int length;
        long[] jArr;
        ecs ecs = this.f14700b;
        if (ecs == null) {
            bxlm bxlm = bxln.f163868c;
            if (bxlm == null) {
                bxlm = bxlm.f163859c;
            }
            this.f14700b = new ecs(bxlm);
        } else {
            bxlm bxlm2 = bxln.f163868c;
            if (bxlm2 == null) {
                bxlm2 = bxlm.f163859c;
            }
            ecs.mo9968a(bxlm2);
        }
        ecq ecq = this.f14701c;
        if (ecq == null) {
            bxlh bxlh = bxln.f163869d;
            if (bxlh == null) {
                bxlh = bxlh.f163848b;
            }
            this.f14701c = new ecq(bxlh);
        } else {
            bxlh bxlh2 = bxln.f163869d;
            if (bxlh2 == null) {
                bxlh2 = bxlh.f163848b;
            }
            ecq.mo9967a(bxlh2);
        }
        TimeZone timeZone = TimeZone.getTimeZone(bxln.f163866a);
        this.f14699a = timeZone;
        if (timeZone == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("ect", "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[LocaleBasedTimeModelHolder] Could not interpret TimeZone from id = %s, using user's default TimeZone", bxln.f163866a);
            this.f14699a = TimeZone.getDefault();
        }
        long[] a = bqcr.m112597a(bxln.f163867b);
        if (a == null || (length = a.length) == 0) {
            a = new long[]{0, 86400000};
        } else {
            Arrays.sort(a);
            long j = a[0];
            long j2 = a[length - 1];
            if (!(j == 0 && j2 == 86400000)) {
                if (j == 0) {
                    long[] jArr2 = new long[(length + 1)];
                    jArr2[length] = 86400000;
                    System.arraycopy(a, 0, jArr2, 0, length);
                    a = jArr2;
                } else {
                    if (j2 != 86400000) {
                        jArr = new long[(length + 2)];
                        jArr[length + 1] = 86400000;
                    } else {
                        jArr = new long[(length + 1)];
                    }
                    jArr[0] = 0;
                    System.arraycopy(a, 0, jArr, 1, length);
                    a = jArr;
                }
            }
        }
        this.f14702d = a;
    }
}
