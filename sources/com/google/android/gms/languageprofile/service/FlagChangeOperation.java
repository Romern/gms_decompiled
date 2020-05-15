package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FlagChangeOperation extends IntentOperation {

    /* renamed from: a */
    private final bmzi f79278a;

    /* renamed from: b */
    private final bmzi f79279b;

    public FlagChangeOperation() {
        this.f79278a = adwq.f62845a;
        this.f79279b = adwr.f62846a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[ADDED_TO_REGION] */
    public final void onHandleIntent(Intent intent) {
        String action;
        char c;
        if (ceqz.f183340a.mo6606a().mo79669i() && intent != null && (action = intent.getAction()) != null) {
            int hashCode = action.hashCode();
            if (hashCode != -2132810491) {
                if (hashCode == -544318258 && action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                    c = 1;
                    if (c != 0 || (c == 1 && "com.google.android.gms.languageprofile".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
                        LanguageProfileGcmTaskChimeraService.m66811a((aeat) this.f79278a.mo6606a(), (aecs) this.f79279b.mo6606a());
                    }
                    return;
                }
            } else if (action.equals("com.google.android.gms.phenotype.com.google.android.gms.languageprofile.COMMITTED")) {
                c = 0;
                if (c != 0) {
                }
                LanguageProfileGcmTaskChimeraService.m66811a((aeat) this.f79278a.mo6606a(), (aecs) this.f79279b.mo6606a());
            }
            c = 65535;
            if (c != 0) {
            }
            LanguageProfileGcmTaskChimeraService.m66811a((aeat) this.f79278a.mo6606a(), (aecs) this.f79279b.mo6606a());
        }
    }

    FlagChangeOperation(bmzi bmzi, bmzi bmzi2) {
        this.f79278a = bmzi;
        this.f79279b = bmzi2;
    }
}
