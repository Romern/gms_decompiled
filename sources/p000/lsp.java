package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: lsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lsp {

    /* renamed from: a */
    public static final /* synthetic */ int f32847a = 0;

    /* renamed from: b */
    private static final Intent f32848b = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.backup.BackupAccountManagerService").addCategory("android.intent.category.DEFAULT");

    /* renamed from: c */
    private final Context f32849c;

    public lsp(Context context) {
        sdo.m34959a(context);
        this.f32849c = context;
    }

    /* renamed from: a */
    private final Object m24346a(C1570lso lso) {
        lug lug;
        rex rex = new rex();
        if (!skh.m35531a().mo25690a(this.f32849c, f32848b, rex, 1)) {
            return null;
        }
        try {
            IBinder a = rex.mo24567a();
            if (a != null) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                lug = !(queryLocalInterface instanceof lug) ? new lue(a) : (lug) queryLocalInterface;
            } else {
                lug = null;
            }
            Object a2 = lso.mo19590a(lug);
            try {
                skh.m35531a().mo25689a(this.f32849c, rex);
            } catch (IllegalArgumentException | IllegalStateException e) {
                Log.w("BackupAccountMgrClient", "Exception when unbinding: ", e);
            }
            return a2;
        } catch (InterruptedException e2) {
            Log.w("BackupAccountMgrClient", e2);
            try {
                skh.m35531a().mo25689a(this.f32849c, rex);
            } catch (IllegalArgumentException | IllegalStateException e3) {
                Log.w("BackupAccountMgrClient", "Exception when unbinding: ", e3);
            }
            return null;
        } catch (RemoteException e4) {
            Log.w("BackupAccountMgrClient", e4);
            try {
                skh.m35531a().mo25689a(this.f32849c, rex);
            } catch (IllegalArgumentException | IllegalStateException e5) {
                Log.w("BackupAccountMgrClient", "Exception when unbinding: ", e5);
            }
            return null;
        } catch (Throwable th) {
            try {
                skh.m35531a().mo25689a(this.f32849c, rex);
            } catch (IllegalArgumentException | IllegalStateException e6) {
                Log.w("BackupAccountMgrClient", "Exception when unbinding: ", e6);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final boolean mo19593b() {
        return ((Boolean) m24346a(lsn.f32846a)).booleanValue();
    }

    /* renamed from: a */
    public final Account mo19591a() {
        return (Account) m24346a(lsl.f32844a);
    }

    /* renamed from: a */
    public final void mo19592a(Account account) {
        m24346a(new lsm(account));
    }
}
