package p000;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: apay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apay {

    /* renamed from: a */
    public static final aoyh f84079a = aoyh.m69805a("ContactsProviderHelper");

    /* renamed from: b */
    public static final boolean f84080b = true;

    /* renamed from: c */
    private final ContentResolver f84081c;

    static {
        int i = apaa.f83970a;
    }

    public apay(ContentResolver contentResolver) {
        this.f84081c = contentResolver;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Pair mo47069a(Resources resources, String str, String str2) {
        long j;
        String[] strArr;
        long j2 = -1;
        if (sfr.f44142a.mo25481a("android.permission.READ_CONTACTS") != 0) {
            return new Pair(new apax(), -1L);
        }
        Uri build = ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").build();
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.f84081c;
            if (f84080b) {
                strArr = new String[]{"_id", "contact_last_updated_timestamp"};
            } else {
                strArr = new String[]{"_id"};
            }
            cursor = contentResolver.query(build, strArr, str, null, str2);
        } catch (SQLiteException e) {
            if (cgjy.m145760g()) {
                f84079a.mo46980a(e, "Caught exception thrown by the ContactsProvider.");
            } else {
                f84079a.mo46984c("Caught exception thrown by the ContactsProvider.", e);
            }
        }
        if (cursor != null) {
            new Object[1][0] = str;
            ArrayList arrayList = new ArrayList();
            try {
                int columnIndex = cursor.getColumnIndex("_id");
                while (cursor.moveToNext()) {
                    long j3 = cursor.getLong(columnIndex);
                    if (f84080b) {
                        int columnIndex2 = cursor.getColumnIndex("contact_last_updated_timestamp");
                        if (columnIndex2 != -1) {
                            j = cursor.getLong(columnIndex2);
                        } else {
                            j = 0;
                        }
                        j2 = Math.max(j2, j);
                    }
                    arrayList.add(Long.valueOf(j3));
                }
                cursor.close();
                new Object[1][0] = Integer.valueOf(arrayList.size());
                Collections.sort(arrayList);
                return new Pair(new apaq(this.f84081c, resources, arrayList), Long.valueOf(j2));
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        } else {
            f84079a.mo46983c("Could not query ContactsProvider; disabled? Wiping local DB.");
            return new Pair(new apax(), -1L);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47070a(long j, Set set) {
        mo47071a(j, set, (String) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* renamed from: a */
    public final void mo47071a(long j, Set set, String str) {
        Cursor cursor;
        if (sfr.f44142a.mo25481a("android.permission.READ_CONTACTS") == 0) {
            sdo.m34971a(f84080b, (Object) "Delta API not supported");
            String[] strArr = {Long.toString(j)};
            try {
                cursor = this.f84081c.query(ContactsContract.DeletedContacts.CONTENT_URI, new String[]{"contact_id", "contact_deleted_timestamp"}, "contact_deleted_timestamp>?", strArr, str);
                if (cursor != null) {
                    try {
                        int columnIndex = cursor.getColumnIndex("contact_id");
                        int columnIndex2 = cursor.getColumnIndex("contact_deleted_timestamp");
                        long j2 = 0;
                        long j3 = j;
                        while (cursor.moveToNext()) {
                            j2++;
                            set.add(Long.valueOf(cursor.getLong(columnIndex)));
                            j3 = Math.max(j3, cursor.getLong(columnIndex2));
                        }
                        Object[] objArr = {Long.valueOf(j2), Long.valueOf(j)};
                        cursor.close();
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } else {
                    f84079a.mo46983c("Could not fetch deleted contacts - no contacts provider present?");
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
