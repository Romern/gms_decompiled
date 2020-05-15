package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.NetworkLocationStatus;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfta implements bfrz, stv {

    /* renamed from: a */
    public final bfst f115169a = new bfsv(this);

    /* renamed from: b */
    public final bfst f115170b = new bfsx(this);

    /* renamed from: c */
    public final bfst f115171c = new bfsy(this);

    /* renamed from: d */
    public bfst f115172d = this.f115177i;

    /* renamed from: e */
    public bfsz f115173e;

    /* renamed from: f */
    public boolean f115174f;

    /* renamed from: g */
    public String f115175g;

    /* renamed from: h */
    public Location f115176h;

    /* renamed from: i */
    private final bfst f115177i = new bfsu(this);

    /* renamed from: j */
    private final bfst f115178j = new bfsw(this);

    /* renamed from: k */
    private final stw f115179k;

    /* renamed from: l */
    private final bfsa f115180l;

    /* renamed from: m */
    private final bfpk f115181m;

    /* renamed from: n */
    private long f115182n = -1;

    public bfta(Context context, Looper looper) {
        bfsa bfsa = new bfsa(looper, context);
        stw stw = new stw(context);
        this.f115180l = bfsa;
        this.f115179k = stw;
        this.f115181m = new bfpk(new adzt(looper), bfqt.m97590a(context));
    }

    /* renamed from: a */
    public final void mo62224a() {
        if (this.f115172d == this.f115177i) {
            bfsa bfsa = this.f115180l;
            bfsa.f115095i = this;
            bfsa.mo62202d();
            this.f115179k.mo26079a(this);
            mo62225a(this.f115169a);
        }
    }

    /* renamed from: a */
    public final void mo62153a(List list) {
    }

    /* renamed from: a */
    public final void mo62154a(NetworkLocationStatus[] networkLocationStatusArr) {
    }

    /* renamed from: b */
    public final void mo62226b() {
        if (this.f115172d != this.f115177i) {
            this.f115180l.mo62203e();
            this.f115179k.mo26078a();
            mo62225a(this.f115177i);
        }
    }

    /* renamed from: d */
    public final void mo62159d() {
    }

    /* renamed from: b */
    public final void mo62227b(ActivityRecognitionResult activityRecognitionResult) {
        int a = activityRecognitionResult.mo43491a().mo43513a();
        if (a == 0 || a == 1) {
            mo62225a(this.f115178j);
        }
    }

    /* renamed from: a */
    public final void mo62225a(bfst bfst) {
        bfst bfst2 = this.f115172d;
        if (bfst2 != bfst) {
            bfst2.mo62222b();
            this.f115172d = bfst;
            bfst.mo62218a();
        }
    }

    /* renamed from: b */
    public final void mo62228b(boolean z, String str) {
        this.f115174f = z;
        this.f115182n = z ? SystemClock.elapsedRealtime() : -1;
        this.f115175g = str;
        this.f115176h = null;
    }

    /* renamed from: a */
    public final void mo62150a(ActivityRecognitionResult activityRecognitionResult) {
        this.f115172d.mo62219a(activityRecognitionResult);
    }

    /* renamed from: b */
    public final boolean mo62229b(List list) {
        Location location = (Location) bnjd.m109595d(list);
        if (location.hasSpeed() && ((double) location.getSpeed()) > cewd.m138341d()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            if (aeim.m51906j(location2) != 2) {
                int i = Build.VERSION.SDK_INT;
                if (location2.getElapsedRealtimeNanos() / 1000000 < this.f115182n) {
                    continue;
                } else {
                    Location location3 = this.f115176h;
                    if (location3 == null) {
                        this.f115176h = location2;
                    } else if (location3.distanceTo(location2) > this.f115176h.getAccuracy() + location2.getAccuracy() + 150.0f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo26077a(boolean z, String str) {
        this.f115181m.mo62099a(28, new bfss(this, z, str));
    }
}
