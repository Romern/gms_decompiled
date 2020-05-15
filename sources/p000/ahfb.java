package p000;

import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import java.util.Locale;

/* renamed from: ahfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahfb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ContinueConnectRequest f67093a;

    /* renamed from: b */
    final /* synthetic */ ahfe f67094b;

    public ahfb(ahfe ahfe, ContinueConnectRequest continueConnectRequest) {
        this.f67094b = ahfe;
        this.f67093a = continueConnectRequest;
    }

    public final void run() {
        ahct b = this.f67094b.mo36391b();
        if (b != null) {
            ContinueConnectRequest continueConnectRequest = this.f67093a;
            String str = continueConnectRequest.f80414b;
            ahdp ahdp = continueConnectRequest.f80415c;
            if (b.mo36321c()) {
                ahcz ahcz = b.f67012d;
                if (!(ahcz.f67029k == null || ahcz.f67038s == null || b.f67013e != 2)) {
                    if (!ahcj.m55468e(str.toLowerCase(Locale.US))) {
                        b.mo36316a(ahdp, 2989);
                        return;
                    }
                    b.f67018j.mo72973a(9, b.f67012d);
                    b.f67012d.mo36340b(str);
                    b.mo36319b(ahdp);
                    return;
                }
            }
            b.mo36316a(ahdp, 2982);
        }
    }
}
