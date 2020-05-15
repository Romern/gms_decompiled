package com.google.android.gms.fitness.service.base;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.fitness.disconnect.FitCleanupIntentOperation;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PersistentBrokerService$PersistentBrokerReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ zme f32393a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentBrokerService$PersistentBrokerReceiver(zme zme) {
        super("fitness");
        this.f32393a = zme;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        char c;
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -177095062:
                if (action.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 172491798:
                if (action.equals("android.intent.action.PACKAGE_CHANGED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 267468725:
                if (action.equals("android.intent.action.PACKAGE_DATA_CLEARED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 525384130:
                if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1) {
                zme zme = this.f32393a;
                String b = yub.m44845b(intent);
                int i = zme.f55442i;
                zme.mo31252d(b);
            } else if (c == 2) {
                String b2 = yub.m44845b(intent);
                if (!yub.m44843a(context, b2)) {
                    zme zme2 = this.f32393a;
                    int i2 = zme.f55442i;
                    zme2.mo31252d(b2);
                }
            } else if (c == 3) {
                zme zme3 = this.f32393a;
                List<Account> b3 = gre.m13768b(intent);
                int i3 = zme.f55442i;
                for (Account account : b3) {
                    zmd zmd = (zmd) zme3.f55433a.remove(account.name);
                    if (zmd != null) {
                        zmd.mo31248g();
                        zme3.mo31250a(zmd);
                    }
                    zme3.f55434b.mo30713a(account.name, null);
                }
                FitCleanupIntentOperation.m23700a(context, intent);
            } else {
                String valueOf = String.valueOf(intent);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unexpected intent ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (!yub.m44844a(intent)) {
            zme zme4 = this.f32393a;
            String b4 = yub.m44845b(intent);
            int i4 = zme.f55442i;
            zme4.mo31252d(b4);
        }
    }
}
