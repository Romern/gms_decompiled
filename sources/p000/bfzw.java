package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.location.geofencer.service.LocationDetector$Receiver;
import com.google.android.location.internal.PendingIntentCallbackChimeraService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: bfzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfzw {

    /* renamed from: a */
    public volatile boolean f115825a = false;

    /* renamed from: b */
    public final bfzt f115826b;

    /* renamed from: c */
    public final Object f115827c = new Object();

    /* renamed from: d */
    final PendingIntent f115828d;

    /* renamed from: e */
    final LocationDetector$Receiver f115829e = new LocationDetector$Receiver(this);

    /* renamed from: f */
    public int f115830f = -1;

    /* renamed from: g */
    public Collection f115831g = null;

    /* renamed from: h */
    long f115832h = -1;

    /* renamed from: i */
    public boolean f115833i = false;

    /* renamed from: j */
    public final bfww f115834j;

    /* renamed from: k */
    private final Context f115835k;

    /* renamed from: l */
    private final skc f115836l;

    /* renamed from: m */
    private final aesh f115837m;

    /* renamed from: n */
    private final int f115838n;

    /* renamed from: o */
    private final String f115839o;

    /* renamed from: p */
    private PendingIntent f115840p;

    /* renamed from: q */
    private final rjx f115841q;

    public bfzw(Context context, bfzt bfzt, aesh aesh, rjx rjx, bfww bfww) {
        this.f115835k = context;
        this.f115826b = bfzt;
        this.f115836l = new skc(context);
        this.f115841q = rjx;
        this.f115837m = aesh;
        if (aesh != null) {
            aesh.mo34501a();
        }
        this.f115834j = bfww;
        Intent a = PendingIntentCallbackChimeraService.m117262a(this.f115835k);
        a.setPackage(this.f115835k.getPackageName());
        a.setAction("com.google.android.location.internal.action.GEOFENCER_LOCATION_RESULT");
        this.f115828d = PendingIntent.getService(this.f115835k, 0, a, 134217728);
        aki.m919a(context).mo873a(this.f115829e, new IntentFilter(bvpm.m121348a("com.google.android.location.internal.action.GEOFENCER_LOCATION_RESULT")));
        this.f115835k.getApplicationContext().registerReceiver(this.f115829e, new IntentFilter("com.google.android.location.intent.action.END_LOCATION_BURST"));
        this.f115838n = context.getApplicationInfo().uid;
        this.f115839o = context.getPackageName();
    }

    /* renamed from: a */
    public final void mo62519a() {
        synchronized (this.f115827c) {
            this.f115830f = -1;
            if (this.f115833i) {
                mo62521a(true);
            }
            rjx rjx = this.f115841q;
            if (rjx != null) {
                rjx.mo24739c(this.f115828d);
            } else {
                aesh aesh = this.f115837m;
                if (aesh != null) {
                    aesh.mo34504a(this.f115828d);
                }
            }
            bfxa.f115569a.mo62419b(-693738864, this.f115830f);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rzz.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      rzz.a(java.lang.Object, java.lang.Object):void
      rzz.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo62520a(int i, boolean z, Collection collection, boolean z2) {
        Collection collection2;
        boolean z3;
        int i2;
        Collection collection3;
        int i3 = i;
        StringBuilder sb = new StringBuilder(56);
        sb.append("Location update interval should be positive: ");
        sb.append(i3);
        rzz.m34730a(true, (Object) sb.toString());
        if (collection == null) {
            boolean z4 = bfxc.f115575a;
            collection2 = Collections.singletonList(new ClientIdentity(this.f115838n, this.f115839o));
        } else {
            collection2 = collection;
        }
        synchronized (this.f115827c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int throttledGeofenceLocationIntervalSeconds = (int) cesn.f183405a.mo6606a().throttledGeofenceLocationIntervalSeconds();
            if (!z2 && cesn.m138187b() && i3 < throttledGeofenceLocationIntervalSeconds) {
                i3 = throttledGeofenceLocationIntervalSeconds;
            } else if (i3 < 60) {
                long j = this.f115832h;
                if (j >= 0) {
                    if (elapsedRealtime - j < 1140000) {
                        if (!this.f115833i) {
                            boolean z5 = bfxc.f115575a;
                            i3 = 60;
                        }
                    }
                }
                i3 = Math.max(30, i3);
            }
            if (z || (i2 = this.f115830f) == -1 || Math.abs(i3 - i2) > 4 || (collection3 = this.f115831g) == null || collection3.size() != collection2.size() || !this.f115831g.containsAll(collection2)) {
                this.f115830f = i3;
                if (i3 < 60 && !this.f115833i) {
                    boolean z6 = bfxc.f115575a;
                    if (this.f115840p == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    rzz.m34729a(z3);
                    rzz.m34729a(!this.f115833i);
                    this.f115833i = true;
                    this.f115832h = elapsedRealtime;
                    Intent intent = new Intent("com.google.android.location.intent.action.END_LOCATION_BURST");
                    intent.setPackage(this.f115835k.getPackageName());
                    PendingIntent broadcast = PendingIntent.getBroadcast(this.f115835k, 0, intent, 134217728);
                    this.f115840p = broadcast;
                    this.f115836l.mo25675a("LocationDetector", 2, elapsedRealtime + 180000, broadcast, "com.google.android.gms");
                } else if (i3 >= 60 && this.f115833i) {
                    mo62521a(true);
                }
                this.f115831g = collection2;
                int i4 = this.f115830f;
                LocationRequest a = LocationRequest.m66854a();
                a.mo43554c(((long) i4) * 1000);
                a.mo43552b(cexk.f183493a.mo6606a().geofencerFastestLocationIntervalMillis());
                a.mo43553c(102);
                LocationRequestInternal a2 = LocationRequestInternal.m66889a("geofencing", a);
                a2.mo43613a(new ArrayList(collection2));
                a2.f79426h = "com.google.android.gms.location.geofencing";
                a2.mo43611a();
                a2.mo43614b();
                rjx rjx = this.f115841q;
                if (rjx != null) {
                    rjx.mo24726a(a2, this.f115828d);
                } else {
                    aesh aesh = this.f115837m;
                    if (aesh != null) {
                        aesh.mo34506a(a2, this.f115828d);
                    }
                }
                bfww bfww = this.f115834j;
                if (bfww != null) {
                    bfww.mo62397a();
                    bxvd bxvd = bfww.f115555n;
                    int i5 = ((bpmm) bxvd.f164949b).f138297b + 1;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpmm bpmm = (bpmm) bxvd.f164949b;
                    bpmm bpmm2 = bpmm.f138294h;
                    bpmm.f138296a = 1 | bpmm.f138296a;
                    bpmm.f138297b = i5;
                }
                bfxa.f115569a.mo62419b(-2123990287, this.f115830f);
            } else {
                boolean z7 = bfxc.f115575a;
            }
        }
    }

    /* renamed from: a */
    public final void mo62521a(boolean z) {
        boolean z2;
        if (this.f115840p != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        rzz.m34729a(z2);
        rzz.m34729a(this.f115833i);
        boolean z3 = bfxc.f115575a;
        this.f115833i = false;
        if (z) {
            this.f115836l.mo25668a(this.f115840p);
        }
        this.f115840p = null;
    }
}
