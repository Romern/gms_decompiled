package p000;

import android.nfc.tech.IsoDep;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: aisb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aisb implements Closeable {
    /* renamed from: a */
    public final airu mo37927a(airt airt) {
        airu airu;
        mo37913a().setTimeout((int) cfnv.f184625a.mo6606a().mo81790aw());
        IsoDep a = mo37913a();
        ByteBuffer allocate = ByteBuffer.allocate(airt.f69595e.length + 4 + airt.f69596f.length + airt.f69597g.length + airt.f69598h.length + airt.f69599i.length);
        allocate.put(airt.f69591a);
        allocate.put(airt.f69592b);
        allocate.put(airt.f69593c);
        allocate.put(airt.f69594d);
        allocate.put(airt.f69595e);
        allocate.put(airt.f69596f);
        allocate.put(airt.f69597g);
        allocate.put(airt.f69598h);
        allocate.put(airt.f69599i);
        byte[] transceive = a.transceive(allocate.array());
        int length = transceive.length;
        if (length < 2) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("airu", "b", 254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to parse response %s because the byte array was too short", ails.m57438a(transceive));
            airu = null;
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(transceive);
            byte[] bArr = new byte[(length - 2)];
            wrap.get(bArr);
            byte[] bArr2 = new byte[2];
            wrap.get(bArr2);
            airu = new airu(bArr, bArr2);
        }
        return airu == null ? airu.m57827b() : airu;
    }

    /* renamed from: a */
    public abstract IsoDep mo37913a();

    /* renamed from: b */
    public final int mo37929b() {
        return mo37913a().isExtendedLengthApduSupported() ? Math.min(65535, mo37913a().getMaxTransceiveLength() - 9) : Math.min(255, mo37913a().getMaxTransceiveLength() - 6);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final boolean mo37930c() {
        if (mo37913a().isConnected()) {
            return true;
        }
        try {
            mo37913a().connect();
            boolean isConnected = mo37913a().isConnected();
            srz.m36171a(mo37913a());
            return isConnected;
        } catch (IOException e) {
            srz.m36171a(mo37913a());
            return false;
        } catch (Throwable th) {
            srz.m36171a(mo37913a());
            throw th;
        }
    }

    public final void close() {
        srz.m36171a(mo37913a());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aisb) {
            return bmxi.m108538a(mo37913a().getTag(), ((aisb) obj).mo37913a().getTag());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo37913a().getTag()});
    }

    /* renamed from: a */
    public final void mo37928a(String str) {
        mo37913a().connect();
        if (mo37927a(new airt((byte) 0, (byte) -92, (byte) 4, (byte) 0, srv.m36161a(str), 0)).mo37911c()) {
            srz.m36171a(this);
            throw new IOException(String.format("Failed to bind to the remote NFC service %s.", str));
        }
    }
}
