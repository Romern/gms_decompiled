package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: alb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alb {

    /* renamed from: a */
    Bundle f814a;

    /* renamed from: b */
    final List f815b;

    /* renamed from: c */
    final boolean f816c;

    public alb(List list, boolean z) {
        this.f815b = list == null ? Collections.emptyList() : list;
        this.f816c = z;
    }

    /* renamed from: a */
    public static alb m996a(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(ako.m943a((Bundle) parcelableArrayList.get(i)));
            }
            arrayList = arrayList2;
        }
        return new alb(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(this.f815b.toArray()) + ", isValid=" + mo955a() + " }";
    }

    /* renamed from: a */
    public final boolean mo955a() {
        int size = this.f815b.size();
        for (int i = 0; i < size; i++) {
            ako ako = (ako) this.f815b.get(i);
            if (ako == null || !ako.mo918v()) {
                return false;
            }
        }
        return true;
    }
}
