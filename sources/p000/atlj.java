package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: atlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atlj extends DialogFragment {

    /* renamed from: a */
    rjx f90444a;

    /* renamed from: a */
    public static void m76148a(deu deu, String str, boolean z) {
        atlj atlj = (atlj) deu.getSupportFragmentManager().findFragmentByTag("WalletBottomSheet");
        if (atlj != null) {
            deu.getSupportFragmentManager().beginTransaction().remove(atlj).commit();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_paypal_key", z);
        atlj atlj2 = new atlj();
        atlj2.setArguments(bundle);
        atlj2.show(deu.getSupportFragmentManager(), str);
    }

    public final /* bridge */ /* synthetic */ Dialog onCreateDialog(Bundle bundle) {
        if (this.f90444a == null) {
            this.f90444a = rjx.m33697b(getActivity());
        }
        View inflate = getLayoutInflater(bundle).inflate((int) C0126R.C0128layout.tp_settings_add_token_bottom_sheet, (ViewGroup) null);
        ImageLoader a = atyg.m76548a();
        ((NetworkImageView) inflate.findViewById(C0126R.C0129id.CardLogo)).setImageUrl("https://www.gstatic.com/commerce/wallet/20110109/jhfae70rio980yhbnsox6vkc9sjkdcuy223hnso08udmnnds8776vp6n5744ghopeewdx/tp2_setting/tp_bottom_sheet_payment_card.webp", a);
        inflate.findViewById(C0126R.C0129id.CardRow).setOnClickListener(new atlh(this));
        if (getArguments().getBoolean("show_paypal_key")) {
            inflate.findViewById(C0126R.C0129id.PayPalRow).setVisibility(0);
            ((NetworkImageView) inflate.findViewById(C0126R.C0129id.PayPalLogo)).setImageUrl("https://www.gstatic.com/commerce/wallet/20110109/jhfae70rio980yhbnsox6vkc9sjkdcuy223hnso08udmnnds8776vp6n5744ghopeewdx/tp2_setting/tp_bottom_sheet_paypal.webp", a);
            inflate.findViewById(C0126R.C0129id.PayPalRow).setOnClickListener(new atli(this));
        }
        bhfq bhfq = new bhfq(getActivity(), C0126R.style.TpBottomSheetDialogTheme);
        bhfq.setContentView(inflate);
        return bhfq;
    }
}
