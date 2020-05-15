package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;

/* renamed from: ncy */
final /* synthetic */ class ncy implements Runnable {

    /* renamed from: a */
    private final InputStream f35299a;

    /* renamed from: b */
    private final blbn f35300b;

    /* renamed from: c */
    private final PipedOutputStream f35301c;

    /* renamed from: d */
    private final nda f35302d;

    public ncy(InputStream inputStream, blbn blbn, PipedOutputStream pipedOutputStream, nda nda) {
        this.f35299a = inputStream;
        this.f35300b = blbn;
        this.f35301c = pipedOutputStream;
        this.f35302d = nda;
    }

    public final void run() {
        InputStream inputStream = this.f35299a;
        blbn blbn = this.f35300b;
        PipedOutputStream pipedOutputStream = this.f35301c;
        nda nda = this.f35302d;
        lvn lvn = ncz.f35303a;
        try {
            blbp blbp = new blbp();
            blbp.f125851b = inputStream;
            blbp.f125850a = blbn;
            blbp.mo66466a().mo66467a(pipedOutputStream);
            try {
                pipedOutputStream.close();
            } catch (IOException e) {
            }
        } catch (IOException e2) {
            ncz.f35303a.mo25411b("Exception ", e2, new Object[0]);
            nda.f35304a = e2;
            try {
                pipedOutputStream.close();
            } catch (IOException e3) {
            }
        } catch (Throwable th) {
            try {
                pipedOutputStream.close();
            } catch (IOException e4) {
            }
            throw th;
        }
    }
}
