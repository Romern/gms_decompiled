package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: yrt */
final /* synthetic */ class yrt implements Callable {

    /* renamed from: a */
    private final yrz f54506a;

    /* renamed from: b */
    private final List f54507b;

    public yrt(yrz yrz, List list) {
        this.f54506a = yrz;
        this.f54507b = list;
    }

    public final Object call() {
        yrz yrz = this.f54506a;
        List list = this.f54507b;
        Set b = zdl.m45333b(list);
        bxvd da = cabd.f172424b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cabd cabd = (cabd) da.f164949b;
        if (!cabd.f172426a.mo73666a()) {
            cabd.f172426a = bxvk.m124021a(cabd.f172426a);
        }
        bxsy.m123078a(list, cabd.f172426a);
        cabd cabd2 = (cabd) da.mo74062i();
        bxvd da2 = caay.f172393f.mo74144da();
        long currentTimeMillis = System.currentTimeMillis();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        caay caay = (caay) da2.f164949b;
        int i = caay.f172395a | 2;
        caay.f172395a = i;
        caay.f172397c = currentTimeMillis;
        "me".getClass();
        int i2 = i | 1;
        caay.f172395a = i2;
        caay.f172396b = "me";
        cabd2.getClass();
        caay.f172398d = cabd2;
        caay.f172395a = i2 | 4;
        caay caay2 = (caay) da2.mo74062i();
        yrb yrb = yrz.f54519b;
        ClientContext clientContext = yrz.f54520c;
        sgv sgv = yrb.f54472a;
        StringBuilder sb = new StringBuilder();
        String a = shd.m35267a(String.valueOf(caay2.f172396b));
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 39);
        sb2.append("/users/");
        sb2.append(a);
        sb2.append("/applyDataPointChanges?alt=proto");
        sb.append(sb2.toString());
        if (!(caay2 == null || (caay2.f172395a & 2) == 0)) {
            long j = caay2.f172397c;
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("&currentTimeMillis=");
            sb3.append(j);
            sb.append(sb3.toString());
        }
        if (!(caay2 == null || (caay2.f172395a & 8) == 0)) {
            cack cack = caay2.f172399e;
            if (cack == null) {
                cack = cack.f172565d;
            }
            if ((cack.f172567a & 1) != 0) {
                cack cack2 = caay2.f172399e;
                if (cack2 == null) {
                    cack2 = cack.f172565d;
                }
                String valueOf = String.valueOf(shd.m35267a(cack2.f172568b));
                sb.append(valueOf.length() == 0 ? new String("&header.userAgent=") : "&header.userAgent=".concat(valueOf));
            }
        }
        if (!(caay2 == null || (caay2.f172395a & 8) == 0)) {
            cack cack3 = caay2.f172399e;
            if (cack3 == null) {
                cack3 = cack.f172565d;
            }
            if ((cack3.f172567a & 2) != 0) {
                cack cack4 = caay2.f172399e;
                if (cack4 == null) {
                    cack4 = cack.f172565d;
                }
                String valueOf2 = String.valueOf(shd.m35267a(cack4.f172569c));
                sb.append(valueOf2.length() == 0 ? new String("&header.serverToken=") : "&header.serverToken=".concat(valueOf2));
            }
        }
        String sb4 = sb.toString();
        cabd cabd3 = caay2.f172398d;
        if (cabd3 == null) {
            cabd3 = cabd.f172424b;
        }
        Set b2 = zdl.m45333b(((caaz) sgv.mo25513a(clientContext, 1, sb4, cabd3.mo73642k(), caaz.f172401b)).f172403a);
        b.removeAll(b2);
        caba caba = (caba) cabb.f172405e.mo74144da();
        caba.mo74606b(b);
        caba.mo74605a(b2);
        return (cabb) caba.mo74062i();
    }
}
