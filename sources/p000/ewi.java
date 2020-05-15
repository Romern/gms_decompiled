package p000;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: ewi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ewi extends evn {

    /* renamed from: c */
    private final bsyq f15923c;

    /* renamed from: d */
    private final ffk f15924d;

    /* renamed from: e */
    private final Fragment f15925e;

    /* renamed from: f */
    private final sek f15926f;

    /* renamed from: g */
    private final esr f15927g;

    public ewi(bsyq bsyq, ffk ffk, Fragment fragment, sek sek, esr esr, ewh ewh, ewg ewg) {
        super(ewh, ewg);
        this.f15923c = bsyq;
        this.f15924d = ffk;
        this.f15925e = fragment;
        this.f15926f = sek;
        this.f15927g = esr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo10533a() {
        Intent intent;
        if (!ffr.m11620a(this.f15924d)) {
            this.f15885b.mo10534a(new IllegalArgumentException("No account"));
        } else if ((this.f15923c.f147701a & 1) == 0) {
            this.f15885b.mo10534a(new IllegalArgumentException("No URL"));
        } else if (!ssk.m36235a(rpr.m34216b())) {
            this.f15885b.mo10534a(new chuw(chuv.f189219f));
        } else {
            try {
                sre.m36087g(this.f15925e.getContext());
                int i = 2;
                if (cfri.m142692c()) {
                    bxvd da = akyp.f73128g.mo74144da();
                    String str = this.f15923c.f147702b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    akyp akyp = (akyp) da.f164949b;
                    str.getClass();
                    akyp.f73130a = str;
                    String str2 = this.f15924d.f16458a;
                    str2.getClass();
                    akyp.f73131b = str2;
                    akyp.f73132c = 3;
                    akyp.f73133d = 2;
                    if (adyf.f62895b == null) {
                        i = 1;
                    } else if (adyf.f62895b.booleanValue()) {
                        i = 3;
                    }
                    int i2 = i - 1;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    akyp akyp2 = (akyp) da.f164949b;
                    akyp2.f73134e = i2;
                    String str3 = this.f15927g.f15638a;
                    str3.getClass();
                    akyp2.f73135f = str3;
                    akyp akyp3 = (akyp) da.mo74062i();
                    sdo.m34971a(cfri.m142692c(), (Object) "This create intent method should only be called when octarine_dark_mode_override_enabled is set to true.");
                    sdo.m34977c(akyp3.f73131b);
                    sdo.m34977c(akyp3.f73130a);
                    intent = new Intent().setAction("com.google.android.gms.octarine.VIEW").setPackage("com.google.android.gms").putExtra("extra.url", akyp3.f73130a).putExtra("extra.accountName", akyp3.f73131b).putExtra("extra.initialTitleType", akyp3.f73132c).putExtra("extra.initialAccountDisplay", akyp3.f73133d).putExtra("extra.themeChoice", akyp3.f73134e).putExtra("extra.callingPackageName", akyp3.f73135f);
                } else {
                    intent = akvm.m60560a(this.f15923c.f147702b, this.f15924d.f16458a, this.f15927g.f15638a, 3, 2);
                }
                if (cbro.m128205i()) {
                    Activity containerActivity = this.f15925e.getActivity().getContainerActivity();
                    View findViewById = this.f15925e.getActivity().findViewById(C0126R.C0129id.toolbar);
                    String string = this.f15925e.getResources().getString(C0126R.string.as_header_transition_name);
                    int i3 = Build.VERSION.SDK_INT;
                    this.f15925e.getActivity().startActivityForResult(intent, 6, new C1000fs(ActivityOptions.makeSceneTransitionAnimation(containerActivity, findViewById, string)).f17177a.toBundle());
                } else {
                    this.f15925e.startActivityForResult(intent, 6);
                }
                this.f15884a.mo10551a(true);
            } catch (ActivityNotFoundException e) {
                this.f15926f.mo25411b("Error starting webview", e, new Object[0]);
                this.f15885b.mo10534a(e);
            }
        }
    }
}
