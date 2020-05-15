package p000;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: xtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xtu {

    /* renamed from: g */
    public static final sek f53088g = new sek(new String[]{"CtapAuthenticatorRequestHandler"}, (short[]) null);

    /* renamed from: a */
    public final Context f53089a;

    /* renamed from: b */
    public final xwj f53090b;

    /* renamed from: c */
    public final xdx f53091c;

    /* renamed from: d */
    public final ExecutorService f53092d;

    /* renamed from: e */
    public final xwn f53093e;

    /* renamed from: f */
    public int f53094f = 1;

    public xtu(Context context, xwj xwj, xdx xdx, ExecutorService executorService, xwn xwn) {
        sdo.m34959a(context);
        this.f53089a = context;
        this.f53090b = xwj;
        sdo.m34959a(xdx);
        this.f53091c = xdx;
        sdo.m34959a(executorService);
        this.f53092d = executorService;
        sdo.m34959a(xwn);
        this.f53093e = xwn;
    }

    /* renamed from: a */
    public final bqgg mo30129a(xkj xkj) {
        this.f53093e.mo30185a(this.f53090b, new IllegalArgumentException(String.format("Malformed command received, CTAP error: %02X", Byte.valueOf(xkj.f52553Z))), 53);
        xkg xkg = new xkg(xkj, null);
        this.f53093e.mo30196a(this.f53090b, xkg);
        return bqga.m112775a(xkg);
    }
}
