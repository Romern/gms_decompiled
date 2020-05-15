package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.UserLocationNearbyLikelihood;
import com.google.android.location.places.NearbyAlertSubscription;
import com.google.android.places.Subscription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bglt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bglt implements bhxm {

    /* renamed from: a */
    final /* synthetic */ Context f116798a;

    /* renamed from: b */
    final /* synthetic */ bhrd f116799b;

    /* renamed from: c */
    final /* synthetic */ NearbyAlertSubscription f116800c;

    public bglt(NearbyAlertSubscription nearbyAlertSubscription, Context context, bhrd bhrd) {
        this.f116800c = nearbyAlertSubscription;
        this.f116798a = context;
        this.f116799b = bhrd;
    }

    /* renamed from: a */
    public final PlacesParams mo62993a() {
        return this.f116800c.f150837c;
    }

    /* renamed from: a */
    public final void mo62994a(int i, int i2, List list, Bundle bundle) {
        ArrayList arrayList;
        Bundle bundle2 = bundle;
        try {
            Context context = this.f116798a;
            NearbyAlertSubscription nearbyAlertSubscription = this.f116800c;
            PendingIntent pendingIntent = nearbyAlertSubscription.f150838d;
            PendingIntent pendingIntent2 = nearbyAlertSubscription.f150839e;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bhzs bhzs = (bhzs) it.next();
                    arrayList.add(new UserLocationNearbyLikelihood(bhzs.f119985a, bhzs.f119986b, bhzs.f119987c, bhzs.f119989e));
                }
            } else {
                arrayList = null;
            }
            avxc a = avxc.m79474a(i2, arrayList, i);
            Intent intent = new Intent();
            intent.putExtra("com.google.android.userlocation.extra.nearby_status", a.f94054a);
            List list2 = a.f94055b;
            if (list2 != null) {
                sef.m35072a(list2, intent, "com.google.android.userlocation.extra.nearby_likelihoods");
            }
            intent.putExtra("com.google.android.userlocation.extra.nearby_transition", a.f94056c);
            if (bundle2 != null) {
                intent.putExtra("nearby_alert_debug_data", bundle2);
            }
            intent.putExtra("com.google.android.gms.userlocation.UserLocationNearbyAlertResult.LEGACY_CALL_INTENT_EXTRA", pendingIntent2);
            bidk.m102023a(context, intent, pendingIntent);
        } catch (PendingIntent.CanceledException e) {
            ((bhri) this.f116799b).mo64183a((Subscription) this.f116800c);
        }
    }
}
