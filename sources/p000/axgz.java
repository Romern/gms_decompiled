package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;
import java.util.List;

/* renamed from: axgz */
public final /* synthetic */ class axgz implements axls {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95930a;

    /* renamed from: b */
    private final String f95931b;

    public axgz(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity, String str) {
        this.f95930a = completeMoneyTransferChimeraActivity;
        this.f95931b = str;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        Instrument instrument;
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95930a;
        String str = this.f95931b;
        axil axil = (axil) obj;
        if (completeMoneyTransferChimeraActivity.isDestroyed()) {
            return;
        }
        if (axil.f95992b.isEmpty()) {
            completeMoneyTransferChimeraActivity.mo53238P(126);
            completeMoneyTransferChimeraActivity.mo60174j();
            return;
        }
        completeMoneyTransferChimeraActivity.mo53238P(127);
        List list = axil.f95992b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                instrument = null;
                break;
            }
            instrument = (Instrument) list.get(i);
            i++;
            if (instrument.f110820a.equals(str)) {
                break;
            }
        }
        if (instrument == null) {
            completeMoneyTransferChimeraActivity.mo53238P(128);
            completeMoneyTransferChimeraActivity.mo60164a(new ErrorDetails(completeMoneyTransferChimeraActivity.getString(C0126R.string.walletp2p_instrument_fix_required_title), completeMoneyTransferChimeraActivity.getString(C0126R.string.walletp2p_instrument_fix_required_content), null, null, null, null, false));
            return;
        }
        completeMoneyTransferChimeraActivity.f110668m = instrument;
        if (completeMoneyTransferChimeraActivity.mo60173i()) {
            completeMoneyTransferChimeraActivity.mo60167a(completeMoneyTransferChimeraActivity.getString(C0126R.string.walletp2p_instrument_fix_required_title), completeMoneyTransferChimeraActivity.getString(C0126R.string.walletp2p_instrument_fix_required_content));
        } else {
            completeMoneyTransferChimeraActivity.mo60163a(completeMoneyTransferChimeraActivity.f110673r);
        }
    }
}
