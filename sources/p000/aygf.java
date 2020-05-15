package p000;

import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.wearable.service.WearableChimeraService;
import java.util.HashSet;
import java.util.List;

/* renamed from: aygf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aygf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WearableChimeraService f97520a;

    public aygf(WearableChimeraService wearableChimeraService) {
        this.f97520a = wearableChimeraService;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        List<PackageInfo> installedPackages = this.f97520a.getPackageManager().getInstalledPackages(0);
        HashSet hashSet = new HashSet();
        for (PackageInfo packageInfo : installedPackages) {
            hashSet.add(packageInfo.packageName);
        }
        if (ayha.m83999e()) {
            hashSet.add("com.google.android.wearable.app");
            hashSet.add("com.google.android.gms");
        }
        axxv axxv = axxv.f96690a;
        SQLiteDatabase writableDatabase = axxv.f96695c.getWritableDatabase();
        HashSet<String> hashSet2 = new HashSet(hashSet);
        Cursor query = writableDatabase.query(true, "dataItemsAndAssets", new String[]{"packageName"}, "deleted=0", null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                hashSet2.add(query.getString(0));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        hashSet2.removeAll(hashSet);
        for (String str : hashSet2) {
            axxv.mo53746c(str);
        }
    }
}
