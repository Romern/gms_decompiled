package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: all */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class all {

    /* renamed from: c */
    public static final all f838c = new all(new Bundle(), null);

    /* renamed from: a */
    public final Bundle f839a;

    /* renamed from: b */
    List f840b;

    public all(Bundle bundle, List list) {
        this.f839a = bundle;
        this.f840b = list;
    }

    /* renamed from: a */
    public static all m1016a(Bundle bundle) {
        if (bundle != null) {
            return new all(bundle, null);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo975b() {
        if (this.f840b == null) {
            ArrayList<String> stringArrayList = this.f839a.getStringArrayList("controlCategories");
            this.f840b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f840b = Collections.emptyList();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo976c() {
        mo975b();
        return this.f840b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof all)) {
            return false;
        }
        all all = (all) obj;
        mo975b();
        all.mo975b();
        return this.f840b.equals(all.f840b);
    }

    public final int hashCode() {
        mo975b();
        return this.f840b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(mo974a().toArray()) + " }";
    }

    /* renamed from: a */
    public final List mo974a() {
        mo975b();
        return this.f840b;
    }
}
