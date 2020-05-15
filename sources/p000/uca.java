package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: uca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uca {

    /* renamed from: a */
    public final Map f47228a = new HashMap();

    /* renamed from: b */
    public final Map f47229b = new HashMap();

    /* renamed from: c */
    private final long f47230c = ((Long) twy.f46866ax.mo58455c()).longValue();

    /* renamed from: a */
    public final synchronized List mo27227a(String str) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f47228a.entrySet()) {
            if (SystemClock.elapsedRealtime() - ((ubz) entry.getValue()).f47227b > this.f47230c) {
                arrayList.add((String) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f47228a.remove((String) arrayList.get(i));
        }
        return this.f47228a.containsKey(str) ? ((ubz) this.f47228a.get(str)).f47226a : Collections.emptyList();
    }

    /* renamed from: a */
    public final synchronized boolean mo27228a(String str, ucb ucb) {
        boolean containsKey;
        List list;
        containsKey = this.f47229b.containsKey(str);
        if (containsKey) {
            list = (List) this.f47229b.get(str);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f47229b.put(str, arrayList);
            list = arrayList;
        }
        if (ucb != null) {
            list.add(ucb);
        }
        return containsKey;
    }
}
