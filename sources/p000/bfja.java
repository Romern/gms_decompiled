package p000;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfja extends bfit {

    /* renamed from: k */
    public final bfjf f114138k;

    /* renamed from: l */
    long f114139l = -1;

    /* renamed from: m */
    long f114140m;

    /* renamed from: n */
    public long f114141n = -1;

    /* renamed from: o */
    public bfft f114142o;

    /* renamed from: p */
    public bsax f114143p;

    /* renamed from: q */
    public int f114144q;

    /* renamed from: r */
    public int f114145r;

    /* renamed from: s */
    private final bfjy f114146s;

    public bfja(bgnp bgnp, bgmk bgmk, bgns bgns, bfcu bfcu, bgoj bgoj, bhaz bhaz, bfiq bfiq, bsax bsax, bfjy bfjy, bfjf bfjf) {
        super("CalibrationCollector", bgnp, bgmk, bgns, bfcu, bgoj, bhaz, bfiq, bfis.OFF);
        this.f114146s = bfjy;
        this.f114143p = bsax;
        this.f114138k = bfjf;
        long a = m96974a(bgmk, bsax);
        this.f114139l = a;
        this.f114140m = m96973a(bgmk, a);
    }

    /* renamed from: a */
    public static int m96972a(int i) {
        if (i != 0) {
            return i != 1 ? 3 : 2;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo61743a(int i, int i2, boolean z) {
    }

    /* renamed from: a */
    public final void mo61744a(bfct bfct) {
    }

    /* renamed from: a */
    public final void mo61745a(bfmn bfmn) {
    }

    /* renamed from: a */
    public final void mo61746a(bfnx bfnx) {
    }

    /* renamed from: a */
    public final void mo61747a(bgjm bgjm) {
    }

    /* renamed from: a */
    public final void mo61749a(bsax bsax) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo61758b(long j) {
        boolean z;
        int i;
        int i2;
        boolean z2 = this.f114146s.f114251i == 1 && mo61754a();
        long j2 = this.f114140m;
        long j3 = j - j2;
        if (j3 >= 0) {
            z = j3 < 3600000;
        } else {
            z = false;
        }
        if (z2 && z) {
            this.f114056j = bfis.CALIBRATION_WAIT;
            if (this.f114138k.mo61794g()) {
                i = this.f114138k.mo61792e();
            } else {
                i = 0;
            }
            if (this.f114138k.mo61795h()) {
                i2 = this.f114138k.mo61793f();
            } else {
                i2 = 0;
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("Starting calibration with delays: gyro: ");
            sb.append(i);
            sb.append(" accel:");
            sb.append(i2);
            sb.toString();
            this.f114144q = i;
            this.f114145r = i2;
            HashMap hashMap = new HashMap();
            hashMap.put(bfgt.f113815e, Integer.valueOf(i));
            hashMap.put(bfgt.f113814d, Integer.valueOf(i2));
            bfft a = this.f114048b.mo62747b().mo62765a(false, bfgt.m96707a(bfgt.f113815e, bfgt.f113814d), hashMap, 15000, null, new bfiz(this), this.f114047a, null);
            this.f114142o = a;
            a.mo61627a();
            return true;
        }
        if (j3 >= 3600000) {
            long a2 = m96973a(this.f114049c, this.f114139l);
            this.f114140m = a2;
            mo61779h(a2);
        } else if (j >= j2) {
            mo61779h(j2 + 3600000);
        } else {
            mo61779h(j2);
        }
        return false;
    }

    /* renamed from: c */
    public final void mo61759c(boolean z) {
    }

    /* renamed from: d */
    public final void mo61763d(boolean z) {
    }

    /* renamed from: e */
    public final void mo61766e(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo61768f() {
        if (mo61754a()) {
            return false;
        }
        this.f114142o.mo61628b();
        this.f114056j = bfis.OFF;
        return true;
    }

    /* renamed from: h */
    public final void mo61779h(long j) {
        if (j != this.f114141n) {
            this.f114141n = j;
            String valueOf = String.valueOf(new Date(this.f114049c.mo62777d() + j));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Alarm set to: ");
            sb.append(j);
            sb.append(" ");
            sb.append(valueOf);
            sb.toString();
            this.f114050d.mo62917a(bgnq.CALIBRATION_COLLECTOR, j, null);
        }
    }

    /* renamed from: a */
    public static long m96973a(bgmk bgmk, long j) {
        Calendar instance = Calendar.getInstance();
        if (j == -1 || j > bgmk.mo62775b()) {
            j = 0;
        }
        instance.setTimeInMillis(j);
        instance.add(6, 7);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(bgmk.mo62775b());
        if (instance.before(instance2)) {
            instance.setTimeInMillis(instance2.getTimeInMillis());
        }
        instance.set(11, 3);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        if (instance.before(instance2)) {
            instance.add(6, 1);
        }
        long timeInMillis = instance.getTimeInMillis() - bgmk.mo62777d();
        String valueOf = String.valueOf(new Date(bgmk.mo62777d() + timeInMillis));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("Next calibration time: ");
        sb.append(timeInMillis);
        sb.append(" ");
        sb.append(valueOf);
        sb.toString();
        return timeInMillis;
    }

    /* renamed from: a */
    public static long m96974a(bgmk bgmk, bsax bsax) {
        long j;
        if (bsax == null || !bsax.mo70137i(1)) {
            j = -1;
        } else {
            j = bsax.mo70129e(1).mo70124c(4);
            if (j > bgmk.mo62775b()) {
                j = -1;
            }
        }
        String valueOf = String.valueOf(j != -1 ? new Date(j) : "");
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("Last successful calibration occurred at: ");
        sb.append(j);
        sb.append(" ");
        sb.append(valueOf);
        sb.toString();
        return j;
    }

    /* renamed from: a */
    public static double[][] m96975a(List list) {
        if (list != null) {
            if (((long) list.size()) >= 200) {
                int size = list.size();
                Iterator it = list.iterator();
                double d = 0.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                double d6 = 0.0d;
                while (true) {
                    int i = size;
                    if (it.hasNext()) {
                        bsax bsax = (bsax) it.next();
                        double d7 = (double) bsax.mo70126d(1);
                        Double.isNaN(d7);
                        d4 += Math.pow((double) bsax.mo70126d(1), 2.0d);
                        double d8 = (double) bsax.mo70126d(2);
                        Double.isNaN(d8);
                        d2 += d8;
                        d5 += Math.pow((double) bsax.mo70126d(2), 2.0d);
                        double d9 = (double) bsax.mo70126d(3);
                        Double.isNaN(d9);
                        d3 += d9;
                        d6 += Math.pow((double) bsax.mo70126d(3), 2.0d);
                        size = i;
                        it = it;
                        d += d7;
                    } else {
                        double d10 = (double) i;
                        Double.isNaN(d10);
                        double d11 = d / d10;
                        Double.isNaN(d10);
                        double d12 = d2 / d10;
                        Double.isNaN(d10);
                        double d13 = d3 / d10;
                        double[][] dArr = new double[2][];
                        dArr[0] = new double[]{d11, d12, d13};
                        Double.isNaN(d10);
                        double[][] dArr2 = dArr;
                        Double.isNaN(d10);
                        Double.isNaN(d10);
                        dArr2[1] = new double[]{(d4 / d10) - Math.pow(d11, 2.0d), (d5 / d10) - Math.pow(d12, 2.0d), (d6 / d10) - Math.pow(d13, 2.0d)};
                        return dArr2;
                    }
                }
            }
        }
        int size2 = list != null ? list.size() : 0;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Not enough gyro samples: ");
        sb.append(size2);
        sb.toString();
        return null;
    }

    /* renamed from: a */
    public final void mo61748a(bgnq bgnq) {
        if (bgnq == bgnq.CALIBRATION_COLLECTOR) {
            this.f114141n = -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo61755a(long j) {
        if (!this.f114146s.f114250h) {
            return false;
        }
        this.f114056j = bfis.IDLE;
        return true;
    }
}
