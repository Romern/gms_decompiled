package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.people.internal.SyncStatus;

/* renamed from: amqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class amqn extends amqd {

    /* renamed from: a */
    private final alzm f75764a;

    /* renamed from: b */
    private final Account f75765b;

    /* renamed from: c */
    private final String f75766c;

    /* renamed from: d */
    private final alsj f75767d;

    public amqn(String str, int i, alzm alzm, Account account, String str2, alsj alsj, String str3) {
        super(str, i, account.name, str3);
        this.f75764a = alzm;
        this.f75765b = account;
        this.f75766c = str2;
        this.f75767d = alsj;
    }

    /* renamed from: a */
    private final void m63185a(int i, String str) {
        SyncStatus syncStatus = new SyncStatus(i, str);
        alzm alzm = this.f75764a;
        if (alzm != null) {
            try {
                alzm.mo40494a(amqv.f75777c.f75784a, syncStatus);
            } catch (RemoteException e) {
                Log.e("BasePeopleOperation", "Operation failed remotely.", e);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo41262a(Account account, String str);

    /* renamed from: b */
    public final void mo40603b(Context context) {
        String str;
        int b;
        String c;
        amig.m62939a();
        if (!amqu.m63195a(this.f75765b, this.f75766c)) {
            amdk.m62659b("BasePeopleOperation", "Sync not supported with account: %s, authority: %s.", this.f75765b.name, this.f75766c);
            m63185a(4, "Account/provider not supported.");
            return;
        }
        int isSyncable = ContentResolver.getIsSyncable(this.f75765b, this.f75766c);
        if (isSyncable <= 0 && (!Boolean.valueOf(cfvk.f185780a.mo6606a().mo82935Z()).booleanValue() || isSyncable >= 0)) {
            if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83010bk()).booleanValue() && isSyncable == 0) {
                ContentResolver.setIsSyncable(this.f75765b, this.f75766c, 1);
            } else {
                amdk.m62659b("BasePeopleOperation", "Not syncable with account: %s, authority: %s.", this.f75765b.name, this.f75766c);
                m63185a(2, "Not syncable.");
                return;
            }
        }
        Account account = this.f75765b;
        String str2 = this.f75766c;
        if (ContentResolver.isSyncPending(account, str2)) {
            str = "Sync is pending.";
        } else {
            str = ContentResolver.isSyncActive(account, str2) ? "Sync is active." : "sync_is_idle";
        }
        if ("sync_is_idle".equals(str)) {
            mo41262a(this.f75765b, this.f75766c);
            str = "Sync is pending.";
        }
        if (cgbt.m144707c()) {
            this.f75767d.mo40682a(this.f75765b.name, this.f75766c, 3, str);
            boolean z = true;
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Log.e("BasePeopleOperation", "sleeping failed.");
                }
                b = this.f75767d.mo40686b(this.f75765b.name, this.f75766c);
                c = this.f75767d.mo40695c(this.f75765b.name, this.f75766c);
                if (b == 1 || b == 2) {
                    if ("Sync initialized.".equals(c) && z) {
                        mo41262a(this.f75765b, this.f75766c);
                        this.f75767d.mo40682a(this.f75765b.name, this.f75766c, 3, "Sync is pending.");
                        z = false;
                    }
                }
            }
            m63185a(b, c);
            return;
        }
        m63185a(4, "Sync status not trackable.");
    }
}
