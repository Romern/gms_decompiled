package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.Locale;

/* renamed from: aplj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aplj extends srp {

    /* renamed from: a */
    public final int f84700a;

    /* renamed from: b */
    static final void m70613b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.execSQL(String.format(Locale.US, "CREATE UNIQUE INDEX %s ON \"%s\" (\"tag\", \"target_class\", \"target_package\", \"user_id\");", str2, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        aech aech = new aech("nts:db:onCreate");
        try {
            mo47395a(sQLiteDatabase, "pending_ops", "pk_pending_ops");
            aech.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo47396a() {
        return this.f84700a >= 18;
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 14) {
            Log.e("NetworkScheduler", String.format("Database downgrade required (version %d -> %d), dropping all data", Integer.valueOf(i), Integer.valueOf(i2)));
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS pending_ops;");
            mo47395a(sQLiteDatabase, "pending_ops", "pk_pending_ops");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0131 A[Catch:{ all -> 0x0226, all -> 0x029a }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x013d A[SYNTHETIC, Splitter:B:24:0x013d] */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        aech aech;
        int i3;
        char c;
        char c2;
        String str;
        String str2;
        String str3;
        Cursor query;
        int i4;
        long j;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i5 = i;
        aech aech2 = new aech("nts:db:onUpgrade");
        try {
            aplk aplk = new aplk(this);
            String str4 = "pending_ops";
            if (i5 <= 13) {
                aech = aech2;
                String str5 = "ALTER TABLE %s ADD COLUMN %s STRING;";
                switch (i5) {
                    case 1:
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS pending_ops");
                        aplk.f84701a.mo47395a(sQLiteDatabase2, str4, "pk_pending_ops");
                        i5 = 14;
                        break;
                    case 2:
                        try {
                            sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s INTEGER;", str4, "required_network_type"));
                            sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s INTEGER;", str4, "requires_charging"));
                            sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s STRING;", str4, "extras"));
                            StringBuilder sb = new StringBuilder(287);
                            sb.append("create TABLE ");
                            sb.append("tmp");
                            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, target_package TEXT NOT NULL, target_class TEXT NOT NULL, tag TEXT, runtime INTEGER, flex_time INTEGER, period INTEGER, last_runtime INTEGER, user_id INTEGER, required_network_type INTEGER, requires_charging INTEGER, extras TEXT);");
                            sQLiteDatabase2.execSQL(sb.toString());
                            StringBuilder sb2 = new StringBuilder(180);
                            sb2.append("INSERT INTO tmp SELECT _id, target_package, target_class, tag, runtime, flex_time, period, last_runtime, user_id, required_network_type, requires_charging, extras FROM pending_ops;");
                            sQLiteDatabase2.execSQL(sb2.toString());
                            sQLiteDatabase2.execSQL("DROP TABLE pending_ops;");
                            StringBuilder sb3 = new StringBuilder(38);
                            sb3.append("ALTER TABLE tmp RENAME TO pending_ops;");
                            sQLiteDatabase2.execSQL(sb3.toString());
                            sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s TEXT;", str4, "retry_strategy"));
                            sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s INTEGER;", str4, "task_type"));
                            str2 = "pk_pending_ops";
                            str3 = str5;
                            String str6 = str4;
                            String str7 = "task_type";
                            query = sQLiteDatabase.query("pending_ops", new String[]{"_id", "runtime", "flex_time", "period"}, null, null, null, null, null, null);
                            if (query != null) {
                                Log.e("NetworkScheduler", "Trying to upgrade column values from DB, but cursor is invalid.");
                                str4 = str6;
                                c2 = 0;
                                c = 1;
                            } else {
                                query.moveToFirst();
                                while (!query.isAfterLast()) {
                                    int i6 = query.getInt(0);
                                    long j2 = query.getLong(1);
                                    long j3 = query.getLong(2);
                                    long j4 = query.getLong(3);
                                    long j5 = 0;
                                    if (j4 != 0) {
                                        j = j2 - j4;
                                        j5 = j3;
                                        i4 = 1;
                                    } else {
                                        j = j2 - j3;
                                        j4 = j3;
                                        i4 = 0;
                                    }
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("runtime", Long.valueOf(j));
                                    contentValues.put("flex_time", Long.valueOf(j5));
                                    contentValues.put("period", Long.valueOf(j4));
                                    contentValues.put(str7, Integer.valueOf(i4));
                                    String str8 = str6;
                                    sQLiteDatabase2.update(str8, contentValues, "_id = ?", new String[]{Integer.toString(i6)});
                                    query.moveToNext();
                                    str6 = str8;
                                }
                                str4 = str6;
                                c2 = 0;
                                c = 1;
                                query.close();
                            }
                            Locale locale = Locale.US;
                            Object[] objArr = new Object[2];
                            objArr[c2] = str4;
                            objArr[c] = "job_id";
                            sQLiteDatabase2.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s INTEGER;", objArr));
                            Locale locale2 = Locale.US;
                            Object[] objArr2 = new Object[2];
                            objArr2[c2] = str4;
                            objArr2[c] = "content_uris";
                            str = str3;
                            sQLiteDatabase2.execSQL(String.format(locale2, str, objArr2));
                            sQLiteDatabase2.execSQL("DELETE FROM pending_ops WHERE _id NOT IN (SELECT MAX(_id) FROM pending_ops GROUP BY tag, target_class, target_package, user_id);");
                            m70613b(sQLiteDatabase2, str4, str2);
                            Locale locale3 = Locale.US;
                            Object[] objArr3 = new Object[2];
                            objArr3[c2] = str4;
                            objArr3[c] = "source";
                            sQLiteDatabase2.execSQL(String.format(locale3, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr3));
                            Locale locale4 = Locale.US;
                            Object[] objArr4 = new Object[2];
                            objArr4[c2] = str4;
                            objArr4[c] = "source_version";
                            sQLiteDatabase2.execSQL(String.format(locale4, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr4));
                            Locale locale5 = Locale.US;
                            Object[] objArr5 = new Object[2];
                            objArr5[c2] = str4;
                            objArr5[c] = "triggered_content_uris";
                            sQLiteDatabase2.execSQL(String.format(locale5, str, objArr5));
                            Locale locale6 = Locale.US;
                            Object[] objArr6 = new Object[2];
                            objArr6[c2] = str4;
                            objArr6[c] = "required_uris";
                            sQLiteDatabase2.execSQL(String.format(locale6, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr6));
                            i5 = 14;
                            break;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                aech.close();
                            } catch (Throwable th3) {
                                bqye.m113761a(th2, th3);
                            }
                            throw th2;
                        }
                    case 3:
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s INTEGER;", str4, "requires_charging"));
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s STRING;", str4, "extras"));
                        StringBuilder sb4 = new StringBuilder(287);
                        sb4.append("create TABLE ");
                        sb4.append("tmp");
                        sb4.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, target_package TEXT NOT NULL, target_class TEXT NOT NULL, tag TEXT, runtime INTEGER, flex_time INTEGER, period INTEGER, last_runtime INTEGER, user_id INTEGER, required_network_type INTEGER, requires_charging INTEGER, extras TEXT);");
                        sQLiteDatabase2.execSQL(sb4.toString());
                        StringBuilder sb22 = new StringBuilder(180);
                        sb22.append("INSERT INTO tmp SELECT _id, target_package, target_class, tag, runtime, flex_time, period, last_runtime, user_id, required_network_type, requires_charging, extras FROM pending_ops;");
                        sQLiteDatabase2.execSQL(sb22.toString());
                        sQLiteDatabase2.execSQL("DROP TABLE pending_ops;");
                        StringBuilder sb32 = new StringBuilder(38);
                        sb32.append("ALTER TABLE tmp RENAME TO pending_ops;");
                        sQLiteDatabase2.execSQL(sb32.toString());
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s TEXT;", str4, "retry_strategy"));
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s INTEGER;", str4, "task_type"));
                        str2 = "pk_pending_ops";
                        str3 = str5;
                        String str62 = str4;
                        String str72 = "task_type";
                        query = sQLiteDatabase.query("pending_ops", new String[]{"_id", "runtime", "flex_time", "period"}, null, null, null, null, null, null);
                        if (query != null) {
                        }
                        Locale locale7 = Locale.US;
                        Object[] objArr7 = new Object[2];
                        objArr7[c2] = str4;
                        objArr7[c] = "job_id";
                        sQLiteDatabase2.execSQL(String.format(locale7, "ALTER TABLE %s ADD COLUMN %s INTEGER;", objArr7));
                        Locale locale22 = Locale.US;
                        Object[] objArr22 = new Object[2];
                        objArr22[c2] = str4;
                        objArr22[c] = "content_uris";
                        str = str3;
                        sQLiteDatabase2.execSQL(String.format(locale22, str, objArr22));
                        sQLiteDatabase2.execSQL("DELETE FROM pending_ops WHERE _id NOT IN (SELECT MAX(_id) FROM pending_ops GROUP BY tag, target_class, target_package, user_id);");
                        m70613b(sQLiteDatabase2, str4, str2);
                        Locale locale32 = Locale.US;
                        Object[] objArr32 = new Object[2];
                        objArr32[c2] = str4;
                        objArr32[c] = "source";
                        sQLiteDatabase2.execSQL(String.format(locale32, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr32));
                        Locale locale42 = Locale.US;
                        Object[] objArr42 = new Object[2];
                        objArr42[c2] = str4;
                        objArr42[c] = "source_version";
                        sQLiteDatabase2.execSQL(String.format(locale42, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr42));
                        Locale locale52 = Locale.US;
                        Object[] objArr52 = new Object[2];
                        objArr52[c2] = str4;
                        objArr52[c] = "triggered_content_uris";
                        sQLiteDatabase2.execSQL(String.format(locale52, str, objArr52));
                        Locale locale62 = Locale.US;
                        Object[] objArr62 = new Object[2];
                        objArr62[c2] = str4;
                        objArr62[c] = "required_uris";
                        sQLiteDatabase2.execSQL(String.format(locale62, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr62));
                        i5 = 14;
                        break;
                    case 4:
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s STRING;", str4, "extras"));
                        StringBuilder sb42 = new StringBuilder(287);
                        sb42.append("create TABLE ");
                        sb42.append("tmp");
                        sb42.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, target_package TEXT NOT NULL, target_class TEXT NOT NULL, tag TEXT, runtime INTEGER, flex_time INTEGER, period INTEGER, last_runtime INTEGER, user_id INTEGER, required_network_type INTEGER, requires_charging INTEGER, extras TEXT);");
                        sQLiteDatabase2.execSQL(sb42.toString());
                        StringBuilder sb222 = new StringBuilder(180);
                        sb222.append("INSERT INTO tmp SELECT _id, target_package, target_class, tag, runtime, flex_time, period, last_runtime, user_id, required_network_type, requires_charging, extras FROM pending_ops;");
                        sQLiteDatabase2.execSQL(sb222.toString());
                        sQLiteDatabase2.execSQL("DROP TABLE pending_ops;");
                        StringBuilder sb322 = new StringBuilder(38);
                        sb322.append("ALTER TABLE tmp RENAME TO pending_ops;");
                        sQLiteDatabase2.execSQL(sb322.toString());
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s TEXT;", str4, "retry_strategy"));
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s INTEGER;", str4, "task_type"));
                        str2 = "pk_pending_ops";
                        str3 = str5;
                        String str622 = str4;
                        String str722 = "task_type";
                        query = sQLiteDatabase.query("pending_ops", new String[]{"_id", "runtime", "flex_time", "period"}, null, null, null, null, null, null);
                        if (query != null) {
                        }
                        Locale locale72 = Locale.US;
                        Object[] objArr72 = new Object[2];
                        objArr72[c2] = str4;
                        objArr72[c] = "job_id";
                        sQLiteDatabase2.execSQL(String.format(locale72, "ALTER TABLE %s ADD COLUMN %s INTEGER;", objArr72));
                        Locale locale222 = Locale.US;
                        Object[] objArr222 = new Object[2];
                        objArr222[c2] = str4;
                        objArr222[c] = "content_uris";
                        str = str3;
                        sQLiteDatabase2.execSQL(String.format(locale222, str, objArr222));
                        sQLiteDatabase2.execSQL("DELETE FROM pending_ops WHERE _id NOT IN (SELECT MAX(_id) FROM pending_ops GROUP BY tag, target_class, target_package, user_id);");
                        m70613b(sQLiteDatabase2, str4, str2);
                        Locale locale322 = Locale.US;
                        Object[] objArr322 = new Object[2];
                        objArr322[c2] = str4;
                        objArr322[c] = "source";
                        sQLiteDatabase2.execSQL(String.format(locale322, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr322));
                        Locale locale422 = Locale.US;
                        Object[] objArr422 = new Object[2];
                        objArr422[c2] = str4;
                        objArr422[c] = "source_version";
                        sQLiteDatabase2.execSQL(String.format(locale422, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr422));
                        Locale locale522 = Locale.US;
                        Object[] objArr522 = new Object[2];
                        objArr522[c2] = str4;
                        objArr522[c] = "triggered_content_uris";
                        sQLiteDatabase2.execSQL(String.format(locale522, str, objArr522));
                        Locale locale622 = Locale.US;
                        Object[] objArr622 = new Object[2];
                        objArr622[c2] = str4;
                        objArr622[c] = "required_uris";
                        sQLiteDatabase2.execSQL(String.format(locale622, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr622));
                        i5 = 14;
                        break;
                    case 5:
                        StringBuilder sb422 = new StringBuilder(287);
                        sb422.append("create TABLE ");
                        sb422.append("tmp");
                        sb422.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, target_package TEXT NOT NULL, target_class TEXT NOT NULL, tag TEXT, runtime INTEGER, flex_time INTEGER, period INTEGER, last_runtime INTEGER, user_id INTEGER, required_network_type INTEGER, requires_charging INTEGER, extras TEXT);");
                        sQLiteDatabase2.execSQL(sb422.toString());
                        StringBuilder sb2222 = new StringBuilder(180);
                        sb2222.append("INSERT INTO tmp SELECT _id, target_package, target_class, tag, runtime, flex_time, period, last_runtime, user_id, required_network_type, requires_charging, extras FROM pending_ops;");
                        sQLiteDatabase2.execSQL(sb2222.toString());
                        sQLiteDatabase2.execSQL("DROP TABLE pending_ops;");
                        StringBuilder sb3222 = new StringBuilder(38);
                        sb3222.append("ALTER TABLE tmp RENAME TO pending_ops;");
                        sQLiteDatabase2.execSQL(sb3222.toString());
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s TEXT;", str4, "retry_strategy"));
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s INTEGER;", str4, "task_type"));
                        str2 = "pk_pending_ops";
                        str3 = str5;
                        String str6222 = str4;
                        String str7222 = "task_type";
                        query = sQLiteDatabase.query("pending_ops", new String[]{"_id", "runtime", "flex_time", "period"}, null, null, null, null, null, null);
                        if (query != null) {
                        }
                        Locale locale722 = Locale.US;
                        Object[] objArr722 = new Object[2];
                        objArr722[c2] = str4;
                        objArr722[c] = "job_id";
                        sQLiteDatabase2.execSQL(String.format(locale722, "ALTER TABLE %s ADD COLUMN %s INTEGER;", objArr722));
                        Locale locale2222 = Locale.US;
                        Object[] objArr2222 = new Object[2];
                        objArr2222[c2] = str4;
                        objArr2222[c] = "content_uris";
                        str = str3;
                        sQLiteDatabase2.execSQL(String.format(locale2222, str, objArr2222));
                        sQLiteDatabase2.execSQL("DELETE FROM pending_ops WHERE _id NOT IN (SELECT MAX(_id) FROM pending_ops GROUP BY tag, target_class, target_package, user_id);");
                        m70613b(sQLiteDatabase2, str4, str2);
                        Locale locale3222 = Locale.US;
                        Object[] objArr3222 = new Object[2];
                        objArr3222[c2] = str4;
                        objArr3222[c] = "source";
                        sQLiteDatabase2.execSQL(String.format(locale3222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr3222));
                        Locale locale4222 = Locale.US;
                        Object[] objArr4222 = new Object[2];
                        objArr4222[c2] = str4;
                        objArr4222[c] = "source_version";
                        sQLiteDatabase2.execSQL(String.format(locale4222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr4222));
                        Locale locale5222 = Locale.US;
                        Object[] objArr5222 = new Object[2];
                        objArr5222[c2] = str4;
                        objArr5222[c] = "triggered_content_uris";
                        sQLiteDatabase2.execSQL(String.format(locale5222, str, objArr5222));
                        Locale locale6222 = Locale.US;
                        Object[] objArr6222 = new Object[2];
                        objArr6222[c2] = str4;
                        objArr6222[c] = "required_uris";
                        sQLiteDatabase2.execSQL(String.format(locale6222, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr6222));
                        i5 = 14;
                        break;
                    case 6:
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s TEXT;", str4, "retry_strategy"));
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s INTEGER;", str4, "task_type"));
                        str2 = "pk_pending_ops";
                        str3 = str5;
                        String str62222 = str4;
                        String str72222 = "task_type";
                        query = sQLiteDatabase.query("pending_ops", new String[]{"_id", "runtime", "flex_time", "period"}, null, null, null, null, null, null);
                        if (query != null) {
                        }
                        Locale locale7222 = Locale.US;
                        Object[] objArr7222 = new Object[2];
                        objArr7222[c2] = str4;
                        objArr7222[c] = "job_id";
                        sQLiteDatabase2.execSQL(String.format(locale7222, "ALTER TABLE %s ADD COLUMN %s INTEGER;", objArr7222));
                        Locale locale22222 = Locale.US;
                        Object[] objArr22222 = new Object[2];
                        objArr22222[c2] = str4;
                        objArr22222[c] = "content_uris";
                        str = str3;
                        sQLiteDatabase2.execSQL(String.format(locale22222, str, objArr22222));
                        sQLiteDatabase2.execSQL("DELETE FROM pending_ops WHERE _id NOT IN (SELECT MAX(_id) FROM pending_ops GROUP BY tag, target_class, target_package, user_id);");
                        m70613b(sQLiteDatabase2, str4, str2);
                        Locale locale32222 = Locale.US;
                        Object[] objArr32222 = new Object[2];
                        objArr32222[c2] = str4;
                        objArr32222[c] = "source";
                        sQLiteDatabase2.execSQL(String.format(locale32222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr32222));
                        Locale locale42222 = Locale.US;
                        Object[] objArr42222 = new Object[2];
                        objArr42222[c2] = str4;
                        objArr42222[c] = "source_version";
                        sQLiteDatabase2.execSQL(String.format(locale42222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr42222));
                        Locale locale52222 = Locale.US;
                        Object[] objArr52222 = new Object[2];
                        objArr52222[c2] = str4;
                        objArr52222[c] = "triggered_content_uris";
                        sQLiteDatabase2.execSQL(String.format(locale52222, str, objArr52222));
                        Locale locale62222 = Locale.US;
                        Object[] objArr62222 = new Object[2];
                        objArr62222[c2] = str4;
                        objArr62222[c] = "required_uris";
                        sQLiteDatabase2.execSQL(String.format(locale62222, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr62222));
                        i5 = 14;
                        break;
                    case 7:
                        sQLiteDatabase2.execSQL(String.format("ALTER TABLE %s add COLUMN %s INTEGER;", str4, "task_type"));
                        str2 = "pk_pending_ops";
                        str3 = str5;
                        String str622222 = str4;
                        String str722222 = "task_type";
                        query = sQLiteDatabase.query("pending_ops", new String[]{"_id", "runtime", "flex_time", "period"}, null, null, null, null, null, null);
                        if (query != null) {
                        }
                        Locale locale72222 = Locale.US;
                        Object[] objArr72222 = new Object[2];
                        objArr72222[c2] = str4;
                        objArr72222[c] = "job_id";
                        sQLiteDatabase2.execSQL(String.format(locale72222, "ALTER TABLE %s ADD COLUMN %s INTEGER;", objArr72222));
                        Locale locale222222 = Locale.US;
                        Object[] objArr222222 = new Object[2];
                        objArr222222[c2] = str4;
                        objArr222222[c] = "content_uris";
                        str = str3;
                        sQLiteDatabase2.execSQL(String.format(locale222222, str, objArr222222));
                        sQLiteDatabase2.execSQL("DELETE FROM pending_ops WHERE _id NOT IN (SELECT MAX(_id) FROM pending_ops GROUP BY tag, target_class, target_package, user_id);");
                        m70613b(sQLiteDatabase2, str4, str2);
                        Locale locale322222 = Locale.US;
                        Object[] objArr322222 = new Object[2];
                        objArr322222[c2] = str4;
                        objArr322222[c] = "source";
                        sQLiteDatabase2.execSQL(String.format(locale322222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr322222));
                        Locale locale422222 = Locale.US;
                        Object[] objArr422222 = new Object[2];
                        objArr422222[c2] = str4;
                        objArr422222[c] = "source_version";
                        sQLiteDatabase2.execSQL(String.format(locale422222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr422222));
                        Locale locale522222 = Locale.US;
                        Object[] objArr522222 = new Object[2];
                        objArr522222[c2] = str4;
                        objArr522222[c] = "triggered_content_uris";
                        sQLiteDatabase2.execSQL(String.format(locale522222, str, objArr522222));
                        Locale locale622222 = Locale.US;
                        Object[] objArr622222 = new Object[2];
                        objArr622222[c2] = str4;
                        objArr622222[c] = "required_uris";
                        sQLiteDatabase2.execSQL(String.format(locale622222, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr622222));
                        i5 = 14;
                        break;
                    case 8:
                        str2 = "pk_pending_ops";
                        str3 = str5;
                        c2 = 0;
                        c = 1;
                        Locale locale722222 = Locale.US;
                        Object[] objArr722222 = new Object[2];
                        objArr722222[c2] = str4;
                        objArr722222[c] = "job_id";
                        sQLiteDatabase2.execSQL(String.format(locale722222, "ALTER TABLE %s ADD COLUMN %s INTEGER;", objArr722222));
                        Locale locale2222222 = Locale.US;
                        Object[] objArr2222222 = new Object[2];
                        objArr2222222[c2] = str4;
                        objArr2222222[c] = "content_uris";
                        str = str3;
                        sQLiteDatabase2.execSQL(String.format(locale2222222, str, objArr2222222));
                        sQLiteDatabase2.execSQL("DELETE FROM pending_ops WHERE _id NOT IN (SELECT MAX(_id) FROM pending_ops GROUP BY tag, target_class, target_package, user_id);");
                        m70613b(sQLiteDatabase2, str4, str2);
                        Locale locale3222222 = Locale.US;
                        Object[] objArr3222222 = new Object[2];
                        objArr3222222[c2] = str4;
                        objArr3222222[c] = "source";
                        sQLiteDatabase2.execSQL(String.format(locale3222222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr3222222));
                        Locale locale4222222 = Locale.US;
                        Object[] objArr4222222 = new Object[2];
                        objArr4222222[c2] = str4;
                        objArr4222222[c] = "source_version";
                        sQLiteDatabase2.execSQL(String.format(locale4222222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr4222222));
                        Locale locale5222222 = Locale.US;
                        Object[] objArr5222222 = new Object[2];
                        objArr5222222[c2] = str4;
                        objArr5222222[c] = "triggered_content_uris";
                        sQLiteDatabase2.execSQL(String.format(locale5222222, str, objArr5222222));
                        Locale locale6222222 = Locale.US;
                        Object[] objArr6222222 = new Object[2];
                        objArr6222222[c2] = str4;
                        objArr6222222[c] = "required_uris";
                        sQLiteDatabase2.execSQL(String.format(locale6222222, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr6222222));
                        i5 = 14;
                        break;
                    case 9:
                        str2 = "pk_pending_ops";
                        str3 = str5;
                        c2 = 0;
                        c = 1;
                        Locale locale22222222 = Locale.US;
                        Object[] objArr22222222 = new Object[2];
                        objArr22222222[c2] = str4;
                        objArr22222222[c] = "content_uris";
                        str = str3;
                        sQLiteDatabase2.execSQL(String.format(locale22222222, str, objArr22222222));
                        sQLiteDatabase2.execSQL("DELETE FROM pending_ops WHERE _id NOT IN (SELECT MAX(_id) FROM pending_ops GROUP BY tag, target_class, target_package, user_id);");
                        m70613b(sQLiteDatabase2, str4, str2);
                        Locale locale32222222 = Locale.US;
                        Object[] objArr32222222 = new Object[2];
                        objArr32222222[c2] = str4;
                        objArr32222222[c] = "source";
                        sQLiteDatabase2.execSQL(String.format(locale32222222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr32222222));
                        Locale locale42222222 = Locale.US;
                        Object[] objArr42222222 = new Object[2];
                        objArr42222222[c2] = str4;
                        objArr42222222[c] = "source_version";
                        sQLiteDatabase2.execSQL(String.format(locale42222222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr42222222));
                        Locale locale52222222 = Locale.US;
                        Object[] objArr52222222 = new Object[2];
                        objArr52222222[c2] = str4;
                        objArr52222222[c] = "triggered_content_uris";
                        sQLiteDatabase2.execSQL(String.format(locale52222222, str, objArr52222222));
                        Locale locale62222222 = Locale.US;
                        Object[] objArr62222222 = new Object[2];
                        objArr62222222[c2] = str4;
                        objArr62222222[c] = "required_uris";
                        sQLiteDatabase2.execSQL(String.format(locale62222222, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr62222222));
                        i5 = 14;
                        break;
                    case 10:
                        str2 = "pk_pending_ops";
                        str = str5;
                        c2 = 0;
                        c = 1;
                        sQLiteDatabase2.execSQL("DELETE FROM pending_ops WHERE _id NOT IN (SELECT MAX(_id) FROM pending_ops GROUP BY tag, target_class, target_package, user_id);");
                        m70613b(sQLiteDatabase2, str4, str2);
                        Locale locale322222222 = Locale.US;
                        Object[] objArr322222222 = new Object[2];
                        objArr322222222[c2] = str4;
                        objArr322222222[c] = "source";
                        sQLiteDatabase2.execSQL(String.format(locale322222222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr322222222));
                        Locale locale422222222 = Locale.US;
                        Object[] objArr422222222 = new Object[2];
                        objArr422222222[c2] = str4;
                        objArr422222222[c] = "source_version";
                        sQLiteDatabase2.execSQL(String.format(locale422222222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr422222222));
                        Locale locale522222222 = Locale.US;
                        Object[] objArr522222222 = new Object[2];
                        objArr522222222[c2] = str4;
                        objArr522222222[c] = "triggered_content_uris";
                        sQLiteDatabase2.execSQL(String.format(locale522222222, str, objArr522222222));
                        Locale locale622222222 = Locale.US;
                        Object[] objArr622222222 = new Object[2];
                        objArr622222222[c2] = str4;
                        objArr622222222[c] = "required_uris";
                        sQLiteDatabase2.execSQL(String.format(locale622222222, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr622222222));
                        i5 = 14;
                        break;
                    case 11:
                        str = str5;
                        c2 = 0;
                        c = 1;
                        Locale locale3222222222 = Locale.US;
                        Object[] objArr3222222222 = new Object[2];
                        objArr3222222222[c2] = str4;
                        objArr3222222222[c] = "source";
                        sQLiteDatabase2.execSQL(String.format(locale3222222222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr3222222222));
                        Locale locale4222222222 = Locale.US;
                        Object[] objArr4222222222 = new Object[2];
                        objArr4222222222[c2] = str4;
                        objArr4222222222[c] = "source_version";
                        sQLiteDatabase2.execSQL(String.format(locale4222222222, "ALTER TABLE %s ADD COLUMN %S INTEGER DEFAULT 0;", objArr4222222222));
                        Locale locale5222222222 = Locale.US;
                        Object[] objArr5222222222 = new Object[2];
                        objArr5222222222[c2] = str4;
                        objArr5222222222[c] = "triggered_content_uris";
                        sQLiteDatabase2.execSQL(String.format(locale5222222222, str, objArr5222222222));
                        Locale locale6222222222 = Locale.US;
                        Object[] objArr6222222222 = new Object[2];
                        objArr6222222222[c2] = str4;
                        objArr6222222222[c] = "required_uris";
                        sQLiteDatabase2.execSQL(String.format(locale6222222222, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr6222222222));
                        i5 = 14;
                        break;
                    case 12:
                        str = str5;
                        c2 = 0;
                        c = 1;
                        Locale locale52222222222 = Locale.US;
                        Object[] objArr52222222222 = new Object[2];
                        objArr52222222222[c2] = str4;
                        objArr52222222222[c] = "triggered_content_uris";
                        sQLiteDatabase2.execSQL(String.format(locale52222222222, str, objArr52222222222));
                        Locale locale62222222222 = Locale.US;
                        Object[] objArr62222222222 = new Object[2];
                        objArr62222222222[c2] = str4;
                        objArr62222222222[c] = "required_uris";
                        sQLiteDatabase2.execSQL(String.format(locale62222222222, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr62222222222));
                        i5 = 14;
                        break;
                    case 13:
                        c2 = 0;
                        c = 1;
                        Locale locale622222222222 = Locale.US;
                        Object[] objArr622222222222 = new Object[2];
                        objArr622222222222[c2] = str4;
                        objArr622222222222[c] = "required_uris";
                        sQLiteDatabase2.execSQL(String.format(locale622222222222, "ALTER TABLE %s ADD COLUMN %s TEXT;", objArr622222222222));
                        i5 = 14;
                        break;
                    default:
                        i5 = 14;
                        break;
                }
            } else {
                aech = aech2;
            }
            new aplk(this);
            if (i5 > 14) {
                i3 = i2;
            } else {
                i3 = i2;
                if (i3 >= 15) {
                    apll.m70617a(sQLiteDatabase2, str4, "preferred_network_type", "INTEGER");
                    apll.m70617a(sQLiteDatabase2, str4, "preferred_charging_state", "INTEGER");
                    i5 = 15;
                }
            }
            new aplk(this);
            if (i5 <= 15) {
                if (i3 >= 16) {
                    apll.m70617a(sQLiteDatabase2, str4, "required_idleness_state", "INTEGER");
                    apll.m70617a(sQLiteDatabase2, str4, "preferred_idleness_state", "INTEGER");
                    i5 = 16;
                }
            }
            new aplk(this);
            if (i5 <= 16) {
                if (i3 >= 17) {
                    apll.m70617a(sQLiteDatabase2, str4, "service_kind", "INTEGER");
                    i5 = 17;
                }
            }
            new aplk(this);
            if (i5 <= 17 && i3 >= 18) {
                apll.m70617a(sQLiteDatabase2, str4, "persistence_level", "INTEGER");
            }
            aech.close();
        } catch (Throwable th4) {
            th = th4;
            aech = aech2;
            Throwable th22 = th;
            aech.close();
            throw th22;
        }
    }

    public aplj(Context context, String str, int i) {
        super(context, str, str, i);
        this.f84700a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47395a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String str3;
        if (mo47396a()) {
            str3 = "_id INTEGER PRIMARY KEY AUTOINCREMENT, target_package TEXT NOT NULL, target_class TEXT NOT NULL, tag TEXT, runtime INTEGER, flex_time INTEGER, period INTEGER, last_runtime INTEGER, user_id INTEGER, required_network_type INTEGER, requires_charging INTEGER, extras TEXT, retry_strategy TEXT, task_type INTEGER, job_id INTEGER, content_uris TEXT, source INTEGER DEFAULT 0, source_version INTEGER DEFAULT 0, triggered_content_uris TEXT, required_uris TEXT,preferred_network_type INTEGER, preferred_charging_state INTEGER,required_idleness_state INTEGER, preferred_idleness_state INTEGER,service_kind INTEGER, persistence_level INTEGER";
        } else {
            str3 = "_id INTEGER PRIMARY KEY AUTOINCREMENT, target_package TEXT NOT NULL, target_class TEXT NOT NULL, tag TEXT, runtime INTEGER, flex_time INTEGER, period INTEGER, last_runtime INTEGER, user_id INTEGER, required_network_type INTEGER, requires_charging INTEGER, extras TEXT, retry_strategy TEXT, task_type INTEGER, job_id INTEGER, content_uris TEXT, source INTEGER DEFAULT 0, source_version INTEGER DEFAULT 0, triggered_content_uris TEXT, required_uris TEXT,preferred_network_type INTEGER, preferred_charging_state INTEGER,required_idleness_state INTEGER, preferred_idleness_state INTEGER,service_kind INTEGER";
        }
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s (%s);", str, str3));
        m70613b(sQLiteDatabase, str, str2);
    }
}
