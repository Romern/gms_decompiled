package com.google.android.gms.trustlet.place.tracker;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GeofenceTracker$GeofenceReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ auxl f109293a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GeofenceTracker$GeofenceReceiver(auxl auxl) {
        super("trustlet_place");
        this.f109293a = auxl;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        aunx aunx = auxl.f92715a;
        String valueOf = String.valueOf(action);
        aunx.mo50711a(valueOf.length() == 0 ? new String("Receive action: ") : "Receive action: ".concat(valueOf), new Object[0]).mo50708c();
        if (!"com.google.android.gms.auth.trustagent.trustlet.ACTION_PERSONAL_GEOFENCE".equals(action)) {
            return;
        }
        if (!intent.getPackage().equals(context.getPackageName())) {
            auxl.f92715a.mo50711a("Wrong package name from received intent.", new Object[0]).mo50706a();
            return;
        }
        aehl a = aehl.m51844a(intent);
        if (a.mo34148a()) {
            aunx aunx2 = auxl.f92715a;
            int i = a.f63402a;
            StringBuilder sb = new StringBuilder(36);
            sb.append("Geofence returned error: ");
            sb.append(i);
            aunx2.mo50711a(sb.toString(), new Object[0]).mo50706a();
            for (Map.Entry entry : this.f109293a.f92717b.entrySet()) {
                ((auxt) entry.getKey()).mo51015a(a.f63402a);
            }
            return;
        }
        List list = a.f63404c;
        if (list == null || list.isEmpty()) {
            auxl.f92715a.mo50711a("triggering geofences is empty", new Object[0]).mo50706a();
            return;
        }
        int i2 = a.f63403b;
        if (i2 == 1) {
            for (Map.Entry entry2 : this.f109293a.f92717b.entrySet()) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    String str = ((ParcelableGeofence) list.get(i3)).f79438a;
                    if (((HashSet) entry2.getValue()).contains(str)) {
                        ((auxt) entry2.getKey()).mo51016a(str);
                    }
                }
            }
        } else if (i2 == 2) {
            auxl.f92715a.mo50711a("exit", new Object[0]).mo50708c();
            for (Map.Entry entry3 : this.f109293a.f92717b.entrySet()) {
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    String str2 = ((ParcelableGeofence) list.get(i4)).f79438a;
                    if (((HashSet) entry3.getValue()).contains(str2)) {
                        ((auxt) entry3.getKey()).mo51018b(str2);
                    }
                }
            }
        }
    }
}
