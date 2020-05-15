package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: byf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class byf extends bwz {

    /* renamed from: a */
    private bpg f6129a;

    public byf(byte[] bArr, bzu bzu) {
        super(bArr, bzu);
    }

    /* renamed from: aP */
    public final void mo3547aP() {
        byte[] i = mo3563i();
        int i2 = bpn.f5319a;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i);
        bpg bpg = new bpg();
        while (byteArrayInputStream.available() > 0) {
            try {
                bpg.f5307a.add(new bpj(bpn.m3456c(byteArrayInputStream), new bpo(bpn.m3457d(byteArrayInputStream))));
            } catch (IOException e) {
                throw new bpf("Invalid stream", e);
            }
        }
        this.f6129a = bpg;
    }

    /* renamed from: b */
    public final int mo3454b() {
        Iterator it = this.f6129a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((bpj) it.next()).f5314a;
        }
        return i;
    }

    /* renamed from: c */
    public final bpl mo3614c(byte[] bArr) {
        bpg bpg = this.f6129a;
        try {
            bpl bpl = new bpl();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            for (bpj bpj : bpg.f5307a) {
                if (byteArrayInputStream.available() >= bpj.f5314a) {
                    bpm bpm = new bpm(bpj.f5315b);
                    byte[] bArr2 = new byte[bpj.f5314a];
                    if (byteArrayInputStream.read(bArr2) == bpj.f5314a) {
                        bpm.mo3353a(bArr2);
                        bpl.mo3367a(bpm);
                    } else {
                        throw new bpf("mismatch");
                    }
                } else {
                    throw new bpf("bytes to short");
                }
            }
            return bpl;
        } catch (IOException e) {
            throw new bpf("error parsing", e);
        }
    }
}
