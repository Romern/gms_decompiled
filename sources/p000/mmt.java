package p000;

import java.io.InputStream;

/* renamed from: mmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mmt extends InputStream {

    /* renamed from: a */
    private final mmr f34022a;

    /* renamed from: b */
    private InputStream f34023b;

    public mmt(mmr mmr) {
        this.f34022a = mmr;
    }

    /* renamed from: a */
    private final synchronized InputStream m25352a() {
        if (this.f34023b == null) {
            this.f34023b = this.f34022a.mo20161a();
        }
        return this.f34023b;
    }

    public final int read() {
        return m25352a().read();
    }

    public final int read(byte[] bArr) {
        return m25352a().read(bArr);
    }

    public final int read(byte[] bArr, int i, int i2) {
        return m25352a().read(bArr, i, i2);
    }
}
