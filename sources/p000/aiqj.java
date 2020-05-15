package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* renamed from: aiqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiqj extends aiqc {

    /* renamed from: c */
    public final byte[] f69496c;

    /* renamed from: d */
    public final OutputStream f69497d;

    /* renamed from: e */
    public final aiqh f69498e;

    /* renamed from: f */
    private final InputStream f69499f;

    /* renamed from: g */
    private final airj f69500g;

    /* renamed from: h */
    private final int f69501h;

    private aiqj(byte[] bArr, InputStream inputStream, OutputStream outputStream, aiqh aiqh, airj airj, int i) {
        super(ails.m57438a(bArr));
        this.f69496c = bArr;
        this.f69499f = inputStream;
        this.f69497d = outputStream;
        this.f69498e = aiqh;
        this.f69500g = airj;
        this.f69501h = i;
    }

    /* renamed from: a */
    public static aiqj m57706a(int i, byte[] bArr, airj airj, aiqh aiqh, int i2) {
        PipedInputStream pipedInputStream = new PipedInputStream();
        try {
            return new aiqj(bArr, pipedInputStream, new PipedOutputStream(pipedInputStream), aiqh, airj, i2);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiqj", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("BleSocketV2 failed to create a new BLE socket for service ID hash %s because the piped output stream failed to initialize.", ails.m57438a(bArr));
            srz.m36171a((Closeable) pipedInputStream);
            return null;
        }
    }

    /* renamed from: h */
    private final void m57707h() {
        bxvd da = bvgi.f156000e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi = (bvgi) da.f164949b;
        bvgi.f156003b = 2;
        bvgi.f156002a |= 1;
        bxvd da2 = bvge.f155990c.mo74144da();
        ByteString a = ByteString.m123261a(this.f69496c);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvge bvge = (bvge) da2.f164949b;
        a.getClass();
        bvge.f155992a |= 1;
        bvge.f155993b = a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi2 = (bvgi) da.f164949b;
        bvge bvge2 = (bvge) da2.mo74062i();
        bvge2.getClass();
        bvgi2.f156005d = bvge2;
        bvgi2.f156002a |= 4;
        byte[] k = ((bvgi) da.mo74062i()).serializeToBytes();
        try {
            bluv b = this.f69498e.mo37848b(k);
            if (b != null) {
                b.mo66727a(new aiqg(k));
            }
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiqj", "h", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("BleSocketV2 failed to send a disconnection packet to disconnect for service ID hash %s.", ails.m57438a(this.f69496c));
        }
    }

    /* renamed from: a */
    public final InputStream mo37636a() {
        return this.f69499f;
    }

    /* renamed from: b */
    public final OutputStream mo37638b() {
        return this.f69498e;
    }

    /* renamed from: d */
    public final byte[] mo37841d() {
        return this.f69496c;
    }

    /* renamed from: e */
    public final int mo37842e() {
        return this.f69501h;
    }

    /* renamed from: f */
    public final boolean mo37854f() {
        bxvd da = bvgi.f156000e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi = (bvgi) da.f164949b;
        bvgi.f156003b = 1;
        bvgi.f156002a |= 1;
        bxvd da2 = bvgf.f155994d.mo74144da();
        ByteString a = ByteString.m123261a(this.f69496c);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvgf bvgf = (bvgf) da2.f164949b;
        a.getClass();
        int i = bvgf.f155996a | 1;
        bvgf.f155996a = i;
        bvgf.f155997b = a;
        bvgf.f155998c = 2;
        bvgf.f155996a = i | 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi2 = (bvgi) da.f164949b;
        bvgf bvgf2 = (bvgf) da2.mo74062i();
        bvgf2.getClass();
        bvgi2.f156004c = bvgf2;
        bvgi2.f156002a |= 2;
        try {
            this.f69498e.mo37847a(((bvgi) da.mo74062i()).serializeToBytes());
            return true;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiqj", "f", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("BleSocketV2 failed to send a introduction packet to connect for service ID hash %s.", ails.m57438a(this.f69496c));
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo37855g() {
        srz.m36171a(this.f69498e);
        srz.m36171a(this.f69497d);
        srz.m36171a((Closeable) this.f69499f);
    }

    /* renamed from: c */
    public final void mo37639c() {
        bxvd da = bvgi.f156000e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi = (bvgi) da.f164949b;
        bvgi.f156003b = 2;
        bvgi.f156002a |= 1;
        bxvd da2 = bvge.f155990c.mo74144da();
        ByteString a = ByteString.m123261a(this.f69496c);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvge bvge = (bvge) da2.f164949b;
        a.getClass();
        bvge.f155992a |= 1;
        bvge.f155993b = a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi2 = (bvgi) da.f164949b;
        bvge bvge2 = (bvge) da2.mo74062i();
        bvge2.getClass();
        bvgi2.f156005d = bvge2;
        bvgi2.f156002a |= 4;
        byte[] k = ((bvgi) da.mo74062i()).serializeToBytes();
        try {
            bluv b = this.f69498e.mo37848b(k);
            if (b != null) {
                b.mo66727a(new aiqg(k));
            }
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiqj", "h", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("BleSocketV2 failed to send a disconnection packet to disconnect for service ID hash %s.", ails.m57438a(this.f69496c));
        }
        this.f69500g.mo37590a();
    }
}
