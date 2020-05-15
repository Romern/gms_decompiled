package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: fjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fjn extends fix {

    /* renamed from: a */
    public final Map f16741a = new HashMap(4);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10877a(fix fix) {
        ((fjn) fix).f16741a.putAll(this.f16741a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f16741a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("dimension");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return fix.m11795a(hashMap);
    }
}
