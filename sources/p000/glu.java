package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.auth.AccountChangeEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: glu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class glu {

    /* renamed from: a */
    public static final sek f18585a = ght.m13171a("GoogleAccountHistoryStore");

    /* renamed from: b */
    public static final String f18586b = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s TEXT);", "AccountHistory", "id", "account_name", "change_type", "event_index", "change_data");

    /* renamed from: c */
    public static final String f18587c = String.format("CREATE TABLE IF NOT EXISTS %s ( %s TEXT NOT NULL, %s INTEGER NOT NULL, UNIQUE(%s));", "AccountEventIndex", "account_name", "event_index", "account_name");

    /* renamed from: d */
    private static final Object f18588d = new Object();

    /* renamed from: e */
    private static glu f18589e;

    /* renamed from: f */
    private final glt f18590f;

    /* renamed from: g */
    private final ReentrantLock f18591g = new ReentrantLock();

    /* renamed from: h */
    private String f18592h;

    private glu(Context context) {
        glt glt = new glt(context, "google_account_history.db");
        sdo.m34959a(glt);
        this.f18590f = glt;
    }

    /* renamed from: a */
    public static glu m13415a(Context context) {
        synchronized (f18588d) {
            if (f18589e == null) {
                f18589e = new glu(context.getApplicationContext());
            }
        }
        return f18589e;
    }

    /* renamed from: b */
    private final SQLiteDatabase m13416b() {
        try {
            return this.f18590f.getWritableDatabase();
        } catch (SQLiteException e) {
            f18585a.mo25415d("error getting writeable database", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final String mo12037a() {
        this.f18591g.lock();
        String uuid = UUID.randomUUID().toString();
        this.f18592h = uuid;
        return uuid;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final List mo12038a(String str, int i) {
        Cursor query;
        sdo.m34971a(this.f18591g.isHeldByCurrentThread(), (Object) "#getEventsForUser invoked outside of transaction.");
        sdo.m34969a(str, (Object) "Account Name must be provided.");
        LinkedList linkedList = new LinkedList();
        SQLiteDatabase b = m13416b();
        if (!(b == null || (query = b.query("AccountHistory", null, "account_name = ? AND event_index > ?", new String[]{str, String.valueOf(i)}, null, null, "event_index DESC", null)) == null)) {
            try {
                if (query.moveToFirst()) {
                    do {
                        linkedList.add(new AccountChangeEvent(query.getLong(0), query.getString(1), query.getInt(2), query.getInt(3), query.getString(4)));
                    } while (query.moveToNext());
                }
            } finally {
                query.close();
            }
        }
        return linkedList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final void mo12039a(String str) {
        sdo.m34966a((Object) this.f18592h, (Object) "Transaction must be started before it can be concluded.");
        boolean equals = this.f18592h.equals(str);
        String str2 = this.f18592h;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 44 + String.valueOf(str).length());
        sb.append("Transaction [");
        sb.append(str2);
        sb.append("] doesn't match supplied token ");
        sb.append(str);
        sdo.m34975b(equals, sb.toString());
        this.f18591g.unlock();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo12040a(String str, int i, String str2) {
        Cursor query;
        String str3 = str;
        sdo.m34971a(this.f18591g.isHeldByCurrentThread(), (Object) "#getEventsForUser invoked outside of transaction.");
        ContentValues contentValues = new ContentValues();
        sdo.m34969a(str3, (Object) "accountName must be provided");
        contentValues.put("account_name", str3);
        contentValues.put("change_data", str2);
        contentValues.put("change_type", Integer.valueOf(i));
        String format = String.format("REPLACE INTO %s(%s, %s) VALUES (?, COALESCE((SELECT %s FROM %s WHERE %s = ?) + 1, 1))", "AccountEventIndex", "account_name", "event_index", "event_index", "AccountEventIndex", "account_name");
        SQLiteDatabase b = m13416b();
        if (b != null) {
            b.beginTransaction();
            try {
                b.execSQL(format, new Object[]{str3, str3});
                query = b.query("AccountEventIndex", new String[]{"event_index"}, "account_name = ?", new String[]{str3}, null, null, null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        contentValues.put("event_index", Integer.valueOf(query.getInt(0)));
                        b.insert("AccountHistory", null, contentValues);
                        b.setTransactionSuccessful();
                    } else {
                        f18585a.mo25420f("Failed to fetch event index.", new Object[0]);
                    }
                    query.close();
                }
                b.endTransaction();
            } catch (Throwable th) {
                b.endTransaction();
                throw th;
            }
        }
    }
}
