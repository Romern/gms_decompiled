package p000;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bqnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqnv {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f141320a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static void m113070a(String str) {
        Iterator it = f141320a.iterator();
        while (it.hasNext()) {
            bqqg bqqg = (bqqg) it.next();
            if (str.toLowerCase().startsWith("android-keystore://")) {
                return;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() == 0 ? new String("No KMS client does support: ") : "No KMS client does support: ".concat(valueOf));
    }
}
