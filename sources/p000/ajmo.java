package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: ajmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajmo implements ajsn {

    /* renamed from: a */
    final /* synthetic */ ajyt f70925a;

    public ajmo(ajyt ajyt) {
        this.f70925a = ajyt;
    }

    /* renamed from: a */
    public final void mo38707a(ShareTarget shareTarget) {
        try {
            ajyt ajyt = this.f70925a;
            OnShareTargetDiscoveredParams onShareTargetDiscoveredParams = new ajzg().f71524a;
            onShareTargetDiscoveredParams.f81089a = shareTarget;
            ajyt.mo38774a(onShareTargetDiscoveredParams);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke onShareTargetDiscovered on registered share sheet.");
        }
    }

    /* renamed from: b */
    public final void mo38709b(ShareTarget shareTarget) {
        try {
            ajyt ajyt = this.f70925a;
            OnShareTargetLostParams onShareTargetLostParams = new ajzk().f71526a;
            onShareTargetLostParams.f81092a = shareTarget;
            ajyt.mo38776a(onShareTargetLostParams);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke onShareTargetLost on registered share sheet.");
        }
    }

    /* renamed from: a */
    public final void mo38708a(ShareTarget shareTarget, int i) {
        try {
            ajyt ajyt = this.f70925a;
            OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams = new ajzi().f71525a;
            onShareTargetDistanceChangedParams.f81090a = shareTarget;
            onShareTargetDistanceChangedParams.f81091b = i;
            ajyt.mo38775a(onShareTargetDistanceChangedParams);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke onShareTargetDistanceChanged on registered share sheet.");
        }
    }
}
