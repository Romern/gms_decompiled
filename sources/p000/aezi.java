package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.lockbox.internal.LockboxOptInFlags;

/* renamed from: aezi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezi implements aeyi, rkk {

    /* renamed from: a */
    private final Status f64039a;

    /* renamed from: b */
    private final aeyi f64040b;

    public aezi(Status status, aeyi aeyi) {
        this.f64039a = status;
        this.f64040b = aeyi;
    }

    /* renamed from: b */
    public final String mo34650b() {
        return ((LockboxOptInFlags) this.f64040b).f79796a;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f64039a;
    }

    /* renamed from: c */
    public final boolean mo34651c() {
        return ((LockboxOptInFlags) this.f64040b).f79797b;
    }

    /* renamed from: d */
    public final boolean mo34652d() {
        return ((LockboxOptInFlags) this.f64040b).f79798c;
    }
}
