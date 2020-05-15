package p000;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SignatureException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ahlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class ahlm implements ahna {

    /* renamed from: a */
    protected final String f67450a;

    /* renamed from: b */
    private final DataInputStream f67451b;

    /* renamed from: c */
    private final DataOutputStream f67452c;

    /* renamed from: d */
    private volatile long f67453d = -1;

    /* renamed from: e */
    private ahkl f67454e;

    /* renamed from: f */
    private String f67455f;

    /* renamed from: g */
    private final AtomicReference f67456g = new AtomicReference();

    /* renamed from: h */
    private final AtomicBoolean f67457h = new AtomicBoolean(false);

    /* renamed from: i */
    private final AtomicBoolean f67458i = new AtomicBoolean(false);

    /* renamed from: j */
    private byte[] f67459j;

    protected ahlm(String str, InputStream inputStream, OutputStream outputStream) {
        this.f67450a = str;
        this.f67451b = new DataInputStream(new BufferedInputStream(inputStream));
        this.f67452c = new DataOutputStream(new BufferedOutputStream(outputStream));
    }

    /* renamed from: a */
    public final String mo36795a() {
        String str;
        if (this.f67456g.get() != null) {
            str = "ENCRYPTED_";
        } else {
            str = "";
        }
        bvif bvif = bvif.UNKNOWN_MEDIUM;
        switch (mo36865l().ordinal()) {
            case 2:
                return str.concat("BLUETOOTH");
            case 3:
                return str.concat("WIFI_HOTSPOT");
            case 4:
                return str.concat("BLE");
            case 5:
                return str.concat("WIFI_LAN");
            case 6:
                return str.concat("WIFI_AWARE");
            case 7:
                return str.concat("NFC");
            case 8:
                return str.concat("WIFI_DIRECT");
            case 9:
                return str.concat("WEB_RTC");
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public final void mo36797a(ahkl ahkl, String str) {
        this.f67454e = ahkl;
        this.f67455f = str;
    }

    /* renamed from: b */
    public final String mo36800b() {
        return this.f67450a;
    }

    /* renamed from: c */
    public final void mo36801c() {
        this.f67456g.set(null);
    }

    /* renamed from: d */
    public final long mo36802d() {
        return this.f67453d;
    }

    /* renamed from: e */
    public final byte[] mo36803e() {
        byte[] bArr;
        synchronized (this.f67451b) {
            int readInt = this.f67451b.readInt();
            if (readInt < 0) {
                throw new IOException(String.format("Failed to read. Invalid length %s", Integer.valueOf(readInt)));
            } else if (((long) readInt) <= cfnv.f184625a.mo6606a().mo81775ah()) {
                byte[] bArr2 = this.f67459j;
                if (bArr2 == null || bArr2.length != readInt) {
                    this.f67459j = new byte[readInt];
                }
                bArr = this.f67459j;
                try {
                    this.f67451b.readFully(bArr);
                    byqy byqy = (byqy) this.f67456g.get();
                    if (byqy != null) {
                        bArr = byqy.mo74478b(bArr);
                    }
                    this.f67453d = SystemClock.elapsedRealtime();
                } catch (NullPointerException e) {
                    throw new IOException("Read failed. Socket closed.", e);
                } catch (SignatureException e2) {
                    if (!(e2.getCause() instanceof bxwf)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to decode message on channel ");
                        sb.append(mo36795a());
                        if (this.f67455f != null) {
                            sb.append(" for endpoint ");
                            sb.append(this.f67455f);
                        }
                        throw new IOException(sb.toString(), e2);
                    }
                    bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
                    bnsl.mo68437a(e2);
                    bnsl.mo68405a("Read an unencrypted (or garbage) frame when we expected an encrypted frame.");
                    this.f67453d = SystemClock.elapsedRealtime();
                    return bArr;
                }
            } else {
                throw new IOException(String.format("Failed to read. The remote side's length (%s) exceeds the allowed size for a single frame. This typically happens because of corrupt or garbage data on the stream.", Integer.valueOf(readInt)));
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo36804f();

    /* renamed from: g */
    public final void mo36805g() {
        mo36796a(0);
    }

    /* renamed from: h */
    public final void mo36806h() {
        this.f67457h.set(true);
    }

    /* renamed from: i */
    public final boolean mo36807i() {
        return !this.f67458i.get() && this.f67457h.get();
    }

    /* renamed from: j */
    public final void mo36808j() {
        this.f67457h.set(false);
        synchronized (this.f67457h) {
            this.f67457h.notify();
        }
    }

    /* renamed from: k */
    public int mo36809k() {
        return (int) cfnv.m140747I();
    }

    /* renamed from: a */
    public final void mo36796a(int i) {
        ahkl ahkl;
        String str;
        if (!this.f67458i.get()) {
            this.f67458i.set(true);
            try {
                this.f67451b.close();
            } catch (IOException | NullPointerException e) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Failed to close read stream of %s EndpointChannel %s: %s", mo36795a(), this.f67450a, e.getMessage());
            }
            try {
                this.f67452c.close();
            } catch (IOException | NullPointerException e2) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Failed to close write stream of %s EndpointChannel %s: %s", mo36795a(), this.f67450a, e2.getMessage());
            }
            mo36804f();
            mo36808j();
            if (!(i == 0 || (ahkl = this.f67454e) == null || (str = this.f67455f) == null)) {
                ahkl.mo36661a(str, mo36865l(), i);
            }
            this.f67454e = null;
            this.f67455f = null;
            srn srn = ahkm.f67363a;
            mo36795a();
        }
    }

    /* renamed from: a */
    public final void mo36798a(byqy byqy) {
        AtomicReference atomicReference = this.f67456g;
        sdo.m34959a(byqy);
        atomicReference.set(byqy);
    }

    /* renamed from: a */
    public final void mo36799a(byte[] bArr) {
        synchronized (this.f67452c) {
            if (mo36807i()) {
                synchronized (this.f67457h) {
                    while (mo36807i()) {
                        try {
                            this.f67457h.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
            byqy byqy = (byqy) this.f67456g.get();
            if (byqy != null) {
                bArr = byqy.mo74476a(bArr);
            }
            this.f67452c.writeInt(bArr.length);
            this.f67452c.write(bArr);
            this.f67452c.flush();
        }
    }
}
