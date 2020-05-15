package com.google.android.gms.wallet.p088ui.verifypin;

import android.content.Context;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.wallet.ui.verifypin.PinDotsView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PinDotsView extends LinearLayout {

    /* renamed from: a */
    private final LottieAnimationView[] f110595a;

    /* renamed from: b */
    private int f110596b;

    static {
        PinDotsView.class.getSimpleName();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.ui.verifypin.PinDotsView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public PinDotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_pin_dots, (ViewGroup) this, true);
        LottieAnimationView[] lottieAnimationViewArr = {(LottieAnimationView) findViewById(C0126R.C0129id.pin_entry_1), (LottieAnimationView) findViewById(C0126R.C0129id.pin_entry_2), (LottieAnimationView) findViewById(C0126R.C0129id.pin_entry_3), (LottieAnimationView) findViewById(C0126R.C0129id.pin_entry_4)};
        this.f110595a = lottieAnimationViewArr;
        for (int i = 0; i < 4; i++) {
            lottieAnimationViewArr[i].setTag(false);
        }
    }

    /* renamed from: a */
    static final String m94298a(int i, int i2) {
        if (i == 0) {
            return String.format("verifypin/dot_%02d.json", Integer.valueOf(i2 + 1));
        } else if (i == 1) {
            return String.format("verifypin/load_%02d.json", Integer.valueOf(i2 + 1));
        } else if (i != 2) {
            return String.format("verifypin/fail_%02d.json", Integer.valueOf(i2 + 1));
        } else {
            return String.format("verifypin/success_%02d.json", Integer.valueOf(i2 + 1));
        }
    }

    /* renamed from: b */
    private final float m94299b() {
        try {
            return Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale");
        } catch (Settings.SettingNotFoundException e) {
            return 1.0f;
        }
    }

    /* renamed from: b */
    public final void mo60138b(int i) {
        int i2 = 0;
        while (true) {
            LottieAnimationView[] lottieAnimationViewArr = this.f110595a;
            int length = lottieAnimationViewArr.length;
            if (i2 < 4) {
                LottieAnimationView lottieAnimationView = lottieAnimationViewArr[i2];
                Context context = getContext();
                String a = m94298a(i, i2);
                aye.m2432b(context, a).mo2916b(new axv(new axcx(lottieAnimationView, i)));
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final long mo60136a() {
        long j;
        LottieAnimationView[] lottieAnimationViewArr = this.f110595a;
        int length = lottieAnimationViewArr.length;
        axw axw = lottieAnimationViewArr[3].f7172d;
        if (axw != null) {
            j = (long) axw.mo2856a();
        } else {
            j = 0;
        }
        return (long) (((float) j) * m94299b());
    }

    /* renamed from: a */
    public final void mo60137a(int i) {
        if (i >= 0) {
            int length = this.f110595a.length;
            if (i <= 4) {
                this.f110596b = i;
                int i2 = 0;
                while (true) {
                    LottieAnimationView[] lottieAnimationViewArr = this.f110595a;
                    int length2 = lottieAnimationViewArr.length;
                    if (i2 < 4) {
                        LottieAnimationView lottieAnimationView = lottieAnimationViewArr[i2];
                        lottieAnimationView.mo4049a(m94298a(0, i2));
                        boolean booleanValue = ((Boolean) lottieAnimationView.getTag()).booleanValue();
                        if (i2 < this.f110596b && !booleanValue) {
                            lottieAnimationView.mo4052b(0.0f);
                            lottieAnimationView.mo4042a();
                            lottieAnimationView.setTag(true);
                            lottieAnimationView.setContentDescription(getResources().getString(C0126R.string.wallet_dot_active));
                        }
                        if (i2 >= this.f110596b && booleanValue) {
                            lottieAnimationView.mo4043a(-1.0f);
                            lottieAnimationView.mo4042a();
                            lottieAnimationView.setContentDescription(getResources().getString(C0126R.string.wallet_dot_inactive));
                            lottieAnimationView.setTag(false);
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
