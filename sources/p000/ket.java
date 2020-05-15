package p000;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/* renamed from: ket */
final /* synthetic */ class ket implements Runnable {

    /* renamed from: a */
    private final keu f23951a;

    public ket(keu keu) {
        this.f23951a = keu;
    }

    public final void run() {
        keu keu = this.f23951a;
        try {
            if (keu.f23953b.compareAndSet(false, true)) {
                beoa beoa = keu.f23952a;
                benu benu = new benu();
                for (File file : beoa.f111916b.mo60834a(new Date(System.currentTimeMillis()))) {
                    benu.f111896a++;
                    try {
                        if (file.delete()) {
                            benu.f111897b++;
                        } else if (!file.exists()) {
                            benu.f111898c++;
                        } else {
                            benu.f111899d++;
                        }
                        beoa.f111916b.mo60835a(file, beny.f111906a);
                    } catch (Exception e) {
                        benu.f111900e = true;
                        bqye.m113761a(benu.f111901f, e);
                    }
                }
                if (!benu.f111900e) {
                    keu.f23953b.set(false);
                    return;
                }
                throw benu.f111901f;
            }
        } catch (IOException e2) {
            bnsl bnsl = (bnsl) C1130key.f23956a.mo68388c();
            bnsl.mo68437a(e2);
            bnsl.mo68405a("Failed to clear DataSourceCache.");
        }
    }
}
