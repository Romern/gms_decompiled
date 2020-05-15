package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: gvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gvk implements rkk, gwo {

    /* renamed from: a */
    public final Status f19075a;

    /* renamed from: b */
    public final boolean f19076b;

    public gvk(Status status, boolean z) {
        this.f19075a = status;
        this.f19076b = z;
    }

    /* renamed from: b */
    public final Bundle mo12266b() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("status", sef.m35074a(this.f19075a));
        bundle.putBoolean("boolean", this.f19076b);
        return bundle;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f19075a;
    }
}
