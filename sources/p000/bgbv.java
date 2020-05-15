package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bgbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgbv {
    /* renamed from: a */
    public static void m98559a(Intent intent, Context context) {
        m98560a(intent, context, new ArrayList(), -1);
    }

    /* renamed from: a */
    public static void m98560a(Intent intent, Context context, List list, int i) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            bfns bfns = (bfns) list.get(i2);
            if (!(bfns == null || bfns.f114449c == null)) {
                Location a = bgcd.m98578a(new bfnb(bfns, bfns));
                bfoa bfoa = bfns.f114509b;
                if (bfoa != null) {
                    a.setTime(bfoa.mo62009d());
                }
                arrayList.add(a);
            }
        }
        Intent intent2 = new Intent();
        intent2.putParcelableArrayListExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_RESPONSE_PARCELABLE_ARRAY_LIST", arrayList);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_RESPONSE");
        if (pendingIntent != null) {
            try {
                sse.m36201a(pendingIntent, context, i, intent2, (PendingIntent.OnFinished) null);
            } catch (PendingIntent.CanceledException e) {
            }
        }
    }
}
