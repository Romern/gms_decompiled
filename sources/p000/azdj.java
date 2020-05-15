package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: azdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azdj {

    /* renamed from: c */
    private static WeakReference f99084c = new WeakReference(null);

    /* renamed from: a */
    public final azcl f99085a;

    /* renamed from: b */
    private final Context f99086b;

    public azdj(Context context, azcl azcl) {
        this.f99086b = context;
        this.f99085a = azcl;
    }

    /* renamed from: a */
    public static Cursor m85397a(SQLiteDatabase sQLiteDatabase, LocalEntityId localEntityId, String[] strArr) {
        return sQLiteDatabase.query("profile", strArr, "entity_id = ? AND entity_type = ? AND app_id = ?", m85401a(localEntityId), null, null, null);
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
    /* renamed from: d */
    private static ContentValues m85402d(LocalEntityId localEntityId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("entity_id", localEntityId.f111074a);
        contentValues.put("entity_type", Integer.valueOf(localEntityId.f111075b));
        contentValues.put("app_id", localEntityId.f111076c);
        contentValues.put("status", (Integer) 1);
        return contentValues;
    }

    /* renamed from: b */
    public final azdi mo54722b(LocalEntityId localEntityId) {
        SQLiteDatabase readableDatabase = this.f99085a.getReadableDatabase();
        readableDatabase.beginTransaction();
        try {
            return m85398a(readableDatabase, localEntityId);
        } finally {
            readableDatabase.setTransactionSuccessful();
            readableDatabase.endTransaction();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* renamed from: c */
    public final List mo54724c(LocalEntityId localEntityId) {
        Cursor cursor;
        Throwable th;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = this.f99085a.getReadableDatabase();
        readableDatabase.beginTransaction();
        try {
            cursor = readableDatabase.query("conversations", new String[]{"conversation_id"}, "conversation_id like \"%\" || ? || \":\" || ? || \"%\"", new String[]{Integer.toString(localEntityId.f111075b), localEntityId.f111074a}, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        do {
                            arrayList.add(cursor.getString(0));
                        } while (cursor.moveToNext());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    readableDatabase.endTransaction();
                    throw th;
                }
            }
            readableDatabase.setTransactionSuccessful();
            if (cursor != null) {
                cursor.close();
            }
            readableDatabase.endTransaction();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            readableDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002b  */
    /* renamed from: a */
    public static azdi m85398a(SQLiteDatabase sQLiteDatabase, LocalEntityId localEntityId) {
        Throwable th;
        bmxy.m108588a(sQLiteDatabase.inTransaction());
        Cursor cursor = null;
        try {
            Cursor a = m85397a(sQLiteDatabase, localEntityId, azdh.f99074a);
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        azdi a2 = azdi.m85395a(a);
                        a.close();
                        return a2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = a;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final List mo54723b(long j) {
        ArrayList arrayList = new ArrayList();
        if (j == -1) {
            return arrayList;
        }
        SQLiteDatabase readableDatabase = this.f99085a.getReadableDatabase();
        readableDatabase.beginTransaction();
        try {
            Cursor query = readableDatabase.query("messages", new String[]{"conversation_id"}, "sender_profile_id = ?", new String[]{Long.toString(j)}, "conversation_id", null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(query.getString(0));
                    } while (query.moveToNext());
                }
                query.close();
            }
            return arrayList;
        } finally {
            readableDatabase.setTransactionSuccessful();
            readableDatabase.endTransaction();
        }
    }

    /* renamed from: a */
    public static synchronized azdj m85399a(Context context) {
        azdj azdj;
        synchronized (azdj.class) {
            azdj = (azdj) f99084c.get();
            if (azdj == null) {
                Context applicationContext = context.getApplicationContext();
                azdj = new azdj(applicationContext, azcl.m85289a(applicationContext));
                f99084c = new WeakReference(azdj);
            }
        }
        return azdj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static void m85400a(Context context, long j, LocalEntityId localEntityId, LocalEntityId localEntityId2) {
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.GET_ENTITY_PROFILE");
        intent.setClassName(context, "com.google.android.gms.matchstick.net.MessagingService");
        intent.putExtra("update_profile_id", j);
        intent.putExtra("entity_id", localEntityId.f111074a);
        intent.putExtra("entity_type", localEntityId.f111075b);
        intent.putExtra("server_app_id", localEntityId.f111076c);
        intent.putExtra("update_profile_notifyconversation", true);
        azoi.m85926a(intent, localEntityId2);
        MessagingService.m94557b(intent, context);
    }

    /* renamed from: a */
    public static String[] m85401a(LocalEntityId localEntityId) {
        return new String[]{localEntityId.f111074a, Integer.toString(localEntityId.f111075b), localEntityId.f111076c};
    }

    /* renamed from: a */
    public final long mo54716a(LocalEntityId localEntityId, LocalEntityId localEntityId2) {
        return mo54717a(localEntityId, localEntityId2, (byte[]) null);
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
    /* renamed from: a */
    public final long mo54717a(LocalEntityId localEntityId, LocalEntityId localEntityId2, byte[] bArr) {
        long j;
        boolean z;
        long j2;
        boolean z2;
        ContentValues contentValues;
        boolean z3;
        LocalEntityId localEntityId3 = localEntityId;
        LocalEntityId localEntityId4 = localEntityId2;
        byte[] bArr2 = bArr;
        try {
            SQLiteDatabase writableDatabase = this.f99085a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                azdi a = m85398a(writableDatabase, localEntityId3);
                if (a == null) {
                    bmxy.m108588a(writableDatabase.inTransaction());
                    int i = localEntityId3.f111075b;
                    if (i == 1) {
                        contentValues = m85402d(localEntityId);
                        contentValues.put("display_id", azot.m85964a(localEntityId3.f111074a, (TelephonyManager) this.f99086b.getSystemService("phone")));
                    } else {
                        if (i != 2) {
                            if (i != 6) {
                                if (i == 3) {
                                    ContentValues d = m85402d(localEntityId);
                                    d.put("display_id", localEntityId3.f111074a);
                                    d.put("profile_name", !TextUtils.equals(localEntityId3.f111074a, cfeo.m138895z()) ? "" : cfeo.m138844A());
                                    if (bArr2 != null) {
                                        d.put("data", bArr2);
                                    }
                                    contentValues = d;
                                } else if (i == 4) {
                                    contentValues = m85402d(localEntityId);
                                    contentValues.put("display_id", localEntityId3.f111074a);
                                } else if (i == 7) {
                                    contentValues = m85402d(localEntityId);
                                    contentValues.put("display_id", localEntityId3.f111074a);
                                } else {
                                    j2 = -1;
                                    z2 = true;
                                }
                            }
                        }
                        contentValues = m85402d(localEntityId);
                    }
                    if (contentValues.size() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bmxy.m108588a(z3);
                    new Object[1][0] = Arrays.asList(contentValues).toString();
                    j2 = writableDatabase.insert("profile", null, contentValues);
                    z2 = true;
                } else {
                    j = a.f99075a;
                    try {
                        if (a.mo54715a() != 2 || System.currentTimeMillis() <= TimeUnit.MICROSECONDS.toMillis(a.f99081g) + cfeo.m138856M()) {
                            if (a.mo54715a() != 0) {
                                j2 = j;
                                z2 = false;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        Object[] objArr = {Long.valueOf(j), Boolean.valueOf(z)};
                        m85400a(this.f99086b, j, localEntityId3, localEntityId4);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        throw th;
                    }
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("status", (Integer) 1);
                        writableDatabase.update("profile", contentValues2, "_id = ?", new String[]{Long.toString(a.f99075a)});
                        new Object[1][0] = Arrays.asList(contentValues2).toString();
                        j2 = j;
                        z2 = true;
                    } catch (Throwable th2) {
                        th = th2;
                        z = true;
                        Object[] objArr2 = {Long.valueOf(j), Boolean.valueOf(z)};
                        m85400a(this.f99086b, j, localEntityId3, localEntityId4);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Object[] objArr3 = {Long.valueOf(j2), Boolean.valueOf(z2)};
                if (z2 && j2 != -1) {
                    m85400a(this.f99086b, j2, localEntityId3, localEntityId4);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return j2;
            } catch (Throwable th3) {
                th = th3;
                z = false;
                j = -1;
                Object[] objArr22 = {Long.valueOf(j), Boolean.valueOf(z)};
                if (z && j != -1) {
                    m85400a(this.f99086b, j, localEntityId3, localEntityId4);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLiteException e) {
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo54718a(long j, ContentValues contentValues) {
        if (contentValues.size() > 0 && j != -1) {
            try {
                SQLiteDatabase writableDatabase = this.f99085a.getWritableDatabase();
                writableDatabase.beginTransaction();
                writableDatabase.update("profile", contentValues, "_id = ?", new String[]{Long.toString(j)});
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54719a(LocalEntityId localEntityId, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("blocked", Integer.valueOf(i));
        mo54720a(localEntityId, contentValues);
    }

    /* renamed from: a */
    public final void mo54720a(LocalEntityId localEntityId, ContentValues contentValues) {
        if (contentValues.size() > 0) {
            try {
                SQLiteDatabase writableDatabase = this.f99085a.getWritableDatabase();
                writableDatabase.beginTransaction();
                writableDatabase.update("profile", contentValues, "entity_id = ? AND entity_type = ? AND app_id = ?", m85401a(localEntityId));
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteException e) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r13 == null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* renamed from: a */
    public final boolean mo54721a(long j) {
        Throwable th;
        Cursor cursor;
        boolean z = false;
        try {
            SQLiteDatabase writableDatabase = this.f99085a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                cursor = writableDatabase.query("profile", new String[]{"status", "last_sync_timestamp"}, "_id = ?", new String[]{Long.toString(j)}, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            int i = cursor.getInt(0);
                            long j2 = cursor.getLong(1);
                            if (i == 2) {
                                z = true;
                            } else if (i == 1 && j2 + cfeo.f183719a.mo6606a().mo81045bz() > TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis())) {
                                z = true;
                            }
                            cursor.close();
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            return z;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                if (cursor != null) {
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLiteException e) {
            return false;
        }
    }
}
