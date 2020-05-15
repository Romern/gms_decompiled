package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: vpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpz extends FilterInputStream {

    /* renamed from: a */
    private final long f49782a;

    public vpz(InputStream inputStream, long j) {
        super(new bobc(inputStream));
        sdo.m34974b(j >= 0);
        this.f49782a = j;
    }

    /* renamed from: a */
    public final void mo28736a() {
        if (((bobc) this.in).f132489a != this.f49782a) {
            throw new vpy();
        }
    }
}
