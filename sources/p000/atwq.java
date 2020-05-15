package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: atwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atwq extends Fragment {

    /* renamed from: a */
    rjx f91057a;

    /* renamed from: a */
    public final void mo50283a() {
        getActivity().setResult(-1);
        getActivity().finish();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.tp_warm_welcome_felica, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.Headline);
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.Text);
        TextView textView3 = (TextView) inflate.findViewById(C0126R.C0129id.PrimaryButton);
        TextView textView4 = (TextView) inflate.findViewById(C0126R.C0129id.SecondaryButton);
        if (this.f91057a == null) {
            this.f91057a = rjx.m33697b(getActivity());
        }
        int i = getArguments().getInt("felica_current_default_status");
        CardInfo cardInfo = (CardInfo) getArguments().getParcelable("extra_card_info");
        String a = atgs.m75865a(cardInfo.f108344e).mo49970a(getContext());
        if (cardInfo.f108344e == 9) {
            ((ImageView) inflate.findViewById(C0126R.C0129id.HeaderImage)).setImageResource(C0126R.C0127drawable.tp_id_felica_tap_color_253x262dp);
        }
        textView.setText(getResources().getString(C0126R.string.tp_felica_warm_welcome_title, cardInfo.f108343d));
        if (i == 4) {
            textView2.setText(getResources().getString(C0126R.string.tp_warm_welcome_felica_unchangeable, a, cardInfo.f108343d, a, a));
            textView3.setText((int) C0126R.string.common_got_it);
            textView4.setVisibility(8);
        } else {
            textView2.setText(getResources().getString(C0126R.string.tp_warm_welcome_felica_changeable, a));
            textView3.setText(getResources().getString(C0126R.string.tp_felica_set_primary_card, a));
            textView4.setText(getResources().getString(C0126R.string.tp_felica_dont_set_primary_card, a));
            textView4.setVisibility(0);
        }
        textView3.setOnClickListener(new atwo(this, i, cardInfo));
        textView4.setOnClickListener(new atwp(this));
        return inflate;
    }
}
