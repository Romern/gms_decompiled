package p000;

import android.content.Context;
import android.database.Cursor;
import java.io.File;
import java.util.HashSet;

/* renamed from: vhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhr {

    /* renamed from: a */
    private static final sbw f49286a = new sbw("RealtimeCacheCleanup", "");

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m40449a(Context context, uhn uhn) {
        f49286a.mo25366a("RealtimeCacheCleanup", "Beginning Realtime garbage collection.");
        String[] strArr = {ump.DATABASE_NAME.f48247n.mo27700a()};
        HashSet hashSet = new HashSet();
        Cursor a = ((ugx) uhn).f47578a.mo27468a(umq.f48248a.mo27735b(), strArr, (uog) null, (String) null);
        while (a.moveToNext()) {
            try {
                hashSet.add(a.getString(0));
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        a.close();
        vhq vhq = new vhq(hashSet);
        vkq.m40631a(context, vpu.m41034a());
        File[] listFiles = vhj.m40438a(context).listFiles(vhq);
        if (listFiles != null) {
            for (File file : listFiles) {
                f49286a.mo25368a("RealtimeCacheCleanup", "Deleting Realtime cache database: %s", file.getName());
                file.delete();
            }
            f49286a.mo25366a("RealtimeCacheCleanup", "Finished Realtime garbage collection.");
            return;
        }
        f49286a.mo25366a("RealtimeCacheCleanup", "Realtime database directory does not exist; no need to clean up.");
    }
}
