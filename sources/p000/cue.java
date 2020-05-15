package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cue {

    /* renamed from: a */
    public final cvg f12052a;

    /* renamed from: b */
    public final Map f12053b;

    /* renamed from: c */
    public final byte[] f12054c;

    public cue(Map map, cvg cvg, byte[] bArr) {
        this.f12052a = cvg;
        this.f12053b = Collections.unmodifiableMap(new HashMap(map));
        this.f12054c = bArr;
    }

    /* renamed from: a */
    public final byte[] mo8297a(cuz cuz) {
        cvc cvc = (cvc) this.f12053b.get(cuz);
        return cvc == null ? new byte[0] : cvc.mo8323a();
    }
}
