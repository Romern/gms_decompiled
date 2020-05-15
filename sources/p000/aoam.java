package p000;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.plus.provider.PlusChimeraContentProvider;

/* renamed from: aoam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoam {
    /* renamed from: a */
    public static Cursor m65703a(ContentResolver contentResolver, String str) {
        ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient("com.google.android.gms.plus");
        try {
            return ((PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient)).f82604b.getReadableDatabase().query("plus_accounts", null, "account_name=?", new String[]{str}, null, null, null);
        } finally {
            acquireContentProviderClient.release();
        }
    }

    /* renamed from: a */
    public static void m65704a(ContentResolver contentResolver, String str, String str2) {
        SQLiteDatabase writableDatabase;
        ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient("com.google.android.gms.plus");
        try {
            PlusChimeraContentProvider plusChimeraContentProvider = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient);
            writableDatabase = plusChimeraContentProvider.f82604b.getWritableDatabase();
            writableDatabase.beginTransactionWithListener(plusChimeraContentProvider);
            writableDatabase.delete("plus_profiles", "accountName=? AND packageName=?", new String[]{str, str2});
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            acquireContentProviderClient.release();
        } catch (Throwable th) {
            acquireContentProviderClient.release();
            throw th;
        }
    }
}
