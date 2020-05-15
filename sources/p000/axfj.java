package p000;

import android.content.Intent;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;

/* renamed from: axfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axfj {
    /* renamed from: a */
    public static axfi m82570a(TransferParams transferParams, Intent intent) {
        switch (transferParams.f110646e) {
            case 1:
            case 6:
                return new axfk(transferParams, intent);
            case 2:
                if (intent.getBooleanExtra("draft_mode", false)) {
                    return new axeu(transferParams, intent);
                }
                if (transferParams.f110651j) {
                    return new axew(transferParams, intent);
                }
                return new axfa(transferParams, intent);
            case 3:
                if (intent.getBooleanExtra("draft_mode", false)) {
                    return new axev(transferParams, intent);
                }
                if (transferParams.f110651j) {
                    return new axex(transferParams, intent);
                }
                return new axff(transferParams, intent);
            case 4:
                return new axet(transferParams, intent);
            case 5:
                Intent intent2 = new Intent(intent);
                intent2.putExtra("transfer_type", 1);
                return new axfg(transferParams, intent2);
            default:
                throw new IllegalArgumentException("Unrecognized mode: 16843134");
        }
    }
}
