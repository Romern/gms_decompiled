package com.google.android.gms.walletp2p.feature.widgets.pindotsview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PinDotsView extends LinearLayout {

    /* renamed from: a */
    private static int f110762a;

    /* renamed from: b */
    private static int[] f110763b;

    /* renamed from: c */
    private final ImageView[] f110764c = {(ImageView) findViewById(C0126R.C0129id.pin_entry_1), (ImageView) findViewById(C0126R.C0129id.pin_entry_2), (ImageView) findViewById(C0126R.C0129id.pin_entry_3), (ImageView) findViewById(C0126R.C0129id.pin_entry_4)};

    /* renamed from: d */
    private int f110765d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.walletp2p.feature.widgets.pindotsview.PinDotsView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public PinDotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.walletp2p_pin_dots_view, (ViewGroup) this, true);
        f110763b = new int[]{getResources().getColor(C0126R.color.material_google_blue_500), getResources().getColor(C0126R.color.material_google_red_500), getResources().getColor(C0126R.color.material_google_yellow_500), getResources().getColor(C0126R.color.material_google_green_500)};
        f110762a = getResources().getColor(C0126R.color.walletp2p_dialog_background);
        ImageView[] imageViewArr = this.f110764c;
        int length = imageViewArr.length;
        for (int i = 0; i < 4; i++) {
            ImageView imageView = imageViewArr[i];
            imageView.setImageDrawable(context.getResources().getDrawable(C0126R.C0127drawable.walletp2p_dot));
            imageView.setBackgroundResource(C0126R.C0127drawable.walletp2p_dot_border);
        }
        ImageView[] imageViewArr2 = this.f110764c;
        int length2 = imageViewArr2.length;
        for (int i2 = 0; i2 < 4; i2++) {
            imageViewArr2[i2].setTag(Integer.valueOf(f110762a));
        }
    }

    /* renamed from: a */
    private final void m94380a(ImageView imageView, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i, i2);
        ofArgb.addUpdateListener(new axlq(imageView));
        ofArgb.setDuration((long) getResources().getInteger(C0126R.integer.walletp2p_very_short_anim_ms));
        ofArgb.start();
        imageView.setTag(Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final void mo60215a(int i) {
        boolean z;
        int i2;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        int length = this.f110764c.length;
        if (i > 4) {
            z2 = false;
        }
        bmxy.m108588a(z2);
        this.f110765d = i;
        int i3 = 0;
        while (true) {
            ImageView[] imageViewArr = this.f110764c;
            int length2 = imageViewArr.length;
            if (i3 < 4) {
                ImageView imageView = imageViewArr[i3];
                int intValue = ((Integer) imageView.getTag()).intValue();
                if (i3 < this.f110765d && intValue == f110762a) {
                    int[] iArr = f110763b;
                    m94380a(imageView, intValue, iArr[i3 % iArr.length]);
                    imageView.setContentDescription(getResources().getString(C0126R.string.walletp2p_dot));
                    imageView.setBackgroundResource(0);
                }
                if (i3 >= this.f110765d && intValue != (i2 = f110762a)) {
                    m94380a(imageView, intValue, i2);
                    imageView.setContentDescription(getResources().getString(C0126R.string.walletp2p_dot_empty));
                    imageView.setBackgroundResource(C0126R.C0127drawable.walletp2p_dot_border);
                }
                i3++;
            } else {
                return;
            }
        }
    }
}
