package p000;

import android.content.Context;
import android.net.Uri;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.Executors;

/* renamed from: belz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class belz {

    /* renamed from: a */
    private static final Object f111808a = new Object();

    /* renamed from: b */
    private static volatile belz f111809b;

    /* renamed from: c */
    private final bely f111810c;

    private belz(bely bely) {
        this.f111810c = bely;
    }

    /* renamed from: a */
    public static bely m95285a(Context context) {
        if (f111809b == null) {
            synchronized (f111808a) {
                if (f111809b == null) {
                    bejv bejv = new bejv();
                    bejv.mo60768a(beku.f111735a);
                    bejv.f111686b = new befa(Arrays.asList(new befu()));
                    bejv.f111685a = Executors.newSingleThreadExecutor();
                    beju a = bejv.mo60766a();
                    befq a2 = befr.m94979a();
                    a2.mo60671a(context.getFilesDir());
                    a2.mo60672a("mobstore_salt.pb");
                    Uri a3 = a2.mo60670a();
                    bejq g = bejr.m95186g();
                    g.mo60764a(byeh.f165904c);
                    g.mo60762a(a3);
                    belw belw = new belw(new SecureRandom());
                    if (g.f111669a == null) {
                        g.f111669a = bngx.m109377j();
                    }
                    g.f111669a.mo67668c(belw);
                    f111809b = new belz(new bely(a.mo60765a(g.mo60761a())));
                }
            }
        }
        return f111809b.f111810c;
    }
}
