package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.walletp2p.feature.widgets.fifenetworkimageview.FifeNetworkImageView;
import com.google.android.gms.walletp2p.feature.widgets.keypadview.KeyPadView;
import com.google.android.gms.walletp2p.feature.widgets.pindotsview.PinDotsView;

/* renamed from: axic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axic extends Fragment {

    /* renamed from: h */
    public static final /* synthetic */ int f95968h = 0;

    /* renamed from: i */
    private static ImageLoader f95969i;

    /* renamed from: a */
    public StringBuilder f95970a = new StringBuilder();

    /* renamed from: b */
    public PinDotsView f95971b;

    /* renamed from: c */
    public TextView f95972c;

    /* renamed from: d */
    public ViewSwitcher f95973d;

    /* renamed from: e */
    public axib f95974e = axht.f95961a;

    /* renamed from: f */
    public axia f95975f = axhu.f95962a;

    /* renamed from: g */
    public axif f95976g;

    /* renamed from: j */
    private View f95977j;

    /* renamed from: k */
    private FifeNetworkImageView f95978k;

    /* renamed from: l */
    private final axli f95979l = new axhz(this);

    static {
        axic.class.getSimpleName();
    }

    /* renamed from: a */
    private static final ImageLoader m82635a() {
        if (f95969i == null) {
            f95969i = axkz.m82688a();
        }
        return f95969i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.verify_pin_fragment, viewGroup, false);
        this.f95977j = inflate;
        ((KeyPadView) inflate.findViewById(C0126R.C0129id.keypad_view)).f110752a = this.f95979l;
        this.f95971b = (PinDotsView) this.f95977j.findViewById(C0126R.C0129id.pin_dots_view);
        this.f95972c = (TextView) this.f95977j.findViewById(C0126R.C0129id.error_message);
        this.f95973d = (ViewSwitcher) this.f95977j.findViewById(C0126R.C0129id.keypad_container);
        this.f95977j.findViewById(C0126R.C0129id.cancel_button).setOnClickListener(new axhv(this));
        this.f95977j.findViewById(C0126R.C0129id.forgot_pin_button).setOnClickListener(new axhw(this));
        this.f95978k = (FifeNetworkImageView) this.f95977j.findViewById(C0126R.C0129id.pin_fife_view);
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            this.f95978k.mo60205a(chlw.f188764a.mo6606a().mo85341b(), m82635a(), false, true);
        } else {
            this.f95978k.mo60205a(chlw.f188764a.mo6606a().mo85342c(), m82635a(), false, true);
        }
        if (bundle != null) {
            this.f95970a = new StringBuilder(bundle.getString("key_walletp2p_pin", ""));
        } else {
            this.f95970a = new StringBuilder();
        }
        this.f95971b.mo60215a(this.f95970a.length());
        return this.f95977j;
    }

    public final void onResume() {
        super.onResume();
        this.f95977j.announceForAccessibility(getString(C0126R.string.walletp2p_pin_title));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("key_walletp2p_pin", this.f95970a.toString());
    }

    /* renamed from: a */
    public final void mo53157a(int i) {
        if (getActivity() instanceof axlz) {
            ((axlz) getActivity()).mo53238P(i);
        }
    }
}
