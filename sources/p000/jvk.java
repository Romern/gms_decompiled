package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: jvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jvk {

    /* renamed from: a */
    static final imr f23362a = imr.m15727a("account");

    /* renamed from: b */
    static final imr f23363b = imr.m15727a("is_new_account");

    /* renamed from: c */
    static final imr f23364c = imr.m15727a("is_setup_wizard");

    /* renamed from: d */
    private static final sek f23365d = ght.m13171a("AddAccount", "AppPickerHelper");

    /* renamed from: a */
    public static Intent m17399a(Context context, Account account, boolean z, boolean z2, boolean z3, rrq rrq) {
        Bundle bundle;
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.restore.APP_PICKER_ADD_ACCOUNT");
        Intent a = jvy.m17406a(context, intent);
        if (a != null) {
            Intent putExtra = a.putExtra("account", account);
            ims ims = new ims();
            ims.mo13148b(f23362a, account);
            ims.mo13148b(f23363b, Boolean.valueOf(z));
            ims.mo13148b(f23364c, Boolean.valueOf(z2));
            ims.mo13148b(jwz.f23429j, Boolean.valueOf(z3));
            imr imr = jwz.f23428i;
            if (rrq != null) {
                bundle = rrq.mo25045a();
            } else {
                bundle = null;
            }
            ims.mo13148b(imr, bundle);
            putExtra.putExtras(ims.f21367a);
        } else {
            f23365d.mo25414c("App picker activity couldn't be resolved.", new Object[0]);
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m17400a(boolean z, String str, boolean z2) {
        boolean z3;
        if (!gnv.m13553az()) {
            z3 = false;
        } else {
            z3 = z ? false : !z2 && !rrk.m34296a(str);
        }
        f23365d.mo25414c("Showing app picker = %b", Boolean.valueOf(z3));
        return z3;
    }
}
