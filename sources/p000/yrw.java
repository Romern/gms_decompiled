package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;

/* renamed from: yrw */
public final /* synthetic */ class yrw implements Callable {

    /* renamed from: a */
    private final yrz f54512a;

    public yrw(yrz yrz) {
        this.f54512a = yrz;
    }

    public final Object call() {
        yrz yrz = this.f54512a;
        yrb yrb = yrz.f54519b;
        ClientContext clientContext = yrz.f54520c;
        bxvd da = cacf.f172536e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cacf cacf = (cacf) da.f164949b;
        "me".getClass();
        cacf.f172538a |= 1;
        cacf.f172539b = "me";
        return yrb.mo30684a(clientContext, (cacf) da.mo74062i()).f172545b;
    }
}
