package com.google.android.location.fused;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.location.util.DeviceActiveAlarmTimer;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationStatusHelper extends spb implements bfrz, sth {

    /* renamed from: s */
    private static final long f150739s = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: t */
    private static final long f150740t = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: u */
    private static final long f150741u = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: v */
    private static final long f150742v = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: b */
    public int f150743b;

    /* renamed from: c */
    public int f150744c;

    /* renamed from: d */
    public int f150745d;

    /* renamed from: e */
    public int f150746e;

    /* renamed from: f */
    public int f150747f;

    /* renamed from: g */
    public bfrn f150748g = new bfrn();

    /* renamed from: h */
    public bfrn f150749h = new bfrn();

    /* renamed from: i */
    public long f150750i = 0;

    /* renamed from: j */
    public long f150751j = 0;

    /* renamed from: k */
    public boolean f150752k;

    /* renamed from: l */
    public boolean f150753l;

    /* renamed from: m */
    public boolean f150754m;

    /* renamed from: n */
    public boolean f150755n;

    /* renamed from: o */
    public bfrp f150756o;

    /* renamed from: p */
    public final bfsa f150757p;

    /* renamed from: q */
    public final sti f150758q;

    /* renamed from: r */
    public final DeviceActiveAlarmTimer f150759r;

    /* renamed from: w */
    private long f150760w;

    public LocationStatusHelper(sti sti, bfsa bfsa, DeviceActiveAlarmTimer deviceActiveAlarmTimer) {
        super("location");
        this.f150758q = sti;
        this.f150757p = bfsa;
        this.f150759r = deviceActiveAlarmTimer;
    }

    /* renamed from: a */
    private static final long m117221a(long j) {
        return j != Long.MAX_VALUE ? j + Math.max(f150742v, (long) (((float) j) * 0.5f)) : j;
    }

    /* renamed from: a */
    private static final boolean m117222a(int i, int i2) {
        return (i == 0 || i == 1 || i2 == 0 || i2 == 1) ? false : true;
    }

    /* renamed from: f */
    private final long m117223f() {
        return m117221a(Math.max(this.f150748g.f115039g, f150739s));
    }

    /* renamed from: g */
    private final long m117224g() {
        return m117221a(Math.max(this.f150748g.f115039g, f150740t));
    }

    /* renamed from: a */
    public final void mo62150a(ActivityRecognitionResult activityRecognitionResult) {
    }

    /* renamed from: a */
    public final void mo62153a(List list) {
    }

    /* renamed from: b */
    public final void mo70867b() {
        this.f150752k = false;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f150760w = elapsedRealtime;
        if (this.f150749h.f115038f < Long.MAX_VALUE) {
            this.f150750i = elapsedRealtime;
        }
        this.f150751j = elapsedRealtime;
        mo70868c();
        mo70869e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (m117222a(r1, r0) == false) goto L_0x0057;
     */
    /* renamed from: c */
    public final void mo70868c() {
        int i;
        boolean z;
        if (this.f150753l) {
            int i2 = 7;
            if (this.f150754m) {
                i2 = this.f150746e;
                i = this.f150747f;
            } else {
                i = 7;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f150750i;
            long j2 = this.f150760w;
            int i3 = 0;
            if (j > j2 || this.f150751j > j2) {
                z = true;
            } else {
                z = false;
            }
            if (!this.f150755n || elapsedRealtime - m117223f() > this.f150750i) {
                if (this.f150754m) {
                    if (elapsedRealtime - m117224g() > this.f150751j) {
                        z = true;
                        i3 = 1000;
                    }
                }
                z = true;
                i3 = 1000;
            }
            if (!z) {
                return;
            }
            if (i3 != this.f150743b || i2 != this.f150744c || i != this.f150745d || !this.f150752k) {
                this.f150743b = i3;
                this.f150744c = i2;
                this.f150745d = i;
                this.f150752k = true;
                if (this.f150756o != null) {
                    this.f150756o.mo62151a(LocationAvailability.m66850a(i3, i2, i, TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime())));
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo62159d() {
    }

    /* renamed from: e */
    public final void mo70869e() {
        long j;
        long j2;
        if ((this.f150743b == 0 || !this.f150752k) && this.f150748g.f115038f != Long.MAX_VALUE) {
            if (this.f150754m) {
                j = this.f150751j + m117224g();
            } else {
                j = 0;
            }
            if (this.f150755n) {
                j2 = this.f150750i + m117223f();
            } else {
                j2 = 0;
            }
            if (j != 0 || j2 != 0) {
                long max = Math.max(j, j2) + f150741u;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (max > elapsedRealtime) {
                    this.f150759r.mo70955a(max - elapsedRealtime, this.f150748g.f115043k, "com.google.android.location.fused.LOCATION_STATUS_ALARM_ACTION", this);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo25922a() {
        mo70868c();
        mo70869e();
    }

    /* renamed from: a */
    public final void mo26071a(boolean z, boolean z2) {
        if (!z2) {
            this.f150751j = 0;
        }
        if (!z) {
            this.f150750i = 0;
        }
        this.f150754m = z2;
        this.f150755n = z;
        mo70868c();
    }

    /* renamed from: a */
    public final void mo62154a(NetworkLocationStatus[] networkLocationStatusArr) {
        int i;
        NetworkLocationStatus networkLocationStatus = networkLocationStatusArr[networkLocationStatusArr.length - 1];
        int i2 = networkLocationStatus.f79374a;
        this.f150747f = i2;
        int i3 = networkLocationStatus.f79375b;
        this.f150746e = i3;
        this.f150744c = i3;
        this.f150745d = i2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((!this.f150755n || elapsedRealtime - m117223f() > this.f150750i) && (!this.f150754m || elapsedRealtime - m117224g() > this.f150751j || m117222a(this.f150744c, this.f150745d))) {
            this.f150743b = 1000;
            i = 1000;
        } else {
            this.f150743b = 0;
            i = 0;
        }
        if (this.f150756o != null) {
            this.f150756o.mo62151a(new LocationAvailability(i, this.f150744c, this.f150745d, TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()), networkLocationStatusArr));
        }
    }
}
