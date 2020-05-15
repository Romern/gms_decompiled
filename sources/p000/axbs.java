package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: axbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axbs extends bkfd {

    /* renamed from: b */
    protected View f95724b;

    /* renamed from: c */
    protected ImageWithCaptionView f95725c;

    /* renamed from: d */
    protected TextView f95726d;

    /* renamed from: e */
    protected TextView f95727e;

    /* renamed from: f */
    protected TextView f95728f;

    /* renamed from: g */
    protected TextView f95729g;

    /* renamed from: h */
    protected boolean f95730h;

    /* renamed from: i */
    public int f95731i;

    /* renamed from: j */
    public int f95732j;

    public axbs(Context context) {
        super(context);
        mo52986a(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, axbs, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52986a(Context context) {
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_instrument_option, (ViewGroup) this, true);
        this.f95724b = findViewById(C0126R.C0129id.image_container);
        this.f95725c = (ImageWithCaptionView) findViewById(C0126R.C0129id.instrument_image);
        this.f124130k = (RadioButton) findViewById(C0126R.C0129id.radio_button);
        this.f95726d = (TextView) findViewById(C0126R.C0129id.instrument_label);
        this.f95727e = (TextView) findViewById(C0126R.C0129id.instrument_additional_label_collapsed);
        this.f95728f = (TextView) findViewById(C0126R.C0129id.instrument_additional_label_expanded);
        this.f95729g = (TextView) findViewById(C0126R.C0129id.warning_message);
        this.f124131l = (ImageView) findViewById(C0126R.C0129id.expand_icon);
        this.f124132m = findViewById(C0126R.C0129id.instrument_divider_line);
        setBackgroundResource(C0126R.C0127drawable.wallet_uic_ripple_background);
        mo65947i();
        this.f95731i = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_page_left_column_width);
    }

    /* renamed from: b */
    public final CharSequence mo52926b() {
        return getResources().getString(C0126R.string.wallet_instrument_selected, this.f95726d.getText());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract bmno mo52984c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo52985d();

    /* renamed from: a */
    public final void mo52996a(bxxc bxxc) {
        this.f124136q = bxxc;
        bmno c = mo52984c();
        ImageWithCaptionView imageWithCaptionView = this.f95725c;
        if (!mo52985d()) {
            c = null;
        }
        imageWithCaptionView.mo71992a(c, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
    }

    /* renamed from: a */
    public void mo52923a(String str) {
        super.mo52923a(str);
        this.f95725c.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95726d.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95727e.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95728f.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95729g.setTag(C0126R.C0129id.summary_expander_transition_name, str);
    }

    /* renamed from: a */
    public void mo52924a(boolean z, boolean z2) {
        int i;
        int i2;
        super.mo52924a(z, z2);
        boolean z3 = true;
        int i3 = 0;
        if (!z && this.f124130k.isChecked()) {
            z3 = false;
        }
        if (this.f95730h) {
            this.f95725c.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.f95724b.getLayoutParams();
            if (!z3) {
                i2 = this.f95732j;
            } else {
                i2 = this.f95731i;
            }
            layoutParams.width = i2;
            this.f95724b.requestLayout();
        } else if (mo52985d()) {
            if (!z3) {
                i = 0;
            } else {
                i = 8;
            }
            this.f95725c.setVisibility(i);
        }
        if (!z3) {
            i3 = 8;
        }
        this.f124130k.setVisibility(i3);
    }
}
