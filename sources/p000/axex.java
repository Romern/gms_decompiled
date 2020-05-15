package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;

/* renamed from: axex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axex extends axff {
    protected axex(TransferParams transferParams, Intent intent) {
        super(transferParams, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo53096a(axin axin) {
        Bundle bundle = new Bundle();
        bundle.putString("recipient_html", axin.f96009c);
        bundle.putString("recipient_html_signature", axin.f96010d);
        bundle.putString("recipient_details_title", axin.f96012f);
        bundle.putString("recipient_details_subtitle", axin.f96013g);
        bundle.putString("recipient_details_action", axin.f96014h);
        bundle.putString("transaction_token", axin.f96008b);
        bundle.putString("transaction_url", axin.f96011e);
        bundle.putString("memo", mo53112x());
        bundle.putLong("amount_in_micros", mo53111w().f150177b);
        bundle.putString("amount_currency", mo53111w().f150178c);
        bundle.putInt("transfer_type", 1);
        return bundle;
    }

    /* renamed from: b */
    public final String mo53079b(Context context) {
        return mo53106r() ? context.getResources().getString(C0126R.string.common_sending) : context.getResources().getString(C0126R.string.walletp2p_attaching);
    }

    /* renamed from: c */
    public final String mo53081c(Context context) {
        return mo53106r() ? context.getResources().getString(C0126R.string.walletp2p_sent_with) : context.getResources().getString(C0126R.string.walletp2p_attached);
    }

    /* renamed from: d */
    public final boolean mo53084d() {
        return true;
    }

    /* renamed from: a */
    public final String mo53075a(Context context) {
        return mo53106r() ? context.getResources().getString(C0126R.string.walletp2p_send_money) : context.getResources().getString(C0126R.string.walletp2p_attach_money);
    }
}
