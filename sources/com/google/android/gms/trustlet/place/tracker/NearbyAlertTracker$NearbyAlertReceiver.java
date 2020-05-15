package com.google.android.gms.trustlet.place.tracker;

import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearbyAlertTracker$NearbyAlertReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ auxs f109297a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyAlertTracker$NearbyAlertReceiver(auxs auxs) {
        super("trustlet_place");
        this.f109297a = auxs;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        aunx aunx = auxs.f92741a;
        String valueOf = String.valueOf(action);
        aunx.mo50711a(valueOf.length() == 0 ? new String("Receive action: ") : "Receive action: ".concat(valueOf), new Object[0]);
        if (!"com.google.android.gms.auth.trustagent.trustlet.ACTION_PERSONAL_NEARBY_ALERT".equals(action)) {
            return;
        }
        if (!intent.getPackage().equals(this.f109297a.f92744c.getPackageName())) {
            auxs.f92741a.mo50711a("Wrong package name from received intent.", new Object[0]).mo50706a();
            return;
        }
        aele a = aele.m52094a(intent);
        if (a != null && a.mo24660a() > 0 && a.f63483c.mo17710c()) {
            String a2 = a.mo24661a(0).mo34295bB().mo8007a();
            int i = a.f63482b;
            if (i == 1) {
                for (Map.Entry entry : this.f109297a.f92748g.entrySet()) {
                    if (((HashSet) entry.getValue()).contains(a2)) {
                        ((auxt) entry.getKey()).mo51016a(a2);
                    }
                }
            } else if (i == 2) {
                for (Map.Entry entry2 : this.f109297a.f92748g.entrySet()) {
                    if (((HashSet) entry2.getValue()).contains(a2)) {
                        ((auxt) entry2.getKey()).mo51018b(a2);
                    }
                }
            }
        } else if (a != null && !a.f63483c.mo17710c()) {
            for (Map.Entry entry3 : this.f109297a.f92748g.entrySet()) {
                ((auxt) entry3.getKey()).mo51015a(a.f63483c.f30115i);
            }
        } else if (a == null || a.mo24660a() <= 0) {
            auxs.f92741a.mo50711a("Nearby likelihood is empty", new Object[0]).mo50706a();
        }
        if (a != null) {
            a.mo12460c();
        }
    }
}
