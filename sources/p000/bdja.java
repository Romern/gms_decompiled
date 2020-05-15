package p000;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.IOException;
import java.util.UUID;

/* renamed from: bdja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdja {

    /* renamed from: a */
    private static final bnrt f105720a = bnrt.m110178a("bdja");

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008c, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
        r10 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c A[ExcHandler: Error (e java.lang.Error), Splitter:B:5:0x0029] */
    /* renamed from: a */
    public static PackageStats m90886a(Context context) {
        UUID a;
        beel.m91856c();
        StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
        if (storageManager == null) {
            bnrq bnrq = (bnrq) f105720a.mo68387b();
            bnrq.mo68432a("bdja", "a", 30, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("StorageManager is not available");
            return null;
        }
        try {
            StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
            String packageName = context.getPackageName();
            PackageStats packageStats = new PackageStats(packageName);
            for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                if (storageVolume.getState().equals("mounted") && (a = m90887a(storageVolume)) != null) {
                    m90888a(packageStats, storageStatsManager.queryStatsForPackage(a, packageName, Process.myUserHandle()), StorageManager.UUID_DEFAULT.equals(a));
                }
            }
            return packageStats;
        } catch (PackageManager.NameNotFoundException | IOException | RuntimeException e) {
            bnrq bnrq2 = (bnrq) f105720a.mo68388c();
            bnrq2.mo68437a(e);
            bnrq2.mo68432a("bdja", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq2.mo68405a("queryStatsForPackage() call failed");
        } catch (Error e2) {
        }
        bnrq bnrq3 = (bnrq) f105720a.mo68388c();
        bnrq3.mo68437a(e);
        bnrq3.mo68432a("bdja", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnrq3.mo68405a("StorageStatsManager is not available");
        return null;
    }

    /* renamed from: a */
    private static UUID m90887a(StorageVolume storageVolume) {
        String uuid = storageVolume.getUuid();
        if (uuid == null) {
            return StorageManager.UUID_DEFAULT;
        }
        try {
            return UUID.fromString(uuid);
        } catch (IllegalArgumentException e) {
            bnrq bnrq = (bnrq) f105720a.mo68388c();
            bnrq.mo68437a(e);
            bnrq.mo68432a("bdja", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68420a("Invalid UUID format: '%s'", uuid);
            return null;
        }
    }

    /* renamed from: a */
    private static void m90888a(PackageStats packageStats, StorageStats storageStats, boolean z) {
        if (!z) {
            packageStats.externalCodeSize += storageStats.getAppBytes();
            packageStats.externalDataSize += storageStats.getDataBytes() - storageStats.getCacheBytes();
            packageStats.externalCacheSize += storageStats.getCacheBytes();
            return;
        }
        packageStats.codeSize += storageStats.getAppBytes();
        packageStats.dataSize += storageStats.getDataBytes() - storageStats.getCacheBytes();
        packageStats.cacheSize += storageStats.getCacheBytes();
    }
}
