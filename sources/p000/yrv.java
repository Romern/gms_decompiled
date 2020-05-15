package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;

/* renamed from: yrv */
public final /* synthetic */ class yrv implements Callable {

    /* renamed from: a */
    private final yrz f54510a;

    /* renamed from: b */
    private final bxvd f54511b;

    public yrv(yrz yrz, bxvd bxvd) {
        this.f54510a = yrz;
        this.f54511b = bxvd;
    }

    public final Object call() {
        yrz yrz = this.f54510a;
        bxvd bxvd = this.f54511b;
        yrb yrb = yrz.f54519b;
        ClientContext clientContext = yrz.f54520c;
        cach cach = (cach) bxvd.mo74062i();
        sgv sgv = yrb.f54472a;
        StringBuilder sb = new StringBuilder();
        String a = shd.m35267a(String.valueOf(cach.f172551b));
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 39);
        sb2.append("/users/");
        sb2.append(a);
        sb2.append("/dataPointsByType:list?alt=proto");
        sb.append(sb2.toString());
        return (caci) sgv.mo25513a(clientContext, 1, sb.toString(), cach.serializeToBytes(), caci.f172554c);
    }
}
