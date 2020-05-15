package com.google.android.gms.auth.managed.p029ui;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallLoader$2 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhoneskyDpcInstallLoader$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ jhb f11083a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneskyDpcInstallLoader$2(jhb jhb, String str) {
        super(str);
        this.f11083a = jhb;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("package_name");
        int intExtra = intent.getIntExtra("package_event", -1);
        sek sek = jhb.f22465a;
        StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 49);
        sb.append("Install update for package ");
        sb.append(stringExtra);
        sb.append(" and event ");
        sb.append(intExtra);
        sek.mo25412b(sb.toString(), new Object[0]);
        if (this.f11083a.f22470e.equals(stringExtra)) {
            jhb jhb = this.f11083a;
            if (intExtra != 10) {
                if (intExtra != 11) {
                    switch (intExtra) {
                        case -1:
                            jhb.mo13730a(-3);
                            return;
                        case 0:
                            break;
                        case 1:
                            jhb.mo13730a(-5);
                            return;
                        case 2:
                        case 3:
                        case 5:
                            jhb.mo13730a(-2);
                            return;
                        case 4:
                            jhb.mo13730a(-6);
                            return;
                        case 6:
                            break;
                        default:
                            sek sek2 = jhb.f22465a;
                            StringBuilder sb2 = new StringBuilder(37);
                            sb2.append("Unexpected install event: ");
                            sb2.append(intExtra);
                            sek2.mo25416d(sb2.toString(), new Object[0]);
                            jhb.mo13730a(-2);
                            return;
                    }
                }
                jhb.mo13730a(-4);
                return;
            }
            jhb.mo13730a(-1);
        }
    }
}
