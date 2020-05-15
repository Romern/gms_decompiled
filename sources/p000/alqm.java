package p000;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: alqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alqm {

    /* renamed from: a */
    public static final /* synthetic */ int f74102a = 0;

    /* renamed from: b */
    private final ContentResolver f74103b;

    static {
        int i = alpz.f74048a;
    }

    public alqm(ContentResolver contentResolver) {
        this.f74103b = contentResolver;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Pair mo40653a(Resources resources, String str, String str2) {
        Cursor cursor;
        long j;
        long j2 = -1;
        if (sfr.f44142a.mo25481a("android.permission.READ_CONTACTS") != 0) {
            return new Pair(new alql(), -1L);
        }
        try {
            cursor = this.f74103b.query(ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").build(), new String[]{"_id", "contact_last_updated_timestamp"}, str, null, str2);
        } catch (SQLiteException e) {
            Log.w("ContactsProviderHelper", "Caught exception thrown by the ContactsProvider.", e);
            cursor = null;
        }
        if (cursor == null) {
            Log.w("ContactsProviderHelper", "Could not query ContactsProvider; disabled? Wiping local DB.");
            return new Pair(new alql(), -1L);
        }
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = cursor.getColumnIndex("_id");
            while (cursor.moveToNext()) {
                long j3 = cursor.getLong(columnIndex);
                int columnIndex2 = cursor.getColumnIndex("contact_last_updated_timestamp");
                if (columnIndex2 != -1) {
                    j = cursor.getLong(columnIndex2);
                } else {
                    j = 0;
                }
                j2 = Math.max(j2, j);
                arrayList.add(Long.valueOf(j3));
            }
            cursor.close();
            arrayList.size();
            Collections.sort(arrayList);
            return new Pair(new alqe(this.f74103b, resources, arrayList), Long.valueOf(j2));
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo40654a(long j, Set set) {
        mo40655a(j, set, (String) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* renamed from: a */
    public final void mo40655a(long j, Set set, String str) {
        Cursor cursor;
        if (sfr.f44142a.mo25481a("android.permission.READ_CONTACTS") == 0) {
            sdo.m34971a(true, (Object) "Delta API not supported");
            String[] strArr = {Long.toString(j)};
            try {
                cursor = this.f74103b.query(ContactsContract.DeletedContacts.CONTENT_URI, new String[]{"contact_id", "contact_deleted_timestamp"}, "contact_deleted_timestamp>?", strArr, str);
                if (cursor != null) {
                    try {
                        int columnIndex = cursor.getColumnIndex("contact_id");
                        int columnIndex2 = cursor.getColumnIndex("contact_deleted_timestamp");
                        while (cursor.moveToNext()) {
                            set.add(Long.valueOf(cursor.getLong(columnIndex)));
                            j = Math.max(j, cursor.getLong(columnIndex2));
                        }
                        cursor.close();
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } else {
                    Log.w("ContactsProviderHelper", "Could not fetch deleted contacts - no contacts provider present?");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        }
    }
}
