package com.google.android.contextmanager.fence;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceFenceHelper extends aacn {

    /* renamed from: a */
    public final Context f7705a;

    /* renamed from: b */
    public final HashMap f7706b;

    /* renamed from: c */
    public final aemi f7707c;

    /* renamed from: d */
    public final boolean f7708d;

    /* renamed from: e */
    public int f7709e = 1000001;

    /* renamed from: f */
    public long f7710f = dwq.m9665i().mo20505a();

    /* renamed from: g */
    private final int f7711g;

    public PlaceFenceHelper(Context context) {
        super("contextmanager");
        this.f7705a = context;
        this.f7706b = new HashMap();
        aemh aemh = new aemh();
        aemh.f63516b = "com.google.android.contextmanager.producer.module.PlacesProducer";
        this.f7707c = aemh.mo34328a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.gms.contextmanager.NEARBY_ALERTS");
        intentFilter.addAction("android.gms.contextmanager.GEOFENCE");
        context.registerReceiver(this, intentFilter);
        aeie.m51876a(dwq.m9662f()).mo24741d(PendingIntent.getBroadcast(this.f7705a, 0, new Intent("android.gms.contextmanager.GEOFENCE"), 134217728)).mo50371a(new dqi("[PlaceFenceHelper] resetGeofences", new Object[0]));
        this.f7708d = cdho.f180915a.mo6606a().mo77622a();
        this.f7711g = (int) cdgp.f180782a.mo6606a().mo77557ab();
    }

    /* renamed from: a */
    private final int m4875a(Intent intent) {
        int i;
        String action = intent.getAction();
        if (action.equals("android.gms.contextmanager.NEARBY_ALERTS")) {
            aele a = aele.m52094a(intent);
            if (a == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("com.google.android.contextmanager.fence.PlaceFenceHelper", "a", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[PlaceFenceHelper] NearbyBuffer is null!");
                return -1;
            }
            i = a.f63482b;
            a.mo12460c();
        } else if (action.equals("android.gms.contextmanager.GEOFENCE")) {
            aehl a2 = aehl.m51844a(intent);
            if (a2.mo34148a()) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68432a("com.google.android.contextmanager.fence.PlaceFenceHelper", "a", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68409a("[PlaceFenceHelper] Geofence intent error %d", a2.f63402a);
                return -1;
            }
            i = a2.f63403b;
        } else {
            new Object[1][0] = action;
            i = -1;
        }
        if (i == 1 || i == 2) {
            return i;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo6264b(dvd dvd) {
        List a = dug.m9367a(dvd);
        if (a.isEmpty()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("com.google.android.contextmanager.fence.PlaceFenceHelper", "b", 509, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[PlaceFenceHelper] NearbyAlert record not found for %s", dvd);
            return;
        }
        int size = a.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            duh duh = (duh) this.f7706b.get((dug) a.get(i));
            if (duh != null) {
                duh.f14039a.remove(dvd);
                z |= !duh.mo9613a();
            }
        }
        if (z) {
            mo6261a();
        }
    }

    /* renamed from: a */
    private static String m4876a(dug dug) {
        String valueOf = String.valueOf(UUID.nameUUIDFromBytes(((String) dug.f14038b).getBytes()));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("ctxmgr:");
        sb.append(valueOf);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m4877a(dvd dvd) {
        return (dvd == null || dvd.f14075b == 4 || (TextUtils.isEmpty(dvd.mo9701n()) && dvd.mo9695a().isEmpty() && dvd.mo9697j().isEmpty())) ? false : true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final float mo6260a(aelh aelh) {
        float f;
        new Object[1][0] = aelh.mo8007a();
        float f2 = (float) this.f7711g;
        if (f2 > 0.0f) {
            new Object[1][0] = Float.valueOf(f2);
            return f2;
        }
        LatLngBounds g = aelh.mo8013g();
        if (g != null) {
            LatLng latLng = g.f79896a;
            double d = latLng.f79894a;
            double d2 = latLng.f79895b;
            LatLng latLng2 = g.f79897b;
            f = ((float) ayuo.m84846b(d, d2, latLng2.f79894a, latLng2.f79895b)) * 0.4f;
            new Object[1][0] = Float.valueOf(f);
        } else {
            Object[] objArr = {aelh.mo8007a(), Float.valueOf(150.0f)};
            f = 150.0f;
        }
        float max = Math.max(150.0f, Math.min(f, 250.0f));
        new Object[1][0] = Float.valueOf(max);
        return max;
    }

    /* renamed from: a */
    public final void mo6261a() {
        Iterator it = this.f7706b.keySet().iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            dug dug = (dug) it.next();
            duh duh = (duh) this.f7706b.get(dug);
            if (!duh.mo9613a()) {
                if (duh.f14041c != 0) {
                    arrayList.add(m4876a(dug));
                } else {
                    aema.m52141a(dwq.m9662f(), this.f7707c).mo34301e(duh.f14040b).mo50371a(new dqi("[PlaceFenceHelper] removePlaceFence", new Object[0]));
                }
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            aeie.m51876a(dwq.m9662f()).mo24697a((List) arrayList).mo50371a(new dqi("[PlaceFenceHelper] removeGeofences", new Object[0]));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int i;
        dug dug;
        int intExtra;
        String action = intent.getAction();
        if (action.equals("android.gms.contextmanager.NEARBY_ALERTS")) {
            aele a = aele.m52094a(intent);
            if (a == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("com.google.android.contextmanager.fence.PlaceFenceHelper", "a", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[PlaceFenceHelper] NearbyBuffer is null!");
                i = -1;
                if (i != -1) {
                    String stringExtra = intent.getStringExtra("extraPlaceChain");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        new Object[1][0] = stringExtra;
                        dug = dug.m9366a(stringExtra);
                    } else {
                        dug = null;
                    }
                    if (dug == null) {
                        String stringExtra2 = intent.getStringExtra("extraPlaceId");
                        if (!TextUtils.isEmpty(stringExtra2)) {
                            new Object[1][0] = stringExtra2;
                            dug = dug.m9368b(stringExtra2);
                        }
                    }
                    if (dug == null && (intExtra = intent.getIntExtra("extraPlaceType", -1)) >= 0) {
                        new Object[1][0] = Integer.valueOf(intExtra);
                        dug = dug.m9365a(intExtra);
                    }
                    if (dug == null) {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                        bnsl2.mo68432a("com.google.android.contextmanager.fence.PlaceFenceHelper", "a", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("[PlaceFenceHelper] Cannot extract key from %s", intent);
                        return;
                    }
                    dwq.m9667k().mo9435a(new duc(this, dug, i), dqy.m9123a("PlaceFenceHelper_onReceive"));
                    return;
                }
                new Object[1][0] = -1;
                return;
            }
            i = a.f63482b;
            a.mo12460c();
        } else if (action.equals("android.gms.contextmanager.GEOFENCE")) {
            aehl a2 = aehl.m51844a(intent);
            if (a2.mo34148a()) {
                bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                bnsl3.mo68432a("com.google.android.contextmanager.fence.PlaceFenceHelper", "a", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("[PlaceFenceHelper] Geofence intent error %d", a2.f63402a);
                i = -1;
                if (i != -1) {
                }
            } else {
                i = a2.f63403b;
            }
        } else {
            new Object[1][0] = action;
            i = -1;
        }
        if (!(i == 1 || i == 2)) {
            i = -1;
        }
        if (i != -1) {
        }
    }

    /* renamed from: a */
    public final void mo6262a(dug dug, int i) {
        duh duh = (duh) this.f7706b.get(dug);
        if (duh == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("com.google.android.contextmanager.fence.PlaceFenceHelper", "a", 208, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[PlaceFenceHelper] No record for NearbyAlertKey");
            return;
        }
        long a = dwq.m9665i().mo20505a();
        for (dvd dvd : duh.f14039a.keySet()) {
            int i2 = 0;
            new Object[1][0] = Integer.valueOf(i);
            dwq.m9650G().mo9372a();
            int i3 = dvd.f14162f;
            if (i != 2) {
                i2 = i == 1 ? 1 : i3;
            }
            if (i2 != i3) {
                dvd.f14163g = i3;
                dvd.f14162f = i2;
                dvd.f14164h = a;
                if (i2 != 1 || dvd.mo9700m() <= 0) {
                    dwq.m9648E().mo9558a(dvd.f14077d);
                } else {
                    dwq.m9648E().mo9554a(dvd.mo9700m(), dvd.f14077d);
                }
            }
        }
        if (a - this.f7710f < 86400000 || this.f7706b.isEmpty()) {
            this.f7710f = a;
            return;
        }
        this.f7710f = a;
        mo6261a();
    }

    /* renamed from: a */
    public final void mo6263a(String str, double d, double d2, float f, dvd dvd, dug dug) {
        Double valueOf = Double.valueOf(d);
        Double valueOf2 = Double.valueOf(d2);
        Float valueOf3 = Float.valueOf(f);
        Object[] objArr = {str, valueOf, valueOf2, valueOf3};
        aehf aehf = new aehf();
        aehf.f63389b = 3;
        aehf.f63388a = m4876a(dug);
        aehf.mo34147b();
        aehf.f63392e = 0;
        aehf.mo34146a(d, d2, f);
        ParcelableGeofence a = aehf.mo34145a();
        aehm aehm = new aehm();
        aehm.mo34153b(3);
        aehm.mo34150a(a);
        GeofencingRequest a2 = aehm.mo34149a();
        Intent intent = new Intent("android.gms.contextmanager.GEOFENCE");
        intent.putExtra("extraPlaceId", str);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f7705a, 0, intent, 134217728);
        duh duh = new duh(broadcast, 1);
        duh.mo9612a(dvd);
        this.f7706b.put(dug, duh);
        aeie.m51876a(dwq.m9662f()).mo24684a(a2, broadcast).mo50371a(new duf(this, "[PlaceFenceHelper] adding Geofence (%f, %f, %f)", new Object[]{valueOf, valueOf2, valueOf3}, dug));
    }
}
