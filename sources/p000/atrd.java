package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: atrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atrd extends DialogFragment {

    /* renamed from: a */
    public attc f90700a;

    /* renamed from: b */
    private View f90701b;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 2132018962);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.tp_monet_onboarding_layout, viewGroup, false);
        this.f90701b = inflate;
        ((TextView) inflate.findViewById(C0126R.C0129id.TitleText)).setText((int) C0126R.string.tp_set_gpay_default_title);
        ((TextView) this.f90701b.findViewById(C0126R.C0129id.SubtitleText)).setText((int) C0126R.string.tp_set_gpay_default_subtitle);
        Button button = (Button) this.f90701b.findViewById(C0126R.C0129id.SetUpButton);
        button.setText((int) C0126R.string.tp_request_select_token_confirm);
        button.setOnClickListener(new atrb(this));
        Button button2 = (Button) this.f90701b.findViewById(C0126R.C0129id.SkipButton);
        button2.setVisibility(0);
        button2.setText((int) C0126R.string.tp_enable_nfc_negative_button);
        button2.setOnClickListener(new atrc(this));
        ((NetworkImageView) this.f90701b.findViewById(C0126R.C0129id.ScreenLockImage)).setImageUrl(cgwt.m147406b(), atyg.m76548a());
        NetworkImageView networkImageView = (NetworkImageView) this.f90701b.findViewById(C0126R.C0129id.NetworkImage);
        networkImageView.setVisibility(0);
        networkImageView.setImageUrl(cgwt.f187939a.mo6606a().mo84651a(), atyg.m76548a());
        ((FrameLayout.LayoutParams) networkImageView.getLayoutParams()).topMargin = getResources().getDimensionPixelSize(C0126R.dimen.tp_monet_onboarding_network_image_top_margin);
        ImageView imageView = (ImageView) this.f90701b.findViewById(C0126R.C0129id.IconImage);
        imageView.setVisibility(0);
        imageView.setImageResource(C0126R.C0127drawable.tp_gpay_logo_setting);
        ((FrameLayout.LayoutParams) imageView.getLayoutParams()).topMargin = getResources().getDimensionPixelSize(C0126R.dimen.tp_monet_onboarding_icon_top_margin);
        return this.f90701b;
    }

    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -1);
        }
    }
}
