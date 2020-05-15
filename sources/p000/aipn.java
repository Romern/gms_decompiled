package p000;

import android.bluetooth.BluetoothSocket;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: aipn */
final /* synthetic */ class aipn implements Runnable {

    /* renamed from: a */
    private final aipr f69442a;

    /* renamed from: b */
    private final BluetoothSocket f69443b;

    public aipn(aipr aipr, BluetoothSocket bluetoothSocket) {
        this.f69442a = aipr;
        this.f69443b = bluetoothSocket;
    }

    public final void run() {
        DataOutputStream dataOutputStream;
        aijw aijw;
        byte[] bArr;
        aipr aipr = this.f69442a;
        BluetoothSocket bluetoothSocket = this.f69443b;
        String address = bluetoothSocket.getRemoteDevice().getAddress();
        srn srn = ailf.f69111a;
        ahfi b = ahfi.m55635b(new aipp(bluetoothSocket), cfnv.m140784h(), aipr.f69450c);
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(bluetoothSocket.getInputStream()));
            DataOutputStream dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(bluetoothSocket.getOutputStream()));
            while (true) {
                try {
                    int readInt = dataInputStream.readInt();
                    if (aipl.m57664a(readInt)) {
                        byte[] bArr2 = new byte[readInt];
                        dataInputStream.readFully(bArr2);
                        aipl a = aipl.m57663a(bArr2);
                        if (a != null) {
                            int i = a.f69438a;
                            if (i != 1) {
                                if (i == 2) {
                                    srz.m36171a(bluetoothSocket);
                                    break;
                                } else if (i == 3) {
                                    if (aipr.f69452e.containsKey(address)) {
                                        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                                        bnsl.mo68432a("aipr", "a", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl.mo68420a("Receive duplicate data connection request from remote MAC address %s", address);
                                        aipr.m57674a(dataOutputStream2, aipl.m57671c());
                                        aipr.m57675b(bluetoothSocket);
                                    } else {
                                        aira a2 = aiqo.m57734a(address, bluetoothSocket, new aipo(aipr, address), aipr.f69455h);
                                        if (a2 == null) {
                                            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                                            bnsl2.mo68432a("aipr", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl2.mo68420a("Failed to create MultiplexBleSocket for remote address %s, the reason may be not enable MulitplexBleSocketV2 or failed to read BlePacket.", address);
                                            aipr.m57674a(dataOutputStream2, aipl.m57671c());
                                            aipr.m57675b(bluetoothSocket);
                                        } else {
                                            aipr.m57674a(dataOutputStream2, aipl.m57666a(23, null));
                                            aipr.f69452e.put(address, a2);
                                        }
                                    }
                                }
                            } else {
                                byte[] bArr3 = a.f69439b;
                                Iterator it = aipr.f69454g.values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        aijw = null;
                                        break;
                                    }
                                    aijw = (aijw) it.next();
                                    if (Arrays.equals(bArr3, aipl.m57669b(aijw.f68996a))) {
                                        break;
                                    }
                                }
                                if (aijw != null) {
                                    byte[] bArr4 = aijw.f68997b;
                                    int length = bArr4.length;
                                    if (length < 8) {
                                        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                                        bnsl3.mo68432a("aipl", "b", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl3.mo68411a("Cannot serialize BleL2capPacket for RESPONSE_ADVERTISEMENT : expected min %d advertisement raw bytes, but got %d", 8, length);
                                        bArr = null;
                                    } else {
                                        bArr = aipl.m57666a(21, bArr4);
                                    }
                                    if (bArr == null) {
                                        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                                        bnsl4.mo68432a("aipr", "a", 148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl4.mo68420a("The cached advertisement with invalid format! raw data : %s", ails.m57438a(aijw.f68997b));
                                        aipr.m57674a(dataOutputStream2, aipl.m57665a());
                                    } else {
                                        aipr.m57674a(dataOutputStream2, bArr);
                                    }
                                } else {
                                    aipr.m57674a(dataOutputStream2, aipl.m57665a());
                                }
                            }
                        } else {
                            String valueOf = String.valueOf(ails.m57438a(bArr2));
                            throw new IOException(valueOf.length() == 0 ? new String("Got invalid BleL2capPacket bytes from server! raw data : ") : "Got invalid BleL2capPacket bytes from server! raw data : ".concat(valueOf));
                        }
                    } else {
                        throw new IOException("Got invalid length of BleL2capPacket from client!");
                    }
                } catch (IOException e) {
                    e = e;
                    dataOutputStream = dataOutputStream2;
                    try {
                        bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl5.mo68437a(e);
                        bnsl5.mo68432a("aipr", "a", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68405a("Failed to read/write data from incoming L2CAP socket.");
                        srz.m36171a(bluetoothSocket);
                        srz.m36171a(dataOutputStream);
                        b.mo36396b();
                    } catch (Throwable th) {
                        b.mo36396b();
                        throw th;
                    }
                }
            }
        } catch (IOException e2) {
            e = e2;
            dataOutputStream = null;
            bnsl bnsl52 = (bnsl) ailf.f69111a.mo68387b();
            bnsl52.mo68437a(e);
            bnsl52.mo68432a("aipr", "a", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl52.mo68405a("Failed to read/write data from incoming L2CAP socket.");
            srz.m36171a(bluetoothSocket);
            srz.m36171a(dataOutputStream);
            b.mo36396b();
        }
        b.mo36396b();
    }
}
