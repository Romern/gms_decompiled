package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.people.internal.SyncStatus;

/* renamed from: alni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alni extends amqd {

    /* renamed from: a */
    private final alzm f73845a;

    /* renamed from: b */
    private final Account f73846b;

    /* renamed from: c */
    private final String f73847c;

    /* renamed from: d */
    private final alsj f73848d;

    /* renamed from: e */
    private final boolean f73849e = cfyx.m143985b();

    /* renamed from: a */
    private final void m61396a(int i, String str, int i2, int i3) {
        almh almh;
        almh almh2;
        almh almh3;
        SyncStatus syncStatus = new SyncStatus(i, str);
        alzm alzm = this.f73845a;
        if (alzm != null) {
            try {
                alzm.mo40494a(amqv.f75777c.f75784a, syncStatus);
                if (this.f73849e && (almh3 = this.f75735r) != null) {
                    almh3.mo40510b(i2, i3);
                }
            } catch (RemoteException e) {
                Log.e("BasePeopleOperation", "Operation failed remotely.", e);
                if (this.f73849e && (almh = this.f75735r) != null) {
                    almh.mo40510b(10, 0);
                }
            } catch (Throwable th) {
                if (this.f73849e && (almh2 = this.f75735r) != null) {
                    almh2.mo40510b(i2, i3);
                }
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo40603b(Context context) {
        if (!amqu.m63195a(this.f73846b, this.f73847c)) {
            amdk.m62659b("BasePeopleOperation", "Sync not supported with account: %s, authority: %s.", this.f73846b.name, this.f73847c);
            m61396a(4, "Account/provider not supported.", 14, 0);
        } else if (!cgbt.m144707c()) {
            m61396a(4, "Sync status not trackable.", 15, 0);
        } else {
            m61396a(this.f73848d.mo40686b(this.f73846b.name, this.f73847c), this.f73848d.mo40695c(this.f73846b.name, this.f73847c), 2, 1);
        }
    }

    public alni(String str, int i, alzm alzm, Account account, String str2, alsj alsj) {
        super(str, i, account.name, "GetSyncStatus", null);
        this.f73845a = alzm;
        this.f73846b = account;
        this.f73847c = str2;
        this.f73848d = alsj;
    }
}
