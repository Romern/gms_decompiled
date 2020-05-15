package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: aqkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqkp implements rjh {

    /* renamed from: a */
    public final Bundle f86288a;

    private aqkp(Bundle bundle) {
        this.f86288a = bundle;
    }

    /* renamed from: a */
    public static aqkp m71760a(Bundle bundle) {
        return new aqkp(bundle);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aqkp)) {
            return false;
        }
        Bundle bundle = this.f86288a;
        Bundle bundle2 = ((aqkp) obj).f86288a;
        if (bundle.size() == bundle2.size()) {
            Set<String> keySet = bundle.keySet();
            if (keySet.containsAll(bundle2.keySet())) {
                for (String str : keySet) {
                    if (!sdg.m34949a(bundle.get(str), bundle2.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList(this.f86288a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        int i = 17;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            i = (((i * 31) + str.hashCode()) * 31) + Arrays.hashCode(new Object[]{this.f86288a.get(str)});
        }
        return i;
    }
}
