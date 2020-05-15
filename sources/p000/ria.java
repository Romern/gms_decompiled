package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: ria */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ria {

    /* renamed from: a */
    public final bngx f43014a;

    /* renamed from: b */
    public final boolean f43015b;

    /* renamed from: c */
    public final boolean f43016c;

    /* renamed from: d */
    public final Bundle f43017d;

    /* renamed from: e */
    public final Account f43018e;

    /* renamed from: f */
    public final String f43019f;

    /* renamed from: g */
    public final String f43020g;

    /* renamed from: h */
    public final Intent f43021h;

    /* renamed from: i */
    public final int f43022i;

    /* renamed from: j */
    public final boolean f43023j;

    /* renamed from: k */
    public final bmxv f43024k;

    /* renamed from: l */
    public final ArrayList f43025l;

    /* renamed from: m */
    public final String f43026m;

    /* renamed from: n */
    public final int f43027n;

    /* renamed from: o */
    private final bmxv f43028o;

    public ria(Intent intent, int i) {
        bngx bngx;
        boolean z;
        bmxv bmxv;
        this.f43021h = intent;
        this.f43027n = i;
        String[] stringArrayExtra = intent.getStringArrayExtra("allowableAccountTypes");
        if (stringArrayExtra != null) {
            bngx = bngx.m109370a((Object[]) stringArrayExtra);
        } else {
            bngx = null;
        }
        this.f43014a = bngx;
        this.f43015b = intent.getBooleanExtra("alwaysPromptForAccount", false);
        this.f43016c = intent.getBooleanExtra("setGmsCoreAccount", false);
        this.f43017d = intent.getBundleExtra("addAccountOptions");
        this.f43018e = (Account) intent.getParcelableExtra("selectedAccount");
        this.f43019f = intent.getStringExtra("descriptionTextOverride");
        String stringExtra = intent.getStringExtra("realClientPackage");
        bmxy.m108581a(stringExtra);
        this.f43020g = stringExtra;
        this.f43025l = intent.getParcelableArrayListExtra("allowableAccounts");
        this.f43026m = intent.getStringExtra("hostedDomainFilter");
        int i2 = i - 1;
        if (i2 == 0) {
            bmxv bmxv2 = bmvz.f131120a;
            Bundle bundleExtra = intent.getBundleExtra("first_party_options_bundle");
            if (bundleExtra != null) {
                this.f43028o = bmxv.m108566b(acyq.m50011a(bundleExtra).mo33244a());
            } else {
                this.f43028o = bmvz.f131120a;
            }
            if (!this.f43028o.mo66813a() || !((acyq) this.f43028o.mo66814b()).mo33248c()) {
                z = false;
            } else {
                z = true;
            }
            this.f43023j = z;
            if (this.f43028o.mo66813a()) {
                bmxv = ((acyq) this.f43028o.mo66814b()).mo33247b();
            } else {
                bmxv = bmvz.f131120a;
            }
            this.f43024k = bmxv;
            if (this.f43028o.mo66813a() && ((acyq) this.f43028o.mo66814b()).mo33251f().mo66813a()) {
                bmxv2 = ((acyq) this.f43028o.mo66814b()).mo33251f();
            } else if (intent.hasExtra("overrideTheme")) {
                bmxv2 = bmxv.m108566b(Integer.valueOf(intent.getIntExtra("overrideTheme", 0)));
            }
            if (bmxv2.mo66813a()) {
                int intValue = ((Integer) bmxv2.mo66814b()).intValue();
                if (intValue == 1) {
                    this.f43022i = 2132017674;
                } else if (intValue == 1000) {
                    this.f43022i = 2132017673;
                } else if (intValue != 1001) {
                    this.f43022i = 2132017675;
                } else {
                    this.f43022i = 2132017671;
                }
            } else {
                this.f43022i = 0;
            }
        } else if (i2 != 1) {
            this.f43022i = 2132017675;
            this.f43024k = bmvz.f131120a;
            this.f43028o = bmvz.f131120a;
            this.f43023j = false;
        } else {
            this.f43022i = 2132017677;
            this.f43024k = bmvz.f131120a;
            this.f43028o = bmvz.f131120a;
            this.f43023j = false;
        }
    }

    /* renamed from: a */
    public final bmxv mo24640a() {
        return this.f43028o.mo66813a() ? ((acyq) this.f43028o.mo66814b()).mo33250e() : bmvz.f131120a;
    }

    /* renamed from: b */
    public final bmxv mo24641b() {
        return this.f43028o.mo66813a() ? ((acyq) this.f43028o.mo66814b()).mo33249d() : bmvz.f131120a;
    }
}
