package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;

/* renamed from: axew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axew extends axfa {
    protected axew(TransferParams transferParams, Intent intent) {
        super(transferParams, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo53095a(axim axim) {
        Bundle bundle = new Bundle();
        bundle.putString("recipient_html", axim.f95999c);
        bundle.putString("recipient_html_signature", axim.f96000d);
        bundle.putString("recipient_details_title", axim.f96002f);
        bundle.putString("recipient_details_subtitle", axim.f96003g);
        bundle.putString("recipient_details_action", axim.f96004h);
        bundle.putString("transaction_token", axim.f95998b);
        bundle.putString("transaction_url", axim.f96001e);
        bundle.putString("memo", mo53112x());
        bundle.putLong("amount_in_micros", mo53111w().f150177b);
        bundle.putString("amount_currency", mo53111w().f150178c);
        bundle.putInt("transfer_type", 0);
        return bundle;
    }

    /* renamed from: b */
    public final String mo53079b(Context context) {
        return mo53106r() ? context.getResources().getString(C0126R.string.walletp2p_requesting) : context.getResources().getString(C0126R.string.walletp2p_attaching);
    }

    /* renamed from: c */
    public final String mo53081c(Context context) {
        return mo53106r() ? context.getResources().getString(C0126R.string.walletp2p_request_sent) : context.getResources().getString(C0126R.string.walletp2p_attached);
    }

    /* renamed from: d */
    public final boolean mo53084d() {
        return true;
    }

    /* renamed from: a */
    public final String mo53075a(Context context) {
        return mo53106r() ? context.getResources().getString(C0126R.string.walletp2p_request_money) : context.getResources().getString(C0126R.string.walletp2p_attach_request);
    }
}
