package p000;

import android.util.SparseArray;
import com.google.android.gms.nearby.connection.Strategy;

/* renamed from: ahqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahqj {

    /* renamed from: a */
    public final SparseArray f67788a;

    public ahqj(ahov ahov, ahnp ahnp, ahne ahne, ahlh ahlh) {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(2, new ahpz(ahov, ahnp, ahne, ahlh));
        sparseArray.put(1, new ahqh(ahov, ahnp, ahne, ahlh));
        sparseArray.put(3, new ahqg(ahov, ahnp, ahne, ahlh));
        this.f67788a = sparseArray;
    }

    /* renamed from: a */
    public static final int m56374a(ahkv ahkv, Strategy strategy) {
        Strategy d = ahkv.mo36713d();
        if (d != null && !d.equals(strategy)) {
            if (ahkv.mo36719g() || ahkv.mo36728k()) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("Unable to change Strategy to %s, client is still advertising or discovering with Strategy %s", strategy, d);
                return 8008;
            } else if (ahkv.mo36736o().length > 0) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("Unable to change Strategy to %s, client still has connected endpoints with Strategy %s", strategy, d);
                return 8008;
            }
        }
        ahkv.mo36688a(strategy);
        return 0;
    }

    /* renamed from: a */
    public final ahqi mo36963a(ahkv ahkv) {
        Strategy d = ahkv.mo36713d();
        int i = 0;
        if (d != null) {
            if (Strategy.f80480a.equals(d)) {
                i = 2;
            } else if (Strategy.f80481b.equals(d)) {
                i = 1;
            } else if (!Strategy.f80482c.equals(d)) {
                srn srn = ahkm.f67363a;
            } else {
                i = 3;
            }
        }
        return (ahqi) this.f67788a.get(i);
    }
}
