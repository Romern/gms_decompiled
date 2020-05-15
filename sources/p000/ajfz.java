package p000;

import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;

/* renamed from: ajfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajfz extends buqn {

    /* renamed from: a */
    final /* synthetic */ GetPermissionStatusRequest f70548a;

    /* renamed from: b */
    final /* synthetic */ ajgf f70549b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfz(ajgf ajgf, String str, GetPermissionStatusRequest getPermissionStatusRequest) {
        super(str);
        this.f70549b = ajgf;
        this.f70548a = getPermissionStatusRequest;
    }

    public final void run() {
        aixw a = this.f70549b.mo38595a(this.f70548a.f80734d);
        GetPermissionStatusRequest getPermissionStatusRequest = this.f70548a;
        srn srn = ahfq.f67120a;
        ClientAppIdentifier clientAppIdentifier = a.f70028b;
        if (a.f70031e.mo38251b(getPermissionStatusRequest.f80732b)) {
            aixw.m58157a(getPermissionStatusRequest.f80732b);
        }
    }
}
