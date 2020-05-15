package p000;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: alwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alwm implements Runnable {

    /* renamed from: a */
    private final alwi f74471a;

    /* renamed from: b */
    private final Context f74472b;

    /* renamed from: c */
    private final String f74473c;

    /* renamed from: d */
    private final Set f74474d;

    public alwm(alwi alwi, Context context, String str, Set set) {
        this.f74471a = alwi;
        this.f74472b = context;
        this.f74473c = str;
        this.f74474d = set;
    }

    public final void run() {
        Cursor query;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            HashSet hashSet = new HashSet();
            for (String str2 : this.f74474d) {
                if (ancm.m64020i(str2)) {
                    hashSet.addAll(alwo.m61996a(this.f74472b, ancm.m64018g(str2)));
                } else if (ancm.m64021j(str2)) {
                    ancm.m64016e(str2);
                    hashSet.addAll(Collections.emptySet());
                } else if (alwy.m62042e(str2)) {
                    hashSet.addAll(alwo.m61998b(this.f74472b, alwy.m62045h(str2)));
                } else if (alwy.m62041d(str2)) {
                    hashSet.addAll(alwo.m61997a(this.f74472b, this.f74473c, alwy.m62043f(str2)));
                } else if (alwy.m62038a(str2)) {
                    hashSet.addAll(alwy.m62040c(alwy.m62039b(str2)));
                } else {
                    if (!ancm.m64022k(str2)) {
                        str = "Invalid qualified ID";
                    } else {
                        str = "Unknown qualified ID type";
                    }
                    Log.w("ContactsDataLoader", str);
                }
            }
            query = this.f74472b.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, alwl.f74470a, null, null, null);
            query.move(-1);
            while (query.moveToNext()) {
                int i = 0;
                if (!hashSet.contains(query.getString(0))) {
                    String[] strArr = new String[alwl.f74470a.length];
                    int i2 = 0;
                    while (i2 < alwl.f74470a.length) {
                        strArr[i2] = query.getString(i2);
                        i2++;
                        i = 0;
                    }
                    arrayList.add(new alvq(new alwa(query.getString(i), null, null, 0, strArr, true, true, null)));
                }
            }
            query.close();
            this.f74471a.mo40833a(Status.f30107a, (alvq[]) arrayList.toArray(new alvq[arrayList.size()]));
        } catch (SecurityException e) {
            try {
                Log.e("ContactsDataLoader", "Error querying contact data:", e);
            } finally {
                this.f74471a.mo40833a(Status.f30107a, (alvq[]) arrayList.toArray(new alvq[arrayList.size()]));
            }
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
