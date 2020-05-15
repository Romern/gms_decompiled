package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: aitc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aitc {

    /* renamed from: a */
    public final ClientContext f69674a;

    /* renamed from: b */
    public final aitk f69675b;

    /* renamed from: c */
    public final aiti f69676c;

    /* renamed from: d */
    public final aitl f69677d;

    /* renamed from: e */
    public final aitj f69678e;

    public aitc(Context context) {
        ClientContext clientContext = new ClientContext();
        this.f69674a = clientContext;
        clientContext.f30216f = "com.google.android.gms";
        shl shl = new shl(context, "instantmessaging-pa.googleapis.com", 443, context.getApplicationInfo().uid, 9732);
        shl.f44482d = false;
        shl.mo25556a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        shl.mo25556a("X-Android-Package", context.getPackageName());
        shl.mo25556a("X-Android-Cert", spn.m35895h(context, context.getPackageName()));
        String valueOf = String.valueOf(Integer.toString(1));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("grpc-Nearby/");
        sb.append(valueOf);
        sb.append("/1");
        shl.mo25556a("User-Agent", sb.toString());
        String valueOf2 = String.valueOf(context.getPackageName());
        String str = valueOf2.length() == 0 ? new String("android-app://") : "android-app://".concat(valueOf2);
        shl.mo25556a("Sec-X-Google-Grpc", "1");
        shl.mo25556a("Origin", str);
        this.f69675b = new aitk(shl);
        this.f69676c = new aiti(shl);
        this.f69677d = new aitl(shl);
        this.f69678e = new aitj(shl);
    }
}
