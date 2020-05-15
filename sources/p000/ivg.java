package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ivg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ivg {

    /* renamed from: a */
    private static final Logger f21865a = new Logger(new String[]{"HostValidator"}, (char[]) null);

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r5 != false) goto L_0x0026;
     */
    /* renamed from: a */
    public static boolean m16208a(Context context) {
        if (!ccfs.f178881a.mo6606a().mo75870c()) {
            boolean z = false;
            for (Account account : m16211c(context)) {
                if (m16209a(context, account)) {
                    z = true;
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    /* renamed from: b */
    public static Set m16210b(Context context) {
        jpc a = jpy.m17097a(context);
        Account[] c = m16211c(context);
        HashSet hashSet = new HashSet();
        for (Account account : c) {
            try {
                if (((Integer) aucu.m76783a(a.mo13967a(bsni.EASY_UNLOCK_HOST, account), ccfm.m129454b(), TimeUnit.SECONDS)).intValue() == 1) {
                    hashSet.add(account.name);
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                f21865a.mo25417e("Error getting feature enabled state.", e, new Object[0]);
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Account[] m16211c(Context context) {
        try {
            Account[] d = gie.m13199d(context, "com.google");
            if (d != null && d.length != 0) {
                return d;
            }
            f21865a.mo25418e("Invalid account list.", new Object[0]);
            return new Account[0];
        } catch (RemoteException | rfv | rfw e) {
            f21865a.mo25418e("Failed to fetch account list.", new Object[0]);
            return new Account[0];
        }
    }

    /* renamed from: a */
    private static boolean m16209a(Context context, Account account) {
        SharedPreferences sharedPreferences;
        if (ccfs.m129474b()) {
            sharedPreferences = context.getSharedPreferences("EASY_UNLOCK_GRANDFATHERED", 0);
            String valueOf = String.valueOf(account.name);
            if (sharedPreferences.contains(valueOf.length() == 0 ? new String("isGrandfatheredHost_") : "isGrandfatheredHost_".concat(valueOf))) {
                String valueOf2 = String.valueOf(account.name);
                return sharedPreferences.getBoolean(valueOf2.length() == 0 ? new String("isGrandfatheredHost_") : "isGrandfatheredHost_".concat(valueOf2), false);
            }
        } else {
            sharedPreferences = null;
        }
        try {
            SyncedCryptauthDevice syncedCryptauthDevice = (SyncedCryptauthDevice) aucu.m76783a(jpy.m17097a(context).mo13966a(account), ccfm.m129454b(), TimeUnit.SECONDS);
            if (syncedCryptauthDevice == null) {
                return false;
            }
            boolean z = true;
            if (!syncedCryptauthDevice.f11198m.contains(bsni.EASY_UNLOCK_HOST.name()) && !syncedCryptauthDevice.f11190e) {
                z = false;
            }
            if (ccfs.m129474b() && sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                String valueOf3 = String.valueOf(account.name);
                edit.putBoolean(valueOf3.length() == 0 ? new String("isGrandfatheredHost_") : "isGrandfatheredHost_".concat(valueOf3), z).commit();
            }
            return z;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f21865a.mo25417e("Error getting synced metadata.", e, new Object[0]);
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return false;
        }
    }
}
