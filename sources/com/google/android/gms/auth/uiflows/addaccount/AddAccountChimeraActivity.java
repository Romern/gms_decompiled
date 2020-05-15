package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddAccountChimeraActivity extends jxf implements jvd {

    /* renamed from: a */
    public static final imr f11299a = imr.m15727a("account");

    /* renamed from: b */
    public static final imr f11300b = imr.m15727a("offers_intent");

    /* renamed from: c */
    public static final imr f11301c = imr.m15727a("dm_status");

    /* renamed from: d */
    public static final imr f11302d = imr.m15727a("is_unicorn_account");

    /* renamed from: e */
    private static final sek f11303e = ght.m13171a("AddAccount", "AddAccountActivity");

    /* renamed from: f */
    private static final imr f11304f = imr.m15727a("account_type");

    /* renamed from: g */
    private static final imr f11305g = imr.m15727a("is_setup_wizard");

    /* renamed from: p */
    private static final imr f11306p = imr.m15727a("auth_code");

    /* renamed from: q */
    private static final imr f11307q = imr.m15727a("obfuscated_gaia_id");

    /* renamed from: r */
    private static final imr f11308r = imr.m15727a("account_name");

    /* renamed from: s */
    private static final imr f11309s = imr.m15727a("terms_of_service_accepted");

    /* renamed from: t */
    private static final imr f11310t = imr.m15727a("check_offers");

    /* renamed from: u */
    private static final imr f11311u = imr.m15727a("token_handle");

    /* renamed from: v */
    private static final imr f11312v = imr.m15727a("resolve_frp_only");

    /* renamed from: w */
    private static final imr f11313w = imr.m15727a("is_wifi_d2d");

    /* renamed from: a */
    public static Intent m6909a(Context context, String str, boolean z, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, rrq rrq, boolean z6) {
        int i;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.AddAccountActivity");
        if (!cbxv.f178529a.mo6606a().mo75598l()) {
            i = C0126R.string.auth_gls_name_checking_info_title;
        } else {
            i = C0126R.string.auth_signing_in_title;
        }
        ims a = jxf.m17460a(rrq, z4, i);
        imr imr = f11304f;
        sdo.m34959a((Object) str);
        a.mo13148b(imr, str);
        a.mo13148b(f11305g, Boolean.valueOf(z));
        imr imr2 = f11306p;
        sdo.m34959a((Object) str2);
        a.mo13148b(imr2, str2);
        a.mo13148b(f11307q, str3);
        a.mo13148b(f11308r, str4);
        a.mo13148b(f11309s, Boolean.valueOf(z2));
        a.mo13148b(f11310t, Boolean.valueOf(z3));
        a.mo13148b(f11312v, Boolean.valueOf(z5));
        a.mo13148b(f11313w, Boolean.valueOf(z6));
        return className.putExtras(a.f21367a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "AddAccountActivity";
    }

    /* access modifiers changed from: protected */
    /* renamed from: ba */
    public final void mo7716ba() {
        if (gkf.f18388a.mo11981b(this)) {
            gkf.f18388a.mo11979a(this, null);
        } else {
            super.mo7716ba();
        }
    }

    /* renamed from: c */
    public final void mo7860c() {
        f11303e.mo25414c("FRP unlocked.", new Object[0]);
        bocq bocq = ((boct) mo14206j().f164949b).f132630u;
        if (bocq == null) {
            bocq = bocq.f132590d;
        }
        bxvd bxvd = (bxvd) bocq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bocq);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bocq bocq2 = (bocq) bxvd.f164949b;
        bocq2.f132593b = 2;
        bocq2.f132592a |= 1;
        bocq bocq3 = (bocq) bxvd.mo74062i();
        bxvd j = mo14206j();
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        boct boct = (boct) j.f164949b;
        boct boct2 = boct.f132600I;
        bocq3.getClass();
        boct.f132630u = bocq3;
        boct.f132610a |= 2097152;
        mo7874a(4, null);
    }

    /* renamed from: e */
    public final void mo7861e() {
        f11303e.mo25416d("Failed to add account.", new Object[0]);
        bocq bocq = ((boct) mo14206j().f164949b).f132630u;
        if (bocq == null) {
            bocq = bocq.f132590d;
        }
        bxvd bxvd = (bxvd) bocq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bocq);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bocq bocq2 = (bocq) bxvd.f164949b;
        bocq2.f132593b = 5;
        bocq2.f132592a |= 1;
        bocq bocq3 = (bocq) bxvd.mo74062i();
        bxvd j = mo14206j();
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        boct boct = (boct) j.f164949b;
        boct boct2 = boct.f132600I;
        bocq3.getClass();
        boct.f132630u = bocq3;
        boct.f132610a |= 2097152;
        mo7874a(2, null);
    }

    public final void onBackPressed() {
        f11303e.mo25414c("onBackPressed. Ignore.", new Object[0]);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (gkf.f18388a.mo11981b(this)) {
            gkf.f18388a.mo11978a((jwz) this);
        }
        jve.m17392a(this, true, ((Boolean) mo14202g().mo13146a(f11312v)).booleanValue(), (String) mo14202g().mo13146a(f11304f), (String) mo14202g().mo13146a(f11306p), (String) mo14202g().mo13146a(f11307q), (String) mo14202g().mo13146a(f11308r), ((Boolean) mo14202g().mo13146a(f11309s)).booleanValue(), ((Boolean) mo14202g().mo13146a(f11310t)).booleanValue(), mo14203f().f43554c);
        if ((((boct) mo14206j().f164949b).f132610a & 2097152) == 0) {
            bxvd j = mo14206j();
            if (j.f164950c) {
                j.mo74035c();
                j.f164950c = false;
            }
            boct boct = (boct) j.f164949b;
            boct boct2 = boct.f132600I;
            boct.f132612c = 19;
            boct.f132610a |= 1;
            bocq bocq = bocq.f132590d;
            if (j.f164950c) {
                j.mo74035c();
                j.f164950c = false;
            }
            boct boct3 = (boct) j.f164949b;
            bocq.getClass();
            boct3.f132630u = bocq;
            boct3.f132610a = 2097152 | boct3.f132610a;
        }
    }

    /* renamed from: a */
    public final void mo7858a(int i) {
        int i2;
        bocq bocq = ((boct) mo14206j().f164949b).f132630u;
        if (bocq == null) {
            bocq = bocq.f132590d;
        }
        bxvd bxvd = (bxvd) bocq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bocq);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bocq bocq2 = (bocq) bxvd.f164949b;
        bocq2.f132593b = 1;
        bocq2.f132592a |= 1;
        bocq bocq3 = (bocq) bxvd.mo74062i();
        bxvd j = mo14206j();
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        boct boct = (boct) j.f164949b;
        boct boct2 = boct.f132600I;
        bocq3.getClass();
        boct.f132630u = bocq3;
        boct.f132610a |= 2097152;
        if (i == 4) {
            f11303e.mo25414c("FRP locked.", new Object[0]);
            i2 = C0126R.string.auth_factory_reset_protection_recent_password_change_toast;
        } else if (i != 100) {
            f11303e.mo25414c("Unknown error happened on server side.", new Object[0]);
            i2 = C0126R.string.auth_factory_reset_protection_unknown_error_toast;
        } else {
            f11303e.mo25414c("Wrong account used.", new Object[0]);
            i2 = C0126R.string.auth_factory_reset_protection_wrong_account_toast;
        }
        Toast.makeText(this, i2, 1).show();
        mo7874a(3, null);
    }

    /* renamed from: a */
    public final void mo7859a(Account account, String str, boolean z, Intent intent, boolean z2, String str2) {
        int i;
        int i2 = 5;
        if (!z2) {
            i = 5;
        } else {
            i = 4;
        }
        boolean booleanValue = ((Boolean) mo14202g().mo13147a(f11305g, false)).booleanValue();
        bocq bocq = ((boct) mo14206j().f164949b).f132630u;
        if (bocq == null) {
            bocq = bocq.f132590d;
        }
        bxvd bxvd = (bxvd) bocq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bocq);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bocq bocq2 = (bocq) bxvd.f164949b;
        bocq2.f132593b = i - 1;
        int i3 = bocq2.f132592a | 1;
        bocq2.f132592a = i3;
        if (booleanValue) {
            bocq2.f132594c = 1;
            bocq2.f132592a = i3 | 2;
        }
        bxvd j = mo14206j();
        bocq bocq3 = (bocq) bxvd.mo74062i();
        if (j.f164950c) {
            j.mo74035c();
            j.f164950c = false;
        }
        boct boct = (boct) j.f164949b;
        boct boct2 = boct.f132600I;
        bocq3.getClass();
        boct.f132630u = bocq3;
        boct.f132610a |= 2097152;
        boolean booleanValue2 = ((Boolean) mo14202g().mo13147a(f11313w, false)).booleanValue();
        if (!z2) {
            i2 = -1;
        } else if (!booleanValue2) {
            i2 = -1;
        }
        ims ims = new ims();
        ims.mo13148b(f11299a, account);
        ims.mo13148b(f11301c, str);
        ims.mo13148b(f11302d, Boolean.valueOf(z));
        ims.mo13148b(f11300b, intent);
        ims.mo13148b(f11311u, str2);
        mo7874a(i2, new Intent().putExtras(ims.f21367a));
    }
}
