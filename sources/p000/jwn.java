package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* renamed from: jwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jwn {

    /* renamed from: a */
    public static final imr f23414a = imr.m15727a("custom_minute_maid_flow");

    /* renamed from: a */
    public static Intent m17425a(Context context, Account account, boolean z, boolean z2, boolean z3, boolean z4, rrq rrq) {
        Bundle bundle;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.auth.addaccount.POST_ADD_ACCOUNT");
        Intent a = jvy.m17406a(context, intent);
        if (a != null) {
            Intent putExtra = a.putExtra("account", account).putExtra("is_new_account", z).putExtra("is_setup_wizard", z2).putExtra("use_immersive_mode", z3).putExtra("suppress_backup_opt_in", z4);
            if (rrq != null) {
                bundle = rrq.mo25045a();
            } else {
                bundle = null;
            }
            putExtra.putExtra("ui_parameters", bundle);
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m17427a(boolean z, boolean z2, boolean z3) {
        if (z || z2) {
            return false;
        }
        if (!z3) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: b */
    public static Intent m17428b(Context context, boolean z, boolean z2, rrq rrq) {
        Bundle bundle;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.auth.addaccount.POST_PRE_ADD_ACCOUNT");
        Intent a = jvy.m17406a(context, intent);
        if (a != null) {
            Intent putExtra = a.putExtra("is_setup_wizard", z2).putExtra("use_immersive_mode", z);
            if (rrq != null) {
                bundle = rrq.mo25045a();
            } else {
                bundle = null;
            }
            putExtra.putExtra("ui_parameters", bundle);
        }
        return a;
    }

    /* renamed from: a */
    public static Intent m17426a(Context context, boolean z, boolean z2, rrq rrq) {
        Bundle bundle;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.auth.addaccount.PRE_ADD_ACCOUNT");
        Intent a = jvy.m17406a(context, intent);
        if (a != null) {
            Intent putExtra = a.putExtra("is_setup_wizard", z2).putExtra("use_immersive_mode", z);
            if (rrq != null) {
                bundle = rrq.mo25045a();
            } else {
                bundle = null;
            }
            putExtra.putExtra("ui_parameters", bundle);
        }
        return a;
    }
}
