package p000;

import android.app.Application;
import android.provider.Settings;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: bdkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdkq {

    /* renamed from: a */
    public final ayte f105840a;

    /* renamed from: b */
    private final int f105841b;

    /* renamed from: c */
    private final double f105842c;

    /* renamed from: d */
    private final String f105843d = bdjb.m90890a();

    /* renamed from: e */
    private final String f105844e;

    public bdkq(ayte ayte, bmxv bmxv, Application application) {
        this.f105840a = ayte;
        this.f105842c = ((bdkm) bmxv.mo66814b()).mo58113f();
        this.f105841b = ((bdkm) bmxv.mo66814b()).mo58109c();
        this.f105844e = Settings.Secure.getString(application.getContentResolver(), "android_id");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Long mo58128a(long j) {
        int i = 0;
        Random random = new Random((long) Objects.hash(Long.valueOf(j), this.f105844e, this.f105843d));
        double nextDouble = random.nextDouble();
        double d = this.f105842c;
        if (d >= 1.0d) {
            i = (int) Math.min(Math.round((d + d) * nextDouble), 2147483646L);
        } else if (nextDouble < d) {
            i = 1;
        }
        long j2 = 31557600000L + j;
        int i2 = this.f105841b;
        long j3 = (j2 - j) - ((long) (i2 + i2));
        TreeSet treeSet = new TreeSet();
        while (treeSet.size() < i) {
            long abs = (Math.abs(Math.max(random.nextLong(), -9223372036854775807L)) % j3) + j;
            long j4 = (long) this.f105841b;
            long j5 = j4 + j4;
            if (treeSet.subSet(Long.valueOf(abs - j5), Long.valueOf(j5 + abs)).isEmpty()) {
                treeSet.add(Long.valueOf(abs));
            }
        }
        Long l = (Long) treeSet.ceiling(Long.valueOf(System.currentTimeMillis() + 100));
        if (l != null) {
            return l;
        }
        if (j < System.currentTimeMillis()) {
            return mo58128a(j2);
        }
        return null;
    }
}
