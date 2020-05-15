package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aipk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aipk {

    /* renamed from: a */
    public final String f69434a;

    /* renamed from: b */
    public final int f69435b;

    /* renamed from: c */
    public final BluetoothSocket f69436c;

    /* renamed from: d */
    private final ScheduledExecutorService f69437d = ahhr.m55804a();

    public aipk(BluetoothDevice bluetoothDevice, int i) {
        this.f69434a = bluetoothDevice.getAddress();
        this.f69435b = i;
        this.f69436c = bluetoothDevice.createInsecureL2capChannel(i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public static aipk m57651a(BluetoothDevice bluetoothDevice, int i) {
        try {
            return new aipk(bluetoothDevice, i);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aipk", "a", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68422a("Failed to create BleL2capClient with address %s and psm %s", (Object) bluetoothDevice.getAddress(), i);
            return null;
        }
    }

    /* renamed from: f */
    private final boolean m57655f() {
        try {
            this.f69436c.connect();
            return true;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aipk", "f", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Failed to connect via insecure L2cap BluetoothSocket to %s", this.f69435b);
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* renamed from: g */
    private final boolean m57656g() {
        boolean z;
        ahfi d = mo37820d();
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(this.f69436c.getInputStream()));
            m57654a(new DataOutputStream(new BufferedOutputStream(this.f69436c.getOutputStream())), aipl.m57666a(3, null));
            if (m57653a(dataInputStream).f69438a == 23) {
                z = true;
            } else {
                z = false;
            }
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aipk", "g", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68431a("BleL2capClient data connection to device %s was successful? %b", (Object) this.f69434a, z);
            return z;
        } catch (IOException e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aipk", "g", (int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to request data connection on L2CAP socket!");
            return false;
        } finally {
            d.mo36396b();
        }
    }

    /* renamed from: b */
    public final void mo37818b() {
        srz.m36171a(this.f69436c);
        ahhr.m55805a(this.f69437d, "BleL2capClient.timeoutAlarmExecutor");
    }

    /* renamed from: c */
    public final void mo37819c() {
        new aipj(this).start();
    }

    /* renamed from: d */
    public final ahfi mo37820d() {
        srn srn = ailf.f69111a;
        return ahfi.m55635b(new aipi(this), cfnv.m140784h(), this.f69437d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo37821e() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
        bnsl.mo68432a("aipk", "e", 294, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68415a("L2capClientHandler timed out for handling outgoing L2CAP socket after %d ms.", cfnv.m140784h());
        mo37818b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public static aipk m57652a(String str, int i) {
        BluetoothDevice a = airk.m57794a(str);
        if (a != null) {
            try {
                return new aipk(a, i);
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aipk", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68422a("Failed to create BleL2capClient with address %s and psm %s", (Object) a.getAddress(), i);
                return null;
            }
        } else {
            ((bnsl) ailf.f69111a.mo68387b()).mo68432a("aipk", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            throw null;
        }
    }

    /* renamed from: a */
    public static aipl m57653a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (aipl.m57664a(readInt)) {
            byte[] bArr = new byte[readInt];
            dataInputStream.readFully(bArr);
            aipl a = aipl.m57663a(bArr);
            if (a != null) {
                return a;
            }
            String valueOf = String.valueOf(ails.m57438a(bArr));
            throw new IOException(valueOf.length() == 0 ? new String("Got invalid BleL2capPacket bytes from server! raw data : ") : "Got invalid BleL2capPacket bytes from server! raw data : ".concat(valueOf));
        }
        throw new IOException("Got invalid length of BleL2capPacket from server!");
    }

    /* renamed from: a */
    public static void m57654a(DataOutputStream dataOutputStream, byte[] bArr) {
        dataOutputStream.writeInt(bArr.length);
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
    }

    /* renamed from: a */
    public final boolean mo37816a() {
        bqgy c = bqgy.m112818c();
        new soa(9, new aiph(this, c)).start();
        Boolean bool = (Boolean) ahhf.m55778c("BleL2capClient.connect", c, cfnv.f184625a.mo6606a().mo81841i());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo37817a(Set set, aipe aipe) {
        ahfi d = mo37820d();
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(this.f69436c.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(this.f69436c.getOutputStream()));
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (true) {
                byte[] bArr = null;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (TextUtils.isEmpty(str)) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                    bnsl.mo68432a("aipl", "a", 190, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Cannot serialize BleL2capPacket for REQUEST_ADVERTISEMENT without serviceId");
                } else {
                    bArr = aipl.m57666a(1, aipl.m57669b(str));
                }
                if (bArr != null) {
                    m57654a(dataOutputStream, bArr);
                    aipl a = m57653a(dataInputStream);
                    int i = a.f69438a;
                    if (i == 21) {
                        arrayList.add(a.f69440c);
                    } else if (i == 22) {
                        srn srn = ailf.f69111a;
                    }
                }
            }
            m57654a(dataOutputStream, aipl.m57666a(2, null));
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                aipe.mo37800a(i2, (byte[]) arrayList.get(i2));
            }
            return true;
        } catch (IOException e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aipk", "a", 282, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to fetch advertisement on L2CAP socket!");
            return false;
        } finally {
            d.mo36396b();
        }
    }
}
