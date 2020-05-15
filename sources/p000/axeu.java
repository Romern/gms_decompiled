package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;

/* renamed from: axeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axeu extends axfa {
    public axeu(TransferParams transferParams, Intent intent) {
        super(transferParams, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo53095a(axim axim) {
        Bundle bundle = new Bundle();
        bundle.putString("draft_token", axim.f95997a);
        bundle.putLong("amount_in_micros", mo53111w().f150177b);
        bundle.putString("amount_currency", mo53111w().f150178c);
        bundle.putString("memo", mo53112x());
        bundle.putString("draft_title", axim.f96005i);
        bundle.putInt("transfer_type", 0);
        return bundle;
    }

    /* renamed from: b */
    public final String mo53079b(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_attaching);
    }

    /* renamed from: d */
    public final boolean mo53084d() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo53091i() {
        return false;
    }

    /* renamed from: a */
    public final String mo53075a(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_attach_request);
    }

    /* renamed from: a */
    public final void mo53076a(Context context, axif axif, Account account, axls axls, axls axls2) {
        if (chlb.m148912b()) {
            axls.mo53097a(btsj.f150218c);
        } else {
            super.mo53076a(context, axif, account, axls, axls2);
        }
    }

    /* renamed from: a */
    public final void mo53077a(axif axif, Account account, axhe axhe) {
        axhe.mo53148a();
    }
}
