package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;

/* renamed from: ftd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ftd extends ftk {

    /* renamed from: a */
    private final aucf f17219a;

    public ftd(aucf aucf) {
        this.f17219a = aucf;
    }

    /* renamed from: a */
    public final void mo11185a(GetRecentContextCall$Response getRecentContextCall$Response) {
        rpc.m34202a(getRecentContextCall$Response.f9554a, getRecentContextCall$Response.f9555b, this.f17219a);
    }

    /* renamed from: a */
    public final void mo11304a(Status status) {
        rpc.m34202a(status, null, this.f17219a);
    }

    /* renamed from: a */
    public final void mo11305a(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        rpc.m34202a(status, parcelFileDescriptor, this.f17219a);
    }
}
