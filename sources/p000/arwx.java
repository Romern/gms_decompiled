package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: arwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arwx extends Fragment {

    /* renamed from: a */
    public arww f88390a;

    /* renamed from: b */
    private String f88391b;

    /* renamed from: c */
    private GlifLayout f88392c;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f88390a = (arww) activity;
        } catch (ClassCastException e) {
            throw new RuntimeException("Containing activity must implement InstallAppFragment.Listener", e);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getArguments().getString("smartdevice.message");
        sdo.m34959a((Object) string);
        this.f88391b = string;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.smartdevice_app_install_confirm, viewGroup, false);
        this.f88392c = glifLayout;
        biyn biyn = (biyn) glifLayout.mo71342a(biyn.class);
        biyo biyo = new biyo(getActivity());
        biyo.mo64883a(C0126R.string.common_install);
        biyo.f122328c = 5;
        biyo.f122329d = 2132018229;
        biyp a = biyo.mo64882a();
        biyo biyo2 = new biyo(getActivity());
        biyo2.mo64883a(C0126R.string.common_no_thanks);
        biyo2.f122328c = 7;
        biyo2.f122329d = 2132018230;
        biyp a2 = biyo2.mo64882a();
        biyn.mo52733a(a);
        biyn.mo52735b(a2);
        return this.f88392c;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f88392c.mo71365c(C0126R.string.smartdevice_install_app);
        ((TextView) this.f88392c.findViewById(C0126R.C0129id.message)).setText(this.f88391b);
        biyn biyn = (biyn) this.f88392c.mo71342a(biyn.class);
        biyn.f122314f.f122336f = new arwu(this);
        biyn.f122315g.f122336f = new arwv(this);
    }
}
