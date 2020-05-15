package p000;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* renamed from: dk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0934dk implements DatabaseErrorHandler {

    /* renamed from: a */
    final /* synthetic */ C0933dj[] f13376a;

    public C0934dk(C0933dj[] djVarArr) {
        this.f13376a = djVarArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C0933dj a = C0935dl.m8777a(this.f13376a, sQLiteDatabase);
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + a.mo9121f());
        if (a.mo9120e()) {
            List<Pair<String, String>> list = null;
            try {
                list = a.f13300a.getAttachedDbs();
                try {
                    a.close();
                } catch (IOException e) {
                } catch (Throwable th) {
                    th = th;
                    if (list == null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
            } catch (Throwable th2) {
                th = th2;
                if (list == null) {
                    for (Pair<String, String> pair : list) {
                        C0925dc.m8130a((String) pair.second);
                    }
                } else {
                    C0925dc.m8130a(a.mo9121f());
                }
                throw th;
            }
            if (list != null) {
                for (Pair<String, String> pair2 : list) {
                    C0925dc.m8130a((String) pair2.second);
                }
                return;
            }
            C0925dc.m8130a(a.mo9121f());
            return;
        }
        C0925dc.m8130a(a.mo9121f());
    }
}
