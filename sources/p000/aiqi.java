package p000;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: aiqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiqi extends aiqc {

    /* renamed from: c */
    public final OutputStream f69491c;

    /* renamed from: d */
    private final byte[] f69492d;

    /* renamed from: e */
    private final InputStream f69493e;

    /* renamed from: f */
    private final OutputStream f69494f;

    /* renamed from: g */
    private final airj f69495g;

    public aiqi(byte[] bArr, InputStream inputStream, OutputStream outputStream, OutputStream outputStream2, airj airj) {
        super(ails.m57438a(bArr));
        this.f69492d = bArr;
        this.f69493e = inputStream;
        this.f69491c = outputStream;
        this.f69494f = outputStream2;
        this.f69495g = airj;
    }

    /* renamed from: a */
    public final InputStream mo37636a() {
        return this.f69493e;
    }

    /* renamed from: b */
    public final OutputStream mo37638b() {
        return this.f69494f;
    }

    /* renamed from: c */
    public final void mo37639c() {
        this.f69495g.mo37590a();
    }

    /* renamed from: d */
    public final byte[] mo37841d() {
        return this.f69492d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo37853f() {
        srz.m36171a(this.f69494f);
        srz.m36171a(this.f69491c);
        srz.m36171a((Closeable) this.f69493e);
    }
}
