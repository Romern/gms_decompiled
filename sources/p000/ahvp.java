package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: ahvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahvp {

    /* renamed from: a */
    private final Context f68176a;

    /* renamed from: b */
    private String f68177b;

    public ahvp(Context context) {
        this.f68176a = context;
    }

    /* renamed from: a */
    public final synchronized String mo37208a() {
        if (this.f68177b == null) {
            Context context = this.f68176a;
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("Start query given name");
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, "data"), new String[]{"data2"}, null, null, null);
            String str = null;
            if (query == null) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("Get name from cursor fail due to null cursor");
            } else if (!query.moveToFirst()) {
                query.close();
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("Get name from cursor fail due to empty cursor");
            } else {
                try {
                    str = query.getString(query.getColumnIndex("data2"));
                } catch (SQLiteException e) {
                    try {
                        bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68405a("Get name from cursor fail");
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
            }
            this.f68177b = str;
        }
        return this.f68177b;
    }
}
