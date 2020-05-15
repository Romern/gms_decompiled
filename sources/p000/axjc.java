package p000;

import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;
import com.google.android.gms.walletp2p.internal.zeroparty.Transaction;
import java.util.List;

/* renamed from: axjc */
public final /* synthetic */ class axjc implements axls {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96033a;

    public axjc(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96033a = transferMoneyChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        Transaction transaction;
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96033a;
        axil axil = (axil) obj;
        if (!transferMoneyChimeraActivity.isDestroyed()) {
            transferMoneyChimeraActivity.mo53238P(43);
            transferMoneyChimeraActivity.f110723k.setVisibility(4);
            transferMoneyChimeraActivity.mo60190b(15);
            transferMoneyChimeraActivity.f110724l.setVisibility(8);
            String str = axil.f95991a;
            sdo.m34959a((Object) str);
            axmp.m82728a(transferMoneyChimeraActivity).edit().putString("currencycode", str).apply();
            String str2 = transferMoneyChimeraActivity.f110725m.f110644c;
            int i = 0;
            if (str2 != null && !str2.equals(str)) {
                String string = transferMoneyChimeraActivity.getString(C0126R.string.walletp2p_currency_mismatch, new Object[]{transferMoneyChimeraActivity.f110725m.f110644c, str});
                Log.e("WalletP2P", string);
                transferMoneyChimeraActivity.mo60185a(new ErrorDetails(transferMoneyChimeraActivity.getString(C0126R.string.common_something_went_wrong), string, null, null, null, null, true));
            } else if (chlh.m148921b() && transferMoneyChimeraActivity.f110736x.mo53093k() && (transaction = transferMoneyChimeraActivity.f110725m.f110650i) != null && !transaction.f110835e.equalsIgnoreCase(str)) {
                transferMoneyChimeraActivity.mo53238P(171);
                transferMoneyChimeraActivity.mo60185a(new ErrorDetails(transferMoneyChimeraActivity.f110736x.mo53085e(transferMoneyChimeraActivity), transferMoneyChimeraActivity.f110736x.mo53087f(transferMoneyChimeraActivity), null, null, null, null, true));
            } else {
                btsb btsb = transferMoneyChimeraActivity.f110725m.f110643b;
                bxvd bxvd = (bxvd) btsb.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) btsb);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                btsb btsb2 = (btsb) bxvd.f164949b;
                btsb btsb3 = btsb.f150174d;
                str.getClass();
                btsb2.f150176a |= 2;
                btsb2.f150178c = str;
                transferMoneyChimeraActivity.f110725m.f110643b = (btsb) bxvd.mo74062i();
                transferMoneyChimeraActivity.f110728p = axil.f95992b;
                transferMoneyChimeraActivity.f110729q = axil.f95993c;
                transferMoneyChimeraActivity.f110730r = axil.f95995e;
                transferMoneyChimeraActivity.f110731s = axil.f95996f;
                transferMoneyChimeraActivity.f110732t = axil.f95994d;
                if (transferMoneyChimeraActivity.f110735w == null) {
                    List list = transferMoneyChimeraActivity.f110728p;
                    int size = list.size();
                    Instrument instrument = null;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        Instrument instrument2 = (Instrument) list.get(i);
                        int i2 = instrument2.f110823d;
                        if (i2 == 1) {
                            instrument = instrument2;
                            break;
                        }
                        if (instrument == null && i2 == 2) {
                            instrument = instrument2;
                        }
                        i++;
                    }
                    transferMoneyChimeraActivity.f110735w = instrument;
                    transferMoneyChimeraActivity.mo53238P(44);
                }
                transferMoneyChimeraActivity.mo60195j();
            }
        }
    }
}
