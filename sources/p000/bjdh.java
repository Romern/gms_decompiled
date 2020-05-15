package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.userlocation.SemanticLocationUpdateSubscription;

/* renamed from: bjdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjdh implements bhqx {

    /* renamed from: a */
    private final SemanticLocationUpdateRequest f122546a;

    /* renamed from: b */
    private final SemanticLocationUpdateSubscription f122547b;

    /* renamed from: c */
    private final avxh f122548c;

    public bjdh(avxh avxh, SemanticLocationUpdateRequest semanticLocationUpdateRequest, SemanticLocationUpdateSubscription semanticLocationUpdateSubscription) {
        this.f122548c = avxh;
        this.f122546a = semanticLocationUpdateRequest;
        this.f122547b = semanticLocationUpdateSubscription;
    }

    /* renamed from: a */
    public final void mo64174a(bhqz bhqz) {
        int i = bhqz.f119365g;
        if (cggy.m145393d()) {
            if (Log.isLoggable("Places", 5)) {
                bioi.m102662c("Places", "SemanticLocationUpdateReceiver disabled via flag, ignoring result.");
            }
        } else if (i == 0 && bhqz.f119359a != 0) {
            avxh avxh = this.f122548c;
            if (avxh != null) {
                try {
                    avxh.mo51685a(Status.f30107a, bjdk.m103242a(bhqz, this.f122546a.f109585c.f109561b));
                } catch (RemoteException e) {
                    if (Log.isLoggable("Places", 5)) {
                        bioi.m102662c("Places", "SemanticLocationUpdateSubscription invalidated after callback failure");
                    }
                    this.f122547b.mo71748b();
                }
            } else {
                this.f122547b.mo71748b();
            }
        }
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("semanticLocationUpdateRequest", this.f122546a);
        return a.toString();
    }
}
