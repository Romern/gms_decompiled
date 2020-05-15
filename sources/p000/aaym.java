package p000;

import android.util.Log;
import java.io.IOException;

/* renamed from: aaym */
final /* synthetic */ class aaym implements bmxz {

    /* renamed from: a */
    private final aayq f56825a;

    public aaym(aayq aayq) {
        this.f56825a = aayq;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        aayq aayq = this.f56825a;
        Throwable th = (Throwable) obj;
        if ((th instanceof aayn) && aayq.f56832e != null) {
            try {
                gie.m13196b(aayq.f56830c, aayq.f56837j);
            } catch (gid | IOException e) {
                String valueOf = String.valueOf(aayq.f56832e.name);
                Log.e("gH_CronetBaseRequest", valueOf.length() == 0 ? new String("Clearing auth token failed for ") : "Clearing auth token failed for ".concat(valueOf), e);
            }
        }
        return !(th instanceof aayp);
    }
}
