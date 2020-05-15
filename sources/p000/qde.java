package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: qde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qde {
    /* renamed from: a */
    public static void m31912a(Context context, ContentValues contentValues, ContentResolver contentResolver) {
        aytw.m84814b();
        if (aytw.m84815b(context) && cdci.f180455a.mo6606a().mo77230G()) {
            SharedPreferences a = rtc.m34374a(context);
            SharedPreferences.Editor edit = a.edit();
            String[] a2 = rsv.m34363a();
            for (String str : a2) {
                if (contentValues.containsKey(str)) {
                    String asString = contentValues.getAsString(str);
                    if (asString != null) {
                        edit.putString(str, asString);
                    } else {
                        edit.remove(str);
                    }
                } else {
                    String a3 = aymn.m84265a(contentResolver, str, (String) null);
                    if (a3 != null) {
                        edit.putString(str, a3);
                    }
                }
            }
            if (cdci.f180455a.mo6606a().mo77231H()) {
                HashSet hashSet = new HashSet(Arrays.asList(a2));
                for (String str2 : a.getAll().keySet()) {
                    if (!str2.startsWith("gms:chimera:") && !hashSet.contains(str2)) {
                        edit.remove(str2);
                    }
                }
            }
            if (!edit.commit()) {
                Log.w("CheckinResponseProcess", "Failed to commit gservices values to direct boot cache");
            }
        }
    }

    /* renamed from: a */
    public static Intent[] m31913a(qgv qgv) {
        String str;
        int size = qgv.f41255d.size();
        Intent[] intentArr = new Intent[size];
        for (int i = 0; i < size; i++) {
            qhm qhm = (qhm) qgv.f41255d.get(i);
            Intent intent = new Intent();
            intentArr[i] = intent;
            if ((qhm.f41377a & 1) != 0) {
                intent.setAction(qhm.f41378b);
            }
            if ((qhm.f41377a & 16) != 0) {
                intent.setPackage(qhm.f41382f);
            }
            if ((qhm.f41377a & 2) != 0) {
                intent.setData(Uri.parse(qhm.f41379c));
            }
            if ((qhm.f41377a & 4) != 0) {
                intent.setType(qhm.f41380d);
            }
            bxwc bxwc = qhm.f41381e;
            int size2 = bxwc.size();
            for (int i2 = 0; i2 < size2; i2++) {
                qhl qhl = (qhl) bxwc.get(i2);
                int i3 = qhl.f41371a;
                if ((i3 & 1) != 0) {
                    if ((i3 & 2) != 0) {
                        str = qhl.f41373c;
                    } else {
                        str = "";
                    }
                    intent.putExtra(qhl.f41372b, str);
                }
            }
        }
        return intentArr;
    }
}
