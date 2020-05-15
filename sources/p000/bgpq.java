package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.location.quake.LocationDataListener$1;
import java.util.concurrent.TimeUnit;

/* renamed from: bgpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgpq extends bgsd {

    /* renamed from: a */
    public static final /* synthetic */ int f117212a = 0;

    /* renamed from: b */
    private static final long f117213b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: c */
    private final Context f117214c;

    /* renamed from: d */
    private final bgst f117215d;

    /* renamed from: e */
    private PendingIntent f117216e;

    /* renamed from: f */
    private PendingIntent f117217f;

    /* renamed from: h */
    private BroadcastReceiver f117218h;

    /* renamed from: i */
    private Location f117219i;

    /* renamed from: j */
    private Location f117220j;

    /* renamed from: k */
    private Location f117221k;

    /* renamed from: l */
    private Long f117222l;

    /* renamed from: m */
    private bgsr f117223m = bgsr.f117451a;

    /* renamed from: n */
    private boolean f117224n = true;

    /* renamed from: o */
    private Location f117225o;

    /* renamed from: p */
    private final rjx f117226p;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public bgpq(Context context, bgsq bgsq) {
        super(bgsq);
        this.f117214c = context;
        this.f117226p = aeie.m51878c(context);
        this.f117215d = new bgst(cezu.m138490k(), cezu.m138489j());
    }

    /* renamed from: a */
    private final PendingIntent m99714a(String str) {
        return PendingIntent.getBroadcast(this.f117214c, 0, new Intent(str), 134217728);
    }

    /* renamed from: b */
    public final void mo63068b() {
        this.f117218h = new LocationDataListener$1(this, "location");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.location.quake.ACTION_ONESHOT");
        intentFilter.addAction("com.google.android.gms.location.quake.ACTION_PASSIVE");
        this.f117214c.registerReceiver(this.f117218h, intentFilter);
        this.f117226p.mo24756l().mo50373a(new bgpp(this));
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo43553c((int) ErrorInfo.TYPE_SDU_MEMORY_FULL);
        locationRequest.mo43554c(cezu.m138500u());
        locationRequest.mo43552b(cezu.m138499t());
        m99715a(locationRequest, "com.google.android.gms.location.quake.ACTION_PASSIVE");
        LocationRequest locationRequest2 = new LocationRequest();
        locationRequest2.mo43553c(100);
        locationRequest2.mo43554c(0L);
        locationRequest2.mo43552b(0L);
        locationRequest2.mo43551b(1);
        locationRequest2.mo43556d(0);
        locationRequest2.mo43549a(f117213b);
        m99715a(locationRequest2, "com.google.android.gms.location.quake.ACTION_ONESHOT");
    }

    /* renamed from: c */
    public final void mo63069c() {
        PendingIntent pendingIntent = this.f117216e;
        if (pendingIntent != null) {
            this.f117226p.mo24739c(pendingIntent);
        }
        PendingIntent pendingIntent2 = this.f117217f;
        if (pendingIntent2 != null) {
            this.f117226p.mo24739c(pendingIntent2);
        }
        BroadcastReceiver broadcastReceiver = this.f117218h;
        if (broadcastReceiver != null) {
            this.f117214c.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: d */
    public final Location mo63078d() {
        return this.f117219i;
    }

    /* renamed from: e */
    public final Location mo63079e() {
        return this.f117220j;
    }

    /* renamed from: f */
    public final Location mo63080f() {
        return this.f117221k;
    }

    /* renamed from: g */
    public final Long mo63081g() {
        return this.f117222l;
    }

    /* renamed from: h */
    public final bgsr mo63082h() {
        Location location = this.f117225o;
        Location location2 = this.f117219i;
        if (location == location2) {
            return this.f117223m;
        }
        if (location2 != null) {
            this.f117223m = this.f117215d.mo63138a(location2, cezu.m138498s());
            this.f117225o = this.f117219i;
        } else {
            this.f117223m = bgsr.f117451a;
        }
        bgsr bgsr = this.f117223m;
        int i = bgsr.f117453c;
        Long.toHexString(bgsr.f117454d);
        bgsr bgsr2 = this.f117223m;
        boolean z = bgsr2.f117452b;
        return bgsr2;
    }

    /* renamed from: i */
    public final boolean mo63083i() {
        return mo63082h().f117452b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* renamed from: a */
    private final void m99715a(LocationRequest locationRequest, String str) {
        char c;
        PendingIntent pendingIntent;
        LocationRequestInternal a = LocationRequestInternal.m66889a("qaccelmonitor", locationRequest);
        a.f79426h = "com.google.android.gms.location";
        a.mo43611a();
        int hashCode = str.hashCode();
        if (hashCode != 996145535) {
            if (hashCode == 1524400710 && str.equals("com.google.android.gms.location.quake.ACTION_PASSIVE")) {
                c = 1;
                if (c == 0) {
                    pendingIntent = m99714a(str);
                    this.f117217f = pendingIntent;
                } else if (c == 1) {
                    pendingIntent = m99714a(str);
                    this.f117216e = pendingIntent;
                } else {
                    return;
                }
                this.f117226p.mo24726a(a, pendingIntent);
            }
        } else if (str.equals("com.google.android.gms.location.quake.ACTION_ONESHOT")) {
            c = 0;
            if (c == 0) {
            }
            this.f117226p.mo24726a(a, pendingIntent);
        }
        c = 65535;
        if (c == 0) {
        }
        this.f117226p.mo24726a(a, pendingIntent);
    }

    /* renamed from: a */
    public final int mo63067a() {
        if (this.f117219i != null) {
            return mo63082h().f117452b ? 3 : 1;
        }
        return 2;
    }

    /* renamed from: a */
    public final synchronized void mo63077a(Location location) {
        if (location != null) {
            this.f117219i = location;
            if (aeim.m51906j(location) == 1) {
                if (cezu.m138487h()) {
                    this.f117222l = Long.valueOf(location.getTime() - System.currentTimeMillis());
                }
                this.f117220j = location;
            } else {
                this.f117221k = location;
            }
            if (this.f117224n) {
                this.f117474g.mo63137a();
                this.f117224n = false;
            }
        }
    }
}
