package com.google.android.gms.auth.managed.p029ui;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.android.gms.auth.managed.ui.SetNewPasswordChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetNewPasswordChimeraActivity extends deu {

    /* renamed from: b */
    private static final sek f11084b = ght.m13171a("AuthManaged", "SetNewPasswordChimeraActivity");

    /* renamed from: c */
    private String f11085c;

    /* renamed from: d */
    private boolean f11086d = false;

    /* renamed from: e */
    private long f11087e = -1;

    /* renamed from: a */
    private final void m6731a(int i) {
        if (!this.f11086d) {
            this.f11086d = true;
            bxvd e = m6732e();
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            cily cily = (cily) e.f164949b;
            cily cily2 = cily.f190683f;
            cily.f190689e = i - 1;
            cily.f190685a |= 8;
            if (this.f11087e >= 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f11087e;
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                cily cily3 = (cily) e.f164949b;
                cily3.f190685a |= 4;
                cily3.f190688d = currentTimeMillis;
            }
            jhm.m16712a(this).mo13745a(6, (cily) e.mo74062i());
        }
    }

    /* renamed from: e */
    private final bxvd m6732e() {
        bxvd da = cily.f190683f.mo74144da();
        String str = this.f11085c;
        int i = 1;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cily cily = (cily) da.f164949b;
            str.getClass();
            cily.f190685a |= 1;
            cily.f190686b = str;
        }
        if (getIntent().hasExtra("com.google.android.gms.extra.PASSWORD_COMPLEXITY")) {
            int intExtra = getIntent().getIntExtra("com.google.android.gms.extra.PASSWORD_COMPLEXITY", 0);
            if (intExtra == 0) {
                i = 2;
            } else if (intExtra == 65536) {
                i = 3;
            } else if (intExtra == 196608) {
                i = 4;
            } else if (intExtra == 327680) {
                i = 5;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cily cily2 = (cily) da.f164949b;
            cily2.f190687c = i - 1;
            cily2.f190685a |= 2;
        }
        return da;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        if (!jho.m16722b().mo13749a(this) || !devicePolicyManager.isActivePasswordSufficient()) {
            setResult(0);
            m6731a(4);
        } else {
            setResult(-1);
            m6731a(2);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        jho b = jho.m16722b();
        ComponentName callingActivity = getCallingActivity();
        if (callingActivity != null) {
            str = callingActivity.getPackageName();
        } else {
            str = null;
        }
        this.f11085c = str;
        jhm.m16712a(this).mo13745a(5, (cily) m6732e().mo74062i());
        int a = b.mo13746a();
        if (a != 1) {
            sek sek = f11084b;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Device incompatible. Reason: ");
            sb.append(a);
            sek.mo25416d(sb.toString(), new Object[0]);
            setResult(a);
            m6731a(jhm.m16713b(a));
            finish();
        } else if (!b.mo13749a(this)) {
            f11084b.mo25416d("Device admin not active.", new Object[0]);
            setResult(5);
            m6731a(8);
            finish();
        } else {
            jfv.m16651a().mo13707a(this, getIntent().getIntExtra("com.google.android.gms.extra.PASSWORD_COMPLEXITY", 0));
            Intent intent = new Intent("android.app.action.SET_NEW_PASSWORD");
            this.f11087e = System.currentTimeMillis();
            startActivityForResult(intent, 108);
        }
    }

    public final void onDestroy() {
        jfv.m16651a().mo13706a(this);
        m6731a(4);
        super.onDestroy();
    }
}
