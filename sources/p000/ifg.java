package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

/* renamed from: ifg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ifg {

    /* renamed from: c */
    private static final sek f20854c = new sek("AuthZenRpcEventHandler");

    /* renamed from: a */
    private final ikj f20855a;

    /* renamed from: b */
    private final igk f20856b;

    public ifg(Context context, ikj ikj) {
        this.f20855a = ikj;
        this.f20856b = new igk(context, new ifj());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12960a(Context context, Intent intent) {
        boolean z;
        try {
            byrz a = this.f20856b.mo12995a(intent.getStringExtra("syncPayload"));
            if (intent.hasExtra("txRequest")) {
                bysa bysa = bysa.ENROLLMENT;
                if (a.f167530a.ordinal() == 5) {
                    Bundle extras = intent.getExtras();
                    try {
                        bypc bypc = (bypc) bxvk.m124014a(bypc.f167305k, extras.getByteArray("txRequest"));
                        byph byph = (byph) bxvk.m124014a(byph.f167342b, a.f167531b);
                        ikj.m15597a(bypc.f167308b.mo73780k(), 24, context);
                        if (this.f20855a.mo13090a(bypc.f167308b.mo73780k()) != null) {
                            if (byph == null || byph.f167344a.size() != 1) {
                                z = false;
                            } else {
                                z = byph.f167344a.mo73730b(0);
                            }
                            if (z) {
                                f20854c.mo25414c("Server trigger was activated", new Object[0]);
                            }
                            f20854c.mo25414c("Showing prompt for TxSync response (transaction id=%s)", ikj.m15598b(bypc.f167308b.mo73780k()));
                            this.f20855a.mo13091a(context, bypc, extras.getString("account"), extras.getByteArray("keyHandle"), z);
                        }
                    } catch (bxwf e) {
                        f20854c.mo25417e("Unable to parse proto ", e, new Object[0]);
                    }
                }
            }
        } catch (bxwf | igj | InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
            f20854c.mo25417e("exception while decoding SyncTx response ", e2, new Object[0]);
        }
    }
}
