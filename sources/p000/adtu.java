package p000;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: adtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adtu extends adul {

    /* renamed from: a */
    public adtv f62726a;

    /* renamed from: b */
    public GlifLayout f62727b;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f62726a = (adtv) aduo.m51219a(getActivity()).mo3444a(adtv.class);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.install_fl, viewGroup, false);
        this.f62727b = glifLayout;
        ((biyn) glifLayout.mo71342a(biyn.class)).f122314f.f122336f = new adts(this);
        ImageView imageView = (ImageView) this.f62727b.findViewById(C0126R.C0129id.install_fl_image);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
            aun.m2133a(imageView.getDrawable(), new adtt(this));
        }
        return this.f62727b;
    }

    public final void onDestroyView() {
        this.f62727b = null;
        super.onDestroyView();
    }

    public final void onStart() {
        super.onStart();
        this.f62726a.mo33822a(btur.SETTINGS_INSTALL_FL);
    }
}
