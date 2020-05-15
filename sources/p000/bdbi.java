package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bdbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdbi implements bdbk {

    /* renamed from: a */
    private final Map f105265a = new HashMap();

    /* renamed from: a */
    public final List mo57849a(String str) {
        if (this.f105265a.containsKey(str)) {
            return new ArrayList((Collection) this.f105265a.get(str));
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public final void mo57850a(String str, List list) {
        this.f105265a.put(str, list);
    }
}
