package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.RemoteException;
import android.provider.ContactsContract;

/* renamed from: amyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyu {

    /* renamed from: a */
    private static final String[] f76412a = {"_id", "data_sync1", "data_version", "data14", "data_sync4"};

    /* renamed from: a */
    public static Cursor m63741a(Account account, ContentResolver contentResolver, String str) {
        Cursor query = contentResolver.query(amvt.m63471a(ContactsContract.Data.CONTENT_URI, account), f76412a, str, null, null);
        if (query != null) {
            return query;
        }
        throw new amyc(new RemoteException("Unable to get photos."));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amwx.a(java.lang.String, boolean):java.lang.String
     arg types: [java.lang.String, int]
     candidates:
      amwx.a(java.lang.String, java.lang.String):java.lang.String
      amwx.a(java.lang.String, boolean):java.lang.String */
    /* renamed from: a */
    public static void m63742a(Cursor cursor, amvt amvt, amvm amvm, int i) {
        int i2 = 0;
        while (true) {
            try {
                if (cursor.moveToNext()) {
                    if (i2 >= i) {
                        break;
                    }
                    amvm.mo41389a();
                    long j = cursor.getLong(0);
                    String string = cursor.getString(1);
                    String b = amwx.m63592b(string);
                    boolean c = amwx.m63593c(string);
                    Long valueOf = Long.valueOf(cursor.getLong(2));
                    String string2 = cursor.getString(3);
                    Long valueOf2 = Long.valueOf(cursor.getLong(4));
                    if (!c && string2 == null && anau.m63868a(valueOf, valueOf2)) {
                        amvt.mo41450a(amvz.m63510a(j, valueOf.longValue()).withValue("data_sync1", amwx.m63590a(b, true)).withValue("data_sync3", null).withValue("data_sync4", Long.valueOf(valueOf2.longValue() + 1)));
                        amvt.mo41449a();
                        i2++;
                    }
                } else {
                    break;
                }
            } finally {
                cursor.close();
            }
        }
        amvt.mo41451b();
    }
}
