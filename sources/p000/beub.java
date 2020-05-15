package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: beub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beub extends berq {

    /* renamed from: c */
    private final Calendar f112457c = Calendar.getInstance();

    public beub(berb berb, bgmk bgmk) {
        super(berb);
    }

    /* renamed from: a */
    public static String m95860a(Calendar calendar, long j) {
        long b = m95862b(calendar, j);
        String format = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss.SSS", Locale.US).format(calendar.getTime());
        return String.format(Locale.US, "sinceBootTime=%d, %s", Long.valueOf(b), format);
    }

    /* renamed from: b */
    public static long m95861b(long j, long j2, long j3, long j4) {
        long j5 = j;
        long j6 = j2;
        long j7 = j4;
        if (!cese.m138154c()) {
            return j5;
        }
        Locale locale = Locale.US;
        Object[] objArr = {m95863b(j5, j7), m95863b(j6, j7), Long.valueOf(j3), Long.valueOf(j4)};
        if (j5 == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j5 + j7);
        instance.set(14, 0);
        if (instance.get(13) < 30) {
            instance.set(13, 0);
            long b = m95862b(instance, j7);
            long j8 = b - j6;
            if (j6 == -1 || j8 > j3 / 2) {
                String valueOf = String.valueOf(m95860a(instance, j7));
                if (valueOf.length() == 0) {
                    new String("  Prefer beginning of minute: ");
                } else {
                    "  Prefer beginning of minute: ".concat(valueOf);
                }
                return b;
            }
        }
        instance.set(13, 0);
        instance.add(12, 1);
        long b2 = m95862b(instance, j7);
        Locale locale2 = Locale.US;
        Object[] objArr2 = {m95860a(instance, j7), Long.valueOf(b2)};
        return b2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final long mo61148c(long j, long j2) {
        long j3;
        boolean c = cese.m138154c();
        if (c) {
            this.f112457c.setTimeInMillis(j2 + j);
            this.f112457c.set(14, 0);
            this.f112457c.set(13, 0);
            this.f112457c.add(12, 1);
            j3 = m95862b(this.f112457c, j2);
        } else {
            j3 = j;
        }
        berx bese = this.f112230b.mo60976a(9) ? new bese(this.f112230b) : new besg(this.f112230b);
        bete bete = this.f112230b.f112191r;
        if (bete.f112367a) {
            j = Math.min(j, bete.f112369c);
        }
        return (beti.m95784a(j3 - j, bese) || !c) ? j3 : j3 + 60000;
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
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    public final berp mo61059a(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6 = j;
        long e = bgof.m99492e();
        if (j6 == -1) {
            j3 = mo61058a();
            j2 = this.f112230b.f112161ak;
        } else {
            j3 = mo61148c(j6, e);
            j2 = -1;
        }
        long b = m95861b(j3, j2, this.f112230b.f112133U, e);
        long b2 = mo61061b();
        berb berb = this.f112230b;
        long j7 = b;
        long b3 = m95861b(b2, berb.f112162al, berb.f112134V, e);
        long j8 = -1;
        if (j6 != -1) {
            j4 = mo61148c(j6, e);
        } else {
            berb berb2 = this.f112230b;
            long j9 = berb2.f112163am;
            if (berb2.mo60994j() != Long.MAX_VALUE) {
                j5 = Math.max(0L, this.f112230b.mo60994j() - berq.m95598b(2500000000L));
            } else {
                j5 = Long.MAX_VALUE;
            }
            j4 = bhct.m100648a(j9, j5);
            j8 = this.f112230b.f112163am;
        }
        long b4 = m95861b(j4, j8, this.f112230b.mo60994j(), e);
        Locale locale = Locale.US;
        Object[] objArr = {Long.valueOf(j7), Long.valueOf(b3), Long.valueOf(b4)};
        boolean d = this.f112230b.f112114B.mo62860d();
        long j10 = !d ? 39 : 0;
        long min = Math.min(360000L, this.f112230b.mo60994j());
        if (this.f112230b.mo60983b()) {
            if (berq.m95597a(b4, j7, min, Long.MAX_VALUE)) {
                j10 |= 8;
                b4 = Math.min(j7, b4);
            } else if (b4 < j7) {
                j10 |= 8;
            }
            if (!d && mo61060a(b3, b4)) {
                StringBuilder sb = new StringBuilder((int) ErrorInfo.TYPE_SDU_FAILED);
                sb.append("Running tilt only detector next: FullTrigger: ");
                sb.append(j7);
                sb.append(" TiltOnlyTrigger: ");
                sb.append(b3);
                sb.toString();
                j10 = 2;
            } else {
                b3 = b4;
            }
            return new berp(new bfmg(b3 - 1000, 2000), j10);
        }
        b4 = j7;
        if (!d) {
            StringBuilder sb2 = new StringBuilder((int) ErrorInfo.TYPE_SDU_FAILED);
            sb2.append("Running tilt only detector next: FullTrigger: ");
            sb2.append(j7);
            sb2.append(" TiltOnlyTrigger: ");
            sb2.append(b3);
            sb2.toString();
            j10 = 2;
            return new berp(new bfmg(b3 - 1000, 2000), j10);
        }
        b3 = b4;
        return new berp(new bfmg(b3 - 1000, 2000), j10);
    }

    /* renamed from: b */
    private static long m95862b(Calendar calendar, long j) {
        return calendar.getTimeInMillis() - j;
    }

    /* renamed from: b */
    public static String m95863b(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j + j2);
        return m95860a(instance, j2);
    }
}
