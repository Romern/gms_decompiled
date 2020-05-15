package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ckr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ckr implements cjq {

    /* renamed from: a */
    private static final Set f6986a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: b */
    private final ckp f6987b;

    public ckr(ckp ckp) {
        this.f6987b = ckp;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cjp mo3930a(Object obj, int i, int i2, cdk cdk) {
        Uri uri = (Uri) obj;
        return new cjp(new cqm(uri), this.f6987b.mo3958a(uri));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3931a(Object obj) {
        return f6986a.contains(((Uri) obj).getScheme());
    }
}
