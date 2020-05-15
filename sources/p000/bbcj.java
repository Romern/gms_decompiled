package p000;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: bbcj */
final /* synthetic */ class bbcj implements bqeh {

    /* renamed from: a */
    private final bbda f102330a;

    /* renamed from: b */
    private final PrintWriter f102331b;

    public bbcj(bbda bbda, PrintWriter printWriter) {
        this.f102330a = bbda;
        this.f102331b = printWriter;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbda bbda = this.f102330a;
        PrintWriter printWriter = this.f102331b;
        bqgg a = bqga.m112775a((Object) null);
        for (bavt bavt : (List) obj) {
            a = bqdx.m112674a(a, new bbck(bbda, bavt, printWriter), bbda.f102401k);
        }
        return a;
    }
}
