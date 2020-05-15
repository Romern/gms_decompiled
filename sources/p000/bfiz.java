package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bfiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfiz extends bfhp {

    /* renamed from: a */
    final /* synthetic */ bfja f114137a;

    public bfiz(bfja bfja) {
        this.f114137a = bfja;
    }

    /* renamed from: a */
    private static final bfne m96968a(bsax bsax, int i) {
        ArrayList arrayList;
        bsax bsax2 = bsax;
        int i2 = i;
        if (bsax2 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < bsax2.mo70138j(4)) {
            bsax f = bsax2.mo70131f(4, i3);
            if (f.mo70137i(9)) {
                bsax e = f.mo70129e(9);
                boolean z = true;
                int i6 = 0;
                while (i6 < e.mo70138j(i2)) {
                    bsax f2 = e.mo70131f(i2, i6);
                    i5++;
                    if (((long) i5) > 10) {
                        arrayList2.add(f2);
                        if (z) {
                            arrayList = arrayList2;
                            z = false;
                        } else if (i4 < 5000) {
                            arrayList = arrayList2;
                            j += (((long) (f2.mo70137i(7) ? f2.mo70114b(7) : 0)) * 1000) + ((long) (f2.mo70137i(8) ? f2.mo70114b(8) : 0));
                            i4++;
                        }
                        i6++;
                        arrayList2 = arrayList;
                    }
                    arrayList = arrayList2;
                    i6++;
                    arrayList2 = arrayList;
                }
            }
            i3++;
            arrayList2 = arrayList2;
        }
        ArrayList arrayList3 = arrayList2;
        if (i4 < 100) {
            return null;
        }
        double d = (double) j;
        double d2 = (double) i4;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        StringBuilder sb = new StringBuilder(68);
        sb.append("TimeBetweenEvents for sensor:");
        sb.append(i2);
        sb.append(" is:");
        sb.append(d3);
        sb.toString();
        return bfne.m97311a(arrayList3, Double.valueOf(d3));
    }

    /* renamed from: a */
    private final void m96969a(boolean z) {
        if (z) {
            bfja bfja = this.f114137a;
            bfja.f114140m = bfja.m96973a(bfja.f114049c, bfja.f114139l);
        }
        this.f114137a.f114056j = bfis.IDLE;
        this.f114137a.mo61779h(0);
    }

    /* renamed from: a */
    public final void mo61492a(bsax bsax) {
        Object obj;
        boolean z;
        if (this.f114137a.mo61754a()) {
            bfne a = m96968a(bsax, 4);
            bfne a2 = m96968a(bsax, 3);
            if (a == null || a2 == null || a.f114467a == null || (obj = a.f114468b) == null || a2.f114468b == null) {
                m96969a(true);
                return;
            }
            double doubleValue = ((Double) obj).doubleValue();
            double doubleValue2 = ((Double) a2.f114468b).doubleValue();
            int i = this.f114137a.f114144q;
            if (doubleValue < 7142857.142857143d) {
                i = bfja.m96972a(i);
            }
            int i2 = this.f114137a.f114145r;
            if (doubleValue2 < 1.5384615E7d) {
                i2 = bfja.m96972a(i2);
            }
            bfja bfja = this.f114137a;
            if (i == bfja.f114144q && i2 == bfja.f114145r) {
                z = false;
            } else {
                z = true;
            }
            if (!bfja.f114138k.mo61794g() || !this.f114137a.f114138k.mo61795h() || z) {
                this.f114137a.f114138k.mo61782a(i);
                this.f114137a.f114138k.mo61787b(i2);
                this.f114137a.f114138k.mo61790c();
                if (z) {
                    m96969a(false);
                    return;
                }
            }
            long b = this.f114137a.f114049c.mo62775b();
            double[][] a3 = bfja.m96975a((List) a.f114467a);
            bsax bsax2 = null;
            if (a3 != null) {
                String valueOf = String.valueOf(Arrays.deepToString(a3));
                if (valueOf.length() == 0) {
                    new String("Gyro stats: ");
                } else {
                    "Gyro stats: ".concat(valueOf);
                }
                double[] dArr = a3[1];
                if (dArr[0] < 8.0E-5d && dArr[1] < 8.0E-5d && dArr[2] < 8.0E-5d) {
                    bsax bsax3 = new bsax(bgox.f117037ad);
                    bsax3.mo70116b(1, (float) a3[0][0]);
                    bsax3.mo70116b(2, (float) a3[0][1]);
                    bsax3.mo70116b(3, (float) a3[0][2]);
                    bsax3.mo70117b(4, b);
                    bsax bsax4 = new bsax(bgox.f117035ab);
                    bsax4.mo70118b(1, bsax3);
                    bsax2 = bsax4;
                }
            }
            if (bsax2 != null) {
                try {
                    File d = this.f114137a.f114048b.mo62753h().mo62784d();
                    if (d != null) {
                        if (!d.exists()) {
                            if (!d.mkdirs()) {
                                String valueOf2 = String.valueOf(d);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                                sb.append("Failed to create sensorCacheDir: ");
                                sb.append(valueOf2);
                                throw new IOException(sb.toString());
                            }
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(d, "calibration"));
                        fileOutputStream.write(bsax2.mo70120b());
                        fileOutputStream.close();
                    }
                    bfja bfja2 = this.f114137a;
                    bfja2.f114143p = bsax2;
                    bfja2.f114139l = bfja.m96974a(bfja2.f114049c, bsax2);
                } catch (IOException e) {
                    String valueOf3 = String.valueOf(e.getMessage());
                    if (valueOf3.length() == 0) {
                        new String("exception is ");
                    } else {
                        "exception is ".concat(valueOf3);
                    }
                }
            }
            m96969a(true);
        }
    }

    /* renamed from: a */
    public final void mo60954a(String str) {
        this.f114137a.f114142o.mo61628b();
        m96969a(true);
    }
}
