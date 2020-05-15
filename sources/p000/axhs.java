package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.widgets.fifenetworkimageview.FifeNetworkImageView;

/* renamed from: axhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axhs extends axmf {

    /* renamed from: h */
    private static ImageLoader f95955h;

    /* renamed from: a */
    public LinearLayout f95956a;

    /* renamed from: b */
    public CheckBox f95957b;

    /* renamed from: c */
    public TextView f95958c;

    /* renamed from: d */
    public ViewSwitcher f95959d;

    /* renamed from: i */
    private FifeNetworkImageView f95960i;

    /* renamed from: a */
    public static axhr m82625a(int i, bzwj bzwj) {
        int i2 = i - 1;
        if (i2 == 4 || i2 == 5) {
            return new axhr(C0126R.string.walletp2p_integrator_gmail, new String[]{bzwj.f171634c, bzwj.f171633b, bzwj.f171635d});
        } else if (i2 != 9) {
            return null;
        } else {
            return new axhr(C0126R.string.walletp2p_integrator_android_messages, new String[]{bzwj.f171634c, bzwj.f171633b, bzwj.f171636e});
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.marketing_fragment, viewGroup, false);
        this.f95956a = (LinearLayout) inflate.findViewById(C0126R.C0129id.bullet_points);
        this.f95957b = (CheckBox) inflate.findViewById(C0126R.C0129id.marketing_opt_in);
        this.f95959d = (ViewSwitcher) inflate.findViewById(C0126R.C0129id.progress);
        this.f95958c = (TextView) inflate.findViewById(C0126R.C0129id.title);
        FifeNetworkImageView fifeNetworkImageView = (FifeNetworkImageView) inflate.findViewById(C0126R.C0129id.marketing_fife_view);
        this.f95960i = fifeNetworkImageView;
        String b = chlt.f188760a.mo6606a().mo85338b();
        if (f95955h == null) {
            f95955h = axkz.m82688a();
        }
        fifeNetworkImageView.mo60205a(b, f95955h, false, true);
        axif b2 = mo53243b();
        b2.f95983b.execute(new axih(b2.f95982a, b2.f95984c, mo53242a(), new axhn(this), new axho(this)));
        ((Button) inflate.findViewById(C0126R.C0129id.continue_button)).setOnClickListener(new axhm(this));
        return inflate;
    }
}
