package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: atxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atxb extends Fragment {
    /* renamed from: a */
    private final void m76495a(View view) {
        ((ImageView) view.findViewById(C0126R.C0129id.HeaderImage)).setImageResource(C0126R.C0127drawable.tp_gcore_warm_welcome_cards_color_360x270dp);
        ((TextView) view.findViewById(C0126R.C0129id.Headline)).setText(getString(C0126R.string.tp_warm_welcome_how_to_pay_headline_nfc_off));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.tp_warm_welcome_how_to_pay_fragment, viewGroup, false);
        inflate.findViewById(C0126R.C0129id.Button).setOnClickListener(new atxa(this));
        atya a = atyb.m76543a(getActivity());
        if (!asjw.m74256a(getActivity())) {
            m76495a(inflate);
            atyg.m76553a(getString(C0126R.string.tp_warm_welcome_device_does_not_support_tap_and_pay, getString(C0126R.string.common_learn_more)), getString(C0126R.string.common_learn_more), (TextView) inflate.findViewById(C0126R.C0129id.Text), new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/androidpay/answer/7385877")));
        } else if (a == null || !a.mo50312a()) {
            m76495a(inflate);
            atyg.m76553a(getString(C0126R.string.tp_warm_welcome_how_to_pay_text_nfc_off, getString(C0126R.string.tp_warm_welcome_how_to_pay_text_nfc_link)), getString(C0126R.string.tp_warm_welcome_how_to_pay_text_nfc_link), (TextView) inflate.findViewById(C0126R.C0129id.Text), new Intent("android.settings.NFC_SETTINGS"));
        }
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        Activity activity = getActivity();
        if (activity != null) {
            if (activity instanceof atxh) {
                ((atxh) activity).mo50300a(58);
            }
            asjl.m74236a(activity, "Warm Welcome How to Pay");
        }
    }
}
