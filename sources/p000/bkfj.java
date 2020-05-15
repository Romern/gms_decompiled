package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.support.p002v7.widget.AppCompatImageView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.button.MaterialButton;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: bkfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkfj extends bkbq implements View.OnClickListener {

    /* renamed from: a */
    Button f124142a;

    /* renamed from: a */
    public final Dialog mo9306a() {
        RelativeLayout.LayoutParams layoutParams;
        ImageView imageView;
        LinearLayout.LayoutParams layoutParams2;
        bmoq bmoq = (bmoq) bjvp.m104730a(getArguments(), "tooltipProto", (bxxk) bmoq.f130246g.mo74142c(7));
        View inflate = mo65816c().inflate((int) C0126R.C0128layout.view_tooltip_dialog, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0126R.C0129id.root_container);
        if (!bmoq.f130250c.isEmpty()) {
            C1280ps.m19885a(findViewById, C1280ps.m19925i(findViewById), getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_margin_between_title_and_content_in_dialog), C1280ps.m19927j(findViewById), findViewById.getPaddingBottom());
        }
        InfoMessageView infoMessageView = (InfoMessageView) inflate.findViewById(C0126R.C0129id.info_message);
        bmnr bmnr = bmoq.f130251d;
        if (bmnr == null) {
            bmnr = bmnr.f130153o;
        }
        infoMessageView.mo72003a(bmnr);
        if ((getTargetFragment() instanceof bjxu) && bkfr.m105615f(bkfr.m105625k(mo65815b()))) {
            infoMessageView.f152084h = (bjxu) getTargetFragment();
        }
        if (bmoq.f130252e.size() > 0) {
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.images_container);
            bxwc bxwc = bmoq.f130252e;
            linearLayout.setVisibility(0);
            for (int i = 0; i < bxwc.size(); i++) {
                bmno bmno = (bmno) bxwc.get(i);
                if (bjvn.m104718a(bmno.f130142c)) {
                    imageView = new AppCompatImageView(getContext());
                } else {
                    imageView = new ImageWithCaptionView(getContext());
                }
                if (bjvn.m104718a(bmno.f130142c)) {
                    layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                } else {
                    layoutParams2 = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_tooltip_dialog_image_default_width), -2);
                }
                if (i != 0) {
                    layoutParams2.topMargin = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_tooltip_margin_between_images);
                }
                if (imageView instanceof ImageWithCaptionView) {
                    ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) imageView;
                    imageWithCaptionView.mo71994a(bmno, bjvn.m104721b(getActivity().getApplicationContext()), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue(), null, true);
                    imageWithCaptionView.mo71888a();
                } else {
                    imageView.setImageResource(bkfr.m105586b(mo65815b(), bmno.f130142c));
                    imageView.setContentDescription(bmno.f130149j);
                }
                imageView.setAdjustViewBounds(true);
                linearLayout.addView(imageView, layoutParams2);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) infoMessageView.getLayoutParams();
            int a = bmop.m108235a(bmoq.f130253f);
            if (a == 0) {
                a = 3;
            }
            int i2 = a - 1;
            if (i2 == 1) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                bkfr.m105592b();
                layoutParams.addRule(10);
                bkfr.m105592b();
                layoutParams3.addRule(3, linearLayout.getId());
                layoutParams3.topMargin = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_tooltip_margin_between_image_text_vertical);
            } else if (i2 == 3) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                bkfr.m105592b();
                layoutParams.addRule(20);
                bkfr.m105592b();
                layoutParams3.addRule(17, linearLayout.getId());
                C1260oz.m19821a(layoutParams3, getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_tooltip_margin_between_image_text_horizontal));
            } else if (i2 != 4) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                bkfr.m105592b();
                layoutParams3.addRule(10);
                bkfr.m105592b();
                layoutParams.addRule(3, infoMessageView.getId());
                layoutParams.topMargin = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_tooltip_margin_between_image_text_vertical);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                bkfr.m105592b();
                layoutParams.addRule(21);
                bkfr.m105592b();
                layoutParams3.addRule(16, linearLayout.getId());
                C1260oz.m19823b(layoutParams3, getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_tooltip_margin_between_image_text_horizontal));
            }
            infoMessageView.setLayoutParams(layoutParams3);
            linearLayout.setLayoutParams(layoutParams);
        }
        this.f124142a = (Button) inflate.findViewById(C0126R.C0129id.close_button);
        bkbj bkbj = new bkbj(mo65815b());
        bkbj.mo65783b(inflate);
        if (!bmoq.f130250c.isEmpty()) {
            bkbj.mo65780a(bmoq.f130250c);
        }
        TypedArray obtainStyledAttributes = mo65815b().obtainStyledAttributes(new int[]{C0126R.attr.internalUicTooltipDialogUseDefaultDialogButtons});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!z) {
            if (((Boolean) bjwe.f123467B.mo54082a()).booleanValue() && bkfr.m105621h(mo65815b())) {
                LinearLayout linearLayout2 = (LinearLayout) findViewById;
                linearLayout2.removeView(this.f124142a);
                MaterialButton materialButton = new MaterialButton(mo65815b());
                this.f124142a = materialButton;
                materialButton.setId(C0126R.C0129id.close_button);
                TypedArray obtainStyledAttributes2 = mo65815b().obtainStyledAttributes(new int[]{C0126R.attr.uicDialogBodyTopBottomMargin});
                int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
                obtainStyledAttributes2.recycle();
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.setMargins(0, dimensionPixelSize, 0, 0);
                layoutParams4.gravity = 8388613;
                this.f124142a.setLayoutParams(layoutParams4);
                this.f124142a.setText((int) C0126R.string.wallet_uic_close);
                linearLayout2.addView(this.f124142a);
            }
            this.f124142a.setOnClickListener(this);
        } else {
            this.f124142a.setVisibility(8);
            bkbj.mo65782b((int) C0126R.string.wallet_uic_close, (DialogInterface.OnClickListener) null);
        }
        return bkbj.mo65776a();
    }

    public void onClick(View view) {
        if (view == this.f124142a) {
            dismiss();
        }
    }
}
