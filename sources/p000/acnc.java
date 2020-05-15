package p000;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: acnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acnc {

    /* renamed from: a */
    public final acne f60228a;

    public acnc(abym abym, ContentResolver contentResolver) {
        this.f60228a = new acne(abym, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* renamed from: a */
    public static int m49492a(acne acne, Uri uri) {
        Throwable th;
        Cursor cursor;
        try {
            cursor = acne.mo32907a(uri, new String[]{"_id"}, null, null, null);
            if (cursor == null) {
                return 0;
            }
            try {
                int count = cursor.getCount();
                cursor.close();
                return count;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Pair mo32904a(Resources resources, String str) {
        long j;
        Uri build = ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").build();
        acne acne = this.f60228a;
        int i = acmn.f60160a;
        Cursor a = acne.mo32907a(build, new String[]{"_id", "contact_last_updated_timestamp"}, str, null, null);
        long j2 = -1;
        if (a == null) {
            acnv.m49556e("Could not query ContactsProvider; disabled? Wiping local DB.");
            return new Pair(new acna(), -1L);
        }
        if (str == null) {
            str = "<null>";
        }
        acnv.m49542a("getWantedContacts with selection=%s", str);
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = a.getColumnIndex("_id");
            while (a.moveToNext()) {
                long j3 = a.getLong(columnIndex);
                int columnIndex2 = a.getColumnIndex("contact_last_updated_timestamp");
                if (columnIndex2 != -1) {
                    j = a.getLong(columnIndex2);
                } else {
                    j = 0;
                }
                j2 = Math.max(j2, j);
                arrayList.add(Long.valueOf(j3));
            }
            a.close();
            acnv.m49542a("%d matching contacts", Integer.valueOf(arrayList.size()));
            Collections.sort(arrayList);
            return new Pair(new acmt(this.f60228a.f60229a, resources, arrayList), Long.valueOf(j2));
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
