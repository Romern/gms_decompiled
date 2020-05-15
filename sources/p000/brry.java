package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;

/* renamed from: brry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brry {

    /* renamed from: a */
    public static final brry f143287a = new brry();

    private brry() {
        bngx bngx = brsa.f143288a;
        if (brrw.f143285a == null) {
            brrw.f143285a = new brrw();
        }
    }

    /* renamed from: a */
    public final void mo69824a(Context context) {
        sdo.m34959a(context);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        bnre i = brsa.f143288a.listIterator();
        while (i.hasNext()) {
            edit.remove((String) i.next());
        }
        edit.commit();
    }

    /* renamed from: a */
    public final void mo69825a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f30115i);
        edit.putString("statusMessage", status.f30116j);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }
}
