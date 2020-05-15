package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;
import java.util.List;

/* renamed from: axgk */
public final /* synthetic */ class axgk implements axls {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95911a;

    public axgk(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95911a = completeMoneyTransferChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95911a;
        axil axil = (axil) obj;
        if (completeMoneyTransferChimeraActivity.f110668m != null) {
            List list = axil.f95992b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Instrument instrument = (Instrument) list.get(i);
                if (instrument.f110820a.equals(completeMoneyTransferChimeraActivity.f110668m.f110820a) && instrument.f110823d == 1) {
                    completeMoneyTransferChimeraActivity.mo53238P(102);
                    completeMoneyTransferChimeraActivity.mo60163a(completeMoneyTransferChimeraActivity.f110673r);
                    return;
                }
            }
        }
        completeMoneyTransferChimeraActivity.mo60167a(completeMoneyTransferChimeraActivity.getString(C0126R.string.walletp2p_instrument_fix_required_title), completeMoneyTransferChimeraActivity.getString(C0126R.string.walletp2p_instrument_fix_required_content));
    }
}
