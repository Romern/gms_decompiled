package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

/* renamed from: xdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xdl {

    /* renamed from: a */
    public static final adcb f51999a = adca.m50151b(xdi.f51996a);

    /* renamed from: c */
    private static final Logger f52000c = new Logger(new String[]{"CredentialMetadataStore"}, (short[]) null);

    /* renamed from: b */
    private final xwt f52001b;

    public xdl(Context context) {
        this.f52001b = xwt.m43582a(context);
    }

    /* renamed from: a */
    private static final void m42715a(SQLiteCantOpenDatabaseException sQLiteCantOpenDatabaseException) {
        f52000c.mo25418e("Cannot open database", new Object[0]);
        File databasePath = rpr.m34216b().getDatabasePath("fido_embedded_security_key.db");
        if (databasePath.length() < 1) {
            f52000c.mo25412b("The database file is corrupted and has zero byte, delete the file", new Object[0]);
            SQLiteDatabase.deleteDatabase(databasePath);
        }
        throw new xdk(sQLiteCantOpenDatabaseException);
    }

    /* renamed from: g */
    private final void m42716g(xjx xjx) {
        bmxy.m108582a(xjx, "credentialIdentifier cannot be null");
        try {
            SQLiteDatabase writableDatabase = this.f52001b.getWritableDatabase();
            String format = String.format("DELETE FROM %1$s WHERE %2$s = ? AND %3$s NOT IN (SELECT %3$s FROM %1$s WHERE %2$s = ? ORDER BY date(%3$s) DESC LIMIT %4$s)", "usages", "id", "usage_timestamp", 50);
            Logger Logger = f52000c;
            String valueOf = String.valueOf(format);
            Logger.mo25412b(valueOf.length() == 0 ? new String("Executing query ") : "Executing query ".concat(valueOf), new Object[0]);
            String b = xjx.mo29848b();
            writableDatabase.execSQL(format, new String[]{b, b});
        } catch (SQLiteCantOpenDatabaseException e) {
            m42715a(e);
        }
    }

    /* renamed from: b */
    public final byte[] mo29657b(xjx xjx) {
        xdj f = mo29661f(xjx);
        if (f != null) {
            return f.f51998b;
        }
        String valueOf = String.valueOf(xjx);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Credential not found: ");
        sb.append(valueOf);
        throw new xdk(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo29658c(xjx xjx) {
        long j;
        f52000c.mo25412b("Incrementing the counter of the registered credential", new Object[0]);
        bmxy.m108582a(xjx, "credentialIdentifier cannot be null");
        String[] strArr = {xjx.mo29848b()};
        try {
            xdj f = mo29661f(xjx);
            if (f != null) {
                SQLiteDatabase writableDatabase = this.f52001b.getWritableDatabase();
                j = f.f51997a + 1;
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("counter", Long.valueOf(j));
                    if (writableDatabase.update("registered_credentials", contentValues, "id = ?", strArr) == 1) {
                        return j;
                    }
                    String arrays = Arrays.toString(strArr);
                    StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 83);
                    sb.append("Update statement ");
                    sb.append("id = ?");
                    sb.append(" ");
                    sb.append(arrays);
                    sb.append(" did not change just 1 row  in table ");
                    sb.append("registered_credentials");
                    throw new xdk(sb.toString());
                } catch (SQLiteCantOpenDatabaseException e) {
                    e = e;
                    m42715a(e);
                    return j;
                }
            } else {
                String valueOf = String.valueOf(xjx);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb2.append("credentialIdentifier ");
                sb2.append(valueOf);
                sb2.append(" was not found in database.");
                throw new xdk(sb2.toString());
            }
        } catch (SQLiteCantOpenDatabaseException e2) {
            e = e2;
            j = -1;
            m42715a(e);
            return j;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo29659d(xjx xjx) {
        f52000c.mo25412b("Removes a registered credential from Sqlite database", new Object[0]);
        bmxy.m108582a(xjx, "credentialIdentifier cannot be null");
        mo29660e(xjx);
        try {
            int delete = this.f52001b.getWritableDatabase().delete("registered_credentials", "id = ?", new String[]{xjx.mo29848b()});
            if (delete != 1) {
                StringBuilder sb = new StringBuilder(58);
                sb.append("Removing credential affected ");
                sb.append(delete);
                sb.append(" rows. Expected 1.");
                throw new xdk(sb.toString());
            }
        } catch (SQLiteCantOpenDatabaseException e) {
            m42715a(e);
        }
    }

    /* renamed from: e */
    public final void mo29660e(xjx xjx) {
        f52000c.mo25412b("Clears the usage of a registered credential from Sqlite database", new Object[0]);
        bmxy.m108582a(xjx, "credentialIdentifier cannot be null");
        try {
            this.f52001b.getWritableDatabase().delete("usages", "id = ?", new String[]{xjx.mo29848b()});
        } catch (SQLiteCantOpenDatabaseException e) {
            m42715a(e);
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:18:0x0055 */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Type inference failed for: r0v4, assign insn: 0x0015: CONST  (r0v4 ? I:?[int, float, short, byte, char]) = (3 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r0v6, assign insn: PHI: (r0v6 ?) = (r0v4 ?), (r0v11 ?) binds: [B:1:0x0025, B:18:0x0055] */
    /* JADX WARN: Type inference failed for: r0v11, assign insn: PHI: (r0v11 ?) = (r0v13 ?), (r0v18 ?) binds: [B:17:0x0052, B:13:0x004b] */
    /* JADX WARN: Type inference failed for: r0v13, assign insn: 0x0053: MOVE  (r0v13 ? I:?[OBJECT, ARRAY]) = (0 ?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r0v18, assign insn: ?: MOVE  (r0v18 ?) = (r0v16 android.database.Cursor) */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    public final xdj mo29661f(xjx xjx) {
        Throwable th;
        SQLiteCantOpenDatabaseException e;
        Cursor cursor;
        ParseException e2;
        bmxy.m108581a(xjx);
        ? r0 = 3;
        String[] strArr = {"id", "registration_time", "counter", "key_data"};
        String[] strArr2 = {xjx.mo29848b()};
        Cursor cursor2 = null;
        try {
            Cursor query = this.f52001b.getReadableDatabase().query("registered_credentials", strArr, "id = ?", strArr2, null, null, null);
            try {
                if (query.moveToFirst()) {
                    xdj xdj = new xdj(query);
                    if (query != null) {
                        query.close();
                    }
                    return xdj;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteCantOpenDatabaseException e3) {
                e = e3;
                cursor = query;
                m42715a(e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (ParseException e4) {
                e2 = e4;
                r0 = query;
                throw new xdk("Database error.", e2);
            }
        } catch (SQLiteCantOpenDatabaseException e5) {
            e = e5;
            cursor = null;
            m42715a(e);
            if (cursor != null) {
            }
            return null;
        } catch (ParseException e6) {
            r0 = 0;
            e2 = e6;
            throw new xdk("Database error.", e2);
        } catch (Throwable th2) {
            th = th2;
            cursor2 = r0;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29654a(xjx xjx, Date date) {
        f52000c.mo25412b("Recording the usage of a registered credential", new Object[0]);
        bmxy.m108582a(xjx, "credentialIdentifier cannot be null");
        bmxy.m108582a(date, "usageTimestamp cannot be null");
        try {
            SQLiteDatabase writableDatabase = this.f52001b.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", xjx.mo29848b());
            contentValues.put("usage_timestamp", xcm.m42657a().format(date));
            if (writableDatabase.insert("usages", null, contentValues) != -1) {
                m42716g(xjx);
                return;
            }
            String valueOf = String.valueOf(contentValues);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Error inserting {");
            sb.append(valueOf);
            sb.append("} into ");
            sb.append("usages");
            throw new xdk(sb.toString());
        } catch (SQLiteCantOpenDatabaseException e) {
            m42715a(e);
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
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29655a(xjx xjx, Date date, byte[] bArr) {
        f52000c.mo25412b("Adding a registered credential into Sqlite database", new Object[0]);
        bmxy.m108582a(xjx, "credentialIdentifier cannot be null");
        bmxy.m108582a(date, "registrationTime cannot be null");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", xjx.mo29848b());
        contentValues.put("registration_time", xcm.m42657a().format(date));
        contentValues.put("counter", (Integer) 0);
        contentValues.put("key_data", bArr);
        try {
            if (this.f52001b.getWritableDatabase().insert("registered_credentials", null, contentValues) == -1) {
                String valueOf = String.valueOf(contentValues);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                sb.append("Error inserting {");
                sb.append(valueOf);
                sb.append("} into ");
                sb.append("registered_credentials");
                throw new xdk(sb.toString());
            }
        } catch (SQLiteCantOpenDatabaseException e) {
            m42715a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo29656a(xjx xjx) {
        return mo29661f(xjx) != null;
    }
}
