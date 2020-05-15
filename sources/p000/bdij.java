package p000;

import android.os.SystemClock;

/* renamed from: bdij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdij {

    /* renamed from: c */
    static final bdij f105693c = new bdij();

    /* renamed from: a */
    public final long f105694a;

    /* renamed from: b */
    public long f105695b = -1;

    /* renamed from: d */
    boolean f105696d = false;

    /* renamed from: e */
    public int f105697e = 1;

    static {
        int i = aytg.f98445a;
    }

    /* renamed from: a */
    public static bdij m90859a() {
        return new bdij();
    }

    /* renamed from: a */
    public static boolean m90860a(bdij bdij) {
        return bdij == null || bdij == f105693c;
    }

    public bdij() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f105694a = elapsedRealtime;
    }

    /* renamed from: b */
    public final void mo58070b() {
        this.f105695b = SystemClock.elapsedRealtime();
    }

    public bdij(long j, long j2) {
        bmxy.m108594a(j2 >= j, "End time %s is before start time %s.", j2, j);
        this.f105694a = j;
        this.f105695b = j2;
    }
}
