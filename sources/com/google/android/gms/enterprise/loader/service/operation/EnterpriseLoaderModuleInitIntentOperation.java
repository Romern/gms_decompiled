package com.google.android.gms.enterprise.loader.service.operation;

import android.app.admin.DevicePolicyManager;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EnterpriseLoaderModuleInitIntentOperation extends IntentOperation implements wee {

    /* renamed from: a */
    private static final sek f31265a = weh.m41831a("ModuleInit");

    /* renamed from: b */
    private weg f31266b;

    /* renamed from: c */
    private wea f31267c;

    /* renamed from: a */
    public final void mo18386a() {
        f31265a.mo25412b("enterprise_loader init complete.", new Object[0]);
    }

    public final void onHandleIntent(Intent intent) {
        if (this.f31266b == null) {
            this.f31266b = new weg(new svq(this), (DevicePolicyManager) getSystemService("device_policy"), web.m41825a(this).mo29056b());
        }
        weg weg = this.f31266b;
        if (weg.f50586d.mo29058a()) {
            weg.f50583a.mo25412b("enterprise/full already available.", new Object[0]);
        } else if (!weg.f50585c.isDeviceProvisioned()) {
            weg.f50583a.mo25414c("Device not provisioned yet.", new Object[0]);
        } else {
            if (!cdsb.m134796b()) {
                int i = Build.VERSION.SDK_INT;
                if (weg.f50584b.mo26180d("com.google.android.feature.ZERO_TOUCH")) {
                    weg.f50583a.mo25414c("Device conditions not met.", new Object[0]);
                    return;
                }
            }
            if (!cdsb.f181631a.mo6606a().mo78237c()) {
                weg.f50583a.mo25414c("Auto load feature not enabled.", new Object[0]);
            } else if (cdsb.m134801g()) {
                if (this.f31267c == null) {
                    this.f31267c = web.m41825a(this).mo29055a();
                }
                this.f31267c.mo29054a(this);
            } else {
                weg.f50583a.mo25414c("ZT config not present.", new Object[0]);
            }
        }
    }
}
