package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;
import java.util.List;

/* renamed from: alqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alqt implements bmzi {

    /* renamed from: a */
    private final Context f74119a;

    /* renamed from: b */
    private alqz f74120b;

    /* renamed from: c */
    private final alqx f74121c;

    public alqt(Context context, alqx alqx) {
        this.f74119a = context;
        this.f74121c = alqx;
    }

    /* renamed from: c */
    private final alqz m61530c() {
        if (this.f74120b == null) {
            this.f74120b = new alra(new alqm(this.f74119a.getContentResolver()));
        }
        return this.f74120b;
    }

    /* renamed from: b */
    public final alqp mo6606a() {
        Cursor cursor;
        if (this.f74121c.f74144d) {
            SharedPreferences a = alqn.m61522a(this.f74119a);
            return m61530c().mo40665a(this.f74119a.getResources(), a.getLong("contacts-logger-incremental-upload-timestamp", 0), a.getLong("contacts-logger-full-upload-timestamp", 0));
        }
        alqp a2 = m61530c().mo40665a(this.f74119a.getResources(), 0, alqn.m61522a(this.f74119a).getLong("contacts-logger-full-upload-timestamp", 0));
        if (a2 != null && !a2.f74108a.isEmpty()) {
            List list = a2.f74108a;
            try {
                cursor = this.f74119a.getContentResolver().query(ContactsContract.Data.CONTENT_URI, alqv.f74132f, null, null, "times_contacted DESC LIMIT 1000");
            } catch (SQLiteException e) {
                Log.e("ContactsLogger", "CP2 query exception.", e);
                cursor = null;
            }
            if (cursor == null) {
                Log.w("ContactsLogger", "CP2 query failed.");
            } else {
                HashMap hashMap = new HashMap();
                while (cursor.moveToNext()) {
                    hashMap.put(Long.valueOf(cursor.getLong(cursor.getColumnIndex("contact_id"))), Pair.create(Long.valueOf(cursor.getLong(cursor.getColumnIndex("times_contacted"))), Long.valueOf(cursor.getLong(cursor.getColumnIndex("last_time_contacted")))));
                }
                cursor.close();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    alre alre = (alre) list.get(i);
                    Pair pair = (Pair) hashMap.get(Long.valueOf(alre.f74155a));
                    if (pair == null) {
                        amdk.m62658a("ContactsLogger", "Could not get TimesContacted for contact = %d", Long.valueOf(alre.f74155a));
                    } else {
                        alre.f74160f = (double) ((Long) pair.first).longValue();
                        alre.f74161g = ((Long) pair.first).longValue();
                        alre.f74162h = ((Long) pair.second).longValue();
                        Object obj = pair.first;
                        Object obj2 = pair.second;
                    }
                }
            }
        }
        return a2;
    }
}
