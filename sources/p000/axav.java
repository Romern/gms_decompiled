package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: axav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axav extends bkfd {

    /* renamed from: a */
    final ImageWithCaptionView f95567a = ((ImageWithCaptionView) findViewById(C0126R.C0129id.select_field_image));

    /* renamed from: b */
    final TextView f95568b = ((TextView) findViewById(C0126R.C0129id.display_value));

    /* renamed from: c */
    final InfoMessageView f95569c = ((InfoMessageView) findViewById(C0126R.C0129id.display_sub_value));

    /* renamed from: d */
    public boolean f95570d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, axav, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public axav(Context context) {
        super(context);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_field_selector_option, (ViewGroup) this, true);
        this.f124130k = (RadioButton) findViewById(C0126R.C0129id.radio_button);
        this.f124131l = (ImageView) findViewById(C0126R.C0129id.expand_icon);
        this.f124132m = findViewById(C0126R.C0129id.select_field_divider_line);
        setBackgroundResource(C0126R.C0127drawable.wallet_uic_ripple_background);
        mo65947i();
    }

    /* renamed from: a */
    public final void mo52923a(String str) {
        super.mo52923a(str);
        this.f95568b.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95569c.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        this.f95567a.setTag(C0126R.C0129id.summary_expander_transition_name, str);
    }

    /* renamed from: b */
    public final CharSequence mo52926b() {
        return getResources().getString(C0126R.string.wallet_field_selector_option_selected, ((bmpk) this.f124136q).f130301b);
    }

    /* renamed from: a */
    public final void mo52924a(boolean z, boolean z2) {
        super.mo52924a(z, z2);
        boolean isChecked = this.f124130k.isChecked();
        if ((((bmpk) this.f124136q).f130300a & 512) != 0) {
            int i = 0;
            boolean z3 = !isChecked ? false : !z;
            this.f95567a.setVisibility(this.f95570d ? 0 : !z3 ? 8 : 0);
            if (this.f95570d) {
                i = 8;
            } else if (z3) {
                i = 8;
            }
            this.f124130k.setVisibility(i);
        }
        if (((bmpk) this.f124136q).f130303d.isEmpty()) {
            return;
        }
        if (isChecked && !z) {
            this.f95568b.setText(((bmpk) this.f124136q).f130303d);
            InfoMessageView infoMessageView = this.f95569c;
            bmnr bmnr = ((bmpk) this.f124136q).f130305f;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72003a(bmnr);
            return;
        }
        this.f95568b.setText(bkft.m105633a((bmpk) this.f124136q));
        InfoMessageView infoMessageView2 = this.f95569c;
        bmnr bmnr2 = ((bmpk) this.f124136q).f130304e;
        if (bmnr2 == null) {
            bmnr2 = bmnr.f130153o;
        }
        infoMessageView2.mo72003a(bmnr2);
    }
}
