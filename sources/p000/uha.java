package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: uha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class uha extends srp {

    /* renamed from: a */
    private static final sbw f47587a = new sbw("DatabaseOpenHelper", "");

    /* renamed from: b */
    private final int f47588b;

    /* renamed from: c */
    private final int f47589c;

    /* renamed from: d */
    private final vpj[] f47590d;

    /* renamed from: e */
    private final String f47591e;

    public uha(Context context, String str, String str2, vpj[] vpjArr, int i, int i2) {
        super(context, str, str2, i);
        this.f47590d = vpjArr;
        this.f47588b = i;
        this.f47589c = i2;
        this.f47591e = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    static final void m38494d(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "type == 'view'", null, null, null, null);
        try {
            query.moveToFirst();
            while (!query.isAfterLast()) {
                String valueOf = String.valueOf(unp.m38991a(query.getString(0)));
                sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP VIEW ") : "DROP VIEW ".concat(valueOf));
                query.moveToNext();
            }
            query.close();
            Cursor query2 = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "type == 'trigger'", null, null, null, null);
            try {
                query2.moveToFirst();
                while (!query2.isAfterLast()) {
                    String valueOf2 = String.valueOf(unp.m38991a(query2.getString(0)));
                    sQLiteDatabase.execSQL(valueOf2.length() == 0 ? new String("DROP TRIGGER ") : "DROP TRIGGER ".concat(valueOf2));
                    query2.moveToNext();
                }
            } finally {
                query2.close();
            }
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27453a() {
    }

    /* renamed from: c */
    public void mo27455c(SQLiteDatabase sQLiteDatabase) {
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            File file = new File(this.f47591e);
            if (!SQLiteDatabase.deleteDatabase(file)) {
                f47587a.mo25375b("Failed to delete database file: %s", file);
            }
            return super.getWritableDatabase();
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        f47587a.mo25368a("DatabaseOpenHelper", "Downgrade requested, resetting database. Old version: %s, new version: %s", Integer.valueOf(i), Integer.valueOf(i2));
        m38495e(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Cursor rawQuery;
        Cursor query;
        int i3;
        int i4;
        Cursor query2;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i5 = i;
        int i6 = i2;
        int i7 = 1;
        f47587a.mo25368a("DatabaseOpenHelper", "Upgrading %s from version %s to %s, databasePath=%s", this.f47591e, Integer.valueOf(i), Integer.valueOf(i2), sQLiteDatabase.getPath());
        sdo.m34975b(i6 == this.f47588b, "Must upgrade to latest database version.");
        if (i5 < this.f47589c) {
            f47587a.mo25372b("DatabaseOpenHelper", "Cannot upgrade database, recreating instead.");
            m38495e(sQLiteDatabase);
            return;
        }
        sQLiteDatabase.beginTransaction();
        try {
            m38494d(sQLiteDatabase);
            mo27454a(sQLiteDatabase2, i6);
            for (int i8 = i5 + 1; i8 < i6; i8++) {
                for (vpj vpj : this.f47590d) {
                    unt unt = (unt) vpj.mo27461b();
                    if (unt.mo27752e(i8)) {
                        int i9 = i8 - 1;
                        String a = unt.mo27752e(i9) ? unt.mo27732a(i9) : null;
                        String a2 = unt.mo27732a(i8);
                        StringBuilder sb = new StringBuilder();
                        sb.append("CREATE VIEW ");
                        sb.append(unp.m38991a(a2));
                        sb.append(" AS ");
                        unt.mo27733a(sb, i8, a);
                        sQLiteDatabase2.execSQL(sb.toString());
                    }
                }
            }
            vpj[] vpjArr = this.f47590d;
            int length = vpjArr.length;
            int i10 = 0;
            while (i10 < length) {
                unt unt2 = (unt) vpjArr[i10].mo27461b();
                if (!unt2.mo27752e(i5)) {
                    i3 = i10;
                    i4 = length;
                } else if (unt2.mo27752e(i6)) {
                    String a3 = unt2.mo27732a(i5);
                    String a4 = unt2.mo27732a(i6);
                    String[] strArr = new String[i7];
                    strArr[0] = "seq";
                    String[] strArr2 = new String[i7];
                    strArr2[0] = a3;
                    String str = "seq";
                    i3 = i10;
                    i4 = length;
                    query2 = sQLiteDatabase.query("sqlite_sequence", strArr, "name = ?", strArr2, null, null, null);
                    if (query2.moveToFirst()) {
                        int columnIndexOrThrow = query2.getColumnIndexOrThrow(str);
                        if (!query2.isNull(columnIndexOrThrow)) {
                            sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO sqlite_sequence (name, seq) VALUES (?,?);", new Object[]{a4, Long.valueOf(query2.getLong(columnIndexOrThrow))});
                            query2.moveToNext();
                            if (!query2.isAfterLast()) {
                                f47587a.mo25374b("DatabaseOpenHelper", "Multiple entries in sqlite_sequence for %s", a3);
                            }
                        }
                    }
                    query2.close();
                } else {
                    i3 = i10;
                    i4 = length;
                }
                i10 = i3 + 1;
                length = i4;
                i7 = 1;
            }
            for (vpj vpj2 : this.f47590d) {
                unt unt3 = (unt) vpj2.mo27461b();
                if (unt3.mo27752e(i6)) {
                    int i11 = i6 - 1;
                    String a5 = unt3.mo27752e(i11) ? unt3.mo27732a(i11) : null;
                    String a6 = unt3.mo27732a(i6);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("INSERT INTO ");
                    sb2.append(unp.m38991a(a6));
                    sb2.append(' ');
                    unt3.mo27733a(sb2, i6, a5);
                    sQLiteDatabase2.execSQL(sb2.toString());
                }
            }
            m38494d(sQLiteDatabase);
            for (vpj vpj3 : this.f47590d) {
                unt unt4 = (unt) vpj3.mo27461b();
                if (unt4.mo27752e(i5)) {
                    String valueOf = String.valueOf(unp.m38991a(unt4.mo27732a(i5)));
                    sQLiteDatabase2.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
                    String[] strArr3 = {"name"};
                    String valueOf2 = String.valueOf(unp.m38990a((Object) String.valueOf(unt4.mo27732a(i5)).concat("%")));
                    query = sQLiteDatabase.query("SQLITE_MASTER", strArr3, valueOf2.length() == 0 ? new String("type == 'index' AND name LIKE ") : "type == 'index' AND name LIKE ".concat(valueOf2), null, null, null, null);
                    query.moveToFirst();
                    while (!query.isAfterLast()) {
                        String valueOf3 = String.valueOf(unp.m38991a(query.getString(0)));
                        sQLiteDatabase2.execSQL(valueOf3.length() == 0 ? new String("DROP INDEX ") : "DROP INDEX ".concat(valueOf3));
                        query.moveToNext();
                    }
                    query.close();
                }
            }
            mo27455c(sQLiteDatabase);
            rawQuery = sQLiteDatabase2.rawQuery("PRAGMA foreign_key_check", null);
            boolean moveToFirst = rawQuery.moveToFirst();
            rawQuery.close();
            if (moveToFirst) {
                f47587a.mo25377c("DatabaseOpenHelper", "Foreign keys constraint not satisfied. Recreating database.");
                m38495e(sQLiteDatabase);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: e */
    private final void m38495e(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type IN ('table', 'index') AND name NOT LIKE 'sqlite_%' ORDER BY 1", null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                try {
                    String valueOf = String.valueOf(rawQuery.getString(0));
                    sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
                } finally {
                    rawQuery.close();
                }
            }
        }
        m38494d(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            mo27454a(sQLiteDatabase, this.f47588b);
            mo27455c(sQLiteDatabase);
            mo27453a();
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: a */
    public final void mo27454a(SQLiteDatabase sQLiteDatabase, int i) {
        vpj[] vpjArr;
        int i2;
        int i3;
        vpj[] vpjArr2;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i4 = i;
        vpj[] vpjArr3 = this.f47590d;
        int length = vpjArr3.length;
        int i5 = 0;
        while (i5 < length) {
            unt unt = (unt) vpjArr3[i5].mo27461b();
            if (unt.mo27752e(i4)) {
                String a = unp.m38991a(unt.mo27732a(i4));
                StringBuilder sb = new StringBuilder("CREATE TABLE ");
                sb.append(a);
                sb.append(" (");
                boolean z = false;
                for (vpj vpj : unt.mo27734a()) {
                    unp unp = (unp) vpj.mo27461b();
                    if (unp.mo27752e(i4)) {
                        if (z) {
                            sb.append(", ");
                        }
                        unx unx = (unx) unp.mo27750c(i4);
                        sb.append(unp.m38991a(unx.f48357a));
                        sb.append(" ");
                        sb.append(unw.m39036a(unx.f48365i));
                        if (unx.f48358b) {
                            sb.append(" PRIMARY KEY");
                            if (unx.f48365i == 1) {
                                sb.append(" AUTOINCREMENT");
                            }
                        }
                        if (unx.f48363g) {
                            sb.append(" NOT NULL");
                        }
                        if (unx.f48362f != null) {
                            sb.append(" DEFAULT ");
                            sb.append(unp.m38990a(unx.f48362f));
                        }
                        z = true;
                    }
                }
                vpj[] a2 = unt.mo27734a();
                int length2 = a2.length;
                int i6 = 0;
                while (i6 < length2) {
                    vpj[] vpjArr4 = vpjArr3;
                    int i7 = length;
                    unp unp2 = (unp) a2[i6].mo27461b();
                    if (unp2.mo27752e(i4)) {
                        unx unx2 = (unx) unp2.mo27750c(i4);
                        if (unx2.f48359c != null) {
                            sb.append(", FOREIGN KEY(");
                            sb.append(unp.m38991a(unx2.f48357a));
                            sb.append(") REFERENCES ");
                            sb.append(unp.m38991a(unx2.f48359c.f48332a.mo27732a(i4)));
                            sb.append("(");
                            sb.append(unp.m38991a(unx2.f48359c.mo27701a(i4)));
                            sb.append(") ON DELETE ");
                            sb.append(unx2.f48364h.f48356c);
                        }
                    }
                    i6++;
                    vpjArr3 = vpjArr4;
                    length = i7;
                }
                sb.append(");");
                sQLiteDatabase2.execSQL(sb.toString());
                vpj[] a3 = unt.mo27734a();
                int length3 = a3.length;
                int i8 = 0;
                while (i8 < length3) {
                    unp unp3 = (unp) a3[i8].mo27461b();
                    if (unp3.mo27752e(i4)) {
                        if (((unx) unp3.mo27750c(i4)).f48360d) {
                            String a4 = unt.mo27732a(i4);
                            vpjArr2 = vpjArr3;
                            String a5 = unp3.mo27701a(i4);
                            i2 = length;
                            vpjArr = a3;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(a4).length() + 3 + String.valueOf(a5).length());
                            sb2.append(a4);
                            sb2.append("_");
                            sb2.append(a5);
                            sb2.append("_i");
                            String a6 = unp.m38991a(sb2.toString());
                            String a7 = unp.m38991a(unp3.mo27701a(i4));
                            i3 = length3;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(a6).length() + 35 + String.valueOf(a).length() + String.valueOf(a7).length());
                            sb3.append("CREATE INDEX IF NOT EXISTS ");
                            sb3.append(a6);
                            sb3.append(" ON ");
                            sb3.append(a);
                            sb3.append(" (");
                            sb3.append(a7);
                            sb3.append(");");
                            sQLiteDatabase2.execSQL(sb3.toString());
                        } else {
                            vpjArr2 = vpjArr3;
                            i2 = length;
                            vpjArr = a3;
                            i3 = length3;
                        }
                        Set<unp> set = ((unx) unp3.mo27750c(i4)).f48361e;
                        if (set != null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(unp3.mo27701a(i4));
                            for (unp unp4 : set) {
                                arrayList.add(unp4.mo27701a(i4));
                            }
                            Collections.sort(arrayList);
                            String a8 = unt.mo27732a(i4);
                            String join = TextUtils.join("_", arrayList);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(a8).length() + 4 + String.valueOf(join).length());
                            sb4.append(a8);
                            sb4.append("_");
                            sb4.append(join);
                            sb4.append("_ui");
                            String a9 = unp.m38991a(sb4.toString());
                            String join2 = TextUtils.join(",", arrayList);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(a9).length() + 42 + String.valueOf(a).length() + String.valueOf(join2).length());
                            sb5.append("CREATE UNIQUE INDEX IF NOT EXISTS ");
                            sb5.append(a9);
                            sb5.append(" ON ");
                            sb5.append(a);
                            sb5.append(" (");
                            sb5.append(join2);
                            sb5.append(");");
                            sQLiteDatabase2.execSQL(sb5.toString());
                        }
                    } else {
                        vpjArr2 = vpjArr3;
                        i2 = length;
                        vpjArr = a3;
                        i3 = length3;
                    }
                    i8++;
                    vpjArr3 = vpjArr2;
                    length3 = i3;
                    length = i2;
                    a3 = vpjArr;
                }
            }
            i5++;
            vpjArr3 = vpjArr3;
            length = length;
        }
    }
}
