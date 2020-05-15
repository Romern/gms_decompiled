package p000;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: aqdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqdm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aqdn f85778a;

    public aqdm(aqdn aqdn) {
        this.f85778a = aqdn;
    }

    public final void run() {
        apyk apyk = new apyk(this.f85778a.f85140b);
        String str = this.f85778a.f85139a;
        HashSet hashSet = new HashSet(apyk.f85144b.getStringSet("snet_verify_apps_api_usage", Collections.emptySet()));
        if (!hashSet.contains(str)) {
            hashSet.add(str);
            apyk.mo47703a("snet_verify_apps_api_usage", hashSet);
        }
    }
}
