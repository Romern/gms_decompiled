package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: awzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class awzz extends bkfd {

    /* renamed from: d */
    protected final ImageWithCaptionView f95475d = ((ImageWithCaptionView) findViewById(C0126R.C0129id.address_image));

    /* renamed from: e */
    protected final TextView f95476e;

    /* renamed from: f */
    protected final TextView f95477f;

    /* renamed from: g */
    protected final TextView f95478g;

    /* renamed from: h */
    protected final LinearLayout f95479h;

    /* renamed from: i */
    protected final ImageView f95480i;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, awzz, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public awzz(Context context) {
        super(context);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_address_option, (ViewGroup) this, true);
        this.f124130k = (RadioButton) findViewById(C0126R.C0129id.radio_button);
        this.f95476e = (TextView) findViewById(C0126R.C0129id.recipient_name);
        this.f95477f = (TextView) findViewById(C0126R.C0129id.address_detail);
        this.f95478g = (TextView) findViewById(C0126R.C0129id.address_warning);
        this.f124131l = (ImageView) findViewById(C0126R.C0129id.expand_icon);
        this.f95480i = (ImageView) findViewById(C0126R.C0129id.edit_image);
        this.f124132m = findViewById(C0126R.C0129id.address_divider_line);
        this.f95479h = (LinearLayout) findViewById(C0126R.C0129id.recipient_address_container);
        setBackgroundResource(C0126R.C0127drawable.wallet_uic_ripple_background);
        mo65947i();
    }

    /* renamed from: a */
    public static long m81870a(Object obj) {
        if (obj instanceof bmbz) {
            return ((bmbz) obj).f128637b;
        }
        if (!(obj instanceof bmbr)) {
            return 0;
        }
        bmbr bmbr = (bmbr) obj;
        long j = bmbr.f128598o;
        if (j != 0) {
            return j;
        }
        return bjtc.m104548a(bmbr.f128587d, 14);
    }

    /* renamed from: a */
    public boolean mo52925a() {
        return true;
    }

    /* renamed from: a */
    public final void mo52923a(String str) {
        super.mo52923a(str);
        this.f95475d.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95477f.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95478g.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95476e.setTag(C0126R.C0129id.summary_expander_transition_name, str);
    }

    /* renamed from: a */
    public void mo52924a(boolean z, boolean z2) {
        int i;
        super.mo52924a(z, z2);
        boolean z3 = true;
        int i2 = 0;
        if (!z && this.f124130k.isChecked()) {
            z3 = false;
        }
        if (!z3) {
            i = 0;
        } else {
            i = 8;
        }
        this.f95475d.setVisibility(i);
        if (!z3) {
            i2 = 8;
        }
        this.f124130k.setVisibility(i2);
    }
}
