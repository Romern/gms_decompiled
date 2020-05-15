package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: atxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atxg extends Fragment {

    /* renamed from: c */
    private static final srn f91073c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public ImageView f91074a;

    /* renamed from: b */
    public ScrollView f91075b;

    /* renamed from: d */
    private TextView f91076d;

    /* renamed from: e */
    private TextView f91077e;

    /* renamed from: a */
    public static atxg m76497a(bmuj bmuj) {
        atxg atxg = new atxg();
        Bundle bundle = new Bundle();
        bundle.putByteArray("content_key", bmuj != null ? bmuj.mo73642k() : null);
        atxg.setArguments(bundle);
        return atxg;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bitmap b;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.tp_warm_welcome_install_app_fragment, viewGroup, false);
        this.f91077e = (TextView) inflate.findViewById(C0126R.C0129id.CancelButton);
        this.f91076d = (TextView) inflate.findViewById(C0126R.C0129id.GetAppButton);
        this.f91074a = (ImageView) inflate.findViewById(C0126R.C0129id.BottomShadow);
        ScrollView scrollView = (ScrollView) inflate.findViewById(C0126R.C0129id.InfoContainer);
        this.f91075b = scrollView;
        if (scrollView != null) {
            scrollView.addOnLayoutChangeListener(new atxc(this));
        }
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.HeaderImage);
        this.f91077e.setOnClickListener(new atxd(this));
        this.f91076d.setOnClickListener(new atxe(this));
        byte[] byteArray = getArguments().getByteArray("content_key");
        bmuj bmuj = null;
        if (byteArray != null) {
            try {
                bmuj = (bmuj) bxvk.m124016a(bmuj.f130934f, byteArray, bxus.m123744c());
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) f91073c.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("atxg", "onCreateView", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to parse WarmWelcomeAppInstallPromptContent proto");
            }
        }
        if (bmuj == null) {
            return inflate;
        }
        if (!bmuj.f130940e.isEmpty() && (b = atyg.m76555b(bmuj.f130940e)) != null) {
            imageView.setImageBitmap(b);
        }
        if (bmuj.f130936a.isEmpty() || bmuj.f130939d.isEmpty() || bmuj.f130938c.isEmpty()) {
            return inflate;
        }
        ((TextView) inflate.findViewById(C0126R.C0129id.Title)).setText(bmuj.f130936a);
        this.f91077e.setText(bmuj.f130939d);
        this.f91076d.setText(bmuj.f130938c);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.Description);
        if (bmuj.f130937b.isEmpty()) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(bmuj.f130937b);
        }
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        Activity activity = getActivity();
        if (activity != null) {
            m76498a(activity, 57);
            asjl.m74236a(activity, "Warm Welcome Install App");
        }
    }

    /* renamed from: a */
    public static final void m76498a(Activity activity, int i) {
        if (activity instanceof atxh) {
            ((atxh) activity).mo50300a(i);
        }
    }
}
