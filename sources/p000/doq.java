package p000;

import android.content.Context;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: doq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class doq {

    /* renamed from: a */
    public final spx f13719a;

    public doq(Context context) {
        this.f13719a = spx.m35925a(context);
    }

    /* renamed from: a */
    public final int mo9355a(int i, ContextManagerClientInfo contextManagerClientInfo) {
        int i2 = 0;
        for (String str : doi.m8937a(i, true)) {
            i2 = this.f13719a.mo25960c(str, contextManagerClientInfo.f30679c, contextManagerClientInfo.f30678b);
            if (i2 != 0) {
                break;
            }
        }
        return i2;
    }
}
