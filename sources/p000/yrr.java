package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: yrr */
final /* synthetic */ class yrr implements Callable {

    /* renamed from: a */
    private final yrz f54502a;

    /* renamed from: b */
    private final List f54503b;

    public yrr(yrz yrz, List list) {
        this.f54502a = yrz;
        this.f54503b = list;
    }

    public final Object call() {
        yrz yrz = this.f54502a;
        List list = this.f54503b;
        Set a = zdm.m45334a(list);
        bxvd da = cacs.f172612f.mo74144da();
        long currentTimeMillis = System.currentTimeMillis();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cacs cacs = (cacs) da.f164949b;
        int i = cacs.f172614a | 2;
        cacs.f172614a = i;
        cacs.f172616c = currentTimeMillis;
        "me".getClass();
        cacs.f172614a = i | 1;
        cacs.f172615b = "me";
        bxvd da2 = cacm.f172578b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cacm cacm = (cacm) da2.f164949b;
        if (!cacm.f172580a.mo73666a()) {
            cacm.f172580a = GeneratedMessageLite.m124021a(cacm.f172580a);
        }
        bxsy.m123078a(list, cacm.f172580a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cacs cacs2 = (cacs) da.f164949b;
        cacm cacm2 = (cacm) da2.mo74062i();
        cacm2.getClass();
        cacs2.f172617d = cacm2;
        cacs2.f172614a |= 4;
        cacs cacs3 = (cacs) da.mo74062i();
        yrb yrb = yrz.f54519b;
        ClientContext clientContext = yrz.f54520c;
        sgv sgv = yrb.f54472a;
        StringBuilder sb = new StringBuilder();
        String a2 = shd.m35267a(String.valueOf(cacs3.f172615b));
        StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 30);
        sb2.append("/users/");
        sb2.append(a2);
        sb2.append("/syncSessions?alt=proto");
        sb.append(sb2.toString());
        if (!(cacs3 == null || (cacs3.f172614a & 2) == 0)) {
            long j = cacs3.f172616c;
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("&currentTimeMillis=");
            sb3.append(j);
            sb.append(sb3.toString());
        }
        if (!(cacs3 == null || (cacs3.f172614a & 8) == 0)) {
            cack cack = cacs3.f172618e;
            if (cack == null) {
                cack = cack.f172565d;
            }
            if ((cack.f172567a & 1) != 0) {
                cack cack2 = cacs3.f172618e;
                if (cack2 == null) {
                    cack2 = cack.f172565d;
                }
                String valueOf = String.valueOf(shd.m35267a(cack2.f172568b));
                sb.append(valueOf.length() == 0 ? new String("&header.userAgent=") : "&header.userAgent=".concat(valueOf));
            }
        }
        if (!(cacs3 == null || (cacs3.f172614a & 8) == 0)) {
            cack cack3 = cacs3.f172618e;
            if (cack3 == null) {
                cack3 = cack.f172565d;
            }
            if ((cack3.f172567a & 2) != 0) {
                cack cack4 = cacs3.f172618e;
                if (cack4 == null) {
                    cack4 = cack.f172565d;
                }
                String valueOf2 = String.valueOf(shd.m35267a(cack4.f172569c));
                sb.append(valueOf2.length() == 0 ? new String("&header.serverToken=") : "&header.serverToken=".concat(valueOf2));
            }
        }
        String sb4 = sb.toString();
        cacm cacm3 = cacs3.f172617d;
        if (cacm3 == null) {
            cacm3 = cacm.f172578b;
        }
        Set a3 = zdm.m45334a(((cact) sgv.mo25513a(clientContext, 1, sb4, cacm3.serializeToBytes(), cact.f172620b)).f172622a);
        a.removeAll(a3);
        caba caba = (caba) cabb.f172405e.mo74144da();
        caba.mo74606b(a);
        caba.mo74605a(a3);
        return (cabb) caba.mo74062i();
    }
}
