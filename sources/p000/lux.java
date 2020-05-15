package p000;

import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.backup.base.BackupAccountManagerChimeraService;
import com.google.android.gms.backup.base.BackupTransportMigratorChimeraService;

/* renamed from: lux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lux extends luf {

    /* renamed from: a */
    final /* synthetic */ BackupAccountManagerChimeraService f33012a;

    public lux(BackupAccountManagerChimeraService backupAccountManagerChimeraService) {
        this.f33012a = backupAccountManagerChimeraService;
    }

    /* renamed from: a */
    public final Account mo19604a() {
        rex rex;
        lvn lvn;
        lug lug;
        Account account = null;
        try {
            rfz.m33557a(this.f33012a).mo24604a(Binder.getCallingUid());
            try {
                if (!BackupTransportMigratorChimeraService.m21863a(new lvp(this.f33012a))) {
                    return new lvb().mo19624a();
                }
                Intent a = BackupAccountManagerChimeraService.m21858a();
                if (a == null) {
                    BackupAccountManagerChimeraService.f28995a.mo25416d("Could not resolve service intent!", new Object[0]);
                    return null;
                }
                rex = new rex();
                try {
                    skh.m35531a().mo25690a(this.f33012a, a, rex, 1);
                    IBinder a2 = rex.mo24567a();
                    if (a2 != null) {
                        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                        lug = !(queryLocalInterface instanceof lug) ? new lue(a2) : (lug) queryLocalInterface;
                    } else {
                        lug = null;
                    }
                    account = lug.mo19604a();
                    try {
                        skh.m35531a().mo25689a(this.f33012a, rex);
                        return account;
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        e = e;
                        lvn = BackupAccountManagerChimeraService.f28995a;
                        lvn.mo25410a(e);
                        return account;
                    }
                } catch (RemoteException | InterruptedException e2) {
                    BackupAccountManagerChimeraService.f28995a.mo25410a(e2);
                    try {
                        skh.m35531a().mo25689a(this.f33012a, rex);
                        return null;
                    } catch (IllegalArgumentException | IllegalStateException e3) {
                        e = e3;
                        lvn = BackupAccountManagerChimeraService.f28995a;
                        lvn.mo25410a(e);
                        return account;
                    }
                }
            } catch (Exception e4) {
                mab.m24748a(this.f33012a, e4, cckt.m130241d());
                throw e4;
            } catch (Throwable th) {
                try {
                    skh.m35531a().mo25689a(this.f33012a, rex);
                } catch (IllegalArgumentException | IllegalStateException e5) {
                    BackupAccountManagerChimeraService.f28995a.mo25410a(e5);
                }
                throw th;
            }
        } catch (SecurityException e6) {
            BackupAccountManagerChimeraService.f28995a.mo25417e("Security Exception in getBackupAccount", e6, new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo19606c() {
        lug lug;
        try {
            rfz.m33557a(this.f33012a).mo24604a(Binder.getCallingUid());
            Intent a = BackupAccountManagerChimeraService.m21858a();
            if (a == null) {
                BackupAccountManagerChimeraService.f28995a.mo25416d("Could not resolve service intent!", new Object[0]);
                return true;
            }
            rex rex = new rex();
            try {
                skh.m35531a().mo25690a(this.f33012a, a, rex, 1);
                IBinder a2 = rex.mo24567a();
                if (a2 != null) {
                    IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                    lug = !(queryLocalInterface instanceof lug) ? new lue(a2) : (lug) queryLocalInterface;
                } else {
                    lug = null;
                }
                boolean c = lug.mo19606c();
                try {
                    skh.m35531a().mo25689a(this.f33012a, rex);
                } catch (IllegalArgumentException | IllegalStateException e) {
                    BackupAccountManagerChimeraService.f28995a.mo25410a(e);
                }
                return c;
            } catch (RemoteException | InterruptedException e2) {
                BackupAccountManagerChimeraService.f28995a.mo25410a(e2);
                try {
                    skh.m35531a().mo25689a(this.f33012a, rex);
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    BackupAccountManagerChimeraService.f28995a.mo25410a(e3);
                }
                return true;
            } catch (Throwable th) {
                try {
                    skh.m35531a().mo25689a(this.f33012a, rex);
                } catch (IllegalArgumentException | IllegalStateException e4) {
                    BackupAccountManagerChimeraService.f28995a.mo25410a(e4);
                }
                throw th;
            }
        } catch (SecurityException e5) {
            BackupAccountManagerChimeraService.f28995a.mo25417e("Security Exception in setBackupAccount", e5, new Object[0]);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo19605a(Account account) {
        SharedPreferences c;
        lvn lvn;
        lug lug;
        try {
            rfz.m33557a(this.f33012a).mo24604a(Binder.getCallingUid());
            int i = Build.VERSION.SDK_INT;
            Intent a = BackupAccountManagerChimeraService.m21858a();
            if (a == null) {
                BackupAccountManagerChimeraService.f28995a.mo25416d("Could not resolve service intent!", new Object[0]);
            } else {
                rex rex = new rex();
                try {
                    skh.m35531a().mo25690a(this.f33012a, a, rex, 1);
                    IBinder a2 = rex.mo24567a();
                    if (a2 != null) {
                        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                        lug = !(queryLocalInterface instanceof lug) ? new lue(a2) : (lug) queryLocalInterface;
                    } else {
                        lug = null;
                    }
                    lug.mo19605a(account);
                    try {
                        skh.m35531a().mo25689a(this.f33012a, rex);
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        e = e;
                        lvn = BackupAccountManagerChimeraService.f28995a;
                    }
                } catch (RemoteException | InterruptedException e2) {
                    BackupAccountManagerChimeraService.f28995a.mo25410a(e2);
                    try {
                        skh.m35531a().mo25689a(this.f33012a, rex);
                    } catch (IllegalArgumentException | IllegalStateException e3) {
                        e = e3;
                        lvn = BackupAccountManagerChimeraService.f28995a;
                    }
                } catch (Throwable th) {
                    try {
                        skh.m35531a().mo25689a(this.f33012a, rex);
                    } catch (IllegalArgumentException | IllegalStateException e4) {
                        BackupAccountManagerChimeraService.f28995a.mo25410a(e4);
                    }
                    throw th;
                }
            }
            boolean b = cckn.m130223b();
            if (!BackupTransportMigratorChimeraService.m21863a(new lvp(this.f33012a)) || !b) {
                lvb lvb = new lvb();
                int i2 = Build.VERSION.SDK_INT;
                c = lvb.mo19626c();
                if (c == null) {
                    SharedPreferences.Editor edit = c.edit();
                    edit.putString("accountName", account.name);
                    edit.putString("accountType", account.type);
                    if (!edit.commit()) {
                        lvb.f33019a.mo25418e("Fail to write legacy backup account shared preference.", new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
            lvn.mo25410a(e);
            boolean b2 = cckn.m130223b();
            if (!BackupTransportMigratorChimeraService.m21863a(new lvp(this.f33012a))) {
                return;
            }
            lvb lvb2 = new lvb();
            int i22 = Build.VERSION.SDK_INT;
            c = lvb2.mo19626c();
            if (c == null) {
            }
        } catch (SecurityException e5) {
            BackupAccountManagerChimeraService.f28995a.mo25417e("Security Exception in setBackupAccount", e5, new Object[0]);
        }
    }
}
