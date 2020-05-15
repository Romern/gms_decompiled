package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.location.quake.ealert.LocationListenerOld$1;

/* renamed from: bgsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgsl extends bgsp {

    /* renamed from: d */
    public static final /* synthetic */ int f117424d = 0;

    /* renamed from: a */
    public final bgst f117425a;

    /* renamed from: b */
    public Location f117426b;

    /* renamed from: c */
    public bgsr f117427c;

    /* renamed from: e */
    private final Context f117428e;

    /* renamed from: f */
    private final aesh f117429f;

    /* renamed from: h */
    private PendingIntent f117430h;

    /* renamed from: i */
    private PendingIntent f117431i;

    /* renamed from: j */
    private BroadcastReceiver f117432j;

    /* renamed from: k */
    private bgtj f117433k;

    static {
        srn.m36125a("EAlert");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgsl(bgsq bgsq, Context context) {
        super(bgsq);
        aesh aesh = new aesh(context);
        bgst bgst = new bgst(cevi.m138293h(), cevi.m138287b());
        this.f117428e = context;
        this.f117429f = aesh;
        this.f117425a = bgst;
    }

    /* renamed from: a */
    private final PendingIntent m99853a(String str) {
        return PendingIntent.getBroadcast(this.f117428e, 0, new Intent(str), 134217728);
    }

    /* renamed from: a */
    public final int mo63067a() {
        bgsr bgsr = this.f117427c;
        if (bgsr != null) {
            return !bgsr.f117452b ? 1 : 3;
        }
        return 2;
    }

    /* renamed from: b */
    public final void mo63068b() {
        this.f117433k = new bgtj(cevi.m138295j());
        this.f117432j = new LocationListenerOld$1(this, "location");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.location.quake.ealert.ACTION_PERIODIC");
        intentFilter.addAction("com.google.android.gms.location.quake.ealert.ACTION_ONESHOT");
        this.f117428e.registerReceiver(this.f117432j, intentFilter);
        this.f117429f.mo34501a();
        mo63135a(this.f117429f.mo34508c());
        if (this.f117426b == null) {
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.mo43553c(100);
            locationRequest.mo43554c(0L);
            locationRequest.mo43552b(0L);
            locationRequest.mo43551b(1);
            locationRequest.mo43556d(0);
            locationRequest.mo43549a(cevi.m138295j());
            LocationRequestInternal a = LocationRequestInternal.m66889a("ealert", locationRequest);
            a.f79426h = "com.google.android.gms.location";
            a.mo43611a();
            PendingIntent a2 = m99853a("com.google.android.gms.location.quake.ealert.ACTION_ONESHOT");
            this.f117431i = a2;
            this.f117429f.mo34506a(a, a2);
        }
        LocationRequest locationRequest2 = new LocationRequest();
        locationRequest2.mo43553c(102);
        locationRequest2.mo43554c(cevi.m138295j());
        locationRequest2.mo43552b(cevi.m138294i());
        LocationRequestInternal a3 = LocationRequestInternal.m66889a("ealert", locationRequest2);
        a3.f79426h = "com.google.android.gms.location";
        a3.mo43611a();
        PendingIntent a4 = m99853a("com.google.android.gms.location.quake.ealert.ACTION_PERIODIC");
        this.f117430h = a4;
        this.f117429f.mo34506a(a3, a4);
    }

    /* renamed from: c */
    public final void mo63069c() {
        PendingIntent pendingIntent = this.f117430h;
        if (pendingIntent != null) {
            this.f117429f.mo34504a(pendingIntent);
        }
        PendingIntent pendingIntent2 = this.f117431i;
        if (pendingIntent2 != null) {
            this.f117429f.mo34504a(pendingIntent2);
        }
        this.f117429f.mo34507b();
        BroadcastReceiver broadcastReceiver = this.f117432j;
        if (broadcastReceiver != null) {
            this.f117428e.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: d */
    public final Location mo63133d() {
        return this.f117426b;
    }

    /* renamed from: a */
    public final synchronized void mo63135a(Location location) {
        if (location != null) {
            this.f117426b = location;
            this.f117433k.mo63143a(new bgsk(this));
        }
    }
}
