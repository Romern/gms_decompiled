package p000;

import android.content.Context;
import android.util.Pair;

/* renamed from: zow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zow {

    /* renamed from: a */
    private final Context f55638a;

    public zow(Context context) {
        this.f55638a = context;
    }

    /* renamed from: a */
    public final Pair mo31301a() {
        return Pair.create("server", yua.m44836a(this.f55638a) ? cadt.WIFI_CONNECTIVITY : yua.m44837b(this.f55638a) ? cadt.CELL_CONNECTIVITY : cadt.BT_CONNECTIVITY);
    }

    /* renamed from: a */
    public final zuu mo31302a(String str, String str2) {
        zuu k = yzq.m45107a(this.f55638a).mo30892k(str);
        if (k != null) {
            return k;
        }
        throw new zox(str, str2);
    }
}
