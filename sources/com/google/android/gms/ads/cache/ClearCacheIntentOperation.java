package com.google.android.gms.ads.cache;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.cache.policy.C0219b;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClearCacheIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        C0371o.m5339a(getApplicationContext());
        C0387d.m5366d().mo6782a(getApplicationContext(), VersionInfoParcel.m5635a());
        C0198d a = C0203i.m5055a(this);
        if (a != null) {
            try {
                synchronized (a.f7847b) {
                    C0219b a2 = a.mo6388a();
                    ArrayList<C0217p> arrayList = new ArrayList();
                    for (String str : a2.mo6423a()) {
                        for (C0217p pVar : a2.mo6422a(str)) {
                            arrayList.add(pVar);
                        }
                    }
                    for (C0217p pVar2 : arrayList) {
                        a.mo6389a(pVar2);
                    }
                }
            } catch (C0200f e) {
                C0387d.m5366d().mo6783a(e, "ClearCacheIntentOperation");
            }
        }
    }
}
