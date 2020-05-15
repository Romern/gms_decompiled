package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: auao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auao extends DialogFragment {

    /* renamed from: a */
    public CardInfo f91327a;

    /* renamed from: b */
    public boolean f91328b = true;

    /* renamed from: c */
    public Activity f91329c;

    /* renamed from: d */
    public auaj f91330d;

    /* renamed from: a */
    public static void m76657a(FragmentManager fragmentManager, auaj auaj, CardInfo cardInfo, boolean z) {
        if (((DialogFragment) fragmentManager.findFragmentByTag("TAG_DELETE_CARD_DIALOG")) == null) {
            auao auao = new auao();
            auao.f91330d = auaj;
            Bundle bundle = new Bundle();
            bundle.putParcelable("KEY_CARD_INFO", cardInfo);
            bundle.putBoolean("KEY_NFC_DEVICE", z);
            auao.setArguments(bundle);
            auao.show(fragmentManager, "TAG_DELETE_CARD_DIALOG");
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f91329c = activity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final Dialog onCreateDialog(Bundle bundle) {
        String str;
        this.f91327a = (CardInfo) getArguments().getParcelable("KEY_CARD_INFO");
        boolean z = getArguments().getBoolean("KEY_NFC_DEVICE", true);
        String string = getResources().getString(C0126R.string.common_ok);
        if (!atyj.m76564a(this.f91327a)) {
            if (!z) {
                str = getResources().getString(C0126R.string.f7408x8974ebbc);
            } else {
                str = getResources().getString(C0126R.string.tp_settings_delete_card_on_nfc_supported_device_dialog_message);
            }
        } else if (!z) {
            str = getResources().getString(C0126R.string.f7409x326fdab9);
            string = getResources().getString(C0126R.string.common_remove);
        } else {
            str = getResources().getString(C0126R.string.tp_settings_delete_paypal_on_nfc_supported_device_dialog_message);
        }
        View inflate = LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.tp_reskin_dialog_layout, (ViewGroup) null, false);
        ((ImageView) inflate.findViewById(C0126R.C0129id.DialogIcon)).setImageResource(C0126R.C0127drawable.quantum_gm_ic_delete_vd_theme_24);
        ((TextView) inflate.findViewById(C0126R.C0129id.tp_request_prompt_headline)).setText((int) C0126R.string.tp_settings_delete_card_dialog_title);
        ((TextView) inflate.findViewById(C0126R.C0129id.tp_request_prompt_text)).setText(str);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.tp_button_positive);
        button.setText(string);
        button.setOnClickListener(new aual(this));
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.tp_button_negative);
        button2.setText((int) C0126R.string.common_cancel);
        button2.setOnClickListener(new auam(this));
        bhia bhia = new bhia(getActivity(), 2132018789);
        bhia.mo63787d(inflate);
        return bhia.mo15904b();
    }

    public final void onPause() {
        super.onPause();
        this.f91328b = false;
    }

    public final void onResume() {
        super.onResume();
        this.f91328b = true;
    }
}
