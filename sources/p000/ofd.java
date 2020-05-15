package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: ofd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ofd {
    /* renamed from: a */
    public static Intent m28609a(String str, int i, long j) {
        Intent intent = new Intent(str);
        intent.putExtra("stage_state", i);
        intent.putExtra("event_time_since_boot", j);
        return intent;
    }

    /* renamed from: a */
    public static Enum m28610a(Intent intent, Enum[] enumArr) {
        bmxy.m108581a(intent);
        bmxy.m108581a(enumArr);
        int intExtra = intent.getIntExtra("stage_state", -1);
        if (intExtra == -1) {
            throw new oex("missing the stage_state extra");
        } else if (intExtra >= 0 && intExtra < enumArr.length) {
            return enumArr[intExtra];
        } else {
            throw new oex(String.format("out of bounds %s extra: %d", "stage_state", Integer.valueOf(intExtra)));
        }
    }

    /* renamed from: a */
    public static void m28611a(Context context, String str, Enum enumR) {
        m28612a(context, str, enumR, null);
    }

    /* renamed from: a */
    public static void m28612a(Context context, String str, Enum enumR, Bundle bundle) {
        bmxy.m108581a(enumR);
        if (ccql.m131267b()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Intent a = m28609a(str, enumR.ordinal(), elapsedRealtime);
            a.setPackage("com.google.android.projection.gearhead");
            Intent a2 = m28609a(str, enumR.ordinal(), elapsedRealtime);
            if (bundle != null) {
                a.putExtras(bundle);
                a2.putExtras(bundle);
            }
            context.sendBroadcast(a);
            aki.m919a(context).mo874a(a2);
        }
    }
}
