package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/* renamed from: foi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class foi {
    /* renamed from: a */
    public static List m12084a(Bundle bundle) {
        vzr vzr;
        IBinder a = C1004fv.m12454a(bundle, "settingsListKey");
        if (a == null || !a.pingBinder()) {
            return null;
        }
        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof vzr) {
            vzr = (vzr) queryLocalInterface;
        } else {
            vzr = new vzp(a);
        }
        return (List) vzs.m41641a(vzr);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.os.IBinder, vzr], assign insn: 0x0000: INVOKE  (r2v1 ? I:vzr) = (r2v0 java.util.List) type: STATIC call: vzs.a(java.lang.Object):vzr */
    /* renamed from: a */
    public static void m12085a(Bundle bundle, List list) {
        C1004fv.m12455a(bundle, "settingsListKey", vzs.m41642a(list));
    }
}
