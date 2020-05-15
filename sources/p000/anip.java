package p000;

import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.List;

/* renamed from: anip */
final /* synthetic */ class anip implements Runnable {

    /* renamed from: a */
    private final aniu f76952a;

    public anip(aniu aniu) {
        this.f76952a = aniu;
    }

    public final void run() {
        aniu aniu = this.f76952a;
        List<PackageInfo> installedPackages = aniu.f76969c.getPackageManager().getInstalledPackages(0);
        HashSet a = bnpf.m110048a(installedPackages.size());
        for (PackageInfo packageInfo : installedPackages) {
            a.add(packageInfo.packageName);
        }
        SQLiteDatabase writableDatabase = aniu.f76970d.getWritableDatabase();
        Cursor query = writableDatabase.query("Packages", new String[]{"packageName", "androidPackageName"}, null, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                if (!a.contains(query.getString(1)) || cgem.f186663a.mo6606a().mo83567x().f165797a.contains(string)) {
                    anih.m64471a(writableDatabase, string);
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (query != null) {
            query.close();
            return;
        }
        return;
        throw th;
    }
}
