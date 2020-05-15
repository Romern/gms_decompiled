package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.Spanned;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyRequest;
import java.util.List;

/* renamed from: axet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axet extends axfi {
    public axet(TransferParams transferParams, Intent intent) {
        super(transferParams, intent);
    }

    /* renamed from: a */
    public final int mo53073a() {
        return 2;
    }

    /* renamed from: b */
    public final String mo53079b(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_claiming);
    }

    /* renamed from: b */
    public final boolean mo53080b() {
        return true;
    }

    /* renamed from: c */
    public final String mo53081c(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_claimed_to);
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
    public final boolean mo53084d() {
        return false;
    }

    /* renamed from: e */
    public final String mo53085e(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_currency_mismatch_claim_title);
    }

    /* renamed from: e */
    public final boolean mo53086e() {
        return false;
    }

    /* renamed from: f */
    public final String mo53087f(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_currency_mismatch_claim_body);
    }

    /* renamed from: f */
    public final boolean mo53088f() {
        return true;
    }

    /* renamed from: g */
    public final boolean mo53089g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo53090h() {
        return true;
    }

    /* renamed from: i */
    public final boolean mo53091i() {
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

    /* renamed from: a */
    public final Spanned mo53074a(Context context, String str) {
        return Html.fromHtml(context.getString(C0126R.string.walletp2p_transfer_to, str));
    }

    /* renamed from: a */
    public final String mo53075a(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_claim_money);
    }

    /* renamed from: a */
    public final void mo53076a(Context context, axif axif, Account account, axls axls, axls axls2) {
        axls.mo53097a(btsj.f150218c);
    }

    /* renamed from: a */
    public final void mo53077a(axif axif, Account account, axhe axhe) {
        axhe.mo53148a();
    }

    /* renamed from: a */
    public final void mo53078a(Activity activity, axif axif, Account account, rjx rjx, long j, long j2, byte[] bArr, List list, axfh axfh, String str) {
        ClaimMoneyRequest claimMoneyRequest = new ClaimMoneyRequest(mo53107s(), mo53109u(), j, j2, mo53114z(), bArr, mo53113y(), str);
        roz b = rpa.m34196b();
        b.f43472a = new axec(claimMoneyRequest);
        aucb b2 = rjx.mo24732b(b.mo24977a());
        b2.mo50376a(activity, new axer(this, axfh));
        b2.mo50375a(activity, new axes(axfh));
    }
}
