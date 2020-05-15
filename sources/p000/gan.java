package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: gan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gan implements gai {

    /* renamed from: a */
    private final int f17791a;

    /* renamed from: b */
    private final fzz f17792b;

    public gan(fzz fzz, int i) {
        this.f17792b = fzz;
        this.f17791a = i;
    }

    /* renamed from: a */
    public final void mo11592a(Context context, fzw fzw) {
        Log.e("DeleteStateOp", "API is not available anymore.");
        try {
            this.f17792b.mo11574b(this.f17791a);
        } catch (RemoteException e) {
        }
    }
}
