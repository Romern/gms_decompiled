package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: alur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alur implements alub {

    /* renamed from: b */
    private static final bnic f74322b = bnic.m109489a("android_metadata");

    /* renamed from: a */
    final Set f74323a;

    /* renamed from: c */
    private final String f74324c;

    /* renamed from: d */
    private final String f74325d;

    public alur(String str, String str2, Collection collection) {
        bnic bnic;
        this.f74325d = str;
        this.f74324c = str2;
        if (collection != null) {
            bnia j = bnic.m109500j();
            j.mo67752b((Iterable) collection);
            j.mo67752b((Iterable) f74322b);
            bnic = j.mo67751a();
        } else {
            bnic = null;
        }
        this.f74323a = bnic;
    }

    /* renamed from: a */
    private static final void m61919a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, Collection collection) {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, new String[0]);
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(0));
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str4 = (String) arrayList.get(i);
            if (!collection.contains(str4)) {
                try {
                    amdk.m62657a("RawDatabaseDebugDataSource", "Dropping %s '%s'", str3, str4);
                    sQLiteDatabase.execSQL(String.format(str2, str4));
                } catch (SQLException e) {
                    Log.e("RawDatabaseDebugDataSource", String.format("Could not drop %s '%s'", str3, str4), e);
                }
            }
        }
        return;
        throw th;
    }

    /* renamed from: a */
    public final String mo40784a() {
        return this.f74324c;
    }

    /* renamed from: b */
    public final void mo40785b() {
    }

    /* renamed from: a */
    public final alua mo40783a(rkb rkb) {
        BufferedOutputStream bufferedOutputStream;
        SQLiteDatabase openDatabase;
        ByteArrayOutputStream byteArrayOutputStream;
        int read;
        try {
            Context context = ((rmx) rkb).f43323c;
            String str = this.f74325d;
            String str2 = str.length() == 0 ? new String("temp_") : "temp_".concat(str);
            File databasePath = context.getDatabasePath(str);
            File databasePath2 = context.getDatabasePath(str2);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(databasePath));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(databasePath2));
                byte[] bArr = new byte[1024];
                while (true) {
                    int read2 = bufferedInputStream.read(bArr);
                    if (read2 <= 0) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read2);
                    bufferedOutputStream.flush();
                }
                bufferedOutputStream.close();
                bufferedInputStream.close();
                try {
                    openDatabase = SQLiteDatabase.openDatabase(databasePath2.getAbsolutePath(), null, 0);
                    m61919a(openDatabase, "SELECT name FROM sqlite_master WHERE type = 'index'", "DROP INDEX %s", "index", bngx.m109376e());
                    m61919a(openDatabase, "SELECT name FROM sqlite_temp_master WHERE type = 'table'", "DROP TABLE %s", "temp table", bngx.m109376e());
                    Set set = this.f74323a;
                    if (set != null) {
                        m61919a(openDatabase, "SELECT name FROM sqlite_master WHERE type = 'table'", "DROP TABLE %s", "table", set);
                    }
                    openDatabase.execSQL("VACUUM");
                    if (openDatabase != null) {
                        openDatabase.close();
                    }
                    try {
                        FileInputStream fileInputStream = new FileInputStream(databasePath2);
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr2 = new byte[1024];
                            do {
                                read = fileInputStream.read(bArr2, 0, 1024);
                                if (read > 0) {
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                            } while (read != -1);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            fileInputStream.close();
                            altw altw = new altw(this.f74324c, byteArray);
                            if (databasePath2 != null) {
                                databasePath2.delete();
                            }
                            return altw;
                        } catch (Throwable th) {
                            fileInputStream.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (Throwable th2) {
                        bqye.m113761a(th, th2);
                    }
                } catch (Throwable th3) {
                    if (databasePath2 != null) {
                        databasePath2.delete();
                    }
                    throw th3;
                }
                throw th;
                throw th;
                throw th;
            } catch (Throwable th4) {
                bufferedInputStream.close();
                throw th4;
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th5) {
            bqye.m113761a(th4, th5);
        }
    }
}
