package p000;

import android.content.Intent;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: aqlf */
public final /* synthetic */ class aqlf implements bqeh {

    /* renamed from: a */
    private final ConsentChimeraActivity f86328a;

    public aqlf(ConsentChimeraActivity consentChimeraActivity) {
        this.f86328a = consentChimeraActivity;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.f86328a;
        bmxv bmxv = (bmxv) obj;
        if (bmxv.mo66813a()) {
            return bqdx.m112673a(consentChimeraActivity.f107663g.mo33291a(500, (Intent) bmxv.mo66814b()), new aqli(consentChimeraActivity), consentChimeraActivity.f107660d);
        }
        consentChimeraActivity.mo58973a(6, "Device management is not supported");
        return bqga.m112775a(bmvz.f131120a);
    }
}
