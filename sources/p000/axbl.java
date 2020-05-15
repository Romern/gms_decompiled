package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: axbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbl extends bkfd {

    /* renamed from: a */
    final InfoMessageView f95694a = ((InfoMessageView) findViewById(C0126R.C0129id.title));

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, axbl, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public axbl(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.wallet_view_instrument_group_title, (ViewGroup) this, true);
        this.f124132m = findViewById(C0126R.C0129id.instrument_divider_line);
    }

    /* renamed from: a */
    public final void mo52923a(String str) {
        super.mo52923a(str);
        this.f95694a.setTag(C0126R.C0129id.summary_expander_transition_name, str);
    }

    /* renamed from: a */
    public final boolean mo52925a() {
        return false;
    }

    /* renamed from: b */
    public final CharSequence mo52926b() {
        return this.f95694a.getContentDescription();
    }

    /* renamed from: a */
    public final void mo52924a(boolean z, boolean z2) {
        super.mo52924a(z, z2);
        this.f95694a.setVisibility(!z ? 8 : 0);
    }
}
