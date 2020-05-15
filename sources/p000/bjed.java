package p000;

import android.content.Context;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpClientStack;

/* renamed from: bjed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjed extends HttpClientStack {
    /* JADX WARNING: Illegal instructions before constructor call */
    public bjed(Context context, boolean z) {
        super(r0);
        bjec bjec = new bjec(context, "unused/0");
        if (z) {
            String str = VolleyLog.TAG;
            bjdw bjdw = bjec.f122569a;
            if (str != null) {
                bjdw.f122560b = new bjdv();
                return;
            }
            throw new NullPointerException("name");
        }
    }
}
