package p000;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ogk */
final /* synthetic */ class ogk implements bmxj {

    /* renamed from: a */
    private final ogn f37558a;

    /* renamed from: b */
    private final InputStream f37559b;

    /* renamed from: c */
    private final OutputStream f37560c;

    public ogk(ogn ogn, InputStream inputStream, OutputStream outputStream) {
        this.f37558a = ogn;
        this.f37559b = inputStream;
        this.f37560c = outputStream;
    }

    public final Object apply(Object obj) {
        ogn ogn = this.f37558a;
        InputStream inputStream = this.f37559b;
        OutputStream outputStream = this.f37560c;
        int i = ogn.f37574l;
        ohk ohk = ogn.f37572j;
        ofo ofo = ogn.f37570h;
        bnsn bnsn = ogs.f37577a;
        ohh c = ((ogs) obj).mo22134c(i);
        c.f37635c = inputStream;
        c.f37636d = outputStream;
        c.f37638f = ohk;
        c.f37634b = ofo;
        return c.mo22154a();
    }
}
