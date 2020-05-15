package p000;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: sqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class sqa extends spz {
    public sqa(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo25964a(String str, int i, AppOpsManager.OnOpChangedListener onOpChangedListener) {
        if (i != 0) {
            this.f44956b.startWatchingMode(str, null, 1, onOpChangedListener);
        } else {
            super.mo25964a(str, 0, onOpChangedListener);
        }
    }

    /* renamed from: e */
    public final int mo25963e(String str, int i, String str2) {
        if (!cdjz.f181084a.mo6606a().mo77783l()) {
            return this.f44956b.unsafeCheckOpNoThrow(str, i, str2);
        }
        return this.f44956b.unsafeCheckOpRawNoThrow(str, i, str2);
    }
}
