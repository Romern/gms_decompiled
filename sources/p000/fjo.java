package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: fjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fjo extends fix {

    /* renamed from: a */
    public final Map f16742a = new HashMap(4);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10877a(fix fix) {
        ((fjo) fix).f16742a.putAll(this.f16742a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f16742a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
            sb.append("metric");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return fix.m11795a(hashMap);
    }
}
