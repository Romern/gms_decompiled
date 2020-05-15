package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: gtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gtt implements rjh, rjj {

    /* renamed from: a */
    private final Bundle f19003a;

    public gtt(Bundle bundle) {
        this.f19003a = bundle;
    }

    /* renamed from: a */
    public final Bundle mo12209a() {
        return new Bundle(this.f19003a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gtt) {
            Bundle a = mo12209a();
            Bundle a2 = ((gtt) obj).mo12209a();
            if (a.size() == a2.size()) {
                for (String str : a.keySet()) {
                    if (!a2.containsKey(str) || !sdg.m34949a(a.get(str), a2.get(str))) {
                        return false;
                    }
                    while (r3.hasNext()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Bundle a = mo12209a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size + size);
        ArrayList arrayList2 = new ArrayList(a.keySet());
        Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) arrayList2.get(i);
            arrayList.add(str);
            arrayList.add(a.get(str));
        }
        return Arrays.hashCode(new Object[]{arrayList});
    }
}
