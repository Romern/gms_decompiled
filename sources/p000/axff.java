package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;
import java.util.List;

/* renamed from: axff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class axff extends axfi {
    protected axff(TransferParams transferParams, Intent intent) {
        super(transferParams, intent);
    }

    /* renamed from: a */
    public final int mo53073a() {
        return 1;
    }

    /* renamed from: b */
    public String mo53079b(Context context) {
        if (chlq.m148935b()) {
            return context.getResources().getString(C0126R.string.walletp2p_validating_payment_method);
        }
        return context.getResources().getString(C0126R.string.common_sending);
    }

    /* renamed from: b */
    public boolean mo53080b() {
        return false;
    }

    /* renamed from: c */
    public String mo53081c(Context context) {
        if (chlq.m148935b()) {
            return context.getResources().getString(C0126R.string.walletp2p_payment_successful);
        }
        return context.getResources().getString(C0126R.string.walletp2p_sent_with);
    }

    /* renamed from: c */
    public final boolean mo53082c() {
        return true;
    }

    /* renamed from: d */
    public final String mo53083d(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_select_payment_method);
    }

    /* renamed from: d */
    public boolean mo53084d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo53086e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo53088f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo53089g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo53090h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo53091i() {
        return true;
    }

    /* renamed from: j */
    public boolean mo53092j() {
        return false;
    }

    /* renamed from: l */
    public boolean mo53094l() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo53096a(axin axin) {
        Bundle bundle = new Bundle();
        bundle.putString("transaction_token", axin.f96008b);
        bundle.putString("transaction_url", axin.f96011e);
        bundle.putString("memo", mo53112x());
        bundle.putLong("amount_in_micros", mo53111w().f150177b);
        bundle.putString("amount_currency", mo53111w().f150178c);
        bundle.putInt("transfer_type", 1);
        return bundle;
    }

    /* renamed from: a */
    public final Spanned mo53074a(Context context, String str) {
        return Html.fromHtml(context.getString(C0126R.string.walletp2p_transfer_from, str));
    }

    /* renamed from: a */
    public String mo53075a(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_send_money);
    }

    /* renamed from: a */
    public void mo53076a(Context context, axif axif, Account account, axls axls, axls axls2) {
        axif.f95983b.execute(new axkr(axif.f95982a, axif.f95984c, account, mo53111w(), mo53109u(), mo53114z(), mo53108t(), mo53112x(), axls, axls2));
    }

    /* renamed from: a */
    public void mo53077a(axif axif, Account account, axhe axhe) {
        axif.f95983b.execute(new axkv(axif.f95982a, axif.f95984c, account, mo53108t(), mo53111w().f150177b, mo53111w().f150178c, mo53112x(), mo53109u(), mo53114z(), new axfd(axhe), new axfe(axhe)));
    }

    /* renamed from: a */
    public final void mo53078a(Activity activity, axif axif, Account account, rjx rjx, long j, long j2, byte[] bArr, List list, axfh axfh, String str) {
        axif.f95983b.execute(new axku(axif.f95982a, axif.f95984c, account, mo53108t(), mo53111w().f150177b, mo53111w().f150178c, mo53112x(), mo53109u(), mo53110v(), mo53107s(), mo53104p(), mo53105q(), mo53113y(), j, j2, mo53114z(), bArr, list, new axfb(this, axfh), new axfc(activity, axfh)));
    }
}
