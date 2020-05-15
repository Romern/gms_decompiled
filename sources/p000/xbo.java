package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* renamed from: xbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbo {

    /* renamed from: a */
    public static final adcb f51879a = adca.m50151b(xbl.f51878a);

    /* renamed from: b */
    public static final Logger f51880b = new Logger(new String[]{"AccountEnrollStatusStore"}, (short[]) null);

    /* renamed from: c */
    private final xbm f51881c;

    public xbo(Context context) {
        this.f51881c = new xbm(context);
    }

    /* renamed from: a */
    private static final void m42607a(SQLiteCantOpenDatabaseException sQLiteCantOpenDatabaseException) {
        f51880b.mo25418e("Cannot open database.", new Object[0]);
        File databasePath = rpr.m34216b().getDatabasePath("fido_auto_enrollment.db");
        if (databasePath.length() < 1) {
            f51880b.mo25412b("The database file is corrupted and has zero byte, delete the file", new Object[0]);
            if (SQLiteDatabase.deleteDatabase(databasePath)) {
                throw new xbn("Recovered from database corruption", sQLiteCantOpenDatabaseException);
            }
            throw new xbn("Failed to recover from database corruption", sQLiteCantOpenDatabaseException);
        }
        throw new xbn(sQLiteCantOpenDatabaseException);
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:26:0x005f */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:15:0x004d */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r10 != 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r10 == 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        r10.endTransaction();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c A[SYNTHETIC, Splitter:B:24:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[SYNTHETIC, Splitter:B:32:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* renamed from: b */
    public final synchronized List mo29617b() {
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase;
        String[] strArr = {"account"};
        String[] strArr2 = {xka.ANDROID_KEYSTORE.name()};
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            sQLiteDatabase = this.f51881c.getReadableDatabase();
            try {
                sQLiteDatabase.beginTransaction();
                Cursor query = sQLiteDatabase.query("account_enrollment_status", strArr, "key_type = ?", strArr2, null, null, null);
                int columnIndex = query.getColumnIndex("account");
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    arrayList.add(query.getString(columnIndex));
                    query.moveToNext();
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteCantOpenDatabaseException e) {
                e = e;
                try {
                    m42607a(e);
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != 0) {
                        sQLiteDatabase.endTransaction();
                    }
                    throw th;
                }
            }
        } catch (SQLiteCantOpenDatabaseException e2) {
            e = e2;
            sQLiteDatabase = cursor;
            m42607a(e);
            if (cursor != null) {
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = cursor;
            if (cursor != null) {
            }
            if (sQLiteDatabase != 0) {
            }
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:27:0x006b */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:16:0x0059 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r10 != 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r10 == 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        r10.endTransaction();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[SYNTHETIC, Splitter:B:25:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075 A[SYNTHETIC, Splitter:B:33:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
    /* renamed from: a */
    public final synchronized List mo29612a() {
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase;
        String[] strArr = {"credential_identifier"};
        String[] strArr2 = {xka.ANDROID_KEYSTORE.name(), "1"};
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            sQLiteDatabase = this.f51881c.getReadableDatabase();
            try {
                sQLiteDatabase.beginTransaction();
                Cursor query = sQLiteDatabase.query("account_enrollment_status", strArr, "key_type = ? AND validity = ?", strArr2, null, null, null);
                int columnIndex = query.getColumnIndex("credential_identifier");
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    arrayList.add(xjz.m43073a(query.getString(columnIndex)));
                    query.moveToNext();
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteCantOpenDatabaseException e) {
                e = e;
                try {
                    m42607a(e);
                    if (cursor != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != 0) {
                        sQLiteDatabase.endTransaction();
                    }
                    throw th;
                }
            }
        } catch (SQLiteCantOpenDatabaseException e2) {
            e = e2;
            sQLiteDatabase = cursor;
            m42607a(e);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = cursor;
            if (cursor != null) {
            }
            if (sQLiteDatabase != 0) {
            }
            throw th;
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r0 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r0 != null) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[SYNTHETIC, Splitter:B:25:0x006d] */
    /* renamed from: b */
    public final synchronized void mo29618b(String str) {
        Logger Logger = f51880b;
        String valueOf = String.valueOf(str);
        Logger.mo25412b(valueOf.length() == 0 ? new String("Remove the FIDO key enrollment status for account ") : "Remove the FIDO key enrollment status for account ".concat(valueOf), new Object[0]);
        bmxy.m108582a(str, "account cannot be null");
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = this.f51881c.getWritableDatabase();
            try {
                sQLiteDatabase.beginTransaction();
                int delete = sQLiteDatabase.delete("account_enrollment_status", "account = ?", new String[]{str});
                Logger logger2 = f51880b;
                StringBuilder sb = new StringBuilder(37);
                sb.append("Removing account affected ");
                sb.append(delete);
                logger2.mo25412b(sb.toString(), new Object[0]);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLiteCantOpenDatabaseException e) {
                e = e;
                try {
                    m42607a(e);
                } catch (Throwable th) {
                    th = th;
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteCantOpenDatabaseException e2) {
            e = e2;
            m42607a(e);
        } catch (Throwable th2) {
            th = th2;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:26:0x0062 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:15:0x0050 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r9 != 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r9 == 0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r9.endTransaction();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f A[SYNTHETIC, Splitter:B:24:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[SYNTHETIC, Splitter:B:33:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* renamed from: a */
    public final synchronized List mo29613a(String str) {
        bngs j;
        SQLiteDatabase sQLiteDatabase;
        bmxy.m108581a(str);
        String[] strArr = {"credential_identifier"};
        String[] strArr2 = {str};
        j = bngx.m109377j();
        Cursor cursor = null;
        try {
            sQLiteDatabase = this.f51881c.getReadableDatabase();
            try {
                sQLiteDatabase.beginTransaction();
                Cursor query = sQLiteDatabase.query("account_enrollment_status", strArr, "validity = 1 AND account = ?", strArr2, null, null, null);
                int columnIndex = query.getColumnIndex("credential_identifier");
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    j.mo67668c(xjz.m43073a(query.getString(columnIndex)));
                    query.moveToNext();
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteCantOpenDatabaseException e) {
                e = e;
                try {
                    m42607a(e);
                    if (cursor != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase != 0) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteCantOpenDatabaseException e2) {
            e = e2;
            sQLiteDatabase = cursor;
            m42607a(e);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = cursor;
            if (cursor != null) {
                cursor.close();
            }
            if (sQLiteDatabase != 0) {
                sQLiteDatabase.endTransaction();
            }
            throw th;
        }
        return j.mo67664a();
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:27:0x0065 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:16:0x0053 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r9 != 0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        if (r9 == 0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        r9.endTransaction();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[SYNTHETIC, Splitter:B:25:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[SYNTHETIC, Splitter:B:33:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* renamed from: a */
    public final synchronized List mo29614a(xka xka) {
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase;
        String[] strArr = {"account"};
        String[] strArr2 = {xka.name(), "1"};
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            sQLiteDatabase = this.f51881c.getReadableDatabase();
            try {
                sQLiteDatabase.beginTransaction();
                Cursor query = sQLiteDatabase.query("account_enrollment_status", strArr, "key_type = ? AND validity = ?", strArr2, null, null, null);
                int columnIndex = query.getColumnIndex("account");
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    arrayList.add(query.getString(columnIndex));
                    query.moveToNext();
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteCantOpenDatabaseException e) {
                e = e;
                try {
                    m42607a(e);
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase != 0) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteCantOpenDatabaseException e2) {
            e = e2;
            sQLiteDatabase = cursor;
            m42607a(e);
            if (cursor != null) {
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = cursor;
            if (cursor != null) {
                cursor.close();
            }
            if (sQLiteDatabase != 0) {
                sQLiteDatabase.endTransaction();
            }
            throw th;
        }
        return arrayList;
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
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x014f, code lost:
        if (r8 != null) goto L_0x0151;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b1 A[SYNTHETIC, Splitter:B:58:0x01b1] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b6 A[Catch:{ all -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ba A[Catch:{ all -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01bf A[Catch:{ all -> 0x01b7 }] */
    /* renamed from: a */
    public final synchronized void mo29615a(String str, Date date, xjx xjx) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor2;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor3;
        SQLiteDatabase sQLiteDatabase3;
        SQLiteDatabase sQLiteDatabase4;
        String str2 = str;
        Date date2 = date;
        xjx xjx2 = xjx;
        synchronized (this) {
            f51880b.mo25412b("Adding an account enrollment status into Sqlite database", new Object[0]);
            bmxy.m108582a(str2, "account cannot be null");
            bmxy.m108582a(date2, "enrollmentTime cannot be null");
            bmxy.m108582a(xjx2, "credentialIdentifier cannot be null");
            String[] strArr = {"account", "key_type"};
            String[] strArr2 = {str2, ((xjz) xjx2).f52482a.name()};
            try {
                SQLiteDatabase writableDatabase = this.f51881c.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    sQLiteDatabase4 = writableDatabase;
                } catch (SQLiteCantOpenDatabaseException e) {
                    e = e;
                    sQLiteDatabase2 = writableDatabase;
                    cursor2 = null;
                    cursor = cursor2;
                    try {
                        m42607a(e);
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.endTransaction();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase3 = writableDatabase;
                    cursor3 = null;
                    cursor = cursor3;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
                try {
                    cursor = writableDatabase.query("account_enrollment_status", strArr, "account = ? AND key_type = ?", strArr2, null, null, null);
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("enroll_time_millis", xbm.m42605a().format(date2));
                        contentValues.put("credential_identifier", xjx.mo29848b());
                        contentValues.put("validity", (Integer) 1);
                        if (cursor.moveToFirst()) {
                            Logger Logger = f51880b;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                            sb.append("The account ");
                            sb.append(str2);
                            sb.append(" is found in the database. Update the entry.");
                            Logger.mo25412b(sb.toString(), new Object[0]);
                            sQLiteDatabase = sQLiteDatabase4;
                            try {
                                if (sQLiteDatabase.update("account_enrollment_status", contentValues, "account = ? AND key_type = ?", strArr2) != 1) {
                                    String arrays = Arrays.toString(strArr2);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + 107);
                                    sb2.append("Update statement ");
                                    sb2.append("account = ? AND key_type = ?");
                                    sb2.append(" ");
                                    sb2.append(arrays);
                                    sb2.append(" did not change just 1 row in table ");
                                    sb2.append("account_enrollment_status");
                                    throw new xbn(sb2.toString());
                                }
                            } catch (SQLiteCantOpenDatabaseException e2) {
                                e = e2;
                                m42607a(e);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.endTransaction();
                                }
                            }
                        } else {
                            sQLiteDatabase = sQLiteDatabase4;
                            Logger logger2 = f51880b;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 58);
                            sb3.append("The account ");
                            sb3.append(str2);
                            sb3.append(" is not found in the database. Add a new entry");
                            logger2.mo25412b(sb3.toString(), new Object[0]);
                            contentValues.put("account", str2);
                            contentValues.put("original_enroll_time_millis", xbm.m42605a().format(date2));
                            contentValues.put("key_type", ((xjz) xjx2).f52482a.name());
                            if (sQLiteDatabase.insert("account_enrollment_status", null, contentValues) == -1) {
                                String valueOf = String.valueOf(contentValues);
                                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 49);
                                sb4.append("Error inserting {");
                                sb4.append(valueOf);
                                sb4.append("} into ");
                                sb4.append("account_enrollment_status");
                                throw new xbn(sb4.toString());
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        if (cursor != null) {
                            cursor.close();
                        }
                    } catch (SQLiteCantOpenDatabaseException e3) {
                        e = e3;
                        sQLiteDatabase = sQLiteDatabase4;
                        m42607a(e);
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteDatabase = sQLiteDatabase4;
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteCantOpenDatabaseException e4) {
                    e = e4;
                    sQLiteDatabase2 = sQLiteDatabase4;
                    cursor2 = null;
                    cursor = cursor2;
                    m42607a(e);
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabase3 = sQLiteDatabase4;
                    cursor3 = null;
                    cursor = cursor3;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            } catch (SQLiteCantOpenDatabaseException e5) {
                e = e5;
                sQLiteDatabase = null;
                cursor = null;
                m42607a(e);
                if (cursor != null) {
                }
                if (sQLiteDatabase != null) {
                }
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabase = null;
                cursor = null;
                if (cursor != null) {
                }
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
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
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r12 != null) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6 A[SYNTHETIC, Splitter:B:31:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4 A[Catch:{ all -> 0x00ac }] */
    /* renamed from: a */
    public final synchronized void mo29616a(xjx xjx) {
        SQLiteDatabase sQLiteDatabase;
        String[] strArr = {"validity"};
        String[] strArr2 = {xjx.mo29848b()};
        Cursor cursor = null;
        try {
            sQLiteDatabase = this.f51881c.getWritableDatabase();
            try {
                sQLiteDatabase.beginTransaction();
                cursor = sQLiteDatabase.query("account_enrollment_status", strArr, "credential_identifier = ?", strArr2, null, null, null);
                f51880b.mo25412b("Update the validity column to false", new Object[0]);
                ContentValues contentValues = new ContentValues();
                contentValues.put("validity", (Integer) 0);
                int update = sQLiteDatabase.update("account_enrollment_status", contentValues, "credential_identifier = ?", strArr2);
                if (update == 0) {
                    f51880b.mo25418e("The credential identifier cannot be located in the database", new Object[0]);
                } else if (update != 1) {
                    String arrays = Arrays.toString(strArr2);
                    StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + ErrorInfo.TYPE_SDU_FAILED);
                    sb.append("Update statement ");
                    sb.append("credential_identifier = ?");
                    sb.append(" ");
                    sb.append(arrays);
                    sb.append(" did not change just 1 row in table ");
                    sb.append("account_enrollment_status");
                    throw new xbn(sb.toString());
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteCantOpenDatabaseException e) {
                e = e;
                try {
                    m42607a(e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteCantOpenDatabaseException e2) {
            e = e2;
            sQLiteDatabase = null;
            m42607a(e);
            if (cursor != null) {
            }
            if (sQLiteDatabase != null) {
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            if (cursor != null) {
                cursor.close();
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            throw th;
        }
    }
}
