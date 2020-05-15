package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.auth.proximity.firstparty.SyncedDevicesUpdateSubscription;
import com.google.android.gms.auth.proximity.multidevice.BetterTogetherUnifiedSetupIntentOperation;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: joq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class joq {

    /* renamed from: a */
    public static final /* synthetic */ int f22943a = 0;

    /* renamed from: b */
    private static final sek f22944b = jsy.m17256a("CryptauthPostSyncProcessor");

    /* renamed from: a */
    public static final void m17033a(Context context, Account account) {
        sdo.m34960a();
        List b = jpx.m17092b(context.getApplicationContext());
        if (b == null) {
            f22944b.mo25418e("Failed to fetch new devices.", new Object[0]);
            return;
        }
        if (cchr.m129715c() && account != null) {
            SyncedCryptauthDevice a = jpv.m17085a(context.getApplicationContext(), account.name);
            if (a == null) {
                f22944b.mo25418e("Failed to get my synced metadata.", new Object[0]);
                return;
            }
            b.add(a);
            if (cchu.m129750f()) {
                jlg a2 = jlf.m16865a(context);
                bngx a3 = bngx.m109368a((Collection) a2.f22748b.mo14089a(account));
                jlg.f22747a.mo25414c("Updating previously enabled features (%s) and with enabled features synced from Cryptauth (%s)", a3, a.f11198m);
                a2.f22748b.mo14091b(account);
                List list = a.f11198m;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) list.get(i);
                    try {
                        bsni a4 = bsni.m116007a(str);
                        a2.f22748b.mo14092b(account, a4);
                        if (!a3.contains(a4)) {
                            a2.mo13853b(account, a4, true);
                        }
                    } catch (IllegalArgumentException e) {
                        jlg.f22747a.mo25418e("Failed to parse SyncedCryptauthDevice enabled feature (%s) to FeatureName", str, e);
                        jsw.m17254a().mo14033a(e);
                    }
                }
                a2.mo13849a(account, a3);
            }
            context.startService(BetterTogetherUnifiedSetupIntentOperation.m6879a(context, account.name));
        }
        Intent intent = new Intent("com.google.android.gms.auth.proximity.DEVICE_SYNC_FINISHED").setPackage("com.google.android.gms");
        if (account != null) {
            intent.putExtra("account_id", account.name);
        }
        context.sendBroadcast(intent);
        jqw a5 = jqw.m17133a();
        try {
            bqgh a6 = bqgh.m112796a(new jqv(a5));
            a5.mo14003a(a6);
            List<SyncedDevicesUpdateSubscription> list2 = (List) a6.get();
            if (!list2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (SyncedDevicesUpdateSubscription syncedDevicesUpdateSubscription : list2) {
                    int a7 = SyncedDevicesUpdateSubscription.m6812a(b, syncedDevicesUpdateSubscription.f11201b);
                    if (a7 != syncedDevicesUpdateSubscription.f11203d) {
                        try {
                            syncedDevicesUpdateSubscription.mo7812a(context, (Bundle) null);
                        } catch (PendingIntent.CanceledException e2) {
                            arrayList.add(a5.mo14005b(syncedDevicesUpdateSubscription));
                        }
                        arrayList.add(a5.mo14002a(new SyncedDevicesUpdateSubscription(syncedDevicesUpdateSubscription.f11200a, syncedDevicesUpdateSubscription.f11201b, syncedDevicesUpdateSubscription.f11202c, a7)));
                    }
                }
                try {
                    for (Status status : (List) bqga.m112774a((Iterable) arrayList).get()) {
                        if (!status.equals(Status.f30107a)) {
                            f22944b.mo25418e("Failed to update cache subscription. %s", status);
                        }
                    }
                } catch (InterruptedException | ExecutionException e3) {
                    f22944b.mo25417e("Failed to update cache subscriptions.", e3, new Object[0]);
                }
            }
        } catch (InterruptedException | ExecutionException e4) {
            f22944b.mo25418e("Failed to fetch subscriptions.", new Object[0]);
        }
    }
}
