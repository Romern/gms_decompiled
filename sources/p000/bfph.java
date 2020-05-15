package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

/* renamed from: bfph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfph implements sqt {

    /* renamed from: p */
    public static final /* synthetic */ int f114761p = 0;

    /* renamed from: q */
    private static final String[] f114762q = {"android:monitor_location", "android:monitor_location_high_power"};

    /* renamed from: r */
    private static final String[] f114763r = {"android:monitor_location"};

    /* renamed from: s */
    private static final String[] f114764s = new String[0];

    /* renamed from: a */
    public final int f114765a;

    /* renamed from: b */
    public final String f114766b;

    /* renamed from: c */
    public final LocationRequestInternal f114767c;

    /* renamed from: d */
    public final boolean f114768d;

    /* renamed from: e */
    public final boolean f114769e;

    /* renamed from: f */
    protected final int f114770f;

    /* renamed from: g */
    public final bfra f114771g;

    /* renamed from: h */
    public long f114772h;

    /* renamed from: i */
    public int f114773i;

    /* renamed from: j */
    public Location f114774j;

    /* renamed from: k */
    public long f114775k = 0;

    /* renamed from: l */
    public boolean f114776l;

    /* renamed from: m */
    public boolean f114777m;

    /* renamed from: n */
    final Context f114778n;

    /* renamed from: o */
    final bfpd f114779o;

    /* renamed from: t */
    private LocationAvailability f114780t;

    public bfph(Context context, int i, String str, LocationRequestInternal locationRequestInternal, boolean z, boolean z2, bfpd bfpd) {
        boolean z3 = true;
        this.f114776l = true;
        this.f114777m = true;
        this.f114778n = context;
        int i2 = Build.VERSION.SDK_INT;
        if (!z2 || !"com.google.android.gms".equals(str) || !"com.google.android.gms.location.reporting".equals(locationRequestInternal.f79426h)) {
            this.f114765a = i;
            this.f114766b = str;
        } else {
            if (bhbm.m100588a(context)) {
                bhbr a = bhbr.m100591a(context);
                if (!"com.google.android.gms.location.history".equals(a.mo63528a())) {
                    a.mo63533a("com.google.android.gms.location.history");
                }
            }
            bhbm.m100589b(context);
            this.f114765a = bhbm.f118262a;
            bhbm.m100589b(context);
            this.f114766b = bhbm.f118263b;
            locationRequestInternal.mo43613a(bngx.m109356a(new ClientIdentity(this.f114765a, this.f114766b)));
        }
        this.f114767c = locationRequestInternal;
        this.f114773i = 0;
        this.f114774j = null;
        this.f114768d = (!z || locationRequestInternal.f79424f) ? false : z3;
        this.f114769e = z2;
        this.f114779o = bfpd;
        this.f114770f = new bhcl(context).mo63552a(str);
        this.f114771g = new bfra(SystemClock.elapsedRealtime());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo62084a(LocationAvailability locationAvailability);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo62085a(List list);

    /* renamed from: a */
    public abstract boolean mo62086a();

    /* renamed from: a */
    public final boolean mo62091a(int i) {
        if (i == 1) {
            return false;
        }
        if (!(i == 2 || i == 3 || i == 4)) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Invalid deliveryResult: ");
            sb.append(i);
            Log.wtf("GCoreFlp", new IllegalArgumentException(sb.toString()));
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo62087b();

    /* renamed from: b */
    public final boolean mo62092b(LocationAvailability locationAvailability) {
        NetworkLocationStatus[] networkLocationStatusArr;
        boolean z = true;
        if (this.f114769e) {
            LocationAvailability locationAvailability2 = this.f114780t;
            if (locationAvailability2 != null && locationAvailability2.mo43544a() == locationAvailability.mo43544a()) {
                LocationAvailability locationAvailability3 = this.f114780t;
                if (locationAvailability3.f79345b == locationAvailability.f79345b && locationAvailability3.f79344a == locationAvailability.f79344a && ((networkLocationStatusArr = locationAvailability.f79348e) == null || networkLocationStatusArr.length <= 0)) {
                    z = false;
                    this.f114780t = locationAvailability;
                    return z;
                }
            }
        } else {
            LocationAvailability locationAvailability4 = this.f114780t;
            if (locationAvailability4 != null && locationAvailability4.mo43544a() == locationAvailability.mo43544a()) {
                z = false;
                this.f114780t = locationAvailability;
                return z;
            }
        }
        int a = mo62084a(locationAvailability);
        if (mo62091a(a)) {
            this.f114779o.mo62083a();
        }
        if (a != 1) {
            z = false;
        }
        this.f114780t = locationAvailability;
        return z;
    }

    /* renamed from: c */
    public final void mo62093c() {
        this.f114779o.mo62083a();
    }

    /* renamed from: j */
    public final int mo9757j() {
        return this.f114765a;
    }

    /* renamed from: k */
    public final String mo9758k() {
        return this.f114766b;
    }

    /* renamed from: l */
    public final String mo9759l() {
        return this.f114767c.f79429k;
    }

    /* renamed from: m */
    public final String[] mo9760m() {
        LocationRequestInternal locationRequestInternal = this.f114767c;
        return !locationRequestInternal.f79423e ? (locationRequestInternal.f79420b.f79349a != 100 || !this.f114777m) ? f114763r : f114762q : f114764s;
    }

    /* renamed from: n */
    public final boolean mo9761n() {
        return this.f114767c.f79427i;
    }
}
