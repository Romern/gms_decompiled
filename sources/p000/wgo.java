package p000;

import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: wgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgo {

    /* renamed from: a */
    private static wgo f50626a = null;

    /* renamed from: a */
    public static final ClientContext m41927a(String str) {
        ClientContext clientContext = new ClientContext(Process.myUid(), str, str, "com.google.android.gms", "com.google.android.gms");
        clientContext.mo17806d(cdsw.f181668a.mo6606a().mo78276n());
        return clientContext;
    }

    /* renamed from: b */
    public static void m41929b() {
        if (f50626a == null) {
            f50626a = new wgo();
        }
    }

    /* renamed from: a */
    public static final wgf m41928a() {
        return new wgf(new sgv(rpr.m34216b(), cdsw.f181668a.mo6606a().mo78278p(), cdsw.f181668a.mo6606a().mo78277o(), cdsw.f181668a.mo6606a().mo78272j(), cdsw.f181668a.mo6606a().mo78273k(), cdsw.f181668a.mo6606a().mo78271i(), cdsw.f181668a.mo6606a().mo78275m()));
    }
}
