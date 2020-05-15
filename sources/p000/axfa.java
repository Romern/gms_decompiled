package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;
import java.util.List;

/* renamed from: axfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class axfa extends axfi {
    public axfa(TransferParams transferParams, Intent intent) {
        super(transferParams, intent);
    }

    /* renamed from: a */
    public final int mo53073a() {
        return 0;
    }

    /* renamed from: b */
    public String mo53079b(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_requesting);
    }

    /* renamed from: b */
    public final boolean mo53080b() {
        return false;
    }

    /* renamed from: c */
    public String mo53081c(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_request_sent);
    }

    /* renamed from: c */
    public final boolean mo53082c() {
        return true;
    }

    /* renamed from: d */
    public final String mo53083d(Context context) {
        return "";
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
    public final boolean mo53089g() {
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
    public final boolean mo53092j() {
        return false;
    }

    /* renamed from: l */
    public final boolean mo53094l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo53098m() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo53095a(axim axim) {
        Bundle bundle = new Bundle();
        bundle.putString("transaction_token", axim.f95998b);
        bundle.putString("transaction_url", axim.f96001e);
        bundle.putString("memo", mo53112x());
        bundle.putLong("amount_in_micros", mo53111w().f150177b);
        bundle.putString("amount_currency", mo53111w().f150178c);
        bundle.putInt("transfer_type", 0);
        return bundle;
    }

    /* renamed from: a */
    public final Spanned mo53074a(Context context, String str) {
        return new SpannableString("");
    }

    /* renamed from: a */
    public String mo53075a(Context context) {
        return context.getResources().getString(C0126R.string.walletp2p_request_money);
    }

    /* renamed from: a */
    public void mo53076a(Context context, axif axif, Account account, axls axls, axls axls2) {
        axls.mo53097a(btsj.f150218c);
    }

    /* renamed from: a */
    public void mo53077a(axif axif, Account account, axhe axhe) {
        axhe.mo53148a();
    }

    /* renamed from: a */
    public final void mo53078a(Activity activity, axif axif, Account account, rjx rjx, long j, long j2, byte[] bArr, List list, axfh axfh, String str) {
        axif.f95983b.execute(new axkt(axif.f95982a, axif.f95984c, account, mo53108t(), mo53111w().f150177b, mo53111w().f150178c, mo53112x(), mo53110v(), mo53104p(), mo53105q(), j2, bArr, new axey(this, axfh), new axez(activity, axfh)));
    }
}
