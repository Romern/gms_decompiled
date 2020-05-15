package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: azcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azcm {

    /* renamed from: c */
    public static final String f98990c;

    /* renamed from: d */
    public static final String f98991d;

    /* renamed from: e */
    private static WeakReference f98992e = new WeakReference(null);

    /* renamed from: f */
    private static final String f98993f;

    /* renamed from: g */
    private static final String f98994g;

    /* renamed from: a */
    public final Context f98995a;

    /* renamed from: b */
    public SQLiteDatabase f98996b;

    static {
        String[] strArr = azdc.f99044a;
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = String.format("%s.%s as %s", "message_list_view", strArr[i], strArr[i]);
        }
        String join = TextUtils.join(",", strArr2);
        String a = azcl.m85290a("message_list_view", "conversation_id");
        String a2 = azcl.m85290a("conversations", "conversation_id");
        String a3 = azcl.m85290a("conversations", "blocked");
        String a4 = azcl.m85290a("message_list_view", "timestamp_ms");
        String a5 = azcl.m85290a("message_list_view", "status");
        String a6 = azcl.m85290a("message_list_view", "status");
        String a7 = azcl.m85290a("message_list_view", "status");
        String a8 = azcl.m85290a("message_list_view", "message_type");
        String a9 = azcl.m85290a("message_list_view", "timestamp_ms");
        int length = String.valueOf(join).length();
        int length2 = String.valueOf(a).length();
        int length3 = String.valueOf(a2).length();
        int length4 = String.valueOf(a3).length();
        int length5 = String.valueOf(a4).length();
        int length6 = String.valueOf(a5).length();
        int length7 = String.valueOf(a6).length();
        int length8 = String.valueOf(a7).length();
        StringBuilder sb = new StringBuilder(length + 195 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + String.valueOf(a8).length() + String.valueOf(a9).length());
        sb.append(" SELECT ");
        sb.append(join);
        sb.append(" FROM message_list_view, conversations WHERE ");
        sb.append(a);
        sb.append(" == ");
        sb.append(a2);
        sb.append(" AND ");
        sb.append(a3);
        sb.append(" == 0  AND ");
        sb.append(a4);
        sb.append(" >= ?  AND ");
        sb.append(a5);
        sb.append(" != 32 AND (");
        sb.append(a6);
        sb.append(" BETWEEN 1 AND 19 OR ");
        sb.append(a7);
        sb.append(" BETWEEN 30 AND 39) AND ");
        sb.append(a8);
        sb.append(" != 'application/business-chat-prompt'  ORDER BY ");
        sb.append(a9);
        sb.append(" ASC ");
        f98993f = sb.toString();
        String a10 = azcl.m85290a("messages", "message_type");
        String a11 = azcl.m85290a("messages", "status");
        String a12 = azcl.m85290a("messages", "status");
        int length9 = String.valueOf(a10).length();
        StringBuilder sb2 = new StringBuilder(length9 + 145 + String.valueOf(a11).length() + String.valueOf(a12).length());
        sb2.append("conversation_id = ?  AND status != ? AND error_code = 0 AND ");
        sb2.append(a10);
        sb2.append(" != 'application/business-chat-prompt'  AND (");
        sb2.append(a11);
        sb2.append(" BETWEEN 1 AND 19 OR ");
        sb2.append(a12);
        sb2.append(" BETWEEN 30 AND 39)");
        f98994g = sb2.toString();
        String a13 = azcl.m85290a("profile", "entity_id");
        String a14 = azcl.m85290a("profile", "entity_type");
        String a15 = azcl.m85290a("profile", "app_id");
        String a16 = azcl.m85290a("profile", "data");
        String a17 = azcl.m85290a("conversationParticipants", "conv_id");
        String a18 = azcl.m85290a("conversationParticipants", "participant_id");
        String a19 = azcl.m85290a("profile", "entity_id");
        String a20 = azcl.m85290a("conversationParticipants", "participant_type");
        String a21 = azcl.m85290a("profile", "entity_type");
        String a22 = azcl.m85290a("profile", "app_id");
        String a23 = azcl.m85290a("profile", "last_sync_timestamp");
        String a24 = azcl.m85290a("profile", "status");
        int length10 = String.valueOf(a13).length();
        int length11 = String.valueOf(a14).length();
        int length12 = String.valueOf(a15).length();
        int length13 = String.valueOf(a16).length();
        int length14 = String.valueOf(a17).length();
        int length15 = String.valueOf(a18).length();
        int length16 = String.valueOf(a19).length();
        int length17 = String.valueOf(a20).length();
        int length18 = String.valueOf(a21).length();
        int length19 = String.valueOf(a22).length();
        StringBuilder sb3 = new StringBuilder(length10 + 111 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + length19 + String.valueOf(a23).length() + String.valueOf(a24).length());
        sb3.append("SELECT ");
        sb3.append(a13);
        sb3.append(", ");
        sb3.append(a14);
        sb3.append(", ");
        sb3.append(a15);
        sb3.append(", ");
        sb3.append(a16);
        sb3.append(" FROM conversationParticipants INNER JOIN profile ON ");
        sb3.append(a17);
        sb3.append(" =? AND ");
        sb3.append(a18);
        sb3.append(" = ");
        sb3.append(a19);
        sb3.append(" AND ");
        sb3.append(a20);
        sb3.append(" = ");
        sb3.append(a21);
        sb3.append(" AND ");
        sb3.append(a22);
        sb3.append(" =? AND ");
        sb3.append(a23);
        sb3.append(" >=? AND ");
        sb3.append(a24);
        sb3.append(" = 2");
        f98990c = sb3.toString();
        String a25 = azcl.m85290a("user", "id");
        String a26 = azcl.m85290a("user", "type");
        String a27 = azcl.m85290a("user", "app_id");
        String a28 = azcl.m85290a("user", "registration_id");
        String a29 = azcl.m85290a("user", "registration_id");
        String a30 = azcl.m85290a("user", "type");
        int length20 = String.valueOf(a25).length();
        int length21 = String.valueOf(a26).length();
        int length22 = String.valueOf(a27).length();
        int length23 = String.valueOf(a28).length();
        StringBuilder sb4 = new StringBuilder(length20 + 37 + length21 + length22 + length23 + String.valueOf(a29).length() + String.valueOf(a30).length());
        sb4.append("SELECT ");
        sb4.append(a25);
        sb4.append(",");
        sb4.append(a26);
        sb4.append(",");
        sb4.append(a27);
        sb4.append(",");
        sb4.append(a28);
        sb4.append(" FROM user ORDER BY ");
        sb4.append(a29);
        sb4.append(", ");
        sb4.append(a30);
        sb4.append(" DESC");
        f98991d = sb4.toString();
    }

    public azcm(Context context, SQLiteDatabase sQLiteDatabase) {
        this.f98995a = context;
        this.f98996b = sQLiteDatabase;
    }

    /* renamed from: a */
    public static int m85299a(int i) {
        if (i == 2) {
            return 36;
        }
        if (i == 4) {
            return 35;
        }
        switch (i) {
            case 31:
                return 21;
            case 32:
                return 24;
            case 33:
                return 22;
            case 34:
                return 26;
            default:
                return 2;
        }
    }

    /* renamed from: b */
    public static Cursor m85307b(SQLiteDatabase sQLiteDatabase, String str) {
        return sQLiteDatabase.query("conversationParticipants", new String[]{"participant_id", "participant_type"}, "conv_id = ?", new String[]{str}, null, null, "_id ASC ");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: c */
    public static void m85308c(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sid", str);
        contentValues.put("status", (Integer) 1);
        sQLiteDatabase.insert("appData", null, contentValues);
    }

    /* renamed from: d */
    public final long mo54663d(String str) {
        long j;
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        try {
            new Object[1][0] = "SELECT COUNT(*) FROM messages WHERE messages.status == 31 AND messages.conversation_id == ? ";
            SQLiteStatement compileStatement = this.f98996b.compileStatement("SELECT COUNT(*) FROM messages WHERE messages.status == 31 AND messages.conversation_id == ? ");
            compileStatement.bindAllArgsAsStrings(new String[]{str});
            j = compileStatement.simpleQueryForLong();
            try {
                new Object[1][0] = Long.valueOf(j);
            } catch (SQLiteDoneException e) {
                e = e;
            }
        } catch (SQLiteDoneException e2) {
            e = e2;
            j = 0;
            azoj.m85931a("DatabaseOperations", e, "No rows returned", new Object[0]);
            return j;
        }
        return j;
    }

    /* renamed from: e */
    public final long mo54665e() {
        long j;
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        this.f98996b.beginTransaction();
        try {
            Cursor query = this.f98996b.query("messages", new String[]{"server_timestamp_ms"}, null, null, null, null, "server_timestamp_ms DESC", "1");
            this.f98996b.setTransactionSuccessful();
            if (query.moveToFirst()) {
                j = query.getLong(0);
            } else {
                j = 0;
            }
            if (query != null) {
                query.close();
            }
            return j;
        } finally {
            this.f98996b.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* renamed from: f */
    public final List mo54667f() {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        ArrayList arrayList = new ArrayList();
        this.f98996b.beginTransaction();
        try {
            cursor = this.f98996b.query("user", new String[]{"id", "type", "app_id"}, null, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        do {
                            arrayList.add(new LocalEntityId(cursor.getString(cursor.getColumnIndex("id")), cursor.getInt(cursor.getColumnIndex("type")), cursor.getString(cursor.getColumnIndex("app_id"))));
                        } while (cursor.moveToNext());
                        cursor.close();
                        sQLiteDatabase = this.f98996b;
                        sQLiteDatabase.setTransactionSuccessful();
                        this.f98996b.endTransaction();
                        return arrayList;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    this.f98996b.setTransactionSuccessful();
                    this.f98996b.endTransaction();
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            sQLiteDatabase = this.f98996b;
            sQLiteDatabase.setTransactionSuccessful();
            this.f98996b.endTransaction();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            this.f98996b.setTransactionSuccessful();
            this.f98996b.endTransaction();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* renamed from: g */
    public final List mo54669g() {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        ArrayList arrayList = new ArrayList();
        this.f98996b.beginTransaction();
        try {
            cursor = this.f98996b.query("registration", new String[]{"server_registration_id"}, null, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        do {
                            byte[] a = azpi.m86073a(cursor.getString(cursor.getColumnIndex("server_registration_id")));
                            if (a != null) {
                                arrayList.add(a);
                            }
                        } while (cursor.moveToNext());
                        this.f98996b.setTransactionSuccessful();
                        cursor.close();
                        sQLiteDatabase = this.f98996b;
                        sQLiteDatabase.endTransaction();
                        return arrayList;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.f98996b.endTransaction();
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            sQLiteDatabase = this.f98996b;
            sQLiteDatabase.endTransaction();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            this.f98996b.endTransaction();
            throw th;
        }
    }

    /* renamed from: h */
    public final Cursor mo54671h(String str) {
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        return this.f98996b.query("conversations", new String[]{"blocked"}, "conversation_id = ?", new String[]{str}, null, null, null);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public final Cursor mo54672i(String str) {
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        this.f98996b.beginTransaction();
        Cursor cursor = null;
        try {
            Cursor query = this.f98996b.query("user", new String[]{"id", "type", "app_id"}, "registration_id = ?", new String[]{str}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        this.f98996b.setTransactionSuccessful();
                        this.f98996b.endTransaction();
                        return query;
                    }
                } catch (SQLiteException e) {
                    cursor = query;
                    try {
                        azoj.m85933c("DatabaseOperations", "Failed to get userIDs", new Object[0]);
                        this.f98996b.endTransaction();
                        return cursor;
                    } catch (Throwable th) {
                        this.f98996b.endTransaction();
                        throw th;
                    }
                }
            }
            this.f98996b.endTransaction();
            return null;
        } catch (SQLiteException e2) {
            azoj.m85933c("DatabaseOperations", "Failed to get userIDs", new Object[0]);
            this.f98996b.endTransaction();
            return cursor;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* renamed from: j */
    public final void mo54673j(String str) {
        SQLiteDatabase sQLiteDatabase;
        if (!mo54658b()) {
            azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            return;
        }
        this.f98996b.beginTransaction();
        Cursor cursor = null;
        try {
            cursor = this.f98996b.query("messages", new String[]{"_id"}, "conversation_id = ? AND (status BETWEEN 1 AND 19 OR status BETWEEN 30 AND 39)", new String[]{str}, null, null, "_id DESC", null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("last_dismissed_message", Long.valueOf(cursor.getLong(0)));
                        this.f98996b.update("conversations", contentValues, "conversation_id= ? ", new String[]{str});
                        this.f98996b.setTransactionSuccessful();
                        cursor.close();
                        sQLiteDatabase = this.f98996b;
                        sQLiteDatabase.endTransaction();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    try {
                        azoj.m85931a("DatabaseOperations", e, "Couldn't set last dismissed message", new Object[0]);
                        if (cursor != null) {
                        }
                        sQLiteDatabase = this.f98996b;
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                        }
                        this.f98996b.endTransaction();
                        throw th;
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            sQLiteDatabase = this.f98996b;
        } catch (SQLiteException e2) {
            e = e2;
            azoj.m85931a("DatabaseOperations", e, "Couldn't set last dismissed message", new Object[0]);
            if (cursor != null) {
                cursor.close();
            }
            sQLiteDatabase = this.f98996b;
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            this.f98996b.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return r1;
     */
    /* renamed from: a */
    public static synchronized azcm m85300a(Context context) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (azcm.class) {
            azcm azcm = (azcm) f98992e.get();
            if (azcm == null) {
                Context applicationContext = context.getApplicationContext();
                try {
                    sQLiteDatabase = azcl.m85289a(applicationContext).getWritableDatabase();
                } catch (SQLiteException e) {
                    azoj.m85932b("DatabaseOperations", "Can not create database instance with write permission.", new Object[0]);
                    sQLiteDatabase = null;
                }
                azcm azcm2 = new azcm(applicationContext, sQLiteDatabase);
                if (!azcm2.mo54651a()) {
                    azcm = azcm2;
                } else {
                    f98992e = new WeakReference(azcm2);
                    return azcm2;
                }
            }
        }
    }

    /* renamed from: b */
    public final Cursor mo54655b(String str, int i) {
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        return this.f98996b.query("messages", new String[]{"message_id", "server_timestamp_ms"}, f98994g, new String[]{str, Integer.toString(32)}, null, null, "server_timestamp_ms DESC", Integer.toString(i));
    }

    @Deprecated
    /* renamed from: c */
    public final void mo54660c() {
        m85303a(this.f98996b, this.f98995a);
    }

    /* renamed from: c */
    public final void mo54661c(long j) {
        if (!mo54658b()) {
            azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            return;
        }
        this.f98996b.beginTransaction();
        try {
            int delete = this.f98996b.delete("preloadedFiles", "download_manager_id = ? ", new String[]{String.valueOf(j)});
            this.f98996b.setTransactionSuccessful();
            if (delete > 0) {
                new Object[1][0] = Long.valueOf(j);
                azeb.m85504a(this.f98995a).f99138c.remove(j);
                return;
            }
            azoj.m85933c("DatabaseOperations", "Delete row failed for download id: %s", Long.valueOf(j));
        } finally {
            this.f98996b.endTransaction();
        }
    }

    /* renamed from: d */
    public final void mo54664d() {
        if (mo54658b()) {
            if (!mo54651a()) {
                this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
            }
            this.f98996b.beginTransaction();
            try {
                Cursor query = this.f98996b.query("preloadedFiles", new String[]{"download_manager_id"}, null, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            do {
                                mo54661c(query.getLong(query.getColumnIndex("download_manager_id")));
                            } while (query.moveToNext());
                            query.close();
                            return;
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
            } finally {
                this.f98996b.setTransactionSuccessful();
                this.f98996b.endTransaction();
            }
        } else {
            azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            return;
        }
        throw th;
    }

    /* renamed from: b */
    public final azct mo54656b(byte[] bArr) {
        azct azct = null;
        if (bArr == null) {
            return null;
        }
        this.f98996b.beginTransaction();
        try {
            if (!mo54651a()) {
                this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
            }
            Cursor a = mo54640a(bArr);
            if (a != null) {
                azct a2 = m85301a(a);
                a.close();
                Cursor i = mo54672i(azpi.m86066a(a2.f99004a));
                if (i != null) {
                    m85305a(a2.f99010g, i);
                    i.close();
                    if (a2.f99011h != 1 && a2.f99010g.isEmpty()) {
                        azoj.m85933c("DatabaseOperations", "non anonymous registration doesn't have users", new Object[0]);
                    }
                    azct = a2;
                }
            }
            return azct;
        } finally {
            this.f98996b.setTransactionSuccessful();
            this.f98996b.endTransaction();
        }
    }

    /* renamed from: a */
    public static azct m85301a(Cursor cursor) {
        azct azct = new azct();
        azct.f99004a = azpi.m86073a(cursor.getString(0));
        azct.f99005b = cursor.getBlob(1);
        azct.f99006c = cursor.getLong(2);
        cursor.getString(7);
        cursor.getInt(4);
        azct.f99008e = cursor.getBlob(5);
        azct.f99007d = cursor.getBlob(6);
        azct.f99009f = azpi.m86087e(cursor.getString(8));
        azct.f99011h = cursor.getInt(3);
        azct.f99012i = cursor.getLong(9);
        azct.f99010g = new ArrayList();
        afiv afiv = (afiv) azol.m85935a((bxxk) afiv.f64256b.mo74142c(7), cursor.getBlob(10));
        return azct;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* renamed from: f */
    public final boolean mo54668f(String str) {
        Cursor cursor;
        Throwable th;
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        this.f98996b.beginTransaction();
        try {
            cursor = this.f98996b.query("messages", new String[]{"_id"}, "conversation_id = ? AND status >= ? AND status NOT IN (?,?)", new String[]{str, Integer.toString(3), Integer.toString(20), Integer.toString(21)}, null, null, null);
            try {
                boolean moveToFirst = cursor.moveToFirst();
                if (cursor != null) {
                    cursor.close();
                }
                this.f98996b.setTransactionSuccessful();
                this.f98996b.endTransaction();
                return moveToFirst;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                }
                this.f98996b.setTransactionSuccessful();
                this.f98996b.endTransaction();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            this.f98996b.setTransactionSuccessful();
            this.f98996b.endTransaction();
            throw th;
        }
    }

    /* renamed from: e */
    public final List mo54666e(String str) {
        long j;
        SQLiteDatabase sQLiteDatabase;
        String str2;
        azox.m85982b();
        ArrayList arrayList = new ArrayList();
        azox.m85982b();
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        this.f98996b.beginTransaction();
        Cursor query = this.f98996b.query("conversations", new String[]{"last_dismissed_message", "last_dismissed_in_notification"}, "conversation_id = ?", new String[]{str}, null, null, null, null);
        long j2 = -1;
        if (query == null) {
            j = -1;
        } else {
            if (query.moveToFirst()) {
                j2 = query.getLong(0);
                j = query.getLong(1);
                Object[] objArr = {str, Long.valueOf(j2), Long.valueOf(j)};
            } else {
                j = -1;
            }
            query.close();
        }
        boolean H = azdl.m85412a(this.f98995a).mo54734H();
        SQLiteDatabase sQLiteDatabase2 = this.f98996b;
        String[] strArr = azdc.f99044a;
        if (H) {
            long currentTimeMillis = System.currentTimeMillis();
            sQLiteDatabase = sQLiteDatabase2;
            long millis = TimeUnit.DAYS.toMillis(7);
            StringBuilder sb = new StringBuilder(40);
            sb.append(" AND timestamp_ms > ");
            sb.append(currentTimeMillis - millis);
            str2 = sb.toString();
        } else {
            sQLiteDatabase = sQLiteDatabase2;
            str2 = "";
        }
        String valueOf = String.valueOf(str2);
        Cursor query2 = sQLiteDatabase.query("message_list_view", strArr, valueOf.length() == 0 ? new String("conversation_id = ? AND _id > ? AND _id > ? AND message_type != 'application/business-chat-prompt'  AND status BETWEEN ? AND ? ") : "conversation_id = ? AND _id > ? AND _id > ? AND message_type != 'application/business-chat-prompt'  AND status BETWEEN ? AND ? ".concat(valueOf), new String[]{str, Long.toString(j2), Long.toString(j), Integer.toString(1), Integer.toString(19)}, null, null, "server_timestamp_ms ASC", null);
        this.f98996b.setTransactionSuccessful();
        this.f98996b.endTransaction();
        if (query2 != null) {
            if (query2.moveToFirst()) {
                do {
                    arrayList.add(azdd.m85387a(query2));
                } while (query2.moveToNext());
            }
            query2.close();
            Object[] objArr2 = {Integer.valueOf(arrayList.size()), str};
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* renamed from: c */
    public final boolean mo54662c(String str) {
        Cursor cursor;
        Throwable th;
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        try {
            cursor = this.f98996b.query("messages", new String[]{"message_id"}, "message_id = ?", new String[]{str}, null, null, null);
            try {
                if (cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return true;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* renamed from: g */
    public final boolean mo54670g(String str) {
        Cursor cursor;
        bmxy.m108600b(this.f98996b.inTransaction());
        try {
            cursor = mo54671h(str);
            try {
                boolean z = false;
                if (cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    if (cursor.getInt(cursor.getColumnIndex("blocked")) > 0) {
                        z = true;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return z;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r3 != null) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    @Deprecated
    /* renamed from: a */
    public static LocalEntityId m85302a(SQLiteDatabase sQLiteDatabase, aznz aznz) {
        Cursor cursor = null;
        r2 = null;
        LocalEntityId localEntityId = null;
        if (aznz == null || !aznz.mo55105c()) {
            new Object[1][0] = aznz;
            return null;
        } else if (TextUtils.equals(aznz.f99775b, "FB")) {
            return aznz.f99781h;
        } else {
            try {
                sQLiteDatabase.beginTransaction();
                Cursor b = m85307b(sQLiteDatabase, aznz.f99774a);
                if (b != null) {
                    try {
                        if (b.moveToFirst()) {
                            localEntityId = new LocalEntityId(b.getString(0), b.getInt(1), aznz.f99775b);
                            b.close();
                            sQLiteDatabase.endTransaction();
                            return localEntityId;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = b;
                        if (cursor != null) {
                            cursor.close();
                        }
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                }
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* renamed from: b */
    public final azdf mo54657b(String str) {
        SQLiteDatabase sQLiteDatabase;
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        this.f98996b.beginTransaction();
        Cursor cursor = null;
        azdf azdf = null;
        try {
            Cursor query = this.f98996b.query("preloadedFiles", azde.f99063a, "web_download_url = ?", new String[]{str}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        azdf = azdf.m85394a(query);
                        query.close();
                        sQLiteDatabase = this.f98996b;
                        sQLiteDatabase.setTransactionSuccessful();
                        this.f98996b.endTransaction();
                        return azdf;
                    }
                } catch (Throwable th) {
                    cursor = query;
                    th = th;
                    if (cursor != null) {
                    }
                    this.f98996b.setTransactionSuccessful();
                    this.f98996b.endTransaction();
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            sQLiteDatabase = this.f98996b;
            sQLiteDatabase.setTransactionSuccessful();
            this.f98996b.endTransaction();
            return azdf;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            this.f98996b.setTransactionSuccessful();
            this.f98996b.endTransaction();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    @Deprecated
    /* renamed from: a */
    public static void m85303a(SQLiteDatabase sQLiteDatabase, Context context) {
        Cursor cursor;
        sQLiteDatabase.beginTransaction();
        try {
            cursor = sQLiteDatabase.query("conversations", new String[]{"conversation_id"}, null, null, null, null, null);
            while (cursor != null) {
                try {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    azan.m85141a(context).mo54541b(cursor.getString(0));
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            if (cursor != null) {
                cursor.close();
            }
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: b */
    public final boolean mo54658b() {
        boolean z = false;
        if (mo54651a() && !this.f98996b.isReadOnly()) {
            z = true;
        }
        if (!z) {
            azph.m85998a(this.f98995a).mo55126a(1609, 47);
        }
        return z;
    }

    /* renamed from: b */
    public final byte[] mo54659b(long j) {
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        Cursor query = this.f98996b.query("messages", new String[]{"exported_data"}, "_id= ?", new String[]{Long.toString(j)}, null, null, null);
        byte[] bArr = null;
        if (query != null && query.moveToFirst()) {
            bArr = query.getBlob(0);
        }
        if (query != null) {
            query.close();
        }
        return bArr;
    }

    /* renamed from: a */
    public static void m85304a(SQLiteDatabase sQLiteDatabase, String str, String str2, int i) {
        bmxy.m108588a(sQLiteDatabase.inTransaction());
        ContentValues contentValues = new ContentValues();
        contentValues.put("conv_id", str);
        contentValues.put("participant_id", str2);
        contentValues.put("participant_type", Integer.valueOf(i));
        long insert = sQLiteDatabase.insert("conversationParticipants", null, contentValues);
        Object[] objArr = {str2, str};
        int i2 = (insert > -1 ? 1 : (insert == -1 ? 0 : -1));
    }

    /* renamed from: a */
    public static void m85305a(List list, Cursor cursor) {
        do {
            list.add(new LocalEntityId(cursor.getString(cursor.getColumnIndex("id")), cursor.getInt(cursor.getColumnIndex("type")), cursor.getString(cursor.getColumnIndex("app_id"))));
        } while (cursor.moveToNext());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* renamed from: a */
    public static boolean m85306a(SQLiteDatabase sQLiteDatabase, String str) {
        Throwable th;
        Cursor cursor;
        bmxy.m108600b(sQLiteDatabase.inTransaction());
        boolean z = true;
        try {
            cursor = sQLiteDatabase.query("conversations", new String[]{"conversation_id"}, "conversation_id = ? ", new String[]{str}, null, null, null);
            if (cursor == null) {
                return false;
            }
            try {
                if (cursor.getCount() <= 0) {
                    z = false;
                }
                cursor.close();
                return z;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final Cursor mo54638a(long j) {
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        return this.f98996b.rawQuery(f98993f, new String[]{Long.toString(j)});
    }

    @Deprecated
    /* renamed from: a */
    public final Cursor mo54639a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String str3;
        azox.m85982b();
        sQLiteDatabase.beginTransaction();
        try {
            boolean H = azdl.m85412a(this.f98995a).mo54734H();
            String[] strArr = azdc.f99044a;
            if (H) {
                StringBuilder sb = new StringBuilder(40);
                sb.append(" AND timestamp_ms > ");
                sb.append(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(7));
                str3 = sb.toString();
            } else {
                str3 = "";
            }
            String valueOf = String.valueOf(str3);
            Cursor query = sQLiteDatabase.query("message_list_view", strArr, valueOf.length() == 0 ? new String("conversation_id = ? AND (status BETWEEN 1 AND 19 OR status BETWEEN 30 AND 39 OR status BETWEEN 20 AND 29)") : "conversation_id = ? AND (status BETWEEN 1 AND 19 OR status BETWEEN 30 AND 39 OR status BETWEEN 20 AND 29)".concat(valueOf), new String[]{str}, null, null, "server_timestamp_ms DESC", str2);
            sQLiteDatabase.setTransactionSuccessful();
            return query;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Cursor mo54640a(byte[] bArr) {
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        Cursor cursor = null;
        if (bArr == null) {
            return null;
        }
        this.f98996b.beginTransaction();
        try {
            Cursor query = this.f98996b.query("registration", azcu.f99013a, "server_registration_id = ? ", new String[]{azpi.m86066a(bArr)}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        this.f98996b.setTransactionSuccessful();
                        this.f98996b.endTransaction();
                        return query;
                    }
                } catch (SQLiteException e) {
                    cursor = query;
                    try {
                        azoj.m85933c("DatabaseOperations", "Failed to get registration info", new Object[0]);
                        this.f98996b.endTransaction();
                        return cursor;
                    } catch (Throwable th) {
                        this.f98996b.endTransaction();
                        throw th;
                    }
                }
            }
            this.f98996b.endTransaction();
            return null;
        } catch (SQLiteException e2) {
            azoj.m85933c("DatabaseOperations", "Failed to get registration info", new Object[0]);
            this.f98996b.endTransaction();
            return cursor;
        }
    }

    /* renamed from: a */
    public final azbz mo54641a(azdd azdd, azph azph) {
        azdd azdd2 = azdd;
        if (mo54658b()) {
            return mo54642a(azdd2.f99046b, azdd2.f99057m, azdd.mo54714c(), azdd2.f99056l, azdd.mo54712a(), azdd.mo54713b(), azdd2.f99052h, azdd2.f99053i, azdd2.f99054j, azdd2.f99059o, azdd2.f99060p, azdd2.f99061q, azph);
        }
        azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final azbz mo54642a(String str, long j, String str2, int i, byte[] bArr, String str3, String str4, long j2, long j3, byte[] bArr2, int i2, byte[] bArr3, azph azph) {
        azbz a;
        SQLiteDatabase sQLiteDatabase;
        long j4;
        String str5 = str;
        String str6 = str2;
        int i3 = i;
        String str7 = str4;
        azph azph2 = azph;
        azby azby = new azby();
        azby.f98932a = str6;
        azby.f98933b = false;
        azby.f98935d = false;
        azby.f98934c = false;
        aznz a2 = aznz.m85891a(str2);
        if (a2 != null) {
            this.f98996b.beginTransaction();
            try {
                if (!m85306a(this.f98996b, str6)) {
                    azby.f98935d = true;
                    if (azph2 != null) {
                        azph2.mo55137a(91, a2);
                    }
                }
                if (mo54670g(str6)) {
                    new Object[1][0] = str6;
                    if (azph2 != null) {
                        azph2.mo55151a(38, str5, str7, a2);
                    }
                    azby.f98934c = true;
                    a = azby.mo54587a();
                    sQLiteDatabase = this.f98996b;
                } else if (!mo54662c(str)) {
                    SQLiteDatabase sQLiteDatabase2 = this.f98996b;
                    if (j2 <= 0) {
                        j4 = System.currentTimeMillis();
                    } else {
                        j4 = j2;
                    }
                    bmxy.m108600b(sQLiteDatabase2.inTransaction());
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("message_id", str5);
                    contentValues.put("conversation_id", str6);
                    contentValues.put("sender_profile_id", Long.valueOf(j));
                    contentValues.put("timestamp_ms", Long.valueOf(j4));
                    contentValues.put("server_timestamp_ms", Long.valueOf(j3));
                    contentValues.put("content", bArr);
                    contentValues.put("content_type", str3);
                    contentValues.put("message_type", str7);
                    contentValues.put("status", Integer.valueOf(i));
                    contentValues.put("exported_data", bArr2);
                    contentValues.put("error_code", Integer.valueOf(i2));
                    contentValues.put("message_properties", bArr3);
                    if (sQLiteDatabase2.insert("messages", null, contentValues) == -1) {
                        azoj.m85932b("DatabaseOperations", "Failed to add message", new Object[0]);
                        if (azph2 != null) {
                            azph2.mo55141a(128, a2.f99780g);
                        }
                        azby.f98932a = null;
                        a = azby.mo54587a();
                        sQLiteDatabase = this.f98996b;
                    } else {
                        new Object[1][0] = str5;
                        if (azph2 != null) {
                            if (i3 == 1) {
                                azph2.mo55151a(34, str5, str7, a2);
                            } else if (i3 == 30) {
                                azph2.mo55151a(25, str5, str7, a2);
                            }
                        }
                        this.f98996b.setTransactionSuccessful();
                        this.f98996b.endTransaction();
                        azby.f98933b = true;
                        return azby.mo54587a();
                    }
                } else {
                    if (azph2 != null && i3 == 1) {
                        azph2.mo55151a(41, str5, str7, a2);
                    }
                    a = azby.mo54587a();
                    sQLiteDatabase = this.f98996b;
                }
                sQLiteDatabase.endTransaction();
                return a;
            } catch (Throwable th) {
                this.f98996b.endTransaction();
                throw th;
            }
        } else {
            if (azph2 != null) {
                azph2.mo55125a(129);
            }
            return azby.mo54587a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* renamed from: a */
    public final azdd mo54643a(String str, String str2) {
        Throwable th;
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        this.f98996b.beginTransaction();
        Cursor cursor = null;
        r0 = null;
        azdd azdd = null;
        try {
            Cursor query = this.f98996b.query("message_list_view", azdc.f99044a, "message_id = ? AND conversation_id = ?", new String[]{str, str2}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        azdd = azdd.m85387a(query);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                    }
                    this.f98996b.endTransaction();
                    throw th;
                }
            }
            this.f98996b.setTransactionSuccessful();
            if (query != null) {
                query.close();
            }
            this.f98996b.endTransaction();
            return azdd;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            this.f98996b.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public final LocalEntityId mo54644a(aznz aznz) {
        return m85302a(this.f98996b, aznz);
    }

    /* renamed from: a */
    public final List mo54645a(String str) {
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f98996b.query("conversations", new String[]{"conversation_id"}, "conversation_id GLOB ?", new String[]{String.valueOf(str).concat(":*")}, null, null, null, null);
        if (query != null) {
            if (query.moveToFirst()) {
                do {
                    arrayList.add(query.getString(0));
                } while (query.moveToNext());
            }
            query.close();
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* renamed from: a */
    public final List mo54646a(String str, int i) {
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        ArrayList arrayList = new ArrayList();
        if (!mo54651a()) {
            this.f98996b = azcl.m85289a(this.f98995a).getReadableDatabase();
        }
        this.f98996b.beginTransaction();
        Cursor cursor = null;
        try {
            if (mo54670g(str)) {
                sQLiteDatabase = this.f98996b;
            } else {
                Cursor b = mo54655b(str, i);
                try {
                    if (b.moveToFirst()) {
                        do {
                            arrayList.add(b.getString(0));
                        } while (b.moveToNext());
                        if (b != null) {
                            b.close();
                        }
                        this.f98996b.setTransactionSuccessful();
                        this.f98996b.endTransaction();
                        return arrayList;
                    }
                    if (b != null) {
                        b.close();
                    }
                    sQLiteDatabase = this.f98996b;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = b;
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.f98996b.setTransactionSuccessful();
                    this.f98996b.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            this.f98996b.endTransaction();
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            this.f98996b.setTransactionSuccessful();
            this.f98996b.endTransaction();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo54647a(aznz aznz, List list, int i, int i2, azph azph) {
        int a;
        List list2 = list;
        azph azph2 = azph;
        if (list2 != null && list.size() > 0) {
            if (!mo54658b()) {
                azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
                return;
            }
            this.f98996b.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("status", Integer.valueOf(i2));
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    boolean z = true;
                    if (i3 >= list.size()) {
                        break;
                    }
                    int min = Math.min(i3 + 997, list.size());
                    List subList = list2.subList(i3, min);
                    String[] strArr = (String[]) subList.toArray(new String[(subList.size() + 1)]);
                    strArr[subList.size()] = Integer.toString(i);
                    SQLiteDatabase sQLiteDatabase = this.f98996b;
                    int size = subList.size();
                    if (size <= 0) {
                        z = false;
                    }
                    bmxy.m108591a(z, "Invalid size for list placeholder: %s", size);
                    String join = TextUtils.join(",", Collections.nCopies(size, "?"));
                    StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 32);
                    sb.append("message_id IN (");
                    sb.append(join);
                    sb.append(") AND ");
                    sb.append("status");
                    sb.append(" == ?");
                    i4 += sQLiteDatabase.update("messages", contentValues, sb.toString(), strArr);
                    i3 = min;
                }
                Object[] objArr = {Integer.valueOf(i4), Integer.valueOf(i2)};
                if (!(azph2 == null || (a = m85299a(i2)) == 2)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        azph2.mo55131a(a, 3, (String) it.next(), aznz);
                    }
                }
                this.f98996b.setTransactionSuccessful();
                this.f98996b.endTransaction();
                list.size();
            } catch (Throwable th) {
                this.f98996b.endTransaction();
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54648a(LocalEntityId localEntityId, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase = this.f98996b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", localEntityId.f111074a);
        contentValues.put("type", Integer.valueOf(localEntityId.f111075b));
        contentValues.put("app_id", localEntityId.f111076c);
        contentValues.put("registration_id", azpi.m86066a(bArr));
        int i = (sQLiteDatabase.insert("user", null, contentValues) > 0 ? 1 : (sQLiteDatabase.insert("user", null, contentValues) == 0 ? 0 : -1));
    }

    /* renamed from: a */
    public final void mo54649a(String str, LocalEntityId localEntityId) {
        SQLiteDatabase sQLiteDatabase;
        if (mo54658b()) {
            this.f98996b.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("default_user_id", localEntityId.f111074a);
                contentValues.put("default_user_type", Integer.valueOf(localEntityId.f111075b));
                contentValues.put("default_user_app_id", localEntityId.f111076c);
                this.f98996b.update("appData", contentValues, "sid = ?", new String[]{str});
                this.f98996b.setTransactionSuccessful();
                sQLiteDatabase = this.f98996b;
            } catch (SQLiteConstraintException e) {
                Object[] objArr = {str, localEntityId};
                sQLiteDatabase = this.f98996b;
            } catch (Throwable th) {
                this.f98996b.endTransaction();
                throw th;
            }
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: a */
    public final void mo54650a(byte[] bArr, List list) {
        List list2 = list;
        if (mo54658b()) {
            ArrayList arrayList = new ArrayList();
            Cursor query = this.f98996b.query("user", new String[]{"id", "type", "app_id"}, "registration_id = ?", new String[]{azpi.m86066a(bArr)}, null, null, null);
            if (query != null && query.moveToFirst()) {
                m85305a(arrayList, query);
                query.close();
            }
            if (arrayList.isEmpty()) {
                azoj.m85933c("DatabaseOperations", "Attempting to update users for invalid registration ID -- no existing users", new Object[0]);
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                LocalEntityId localEntityId = (LocalEntityId) arrayList.get(i);
                if (!list2.contains(localEntityId)) {
                    this.f98996b.delete("user", "id = ? AND type = ? AND app_id = ?", new String[]{localEntityId.f111074a, Integer.toString(localEntityId.f111075b), localEntityId.f111076c});
                }
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                LocalEntityId localEntityId2 = (LocalEntityId) list2.get(i2);
                if (!arrayList.contains(localEntityId2)) {
                    mo54648a(localEntityId2, bArr);
                }
            }
            return;
        }
        azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
    }

    /* renamed from: a */
    public final boolean mo54651a() {
        SQLiteDatabase sQLiteDatabase = this.f98996b;
        boolean z = false;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            z = true;
        }
        if (!z) {
            azph.m85998a(this.f98995a).mo55126a(1608, 47);
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo54652a(String str, String str2, byte[] bArr) {
        boolean z = false;
        if (!mo54658b()) {
            azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            return false;
        }
        this.f98996b.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("conversation_id", str);
            contentValues.put("message_id", str2);
            contentValues.put("reply", bArr);
            if (this.f98996b.insert("smartReply", null, contentValues) != -1) {
                z = true;
            }
            return z;
        } finally {
            this.f98996b.setTransactionSuccessful();
            this.f98996b.endTransaction();
        }
    }

    /* renamed from: a */
    public final boolean mo54653a(byte[] bArr, ContentValues contentValues) {
        if (mo54658b()) {
            if (this.f98996b.update("registration", contentValues, "server_registration_id = ?", new String[]{azpi.m86066a(bArr)}) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* renamed from: a */
    public final byte[] mo54654a(LocalEntityId localEntityId) {
        Throwable th;
        Cursor cursor = null;
        if (localEntityId == null) {
            return null;
        }
        this.f98996b.beginTransaction();
        try {
            Cursor query = this.f98996b.query("user", new String[]{"registration_id"}, "id = ? AND type = ?", new String[]{localEntityId.f111074a, Integer.toString(localEntityId.f111075b)}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        byte[] a = azpi.m86073a(query.getString(query.getColumnIndex("registration_id")));
                        query.close();
                        this.f98996b.setTransactionSuccessful();
                        this.f98996b.endTransaction();
                        return a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                    }
                    this.f98996b.setTransactionSuccessful();
                    this.f98996b.endTransaction();
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            this.f98996b.setTransactionSuccessful();
            this.f98996b.endTransaction();
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            this.f98996b.setTransactionSuccessful();
            this.f98996b.endTransaction();
            throw th;
        }
    }
}
