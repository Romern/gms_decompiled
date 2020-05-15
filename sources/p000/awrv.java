package p000;

import android.accounts.Account;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wallet.service.orchestration.GetInstrumentAvailabilityServerRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: awrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awrv implements Callable {

    /* renamed from: a */
    private final Account f94948a;

    /* renamed from: b */
    private final BuyFlowConfig f94949b;

    /* renamed from: c */
    private final awua f94950c;

    /* renamed from: d */
    private final awwo f94951d;

    public awrv(Account account, BuyFlowConfig buyFlowConfig, awua awua, awwo awwo) {
        this.f94948a = account;
        this.f94949b = buyFlowConfig;
        this.f94950c = awua;
        this.f94951d = awwo;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        byae byae;
        byah a = this.f94951d.mo52680a(this.f94949b.f110418b.f110406a, this.f94948a);
        bwki a2 = awrx.m80879a(a, ((Long) awie.f94400C.mo58455c()).longValue());
        if (a2 != null) {
            return a2;
        }
        bxvd da = bwke.f159958f.mo74144da();
        bmaj bmaj = bmaj.f128452m;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwke bwke = (bwke) da.f164949b;
        bmaj.getClass();
        bwke.f159961b = bmaj;
        int i = bwke.f159960a | 1;
        bwke.f159960a = i;
        bwke.f159962c = 1;
        bwke.f159960a = i | 2;
        if (!(a == null || (a.f165258a & 4) == 0)) {
            bwki bwki = a.f165260c;
            if (bwki == null) {
                bwki = bwki.f159970e;
            }
            bxtx bxtx = bwki.f159975d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwke bwke2 = (bwke) da.f164949b;
            bxtx.getClass();
            bwke2.f159960a |= 4;
            bwke2.f159963d = bxtx;
        }
        try {
            ServerResponse a3 = this.f94950c.mo52588a(this.f94949b, new GetInstrumentAvailabilityServerRequest(this.f94948a, (bwke) da.mo74062i()));
            if (a3.mo60050c() != 76) {
                Log.e("IsReadyToPayAction", String.format(Locale.US, "Error: ServerResponse was of unexpected type: %s", Integer.valueOf(a3.mo60050c())));
                return null;
            }
            bwki bwki2 = (bwki) a3.mo60052e();
            if (bwki2 == null) {
                Log.e("IsReadyToPayAction", "Error: InstrumentAvailability response was null!");
                return null;
            } else if ((bwki2.f159972a & 1) != 0) {
                return bwki2;
            } else {
                if (a != null) {
                    bxvd bxvd = (bxvd) a.mo74142c(5);
                    bxvd.mo73625a((bxvk) a);
                    byae = (byae) bxvd;
                } else {
                    byae = (byae) byah.f165256g.mo74144da();
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (byae.f164950c) {
                    byae.mo74035c();
                    byae.f164950c = false;
                }
                byah byah = (byah) byae.f164949b;
                int i2 = byah.f165258a | 1;
                byah.f165258a = i2;
                byah.f165259b = currentTimeMillis;
                bwki2.getClass();
                byah.f165260c = bwki2;
                byah.f165258a = i2 | 4;
                this.f94951d.mo52681a(this.f94949b.f110418b.f110406a, this.f94948a, (byah) byae.mo74062i());
                return bwki2;
            }
        } catch (RemoteException e) {
            Log.e("IsReadyToPayAction", "Error: InstrumentAvailability fetch failed!", e);
            return null;
        }
    }
}
