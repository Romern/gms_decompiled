package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: dxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxm extends dwm {

    /* renamed from: a */
    public final SharedPreferences f14362a;

    public dxm(Context context) {
        this.f14362a = context.getSharedPreferences("CONTEXT_MANAGER", 0);
    }

    /* renamed from: a */
    public final void mo9831a(int i, long j) {
        this.f14362a.edit().putLong(efd.m10294a(i), j).apply();
    }
}
