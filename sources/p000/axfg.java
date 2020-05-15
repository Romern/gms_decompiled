package p000;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;

/* renamed from: axfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axfg extends axff {
    protected axfg(TransferParams transferParams, Intent intent) {
        super(transferParams, intent);
    }

    /* renamed from: b */
    public final boolean mo53080b() {
        return true;
    }

    /* renamed from: e */
    public final String mo53085e(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_currency_mismatch_settle_title);
    }

    /* renamed from: f */
    public final String mo53087f(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_currency_mismatch_settle_body);
    }

    /* renamed from: g */
    public final boolean mo53089g() {
        return true;
    }

    /* renamed from: j */
    public final boolean mo53092j() {
        return true;
    }

    /* renamed from: k */
    public final boolean mo53093k() {
        return true;
    }

    /* renamed from: l */
    public final boolean mo53094l() {
        return false;
    }
}
