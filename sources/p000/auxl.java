package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.trustlet.place.tracker.GeofenceTracker$GeofenceReceiver;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: auxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxl implements auxu {

    /* renamed from: a */
    public static final aunx f92715a = new aunx("TrustAgent.Tracker", "GeofenceTracker");

    /* renamed from: j */
    private static WeakReference f92716j = new WeakReference(null);

    /* renamed from: b */
    public final Map f92717b = new HashMap();

    /* renamed from: c */
    public final Map f92718c = new HashMap();

    /* renamed from: d */
    public final rjx f92719d;

    /* renamed from: e */
    private final Context f92720e;

    /* renamed from: f */
    private int f92721f;

    /* renamed from: g */
    private final Object f92722g = new Object();

    /* renamed from: h */
    private boolean f92723h;

    /* renamed from: i */
    private final GeofenceTracker$GeofenceReceiver f92724i;

    public auxl(Context context) {
        this.f92720e = context;
        this.f92719d = aeie.m51876a(context);
        synchronized (this.f92722g) {
            this.f92724i = new GeofenceTracker$GeofenceReceiver(this);
            this.f92723h = false;
        }
        mo51023a(0);
    }

    /* renamed from: a */
    public static synchronized auxl m78036a(Context context) {
        auxl auxl;
        synchronized (auxl.class) {
            auxl = (auxl) f92716j.get();
            if (auxl == null) {
                auxl = new auxl(context.getApplicationContext());
                f92716j = new WeakReference(auxl);
            }
        }
        return auxl;
    }

    /* renamed from: c */
    private final void m78037c() {
        int length;
        HashSet hashSet = new HashSet();
        synchronized (this.f92722g) {
            for (Map.Entry entry : this.f92717b.entrySet()) {
                hashSet.addAll((Collection) entry.getValue());
            }
        }
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        if (strArr == null || (length = strArr.length) == 0) {
            if (this.f92721f > 0) {
                mo51022a();
            }
        } else if (((long) length) < chal.f188193a.mo6606a().mo84876f()) {
            auza auza = new auza(this.f92720e);
            int i = 0;
            for (String str : strArr) {
                boolean z = true;
                i++;
                if (i < strArr.length) {
                    z = false;
                }
                auza.mo51070a(str, Boolean.valueOf(z), new auxk(this));
            }
        } else {
            f92715a.mo50711a("Geofence API request limit is reached.", new Object[0]).mo50706a();
        }
    }

    /* renamed from: b */
    public final PendingIntent mo51027b() {
        Intent intent = new Intent("com.google.android.gms.auth.trustagent.trustlet.ACTION_PERSONAL_GEOFENCE");
        intent.setPackage(this.f92720e.getPackageName());
        intent.setComponent(new ComponentName(this.f92720e, auxl.class));
        return PendingIntent.getBroadcast(this.f92720e, 0, becl.m91781a(intent, 134217728), 134217728);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51022a() {
        f92715a.mo50711a("removing geofences", new Object[0]).mo50708c();
        this.f92719d.mo24741d(mo51027b());
        mo51023a(0);
    }

    /* renamed from: b */
    public final void mo51028b(auxt auxt) {
        synchronized (this.f92722g) {
            this.f92717b.remove(auxt);
            if (this.f92717b.isEmpty()) {
                if (this.f92721f > 0) {
                    mo51022a();
                }
                f92715a.mo50711a("removeGeofences()", new Object[0]);
                if (this.f92723h) {
                    this.f92720e.unregisterReceiver(this.f92724i);
                    this.f92723h = false;
                }
            } else {
                m78037c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51023a(int i) {
        aunx aunx = f92715a;
        StringBuilder sb = new StringBuilder(28);
        sb.append("total geofences: ");
        sb.append(i);
        aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
        this.f92721f = i;
    }

    /* renamed from: a */
    public final void mo51024a(auxt auxt) {
        synchronized (this.f92722g) {
            if (this.f92717b.isEmpty()) {
                f92715a.mo50711a("startTracking", new Object[0]);
                IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.trustagent.trustlet.ACTION_PERSONAL_GEOFENCE");
                synchronized (this.f92722g) {
                    if (!this.f92723h) {
                        this.f92720e.registerReceiver(this.f92724i, intentFilter, "com.google.android.gms.permission.INTERNAL_BROADCAST", null);
                        this.f92723h = true;
                    }
                    for (auxt auxt2 : this.f92717b.keySet()) {
                        auxt2.mo51019c();
                    }
                    m78037c();
                }
            }
            if (!this.f92717b.containsKey(auxt)) {
                this.f92717b.put(auxt, new HashSet());
            }
            if (this.f92723h) {
                auxt.mo51019c();
            }
        }
    }

    /* renamed from: b */
    public final void mo51029b(auxt auxt, String str) {
        if (TextUtils.isEmpty(str)) {
            f92715a.mo50711a("The place id is empty.", new Object[0]).mo50708c();
            return;
        }
        synchronized (this.f92722g) {
            if (this.f92717b.containsKey(auxt)) {
                ((HashSet) this.f92717b.get(auxt)).remove(str);
                m78037c();
                return;
            }
            f92715a.mo50711a("The caller for geofence requests hasn't registered yet.", new Object[0]).mo50708c();
        }
    }

    /* renamed from: c */
    public final void mo51030c(auxt auxt) {
        synchronized (this.f92722g) {
            if (!this.f92717b.containsKey(auxt)) {
                f92715a.mo50711a("The caller for geofence requests hasn't registered yet.", new Object[0]).mo50708c();
                return;
            }
            ((HashSet) this.f92717b.get(auxt)).clear();
            m78037c();
        }
    }

    /* renamed from: a */
    public final void mo51025a(auxt auxt, String str) {
        aunx aunx = f92715a;
        String valueOf = String.valueOf(auxt);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("addGeofence(");
        sb.append(valueOf);
        sb.append(")");
        aunx.mo50711a(sb.toString(), new Object[0]);
        if (TextUtils.isEmpty(str)) {
            f92715a.mo50711a("The place id is empty.", new Object[0]).mo50708c();
            return;
        }
        synchronized (this.f92722g) {
            if (this.f92717b.containsKey(auxt)) {
                ((HashSet) this.f92717b.get(auxt)).add(str);
                m78037c();
                return;
            }
            f92715a.mo50711a("The caller for geofence requests hasn't registered yet.", new Object[0]).mo50708c();
        }
    }

    /* renamed from: a */
    public final void mo51026a(auxt auxt, String[] strArr) {
        aunx aunx = f92715a;
        String valueOf = String.valueOf(auxt);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("addGeofences(");
        sb.append(valueOf);
        sb.append(")");
        aunx.mo50711a(sb.toString(), new Object[0]);
        if (strArr.length == 0) {
            f92715a.mo50711a("The place id list is empty.", new Object[0]).mo50708c();
            return;
        }
        synchronized (this.f92722g) {
            if (this.f92717b.containsKey(auxt)) {
                Collections.addAll((Collection) this.f92717b.get(auxt), strArr);
                m78037c();
                return;
            }
            f92715a.mo50711a("The caller for geofence requests hasn't registered yet.", new Object[0]).mo50708c();
        }
    }
}
