package com.google.android.gms.trustlet.place.tracker;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationProviderTracker$LocationProviderStateChangedReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ auxp f109296a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationProviderTracker$LocationProviderStateChangedReceiver(auxp auxp) {
        super("trustlet_place");
        this.f109296a = auxp;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        aunx aunx = auxp.f92732a;
        String valueOf = String.valueOf(action);
        aunx.mo50711a(valueOf.length() == 0 ? new String("Receive location provider state changed action: ") : "Receive location provider state changed action: ".concat(valueOf), new Object[0]);
        boolean a = this.f109296a.mo51034a();
        if (this.f109296a.f92737f != a) {
            aunx aunx2 = auxp.f92732a;
            boolean z = this.f109296a.f92737f;
            StringBuilder sb = new StringBuilder(43);
            sb.append("Provider Enable state changed: ");
            sb.append(z);
            sb.append("->");
            sb.append(a);
            aunx2.mo50711a(sb.toString(), new Object[0]);
            this.f109296a.f92734c.mo51033a(a);
            this.f109296a.f92737f = a;
        }
    }
}
