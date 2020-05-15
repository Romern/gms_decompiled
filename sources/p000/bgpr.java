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
import com.google.android.location.quake.LocationDataListenerOld$1;
import java.util.concurrent.TimeUnit;

/* renamed from: bgpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgpr extends bgsd {

    /* renamed from: a */
    public static final /* synthetic */ int f117227a = 0;

    /* renamed from: b */
    private static final long f117228b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: c */
    private final Context f117229c;

    /* renamed from: d */
    private final aesh f117230d;

    /* renamed from: e */
    private final bgst f117231e;

    /* renamed from: f */
    private PendingIntent f117232f;

    /* renamed from: h */
    private PendingIntent f117233h;

    /* renamed from: i */
    private BroadcastReceiver f117234i;

    /* renamed from: j */
    private Location f117235j;

    /* renamed from: k */
    private Location f117236k;

    /* renamed from: l */
    private Location f117237l;

    /* renamed from: m */
    private Long f117238m;

    /* renamed from: n */
    private bgsr f117239n = bgsr.f117451a;

    /* renamed from: o */
    private boolean f117240o = true;

    /* renamed from: p */
    private Location f117241p;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public bgpr(Context context, bgsq bgsq) {
        super(bgsq);
        this.f117229c = context;
        this.f117230d = new aesh(context);
        this.f117231e = new bgst(cezu.m138490k(), cezu.m138489j());
    }

    /* renamed from: a */
    private final PendingIntent m99726a(String str) {
        return PendingIntent.getBroadcast(this.f117229c, 0, new Intent(str), 134217728);
    }

    /* renamed from: b */
    public final void mo63068b() {
        this.f117234i = new LocationDataListenerOld$1(this, "location");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.location.quake.ACTION_ONESHOT");
        intentFilter.addAction("com.google.android.gms.location.quake.ACTION_PASSIVE");
        this.f117229c.registerReceiver(this.f117234i, intentFilter);
        this.f117230d.mo34501a();
        mo63084a(this.f117230d.mo34508c());
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo43553c((int) ErrorInfo.TYPE_SDU_MEMORY_FULL);
        locationRequest.mo43554c(cezu.m138500u());
        locationRequest.mo43552b(cezu.m138499t());
        m99727a(locationRequest, "com.google.android.gms.location.quake.ACTION_PASSIVE");
        LocationRequest locationRequest2 = new LocationRequest();
        locationRequest2.mo43553c(100);
        locationRequest2.mo43554c(0L);
        locationRequest2.mo43552b(0L);
        locationRequest2.mo43551b(1);
        locationRequest2.mo43556d(0);
        locationRequest2.mo43549a(f117228b);
        m99727a(locationRequest2, "com.google.android.gms.location.quake.ACTION_ONESHOT");
    }

    /* renamed from: c */
    public final void mo63069c() {
        PendingIntent pendingIntent = this.f117232f;
        if (pendingIntent != null) {
            this.f117230d.mo34504a(pendingIntent);
        }
        PendingIntent pendingIntent2 = this.f117233h;
        if (pendingIntent2 != null) {
            this.f117230d.mo34504a(pendingIntent2);
        }
        this.f117230d.mo34507b();
        BroadcastReceiver broadcastReceiver = this.f117234i;
        if (broadcastReceiver != null) {
            this.f117229c.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: d */
    public final Location mo63078d() {
        return this.f117235j;
    }

    /* renamed from: e */
    public final Location mo63079e() {
        return this.f117236k;
    }

    /* renamed from: f */
    public final Location mo63080f() {
        return this.f117237l;
    }

    /* renamed from: g */
    public final Long mo63081g() {
        return this.f117238m;
    }

    /* renamed from: h */
    public final bgsr mo63082h() {
        Location location = this.f117241p;
        Location location2 = this.f117235j;
        if (location == location2) {
            return this.f117239n;
        }
        if (location2 != null) {
            this.f117239n = this.f117231e.mo63138a(location2, cezu.m138498s());
            this.f117241p = this.f117235j;
        } else {
            this.f117239n = bgsr.f117451a;
        }
        bgsr bgsr = this.f117239n;
        int i = bgsr.f117453c;
        Long.toHexString(bgsr.f117454d);
        bgsr bgsr2 = this.f117239n;
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
    private final void m99727a(LocationRequest locationRequest, String str) {
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
                    pendingIntent = m99726a(str);
                    this.f117233h = pendingIntent;
                } else if (c == 1) {
                    pendingIntent = m99726a(str);
                    this.f117232f = pendingIntent;
                } else {
                    return;
                }
                this.f117230d.mo34506a(a, pendingIntent);
            }
        } else if (str.equals("com.google.android.gms.location.quake.ACTION_ONESHOT")) {
            c = 0;
            if (c == 0) {
            }
            this.f117230d.mo34506a(a, pendingIntent);
        }
        c = 65535;
        if (c == 0) {
        }
        this.f117230d.mo34506a(a, pendingIntent);
    }

    /* renamed from: a */
    public final int mo63067a() {
        if (this.f117235j != null) {
            return mo63082h().f117452b ? 3 : 1;
        }
        return 2;
    }

    /* renamed from: a */
    public final synchronized void mo63084a(Location location) {
        if (location != null) {
            this.f117235j = location;
            if (aeim.m51906j(location) == 1) {
                if (cezu.m138487h()) {
                    this.f117238m = Long.valueOf(location.getTime() - System.currentTimeMillis());
                }
                this.f117236k = location;
            } else {
                this.f117237l = location;
            }
            if (this.f117240o) {
                this.f117474g.mo63137a();
                this.f117240o = false;
            }
        }
    }
}
