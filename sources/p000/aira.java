package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: aira */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aira extends airi implements aiqp {

    /* renamed from: k */
    private final Map f69532k = new C1223np();

    /* renamed from: l */
    private aiqm f69533l;

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
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
        if (super.mo37896d() != false) goto L_0x00ed;
     */
    /* renamed from: a */
    public static aira m57762a(Context context, String str, airj airj, int i) {
        aipk aipk;
        boolean z;
        aira aira = new aira(context, str, airj, i);
        aira.f69548f = super.mo37897e();
        if (aira.f69548f != null) {
            int i2 = aira.f69552j;
            if (i2 > 0) {
                BluetoothDevice a = airk.m57794a(aira.f69543a);
                if (a != null) {
                    try {
                        aipk = new aipk(a, i2);
                    } catch (IOException e) {
                        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("aipk", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68422a("Failed to create BleL2capClient with address %s and psm %s", (Object) a.getAddress(), i2);
                        aipk = null;
                    }
                    if (aipk != null && aipk.mo37816a()) {
                        ahfi d = aipk.mo37820d();
                        try {
                            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(aipk.f69436c.getInputStream()));
                            aipk.m57654a(new DataOutputStream(new BufferedOutputStream(aipk.f69436c.getOutputStream())), aipl.m57666a(3, null));
                            if (aipk.m57653a(dataInputStream).f69438a == 23) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                            bnsl2.mo68432a("aipk", "g", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68431a("BleL2capClient data connection to device %s was successful? %b", (Object) aipk.f69434a, z);
                            if (z) {
                                try {
                                    super.mo37891a(aipk.f69436c.getInputStream());
                                    aira.f69550h = aipk;
                                } catch (IOException e2) {
                                    aipk.mo37818b();
                                }
                                return aira;
                            }
                        } catch (IOException e3) {
                            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                            bnsl3.mo68437a(e3);
                            bnsl3.mo68432a("aipk", "g", (int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("Failed to request data connection on L2CAP socket!");
                        } finally {
                            d.mo36396b();
                        }
                    }
                } else {
                    ((bnsl) ailf.f69111a.mo68387b()).mo68432a("aipk", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    throw null;
                }
            }
            aira.f69549g = new blvv(aira.f69548f, new airh(aira));
            aira.f69549g.mo66733f();
        }
        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68388c();
        bnsl4.mo68432a("aira", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68420a("MultiplexBleSocketV2 failed to connect to server %s.", str);
        aira.mo37883b();
        return null;
    }

    /* renamed from: b */
    private final void m57766b(int i, byte[] bArr) {
        if (this.f69533l == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aira", "b", 349, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("MultiplexBleSocketV2 connected to %s received an unexpected intro packet as a client socket.", this.f69543a);
            return;
        }
        aiqj a = mo37878a(i, bArr);
        if (a != null) {
            this.f69533l.mo37589a(a);
        }
    }

    /* renamed from: c */
    private final void m57767c(byte[] bArr) {
        try {
            bvgi bvgi = (bvgi) GeneratedMessageLite.m124014a(bvgi.f156000e, bArr);
            int a = bvgh.m121088a(bvgi.f156003b);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 0) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aira", "c", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("MultiplexBleSocketV2 connected to %s received a control frame of an unknown type.", this.f69543a);
            } else if (i2 != 1) {
                bvge bvge = bvgi.f156005d;
                if (bvge == null) {
                    bvge = bvge.f155990c;
                }
                mo37881a(bvge.f155993b.getKey());
            } else {
                bvgf bvgf = bvgi.f156004c;
                if (bvgf == null) {
                    bvgf = bvgf.f155994d;
                }
                int a2 = bvgk.m121091a(bvgf.f155998c);
                if (a2 != 0) {
                    i = a2;
                }
                int i3 = i - 1;
                bvgf bvgf2 = bvgi.f156004c;
                if (bvgf2 == null) {
                    bvgf2 = bvgf.f155994d;
                }
                byte[] k = bvgf2.f155997b.getKey();
                if (this.f69533l == null) {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl2.mo68432a("aira", "b", 349, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("MultiplexBleSocketV2 connected to %s received an unexpected intro packet as a client socket.", this.f69543a);
                    return;
                }
                aiqj a3 = mo37878a(i3, k);
                if (a3 != null) {
                    this.f69533l.mo37589a(a3);
                }
            }
        } catch (bxwf e) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("aira", "c", 324, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("MultiplexBleSocketV2 connected to %s was unable to parse control frame.", this.f69543a);
        }
    }

    private aira(Context context, String str, airj airj, int i) {
        super(context, str, null, null, airj, i);
    }

    /* renamed from: b */
    public final synchronized aiqj mo37863a(int i, String str) {
        aiqj a = mo37878a(i, ails.m57446a(str.getBytes(), 3));
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aira", "b", 198, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("MultiplexBleSocketV2 failed to create a new outgoing BLE socket for service ID %s because the BLE socket failed to initialize.", str);
            return null;
        }
        bxvd da = bvgi.f156000e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi = (bvgi) da.f164949b;
        bvgi.f156003b = 1;
        bvgi.f156002a |= 1;
        bxvd da2 = bvgf.f155994d.mo74144da();
        ByteString a2 = ByteString.m123261a(a.f69496c);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvgf bvgf = (bvgf) da2.f164949b;
        a2.getClass();
        int i2 = 1 | bvgf.f155996a;
        bvgf.f155996a = i2;
        bvgf.f155997b = a2;
        bvgf.f155998c = 2;
        bvgf.f155996a = i2 | 2;
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
            a.f69498e.mo37847a(((bvgi) da.mo74062i()).serializeToBytes());
            return a;
        } catch (IOException e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aiqj", "f", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("BleSocketV2 failed to send a introduction packet to connect for service ID hash %s.", ails.m57438a(a.f69496c));
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
            bnsl3.mo68432a("aira", "b", (int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68424a("MultiplexBleSocketV2 failed to request a new outgoing BleSocket to %s for service ID %s", this.f69543a, str);
            srz.m36171a(a);
            return null;
        }
    }

    public aira(String str, blvp blvp, BluetoothSocket bluetoothSocket, airj airj, aiqm aiqm) {
        super(null, str, blvp, bluetoothSocket, airj, 0);
        this.f69533l = aiqm;
    }

    /* renamed from: a */
    static aira m57763a(blvp blvp, airj airj, aiqm aiqm) {
        aira aira = new aira(blvp.mo66756c(), blvp, null, airj, aiqm);
        if (aira.mo37895c()) {
            return aira;
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aira", "a", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("MultiplexBleSocketV2 failed to init on GATT for client %s.", blvp.mo66756c());
        aira.mo37883b();
        return null;
    }

    /* renamed from: a */
    static aira m57764a(String str, BluetoothSocket bluetoothSocket, airj airj, aiqm aiqm) {
        aira aira = new aira(str, null, bluetoothSocket, airj, aiqm);
        if (aira.mo37895c()) {
            return aira;
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aira", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("MultiplexBleSocketV2 failed to init on L2CAP.");
        aira.mo37883b();
        return null;
    }

    /* renamed from: b */
    public final void mo37883b() {
        for (aiqj aiqj : this.f69532k.values()) {
            aiqj.mo37855g();
        }
        this.f69532k.clear();
        blux blux = this.f69549g;
        if (blux != null) {
            blux.mo66698a();
        }
        blun blun = this.f69548f;
        if (blun != null) {
            blun.mo66713b();
        }
        aipk aipk = this.f69550h;
        if (aipk != null) {
            aipk.mo37818b();
        }
        srz.m36171a(this.f69551i);
        ahhr.m55805a(this.f69546d, "PhysicalBleSocket.gattThreadOffloader");
        ahhr.m55805a(this.f69547e, "PhysicalBleSocket.l2capReaderThread");
    }

    /* renamed from: a */
    private final void m57765a(byte[] bArr, byte[] bArr2) {
        try {
            aiqj aiqj = (aiqj) this.f69532k.get(sqd.m35972d(bArr));
            if (aiqj == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aira", "a", 369, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68425a("MultiplexBleSocketV2 connected to %s and seems APP stop listening service ID hash %s but still have enqueued data(or still receive incoming data) %s.", this.f69543a, ails.m57438a(bArr), ails.m57438a(bArr2));
                return;
            }
            aiqj.f69497d.write(bArr2);
            if (cfnv.m140741C()) {
                aiqj.f69497d.flush();
            }
        } catch (IOException e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aira", "a", 375, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("MultiplexBleSocketV2 connected to %s encountered an error while receiving incoming data for service ID hash %s.", this.f69543a, ails.m57438a(bArr));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized boolean mo37884b(aips aips) {
        if (aips.mo37831a()) {
            return true;
        }
        if (((aiqj) this.f69532k.get(sqd.m35972d(aips.f69459b))) == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c A[SYNTHETIC, Splitter:B:27:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0095 A[SYNTHETIC, Splitter:B:37:0x0095] */
    /* renamed from: a */
    public final synchronized aiqj mo37878a(int i, byte[] bArr) {
        OutputStream outputStream;
        aiqj aiqj;
        String d = sqd.m35972d(bArr);
        if (this.f69532k.containsKey(d)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aira", "a", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("MultiplexBleSocketV2 failed to create a new BLE socket for service ID hash %s because there is already an active BLE socket under the same service ID.", ails.m57438a(bArr));
            return null;
        }
        aiqz aiqz = new aiqz(this, bArr);
        int i2 = 0;
        try {
            aipk aipk = this.f69550h;
            if (aipk != null) {
                outputStream = aipk.f69436c.getOutputStream();
                try {
                    i2 = this.f69550h.f69436c.getMaxTransmitPacketSize();
                } catch (IOException e) {
                }
                if (outputStream == null) {
                    aiqj = aiqj.m57706a(i, bArr, aiqz, new aiqh(bArr, null, outputStream), i2);
                } else {
                    blux blux = this.f69549g;
                    if (blux != null) {
                        aiqj = aiqj.m57706a(i, bArr, aiqz, new aiqh(bArr, blux, null), this.f69548f.mo66711a());
                    } else {
                        aiqj = null;
                    }
                }
                if (aiqj != null) {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl2.mo68432a("aira", "a", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("MultiplexBleSocketV2 failed to create a new BLE socket for service ID hash %s because without a physical connection.", ails.m57438a(bArr));
                    return null;
                }
                this.f69532k.put(d, aiqj);
                return aiqj;
            }
            BluetoothSocket bluetoothSocket = this.f69551i;
            if (bluetoothSocket != null) {
                outputStream = bluetoothSocket.getOutputStream();
                i2 = this.f69551i.getMaxTransmitPacketSize();
            } else {
                outputStream = null;
            }
            if (outputStream == null) {
            }
            if (aiqj != null) {
            }
        } catch (IOException e2) {
            outputStream = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo37879a() {
        mo37883b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37880a(aips aips) {
        if (!aips.mo37831a()) {
            byte[] bArr = aips.f69459b;
            byte[] bArr2 = aips.f69460c;
            try {
                aiqj aiqj = (aiqj) this.f69532k.get(sqd.m35972d(bArr));
                if (aiqj == null) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                    bnsl.mo68432a("aira", "a", 369, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68425a("MultiplexBleSocketV2 connected to %s and seems APP stop listening service ID hash %s but still have enqueued data(or still receive incoming data) %s.", this.f69543a, ails.m57438a(bArr), ails.m57438a(bArr2));
                    return;
                }
                aiqj.f69497d.write(bArr2);
                if (cfnv.m140741C()) {
                    aiqj.f69497d.flush();
                }
            } catch (IOException e) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("aira", "a", 375, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68424a("MultiplexBleSocketV2 connected to %s encountered an error while receiving incoming data for service ID hash %s.", this.f69543a, ails.m57438a(bArr));
            }
        } else {
            try {
                bvgi bvgi = (bvgi) GeneratedMessageLite.m124014a(bvgi.f156000e, aips.f69460c);
                int a = bvgh.m121088a(bvgi.f156003b);
                int i = 1;
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 1;
                if (i2 == 0) {
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
                    bnsl3.mo68432a("aira", "c", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("MultiplexBleSocketV2 connected to %s received a control frame of an unknown type.", this.f69543a);
                } else if (i2 != 1) {
                    bvge bvge = bvgi.f156005d;
                    if (bvge == null) {
                        bvge = bvge.f155990c;
                    }
                    mo37881a(bvge.f155993b.getKey());
                } else {
                    bvgf bvgf = bvgi.f156004c;
                    if (bvgf == null) {
                        bvgf = bvgf.f155994d;
                    }
                    int a2 = bvgk.m121091a(bvgf.f155998c);
                    if (a2 != 0) {
                        i = a2;
                    }
                    int i3 = i - 1;
                    bvgf bvgf2 = bvgi.f156004c;
                    if (bvgf2 == null) {
                        bvgf2 = bvgf.f155994d;
                    }
                    byte[] k = bvgf2.f155997b.getKey();
                    if (this.f69533l == null) {
                        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl4.mo68432a("aira", "b", 349, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68420a("MultiplexBleSocketV2 connected to %s received an unexpected intro packet as a client socket.", this.f69543a);
                        return;
                    }
                    aiqj a3 = mo37878a(i3, k);
                    if (a3 != null) {
                        this.f69533l.mo37589a(a3);
                    }
                }
            } catch (bxwf e2) {
                bnsl bnsl5 = (bnsl) ailf.f69111a.mo68388c();
                bnsl5.mo68437a(e2);
                bnsl5.mo68432a("aira", "c", 324, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68420a("MultiplexBleSocketV2 connected to %s was unable to parse control frame.", this.f69543a);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo37881a(byte[] bArr) {
        aiqj aiqj = (aiqj) this.f69532k.remove(sqd.m35972d(bArr));
        if (aiqj != null) {
            aiqj.mo37855g();
            if (this.f69532k.isEmpty()) {
                mo37879a();
            }
        }
    }
}
