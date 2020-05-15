package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arfz f87626a;

    public arfy(arfz arfz) {
        this.f87626a = arfz;
    }

    public final void run() {
        arfz arfz = this.f87626a;
        argg argg = arfz.f87627a;
        arjf arjf = arfz.f87628b;
        argg.f87654a.mo48666c(2);
        arml.m73129a(argg.f87654a, 14);
        arfh arfh = argg.f87655b;
        String str = null;
        if (arfh.f87591i && arfh.f87589g != null) {
            Status status = new Status(8);
            try {
                String str2 = ((arfd) arfh.f87589g).f87566j;
                if (str2 != null) {
                    str = str2;
                } else {
                    arfd.f87557a.logVerbose("Token is null. Returning dummy token: 12345", new Object[0]);
                    str = "12345";
                }
                try {
                    arfh.m72642a(arjf, Status.f30107a, str);
                } catch (Throwable th) {
                    th = th;
                    arfh.m72642a(arjf, status, str);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                arfh.m72642a(arjf, status, str);
                throw th;
            }
        } else {
            arfh.m72642a(arjf, new Status(10552), null);
        }
    }
}
