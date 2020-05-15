package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: bhxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhxv implements bhyf {

    /* renamed from: a */
    final /* synthetic */ bhxw f119851a;

    public bhxv(bhxw bhxw) {
        this.f119851a = bhxw;
    }

    /* renamed from: a */
    public final void mo64403a(int i, Map map) {
        bhxw bhxw = this.f119851a;
        if (!bhxw.f119856e && bhxw.f119857f.f119877h) {
            if (i == 0 || i == -1) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    String str = ((bhyw) entry.getKey()).f119920b;
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, new HashSet());
                    }
                    ((Set) hashMap.get(str)).addAll((Collection) entry.getValue());
                }
                for (bhxn bhxn : this.f119851a.f119853b) {
                    List a = biag.m101850a(bhxn.f119830b.f109594c);
                    HashSet hashSet = new HashSet();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = (String) a.get(i2);
                        if (hashMap.containsKey(str2)) {
                            hashSet.addAll((Collection) hashMap.get(str2));
                        }
                    }
                    bhxw bhxw2 = this.f119851a;
                    if (bhxw2.f119857f.f119870a.contains(bhxn)) {
                        bhxw2.f119857f.mo64413a(new ArrayList(hashSet), bhxn, true);
                    }
                }
            } else if (bhxw.f119855d > cgfr.m145055j()) {
                this.f119851a.mo64404a();
                bhxw bhxw3 = this.f119851a;
                bhxw3.f119857f.f119870a.removeAll(bhxw3.f119853b);
                if (Log.isLoggable("Places", 6)) {
                    StringBuilder sb = new StringBuilder(93);
                    sb.append("Exceeded maximum network backoff time, fetching nearby places failed with status: ");
                    sb.append(i);
                    bioi.m102658a("Places", sb.toString());
                }
            } else {
                this.f119851a.f119857f.f119871b.postDelayed(new bhxu(this, this.f119851a.f119855d * cgfr.m145056k()), this.f119851a.f119855d);
            }
        }
    }
}
