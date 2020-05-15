package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ashu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ashu {

    /* renamed from: a */
    public final Map f88995a = new HashMap();

    /* renamed from: b */
    public static final String m74148b(byte[] bArr) {
        int hashCode = Arrays.hashCode(bArr);
        StringBuilder sb = new StringBuilder(14);
        sb.append("sig");
        sb.append(hashCode);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map mo49163a() {
        return Collections.unmodifiableMap(new HashMap(this.f88995a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49164a(byte[] bArr) {
        this.f88995a.put(m74148b(bArr), bArr);
    }
}
