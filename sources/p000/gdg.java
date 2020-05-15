package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: gdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gdg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ gdh f17947a;

    /* renamed from: b */
    private byte[] f17948b;

    public gdg(gdh gdh) {
        this.f17947a = gdh;
    }

    public final void run() {
        while (true) {
            try {
                this.f17948b = new byte[BaseMfiEventCallback.TYPE_UNKNOWN_ERROR];
                int read = this.f17947a.f17949a.read(this.f17948b);
                if (read > 0) {
                    gdh gdh = this.f17947a;
                    ByteBuffer wrap = ByteBuffer.wrap(this.f17948b, 0, read);
                    for (gcd gcd : (gcd[]) gdh.f17950b.f18130a) {
                        gcd.mo11639a(wrap);
                    }
                }
            } catch (IOException e) {
                bnsl bnsl = (bnsl) gdv.f17985a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("gdg", "run", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error reading audio InputStream");
                for (gcd gcd2 : (gcd[]) this.f17947a.f17950b.f18130a) {
                    gcd2.mo11640b();
                }
                this.f17947a.mo11680f();
                return;
            }
        }
    }
}
