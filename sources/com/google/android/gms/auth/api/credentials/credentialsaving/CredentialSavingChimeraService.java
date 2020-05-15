package com.google.android.gms.auth.api.credentials.credentialsaving;

import android.os.Build;
import android.os.Bundle;
import android.view.autofill.AutofillManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CredentialSavingChimeraService extends zzx {
    /* renamed from: a */
    public static Status m6357a(adbe adbe) {
        int i = adbe.f61236a;
        if (i == 7) {
            return new Status(7);
        }
        if (i == 28433) {
            return new Status(16, "Cannot find a matching credential.");
        }
        if (i == 28436) {
            return new Status(16, "Caller has been temporarily blacklisted due to too many canceled sign-in prompts");
        }
        if (i == 28442) {
            return new Status(10, "Invalid calling package");
        }
        if (i != 28443) {
            return Status.f30109c;
        }
        return new Status(10, "Caller not whitelisted to call CredentialSaving APIs");
    }

    public CredentialSavingChimeraService() {
        super(223, "com.google.android.gms.auth.api.identity.service.credentialsaving.START", bnon.f131923a, 3, 9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        bmxv a = qqt.m32666a(this, getServiceRequest.f30230d);
        if (!a.mo66813a()) {
            aaac.mo16650a(10, (Bundle) null);
            return;
        }
        aaag aaag = new aaag(this, this.f56354e, this.f56355f);
        qws qws = new qws(rpr.m34216b(), "IDENTITY_GMSCORE", null);
        String str = (String) a.mo66814b();
        String str2 = getServiceRequest.f30230d;
        Bundle bundle = getServiceRequest.f30233g;
        huv huv = new huv();
        String string = bundle.getString("session_id");
        if (string != null) {
            sdo.m34977c(string);
            huv.f20461a = string;
        }
        huw huw = new huw(huv.f20461a);
        int i = Build.VERSION.SDK_INT;
        AutofillManager autofillManager = (AutofillManager) getSystemService(AutofillManager.class);
        aaac.mo16652a(new hfi(this, aaag, qws, str, str2, huw, autofillManager != null ? bmxv.m108566b(new aczn(autofillManager)) : bmvz.f131120a));
    }
}
