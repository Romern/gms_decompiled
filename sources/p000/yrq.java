package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;

/* renamed from: yrq */
final /* synthetic */ class yrq implements Callable {

    /* renamed from: a */
    private final yrz f54499a;

    /* renamed from: b */
    private final cadw f54500b;

    /* renamed from: c */
    private final caae f54501c;

    public yrq(yrz yrz, cadw cadw, caae caae) {
        this.f54499a = yrz;
        this.f54500b = cadw;
        this.f54501c = caae;
    }

    public final Object call() {
        yrz yrz = this.f54499a;
        cadw cadw = this.f54500b;
        caae caae = this.f54501c;
        yrc yrc = yrz.f54518a;
        ClientContext clientContext = yrz.f54520c;
        sgv sgv = yrc.f54473a;
        StringBuilder sb = new StringBuilder();
        String a = shd.m35267a(String.valueOf(cadw.f172751b));
        String a2 = shd.m35267a(String.valueOf(cadw.f172752c));
        String a3 = shd.m35267a(String.valueOf(cadw.f172753d));
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 40 + String.valueOf(a2).length() + String.valueOf(a3).length());
        sb2.append("/users/");
        sb2.append(a);
        sb2.append("/dataSources/");
        sb2.append(a2);
        sb2.append("/datasets/");
        sb2.append(a3);
        sb2.append("?alt=proto");
        sb.append(sb2.toString());
        if (!(cadw == null || (cadw.f172750a & 8) == 0)) {
            String valueOf = String.valueOf(shd.m35267a(cadw.f172754e));
            sb.append(valueOf.length() == 0 ? new String("&pageToken=") : "&pageToken=".concat(valueOf));
        }
        if (!(cadw == null || (cadw.f172750a & 16) == 0)) {
            int i = cadw.f172755f;
            StringBuilder sb3 = new StringBuilder(18);
            sb3.append("&limit=");
            sb3.append(i);
            sb.append(sb3.toString());
        }
        return yrm.m44667a(((cadv) sgv.mo25513a(clientContext, 0, sb.toString(), (byte[]) null, cadv.f172745b)).f172747a, caae, yrz.f54522e);
    }
}
