package p000;

import android.os.Parcel;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Response;

@Deprecated
/* renamed from: aprk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aprk extends aprn implements sjr {
    /* renamed from: a */
    public final void mo47551a(aprl aprl) {
        GetNativeApiInfoCall$Response getNativeApiInfoCall$Response = new GetNativeApiInfoCall$Response();
        getNativeApiInfoCall$Response.f107444a = new Status(8, "API Disabled");
        getNativeApiInfoCall$Response.f107445b = new NativeApiInfo(null, null, null);
        Parcel bj = aprl.mo8529bj();
        dcl.m8165a(bj, getNativeApiInfoCall$Response);
        aprl.mo8530c(2, bj);
    }
}
