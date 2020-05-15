package p000;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: aqbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f85598a;

    /* renamed from: b */
    final /* synthetic */ aqbr f85599b;

    public aqbq(aqbr aqbr, List list) {
        this.f85599b = aqbr;
        this.f85598a = list;
    }

    public final void run() {
        if (this.f85599b.f85600a.compareAndSet(true, false)) {
            try {
                apyk apyk = this.f85599b.f85601b;
                List<String> list = this.f85598a;
                StringBuilder sb = new StringBuilder();
                for (String str : list) {
                    sb.append(Base64.encodeToString(str.getBytes(Charset.forName("UTF-8")), 0));
                    sb.append(";");
                }
                apyk.mo47702a("snet_safe_browsing_cookies", sb.toString());
            } finally {
                this.f85599b.f85600a.set(true);
            }
        }
    }
}
