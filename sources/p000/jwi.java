package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: jwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jwi extends jxi {

    /* renamed from: a */
    final /* synthetic */ PreAddAccountChimeraActivity f23401a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jwi(PreAddAccountChimeraActivity preAddAccountChimeraActivity, Context context, boolean z) {
        super(context, z);
        this.f23401a = preAddAccountChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        FrpSnapshot frpSnapshot;
        try {
            frpSnapshot = (FrpSnapshot) new jds(this.f23401a).mo13605a(new jdp());
        } catch (RemoteException | InterruptedException e) {
            Log.w("FrpClient", e);
            frpSnapshot = FrpSnapshot.m6645a();
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("loader_result_frp", sef.m35074a(frpSnapshot));
        return bundle;
    }
}
