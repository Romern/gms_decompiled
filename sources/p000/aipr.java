package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aipr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aipr {

    /* renamed from: a */
    public int f69448a = 0;

    /* renamed from: b */
    public final bqgj f69449b = ahhr.m55802a(4);

    /* renamed from: c */
    public final ScheduledExecutorService f69450c = ahhr.m55804a();

    /* renamed from: d */
    public BluetoothServerSocket f69451d;

    /* renamed from: e */
    public final Map f69452e = new C1223np();

    /* renamed from: f */
    public final BluetoothAdapter f69453f;

    /* renamed from: g */
    public final Map f69454g;

    /* renamed from: h */
    public final aiqm f69455h;

    /* renamed from: i */
    private final List f69456i = new ArrayList();

    public aipr(BluetoothAdapter bluetoothAdapter, Map map, aiqm aiqm) {
        this.f69453f = bluetoothAdapter;
        this.f69454g = map;
        this.f69455h = aiqm;
    }

    /* renamed from: a */
    private final void m57673a(DataOutputStream dataOutputStream, String str, BluetoothSocket bluetoothSocket) {
        if (this.f69452e.containsKey(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aipr", "a", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Receive duplicate data connection request from remote MAC address %s", str);
            m57674a(dataOutputStream, aipl.m57671c());
            m57675b(bluetoothSocket);
            return;
        }
        aira a = aiqo.m57734a(str, bluetoothSocket, new aipo(this, str), this.f69455h);
        if (a == null) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aipr", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to create MultiplexBleSocket for remote address %s, the reason may be not enable MulitplexBleSocketV2 or failed to read BlePacket.", str);
            m57674a(dataOutputStream, aipl.m57671c());
            m57675b(bluetoothSocket);
            return;
        }
        m57674a(dataOutputStream, aipl.m57668b());
        this.f69452e.put(str, a);
    }

    /* renamed from: b */
    public static void m57675b(BluetoothSocket bluetoothSocket) {
        new aipq(bluetoothSocket).start();
    }

    /* renamed from: c */
    static final /* synthetic */ void m57676c(BluetoothSocket bluetoothSocket) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aipr", "c", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68415a("L2capServerHandler timed out for handling incoming L2CAP socket after %d ms.", cfnv.m140784h());
        srz.m36171a(bluetoothSocket);
    }

    /* renamed from: b */
    public final void mo37829b() {
        while (true) {
            try {
                BluetoothSocket accept = this.f69451d.accept();
                if (accept == null) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                    bnsl.mo68432a("aipr", "b", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed! Got null incoming L2CAP socket.");
                } else {
                    mo37826a(accept);
                    this.f69449b.execute(new aipn(this, accept));
                }
            } catch (IOException e) {
                return;
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo37830c() {
        List list = this.f69456i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            srz.m36171a((BluetoothSocket) list.get(i));
        }
        this.f69456i.clear();
        srz.m36171a(this.f69451d);
        this.f69451d = null;
        ahhr.m55805a(this.f69449b, "BleL2capServer.socketHandlerThreadPool");
        ahhr.m55805a(this.f69450c, "BleL2capServer.timeoutAlarmExecutor");
    }

    /* renamed from: a */
    public static void m57674a(DataOutputStream dataOutputStream, byte[] bArr) {
        dataOutputStream.writeInt(bArr.length);
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
    }

    /* renamed from: a */
    public final synchronized void mo37826a(BluetoothSocket bluetoothSocket) {
        this.f69456i.add(bluetoothSocket);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37827a(String str, BluetoothSocket bluetoothSocket) {
        DataOutputStream dataOutputStream;
        aijw aijw;
        byte[] bArr;
        String str2 = str;
        BluetoothSocket bluetoothSocket2 = bluetoothSocket;
        srn srn = ailf.f69111a;
        ahfi b = ahfi.m55635b(new aipp(bluetoothSocket2), cfnv.m140784h(), this.f69450c);
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
                                    if (this.f69452e.containsKey(str2)) {
                                        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                                        bnsl.mo68432a("aipr", "a", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl.mo68420a("Receive duplicate data connection request from remote MAC address %s", str2);
                                        m57674a(dataOutputStream2, aipl.m57671c());
                                        m57675b(bluetoothSocket);
                                    } else {
                                        aira a2 = aiqo.m57734a(str2, bluetoothSocket2, new aipo(this, str2), this.f69455h);
                                        if (a2 == null) {
                                            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                                            bnsl2.mo68432a("aipr", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl2.mo68420a("Failed to create MultiplexBleSocket for remote address %s, the reason may be not enable MulitplexBleSocketV2 or failed to read BlePacket.", str2);
                                            m57674a(dataOutputStream2, aipl.m57671c());
                                            m57675b(bluetoothSocket);
                                        } else {
                                            m57674a(dataOutputStream2, aipl.m57668b());
                                            this.f69452e.put(str2, a2);
                                        }
                                    }
                                }
                            } else {
                                byte[] bArr3 = a.f69439b;
                                Iterator it = this.f69454g.values().iterator();
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
                                if (aijw == null) {
                                    m57674a(dataOutputStream2, aipl.m57665a());
                                } else {
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
                                        m57674a(dataOutputStream2, aipl.m57665a());
                                    } else {
                                        m57674a(dataOutputStream2, bArr);
                                    }
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

    /* renamed from: a */
    public final boolean mo37828a() {
        try {
            BluetoothServerSocket listenUsingInsecureL2capChannel = this.f69453f.listenUsingInsecureL2capChannel();
            this.f69451d = listenUsingInsecureL2capChannel;
            this.f69448a = listenUsingInsecureL2capChannel.getPsm();
            new soa(9, new aipm(this)).start();
            return true;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aipr", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to listen incoming L2CAP socket.");
            return false;
        }
    }
}
