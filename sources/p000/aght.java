package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aght */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aght extends agcu {

    /* renamed from: b */
    private final aghs f65541b = new aghs(this, mo35542z(), mo35418q());

    /* renamed from: c */
    private boolean f65542c;

    public aght(agje agje) {
        super(agje);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c9 A[SYNTHETIC, Splitter:B:49:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011d A[SYNTHETIC] */
    /* renamed from: a */
    public final boolean mo35415a(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        mo35242i();
        mo35241h();
        int i2 = 0;
        if (this.f65542c) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        mo35538v();
        int i3 = 5;
        int i4 = 0;
        int i5 = 5;
        while (i4 < i3) {
            SQLiteDatabase sQLiteDatabase2 = null;
            r8 = null;
            r8 = null;
            r8 = null;
            SQLiteDatabase sQLiteDatabase3 = null;
            Cursor cursor2 = null;
            try {
                sQLiteDatabase = mo35416o();
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.beginTransaction();
                        cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                        long j = 0;
                        j = 0;
                        if (cursor != null) {
                            try {
                                if (cursor.moveToFirst()) {
                                    j = cursor.getLong(i2);
                                }
                            } catch (SQLiteFullException e) {
                                e = e;
                                sQLiteDatabase2 = sQLiteDatabase;
                                try {
                                    mo35497E().f65564c.mo35436a("Error writing entry; local database full", e);
                                    this.f65542c = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase3 == null) {
                                    }
                                    sQLiteDatabase3.close();
                                    i4++;
                                    i2 = 0;
                                    i3 = 5;
                                } catch (Throwable th) {
                                    th = th;
                                    sQLiteDatabase = sQLiteDatabase3;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            } catch (SQLiteDatabaseLockedException e2) {
                                cursor2 = cursor;
                                try {
                                    SystemClock.sleep((long) i5);
                                    i5 += 20;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    i4++;
                                    i2 = 0;
                                    i3 = 5;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                sQLiteDatabase3 = sQLiteDatabase;
                                if (sQLiteDatabase3 != null) {
                                }
                                mo35497E().f65564c.mo35436a("Error writing entry to local database", e);
                                this.f65542c = true;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase3 == null) {
                                }
                                sQLiteDatabase3.close();
                                i4++;
                                i2 = 0;
                                i3 = 5;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        if (j >= 100000) {
                            mo35497E().f65564c.mo35435a("Data loss, local db full");
                            long j2 = (100000 - j) + 1;
                            String[] strArr = new String[1];
                            strArr[i2] = Long.toString(j2);
                            long delete = (long) sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                            if (delete != j2) {
                                mo35497E().f65564c.mo35438a("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                            }
                        }
                        sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        if (cursor != null) {
                            cursor.close();
                        }
                        sQLiteDatabase.close();
                        return true;
                    } catch (SQLiteFullException e4) {
                        e = e4;
                        cursor = null;
                    } catch (SQLiteDatabaseLockedException e5) {
                        SystemClock.sleep((long) i5);
                        i5 += 20;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        i4++;
                        i2 = 0;
                        i3 = 5;
                    } catch (SQLiteException e6) {
                        e = e6;
                        cursor = null;
                        sQLiteDatabase3 = sQLiteDatabase;
                        if (sQLiteDatabase3 != null) {
                        }
                        mo35497E().f65564c.mo35436a("Error writing entry to local database", e);
                        this.f65542c = true;
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase3 == null) {
                        }
                        sQLiteDatabase3.close();
                        i4++;
                        i2 = 0;
                        i3 = 5;
                    } catch (Throwable th4) {
                        th = th4;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                } else {
                    this.f65542c = true;
                    return false;
                }
            } catch (SQLiteFullException e7) {
                e = e7;
                cursor = null;
                mo35497E().f65564c.mo35436a("Error writing entry; local database full", e);
                this.f65542c = true;
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase3 == null) {
                    i4++;
                    i2 = 0;
                    i3 = 5;
                }
                sQLiteDatabase3.close();
                i4++;
                i2 = 0;
                i3 = 5;
            } catch (SQLiteDatabaseLockedException e8) {
                sQLiteDatabase = null;
                SystemClock.sleep((long) i5);
                i5 += 20;
                if (cursor2 != null) {
                    cursor2.close();
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                i4++;
                i2 = 0;
                i3 = 5;
            } catch (SQLiteException e9) {
                e = e9;
                cursor = null;
                if (sQLiteDatabase3 != null) {
                    try {
                        if (sQLiteDatabase3.inTransaction()) {
                            sQLiteDatabase3.endTransaction();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        sQLiteDatabase = sQLiteDatabase3;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                }
                mo35497E().f65564c.mo35436a("Error writing entry to local database", e);
                this.f65542c = true;
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase3 == null) {
                    i4++;
                    i2 = 0;
                    i3 = 5;
                }
                sQLiteDatabase3.close();
                i4++;
                i2 = 0;
                i3 = 5;
            } catch (Throwable th6) {
                th = th6;
                sQLiteDatabase = null;
                if (cursor2 != null) {
                    cursor2.close();
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        mo35497E().f65572k.mo35435a("Failed to write entry to local database");
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo35247n() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final SQLiteDatabase mo35416o() {
        if (this.f65542c) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f65541b.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f65542c = true;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo35417p() {
        return mo35542z().getDatabasePath(mo35418q()).exists();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final String mo35418q() {
        mo35538v();
        return "google_app_measurement_local.db";
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:10:0x0028 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:188:0x0263 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:206:0x0265 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:178:0x0247 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:169:0x0236 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:135:0x01ed */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:55:0x00f7 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v45, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v47, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v49, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v50, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v52, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v53, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v55, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v56, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v57, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v58, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v60, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARN: Type inference failed for: r12v1, assign insn: PHI: (r12v1 ?) = (r12v2 long), (r12v3 long), (r12v4 long), (r12v5 long) binds: [B:207:0x0265, B:206:0x0265, B:205:0x0265, B:204:0x0265] */
    /* JADX WARN: Type inference failed for: r12v8, assign insn: PHI: (r12v8 ?) = (r12v1 ?), (r12v19 ?) binds: [B:10:0x0028, B:135:0x01ed] */
    /* JADX WARN: Type inference failed for: r12v10, assign insn: PHI: (r12v10 ?) = (r12v1 ?), (r12v19 ?) binds: [B:10:0x0028, B:135:0x01ed] */
    /* JADX WARN: Type inference failed for: r12v12, assign insn: PHI: (r12v12 ?) = (r12v1 ?), (r12v19 ?) binds: [B:10:0x0028, B:135:0x01ed] */
    /* JADX WARN: Type inference failed for: r12v14, assign insn: PHI: (r12v14 ?) = (r12v1 ?), (r12v19 ?) binds: [B:10:0x0028, B:135:0x01ed] */
    /* JADX WARN: Type inference failed for: r12v19, assign insn: PHI: (r12v19 ?) = (r12v24 android.database.sqlite.SQLiteDatabase), (r12v55 android.database.sqlite.SQLiteDatabase) binds: [B:128:0x01e1, B:133:0x01ea] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ed A[SYNTHETIC, Splitter:B:135:0x01ed] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x021c A[SYNTHETIC, Splitter:B:161:0x021c] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x01f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0265 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0265 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0265 A[SYNTHETIC] */
    /* renamed from: r */
    public final List mo35419r() {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor2;
        SQLiteDatabase sQLiteDatabase3;
        SQLiteDatabase sQLiteDatabase4;
        SQLiteDatabase sQLiteDatabase5;
        SQLiteDatabase sQLiteDatabase6;
        SQLiteDatabase sQLiteDatabase7;
        SQLiteDatabase sQLiteDatabase8;
        Cursor cursor3;
        SQLiteDatabase sQLiteDatabase9;
        long j;
        String[] strArr;
        String str;
        SQLiteDatabase sQLiteDatabase10;
        SQLiteDatabase sQLiteDatabase11;
        SQLiteDatabase sQLiteDatabase12;
        SQLiteDatabase sQLiteDatabase13;
        SQLiteDatabase sQLiteDatabase14;
        Parcel obtain;
        ConditionalUserPropertyParcel conditionalUserPropertyParcel;
        Parcel obtain2;
        UserAttributeParcel userAttributeParcel;
        Parcel obtain3;
        mo35241h();
        mo35242i();
        if (this.f65542c) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!mo35417p()) {
            return arrayList;
        }
        int i = 5;
        int i2 = 0;
        int i3 = 5;
        while (i2 < i) {
            try {
                SQLiteDatabase o = mo35416o();
                if (o != null) {
                    try {
                        o.beginTransaction();
                        try {
                            SQLiteDatabase sQLiteDatabase15 = o;
                            try {
                                cursor3 = o.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                try {
                                    long j2 = -1;
                                    if (cursor3.moveToFirst()) {
                                        j = cursor3.getLong(0);
                                        if (cursor3 != null) {
                                            try {
                                                cursor3.close();
                                            } catch (SQLiteFullException e) {
                                                e = e;
                                                sQLiteDatabase5 = sQLiteDatabase15;
                                                sQLiteDatabase3 = sQLiteDatabase5;
                                                cursor2 = null;
                                                sQLiteDatabase2 = sQLiteDatabase5;
                                                try {
                                                    mo35497E().f65564c.mo35436a("Error reading entries from local database", e);
                                                    this.f65542c = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i2++;
                                                    i = 5;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cursor = cursor2;
                                                    if (cursor != null) {
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteDatabaseLockedException e2) {
                                                sQLiteDatabase6 = sQLiteDatabase15;
                                                sQLiteDatabase4 = sQLiteDatabase6;
                                                cursor2 = null;
                                                sQLiteDatabase2 = (long) i3;
                                                SystemClock.sleep(sQLiteDatabase2);
                                                i3 += 20;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i2++;
                                                i = 5;
                                            } catch (SQLiteException e3) {
                                                e = e3;
                                                sQLiteDatabase7 = sQLiteDatabase15;
                                                sQLiteDatabase = sQLiteDatabase7;
                                                cursor2 = null;
                                                sQLiteDatabase2 = sQLiteDatabase7;
                                                if (sQLiteDatabase != null) {
                                                }
                                                mo35497E().f65564c.mo35436a("Error reading entries from local database", e);
                                                this.f65542c = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i2++;
                                                i = 5;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                sQLiteDatabase8 = sQLiteDatabase15;
                                                sQLiteDatabase = sQLiteDatabase8;
                                                cursor = null;
                                                if (cursor != null) {
                                                }
                                                if (sQLiteDatabase != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        j = -1;
                                    }
                                    if (j != -1) {
                                        str = "rowid<?";
                                        strArr = new String[]{String.valueOf(j)};
                                    } else {
                                        str = null;
                                        strArr = null;
                                    }
                                    cursor2 = sQLiteDatabase15.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                    while (cursor2.moveToNext()) {
                                        try {
                                            sQLiteDatabase14 = sQLiteDatabase15;
                                            j2 = cursor2.getLong(0);
                                            int i4 = cursor2.getInt(1);
                                            byte[] blob = cursor2.getBlob(2);
                                            if (i4 == 0) {
                                                obtain3 = Parcel.obtain();
                                                try {
                                                    obtain3.unmarshall(blob, 0, blob.length);
                                                    obtain3.setDataPosition(0);
                                                    EventParcel eventParcel = (EventParcel) EventParcel.CREATOR.createFromParcel(obtain3);
                                                    obtain3.recycle();
                                                    if (eventParcel != null) {
                                                        arrayList.add(eventParcel);
                                                    }
                                                } catch (sec e4) {
                                                    mo35497E().f65564c.mo35435a("Failed to load event from local database");
                                                    obtain3.recycle();
                                                }
                                            } else if (i4 == 1) {
                                                obtain2 = Parcel.obtain();
                                                try {
                                                    obtain2.unmarshall(blob, 0, blob.length);
                                                    obtain2.setDataPosition(0);
                                                    userAttributeParcel = (UserAttributeParcel) UserAttributeParcel.CREATOR.createFromParcel(obtain2);
                                                    obtain2.recycle();
                                                } catch (sec e5) {
                                                    mo35497E().f65564c.mo35435a("Failed to load user property from local database");
                                                    obtain2.recycle();
                                                    userAttributeParcel = null;
                                                }
                                                if (userAttributeParcel != null) {
                                                    arrayList.add(userAttributeParcel);
                                                }
                                            } else if (i4 == 2) {
                                                obtain = Parcel.obtain();
                                                try {
                                                    obtain.unmarshall(blob, 0, blob.length);
                                                    obtain.setDataPosition(0);
                                                    conditionalUserPropertyParcel = (ConditionalUserPropertyParcel) ConditionalUserPropertyParcel.CREATOR.createFromParcel(obtain);
                                                    obtain.recycle();
                                                } catch (sec e6) {
                                                    mo35497E().f65564c.mo35435a("Failed to load conditional user property from local database");
                                                    obtain.recycle();
                                                    conditionalUserPropertyParcel = null;
                                                }
                                                if (conditionalUserPropertyParcel != null) {
                                                    arrayList.add(conditionalUserPropertyParcel);
                                                }
                                            } else if (i4 != 3) {
                                                mo35497E().f65564c.mo35435a("Unknown record type in local database");
                                            } else {
                                                mo35497E().f65567f.mo35435a("Skipping app launch break");
                                            }
                                            sQLiteDatabase15 = sQLiteDatabase14;
                                        } catch (SQLiteFullException e7) {
                                            e = e7;
                                            sQLiteDatabase10 = sQLiteDatabase15;
                                            sQLiteDatabase3 = sQLiteDatabase10;
                                            sQLiteDatabase2 = sQLiteDatabase10;
                                            mo35497E().f65564c.mo35436a("Error reading entries from local database", e);
                                            this.f65542c = true;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i2++;
                                            i = 5;
                                        } catch (SQLiteDatabaseLockedException e8) {
                                            sQLiteDatabase11 = sQLiteDatabase15;
                                            sQLiteDatabase4 = sQLiteDatabase11;
                                            sQLiteDatabase2 = (long) i3;
                                            SystemClock.sleep(sQLiteDatabase2);
                                            i3 += 20;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i2++;
                                            i = 5;
                                        } catch (SQLiteException e9) {
                                            e = e9;
                                            sQLiteDatabase12 = sQLiteDatabase15;
                                            sQLiteDatabase = sQLiteDatabase12;
                                            sQLiteDatabase2 = sQLiteDatabase12;
                                            if (sQLiteDatabase != null) {
                                            }
                                            mo35497E().f65564c.mo35436a("Error reading entries from local database", e);
                                            this.f65542c = true;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i2++;
                                            i = 5;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            sQLiteDatabase13 = sQLiteDatabase15;
                                            cursor = cursor2;
                                            sQLiteDatabase = sQLiteDatabase13;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    sQLiteDatabase14 = sQLiteDatabase15;
                                    try {
                                        if (sQLiteDatabase14.delete("messages", "rowid <= ?", new String[]{Long.toString(j2)}) < arrayList.size()) {
                                            mo35497E().f65564c.mo35435a("Fewer entries removed from local database than expected");
                                        }
                                        sQLiteDatabase14.setTransactionSuccessful();
                                        sQLiteDatabase14.endTransaction();
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        sQLiteDatabase14.close();
                                        return arrayList;
                                    } catch (SQLiteFullException e10) {
                                        e = e10;
                                        sQLiteDatabase10 = sQLiteDatabase14;
                                    } catch (SQLiteDatabaseLockedException e11) {
                                        sQLiteDatabase11 = sQLiteDatabase14;
                                        sQLiteDatabase4 = sQLiteDatabase11;
                                        sQLiteDatabase2 = (long) i3;
                                        SystemClock.sleep(sQLiteDatabase2);
                                        i3 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i2++;
                                        i = 5;
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        sQLiteDatabase12 = sQLiteDatabase14;
                                        sQLiteDatabase = sQLiteDatabase12;
                                        sQLiteDatabase2 = sQLiteDatabase12;
                                        if (sQLiteDatabase != null) {
                                        }
                                        mo35497E().f65564c.mo35436a("Error reading entries from local database", e);
                                        this.f65542c = true;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i2++;
                                        i = 5;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        sQLiteDatabase13 = sQLiteDatabase14;
                                        cursor = cursor2;
                                        sQLiteDatabase = sQLiteDatabase13;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLiteDatabase2 = sQLiteDatabase15;
                                    if (cursor3 != null) {
                                        try {
                                            cursor3.close();
                                        } catch (SQLiteFullException e13) {
                                            e = e13;
                                            sQLiteDatabase5 = sQLiteDatabase2;
                                            sQLiteDatabase3 = sQLiteDatabase5;
                                            cursor2 = null;
                                            sQLiteDatabase2 = sQLiteDatabase5;
                                            mo35497E().f65564c.mo35436a("Error reading entries from local database", e);
                                            this.f65542c = true;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i2++;
                                                i = 5;
                                            }
                                            sQLiteDatabase.close();
                                            i2++;
                                            i = 5;
                                        } catch (SQLiteDatabaseLockedException e14) {
                                            sQLiteDatabase6 = sQLiteDatabase2;
                                            sQLiteDatabase4 = sQLiteDatabase6;
                                            cursor2 = null;
                                            sQLiteDatabase2 = (long) i3;
                                            SystemClock.sleep(sQLiteDatabase2);
                                            i3 += 20;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i2++;
                                                i = 5;
                                            }
                                            sQLiteDatabase.close();
                                            i2++;
                                            i = 5;
                                        } catch (SQLiteException e15) {
                                            e = e15;
                                            sQLiteDatabase7 = sQLiteDatabase2;
                                            sQLiteDatabase = sQLiteDatabase7;
                                            cursor2 = null;
                                            sQLiteDatabase2 = sQLiteDatabase7;
                                            if (sQLiteDatabase != null) {
                                                try {
                                                    if (sQLiteDatabase.inTransaction()) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    cursor = cursor2;
                                                    if (cursor != null) {
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            mo35497E().f65564c.mo35436a("Error reading entries from local database", e);
                                            this.f65542c = true;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i2++;
                                                i = 5;
                                            }
                                            sQLiteDatabase.close();
                                            i2++;
                                            i = 5;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            sQLiteDatabase8 = sQLiteDatabase2;
                                            sQLiteDatabase = sQLiteDatabase8;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                sQLiteDatabase9 = sQLiteDatabase15;
                                cursor3 = null;
                                sQLiteDatabase2 = sQLiteDatabase9;
                                if (cursor3 != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            sQLiteDatabase9 = o;
                            cursor3 = null;
                            sQLiteDatabase2 = sQLiteDatabase9;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    } catch (SQLiteFullException e16) {
                        e = e16;
                        sQLiteDatabase5 = o;
                        sQLiteDatabase3 = sQLiteDatabase5;
                        cursor2 = null;
                        sQLiteDatabase2 = sQLiteDatabase5;
                        mo35497E().f65564c.mo35436a("Error reading entries from local database", e);
                        this.f65542c = true;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase == null) {
                        }
                        sQLiteDatabase.close();
                        i2++;
                        i = 5;
                    } catch (SQLiteDatabaseLockedException e17) {
                        sQLiteDatabase6 = o;
                        sQLiteDatabase4 = sQLiteDatabase6;
                        cursor2 = null;
                        sQLiteDatabase2 = (long) i3;
                        SystemClock.sleep(sQLiteDatabase2);
                        i3 += 20;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase == null) {
                        }
                        sQLiteDatabase.close();
                        i2++;
                        i = 5;
                    } catch (SQLiteException e18) {
                        e = e18;
                        sQLiteDatabase7 = o;
                        sQLiteDatabase = sQLiteDatabase7;
                        cursor2 = null;
                        sQLiteDatabase2 = sQLiteDatabase7;
                        if (sQLiteDatabase != null) {
                        }
                        mo35497E().f65564c.mo35436a("Error reading entries from local database", e);
                        this.f65542c = true;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase == null) {
                        }
                        sQLiteDatabase.close();
                        i2++;
                        i = 5;
                    } catch (Throwable th10) {
                        th = th10;
                        sQLiteDatabase8 = o;
                        sQLiteDatabase = sQLiteDatabase8;
                        cursor = null;
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                } else {
                    this.f65542c = true;
                    return null;
                }
            } catch (SQLiteFullException e19) {
                e = e19;
                cursor2 = null;
                sQLiteDatabase3 = null;
                mo35497E().f65564c.mo35436a("Error reading entries from local database", e);
                this.f65542c = true;
                if (cursor2 != null) {
                }
                if (sQLiteDatabase == null) {
                }
                sQLiteDatabase.close();
                i2++;
                i = 5;
            } catch (SQLiteDatabaseLockedException e20) {
                cursor2 = null;
                sQLiteDatabase4 = null;
                sQLiteDatabase2 = (long) i3;
                SystemClock.sleep(sQLiteDatabase2);
                i3 += 20;
                if (cursor2 != null) {
                }
                if (sQLiteDatabase == null) {
                }
                sQLiteDatabase.close();
                i2++;
                i = 5;
            } catch (SQLiteException e21) {
                e = e21;
                cursor2 = null;
                sQLiteDatabase = null;
                if (sQLiteDatabase != null) {
                }
                mo35497E().f65564c.mo35436a("Error reading entries from local database", e);
                this.f65542c = true;
                if (cursor2 != null) {
                }
                if (sQLiteDatabase == null) {
                }
                sQLiteDatabase.close();
                i2++;
                i = 5;
            } catch (Throwable th11) {
                th = th11;
                cursor = null;
                sQLiteDatabase = null;
                if (cursor != null) {
                }
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        }
        mo35497E().f65567f.mo35435a("Failed to read events from database in reasonable time");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[SYNTHETIC, Splitter:B:24:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064 A[Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0065, SQLiteException -> 0x004a, all -> 0x0048, all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0082 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0082 A[SYNTHETIC] */
    /* renamed from: s */
    public final void mo35420s() {
        mo35241h();
        mo35242i();
        if (!this.f65542c && mo35417p()) {
            int i = 0;
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    sQLiteDatabase = mo35416o();
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.beginTransaction();
                            sQLiteDatabase.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            sQLiteDatabase.close();
                            return;
                        } catch (SQLiteFullException e) {
                            e = e;
                        } catch (SQLiteDatabaseLockedException e2) {
                            SystemClock.sleep((long) i2);
                            i2 += 20;
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i++;
                        } catch (SQLiteException e3) {
                            e = e3;
                            if (sQLiteDatabase != null) {
                            }
                            mo35497E().f65564c.mo35436a("Error deleting app launch break from local database", e);
                            this.f65542c = true;
                            if (sQLiteDatabase == null) {
                            }
                        }
                    } else {
                        this.f65542c = true;
                        return;
                    }
                } catch (SQLiteFullException e4) {
                    e = e4;
                    try {
                        mo35497E().f65564c.mo35436a("Error deleting app launch break from local database", e);
                        this.f65542c = true;
                        if (sQLiteDatabase == null) {
                            i++;
                        }
                        sQLiteDatabase.close();
                        i++;
                    } catch (Throwable th) {
                        th = th;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                } catch (SQLiteDatabaseLockedException e5) {
                    SystemClock.sleep((long) i2);
                    i2 += 20;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteException e6) {
                    e = e6;
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    mo35497E().f65564c.mo35436a("Error deleting app launch break from local database", e);
                    this.f65542c = true;
                    if (sQLiteDatabase == null) {
                        sQLiteDatabase.close();
                        i++;
                    } else {
                        i++;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            }
            mo35497E().f65567f.mo35435a("Error deleting app launch break from local database in reasonable time");
        }
    }
}
