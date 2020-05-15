package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.net.DatagramSocket;
import java.nio.ByteBuffer;

/* renamed from: aanm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aanm {

    /* renamed from: a */
    public final ByteBuffer f28581a = ByteBuffer.allocate(4);

    /* renamed from: b */
    public final aamt f28582b;

    /* renamed from: c */
    private aand f28583c;

    /* renamed from: d */
    private DatagramSocket f28584d;

    /* renamed from: e */
    private long f28585e;

    public aanm(aamt aamt) {
        this.f28582b = aamt;
    }

    /* renamed from: a */
    public final synchronized void mo17134a() {
        DatagramSocket datagramSocket = this.f28584d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f28584d = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo17136a(aand aand) {
        this.f28583c = aand;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        return true;
     */
    /* renamed from: b */
    public final synchronized boolean mo17137b() {
        if (System.currentTimeMillis() - this.f28585e >= cecz.f182285a.mo6606a().mo78813ae()) {
            if (this.f28583c.mo17093a()) {
                if (this.f28583c.mo17094b()) {
                    this.f28583c.mo17088a(29);
                    this.f28585e = System.currentTimeMillis();
                }
            }
            aamt aamt = this.f28582b;
            bxvd da = blml.f126850k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blml blml = (blml) da.f164949b;
            blml.f126853b = 4;
            int i = blml.f126852a | 1;
            blml.f126852a = i;
            blml.f126861j = 1;
            blml.f126852a = i | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aamt.mo17063a(da);
        } else {
            aamt aamt2 = this.f28582b;
            bxvd da2 = blml.f126850k.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blml blml2 = (blml) da2.f164949b;
            blml2.f126853b = 4;
            int i2 = blml2.f126852a | 1;
            blml2.f126852a = i2;
            blml2.f126861j = 2;
            blml2.f126852a = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aamt2.mo17063a(da2);
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo17135a(int i) {
        mo17134a();
        boolean b = cdjz.m133767b();
        if (b) {
            try {
                shr.m35316b(1031);
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                try {
                    aamt aamt = this.f28582b;
                    bxvd da = blml.f126850k.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    blml blml = (blml) da.f164949b;
                    blml.f126853b = 5;
                    blml.f126852a |= 1;
                    aamt.mo17063a(da);
                    if (!b) {
                        return;
                    }
                    return;
                } finally {
                    if (b) {
                        shr.m35312a();
                    }
                }
            }
        }
        DatagramSocket datagramSocket = new DatagramSocket((int) cecz.f182285a.mo6606a().mo78816ah());
        if (b) {
            shr.m35312a();
        }
        this.f28584d = datagramSocket;
        new soa(10, new aanl(this, datagramSocket, i)).start();
    }
}
