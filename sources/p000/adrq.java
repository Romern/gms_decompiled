package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: adrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adrq {

    /* renamed from: a */
    private final adnr f62586a;

    public adrq(ContentResolver contentResolver, adnq adnq) {
        this.f62586a = new adnr(contentResolver, adnq);
    }

    /* renamed from: a */
    public final Cursor mo33749a(adrp adrp) {
        String str;
        String str2;
        String str3;
        String[] strArr;
        String str4;
        String str5;
        String str6;
        if (adrp.f62585g == 0 || adrp.f62581c == null || adrp.f62582d == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = adrp.f62585g;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                Long l = adrp.f62579a;
                if (l == null || l.longValue() <= 0) {
                    str4 = null;
                } else {
                    arrayList.add(String.valueOf(adrp.f62579a));
                    str4 = "_id>?";
                }
                str = "_id DESC";
            } else if (i2 == 1) {
                Long l2 = adrp.f62579a;
                if (l2 == null || l2.longValue() <= 0) {
                    str5 = null;
                } else {
                    arrayList.add(String.valueOf(adrp.f62579a));
                    str5 = "date_modified>?";
                }
                str = "date_modified DESC";
            } else if (i2 == 2) {
                Long l3 = adrp.f62579a;
                if (l3 == null || adrp.f62580b == null || l3.longValue() > adrp.f62580b.longValue()) {
                    str6 = null;
                } else {
                    arrayList.add(String.valueOf(adrp.f62579a));
                    arrayList.add(String.valueOf(adrp.f62580b));
                    str6 = "_id>? AND _id<=?";
                }
                str = "_id DESC";
            } else if (i2 != 3) {
                return null;
            } else {
                Long l4 = adrp.f62579a;
                if (l4 == null || adrp.f62580b == null || l4.longValue() > adrp.f62580b.longValue()) {
                    str2 = null;
                } else {
                    arrayList.add(String.valueOf(adrp.f62579a));
                    arrayList.add(String.valueOf(adrp.f62580b));
                    str2 = "date_modified>? AND date_modified<=?";
                }
                str = "date_modified DESC";
            }
            Integer num = adrp.f62583e;
            if (TextUtils.isEmpty(adrp.f62584f)) {
                str3 = str2;
            } else if (str2 != null) {
                String valueOf = String.valueOf(str2);
                String str7 = adrp.f62584f;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 5 + String.valueOf(str7).length());
                sb.append(valueOf);
                sb.append(" AND ");
                sb.append(str7);
                str3 = sb.toString();
            } else {
                str3 = adrp.f62584f;
            }
            Uri uri = adrp.f62581c;
            String[] strArr2 = adrp.f62582d;
            if (str3 != null) {
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } else {
                strArr = null;
            }
            Cursor a = this.f62586a.mo33689a(uri, strArr2, str3, strArr, str);
            if (a == null) {
                adnt.m50869a("MediastoreClient", "MediaStore query returned null cursor");
            }
            return a;
        }
        throw null;
    }
}
