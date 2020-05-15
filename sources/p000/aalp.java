package p000;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: aalp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aalp {
    /* renamed from: a */
    public static List m21471a(Intent intent, List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            Intent intent2 = new Intent(intent);
            intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            arrayList.add(intent2);
        }
        return arrayList;
    }
}
