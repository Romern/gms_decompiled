package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.people.internal.SyncStatus;

/* renamed from: alnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alnf extends amqd {

    /* renamed from: f */
    private static final bnhe f73831f = bnhe.m109411a(0, 5, 1, 3, 2, 3, 3, 1);

    /* renamed from: a */
    private final alzm f73832a;

    /* renamed from: b */
    private final Account f73833b;

    /* renamed from: c */
    private final String f73834c;

    /* renamed from: d */
    private final alsj f73835d;

    /* renamed from: e */
    private final String f73836e;

    /* renamed from: a */
    private final void m61389a(int i, String str) {
        SyncStatus syncStatus = new SyncStatus(i, str);
        bxvd da = amkw.f75120e.mo74144da();
        if (cfxl.m143478b()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amkw amkw = (amkw) da.f164949b;
            amkw.f75123b = 6;
            amkw.f75122a |= 1;
            int a = anby.m63960a(this.f73836e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amkw amkw2 = (amkw) da.f164949b;
            int i2 = a - 1;
            if (a != 0) {
                amkw2.f75125d = i2;
                amkw2.f75122a |= 4;
            } else {
                throw null;
            }
        }
        alzm alzm = this.f73832a;
        if (alzm != null) {
            try {
                alzm.mo40537b(amqv.f75777c.f75784a, syncStatus);
                if (cfxl.m143478b()) {
                    almk a2 = almk.m61263a();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amkw amkw3 = (amkw) da.f164949b;
                    amkw3.f75124c = 1;
                    amkw3.f75122a |= 2;
                    a2.mo40515a((amkw) da.mo74062i());
                }
            } catch (RemoteException e) {
                if (cfxl.m143478b()) {
                    almk a3 = almk.m61263a();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amkw amkw4 = (amkw) da.f164949b;
                    amkw4.f75124c = 0;
                    amkw4.f75122a |= 2;
                    a3.mo40515a((amkw) da.mo74062i());
                }
                Log.e("GetFirstFullSyncStatusOperation", "Operation failed remotely.", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo40603b(Context context) {
        if (!cfxl.f185929a.mo6606a().mo82909b()) {
            Log.e("GetFirstFullSyncStatusOperation", "Get First Full Sync Status API is not enabled.");
            SyncStatus syncStatus = new SyncStatus(4, "Get First Full Sync Status API is not enabled.");
            alzm alzm = this.f73832a;
            if (alzm != null) {
                try {
                    alzm.mo40537b(16, syncStatus);
                } catch (RemoteException e) {
                    Log.e("GetFirstFullSyncStatusOperation", "Operation failed remotely.", e);
                }
            }
        } else if (!amqu.m63195a(this.f73833b, this.f73834c)) {
            amdk.m62659b("GetFirstFullSyncStatusOperation", "Sync not supported with account: %s, authority: %s.", this.f73833b.name, this.f73834c);
            m61389a(4, "Account/provider not supported.");
        } else if (!cgbt.m144707c()) {
            m61389a(4, "Sync status not trackable.");
        } else {
            int o = this.f73835d.mo40711o(this.f73833b.name);
            int i = o - 1;
            bnhe bnhe = f73831f;
            if (o != 0) {
                m61389a(((Integer) bnhe.getOrDefault(Integer.valueOf(i), 5)).intValue(), "Sync status unknown.");
                return;
            }
            throw null;
        }
    }

    public alnf(String str, int i, alzm alzm, Account account, String str2, alsj alsj) {
        super(str, i, account.name, "GetFirstFullSyncStatus", null);
        this.f73832a = alzm;
        this.f73833b = account;
        this.f73834c = str2;
        this.f73835d = alsj;
        this.f73836e = str;
    }
}
