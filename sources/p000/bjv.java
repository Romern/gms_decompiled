package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.trustlet.face.internal.FaceUnlockTrustletChimeraService;

/* renamed from: bjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjv extends dck implements IInterface {

    /* renamed from: a */
    final /* synthetic */ FaceUnlockTrustletChimeraService f3406a;

    public bjv() {
        super("com.android.facelock.ITrustedFaceCallback");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjv(FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService) {
        super("com.android.facelock.ITrustedFaceCallback");
        this.f3406a = faceUnlockTrustletChimeraService;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            boolean a = dcl.m8167a(parcel);
            parcel.readFloat();
            if (a) {
                FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService = this.f3406a;
                int i2 = FaceUnlockTrustletChimeraService.f109217m;
                faceUnlockTrustletChimeraService.f109221k.sendEmptyMessage(2);
            } else {
                FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService2 = this.f3406a;
                int i3 = FaceUnlockTrustletChimeraService.f109217m;
                faceUnlockTrustletChimeraService2.f109221k.sendEmptyMessage(5);
            }
        } else if (i != 2) {
            return false;
        } else {
            FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService3 = this.f3406a;
            int i4 = FaceUnlockTrustletChimeraService.f109217m;
            faceUnlockTrustletChimeraService3.f109221k.sendEmptyMessage(3);
        }
        return true;
    }
}
