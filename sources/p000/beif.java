package p000;

import android.util.Base64;
import java.io.OutputStream;
import java.security.DigestOutputStream;

/* renamed from: beif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beif extends DigestOutputStream implements begu {

    /* renamed from: a */
    final begk f111574a;

    /* renamed from: b */
    boolean f111575b = false;

    /* renamed from: c */
    befw f111576c;

    /* renamed from: a */
    public final void mo60706a(befw befw) {
        this.f111576c = befw;
    }

    public final void close() {
        super.close();
        if (!this.f111575b) {
            this.f111575b = true;
            befw befw = this.f111576c;
            if (befw != null) {
                begj a = this.f111574a.mo60691a();
                a.mo60690a("sha256", Base64.encodeToString(this.digest.digest(), 2));
                befw.mo60675a(a.mo60688a());
            }
        }
    }

    public beif(OutputStream outputStream, begk begk) {
        super(outputStream, beih.m95129d());
        this.f111574a = begk;
    }
}
