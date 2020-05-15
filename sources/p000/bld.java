package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.trustlet.face.internal.FaceUnlockTrustletChimeraService;

/* renamed from: bld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bld extends dck implements IInterface {

    /* renamed from: a */
    final /* synthetic */ FaceUnlockTrustletChimeraService f5091a;

    public bld() {
        super("com.android.internal.policy.IFaceLockCallback");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bld(FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService) {
        super("com.android.internal.policy.IFaceLockCallback");
        this.f5091a = faceUnlockTrustletChimeraService;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService = this.f5091a;
            int i2 = FaceUnlockTrustletChimeraService.f109217m;
            faceUnlockTrustletChimeraService.f109221k.sendEmptyMessage(2);
        } else if (i == 2) {
            FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService2 = this.f5091a;
            int i3 = FaceUnlockTrustletChimeraService.f109217m;
            faceUnlockTrustletChimeraService2.f109221k.sendEmptyMessage(3);
        } else if (i == 3) {
            FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService3 = this.f5091a;
            int i4 = FaceUnlockTrustletChimeraService.f109217m;
            faceUnlockTrustletChimeraService3.f109221k.sendEmptyMessage(4);
        } else if (i != 4) {
            return false;
        } else {
            parcel.readInt();
        }
        return true;
    }
}
