package p000;

import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: besj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class besj extends berq {
    public besj(berb berb, bgmk bgmk) {
        super(berb);
    }

    /* renamed from: c */
    private final boolean m95700c(long j) {
        long j2;
        long j3 = this.f112230b.f112159ai;
        if (j >= 300000 || j3 == Long.MAX_VALUE) {
            return false;
        }
        if (j > j3) {
            j2 = j;
        } else {
            j2 = j3;
        }
        if (j > j3) {
            j = j3;
        }
        if (j == 0) {
            return false;
        }
        if (j2 % j == 0) {
            return true;
        }
        double d = (double) j2;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        return d3 < 8.5d && Math.abs(((d3 + 0.5d) % 1.0d) + -0.5d) < 0.1d;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0290  */
    /* renamed from: a */
    public final berp mo61059a(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        boolean d;
        long j9;
        long j10;
        long j11;
        long j12;
        long min;
        long j13;
        long j14;
        long j15;
        long j16;
        long a = mo61058a();
        long b = mo61061b();
        berb berb = this.f112230b;
        long j17 = berb.f112164an;
        if (berb.mo60993i() != Long.MAX_VALUE) {
            berb berb2 = this.f112230b;
            j2 = !berb2.f112191r.f112367a ? Math.max(0L, berb2.mo60993i() - berq.m95598b(berb2.f112123K.f112059a)) : berb2.mo60993i();
        } else {
            j2 = Long.MAX_VALUE;
        }
        long a2 = bhct.m100648a(j17, j2);
        long c = mo61062c();
        bfmg bfmg = this.f112230b.f112160aj;
        long j18 = bfmg != null ? bfmg.f114394a : -1;
        StringBuilder sb = new StringBuilder(222);
        sb.append("nextFullTrigger: ");
        sb.append(a);
        sb.append(" nextTiltOnlyTrigger: ");
        sb.append(b);
        sb.append(" nextPhonePositionOnlyTrigger: ");
        sb.append(a2);
        sb.append(" nextLocatorTrigger: ");
        sb.append(j18);
        sb.append(" nextSleepActivityOnlyTrigger: ");
        sb.append(c);
        sb.toString();
        if (m95700c(this.f112230b.f112134V)) {
            berb berb3 = this.f112230b;
            long j19 = j18;
            j16 = b;
            j3 = c;
            j4 = a2;
            if (berq.m95597a(b, j19, berb3.f112134V, berb3.f112159ai)) {
                j5 = j19;
                j6 = bhct.m100648a(j5, 1000);
                if (m95700c(this.f112230b.mo60993i()) && berq.m95597a(j4, j5, this.f112230b.mo60993i(), this.f112230b.f112159ai)) {
                    j4 = bhct.m100648a(j5, 1000);
                }
                if (!m95700c(this.f112230b.f112133U)) {
                    berb berb4 = this.f112230b;
                    j8 = j6;
                    j7 = j4;
                    j15 = j5;
                    if (berq.m95597a(a, j5, berb4.f112133U, berb4.f112159ai)) {
                        a = bhct.m100648a(j15, 1000);
                        berb berb5 = this.f112230b;
                        long j20 = berb5.f112171au;
                        d = berb5.f112114B.mo62860d();
                        if (!d || j20 == -1) {
                            j9 = a;
                        } else {
                            long a3 = bhct.m100648a(this.f112230b.f112171au, 45000);
                            if (a3 < SystemClock.elapsedRealtime()) {
                                j9 = Math.min(a, a3);
                            } else {
                                j9 = a;
                            }
                            this.f112230b.mo60961a(-1L);
                        }
                        if (cese.m138160i() && cese.m138159h()) {
                            j14 = this.f112229a + 5000;
                            if (j14 < SystemClock.elapsedRealtime()) {
                                j14 = this.f112229a + 45000;
                            }
                            if (j14 >= SystemClock.elapsedRealtime()) {
                                j9 = Math.min(j9, j14);
                            }
                        }
                        j10 = 39;
                        if (j7 < j9 || berq.m95597a(j7, j9, this.f112230b.mo60993i(), Long.MAX_VALUE)) {
                            j11 = j9;
                        } else {
                            StringBuilder sb2 = new StringBuilder(123);
                            sb2.append("Running phone position only detector next: FullTrigger: ");
                            sb2.append(a);
                            sb2.append(" PhonePositionOnlyTrigger: ");
                            j11 = j7;
                            sb2.append(j11);
                            sb2.toString();
                            j10 = 4;
                        }
                        if (!d && mo61060a(j8, j11)) {
                            StringBuilder sb3 = new StringBuilder((int) ErrorInfo.TYPE_SDU_FAILED);
                            sb3.append("Running tilt only detector next: FullTrigger: ");
                            sb3.append(a);
                            sb3.append(" TiltOnlyTrigger: ");
                            sb3.append(j8);
                            sb3.toString();
                            j10 = 2;
                            j11 = j8;
                        }
                        if (d && this.f112230b.mo60993i() == Long.MAX_VALUE && !this.f112230b.mo60987c()) {
                            j10 = 0;
                        }
                        j12 = j3;
                        if (j12 < j11 && !berq.m95597a(j12, j11, this.f112230b.mo60995k(), Long.MAX_VALUE)) {
                            StringBuilder sb4 = new StringBuilder(121);
                            sb4.append("Running sleep segment only detector next: FullTrigger: ");
                            sb4.append(a);
                            sb4.append(" SleepSegmentOnlyTrigger: ");
                            sb4.append(j12);
                            sb4.toString();
                            j10 = 32;
                            j11 = j12;
                        }
                        long i = this.f112230b.mo60993i();
                        berb berb6 = this.f112230b;
                        min = Math.min(i, Math.min(berb6.f112133U, berb6.f112134V));
                        if (!this.f112230b.mo60996l() && !this.f112230b.f112151aa) {
                            j13 = min / 8;
                        } else {
                            j13 = min / 3;
                        }
                        StringBuilder sb5 = new StringBuilder((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
                        sb5.append("nextTriggerTime: ");
                        sb5.append(j11);
                        sb5.append(" detectorType: ");
                        sb5.append(j10);
                        sb5.append(" alarmWindowMillis: ");
                        sb5.append(j13);
                        sb5.toString();
                        return new berp(new bfmg(j11, j13), j10);
                    }
                } else {
                    j8 = j6;
                    j7 = j4;
                    j15 = j5;
                }
                if (this.f112230b.mo60975a()) {
                    long a4 = bhct.m100648a(this.f112230b.f112161ak, Math.max(super.mo61063d(), 180000L));
                    if (a != a4) {
                        a = a4 > j8 ? j8 : a4;
                        if (a > j15) {
                            berb berb7 = this.f112230b;
                            if (berq.m95597a(a4, j15, berb7.f112133U, berb7.f112159ai)) {
                                a = bhct.m100648a(j15, 1000);
                            }
                        }
                    }
                }
                berb berb52 = this.f112230b;
                long j202 = berb52.f112171au;
                d = berb52.f112114B.mo62860d();
                if (!d) {
                }
                j9 = a;
                j14 = this.f112229a + 5000;
                if (j14 < SystemClock.elapsedRealtime()) {
                }
                if (j14 >= SystemClock.elapsedRealtime()) {
                }
                j10 = 39;
                if (j7 < j9) {
                }
                j11 = j9;
                StringBuilder sb32 = new StringBuilder((int) ErrorInfo.TYPE_SDU_FAILED);
                sb32.append("Running tilt only detector next: FullTrigger: ");
                sb32.append(a);
                sb32.append(" TiltOnlyTrigger: ");
                sb32.append(j8);
                sb32.toString();
                j10 = 2;
                j11 = j8;
                j10 = 0;
                j12 = j3;
                StringBuilder sb42 = new StringBuilder(121);
                sb42.append("Running sleep segment only detector next: FullTrigger: ");
                sb42.append(a);
                sb42.append(" SleepSegmentOnlyTrigger: ");
                sb42.append(j12);
                sb42.toString();
                j10 = 32;
                j11 = j12;
                long i2 = this.f112230b.mo60993i();
                berb berb62 = this.f112230b;
                min = Math.min(i2, Math.min(berb62.f112133U, berb62.f112134V));
                if (!this.f112230b.mo60996l()) {
                    j13 = min / 8;
                    StringBuilder sb52 = new StringBuilder((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
                    sb52.append("nextTriggerTime: ");
                    sb52.append(j11);
                    sb52.append(" detectorType: ");
                    sb52.append(j10);
                    sb52.append(" alarmWindowMillis: ");
                    sb52.append(j13);
                    sb52.toString();
                    return new berp(new bfmg(j11, j13), j10);
                }
                j13 = min / 3;
                StringBuilder sb522 = new StringBuilder((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
                sb522.append("nextTriggerTime: ");
                sb522.append(j11);
                sb522.append(" detectorType: ");
                sb522.append(j10);
                sb522.append(" alarmWindowMillis: ");
                sb522.append(j13);
                sb522.toString();
                return new berp(new bfmg(j11, j13), j10);
            }
            j5 = j19;
        } else {
            j3 = c;
            j4 = a2;
            j16 = b;
            j5 = j18;
        }
        j6 = j16;
        j4 = bhct.m100648a(j5, 1000);
        if (!m95700c(this.f112230b.f112133U)) {
        }
        if (this.f112230b.mo60975a()) {
        }
        berb berb522 = this.f112230b;
        long j2022 = berb522.f112171au;
        d = berb522.f112114B.mo62860d();
        if (!d) {
        }
        j9 = a;
        j14 = this.f112229a + 5000;
        if (j14 < SystemClock.elapsedRealtime()) {
        }
        if (j14 >= SystemClock.elapsedRealtime()) {
        }
        j10 = 39;
        if (j7 < j9) {
        }
        j11 = j9;
        StringBuilder sb322 = new StringBuilder((int) ErrorInfo.TYPE_SDU_FAILED);
        sb322.append("Running tilt only detector next: FullTrigger: ");
        sb322.append(a);
        sb322.append(" TiltOnlyTrigger: ");
        sb322.append(j8);
        sb322.toString();
        j10 = 2;
        j11 = j8;
        j10 = 0;
        j12 = j3;
        StringBuilder sb422 = new StringBuilder(121);
        sb422.append("Running sleep segment only detector next: FullTrigger: ");
        sb422.append(a);
        sb422.append(" SleepSegmentOnlyTrigger: ");
        sb422.append(j12);
        sb422.toString();
        j10 = 32;
        j11 = j12;
        long i22 = this.f112230b.mo60993i();
        berb berb622 = this.f112230b;
        min = Math.min(i22, Math.min(berb622.f112133U, berb622.f112134V));
        if (!this.f112230b.mo60996l()) {
        }
        j13 = min / 3;
        StringBuilder sb5222 = new StringBuilder((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
        sb5222.append("nextTriggerTime: ");
        sb5222.append(j11);
        sb5222.append(" detectorType: ");
        sb5222.append(j10);
        sb5222.append(" alarmWindowMillis: ");
        sb5222.append(j13);
        sb5222.toString();
        return new berp(new bfmg(j11, j13), j10);
    }
}
