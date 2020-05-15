package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;

/* renamed from: yru */
final /* synthetic */ class yru implements Callable {

    /* renamed from: a */
    private final yrz f54508a;

    /* renamed from: b */
    private final bxvd f54509b;

    public yru(yrz yrz, bxvd bxvd) {
        this.f54508a = yrz;
        this.f54509b = bxvd;
    }

    public final Object call() {
        yrz yrz = this.f54508a;
        bxvd bxvd = this.f54509b;
        yrb yrb = yrz.f54519b;
        ClientContext clientContext = yrz.f54520c;
        cacq cacq = (cacq) bxvd.mo74062i();
        sgv sgv = yrb.f54472a;
        StringBuilder sb = new StringBuilder();
        String a = shd.m35267a(String.valueOf(cacq.f172598b));
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 33);
        sb2.append("/users/");
        sb2.append(a);
        sb2.append("/syncDataSources?alt=proto");
        sb.append(sb2.toString());
        if (!(cacq == null || (cacq.f172597a & 2) == 0)) {
            long j = cacq.f172599c;
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("&currentTimeMillis=");
            sb3.append(j);
            sb.append(sb3.toString());
        }
        if (!(cacq == null || (cacq.f172597a & 8) == 0)) {
            long j2 = cacq.f172601e;
            StringBuilder sb4 = new StringBuilder(40);
            sb4.append("&lastSyncTimeMillis=");
            sb4.append(j2);
            sb.append(sb4.toString());
        }
        if (!(cacq == null || (cacq.f172597a & 16) == 0)) {
            String valueOf = String.valueOf(shd.m35267a(cacq.f172602f));
            sb.append(valueOf.length() == 0 ? new String("&pageToken=") : "&pageToken=".concat(valueOf));
        }
        if (!(cacq == null || (cacq.f172597a & 32) == 0)) {
            cack cack = cacq.f172603g;
            if (cack == null) {
                cack = cack.f172565d;
            }
            if ((cack.f172567a & 1) != 0) {
                cack cack2 = cacq.f172603g;
                if (cack2 == null) {
                    cack2 = cack.f172565d;
                }
                String valueOf2 = String.valueOf(shd.m35267a(cack2.f172568b));
                sb.append(valueOf2.length() == 0 ? new String("&header.userAgent=") : "&header.userAgent=".concat(valueOf2));
            }
        }
        if (!(cacq == null || (cacq.f172597a & 32) == 0)) {
            cack cack3 = cacq.f172603g;
            if (cack3 == null) {
                cack3 = cack.f172565d;
            }
            if ((cack3.f172567a & 2) != 0) {
                cack cack4 = cacq.f172603g;
                if (cack4 == null) {
                    cack4 = cack.f172565d;
                }
                String valueOf3 = String.valueOf(shd.m35267a(cack4.f172569c));
                sb.append(valueOf3.length() == 0 ? new String("&header.serverToken=") : "&header.serverToken=".concat(valueOf3));
            }
        }
        String sb5 = sb.toString();
        cabq cabq = cacq.f172600d;
        if (cabq == null) {
            cabq = cabq.f172465b;
        }
        cacr cacr = (cacr) sgv.mo25513a(clientContext, 1, sb5, cabq.mo73642k(), cacr.f172605f);
        if (cacr.f172610d.size() <= 0) {
            return yrf.m44653a(cacr);
        }
        throw new zuv();
    }
}
