package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.AsyncTask;
import android.os.Build;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.plus.provider.PlusChimeraContentProvider;

/* renamed from: aoaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoaj extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ ContentResolver f78035a;

    public aoaj(ContentResolver contentResolver) {
        this.f78035a = contentResolver;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        SQLiteDatabase writableDatabase;
        Cursor query;
        Account[] accountArr = (Account[]) objArr;
        ContentProviderClient acquireContentProviderClient = this.f78035a.acquireContentProviderClient("com.google.android.gms.plus");
        try {
            PlusChimeraContentProvider plusChimeraContentProvider = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient);
            if (accountArr != null) {
                writableDatabase = plusChimeraContentProvider.f82604b.getWritableDatabase();
                writableDatabase.beginTransactionWithListener(plusChimeraContentProvider);
                try {
                    query = writableDatabase.query("plus_accounts", aoak.f78036a, null, null, null, null, null);
                    if (query != null) {
                        while (query.moveToNext()) {
                            int i = 0;
                            String string = query.getString(0);
                            while (true) {
                                if (i < accountArr.length) {
                                    if (accountArr[i].name.equals(string)) {
                                        break;
                                    }
                                    i++;
                                } else {
                                    plusChimeraContentProvider.mo46635a(string, writableDatabase);
                                    break;
                                }
                            }
                        }
                        query.close();
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLiteException e) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (e instanceof SQLiteCantOpenDatabaseException) {
                        plusChimeraContentProvider.getContext().deleteDatabase("plus.db");
                    } else {
                        throw e;
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
                writableDatabase.endTransaction();
            }
            acquireContentProviderClient.release();
            return null;
        } catch (Throwable th2) {
            acquireContentProviderClient.release();
            throw th2;
        }
    }
}
