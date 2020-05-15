package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;

/* renamed from: yrx */
public final /* synthetic */ class yrx implements Callable {

    /* renamed from: a */
    private final yrz f54513a;

    /* renamed from: b */
    private final String f54514b;

    /* renamed from: c */
    private final Iterable f54515c;

    public yrx(yrz yrz, String str, Iterable iterable) {
        this.f54513a = yrz;
        this.f54514b = str;
        this.f54515c = iterable;
    }

    public final Object call() {
        yrz yrz = this.f54513a;
        String str = this.f54514b;
        Iterable iterable = this.f54515c;
        yrb yrb = yrz.f54519b;
        ClientContext clientContext = yrz.f54520c;
        bxvd da = cacf.f172536e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cacf cacf = (cacf) da.f164949b;
        "me".getClass();
        int i = cacf.f172538a | 1;
        cacf.f172538a = i;
        cacf.f172539b = "me";
        str.getClass();
        cacf.f172538a = i | 2;
        cacf.f172540c = str;
        bxvd da2 = cabk.f172444e.mo74144da();
        bxvd da3 = cabj.f172440c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        cabj cabj = (cabj) da3.f164949b;
        cabj.f172443b = 1;
        cabj.f172442a |= 1;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cabk cabk = (cabk) da2.f164949b;
        cabj cabj2 = (cabj) da3.mo74062i();
        cabj2.getClass();
        cabk.f172448c = cabj2;
        cabk.f172447b = 2;
        cabu cabu = (cabu) cabv.f172481b.mo74144da();
        cabu.mo74608a(iterable);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cabk cabk2 = (cabk) da2.f164949b;
        cabv cabv = (cabv) cabu.mo74062i();
        cabv.getClass();
        cabk2.f172449d = cabv;
        cabk2.f172446a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cacf cacf2 = (cacf) da.f164949b;
        cabk cabk3 = (cabk) da2.mo74062i();
        cabk3.getClass();
        cacf2.f172541d = cabk3;
        cacf2.f172538a |= 16;
        return yrb.mo30684a(clientContext, (cacf) da.mo74062i());
    }
}
