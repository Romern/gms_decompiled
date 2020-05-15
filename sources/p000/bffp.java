package p000;

import android.content.Context;
import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.GpsStatus;
import android.location.LocationListener;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: bffp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bffp extends bfgs implements GpsStatus.Listener {

    /* renamed from: f */
    public static final /* synthetic */ int f113698f = 0;

    /* renamed from: a */
    public boolean f113699a = false;

    /* renamed from: b */
    public final boolean f113700b;

    /* renamed from: c */
    public final boolean f113701c;

    /* renamed from: d */
    public final boolean f113702d;

    /* renamed from: e */
    final long f113703e;

    /* renamed from: l */
    private final bfko f113704l;

    /* renamed from: m */
    private final String f113705m;

    /* renamed from: n */
    private final GnssMeasurementsEvent.Callback f113706n;

    /* renamed from: o */
    private final GnssNavigationMessage.Callback f113707o;

    /* renamed from: p */
    private final boolean f113708p;

    /* renamed from: q */
    private GpsStatus f113709q;

    /* renamed from: r */
    private final LocationListener f113710r;

    public bffp(Context context, boolean z, boolean z2, boolean z3, boolean z4, bfko bfko, bfev bfev, bfew bfew, bhdb bhdb, long j) {
        super(bfev, bfew, bhdb);
        bffn bffn;
        bffo bffo = null;
        this.f113709q = null;
        this.f113700b = z;
        this.f113708p = z2;
        this.f113701c = z3;
        this.f113702d = z4;
        this.f113710r = new bffm(this, "location", "GpsScanner");
        if (bfko == null) {
            this.f113704l = new bfko(context, false);
        } else {
            this.f113704l = bfko;
        }
        this.f113705m = this.f113804g.f118318a;
        this.f113703e = j;
        if (this.f113701c) {
            int i = Build.VERSION.SDK_INT;
            bffn = new bffn(this);
        } else {
            bffn = null;
        }
        this.f113706n = bffn;
        if (this.f113702d) {
            int i2 = Build.VERSION.SDK_INT;
            bffo = new bffo(this);
        }
        this.f113707o = bffo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61527a() {
        GnssNavigationMessage.Callback callback;
        GnssMeasurementsEvent.Callback callback2;
        if (this.f113708p) {
            bfko bfko = this.f113704l;
            bfko.mo61848a(this.f113705m, 3);
            bfko.f114311b.addGpsStatusListener(this);
        }
        bfko bfko2 = this.f113704l;
        if (bfko2 != null) {
            bfko2.mo61849a(this.f113705m, "gps", this.f113703e, this.f113710r, this.f113805h.getLooper());
        }
        bfew bfew = this.f113806i;
        if (bfew != null) {
            bfew.mo61502h();
        }
        if (this.f113701c && (callback2 = this.f113706n) != null) {
            bfko bfko3 = this.f113704l;
            bfko3.mo61848a(this.f113705m, 5);
            int i = Build.VERSION.SDK_INT;
            bfko3.f114311b.registerGnssMeasurementsCallback(callback2);
        }
        if (this.f113702d && (callback = this.f113707o) != null) {
            bfko bfko4 = this.f113704l;
            bfko4.mo61848a(this.f113705m, 7);
            int i2 = Build.VERSION.SDK_INT;
            bfko4.f114311b.registerGnssNavigationMessageCallback(callback);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfko.a(java.lang.String, boolean, android.location.LocationListener):void
     arg types: [java.lang.String, int, android.location.LocationListener]
     candidates:
      bfko.a(java.text.Format, long, java.io.PrintWriter):void
      bfko.a(java.lang.String, boolean, android.location.LocationListener):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61529b() {
        GnssNavigationMessage.Callback callback;
        GnssMeasurementsEvent.Callback callback2;
        if (this.f113708p) {
            bfko bfko = this.f113704l;
            bfko.mo61848a(this.f113705m, 4);
            bfko.f114311b.removeGpsStatusListener(this);
        }
        bfko bfko2 = this.f113704l;
        if (bfko2 != null) {
            bfko2.mo61850a(this.f113705m, true, this.f113710r);
        }
        bfew bfew = this.f113806i;
        if (bfew != null) {
            bfew.mo61503i();
        }
        if (this.f113701c && (callback2 = this.f113706n) != null) {
            bfko bfko3 = this.f113704l;
            bfko3.mo61848a(this.f113705m, 6);
            int i = Build.VERSION.SDK_INT;
            bfko3.f114311b.unregisterGnssMeasurementsCallback(callback2);
        }
        if (this.f113702d && (callback = this.f113707o) != null) {
            bfko bfko4 = this.f113704l;
            bfko4.mo61848a(this.f113705m, 8);
            int i2 = Build.VERSION.SDK_INT;
            bfko4.f114311b.unregisterGnssNavigationMessageCallback(callback);
        }
    }

    public final void onGpsStatusChanged(int i) {
        GpsStatus gpsStatus;
        this.f113807j.mo61864a();
        if (this.f113708p && !mo61674i() && i == 4) {
            try {
                gpsStatus = this.f113704l.f114311b.getGpsStatus(this.f113709q);
            } catch (NullPointerException e) {
                gpsStatus = null;
            }
            this.f113709q = gpsStatus;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bfev bfev = this.f113805h;
            GpsStatus gpsStatus2 = this.f113709q;
            if (gpsStatus2 != null) {
                bfev.f113606a.mo61593a(gpsStatus2, elapsedRealtime);
            }
            mo61672a(bfgt.f113818h, elapsedRealtime, null);
        }
    }
}
