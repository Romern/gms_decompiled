package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/* renamed from: aanl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aanl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DatagramSocket f28578a;

    /* renamed from: b */
    final /* synthetic */ int f28579b;

    /* renamed from: c */
    final /* synthetic */ aanm f28580c;

    public aanl(aanm aanm, DatagramSocket datagramSocket, int i) {
        this.f28580c = aanm;
        this.f28578a = datagramSocket;
        this.f28579b = i;
    }

    public final void run() {
        aanm aanm = this.f28580c;
        DatagramSocket datagramSocket = this.f28578a;
        int i = this.f28579b;
        DatagramPacket datagramPacket = new DatagramPacket(new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES], PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        int af = (int) cecz.f182285a.mo6606a().mo78814af();
        int i2 = 0;
        while (i2 < af) {
            try {
                datagramSocket.receive(datagramPacket);
                if (datagramPacket.getLength() == 4) {
                    aanm.f28581a.clear();
                    aanm.f28581a.put(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength()).flip();
                    if (aanm.f28581a.getInt() != i) {
                        i2++;
                    } else if (aanm.mo17137b()) {
                        break;
                    }
                } else {
                    i2++;
                }
            } catch (IOException e) {
            } catch (Throwable th) {
                datagramSocket.close();
                throw th;
            }
        }
        datagramSocket.close();
        if (i2 >= af) {
            aamt aamt = aanm.f28582b;
            bxvd da = blml.f126850k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blml blml = (blml) da.f164949b;
            blml.f126853b = 6;
            blml.f126852a |= 1;
            aamt.mo17063a(da);
        }
    }
}
