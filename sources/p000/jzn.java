package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;

/* renamed from: jzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jzn extends jxi {

    /* renamed from: a */
    final /* synthetic */ kaa f23580a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jzn(kaa kaa, Context context) {
        super(context);
        this.f23580a = kaa;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        jds jds = new jds(this.f23580a.getActivity());
        boolean z = false;
        try {
            Boolean bool = (Boolean) jds.mo13605a(new jdo());
            if (bool == null) {
                Log.w("FrpClient", "isChallengeRequired(): null");
            } else {
                z = bool.booleanValue();
            }
        } catch (RemoteException | InterruptedException e) {
            Log.w("FrpClient", e);
        }
        return Pair.create(Boolean.valueOf(z), Boolean.valueOf(jds.mo13606a()));
    }
}
