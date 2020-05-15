package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.google.android.gms.trustlet.place.internal.PlaceLure$UserPresentBroadcastReceiver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: auxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxh implements auxt {

    /* renamed from: a */
    public static final aunx f92702a = new aunx("TrustAgent", "PlaceLure");

    /* renamed from: b */
    public final Context f92703b;

    /* renamed from: c */
    public final Object f92704c = new Object();

    /* renamed from: d */
    public final Map f92705d = new HashMap();

    /* renamed from: e */
    public final Object f92706e = new Object();

    /* renamed from: f */
    public final Set f92707f = new HashSet();

    /* renamed from: g */
    public final SharedPreferences f92708g;

    /* renamed from: h */
    public auxu f92709h = null;

    /* renamed from: i */
    public boolean f92710i;

    /* renamed from: j */
    private final PlaceLure$UserPresentBroadcastReceiver f92711j;

    /* renamed from: k */
    private boolean f92712k = false;

    public auxh(Context context) {
        this.f92703b = context;
        this.f92710i = false;
        this.f92708g = aupo.m77578a(context);
        boolean b = chal.m147901b();
        this.f92712k = b;
        if (b) {
            this.f92709h = auxl.m78036a(this.f92703b);
        } else {
            this.f92709h = auxs.m78055a(this.f92703b);
        }
        this.f92709h.mo51024a(this);
        PlaceLure$UserPresentBroadcastReceiver placeLure$UserPresentBroadcastReceiver = new PlaceLure$UserPresentBroadcastReceiver(this);
        this.f92711j = placeLure$UserPresentBroadcastReceiver;
        this.f92703b.registerReceiver(placeLure$UserPresentBroadcastReceiver, new IntentFilter("android.intent.action.USER_PRESENT"));
    }

    /* renamed from: a */
    public final void mo51014a() {
        f92702a.mo50711a("destroy", new Object[0]).mo50708c();
        this.f92709h.mo51028b(this);
        this.f92709h = null;
        this.f92703b.unregisterReceiver(this.f92711j);
        this.f92710i = false;
    }

    /* renamed from: b */
    public final void mo51017b() {
        f92702a.mo50711a("clearPlaces", new Object[0]).mo50708c();
        if (this.f92710i) {
            auxu auxu = this.f92709h;
            if (auxu == null) {
                f92702a.mo50711a("Hasn't registered with any PlaceTracker.", new Object[0]).mo50706a();
            } else {
                auxu.mo51030c(this);
            }
        }
        synchronized (this.f92704c) {
            this.f92705d.clear();
        }
        synchronized (this.f92706e) {
            this.f92707f.clear();
        }
    }

    /* renamed from: c */
    public final void mo51019c() {
        f92702a.mo50711a("onTrackerReady", new Object[0]).mo50708c();
        this.f92710i = true;
        auxu auxu = this.f92709h;
        if (auxu == null) {
            f92702a.mo50711a("Hasn't registered with any PlaceTracker.", new Object[0]).mo50706a();
        } else {
            auxu.mo51026a(this, (String[]) this.f92705d.keySet().toArray(new String[0]));
        }
    }

    /* renamed from: a */
    public final void mo51015a(int i) {
        aunx aunx = f92702a;
        StringBuilder sb = new StringBuilder(41);
        sb.append("onTrustedPlaceDetectionError(");
        sb.append(i);
        sb.append(")");
        aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
        String str = "NearbyAlert";
        if (this.f92712k ? i != 1003 : i != 9101) {
            aunx aunx2 = f92702a;
            if (this.f92712k) {
                str = "Geofence";
            }
            StringBuilder sb2 = new StringBuilder(str.length() + 39);
            sb2.append("Unexpected error from ");
            sb2.append(str);
            sb2.append(" API: ");
            sb2.append(i);
            aunx2.mo50711a(sb2.toString(), new Object[0]).mo50706a();
            return;
        }
        aunx aunx3 = f92702a;
        if (this.f92712k) {
            str = "Geofence";
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 31);
        sb3.append("Reset ");
        sb3.append(str);
        sb3.append(" requests for all places.");
        aunx3.mo50711a(sb3.toString(), new Object[0]).mo50708c();
        this.f92707f.clear();
        this.f92709h.mo51030c(this);
        this.f92709h.mo51026a(this, (String[]) this.f92705d.keySet().toArray(new String[0]));
    }

    /* renamed from: b */
    public final void mo51018b(String str) {
        f92702a.mo50711a("onExitedTrustedPlace", new Object[0]).mo50708c();
        synchronized (this.f92706e) {
            if (this.f92707f.contains(str)) {
                this.f92707f.remove(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo51016a(String str) {
        f92702a.mo50711a("onEnteredTrustedPlace", new Object[0]).mo50708c();
        if (this.f92705d.containsKey(str)) {
            synchronized (this.f92706e) {
                this.f92707f.add(str);
            }
        }
    }
}
