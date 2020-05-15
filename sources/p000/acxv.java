package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;

/* renamed from: acxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxv {

    /* renamed from: a */
    static final acxu f61058a = new acxu();

    /* renamed from: b */
    public static final /* synthetic */ int f61059b = 0;

    static {
        new acxw(f61058a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public static void m49971a(Context context, Intent intent, AccountData accountData) {
        String str;
        sdo.checkIfNull(context, "Context must not be null.");
        sdo.checkIfNull(intent, "Intent must not be null.");
        sdo.checkIfNull(accountData, "Account data must not be null.");
        ComponentName component = intent.getComponent();
        if (component != null) {
            str = component.getPackageName();
        } else {
            str = intent.getPackage();
        }
        if (str != null) {
            sdo.checkIfNull(context, "Context must not be null.");
            sdo.m34969a(str, (Object) "Package name must not be empty.");
            if (rfz.m33557a(context).mo24610b(str)) {
                sef.m35071a(accountData, intent, "com.google.android.gms.accounts.ACCOUNT_DATA");
            }
        }
    }
}
