package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;

/* renamed from: yro */
final /* synthetic */ class yro implements Callable {

    /* renamed from: a */
    private final yrz f54494a;

    /* renamed from: b */
    private final caae f54495b;

    /* renamed from: c */
    private final bxvd f54496c;

    public yro(yrz yrz, bxvd bxvd, caae caae) {
        this.f54494a = yrz;
        this.f54496c = bxvd;
        this.f54495b = caae;
    }

    public final Object call() {
        yrz yrz = this.f54494a;
        bxvd bxvd = this.f54496c;
        caae caae = this.f54495b;
        yrb yrb = yrz.f54519b;
        ClientContext clientContext = yrz.f54520c;
        cacd cacd = (cacd) bxvd.mo74062i();
        sgv sgv = yrb.f54472a;
        StringBuilder sb = new StringBuilder();
        String a = shd.m35267a(String.valueOf(cacd.f172519b));
        String a2 = shd.m35267a(String.valueOf(cacd.f172520c));
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 47 + String.valueOf(a2).length());
        sb2.append("/users/");
        sb2.append(a);
        sb2.append("/dataSources/");
        sb2.append(a2);
        sb2.append("/dataPointChanges?alt=proto");
        sb.append(sb2.toString());
        if (!(cacd == null || (cacd.f172518a & 4) == 0)) {
            String valueOf = String.valueOf(shd.m35267a(cacd.f172521d));
            sb.append(valueOf.length() == 0 ? new String("&pageToken=") : "&pageToken=".concat(valueOf));
        }
        if (!(cacd == null || (cacd.f172518a & 8) == 0)) {
            long j = cacd.f172522e;
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("&currentTimeMillis=");
            sb3.append(j);
            sb.append(sb3.toString());
        }
        if (!(cacd == null || (cacd.f172518a & 16) == 0)) {
            boolean z = cacd.f172523f;
            StringBuilder sb4 = new StringBuilder(25);
            sb4.append("&deduplicateChanges=");
            sb4.append(z);
            sb.append(sb4.toString());
        }
        if (!(cacd == null || (cacd.f172518a & 32) == 0)) {
            int i = cacd.f172524g;
            StringBuilder sb5 = new StringBuilder(26);
            sb5.append("&minDatapoints=");
            sb5.append(i);
            sb.append(sb5.toString());
        }
        if (!(cacd == null || (cacd.f172518a & 64) == 0)) {
            cack cack = cacd.f172525h;
            if (cack == null) {
                cack = cack.f172565d;
            }
            if ((cack.f172567a & 1) != 0) {
                cack cack2 = cacd.f172525h;
                if (cack2 == null) {
                    cack2 = cack.f172565d;
                }
                String valueOf2 = String.valueOf(shd.m35267a(cack2.f172568b));
                sb.append(valueOf2.length() == 0 ? new String("&header.userAgent=") : "&header.userAgent=".concat(valueOf2));
            }
        }
        if (!(cacd == null || (cacd.f172518a & 64) == 0)) {
            cack cack3 = cacd.f172525h;
            if (cack3 == null) {
                cack3 = cack.f172565d;
            }
            if ((cack3.f172567a & 2) != 0) {
                cack cack4 = cacd.f172525h;
                if (cack4 == null) {
                    cack4 = cack.f172565d;
                }
                String valueOf3 = String.valueOf(shd.m35267a(cack4.f172569c));
                sb.append(valueOf3.length() == 0 ? new String("&header.serverToken=") : "&header.serverToken=".concat(valueOf3));
            }
        }
        return yrh.m44659a((cace) sgv.mo25513a(clientContext, 0, sb.toString(), (byte[]) null, cace.f172527h), yrz.f54522e, caae);
    }
}
