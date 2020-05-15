package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: amqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqx {

    /* renamed from: a */
    private rkb f75787a;

    /* renamed from: b */
    private final boolean f75788b;

    public amqx(boolean z) {
        this.f75788b = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo41263a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.data_layer_settings, viewGroup, false);
        if (this.f75788b) {
            amre.m63200a((ViewGroup) inflate, this.f75787a);
        } else {
            inflate.findViewById(C0126R.C0129id.debuggability_uploaders_label).setVisibility(8);
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo41264a(deu deu) {
        deu.setTitle("APDL Debug");
        C1341rz aW = deu.mo8628aW();
        if (aW != null) {
            aW.mo15853b(true);
        }
        allp allp = new allp();
        allp.f73626a = 80;
        allq a = allp.mo40491a();
        rjy rjy = new rjy(deu.getApplicationContext());
        rjy.mo24780a(allr.f73629a, a);
        rjy.mo24775a(deu, 0, null);
        if (this.f75788b) {
            amre.m63199a(deu, rjy);
        }
        this.f75787a = rjy.mo24784b();
    }
}
