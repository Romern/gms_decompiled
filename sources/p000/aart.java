package p000;

import android.database.sqlite.SQLiteException;
import android.util.Log;

/* renamed from: aart */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aart {
    /* renamed from: a */
    public static void m46807a(srp srp) {
        try {
            srp.close();
        } catch (SQLiteException e) {
            Log.e("gH_DatabaseUtil", "Sql error closing database", e);
        } catch (IllegalStateException e2) {
            Log.e("gH_DatabaseUtil", "Error closing database", e2);
        }
    }
}
