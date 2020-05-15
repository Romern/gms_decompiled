package com.google.android.gms.walletp2p.feature.widgets.checkmarkprogressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckmarkProgressBar extends RelativeLayout {

    /* renamed from: a */
    public ProgressBar f110744a = ((ProgressBar) findViewById(C0126R.C0129id.progress_bar));

    /* renamed from: b */
    public final ImageView f110745b = ((ImageView) findViewById(C0126R.C0129id.outer_progress_mask));

    /* renamed from: c */
    public final ImageView f110746c = ((ImageView) findViewById(C0126R.C0129id.inner_progress_mask));

    /* renamed from: d */
    public final LottieAnimationView f110747d = ((LottieAnimationView) findViewById(C0126R.C0129id.checkmark_animation));

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.walletp2p.feature.widgets.checkmarkprogressbar.CheckmarkProgressBar, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public CheckmarkProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.walletp2p_checkmark_progress_bar, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(C0126R.C0129id.checkmark);
        this.f110744a.getIndeterminateDrawable().setColorFilter(getResources().getColor(C0126R.color.walletp2p_primary), PorterDuff.Mode.SRC_IN);
        int i = Build.VERSION.SDK_INT;
        this.f110745b.setColorFilter(getResources().getColor(C0126R.color.walletp2p_progress_bar_background));
    }
}
