package com.google.android.gms.accountsettings.p010ui;

import android.os.Bundle;

/* renamed from: com.google.android.gms.accountsettings.ui.SearchEntryPointChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SearchEntryPointChimeraActivity extends ffm {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo6345e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo6346g() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo6347h() {
        return true;
    }

    /* renamed from: j */
    public final bsxn mo6348j() {
        bsxn j = super.mo6348j();
        bxvd bxvd = (bxvd) j.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) j);
        bsxl bsxl = (bsxl) bxvd;
        String stringExtra = getIntent().getStringExtra(":settings:fragment_args_key");
        Integer num = null;
        if (stringExtra != null) {
            try {
                num = Integer.valueOf(Integer.parseInt(stringExtra));
            } catch (NumberFormatException e) {
            }
        }
        if (num != null) {
            int intValue = num.intValue();
            if (bsxl.f164950c) {
                bsxl.mo74035c();
                bsxl.f164950c = false;
            }
            bsxn bsxn = (bsxn) bsxl.f164949b;
            bsxn bsxn2 = bsxn.f147586d;
            bsxn.f147588a |= 1;
            bsxn.f147589b = intValue;
        }
        return (bsxn) bsxl.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Bundle mo6349l() {
        Bundle bundle = new Bundle();
        bundle.putString("extra.utmSource", "android-settings");
        bundle.putString("extra.utmMedium", "search");
        return bundle;
    }

    /* renamed from: q */
    public final String mo6350q() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo6351u() {
        return 3;
    }
}
