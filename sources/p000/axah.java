package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: axah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axah extends bkfd {

    /* renamed from: a */
    protected TextView f95513a;

    /* renamed from: b */
    protected TextView f95514b;

    /* renamed from: c */
    protected ImageView f95515c;

    /* renamed from: d */
    protected LinearLayout f95516d;

    public axah(Context context) {
        super(context);
        mo52934a(context);
    }

    /* renamed from: a */
    public static long m81926a(Object obj) {
        if (obj instanceof bmet) {
            return bjtc.m104548a(((bmet) obj).f129021c, 1);
        }
        if (!(obj instanceof bmes)) {
            return 0;
        }
        return ((bmes) obj).f129010a;
    }

    /* renamed from: a */
    public boolean mo52925a() {
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, axah, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52934a(Context context) {
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_customer_option, (ViewGroup) this, true);
        this.f95515c = (ImageView) findViewById(C0126R.C0129id.customer_image);
        this.f124130k = (RadioButton) findViewById(C0126R.C0129id.radio_button);
        this.f95513a = (TextView) findViewById(C0126R.C0129id.customer_name);
        this.f95514b = (TextView) findViewById(C0126R.C0129id.customer_description);
        this.f124131l = (ImageView) findViewById(C0126R.C0129id.expand_icon);
        this.f124132m = findViewById(C0126R.C0129id.customer_divider_line);
        this.f95516d = (LinearLayout) findViewById(C0126R.C0129id.customer_container);
        setBackgroundResource(C0126R.C0127drawable.wallet_uic_ripple_background);
        mo65947i();
    }

    /* renamed from: a */
    public final void mo52923a(String str) {
        super.mo52923a(str);
        this.f95515c.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95514b.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95513a.setTag(C0126R.C0129id.summary_expander_transition_name, str);
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
        this.f95515c.setVisibility(i);
        if (!z3) {
            i2 = 8;
        }
        this.f124130k.setVisibility(i2);
    }
}
