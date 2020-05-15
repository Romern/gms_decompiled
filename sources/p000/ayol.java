package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.Arrays;

/* renamed from: ayol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayol {
    /* renamed from: a */
    public static byte[] m84384a(Context context) {
        String str;
        Account[] accountsByType = AccountManager.get(context).getAccountsByType("com.google");
        if (accountsByType.length > 0) {
            str = accountsByType[0].name;
        } else {
            str = null;
        }
        if (str != null) {
            byte[] b = bnzi.m110902d().mo68722a(bmwb.m108442a(str).getBytes()).mo68740b();
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("ayol", "a", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("FastPairPrototype: generate account hash %s [%s]", str, boan.f132472f.mo68795a(b, 12));
            return Arrays.copyOf(b, 12);
        }
        bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
        bnsl2.mo68432a("ayol", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("FastPairPrototype: no account");
        return Arrays.copyOf(aynf.m84291a(), 12);
    }

    /* renamed from: a */
    public static byte[] m84385a(byte[] bArr, String str) {
        return bqce.m112562a(new byte[]{4}, boan.f132472f.mo68796b(bmwb.m108444b(str)), bArr);
    }
}
