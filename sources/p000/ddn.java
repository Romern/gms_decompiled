package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;

/* renamed from: ddn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddn {

    /* renamed from: a */
    private static final bnsp f12940a = ddp.m8201a("SyncUtils");

    /* renamed from: a */
    public static boolean m8198a(Context context, String str) {
        try {
            boolean booleanValue = AccountManager.get(context).removeAccount(new Account("Duo", str), null, null).getResult().booleanValue();
            bnsl bnsl = (bnsl) f12940a.mo68390d();
            bnsl.mo68432a("ddn", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("removeSyncAccount. Success: %s", Boolean.valueOf(booleanValue));
            return booleanValue;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            bnsl bnsl2 = (bnsl) f12940a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("ddn", "a", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("removeSyncAccount. Error");
            return false;
        }
    }
}
