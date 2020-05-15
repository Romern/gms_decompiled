package p000;

import android.accounts.AccountManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: rxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rxb {

    /* renamed from: a */
    public final AccountManager f43801a = AccountManager.get(rpr.m34216b());

    /* renamed from: a */
    static final String m34594a(String str) {
        try {
            PackageInfo b = svr.m36484b(rpr.m34216b()).mo26176b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length == 0 || b.signatures[0] == null)) {
                try {
                    return boan.f132472f.mo68788c().mo68794a(MessageDigest.getInstance("SHA1").digest(b.signatures[0].toByteArray()));
                } catch (NoSuchAlgorithmException e) {
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }
}
