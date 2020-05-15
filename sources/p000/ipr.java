package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ipr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipr implements eib {

    /* renamed from: b */
    public static final Logger f21528b = new Logger(new String[]{"ClientDataOperation"}, (byte[]) null);

    /* renamed from: a */
    public final Context f21529a;

    public ipr(Context context) {
        this.f21529a = context;
    }

    /* renamed from: a */
    public static Cursor m15845a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2) {
        return sQLiteDatabase.query(true, str, strArr, str2, strArr2, null, null, null, null);
    }

    /* renamed from: b */
    public static String m15850b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("key_") : "key_".concat(valueOf);
    }

    /* renamed from: a */
    private static String m15846a(bsnm bsnm) {
        int a = bsnm.mo3214a();
        StringBuilder sb = new StringBuilder(19);
        sb.append("feature_");
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo13230b(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: a */
    public static void m15847a(ContentValues contentValues, String str) {
        contentValues.put("account", str);
    }

    /* renamed from: a */
    public static void m15848a(ContentValues contentValues, byte[] bArr) {
        contentValues.put("client_metadata", sqd.m35972d(bArr));
    }

    /* renamed from: a */
    public static byte[] m15849a(Cursor cursor) {
        return sqd.m35971c(cursor.getString(cursor.getColumnIndexOrThrow("client_metadata")));
    }

    /* renamed from: a */
    public final List mo13227a(String str) {
        Throwable th;
        sdo.m34977c(str);
        f21528b.mo25412b("Retrieving all featureMetadata", new Object[0]);
        ipp a = ipp.m15839a(this.f21529a);
        Cursor cursor = null;
        try {
            try {
                Cursor a2 = m15845a(a.getReadableDatabase(), "metadata", new String[]{"client_metadata", "identifier"}, "account = ?", new String[]{str});
                if (a2 != null) {
                    try {
                        if (a2.moveToFirst()) {
                            ArrayList arrayList = new ArrayList();
                            while (!a2.isAfterLast()) {
                                if (a2.getString(a2.getColumnIndexOrThrow("identifier")).startsWith("feature_")) {
                                    arrayList.add(m15849a(a2));
                                }
                                a2.moveToNext();
                            }
                            mo13230b(a2);
                            a.close();
                            return arrayList;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = a2;
                        mo13230b(cursor);
                        a.close();
                        throw th;
                    }
                }
                f21528b.mo25416d("No keyMetadata found.", new Object[0]);
                mo13230b(a2);
                a.close();
                return null;
            } catch (Throwable th3) {
                th = th3;
                mo13230b(cursor);
                a.close();
                throw th;
            }
        } catch (SQLiteException e) {
            f21528b.mo25417e("Failed to retrieve featureMetadata", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo13228a(String str, bsnm bsnm, byte[] bArr) {
        long j;
        sdo.m34959a(bsnm);
        sdo.m34977c(str);
        if (bArr == null || bArr.length == 0) {
            f21528b.mo25412b("Null/empty featureMetadata.", new Object[0]);
            return;
        }
        f21528b.mo25412b("Updating featureMetadata", new Object[0]);
        ipp a = ipp.m15839a(this.f21529a);
        try {
            SQLiteDatabase writableDatabase = a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                m15847a(contentValues, str);
                contentValues.put("identifier", m15846a(bsnm));
                m15848a(contentValues, bArr);
                if (!ccfj.m129446b()) {
                    j = writableDatabase.insertWithOnConflict("metadata", null, contentValues, 5);
                } else {
                    j = writableDatabase.insertWithOnConflict("metadata", null, contentValues, 5);
                }
            } catch (SQLiteException e) {
                f21528b.mo25417e("Failed to update feature metadata", e, new Object[0]);
                j = -1;
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                a.close();
                throw th;
            }
            if (j < 0) {
                f21528b.mo25418e("Failed to insert keyMetadata for feature=%s", bsnm.toString());
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            a.close();
        } catch (SQLiteException e2) {
            f21528b.mo25417e("Failed to upload keyMetadata to db", e2, new Object[0]);
        }
    }

    /* renamed from: a */
    public final byte[] mo13229a(String str, bsnm bsnm) {
        Throwable th;
        sdo.m34977c(str);
        sdo.m34959a(bsnm);
        f21528b.mo25412b("Retrieving a featureMetadata", new Object[0]);
        ipp a = ipp.m15839a(this.f21529a);
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = a.getReadableDatabase();
            try {
                Cursor a2 = m15845a(readableDatabase, "metadata", new String[]{"client_metadata", "identifier"}, "account = ? AND identifier = ?", new String[]{str, m15846a(bsnm)});
                if (a2 != null) {
                    try {
                        if (a2.moveToFirst()) {
                            byte[] a3 = m15849a(a2);
                            mo13230b(a2);
                            a.close();
                            return a3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = a2;
                        mo13230b(cursor);
                        a.close();
                        throw th;
                    }
                }
                f21528b.mo25416d("No featureMetadata found.", new Object[0]);
                mo13230b(a2);
                a.close();
                return null;
            } catch (Throwable th3) {
                th = th3;
                mo13230b(cursor);
                a.close();
                throw th;
            }
        } catch (SQLiteException e) {
            f21528b.mo25417e("Failed to retrieve featureMetadata", e, new Object[0]);
            return null;
        }
    }
}
