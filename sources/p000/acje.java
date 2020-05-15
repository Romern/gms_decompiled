package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Random;

/* renamed from: acje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acje implements bamc {

    /* renamed from: a */
    private final Context f59973a;

    /* renamed from: b */
    private final aeat f59974b;

    /* renamed from: c */
    private final String f59975c;

    /* renamed from: d */
    private final String f59976d;

    /* renamed from: e */
    private final ayuj f59977e;

    /* renamed from: f */
    private final Random f59978f;

    /* renamed from: g */
    private final babr f59979g;

    /* renamed from: h */
    private boolean f59980h = false;

    public acje(Context context, aeat aeat, String str, Random random, babr babr, ayuj ayuj, String str2) {
        this.f59973a = context;
        this.f59974b = aeat;
        this.f59975c = str;
        this.f59976d = str2;
        this.f59977e = ayuj;
        this.f59978f = random;
        this.f59979g = babr;
    }

    /* renamed from: a */
    private static int m49213a(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 2 : 1;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SharedPreferences mo32787a() {
        String str = this.f59975c;
        String str2 = this.f59976d;
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        String sb2 = sb.toString();
        SharedPreferences sharedPreferences = this.f59973a.getSharedPreferences(sb2, 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        String valueOf = String.valueOf(sb2);
        throw new NullPointerException(valueOf.length() == 0 ? new String("Failed to get shared prefs for ") : "Failed to get shared prefs for ".concat(valueOf));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [boolean], assign insn: PHI: (r4v0 ?) = (r4v3 ?), (r4v4 ?), (r4v5 ?), (r4v6 ?) binds: [B:34:0x00b5, B:33:0x00a3, B:31:0x009f, B:24:0x0078] */
    /* JADX WARN: Type inference failed for: r4v3, assign insn: 0x00b5: CONST  (r4v3 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r4v4, assign insn: 0x00ac: CONST  (r4v4 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r4v5, assign insn: 0x009f: CONST  (r4v5 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r4v6, assign insn: 0x0078: CONST  (r4v6 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015d  */
    /* renamed from: a */
    public final void mo32788a(long j, long j2, int i, boolean z, boolean z2) {
        String str;
        boolean z3;
        boolean z4;
        String str2;
        String str3;
        ? r4;
        long j3 = j;
        long j4 = j2;
        boolean z5 = z;
        boolean z6 = z2;
        if (!((Boolean) this.f59977e.mo32596a()).booleanValue()) {
            achs.f59875e.mo25416d("%s periodic task disabled", this.f59976d);
            return;
        }
        int a = m49213a(i);
        SharedPreferences a2 = mo32787a();
        if (a2.getBoolean("periodic_scheduled", false)) {
            str = "periodic_scheduled";
            if (a2.getLong("periodic_period", 0) == j3 && a2.getLong("periodic_flex", 0) == j4 && a2.getInt("periodic_network", 0) == a && a2.getBoolean("periodic_charging", false) == z5) {
                z3 = a2.getBoolean("periodic_idle", false) == z6;
                z4 = !z3;
                if (!z4) {
                    if (this.f59980h) {
                        r4 = 0;
                    } else if (((Boolean) acaw.f59267X.mo32596a()).booleanValue()) {
                        int intValue = ((Integer) abzv.f59008B.mo58455c()).intValue();
                        if (intValue > 0) {
                            if (this.f59978f.nextInt(intValue) != 0) {
                                r4 = 0;
                            }
                        } else if (intValue < 0) {
                            r4 = 0;
                            achs.f59875e.mo25418e("Invalid sampling interval: %d", Integer.valueOf(intValue));
                        } else {
                            r4 = 0;
                        }
                    }
                    achw achw = achs.f59875e;
                    Object[] objArr = new Object[3];
                    objArr[r4] = this.f59976d;
                    objArr[1] = Boolean.valueOf((boolean) r4);
                    objArr[2] = Boolean.valueOf(this.f59980h);
                    achw.logVerbose("%s schedule skipped: updateCurrent=%b, hasScheduledPeriodic=%b", objArr);
                    return;
                }
                if (z4) {
                    str3 = str;
                    str2 = "periodic_idle";
                } else if (!((Boolean) acaw.f59298ab.mo32596a()).booleanValue()) {
                    str3 = str;
                    str2 = "periodic_idle";
                    mo32787a().edit().putBoolean(str3, false).apply();
                } else {
                    str3 = str;
                    str2 = "periodic_idle";
                    mo32787a().edit().putBoolean(str3, false).commit();
                }
                if (!((Boolean) acaw.f59385e.mo32596a()).booleanValue()) {
                    aebl aebl = new aebl();
                    aebl.f63099k = this.f59976d;
                    aebl.f63102n = true;
                    aebl.f63097i = this.f59975c;
                    aebl.mo34023a(a);
                    aebl.mo34024a(z5 ? 1 : 0, z5);
                    aebl.mo34026a(z6);
                    aebl.mo34029b(z4);
                    if (!cdny.m134346k()) {
                        aebl.f63070a = j3;
                        aebl.f63071b = j4;
                    } else {
                        aebl.mo34009a(aebh.m51568a(j));
                    }
                    this.f59974b.mo33984a(aebl.mo33974b());
                }
                this.f59980h = true;
                if (z4) {
                    SharedPreferences.Editor putBoolean = mo32787a().edit().putBoolean(str3, true).putLong("periodic_period", j3).putLong("periodic_flex", j4).putInt("periodic_network", a).putBoolean("periodic_charging", z5).putBoolean(str2, z6);
                    if (!((Boolean) acaw.f59301ae.mo32596a()).booleanValue()) {
                        putBoolean.apply();
                    } else {
                        putBoolean.commit();
                    }
                }
                achs.f59875e.logVerbose("%s periodic scheduled, period=%d, flex=%d, update=%b", this.f59976d, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z4));
            }
        } else {
            str = "periodic_scheduled";
        }
        z3 = false;
        z4 = !z3;
        if (!z4) {
        }
        if (z4) {
        }
        if (!((Boolean) acaw.f59385e.mo32596a()).booleanValue()) {
        }
        this.f59980h = true;
        if (z4) {
        }
        achs.f59875e.logVerbose("%s periodic scheduled, period=%d, flex=%d, update=%b", this.f59976d, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z4));
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
     method: aebz.a(int, int):void
     arg types: [int, boolean]
     candidates:
      aebi.a(long, long):void
      aebz.a(int, int):void */
    /* renamed from: a */
    public final void mo32789a(boolean z, int i, boolean z2, Bundle bundle) {
        if (!((Boolean) this.f59977e.mo32596a()).booleanValue()) {
            achs.f59875e.mo25416d("task %s scheduling disabled", this.f59976d);
            return;
        }
        aeat aeat = this.f59974b;
        aebi aebi = new aebi();
        aebi.mo34004a(0, Math.max(1L, ((Long) abzv.f59011E.mo58455c()).longValue()));
        aebi.f63099k = this.f59976d;
        aebi.f63102n = true;
        aebi.f63097i = this.f59975c;
        aebi.mo34023a(m49213a(i));
        aebi.mo34024a(z2 ? 1 : 0, (int) z2);
        aebi.mo34026a(false);
        aebi.mo34029b(z);
        aebi.f63107s = bundle;
        aeat.mo33984a(aebi.mo33974b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebz.a(int, int):void
     arg types: [int, boolean]
     candidates:
      aebi.a(long, long):void
      aebz.a(int, int):void */
    /* renamed from: a */
    public final void mo32790a(boolean z, long j, long j2, int i, boolean z2, boolean z3, Bundle bundle) {
        if (!((Boolean) this.f59977e.mo32596a()).booleanValue()) {
            achs.f59875e.mo25416d("task %s scheduling disabled", this.f59976d);
            return;
        }
        aeat aeat = this.f59974b;
        aebi aebi = new aebi();
        aebi.mo34004a(j, j2);
        aebi.f63099k = this.f59976d;
        aebi.f63102n = true;
        aebi.f63097i = this.f59975c;
        aebi.mo34023a(m49213a(i));
        aebi.mo34024a(z2 ? 1 : 0, (int) z2);
        aebi.mo34026a(z3);
        aebi.mo34029b(z);
        aebi.f63107s = bundle;
        aeat.mo33984a(aebi.mo33974b());
    }
}
