package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Set;

/* renamed from: gsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gsu implements rjh, rjj {

    /* renamed from: a */
    public final Bundle f18973a;

    public gsu(Bundle bundle) {
        this.f18973a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gsu)) {
            return false;
        }
        Bundle bundle = this.f18973a;
        Bundle bundle2 = ((gsu) obj).f18973a;
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
        return Arrays.hashCode(new Object[]{this.f18973a});
    }
}
