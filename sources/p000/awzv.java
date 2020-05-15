package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: awzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awzv extends bkfd {

    /* renamed from: a */
    public boolean f95451a;

    /* renamed from: b */
    public boolean f95452b;

    /* renamed from: c */
    public boolean f95453c;

    /* renamed from: d */
    public bmno f95454d;

    /* renamed from: e */
    protected final ImageWithCaptionView f95455e = ((ImageWithCaptionView) findViewById(C0126R.C0129id.account_image));

    /* renamed from: f */
    protected final TextView f95456f;

    /* renamed from: g */
    protected final TextView f95457g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, awzv, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public awzv(Context context) {
        super(context);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_account_option, (ViewGroup) this, true);
        this.f124130k = (RadioButton) findViewById(C0126R.C0129id.radio_button);
        this.f95456f = (TextView) findViewById(C0126R.C0129id.account_display_name);
        this.f95457g = (TextView) findViewById(C0126R.C0129id.account_label);
        this.f124131l = (ImageView) findViewById(C0126R.C0129id.expand_icon);
        this.f124132m = findViewById(C0126R.C0129id.account_divider_line);
        setBackgroundResource(C0126R.C0127drawable.wallet_uic_ripple_background);
        mo65947i();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{C0126R.attr.accountOptionExpandIconEndAligned}, 0, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (z) {
            ((ViewGroup) this.f124131l.getParent()).removeView(this.f124131l);
            ((ViewGroup) findViewById(C0126R.C0129id.account_row)).addView(this.f124131l);
        }
    }

    /* renamed from: a */
    public final void mo52923a(String str) {
        super.mo52923a(str);
        this.f95455e.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95456f.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95457g.setTag(C0126R.C0129id.summary_expander_transition_name, str);
    }

    /* renamed from: a */
    public final boolean mo52925a() {
        return true;
    }

    /* renamed from: b */
    public final CharSequence mo52926b() {
        return getResources().getString(C0126R.string.wallet_account_selected, this.f95457g.getText());
    }

    /* renamed from: a */
    public final void mo52924a(boolean z, boolean z2) {
        float f;
        super.mo52924a(z, z2);
        int i = 8;
        boolean z3 = true;
        if (this.f95452b) {
            if (!this.f95453c) {
                ImageWithCaptionView imageWithCaptionView = this.f95455e;
                float f2 = 0.75f;
                if (!mo65946h()) {
                    f = 0.75f;
                } else {
                    f = 1.0f;
                }
                imageWithCaptionView.setScaleX(f);
                ImageWithCaptionView imageWithCaptionView2 = this.f95455e;
                if (mo65946h()) {
                    f2 = 1.0f;
                }
                imageWithCaptionView2.setScaleY(f2);
            } else {
                boolean z4 = !z && mo65946h();
                this.f95455e.setVisibility(!z4 ? 4 : 0);
                this.f124130k.setVisibility(!z4 ? 0 : 8);
            }
        }
        if (!z || !mo65946h()) {
            z3 = false;
        }
        View view = this.f124132m;
        if (z3) {
            i = 0;
        }
        view.setVisibility(i);
    }
}
