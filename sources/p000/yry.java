package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;

/* renamed from: yry */
public final /* synthetic */ class yry implements Callable {

    /* renamed from: a */
    private final yrz f54516a;

    /* renamed from: b */
    private final String f54517b;

    public yry(yrz yrz, String str) {
        this.f54516a = yrz;
        this.f54517b = str;
    }

    public final Object call() {
        yrz yrz = this.f54516a;
        String str = this.f54517b;
        yrb yrb = yrz.f54519b;
        ClientContext clientContext = yrz.f54520c;
        bxvd da = caca.f172499e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caca caca = (caca) da.f164949b;
        "me".getClass();
        caca.f172501a |= 1;
        caca.f172504d = "me";
        str.getClass();
        caca.f172502b = 4;
        caca.f172503c = str;
        return yrb.mo30683a(clientContext, (caca) da.mo74062i());
    }
}
