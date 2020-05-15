package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ckt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ckt implements cjq {

    /* renamed from: a */
    private static final Set f6988a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: b */
    private final cjq f6989b;

    public ckt(cjq cjq) {
        this.f6989b = cjq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cjp mo3930a(Object obj, int i, int i2, cdk cdk) {
        return this.f6989b.mo3930a(new cjd(((Uri) obj).toString()), i, i2, cdk);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3931a(Object obj) {
        return f6988a.contains(((Uri) obj).getScheme());
    }
}
