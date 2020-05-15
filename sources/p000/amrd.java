package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: amrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amrd extends Fragment {

    /* renamed from: a */
    private rkb f75797a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        deu deu = (deu) getActivity();
        deu.setTitle("Debug Data Uploaders");
        C1341rz aW = deu.mo8628aW();
        if (aW != null) {
            aW.mo15853b(true);
        }
        rjy rjy = new rjy(deu.getApplicationContext());
        rjy.mo24775a(deu, 0, null);
        amre.m63199a(deu, rjy);
        this.f75797a = rjy.mo24784b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate((int) C0126R.C0128layout.debug_uploader_list_layout, viewGroup, false);
        amre.m63200a(viewGroup2, this.f75797a);
        return viewGroup2;
    }
}
