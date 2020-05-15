package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: gwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gwm implements rkk, gwo {

    /* renamed from: a */
    public final Status f19126a;

    /* renamed from: b */
    public final bmxv f19127b;

    public gwm(Status status, bmxv bmxv) {
        this.f19126a = status;
        this.f19127b = bmxv;
    }

    /* renamed from: b */
    public final Bundle mo12266b() {
        Bundle bundle = new Bundle();
        adbw.m50145a(bundle, "status", this.f19126a);
        if (this.f19127b.mo66813a()) {
            adbw.m50145a(bundle, "parcelable", (SafeParcelable) this.f19127b.mo66814b());
        }
        return bundle;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f19126a;
    }
}
