package com.google.android.places.signals;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignalManager$GeofenceBroadcastReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ bigx f151372a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignalManager$GeofenceBroadcastReceiver(bigx bigx) {
        super("places");
        this.f151372a = bigx;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.android.places.action.SIGNAL_MANAGER_GEOFENCE_RESULT".equals(intent.getAction())) {
            bigx bigx = this.f151372a;
            int[] iArr = bigx.f120549a;
            bigx.f120568r++;
            aehl a = aehl.m51844a(intent);
            if (bigx.m102369c()) {
                List list = bigx.f120555e;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((bigv) list.get(i)).mo64455a(a);
                }
            }
        }
    }
}
