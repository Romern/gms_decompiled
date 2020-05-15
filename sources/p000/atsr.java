package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: atsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atsr extends alic {

    /* renamed from: b */
    alih f90790b;

    /* renamed from: c */
    String f90791c;

    /* renamed from: d */
    String f90792d;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.f90790b == null) {
            atrv atrv = new atrv();
            alif alif = this.f73529a;
            cazf.m127594a(alif);
            atrv.f90743a = alif;
            cazf.m127595a(atrv.f90743a, alif.class);
            this.f90790b = new atrw(atrv.f90743a);
        }
        atrw atrw = (atrw) this.f90790b;
        String a = atrw.f90744a.mo40363a();
        cazf.m127593a(a, "Cannot return null from a non-@Nullable component method");
        this.f90791c = a;
        String b = atrw.f90744a.mo40364b();
        cazf.m127593a(b, "Cannot return null from a non-@Nullable component method");
        this.f90792d = b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.tp_oobe_tokenization_result_screen, viewGroup, false);
        ((TextView) inflate.findViewById(C0126R.C0129id.OobeResultTitle)).setText((int) C0126R.string.tp_deferred_yellow_path_title);
        ((TextView) inflate.findViewById(C0126R.C0129id.OobeResultSubTitle)).setText((int) C0126R.string.tp_deferred_yellow_path_description);
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.OobeResultCardImage);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.OobeResultNextButton);
        CardInfo cardInfo = (CardInfo) getArguments().get("extra_card_info");
        imageView.setAlpha(0.5f);
        asju.m74252a(new asjs(getActivity(), this.f90792d), cardInfo, imageView);
        button.setVisibility(0);
        button.setOnClickListener(new atsq(this, cardInfo));
        return inflate;
    }
}
