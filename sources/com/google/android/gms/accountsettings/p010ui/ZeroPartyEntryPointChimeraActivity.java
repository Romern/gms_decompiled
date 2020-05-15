package com.google.android.gms.accountsettings.p010ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.BuildConfig;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.Activity;

/* renamed from: com.google.android.gms.accountsettings.ui.ZeroPartyEntryPointChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ZeroPartyEntryPointChimeraActivity extends ffm {

    /* renamed from: h */
    static final ComponentName f7809h = new ComponentName("com.google.android.gms", "com.google.android.gms.accountsettings.ui.PrivacyHubActivityControlsActivity");

    /* renamed from: v */
    private final boolean m5019v() {
        return "com.android.settings.action.VIEW_ACCOUNT".equals(getIntent().getAction());
    }

    /* renamed from: w */
    private final boolean m5020w() {
        return epu.m10943a(getIntent().getStringExtra("extra.screen.screenFlavor")) == 2;
    }

    /* renamed from: x */
    private final boolean m5021x() {
        return f7809h.equals(getIntent().getComponent());
    }

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

    /* renamed from: i */
    public final boolean mo6356i() {
        return m5019v() || m5020w();
    }

    /* renamed from: j */
    public final bsxn mo6348j() {
        bsxn j = super.mo6348j();
        if (m5019v()) {
            bxvd bxvd = (bxvd) j.mo74142c(5);
            bxvd.mo73625a((bxvk) j);
            bsxl bsxl = (bsxl) bxvd;
            if (bsxl.f164950c) {
                bsxl.mo74035c();
                bsxl.f164950c = false;
            }
            bsxn bsxn = (bsxn) bsxl.f164949b;
            bsxn bsxn2 = bsxn.f147586d;
            bsxn.f147588a |= 1;
            bsxn.f147589b = 524;
            bsxl.mo70719a("screenFlavor", Integer.toString(1));
            return (bsxn) bsxl.mo74062i();
        } else if (!m5021x()) {
            return j;
        } else {
            bxvd bxvd2 = (bxvd) j.mo74142c(5);
            bxvd2.mo73625a((bxvk) j);
            bsxl bsxl2 = (bsxl) bxvd2;
            if (bsxl2.f164950c) {
                bsxl2.mo74035c();
                bsxl2.f164950c = false;
            }
            bsxn bsxn3 = (bsxn) bsxl2.f164949b;
            bsxn bsxn4 = bsxn.f147586d;
            bsxn3.f147588a |= 1;
            bsxn3.f147589b = BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD;
            return (bsxn) bsxl2.mo74062i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Bundle mo6349l() {
        Bundle l = super.mo6349l();
        if (cbro.m128206j()) {
            if (m5019v()) {
                l.putString("extra.utmSource", "android-settings");
                l.putString("extra.utmMedium", "identity-disc");
            } else if (m5021x()) {
                l.putString("extra.utmSource", "android-settings");
                l.putString("extra.utmMedium", "privacy-hub");
            } else if (m5020w()) {
                l.putString("extra.utmSource", "android-settings");
                l.putString("extra.utmMedium", BuildConfig.FLAVOR_client);
            }
        }
        return super.mo6349l();
    }

    /* renamed from: q */
    public final String mo6350q() {
        if (!cbro.m128206j()) {
            return spn.m35852a((Activity) this);
        }
        Intent intent = getIntent();
        return (intent == null || !intent.hasExtra("extra.callingPackageName")) ? "com.google.android.gms" : intent.getStringExtra("extra.callingPackageName");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo6351u() {
        return 3;
    }
}
