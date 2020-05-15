package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: awst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awst implements Runnable {

    /* renamed from: a */
    private final aeat f95057a;

    /* renamed from: b */
    private final awwo f95058b;

    /* renamed from: c */
    private final Account f95059c;

    /* renamed from: d */
    private final bmqt f95060d;

    public awst(Context context, Account account, bmqt bmqt) {
        aeat a = aeat.m51532a(context);
        awwo awwo = new awwo(context);
        this.f95057a = a;
        this.f95058b = awwo;
        this.f95059c = account;
        this.f95060d = bmqt;
    }

    public final void run() {
        byae byae;
        bmqr bmqr;
        bmqr bmqr2;
        if (this.f95059c != null) {
            int b = (int) chjz.m148852b();
            byah a = this.f95058b.mo52680a(b, this.f95059c);
            if (a == null) {
                byae = (byae) byah.f165256g.mo74144da();
            } else {
                bxvd bxvd = (bxvd) a.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a);
                byae = (byae) bxvd;
            }
            byaf byaf = ((byah) byae.f164949b).f165262e;
            if (byaf == null) {
                byaf = byaf.f165243d;
            }
            bxvd bxvd2 = (bxvd) byaf.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) byaf);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            byaf byaf2 = (byaf) bxvd2.f164949b;
            int i = 1;
            byaf2.f165245a |= 1;
            byaf2.f165246b = true;
            bmqt bmqt = this.f95060d;
            if (bmqt.f130427b == 2) {
                bmqr = (bmqr) bmqt.f130428c;
            } else {
                bmqr = bmqr.f130414c;
            }
            ByteString bxtx = bmqr.f130417b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            byaf byaf3 = (byaf) bxvd2.f164949b;
            bxtx.getClass();
            byaf3.f165245a |= 2;
            byaf3.f165247c = bxtx;
            if (byae.f164950c) {
                byae.mo74035c();
                byae.f164950c = false;
            }
            byah byah = (byah) byae.f164949b;
            byaf byaf4 = (byaf) bxvd2.mo74062i();
            byaf4.getClass();
            byah.f165262e = byaf4;
            byah.f165258a |= 16;
            this.f95058b.mo52681a(b, this.f95059c, (byah) byae.mo74062i());
            bmqt bmqt2 = this.f95060d;
            if (bmqt2.f130427b == 2) {
                bmqr2 = (bmqr) bmqt2.f130428c;
            } else {
                bmqr2 = bmqr.f130414c;
            }
            int a2 = bmqq.m108292a(bmqr2.f130416a);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 == 3) {
                i = 0;
            }
            aeat aeat = this.f95057a;
            aebi aebi = new aebi();
            aebi.f63097i = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            aebi.mo34023a(0);
            aebi.f63099k = "INSTANTBUY_REFRESH_INSTRUMENT_AVAILABILITY";
            aebi.mo34004a(0, TimeUnit.MINUTES.toSeconds(1));
            aebi.mo34024a(i, i);
            aeat.mo33984a(aebi.mo33974b());
            return;
        }
        Log.e("RefreshInstrAvlGcmRec", "Missing account in ServerPushMessage");
    }
}
