package com.google.android.gms.people.api;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeopleChimeraService extends zzx {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaai aaai;
        String str;
        String str2;
        amdk.m62657a("PeopleChimeraService", "onService. callbacks = %s, request = %s", aaac, getServiceRequest);
        if (getServiceRequest.f30229c > 0) {
            if (((sgj) bmxu.m108565a(sgj.m35206a(getServiceRequest.f30228b), sgj.UNKNOWN)).ordinal() != 206) {
                String str3 = getServiceRequest.f30230d;
                Bundle bundle = getServiceRequest.f30233g;
                String str4 = null;
                if (bundle != null) {
                    str = bundle.getString("social_client_application_id");
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    Integer num = (Integer) ancf.f76620a.get(str3);
                    if (num != null) {
                        str4 = num.toString();
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = str4;
                    } else if (cgbe.f186279a.mo6606a().mo83323b()) {
                        amdk.m62658a("PeopleChimeraService", "%s: package=%s", "Please use new constructor and specify app ID.  Talk to the team", str3);
                        str2 = "0";
                    } else {
                        throw new IllegalArgumentException("Please use new constructor and specify app ID.  Talk to the team");
                    }
                } else {
                    str2 = str;
                }
                String string = bundle.getString("real_client_package_name");
                boolean z = bundle.getBoolean("support_new_image_callback", false);
                bundle.getString("social_client_application_id");
                aaai = new almt(this, aaag.m21013a(), str3, string, str2, z, aaac.f27822a.mo25338a());
            } else {
                aaai = new ampj(this, new aaag(this, this.f56354e, this.f56355f), getServiceRequest.f30230d);
            }
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = new Bundle();
            ancb.m63964a(bundle3, ancc.f76613a, ancc.f76614b);
            boolean dc = cgbe.f186279a.mo6606a().mo83432dc();
            Binder.restoreCallingIdentity(Binder.clearCallingIdentity());
            bundle3.putBoolean("use_contactables_api", dc);
            almr.m61306a(this);
            bundle3.putBundle("config.email_type_map", almr.f73787a);
            almr.m61306a(this);
            bundle3.putBundle("config.phone_type_map", almr.f73788b);
            bundle2.putBundle("post_init_configuration", bundle3);
            bundle2.putBundle("post_init_resolution", new Bundle());
            aaac.mo16653a(aaai, bundle2);
            return;
        }
        throw new IllegalArgumentException("clientVersion too old");
    }

    public PeopleChimeraService() {
        super(new int[]{5, 208}, new String[]{"com.google.android.gms.people.service.START", "com.google.android.gms.people.contactssync.service.START"}, Collections.emptySet(), 1, sne.m35694a((int) cgbe.f186279a.mo6606a().mo83410ch(), 9), null);
    }
}
