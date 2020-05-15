package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;

/* renamed from: axlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axlr {
    /* renamed from: a */
    private static Account[] m82699a(Context context) {
        try {
            return gie.m13199d(context, "com.google");
        } catch (RemoteException | rfv | rfw e) {
            return new Account[0];
        }
    }

    /* renamed from: a */
    public static Account[] m82700a(Context context, Account account) {
        if (account != null) {
            return new Account[]{account};
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            return m82699a(context);
        } else {
            return (Account[]) bnpf.m110057c(bnpf.m110050a(m82699a(context)), bnpf.m110049a(soz.m35795b(context))).toArray(new Account[0]);
        }
    }
}
