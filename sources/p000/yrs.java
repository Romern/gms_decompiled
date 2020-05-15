package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;

/* renamed from: yrs */
final /* synthetic */ class yrs implements Callable {

    /* renamed from: a */
    private final yrz f54504a;

    /* renamed from: b */
    private final bxvd f54505b;

    public yrs(yrz yrz, bxvd bxvd) {
        this.f54504a = yrz;
        this.f54505b = bxvd;
    }

    public final Object call() {
        yrz yrz = this.f54504a;
        bxvd bxvd = this.f54505b;
        yrc yrc = yrz.f54518a;
        ClientContext clientContext = yrz.f54520c;
        cadx cadx = (cadx) bxvd.mo74062i();
        sgv sgv = yrc.f54473a;
        StringBuilder sb = new StringBuilder();
        String a = shd.m35267a(String.valueOf(cadx.f172760b));
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 26);
        sb2.append("/users/");
        sb2.append(a);
        sb2.append("/sessions?alt=proto");
        sb.append(sb2.toString());
        if (!(cadx == null || (cadx.f172759a & 2) == 0)) {
            String valueOf = String.valueOf(shd.m35267a(cadx.f172761c));
            sb.append(valueOf.length() == 0 ? new String("&startTime=") : "&startTime=".concat(valueOf));
        }
        if (!(cadx == null || (cadx.f172759a & 4) == 0)) {
            String valueOf2 = String.valueOf(shd.m35267a(cadx.f172762d));
            sb.append(valueOf2.length() == 0 ? new String("&endTime=") : "&endTime=".concat(valueOf2));
        }
        if (!(cadx == null || (cadx.f172759a & 8) == 0)) {
            boolean z = cadx.f172763e;
            StringBuilder sb3 = new StringBuilder(21);
            sb3.append("&includeDeleted=");
            sb3.append(z);
            sb.append(sb3.toString());
        }
        if (!(cadx == null || (cadx.f172759a & 16) == 0)) {
            String valueOf3 = String.valueOf(shd.m35267a(cadx.f172764f));
            sb.append(valueOf3.length() == 0 ? new String("&pageToken=") : "&pageToken=".concat(valueOf3));
        }
        if (cadx != null) {
            bxvt bxvt = cadx.f172765g;
            int size = bxvt.size();
            for (int i = 0; i < size; i++) {
                int intValue = ((Integer) bxvt.get(i)).intValue();
                StringBuilder sb4 = new StringBuilder(25);
                sb4.append("&activityType=");
                sb4.append(intValue);
                sb.append(sb4.toString());
            }
        }
        return yrg.m44656a((cady) sgv.mo25513a(clientContext, 0, sb.toString(), (byte[]) null, cady.f172767e));
    }
}
