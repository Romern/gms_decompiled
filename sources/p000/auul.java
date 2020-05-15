package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.trustlet.face.internal.FaceUnlockTrustletChimeraService;

/* renamed from: auul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auul extends aeaa {

    /* renamed from: a */
    final /* synthetic */ FaceUnlockTrustletChimeraService f92551a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public auul(FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService, String str) {
        super(str);
        this.f92551a = faceUnlockTrustletChimeraService;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        Log.e("Coffee-FULTrustlet", "Unexpected disconnect from service");
        this.f92551a.f109221k.sendEmptyMessage(1);
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f92551a.f109220j) {
            FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService = this.f92551a;
            blf blf = null;
            bjx bjx = null;
            if (faceUnlockTrustletChimeraService.f109222l == 2) {
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.facelock.ITrustedFaceInterface");
                    if (!(queryLocalInterface instanceof bjx)) {
                        bjx = new bjw(iBinder);
                    } else {
                        bjx = (bjx) queryLocalInterface;
                    }
                }
                faceUnlockTrustletChimeraService.f109218h = bjx;
            } else {
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.android.internal.policy.IFaceLockInterface");
                    if (!(queryLocalInterface2 instanceof blf)) {
                        blf = new C0054ble(iBinder);
                    } else {
                        blf = (blf) queryLocalInterface2;
                    }
                }
                faceUnlockTrustletChimeraService.f109219i = blf;
            }
            this.f92551a.f109221k.sendEmptyMessage(0);
        }
    }
}
