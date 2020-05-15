package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: adto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adto extends adul {

    /* renamed from: a */
    public adtv f62720a;

    /* renamed from: b */
    public GlifLayout f62721b;

    /* renamed from: a */
    public final void mo33817a(btur btur, String str) {
        getActivity().getSupportFragmentManager().beginTransaction().setCustomAnimations(C0126R.anim.sud_slide_next_in, C0126R.anim.sud_slide_next_out, C0126R.anim.sud_slide_back_in, C0126R.anim.sud_slide_back_out).replace(16908290, adty.m51203a(btur)).addToBackStack(str).commit();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f62720a = (adtv) aduo.m51219a(getActivity()).mo3444a(adtv.class);
        if (bundle == null && ceqw.f183329a.mo6606a().mo79650c()) {
            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
            featureRequest.requestFeatureAtLatestVersion("kids");
            featureRequest.setUrgent();
            ModuleManager.get(getContext()).requestFeatures(featureRequest);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (ceqw.m138011b()) {
            GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.disambiguation_v2, viewGroup, false);
            this.f62721b = glifLayout;
            glifLayout.findViewById(C0126R.C0129id.shared_button).setOnClickListener(new adtk(this));
        } else {
            GlifLayout glifLayout2 = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.disambiguation, viewGroup, false);
            this.f62721b = glifLayout2;
            Drawable drawable = ((ImageView) glifLayout2.findViewById(C0126R.C0129id.disambiguation_image)).getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
                aun.m2133a(drawable, new adtn(this));
            }
        }
        this.f62721b.findViewById(C0126R.C0129id.child_button).setOnClickListener(new adtl(this));
        this.f62721b.findViewById(C0126R.C0129id.parent_button).setOnClickListener(new adtm(this));
        return this.f62721b;
    }

    public final void onDestroyView() {
        this.f62721b = null;
        super.onDestroyView();
    }

    public final void onStart() {
        super.onStart();
        this.f62720a.mo33822a(btur.SETTINGS_DISAMBIGUATION);
    }
}
