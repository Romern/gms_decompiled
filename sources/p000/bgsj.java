package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.location.quake.ealert.LocationListener$1;

/* renamed from: bgsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgsj extends bgsp {

    /* renamed from: f */
    public static final /* synthetic */ int f117413f = 0;

    /* renamed from: a */
    public final bgst f117414a;

    /* renamed from: b */
    public PendingIntent f117415b;

    /* renamed from: c */
    public Location f117416c;

    /* renamed from: d */
    public bgsr f117417d;

    /* renamed from: e */
    public final rjx f117418e;

    /* renamed from: h */
    private final Context f117419h;

    /* renamed from: i */
    private PendingIntent f117420i;

    /* renamed from: j */
    private BroadcastReceiver f117421j;

    /* renamed from: k */
    private bgtj f117422k;

    static {
        srn.m36125a("EAlert");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgsj(bgsq bgsq, Context context) {
        super(bgsq);
        rjx c = aeie.m51878c(context);
        bgst bgst = new bgst(cevi.m138293h(), cevi.m138287b());
        this.f117419h = context;
        this.f117418e = c;
        this.f117414a = bgst;
    }

    /* renamed from: a */
    public final int mo63067a() {
        bgsr bgsr = this.f117417d;
        if (bgsr != null) {
            return !bgsr.f117452b ? 1 : 3;
        }
        return 2;
    }

    /* renamed from: b */
    public final void mo63068b() {
        this.f117422k = new bgtj(cevi.m138295j());
        this.f117421j = new LocationListener$1(this, "location");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.location.quake.ealert.ACTION_PERIODIC");
        intentFilter.addAction("com.google.android.gms.location.quake.ealert.ACTION_ONESHOT");
        this.f117419h.registerReceiver(this.f117421j, intentFilter);
        this.f117418e.mo24756l().mo50373a(new bgsh(this));
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo43553c(102);
        locationRequest.mo43554c(cevi.m138295j());
        locationRequest.mo43552b(cevi.m138294i());
        LocationRequestInternal a = LocationRequestInternal.m66889a("ealert", locationRequest);
        a.f79426h = "com.google.android.gms.location";
        a.mo43611a();
        PendingIntent a2 = mo63131a("com.google.android.gms.location.quake.ealert.ACTION_PERIODIC");
        this.f117420i = a2;
        this.f117418e.mo24726a(a, a2);
    }

    /* renamed from: c */
    public final void mo63069c() {
        PendingIntent pendingIntent = this.f117420i;
        if (pendingIntent != null) {
            this.f117418e.mo24739c(pendingIntent);
        }
        PendingIntent pendingIntent2 = this.f117415b;
        if (pendingIntent2 != null) {
            this.f117418e.mo24739c(pendingIntent2);
        }
        BroadcastReceiver broadcastReceiver = this.f117421j;
        if (broadcastReceiver != null) {
            this.f117419h.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: d */
    public final Location mo63133d() {
        return this.f117416c;
    }

    /* renamed from: a */
    public final PendingIntent mo63131a(String str) {
        return PendingIntent.getBroadcast(this.f117419h, 0, new Intent(str), 134217728);
    }

    /* renamed from: a */
    public final synchronized void mo63132a(Location location) {
        if (location != null) {
            this.f117416c = location;
            this.f117422k.mo63143a(new bgsi(this));
        }
    }
}
