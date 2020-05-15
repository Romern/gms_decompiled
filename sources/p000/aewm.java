package p000;

import android.widget.RadioGroup;
import com.google.android.gms.locationsharing.common.p052ui.DisableableFrameLayout;
import com.google.android.gms.locationsharing.updateshares.SharingConditionRadioGroup;
import com.google.android.gms.locationsharing.updateshares.UpdateSharesChimeraActivity;

/* renamed from: aewm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewm implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ DisableableFrameLayout f63948a;

    /* renamed from: b */
    final /* synthetic */ DisableableFrameLayout f63949b;

    /* renamed from: c */
    final /* synthetic */ UpdateSharesChimeraActivity f63950c;

    public aewm(UpdateSharesChimeraActivity updateSharesChimeraActivity, DisableableFrameLayout disableableFrameLayout, DisableableFrameLayout disableableFrameLayout2) {
        this.f63950c = updateSharesChimeraActivity;
        this.f63948a = disableableFrameLayout;
        this.f63949b = disableableFrameLayout2;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        UpdateSharesChimeraActivity updateSharesChimeraActivity = this.f63950c;
        aetk aetk = updateSharesChimeraActivity.f79755f;
        cajl a = aetk.m52536a(updateSharesChimeraActivity.mo43824b());
        bxvd da = cais.f174765c.mo74144da();
        boolean z = true;
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cais cais = (cais) da.f164949b;
            a.getClass();
            cais.f174768b = a;
            cais.f174767a |= 1;
        }
        cais cais2 = (cais) da.mo74062i();
        bxvd d = aetk.m52539d(17);
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        caix caix = (caix) d.f164949b;
        caix caix2 = caix.f174776l;
        cais2.getClass();
        caix.f174785h = cais2;
        caix.f174778a |= 2048;
        aetk.mo34552a((caix) d.mo74062i());
        if (i != ((SharingConditionRadioGroup) radioGroup).mo43818e()) {
            z = false;
        }
        DisableableFrameLayout disableableFrameLayout = this.f63948a;
        if (disableableFrameLayout != null) {
            disableableFrameLayout.mo43791a(z);
        }
        DisableableFrameLayout disableableFrameLayout2 = this.f63949b;
        if (disableableFrameLayout2 != null) {
            disableableFrameLayout2.mo43791a(z);
        }
    }
}
