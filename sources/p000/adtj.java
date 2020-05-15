package p000;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: adtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adtj extends adul implements adtq {
    /* renamed from: a */
    public final void mo33812a() {
        mo33813b();
    }

    /* renamed from: b */
    public final void mo33813b() {
        Fragment fragment;
        if (((ConnectivityManager) getContext().getSystemService("connectivity")).getActiveNetwork() == null) {
            adtr.m51193a(aduf.ERROR_NO_NETWORK).show(getChildFragmentManager(), "dialog");
            return;
        }
        FragmentTransaction customAnimations = getActivity().getSupportFragmentManager().beginTransaction().setCustomAnimations(C0126R.anim.sud_slide_next_in, C0126R.anim.sud_slide_next_out, C0126R.anim.sud_slide_back_in, C0126R.anim.sud_slide_back_out);
        if (!getActivity().getIntent().hasCategory("com.android.settings.suggested.category.PARENTAL_CONTROLS")) {
            fragment = new adto();
        } else {
            fragment = adty.m51203a(btur.SETTINGS_NEXT_STEPS);
        }
        customAnimations.replace(16908290, fragment).addToBackStack("disambiguation").commit();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (!ceqw.f183329a.mo6606a().mo79648a()) {
            i = C0126R.C0128layout.benefits;
        } else {
            i = C0126R.C0128layout.benefits_v2;
        }
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(i, viewGroup, false);
        ((biyn) glifLayout.mo71342a(biyn.class)).f122314f.f122336f = new adti(this);
        return glifLayout;
    }

    public final void onStart() {
        super.onStart();
        ((adtv) aduo.m51219a(getActivity()).mo3444a(adtv.class)).mo33822a(btur.SETTINGS_BENEFITS);
    }
}
