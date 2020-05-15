package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: bkao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkao extends bkfd {

    /* renamed from: a */
    final InfoMessageView f123837a = ((InfoMessageView) findViewById(C0126R.C0129id.verification_description));

    /* renamed from: b */
    final TextView f123838b = ((TextView) findViewById(C0126R.C0129id.verification_option_label));

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, bkao, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public bkao(Context context) {
        super(context);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.view_verification_option, (ViewGroup) this, true);
        this.f124130k = (RadioButton) findViewById(C0126R.C0129id.radio_button);
        this.f124131l = (ImageView) findViewById(C0126R.C0129id.expand_icon);
        setBackgroundResource(C0126R.C0127drawable.wallet_uic_ripple_background);
        mo65947i();
    }

    /* renamed from: a */
    public final boolean mo52925a() {
        bmgx bmgx = (bmgx) this.f124136q;
        return !bmgx.f129364g && bmgx.f129363f.mo73744a() > 0;
    }

    /* renamed from: b */
    public final CharSequence mo52926b() {
        return ((bmgx) this.f124136q).f129360c;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent || !isEnabled()) {
            return onInterceptTouchEvent;
        }
        onTouchEvent(motionEvent);
        return false;
    }

    public final void setEnabled(boolean z) {
        boolean z2 = false;
        if (z && mo52925a()) {
            z2 = true;
        }
        super.setEnabled(z2);
        InfoMessageView infoMessageView = this.f123837a;
        if (!z || mo52925a()) {
            ColorStateList colorStateList = infoMessageView.f152088l;
            if (colorStateList != null) {
                infoMessageView.f152078b.setTextColor(colorStateList);
                infoMessageView.f152088l = null;
                infoMessageView.f152078b.setLinkTextColor(infoMessageView.f152089m);
                infoMessageView.f152089m = null;
                infoMessageView.f152079c.setTextColor(infoMessageView.f152090n);
                infoMessageView.f152090n = null;
                infoMessageView.f152079c.setLinkTextColor(infoMessageView.f152091o);
                infoMessageView.f152091o = null;
            }
        } else if (infoMessageView.f152088l == null) {
            infoMessageView.f152088l = infoMessageView.f152078b.getTextColors();
            infoMessageView.f152089m = infoMessageView.f152078b.getLinkTextColors();
            infoMessageView.f152090n = infoMessageView.f152079c.getTextColors();
            infoMessageView.f152091o = infoMessageView.f152079c.getLinkTextColors();
            InfoMessageView.m118578a(infoMessageView.f152078b, infoMessageView.f152088l);
            InfoMessageView.m118581b(infoMessageView.f152078b, infoMessageView.f152089m);
            InfoMessageView.m118578a(infoMessageView.f152079c, infoMessageView.f152090n);
            InfoMessageView.m118581b(infoMessageView.f152079c, infoMessageView.f152091o);
        }
        this.f123837a.setEnabled(z);
    }
}
