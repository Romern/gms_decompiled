package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: gwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gwl implements rkk, gwo {

    /* renamed from: a */
    public final Status f19124a;

    /* renamed from: b */
    public final bngx f19125b;

    public gwl(Status status, bngx bngx) {
        this.f19124a = status;
        this.f19125b = bngx;
    }

    /* renamed from: b */
    public final Bundle mo12266b() {
        Bundle bundle = new Bundle();
        adbw.m50145a(bundle, "status", this.f19124a);
        bngx bngx = this.f19125b;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("parcelables", new ArrayList(bngx));
        bundle.putBundle("parcelables", bundle2);
        return bundle;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f19124a;
    }
}
