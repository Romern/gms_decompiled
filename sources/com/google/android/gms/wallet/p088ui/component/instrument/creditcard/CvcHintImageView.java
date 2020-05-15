package com.google.android.gms.wallet.p088ui.component.instrument.creditcard;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.chimera.FragmentManager;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: com.google.android.gms.wallet.ui.component.instrument.creditcard.CvcHintImageView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CvcHintImageView extends ImageWithCaptionView implements View.OnClickListener {

    /* renamed from: g */
    public FragmentManager f110537g;

    /* renamed from: o */
    private String f110538o;

    /* renamed from: p */
    private String f110539p;

    /* renamed from: q */
    private bmno f110540q;

    /* renamed from: r */
    private axbg f110541r;

    public CvcHintImageView(Context context) {
        super(context);
        setOnClickListener(this);
    }

    /* renamed from: c */
    private final boolean m94245c() {
        return (this.f110538o == null || this.f110540q == null || this.f110539p == null) ? false : true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.wallet.ui.component.instrument.creditcard.CvcHintImageView.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(bmno, android.content.Context):android.graphics.drawable.Drawable
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(com.android.volley.toolbox.ImageLoader, int):void
      com.google.android.wallet.ui.common.FifeNetworkImageView.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.gms.wallet.ui.component.instrument.creditcard.CvcHintImageView.a(int, boolean):void */
    /* renamed from: a */
    public final void mo60105a(int i, boolean z) {
        if (getVisibility() == i) {
            return;
        }
        if (!z) {
            super.setVisibility(i);
        } else if (i != 0) {
            super.setVisibility(0);
            setAlpha(1.0f);
            animate().alpha(0.0f);
            animate().setListener(new axbh(this, i));
        } else {
            mo60105a(0, false);
            setAlpha(0.0f);
            animate().alpha(1.0f);
        }
    }

    public void onClick(View view) {
        FragmentManager fragmentManager;
        if (m94245c() && (fragmentManager = this.f110537g) != null) {
            if (this.f110541r != null) {
                fragmentManager.beginTransaction().remove(this.f110541r).commit();
            }
            String str = this.f110538o;
            String str2 = this.f110539p;
            bmno bmno = this.f110540q;
            axbg axbg = new axbg();
            Bundle bundle = new Bundle();
            bundle.putString("hintTitle", str);
            bundle.putString("hintText", str2);
            bjvp.m104736a(bundle, "hintImage", bmno);
            axbg.setArguments(bundle);
            this.f110541r = axbg;
            axbg.show(this.f110537g, "cvcHintFragment");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.wallet.ui.component.instrument.creditcard.CvcHintImageView.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(bmno, android.content.Context):android.graphics.drawable.Drawable
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(com.android.volley.toolbox.ImageLoader, int):void
      com.google.android.wallet.ui.common.FifeNetworkImageView.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.gms.wallet.ui.component.instrument.creditcard.CvcHintImageView.a(int, boolean):void */
    public final void setVisibility(int i) {
        if (!m94245c()) {
            i = 8;
        }
        mo60105a(i, true);
    }

    public CvcHintImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnClickListener(this);
    }

    public CvcHintImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo60106a(String str, String str2, bmno bmno) {
        if (!sdg.m34949a(this.f110538o, str) || !sdg.m34949a(this.f110539p, str2) || !sdg.m34949a(this.f110540q, bmno)) {
            this.f110538o = str;
            this.f110539p = str2;
            this.f110540q = bmno;
            if (!m94245c()) {
                setVisibility(8);
            } else {
                mo71992a(this.f110540q, awia.m79973a(), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
            }
        }
    }
}
