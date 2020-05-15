package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: azcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azcd {

    /* renamed from: h */
    private static WeakReference f98960h = new WeakReference(null);

    /* renamed from: a */
    public final azcl f98961a;

    /* renamed from: b */
    public final Object f98962b = new Object();

    /* renamed from: c */
    public final ConcurrentHashMap f98963c = new ConcurrentHashMap();

    /* renamed from: d */
    public final azck f98964d = new azck(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);

    /* renamed from: e */
    private final Context f98965e;

    /* renamed from: f */
    private final azph f98966f;

    /* renamed from: g */
    private int f98967g = 0;

    public azcd(Context context, azcl azcl, azph azph) {
        this.f98965e = context;
        this.f98961a = azcl;
        this.f98966f = azph;
        mo54602a();
    }

    /* renamed from: a */
    public static Cursor m85250a(ContentResolver contentResolver, String str, String[] strArr) {
        return contentResolver.query(DatabaseProvider.m94544h("appData"), strArr, "sid = ?", new String[]{str}, null, null);
    }

    /* renamed from: b */
    public final int mo54607b() {
        int i;
        synchronized (this.f98962b) {
            i = this.f98967g;
        }
        return i;
    }

    /* renamed from: c */
    public final void mo54611c(String str) {
        MessagingService.m94560d(new Intent("com.google.android.apps.libraries.matchstick.action.GET_APP_DATA").putExtra("server_app_id", str), this.f98965e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* renamed from: d */
    public final String mo54612d(String str) {
        Cursor cursor = null;
        try {
            Cursor query = this.f98961a.getReadableDatabase().query("appData", new String[]{"last_conversation_install_clicked"}, "pid = ?", new String[]{str}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        String string = query.getString(0);
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    cursor = query;
                    th = th;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* renamed from: e */
    public final Bitmap mo54613e(String str) {
        int i = Build.VERSION.SDK_INT;
        Bitmap a = this.f98964d.mo54631a(str);
        if (a == null) {
            Cursor cursor = null;
            try {
                Cursor a2 = mo54598a(str, new String[]{"nicon"});
                if (a2 != null) {
                    try {
                        if (a2.moveToNext()) {
                            byte[] blob = a2.getBlob(0);
                            if (blob != null) {
                                int length = blob.length;
                                if (length > 0) {
                                    a = BitmapFactory.decodeByteArray(blob, 0, length);
                                }
                            }
                            a2.close();
                            if (a == null) {
                                return null;
                            }
                            new Object[1][0] = Integer.valueOf(a.getByteCount());
                            this.f98964d.mo54632a(str, a);
                            return a;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = a2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (a2 != null) {
                    a2.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                }
                throw th;
            }
        } else {
            new Object[1][0] = Integer.valueOf(a.getByteCount());
            return a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r0 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r0 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        return mo54607b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* renamed from: f */
    public final int mo54614f(String str) {
        Cursor cursor = null;
        try {
            cursor = mo54598a(str, new String[]{"nicon_color"});
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        int b = TextUtils.isEmpty(string) ? mo54607b() : Color.parseColor(string);
                        cursor.close();
                        return b;
                    }
                } catch (IllegalArgumentException e) {
                    e = e;
                    try {
                        azoj.m85931a("AppDataMngr", e, "Failed to parse ncolor for %s", str);
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            azoj.m85931a("AppDataMngr", e, "Failed to parse ncolor for %s", str);
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (r8 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008e, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        if (r8 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a0, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a5  */
    /* renamed from: g */
    public final String mo54615g(String str) {
        Cursor cursor;
        Exception e;
        Cursor cursor2;
        Cursor cursor3 = null;
        Cursor cursor4 = null;
        String str2 = null;
        if (cfde.m138718b()) {
            try {
                cursor2 = mo54598a(str, new String[]{"name"});
                if (cursor2 != null) {
                    try {
                        if (cursor2.moveToFirst()) {
                            String a = azov.m85980a(mo54600a(str, 28), bnhe.m109408a("productName", cursor2.getString(cursor2.getColumnIndexOrThrow("name"))));
                            cursor2.close();
                            return a;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            azoj.m85931a("AppDataMngr", e, "Failed to get notification source", new Object[0]);
                        } catch (Throwable th) {
                            th = th;
                            cursor4 = cursor2;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor4 = cursor2;
                        if (cursor4 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                cursor2 = null;
                azoj.m85931a("AppDataMngr", e, "Failed to get notification source", new Object[0]);
            } catch (Throwable th3) {
                th = th3;
                if (cursor4 != null) {
                }
                throw th;
            }
        } else {
            try {
                cursor = mo54598a(str, new String[]{"app_ui_config"});
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            cbht cbht = (cbht) azol.m85935a((bxxk) cbht.f177177g.mo74142c(7), cursor.getBlob(0));
                            if (cbht != null) {
                                str2 = cbht.f177183e;
                            }
                            cursor.close();
                            return str2;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        try {
                            azoj.m85931a("AppDataMngr", e, "Failed to get notification source", new Object[0]);
                        } catch (Throwable th4) {
                            th = th4;
                            cursor3 = cursor;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                    }
                }
            } catch (Exception e5) {
                e = e5;
                cursor = null;
                azoj.m85931a("AppDataMngr", e, "Failed to get notification source", new Object[0]);
            } catch (Throwable th5) {
                th = th5;
                if (cursor3 != null) {
                }
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final cbhz[] mo54616h(String str) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor a = mo54598a(str, new String[]{"app_ui_config"});
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        cbht cbht = (cbht) azol.m85935a((bxxk) cbht.f177177g.mo74142c(7), a.getBlob(0));
                        if (cbht != null) {
                            cbhz[] cbhzArr = (cbhz[]) cbht.f177182d.toArray(new cbhz[0]);
                            a.close();
                            return cbhzArr;
                        }
                        azph.m85998a(this.f98965e).mo55126a(1425, 6);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = a;
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

    /* renamed from: i */
    public final String mo54617i(String str) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor a = mo54598a(str, new String[]{"app_ui_config"});
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        cbht cbht = (cbht) azol.m85935a((bxxk) cbht.f177177g.mo74142c(7), a.getBlob(0));
                        if (cbht != null) {
                            String str2 = cbht.f177184f;
                            a.close();
                            return str2;
                        }
                        azph.m85998a(this.f98965e).mo55126a(1455, 6);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = a;
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

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* renamed from: j */
    public final Map mo54618j(String str) {
        Cursor cursor;
        Throwable th;
        azcm a = azcm.m85300a(this.f98965e);
        if (!a.mo54651a()) {
            a.f98996b = azcl.m85289a(a.f98995a).getReadableDatabase();
        }
        HashMap hashMap = new HashMap();
        a.f98996b.beginTransaction();
        try {
            cursor = a.f98996b.query("appData", new String[]{"image_app_metadata_version", "non_image_app_metadata_version"}, "sid = ?", new String[]{str}, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        hashMap.put("non_images_hash_key", cursor.getString(cursor.getColumnIndexOrThrow("non_image_app_metadata_version")));
                        hashMap.put("images_hash_key", cursor.getString(cursor.getColumnIndexOrThrow("image_app_metadata_version")));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a.f98996b.endTransaction();
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            a.f98996b.setTransactionSuccessful();
            a.f98996b.endTransaction();
            if (cursor != null) {
                cursor.close();
            }
            return hashMap;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            a.f98996b.endTransaction();
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r9 != null) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* renamed from: k */
    public final boolean mo54619k(String str) {
        Cursor cursor;
        Throwable th;
        boolean z = false;
        try {
            SQLiteDatabase writableDatabase = this.f98961a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                cursor = mo54598a(str, new String[]{"status", "last_sync"});
                if (cursor != null) {
                    try {
                        if (cursor.moveToNext()) {
                            writableDatabase.setTransactionSuccessful();
                            int i = cursor.getInt(0) & 15;
                            long j = cursor.getLong(1);
                            if (i == 3) {
                                z = true;
                            } else if (i == 2 && TimeUnit.MICROSECONDS.toMillis(j) + TimeUnit.DAYS.toMillis(cfeo.f183719a.mo6606a().mo81018bY()) >= System.currentTimeMillis()) {
                                z = true;
                            }
                            cursor.close();
                            writableDatabase.endTransaction();
                            return z;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                if (cursor != null) {
                }
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLiteException e) {
            return false;
        }
    }

    /* renamed from: l */
    public final Cursor mo54620l(String str) {
        return this.f98961a.getReadableDatabase().query("appString", new String[]{"string_id", "string_value"}, "app_id = ?", new String[]{str}, null, null, null);
    }

    /* renamed from: a */
    public static Cursor m85251a(ContentResolver contentResolver, String[] strArr) {
        return contentResolver.query(DatabaseProvider.m94544h("appData"), strArr, null, null, null, null);
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
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f0  */
    /* renamed from: b */
    public final long mo54608b(String str) {
        int i;
        String str2 = str;
        azox.m85982b();
        try {
            SQLiteDatabase writableDatabase = this.f98961a.getWritableDatabase();
            boolean cg = cfeo.f183719a.mo6606a().mo81055cg();
            writableDatabase.beginTransaction();
            Cursor cursor = null;
            try {
                Cursor query = writableDatabase.query("appData", new String[]{"_id", "status", "last_sync"}, "sid = ?", new String[]{str2}, null, null, null);
                try {
                    if (!query.moveToFirst()) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("sid", str2);
                            if (!cg) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            contentValues.put("status", Integer.valueOf(i | PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                            this.f98966f.mo55147a((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, str2);
                            long insert = writableDatabase.insert("appData", null, contentValues);
                            if (query != null) {
                                query.close();
                            }
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            if (cg) {
                                mo54611c(str);
                            }
                            return insert;
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            if (cg) {
                                mo54611c(str);
                            }
                            throw th;
                        }
                    } else {
                        int i2 = query.getInt(1) & 15;
                        long j = query.getLong(2);
                        if (i2 != 1) {
                            if (i2 != 3 || TimeUnit.MICROSECONDS.toMillis(j) + cfdb.f183646a.mo6606a().mo80852a() >= System.currentTimeMillis()) {
                                cg = false;
                            }
                        }
                        if (cg) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("status", (Integer) 2);
                            m85253a(writableDatabase, str2, contentValues2);
                        }
                        long j2 = query.getLong(0);
                        if (query != null) {
                            query.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (cg) {
                            mo54611c(str);
                        }
                        return j2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    cg = false;
                    if (cursor != null) {
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    if (cg) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cg = false;
                if (cursor != null) {
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (cg) {
                }
                throw th;
            }
        } catch (SQLiteException e) {
            return 0;
        }
    }

    /* renamed from: a */
    public static synchronized azcd m85252a(Context context) {
        azcd azcd;
        synchronized (azcd.class) {
            azcd = (azcd) f98960h.get();
            if (azcd == null) {
                Context applicationContext = context.getApplicationContext();
                azcd = new azcd(applicationContext, azcl.m85289a(applicationContext), azph.m85998a(applicationContext));
                f98960h = new WeakReference(azcd);
            }
        }
        return azcd;
    }

    /* renamed from: a */
    private final boolean m85253a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        bmxy.m108600b(sQLiteDatabase.inTransaction());
        return m85254a(sQLiteDatabase, str, contentValues, false);
    }

    /* renamed from: a */
    private final boolean m85254a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues, boolean z) {
        bmxy.m108600b(sQLiteDatabase.inTransaction());
        int update = sQLiteDatabase.update("appData", contentValues, "sid = ?", new String[]{str});
        if (update != 0) {
            if (update == 1) {
                return true;
            }
        } else if (z) {
            this.f98966f.mo55147a((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, str);
            contentValues.put("sid", str);
            return sQLiteDatabase.insert("appData", null, contentValues) >= 0;
        }
        return false;
    }

    /* renamed from: a */
    public final Cursor mo54598a(String str, String[] strArr) {
        try {
            return this.f98961a.getReadableDatabase().query("appData", strArr, "sid = ?", new String[]{str}, null, null, null);
        } catch (SQLException e) {
            azoj.m85931a("AppDataMngr", e, "Failed to get app data: %s", str);
            return null;
        }
    }

    /* renamed from: a */
    public final Cursor mo54599a(String[] strArr) {
        try {
            return this.f98961a.getReadableDatabase().query("appData", strArr, null, null, null, null, null);
        } catch (SQLException e) {
            azoj.m85931a("AppDataMngr", e, "Failed to get all app data", new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* renamed from: a */
    public final String mo54600a(String str, int i) {
        ConcurrentHashMap concurrentHashMap;
        Cursor cursor = null;
        try {
            SQLiteDatabase writableDatabase = this.f98961a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                Cursor a = mo54598a(str, new String[]{"app_string_tag_mapping"});
                if (a != null) {
                    try {
                        if (a.moveToFirst()) {
                            cbhp cbhp = (cbhp) azol.m85935a((bxxk) cbhp.f177158b.mo74142c(7), a.getBlob(0));
                            concurrentHashMap = new ConcurrentHashMap();
                            if (cbhp != null) {
                                for (cbhn cbhn : cbhp.f177160a) {
                                    int b = cbic.m127878b(cbhn.f177156a);
                                    if (b == 0) {
                                        b = 1;
                                    }
                                    concurrentHashMap.put(Integer.valueOf(cbic.m127877a(b)), Long.valueOf(cbhn.f177157b));
                                }
                                a.close();
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                                if (concurrentHashMap != null || concurrentHashMap.get(Integer.valueOf(cbic.m127877a(i))) == null) {
                                    return null;
                                }
                                return mo54601a(str, ((Long) concurrentHashMap.get(Integer.valueOf(cbic.m127877a(i)))).longValue());
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                if (a != null) {
                    a.close();
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                concurrentHashMap = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLiteException e) {
            concurrentHashMap = null;
        }
        if (concurrentHashMap != null) {
        }
        return null;
    }

    /* renamed from: b */
    public final void mo54609b(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = this.f98961a.getWritableDatabase();
            writableDatabase.beginTransaction();
            m85253a(writableDatabase, str, contentValues);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLiteException e) {
        }
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
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d A[Catch:{ all -> 0x004c, all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab A[SYNTHETIC, Splitter:B:36:0x00ab] */
    /* renamed from: b */
    public final void mo54610b(String str, boolean z) {
        Cursor cursor;
        Pair pair;
        try {
            SQLiteDatabase writableDatabase = this.f98961a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                boolean z2 = false;
                cursor = writableDatabase.query("appData", new String[]{"status", "blocked"}, "sid = ?", new String[]{str}, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            int i = cursor.getInt(0);
                            if (cursor.getInt(1) != 0) {
                                z2 = true;
                            }
                            pair = new Pair(Integer.valueOf(i), Boolean.valueOf(z2));
                            cursor.close();
                            if (((Boolean) pair.second).booleanValue() != z) {
                                ContentValues contentValues = new ContentValues();
                                if ((((Integer) pair.first).intValue() & 3840) == 256) {
                                    contentValues.put("status", (Integer) 512);
                                } else {
                                    contentValues.put("status", Integer.valueOf((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                                }
                                contentValues.put("blocked", Boolean.valueOf(z));
                                if (m85253a(writableDatabase, str, contentValues)) {
                                    writableDatabase.setTransactionSuccessful();
                                }
                            }
                            writableDatabase.endTransaction();
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                pair = new Pair(258, false);
                if (((Boolean) pair.second).booleanValue() != z) {
                }
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* renamed from: a */
    public final String mo54601a(String str, long j) {
        Throwable th;
        Cursor cursor = null;
        try {
            SQLiteDatabase writableDatabase = this.f98961a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                Cursor query = writableDatabase.query("appString", new String[]{"string_value"}, "app_id = ? AND string_id = ?", new String[]{str, Long.toString(j)}, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToNext()) {
                            String string = query.getString(0);
                            query.close();
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            return string;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLiteException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo54602a() {
        String a = cfdw.f183672a.mo6606a().mo80871a();
        String bT = cfeo.f183719a.mo6606a().mo81013bT();
        synchronized (this.f98962b) {
            if (!TextUtils.isEmpty(bT)) {
                try {
                    this.f98967g = Color.parseColor(bT);
                } catch (IllegalArgumentException e) {
                    azoj.m85931a("AppDataMngr", e, "Failed to get ncolor from flag", new Object[0]);
                }
            }
            if (!TextUtils.isEmpty(a)) {
                for (String str : bmyx.m108640a(',').mo66918a((CharSequence) a)) {
                    this.f98963c.put(str, "");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54603a(String str, List list) {
        if (list != null) {
            try {
                SQLiteDatabase writableDatabase = this.f98961a.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    writableDatabase.delete("appString", "app_id = ? ", new String[]{str});
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        cbhm cbhm = (cbhm) it.next();
                        if (cbhm != null) {
                            if (cbhm.f177152a != 0) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("app_id", str);
                                contentValues.put("string_id", Long.valueOf(cbhm.f177152a));
                                contentValues.put("string_value", cbhm.f177153b);
                                writableDatabase.insert("appString", null, contentValues);
                            }
                        }
                        azoj.m85933c("AppDataMngr", "Invalid app string", new Object[0]);
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLiteException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54604a(String str, boolean z) {
        int i;
        try {
            SQLiteDatabase writableDatabase = this.f98961a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                if (!z) {
                    i = 512;
                } else {
                    i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                contentValues.put("status", Integer.valueOf(i));
                if (m85253a(writableDatabase, str, contentValues)) {
                    writableDatabase.setTransactionSuccessful();
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLiteException e) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return true;
     */
    /* renamed from: a */
    public final boolean mo54605a(String str) {
        synchronized (this.f98962b) {
            if (!this.f98963c.containsKey("all") && !this.f98963c.containsKey("ALL")) {
                boolean containsKey = this.f98963c.containsKey(str);
                return containsKey;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo54606a(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = this.f98961a.getWritableDatabase();
            writableDatabase.beginTransaction();
            bmxy.m108600b(writableDatabase.inTransaction());
            boolean a = m85254a(writableDatabase, str, contentValues, true);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            return a;
        } catch (SQLiteException e) {
            return false;
        }
    }
}
