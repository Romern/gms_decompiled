package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: axac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axac extends bkfd {

    /* renamed from: a */
    public final InfoMessageView f95489a = ((InfoMessageView) findViewById(16908308));

    /* renamed from: b */
    public final InfoMessageView f95490b = ((InfoMessageView) findViewById(16908309));

    /* renamed from: c */
    public bjxv f95491c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, axac, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public axac(Context context) {
        super(context);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_row_setupwizard_creatable, (ViewGroup) this, true);
        this.f124130k = (RadioButton) findViewById(C0126R.C0129id.radio_button);
    }

    /* renamed from: b */
    public final CharSequence mo52926b() {
        return getResources().getString(C0126R.string.wallet_creatable_instrument_selected, this.f95489a.mo72007c());
    }
}
