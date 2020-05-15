package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: rzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rzw extends sca {

    /* renamed from: a */
    int f43909a = -1;

    /* renamed from: b */
    private final Account f43910b;

    /* renamed from: c */
    private final Context f43911c;

    public rzw(Context context, Account account) {
        this.f43911c = context.getApplicationContext();
        this.f43910b = account;
    }

    /* renamed from: a */
    public static Account m34723a(scb scb) {
        Account account = null;
        if (scb != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = scb.mo25275a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rzw) {
            return this.f43910b.equals(((rzw) obj).f43910b);
        }
        return false;
    }

    /* renamed from: a */
    public final Account mo25275a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f43909a) {
            if (rfy.m33544a(this.f43911c, callingUid)) {
                this.f43909a = callingUid;
            } else {
                throw new SecurityException("Caller is not GooglePlayServices");
            }
        }
        return this.f43910b;
    }
}
