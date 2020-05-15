package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: ajmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajmp implements ajud {

    /* renamed from: a */
    final /* synthetic */ ajyz f70926a;

    public ajmp(ajyz ajyz) {
        this.f70926a = ajyz;
    }

    /* renamed from: a */
    public final void mo38711a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        try {
            ajyz ajyz = this.f70926a;
            ajzm ajzm = new ajzm();
            ajzm.mo39098a(shareTarget);
            ajzm.mo39099a(transferMetadata);
            ajyz.mo38778a(ajzm.f71527a);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke onTransferUpdate on registered receive surface.");
        }
    }
}
