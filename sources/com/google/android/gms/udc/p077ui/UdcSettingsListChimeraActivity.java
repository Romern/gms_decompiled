package com.google.android.gms.udc.p077ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;

/* renamed from: com.google.android.gms.udc.ui.UdcSettingsListChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UdcSettingsListChimeraActivity extends deu {

    /* renamed from: b */
    private static final srn f109419b = srn.m36124a();

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        setContentView(new View(this));
        if (!isFinishing() && !isChangingConfigurations()) {
            try {
                spn.m35870c((Activity) this);
                Intent intent2 = getIntent();
                if (intent2 != null) {
                    try {
                        int i = acxv.f61059b;
                        String str = null;
                        AccountData accountData = null;
                        if (acxw.m49972a(this, intent2)) {
                            sdo.checkIfNull(this, "Context must not be null.");
                            sdo.checkIfNull(intent2, "Intent must not be null.");
                            if (acxw.m49972a(this, intent2)) {
                                accountData = (AccountData) sef.m35067a(intent2, "com.google.android.gms.accounts.ACCOUNT_DATA", AccountData.CREATOR);
                            }
                            str = accountData.f79102a;
                        }
                        if (str != null) {
                            UdcSettingsListActivityRequest udcSettingsListActivityRequest = (UdcSettingsListActivityRequest) intent2.getParcelableExtra("ClientRequestExtra");
                            if (udcSettingsListActivityRequest == null || !udcSettingsListActivityRequest.mo59632a() || "me".equalsIgnoreCase(udcSettingsListActivityRequest.f109357a)) {
                                intent = avjm.m78616a(str);
                            } else {
                                intent = avjm.m78615a(this, str, udcSettingsListActivityRequest.f109357a);
                            }
                        } else {
                            intent = avjm.m78614a();
                        }
                        startActivityForResult(intent, 0);
                        setResult(-1);
                    } catch (ActivityNotFoundException e) {
                        bnsl bnsl = (bnsl) f109419b.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("com.google.android.gms.udc.ui.UdcSettingsListChimeraActivity", "onCreate", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Account settings activity not found.");
                        setResult(0);
                    }
                    finish();
                    return;
                }
                bnsl bnsl2 = (bnsl) f109419b.mo68388c();
                bnsl2.mo68432a("com.google.android.gms.udc.ui.UdcSettingsListChimeraActivity", "onCreate", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("No intent found.");
                setResult(0);
                finish();
            } catch (SecurityException e2) {
                bnsl bnsl3 = (bnsl) f109419b.mo68388c();
                bnsl3.mo68437a(e2);
                bnsl3.mo68432a("com.google.android.gms.udc.ui.UdcSettingsListChimeraActivity", "onCreate", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Non-google signed package forbidden to access this Activity");
                setResult(0);
                finish();
            }
        }
    }
}
