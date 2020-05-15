package p000;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.location.fused.StationaryThrottlingEngine$AlarmListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bfsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfsm extends bfow implements bfrb, sth {

    /* renamed from: a */
    private final spf f115140a;

    /* renamed from: b */
    private final Handler f115141b;

    /* renamed from: c */
    private final sti f115142c;

    /* renamed from: d */
    private long f115143d;

    /* renamed from: f */
    final StationaryThrottlingEngine$AlarmListener f115144f = new StationaryThrottlingEngine$AlarmListener(this);

    /* renamed from: g */
    private long f115145g;

    /* renamed from: h */
    private boolean f115146h;

    /* renamed from: i */
    private bfrb f115147i;

    public bfsm(bfrc bfrc, sti sti, spf spf, Looper looper) {
        super(bfrc);
        this.f115142c = sti;
        this.f115141b = new adzt(looper);
        this.f115140a = spf;
        this.f115147i = null;
        sti.f45129a = this;
    }

    /* renamed from: b */
    private final void m97726b(List list) {
        bfrb bfrb = this.f115147i;
        if (bfrb != null) {
            bfrb.mo62122f(list);
        }
        if (this.f115146h) {
            m97727j();
        }
    }

    /* renamed from: j */
    private final void m97727j() {
        long elapsedRealtime = SystemClock.elapsedRealtime() + mo62066g();
        if (elapsedRealtime > 0) {
            this.f115140a.mo25930a("com.google.android.gms.location.fused.SEND_LOCATION_IN_STATIONARY_MODE_ALARM", 3, elapsedRealtime, this.f115144f, this.f115141b, saq.m34797a(mo62063d()));
        }
    }

    /* renamed from: a */
    public final Location mo62068a(boolean z) {
        long j;
        long j2;
        Location a = this.f114732e.mo62068a(z);
        if (a == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        long elapsedRealtimeNanos = a.getElapsedRealtimeNanos();
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.f115143d);
        if (this.f115146h) {
            j2 = SystemClock.elapsedRealtime();
            j = System.currentTimeMillis();
        } else if (elapsedRealtimeNanos > nanos) {
            return a;
        } else {
            j2 = this.f115143d;
            j = this.f115145g;
        }
        Location location = new Location(a);
        location.setTime(j);
        int i2 = Build.VERSION.SDK_INT;
        location.setElapsedRealtimeNanos(TimeUnit.MILLISECONDS.toNanos(j2));
        return location;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62060a(List list);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo62062c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Collection mo62063d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo62064e();

    /* renamed from: f */
    public final void mo62122f(List list) {
        m97726b(list);
        mo62060a(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract long mo62066g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo62067h();

    /* renamed from: i */
    public final void mo62212i() {
        Location a = mo62068a(false);
        if (a != null) {
            m97726b(Collections.singletonList(a));
        }
    }

    /* renamed from: f */
    public boolean mo62065f() {
        if (this.f115146h == mo62064e()) {
            return false;
        }
        boolean e = mo62064e();
        this.f115146h = e;
        if (e) {
            m97727j();
            return true;
        }
        this.f115143d = SystemClock.elapsedRealtime();
        this.f115145g = System.currentTimeMillis();
        this.f115140a.mo25932a(this.f115144f);
        return true;
    }

    /* renamed from: b */
    public void mo62061b() {
        this.f114732e.mo62061b();
        this.f115140a.mo25932a(this.f115144f);
        this.f115142c.mo26073b();
        this.f115143d = 0;
        this.f115145g = 0;
    }

    /* renamed from: a */
    public void mo62058a() {
        this.f114732e.mo62058a();
        this.f115142c.mo26072a();
        this.f115143d = 0;
        this.f115145g = 0;
    }

    /* renamed from: a */
    public final void mo62071a(bfrb bfrb) {
        this.f115147i = bfrb;
        this.f114732e.mo62071a(this);
    }

    /* renamed from: a */
    public final void mo62121a(LocationAvailability locationAvailability) {
        bfrb bfrb = this.f115147i;
        if (bfrb != null) {
            bfrb.mo62121a(locationAvailability);
        }
    }

    /* renamed from: a */
    public final void mo62072a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f114732e.mo62072a(fileDescriptor, printWriter, strArr);
        String h = mo62067h();
        String str = !this.f115146h ? "moving" : "stationary";
        StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 15 + str.length());
        sb.append("  ");
        sb.append(h);
        sb.append(" throttling: ");
        sb.append(str);
        printWriter.println(sb.toString());
    }

    /* renamed from: a */
    public final void mo26071a(boolean z, boolean z2) {
        if (!mo62064e()) {
            return;
        }
        if ((!z || !z2) && mo62068a(false) == null) {
            mo62062c();
        }
    }
}
