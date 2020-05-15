package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.SystemClock;
import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.fastpair.ConnectException;
import com.google.android.libraries.bluetooth.fastpair.PairingException;
import java.math.BigInteger;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.KeyAgreement;

/* renamed from: aypk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aypk {

    /* renamed from: h */
    public static final /* synthetic */ int f98171h = 0;

    /* renamed from: i */
    private static String f98172i;

    /* renamed from: j */
    private static final byte[] f98173j;

    /* renamed from: k */
    private static final byte[] f98174k;

    /* renamed from: a */
    public final aysk f98175a;

    /* renamed from: b */
    public ayph f98176b;

    /* renamed from: c */
    public String f98177c;

    /* renamed from: d */
    public aypg f98178d;

    /* renamed from: e */
    aypf f98179e;

    /* renamed from: f */
    public String f98180f;

    /* renamed from: g */
    public ahue f98181g;

    /* renamed from: l */
    private final Context f98182l;

    /* renamed from: m */
    private final ayqk f98183m;

    /* renamed from: n */
    private final ayox f98184n;

    /* renamed from: o */
    private final String f98185o;

    /* renamed from: p */
    private final ayqt f98186p;

    /* renamed from: q */
    private aypp f98187q;

    /* renamed from: r */
    private boolean f98188r;

    /* renamed from: s */
    private byte[] f98189s;

    /* renamed from: t */
    private byte[] f98190t;

    /* renamed from: u */
    private String f98191u = null;

    /* renamed from: v */
    private boolean f98192v = false;

    static {
        ayqg ayqg = new ayqg((byte) 1, aynu.m84379a(ByteOrder.LITTLE_ENDIAN, 4363, 4382, 4360));
        byte[] bArr = ayqg.f98231b;
        byte[] a = bqce.m112562a(new byte[]{(byte) (bArr.length + 1), ayqg.f98230a}, bArr);
        f98173j = a;
        f98174k = bqce.m112562a(new byte[]{1, 1}, a);
    }

    public aypk(Context context, String str, ayqk ayqk, ahts ahts) {
        ayqt ayqt = new ayqt("FastPairConnection", ayqk);
        aysk b = aysk.m84701b();
        bmxy.m108581a(b);
        this.f98175a = b;
        this.f98182l = context;
        this.f98183m = ayqk;
        this.f98184n = new ayox(ahts);
        this.f98185o = str;
        this.f98186p = ayqt;
    }

    /* renamed from: a */
    private static int m84419a(BluetoothAdapter bluetoothAdapter) {
        int i = Build.VERSION.SDK_INT;
        try {
            return ((Integer) ayqm.m84613a(bluetoothAdapter).mo54282a("getLeState", new Class[0]).mo54281b(new Object[0])).intValue();
        } catch (ayqn e) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aypk", "b", 1596, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't call getLeState");
            return bluetoothAdapter.getState();
        }
    }

    /* renamed from: b */
    private static int m84429b(BluetoothAdapter bluetoothAdapter) {
        try {
            return ((Integer) ayqm.m84613a(bluetoothAdapter).mo54282a("getLeState", new Class[0]).mo54281b(new Object[0])).intValue();
        } catch (ayqn e) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aypk", "b", 1596, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't call getLeState");
            return bluetoothAdapter.getState();
        }
    }

    /* renamed from: c */
    private static void m84434c(BluetoothAdapter bluetoothAdapter) {
        try {
            ayqm.m84613a(bluetoothAdapter).mo54282a("disableBLE", new Class[0]).mo54280a(new Object[0]);
        } catch (ayqn e) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aypk", "c", 1605, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't call disableBLE");
        }
    }

    /* renamed from: d */
    private final void m84438d(byte[] bArr, String str) {
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypk", "d", 1342, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Writing new device name to address=%s", str);
        ayri a = this.f98187q.mo54203a();
        a.mo54312a(TimeUnit.SECONDS.toMillis((long) this.f98183m.mo54119a()));
        a.mo54313a(ayod.f98113a, ayoa.f98107a, bArr);
        bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
        bnsl2.mo68432a("aypk", "d", 1347, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Finished writing new device name=%s", boan.f132472f.mo68794a(bArr));
    }

    /* renamed from: d */
    private static final boolean m84440d(byte[] bArr) {
        return bArr != null && bArr.length == 64;
    }

    /* renamed from: f */
    private final boolean m84441f() {
        return m84440d(this.f98190t);
    }

    /* renamed from: g */
    private final ayrl m84442g() {
        return m84430b(m84441f());
    }

    /* renamed from: h */
    private final aypx m84443h() {
        if (this.f98187q == null) {
            this.f98187q = new aypp(this.f98182l, this.f98183m, this.f98184n, this.f98175a, new ayoz(this), this.f98185o, this.f98186p, m84442g());
        }
        return new aypx(this.f98187q, this.f98185o, this.f98183m.mo54119a());
    }

    /* renamed from: i */
    private final void m84444i() {
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypk", "i", 1403, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("register for the device name response from address=%s", this.f98185o);
        ayri a = this.f98187q.mo54203a();
        a.mo54312a(TimeUnit.SECONDS.toMillis((long) this.f98183m.mo54119a()));
        try {
            this.f98179e = new aypf(a);
        } catch (BluetoothException e) {
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
            bnsl2.mo68432a("aypk", "i", 1411, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Can't register for device name response, no naming characteristic.");
        }
    }

    /* renamed from: j */
    private final void m84445j() {
        ayph ayph = this.f98176b;
        if (ayph != null) {
            String str = this.f98177c;
            if (str == null) {
                str = this.f98185o;
            }
            ayph.mo37165a(str);
        }
    }

    /* renamed from: b */
    public final byte[] mo54197b() {
        aypg aypg = this.f98178d;
        if (aypg != null) {
            return aypg.f98161a;
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m84439d(BluetoothAdapter bluetoothAdapter) {
        try {
            return ((Boolean) ayqm.m84613a(bluetoothAdapter).mo54282a("isLeEnabled", new Class[0]).mo54281b(new Object[0])).booleanValue();
        } catch (ayqn e) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aypk", "d", 1613, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't call isLeEnabled");
            if (bluetoothAdapter.getState() == 12) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: e */
    public final void mo54201e() {
        try {
            mo54190a((byte[]) null);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Should never happen, no security key!", e);
        }
    }

    /* renamed from: c */
    private final void m84435c(byte[] bArr, String str) {
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypk", "c", 1330, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Writing account key to address=%s", str);
        ayri a = this.f98187q.mo54203a();
        a.mo54312a(TimeUnit.SECONDS.toMillis((long) this.f98183m.mo54119a()));
        a.mo54313a(ayod.f98113a, aynv.f98094a, bArr);
        bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
        bnsl2.mo68432a("aypk", "c", 1336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Finished writing encrypted account key=%s", boan.f132472f.mo68794a(bArr));
    }

    /* renamed from: b */
    private final ayrl m84430b(boolean z) {
        ayrk e = ayrl.m84663e();
        if (z) {
            e.f98351a = bmxv.m108566b(83);
        }
        e.mo54321a(TimeUnit.SECONDS.toMillis((long) this.f98183m.mo54126b()));
        return e.mo54320a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x026a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x026a A[ExcHandler: ayqf | ayqq (e java.lang.Throwable), Splitter:B:14:0x00d8] */
    /* renamed from: a */
    private final aypd m84420a(ayri ayri) {
        byte[] bArr;
        short[] sArr;
        BluetoothGattDescriptor bluetoothGattDescriptor;
        byte b;
        int i;
        int i2;
        ayri ayri2 = ayri;
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypk", "a", 1225, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Connecting GATT server to BLE address=%s", this.f98185o);
        bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
        bnsl2.mo68432a("aypk", "a", 1226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Telling device to become discoverable");
        this.f98184n.mo54180a(bvjc.BR_EDR_HANDOVER_WRITE_CONTROL_POINT_REQUEST);
        ayrh c = ayri2.mo54316c(ayoj.f98121a, ayoi.f98120a);
        ayri2.mo54313a(ayoj.f98121a, ayoi.f98120a, f98174k);
        byte[] a = c.mo54309a(TimeUnit.SECONDS.toMillis((long) this.f98183m.mo54119a()));
        aypi a2 = aypi.m84416a(a);
        if (a2 == aypi.SUCCESS) {
            this.f98184n.mo54183b();
            bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
            bnsl3.mo68432a("aypk", "b", 1254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Getting Bluetooth MAC");
            this.f98184n.mo54180a(bvjc.BR_EDR_HANDOVER_READ_BLUETOOTH_MAC);
            byte[] b2 = ayri2.mo54315b(ayoj.f98121a, aynt.m84375a(this.f98183m.mo54145s()));
            if (b2 != null && b2.length >= 7) {
                aynu aynu = new aynu(Arrays.copyOfRange(b2, 1, 7), ByteOrder.LITTLE_ENDIAN);
                if (!aynu.f98093b.equals(ByteOrder.BIG_ENDIAN)) {
                    byte[] bArr2 = aynu.f98092a;
                    bArr = new byte[bArr2.length];
                    int i3 = 0;
                    while (true) {
                        int length = bArr2.length;
                        if (i3 >= length) {
                            break;
                        }
                        bArr[i3] = bArr2[(length - i3) - 1];
                        i3++;
                    }
                } else {
                    bArr = aynu.f98092a;
                }
                this.f98184n.mo54183b();
                this.f98184n.mo54180a(bvjc.BR_EDR_HANDOVER_READ_TRANSPORT_BLOCK);
                try {
                    UUID uuid = ayoj.f98121a;
                    UUID a3 = aynt.m84375a(this.f98183m.mo54146t());
                    UUID a4 = aynt.m84375a(this.f98183m.mo54149v());
                    Object[] objArr = {a4, a3, uuid};
                    bluetoothGattDescriptor = null;
                    for (BluetoothGattDescriptor bluetoothGattDescriptor2 : ayri2.mo54310a(uuid, a3).getDescriptors()) {
                        if (bluetoothGattDescriptor2.getUuid().equals(a4)) {
                            if (bluetoothGattDescriptor == null) {
                                bluetoothGattDescriptor = bluetoothGattDescriptor2;
                            } else {
                                throw new BluetoothException(String.format("More than one descriptor %s found on characteristic %s service %s on device %s.", a4, a3, uuid, ayri2.f98336d.mo54358a()));
                            }
                        }
                    }
                    if (bluetoothGattDescriptor != null) {
                        byte[] bArr3 = (byte[]) ayri2.f98337e.mo54410a(new ayre(ayri2, new Object[]{ayro.READ_DESCRIPTOR, ayri2.f98336d, bluetoothGattDescriptor}, bluetoothGattDescriptor), ayri2.f98343k);
                        bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
                        bnsl4.mo68432a("aypk", "c", 1281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68420a("Got transport block: %s", boan.f132472f.mo68788c().mo68794a(bArr3));
                        int length2 = bArr3.length;
                        if (length2 >= 4) {
                            int i4 = bArr3[2] + 3;
                            if (length2 >= i4) {
                                byte[] copyOfRange = Arrays.copyOfRange(bArr3, 3, i4);
                                ArrayList arrayList = new ArrayList();
                                int i5 = 0;
                                while (true) {
                                    int length3 = copyOfRange.length;
                                    if (i5 >= length3) {
                                        Iterator it = arrayList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                sArr = new short[0];
                                                break;
                                            }
                                            ayqg ayqg = (ayqg) it.next();
                                            if (ayqg.f98230a == 1) {
                                                sArr = aynu.m84380a(ByteOrder.LITTLE_ENDIAN, ayqg.f98231b);
                                                break;
                                            }
                                        }
                                        this.f98184n.mo54183b();
                                    } else {
                                        b = copyOfRange[i5];
                                        int i6 = b - 1;
                                        if (i6 >= 0 && length3 >= (i2 = (i = i5 + 2) + i6)) {
                                            arrayList.add(new ayqg(copyOfRange[i5 + 1], Arrays.copyOfRange(copyOfRange, i, i2)));
                                            i5 += i6 + 2;
                                        }
                                    }
                                }
                                throw new ayqf("Wrong length=%d at index=%d in LTVs=%s", Byte.valueOf(b), Integer.valueOf(i5), boan.f132472f.mo68794a(copyOfRange));
                            }
                            throw new ayqq(4, "Transport Block has wrong length byte: %s", boan.f132472f.mo68788c().mo68794a(bArr3));
                        }
                        throw new ayqq(4, "Transport Block null or too short: %s", boan.f132472f.mo68788c().mo68794a(bArr3));
                    }
                    throw new BluetoothException(String.format("Descriptor %s not found on characteristic %s on service %s of device %s.", a4, a3, uuid, ayri2.f98336d.mo54358a()));
                } catch (BluetoothException e) {
                    throw new BluetoothException(String.format("Failed to read %s on %s on device %s.", bluetoothGattDescriptor.getUuid(), aysx.m84756b(bluetoothGattDescriptor), ayri2.f98336d.mo54358a()), e);
                } catch (ayqf | ayqq e2) {
                } catch (BluetoothException e3) {
                    e = e3;
                    bnsl bnsl5 = (bnsl) aypn.f98194a.mo68388c();
                    bnsl5.mo68437a(e);
                    bnsl5.mo68432a("aypk", "c", 1286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("Failed to get supported profiles from transport block.");
                    this.f98184n.mo54181a(e);
                    sArr = new short[0];
                    return new aypd(bArr, sArr);
                }
            } else {
                Object[] objArr2 = new Object[1];
                objArr2[0] = b2 != null ? boan.f132472f.mo68788c().mo68794a(b2) : "(none)";
                throw new ayqq(3, "Bluetooth MAC not contained in BR handover data: %s", objArr2);
            }
        } else {
            throw new ayqq(2, "TDS Control Point result code (%s) was not success in response %s", a2, boan.f132472f.mo68788c().mo68794a(a));
        }
    }

    /* renamed from: c */
    private static short[] m84436c(BluetoothDevice bluetoothDevice) {
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypk", "c", 1497, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Got supported UUIDs: %s", Arrays.toString(uuids));
        if (uuids == null) {
            uuids = new ParcelUuid[0];
        }
        int length = uuids.length;
        ArrayList arrayList = new ArrayList(length);
        for (ParcelUuid parcelUuid : uuids) {
            UUID uuid = parcelUuid.getUuid();
            if (aynt.m84378b(uuid)) {
                arrayList.add(Short.valueOf(aynt.m84376a(uuid)));
            }
        }
        return bqct.m112603a(arrayList);
    }

    /* renamed from: d */
    public final String mo54200d() {
        if (!TextUtils.isEmpty(f98172i)) {
            String str = f98172i;
            f98172i = null;
            return str;
        }
        if (this.f98187q == null) {
            aypp aypp = new aypp(this.f98182l, this.f98183m, this.f98184n, this.f98175a, new aypb(this), this.f98185o, this.f98186p, m84430b(true));
            this.f98187q = aypp;
            aypp.mo54205b();
        }
        ayri a = this.f98187q.mo54203a();
        a.mo54312a(TimeUnit.SECONDS.toMillis((long) this.f98183m.mo54119a()));
        try {
            String str2 = new String(a.mo54315b(ayod.f98113a, aynt.m84375a(this.f98183m.mo54148u())));
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("aypk", "d", 1385, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("FastPair: Got the firmware info version number = %s", str2);
            this.f98187q.mo54205b();
            return str2;
        } catch (BluetoothException e) {
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aypk", "d", 1389, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("FastPair: can't read firmware characteristic.");
            this.f98187q.mo54205b();
            return null;
        }
    }

    /* renamed from: b */
    private final byte[] m84431b(ayri ayri) {
        String str;
        byte[] bArr;
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypk", "b", 1254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Getting Bluetooth MAC");
        this.f98184n.mo54180a(bvjc.BR_EDR_HANDOVER_READ_BLUETOOTH_MAC);
        byte[] b = ayri.mo54315b(ayoj.f98121a, aynt.m84375a(this.f98183m.mo54145s()));
        int i = 0;
        if (b != null && b.length >= 7) {
            aynu aynu = new aynu(Arrays.copyOfRange(b, 1, 7), ByteOrder.LITTLE_ENDIAN);
            if (!aynu.f98093b.equals(ByteOrder.BIG_ENDIAN)) {
                byte[] bArr2 = aynu.f98092a;
                bArr = new byte[bArr2.length];
                while (true) {
                    int length = bArr2.length;
                    if (i >= length) {
                        break;
                    }
                    bArr[i] = bArr2[(length - i) - 1];
                    i++;
                }
            } else {
                bArr = aynu.f98092a;
            }
            this.f98184n.mo54183b();
            return bArr;
        }
        Object[] objArr = new Object[1];
        if (b != null) {
            str = boan.f132472f.mo68788c().mo68794a(b);
        } else {
            str = "(none)";
        }
        objArr[0] = str;
        throw new ayqq(3, "Bluetooth MAC not contained in BR handover data: %s", objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x019e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x019e A[ExcHandler: ayqf | ayqq (e java.lang.Throwable), Splitter:B:1:0x0012] */
    /* renamed from: c */
    private final short[] m84437c(ayri ayri) {
        BluetoothGattDescriptor bluetoothGattDescriptor;
        short[] sArr;
        byte b;
        int i;
        int i2;
        ayri ayri2 = ayri;
        this.f98184n.mo54180a(bvjc.BR_EDR_HANDOVER_READ_TRANSPORT_BLOCK);
        try {
            UUID uuid = ayoj.f98121a;
            UUID a = aynt.m84375a(this.f98183m.mo54146t());
            UUID a2 = aynt.m84375a(this.f98183m.mo54149v());
            Object[] objArr = {a2, a, uuid};
            bluetoothGattDescriptor = null;
            for (BluetoothGattDescriptor bluetoothGattDescriptor2 : ayri2.mo54310a(uuid, a).getDescriptors()) {
                if (bluetoothGattDescriptor2.getUuid().equals(a2)) {
                    if (bluetoothGattDescriptor == null) {
                        bluetoothGattDescriptor = bluetoothGattDescriptor2;
                    } else {
                        throw new BluetoothException(String.format("More than one descriptor %s found on characteristic %s service %s on device %s.", a2, a, uuid, ayri2.f98336d.mo54358a()));
                    }
                }
            }
            if (bluetoothGattDescriptor != null) {
                byte[] bArr = (byte[]) ayri2.f98337e.mo54410a(new ayre(ayri2, new Object[]{ayro.READ_DESCRIPTOR, ayri2.f98336d, bluetoothGattDescriptor}, bluetoothGattDescriptor), ayri2.f98343k);
                bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                bnsl.mo68432a("aypk", "c", 1281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Got transport block: %s", boan.f132472f.mo68788c().mo68794a(bArr));
                int length = bArr.length;
                if (length >= 4) {
                    int i3 = bArr[2] + 3;
                    if (length >= i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, 3, i3);
                        ArrayList arrayList = new ArrayList();
                        int i4 = 0;
                        while (true) {
                            int length2 = copyOfRange.length;
                            if (i4 >= length2) {
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        sArr = new short[0];
                                        break;
                                    }
                                    ayqg ayqg = (ayqg) it.next();
                                    if (ayqg.f98230a == 1) {
                                        sArr = aynu.m84380a(ByteOrder.LITTLE_ENDIAN, ayqg.f98231b);
                                        break;
                                    }
                                }
                                this.f98184n.mo54183b();
                                return sArr;
                            }
                            b = copyOfRange[i4];
                            int i5 = b - 1;
                            if (i5 >= 0 && length2 >= (i2 = (i = i4 + 2) + i5)) {
                                arrayList.add(new ayqg(copyOfRange[i4 + 1], Arrays.copyOfRange(copyOfRange, i, i2)));
                                i4 += i5 + 2;
                            }
                        }
                        throw new ayqf("Wrong length=%d at index=%d in LTVs=%s", Byte.valueOf(b), Integer.valueOf(i4), boan.f132472f.mo68794a(copyOfRange));
                    }
                    throw new ayqq(4, "Transport Block has wrong length byte: %s", boan.f132472f.mo68788c().mo68794a(bArr));
                }
                throw new ayqq(4, "Transport Block null or too short: %s", boan.f132472f.mo68788c().mo68794a(bArr));
            }
            throw new BluetoothException(String.format("Descriptor %s not found on characteristic %s on service %s of device %s.", a2, a, uuid, ayri2.f98336d.mo54358a()));
        } catch (BluetoothException e) {
            throw new BluetoothException(String.format("Failed to read %s on %s on device %s.", bluetoothGattDescriptor.getUuid(), aysx.m84756b(bluetoothGattDescriptor), ayri2.f98336d.mo54358a()), e);
        } catch (ayqf | ayqq e2) {
        } catch (BluetoothException e3) {
            e = e3;
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aypk", "c", 1286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to get supported profiles from transport block.");
            this.f98184n.mo54181a(e);
            return new short[0];
        }
    }

    /* renamed from: b */
    private final byte[] m84432b(byte[] bArr, String str) {
        ayqr ayqr;
        ayqr ayqr2;
        if (this.f98189s == null) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68388c();
            bnsl.mo68432a("aypk", "b", 856, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Pairing secret was null, account key couldn't be encrypted or written.");
            return null;
        }
        if (!this.f98183m.mo54101I()) {
            ayqr ayqr3 = new ayqr(this.f98186p, "Close GATT and sleep");
            try {
                this.f98187q.mo54205b();
                Thread.sleep((long) this.f98183m.mo54100H());
                ayqr3.close();
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        try {
            ayqr = new ayqr(this.f98186p, "Encrypt key");
            byte[] a = aynf.m84293a(this.f98189s, bArr);
            ayqr.close();
            int i = 1;
            while (i <= this.f98183m.mo54139m()) {
                this.f98184n.mo54180a(bvjc.WRITE_ACCOUNT_KEY);
                try {
                    ayqt ayqt = this.f98186p;
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Write key via GATT #");
                    sb.append(i);
                    ayqr2 = new ayqr(ayqt, sb.toString());
                    bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                    bnsl2.mo68432a("aypk", "c", 1330, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Writing account key to address=%s", str);
                    ayri a2 = this.f98187q.mo54203a();
                    a2.mo54312a(TimeUnit.SECONDS.toMillis((long) this.f98183m.mo54119a()));
                    a2.mo54313a(ayod.f98113a, aynv.f98094a, a);
                    bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
                    bnsl3.mo68432a("aypk", "c", 1336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Finished writing encrypted account key=%s", boan.f132472f.mo68794a(a));
                    this.f98184n.mo54183b();
                    ayqr2.close();
                    return bArr;
                } catch (BluetoothException e) {
                    bnsl bnsl4 = (bnsl) aypn.f98194a.mo68388c();
                    bnsl4.mo68437a(e);
                    bnsl4.mo68432a("aypk", "b", 884, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68411a("Error writing account key attempt %d of %d", i, this.f98183m.mo54139m());
                    this.f98184n.mo54181a(e);
                    Thread.sleep((long) this.f98183m.mo54100H());
                    i++;
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            }
            return null;
        } catch (GeneralSecurityException e2) {
            bnsl bnsl5 = (bnsl) aypn.f98194a.mo68388c();
            bnsl5.mo68437a(e2);
            bnsl5.mo68432a("aypk", "b", 873, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Failed to encrypt key.");
            return null;
        } catch (Throwable th3) {
            bqye.m113761a(th, th3);
        }
        throw th;
        throw th;
        throw th;
    }

    /* renamed from: b */
    private final short[] m84433b(BluetoothDevice bluetoothDevice) {
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypk", "b", 1484, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Getting supported profiles via SDP (Bluetooth Classic) for %s", bluetoothDevice.getAddress());
        ayom ayom = new ayom(this.f98182l, this.f98183m, bluetoothDevice, "android.bluetooth.device.action.UUID");
        try {
            bluetoothDevice.fetchUuidsWithSdp();
            ayom.mo54283a((long) this.f98183m.mo54135i(), TimeUnit.SECONDS);
            ayom.close();
            return m84436c(bluetoothDevice);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final Intent mo54196b(byte[] bArr) {
        Intent intent = new Intent("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_DEVICE_ADDED");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.nearby.discovery.service.DiscoveryService");
        intent.putExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS", this.f98185o);
        String str = this.f98177c;
        if (str != null) {
            intent.putExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS", str);
        }
        intent.putExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY", bArr);
        intent.putExtra("com.google.android.gms.nearby.discovery.EXTRA_RETROACTIVE_PAIR", this.f98183m.mo54120aa());
        return intent;
    }

    /* renamed from: c */
    public final void mo54198c() {
        if (this.f98183m.mo54140n()) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("aypk", "c", 1041, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Turning Bluetooth off.");
            this.f98184n.mo54180a(bvjc.DISABLE_BLUETOOTH);
            this.f98175a.f98418a.disable();
            int i = Build.VERSION.SDK_INT;
            try {
                ayqm.m84613a(this.f98175a.f98418a).mo54282a("disableBLE", new Class[0]).mo54280a(new Object[0]);
            } catch (ayqn e) {
                bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("aypk", "c", 1605, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Can't call disableBLE");
            }
            try {
                m84423a(10);
                this.f98184n.mo54183b();
            } catch (TimeoutException e2) {
                this.f98184n.mo54181a(e2);
                bnsl bnsl3 = (bnsl) aypn.f98194a.mo68388c();
                bnsl3.mo68437a(e2);
                bnsl3.mo68432a("aypk", "c", 1054, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("Bluetooth still on. BluetoothAdapter state=%s", m84419a(this.f98175a.f98418a));
            }
            bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
            bnsl4.mo68432a("aypk", "c", 1061, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Turning Bluetooth on.");
            this.f98184n.mo54180a(bvjc.ENABLE_BLUETOOTH);
            this.f98175a.f98418a.enable();
            m84423a(12);
            this.f98184n.mo54183b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo54199c(byte[] bArr) {
        if (!this.f98183m.mo54117Y()) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("aypk", "c", 910, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("The provider has already paired with the account, skip writing account key.");
            return false;
        } else if (bArr[0] != 4) {
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
            bnsl2.mo68432a("aypk", "c", 915, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("The provider has already paired with the account, but accountKey[0] != 0x04. Forget the device from the account and re-try");
            return false;
        } else {
            bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
            bnsl3.mo68432a("aypk", "c", 921, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("The provider has already paired with the account, still write the same account key.");
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad A[Catch:{ all -> 0x018d }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0184 A[SYNTHETIC, Splitter:B:79:0x0184] */
    /* renamed from: a */
    private final aypj m84421a(BluetoothDevice bluetoothDevice) {
        byte[] bArr;
        byte[] bArr2;
        byte[] b;
        ayqr ayqr;
        if (!this.f98183m.mo54099G() || this.f98183m.mo54139m() <= 0 || !m84441f()) {
            return null;
        }
        aypg aypg = this.f98178d;
        if (aypg != null) {
            bArr = aypg.f98161a;
        } else {
            bArr = null;
        }
        if (bArr == null) {
            ayqr ayqr2 = new ayqr(this.f98186p, "Write account key");
            try {
                if (this.f98183m.mo54118Z()) {
                    String str = this.f98180f;
                    if (str != null) {
                        bArr2 = ayol.m84385a(ayol.m84384a(this.f98182l), str);
                        b = m84432b(bArr2, bluetoothDevice.getAddress());
                        if (b == null) {
                            if (!this.f98183m.mo54120aa()) {
                                try {
                                    ayqr = new ayqr(this.f98186p, "Start CloudSyncing");
                                    this.f98182l.startService(mo54196b(b));
                                    ayqr.close();
                                } catch (SecurityException e) {
                                    bnsl bnsl = (bnsl) aypn.f98194a.mo68388c();
                                    bnsl.mo68437a(e);
                                    bnsl.mo68432a("aypk", "a", 805, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl.mo68405a("Error adding device.");
                                } catch (Throwable th) {
                                    bqye.m113761a(th, th);
                                }
                            }
                            ayqr2.close();
                            bArr = b;
                        } else {
                            this.f98187q.mo54205b();
                            ayqr2.close();
                            return null;
                        }
                    }
                }
                byte[] a = aynf.m84291a();
                a[0] = 4;
                bArr2 = a;
                b = m84432b(bArr2, bluetoothDevice.getAddress());
                if (b == null) {
                }
            } catch (Throwable th2) {
                try {
                    ayqr2.close();
                } catch (Throwable th3) {
                    bqye.m113761a(th2, th3);
                }
                throw th2;
            }
        } else if (!this.f98183m.mo54117Y()) {
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
            bnsl2.mo68432a("aypk", "c", 910, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("The provider has already paired with the account, skip writing account key.");
        } else if (bArr[0] != 4) {
            bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
            bnsl3.mo68432a("aypk", "c", 915, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("The provider has already paired with the account, but accountKey[0] != 0x04. Forget the device from the account and re-try");
        } else {
            bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
            bnsl4.mo68432a("aypk", "c", 921, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("The provider has already paired with the account, still write the same account key.");
            m84432b(bArr, bluetoothDevice.getAddress());
        }
        ayqr ayqr3 = new ayqr(this.f98186p, "Send the account key to Validator");
        try {
            Context context = this.f98182l;
            if (ayqx.m84636a(context)) {
                bnsl bnsl5 = (bnsl) aypn.f98194a.mo68390d();
                bnsl5.mo68432a("ayqx", "a", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Send account key to validator");
                context.sendBroadcast(new Intent("com.google.android.libraries.bluetooth.fastpair.action.SEND_ACCOUNT_KEY").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY", bArr));
            } else {
                bnsp bnsp = aypn.f98194a;
            }
            ayqr3.close();
            if (this.f98183m.mo54115W() && this.f98192v && m84427a(this.f98187q.mo54203a(), ayoa.f98107a)) {
                ayqr ayqr4 = new ayqr(this.f98186p, "WriteNameToProvider");
                try {
                    mo54194a(this.f98191u, bluetoothDevice.getAddress());
                    ayqr4.close();
                } catch (Throwable th4) {
                    bqye.m113761a(th, th4);
                }
            }
            this.f98187q.mo54205b();
            return new ayng(bArr, bluetoothDevice.getAddress());
        } catch (Throwable th5) {
            bqye.m113761a(th, th5);
        }
        throw th;
        throw th;
        throw th;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:226:0x04fc */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:46:0x0173 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:73:0x0201 */
    /* JADX WARN: Type inference failed for: r20v15, types: [boolean], assign insn: 0x0122: INVOKE  (r20v15 ? I:boolean) = (r14v23 java.util.Iterator<android.bluetooth.BluetoothGattDescriptor>) type: INTERFACE call: java.util.Iterator.hasNext():boolean */
    /* JADX WARN: Type inference failed for: r20v17, assign insn: PHI: (r20v17 ?) = (r20v15 ?), (r20v15 ?), (r20v22 ?) binds: [B:46:0x0173, B:48:0x0192, B:73:0x0201] */
    /* JADX WARN: Type inference failed for: r20v22, assign insn: 0x01fb: MOVE  (r20v22 ? I:?[OBJECT, ARRAY]) = (r9v13 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v95, assign insn: ?: MOVE  (r2v95 ?) = (r2v4 ayqk) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0171, code lost:
        if (r4 == null) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r5 = (byte[]) r3.f98337e.mo54410a(new p000.ayre(r3, new java.lang.Object[]{p000.ayro.f98364h, r3.f98336d, r4}, r4), r3.f98343k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r3 = (p000.bnsl) p000.aypn.f98194a.mo68390d();
        r3.mo68432a("aypk", "c", 1281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r3.mo68420a("Got transport block: %s", p000.boan.f132472f.mo68788c().mo68794a(r5));
        r3 = r5.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b0, code lost:
        if (r3 < 4) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b2, code lost:
        r8 = r5[2] + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b7, code lost:
        if (r3 < r8) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b9, code lost:
        r3 = java.util.Arrays.copyOfRange(r5, 3, r8);
        r4 = new java.util.ArrayList();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c3, code lost:
        r8 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c4, code lost:
        if (r5 < r8) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r3 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ce, code lost:
        if (r3.hasNext() == false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d0, code lost:
        r4 = (p000.ayqg) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d9, code lost:
        if (r4.f98230a == 1) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01dc, code lost:
        r3 = p000.aynu.m84380a(java.nio.ByteOrder.LITTLE_ENDIAN, r4.f98231b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e5, code lost:
        r3 = new short[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ea, code lost:
        r7.f98184n.mo54183b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ef, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r13 = r3[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f5, code lost:
        r14 = r13 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f7, code lost:
        if (r14 < 0) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f9, code lost:
        r15 = r5 + 2;
        r20 = r9;
        r9 = r15 + r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ff, code lost:
        if (r8 < r9) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r4.add(new p000.ayqg(r3[r5 + 1], java.util.Arrays.copyOfRange(r3, r15, r9)));
        r5 = r5 + (r14 + 2);
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x023a, code lost:
        throw new p000.ayqf("Wrong length=%d at index=%d in LTVs=%s", java.lang.Byte.valueOf(r13), java.lang.Integer.valueOf(r5), p000.boan.f132472f.mo68794a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0255, code lost:
        throw new p000.ayqq(4, "Transport Block has wrong length byte: %s", p000.boan.f132472f.mo68788c().mo68794a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0270, code lost:
        throw new p000.ayqq(4, "Transport Block null or too short: %s", p000.boan.f132472f.mo68788c().mo68794a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0271, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0273, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0276, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0278, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a3, code lost:
        throw new com.google.android.libraries.bluetooth.BluetoothException(java.lang.String.format("Failed to read %s on %s on device %s.", r4.getUuid(), p000.aysx.m84756b(r4), r3.f98336d.mo54358a()), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02c6, code lost:
        throw new com.google.android.libraries.bluetooth.BluetoothException(java.lang.String.format("Descriptor %s not found on characteristic %s on service %s of device %s.", r13, r15, r5, r3.f98336d.mo54358a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02c7, code lost:
        r0 = e;
        r20 = r20;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0418 A[Catch:{ PairingException -> 0x0526 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0514 A[Catch:{ PairingException -> 0x0524 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x054b A[SYNTHETIC, Splitter:B:244:0x054b] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05d7  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x05fd  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0273 A[Catch:{ BluetoothException -> 0x027a, ayqq -> 0x0278, ayqf -> 0x0276, all -> 0x0273, ayqf | ayqq | BluetoothException -> 0x02c7 }, ExcHandler: all (th java.lang.Throwable), PHI: r9 10  PHI: (r9v11 java.lang.String) = (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v13 java.lang.String), (r9v13 java.lang.String) binds: [B:46:0x0173, B:47:?, B:48:0x0192, B:67:0x01f3, B:68:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:46:0x0173] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0276 A[Catch:{ BluetoothException -> 0x027a, ayqq -> 0x0278, ayqf -> 0x0276, all -> 0x0273, ayqf | ayqq | BluetoothException -> 0x02c7 }, ExcHandler: ayqf (e ayqf), PHI: r9 10  PHI: (r9v10 java.lang.String) = (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v13 java.lang.String), (r9v13 java.lang.String) binds: [B:46:0x0173, B:47:?, B:48:0x0192, B:67:0x01f3, B:68:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:46:0x0173] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0278 A[Catch:{ BluetoothException -> 0x027a, ayqq -> 0x0278, ayqf -> 0x0276, all -> 0x0273, ayqf | ayqq | BluetoothException -> 0x02c7 }, ExcHandler: ayqq (e ayqq), PHI: r9 10  PHI: (r9v9 java.lang.String) = (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v13 java.lang.String), (r9v13 java.lang.String) binds: [B:46:0x0173, B:47:?, B:48:0x0192, B:67:0x01f3, B:68:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:46:0x0173] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    private final aypj m84422a(boolean z) {
        String str;
        String str2;
        aypd aypd;
        aypd aypd2;
        ahue ahue;
        byte[] bArr;
        aynq aynq;
        String str3;
        String str4;
        int i;
        PairingException pairingException;
        short[] sArr;
        ayqr ayqr;
        Throwable th;
        String str5;
        String str6;
        int i2;
        short[] sArr2;
        ayqr ayqr2;
        short[] a;
        bnsl bnsl;
        Exception exc;
        String str7;
        ayqr ayqr3;
        String str8;
        Throwable th2;
        String str9;
        byte[] bArr2;
        Exception exc2;
        String str10 = "Attempting to connect constants profiles, %s";
        String str11 = "Attempting to connect device profiles, %s";
        if (z) {
            try {
                ayqr ayqr4 = new ayqr(this.f98186p, "Get BR/EDR handover information via GATT");
                try {
                    ayri a2 = this.f98187q.mo54203a();
                    bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                    bnsl2.mo68432a("aypk", "a", 1225, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Connecting GATT server to BLE address=%s", this.f98185o);
                    bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
                    bnsl3.mo68432a("aypk", "a", 1226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Telling device to become discoverable");
                    this.f98184n.mo54180a(bvjc.BR_EDR_HANDOVER_WRITE_CONTROL_POINT_REQUEST);
                    ayrh c = a2.mo54316c(ayoj.f98121a, ayoi.f98120a);
                    a2.mo54313a(ayoj.f98121a, ayoi.f98120a, f98174k);
                    ayqr3 = ayqr4;
                    try {
                        byte[] a3 = c.mo54309a(TimeUnit.SECONDS.toMillis((long) this.f98183m.mo54119a()));
                        aypi a4 = aypi.m84416a(a3);
                        if (a4 == aypi.SUCCESS) {
                            this.f98184n.mo54183b();
                            bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
                            bnsl4.mo68432a("aypk", "b", 1254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68405a("Getting Bluetooth MAC");
                            this.f98184n.mo54180a(bvjc.BR_EDR_HANDOVER_READ_BLUETOOTH_MAC);
                            byte[] b = a2.mo54315b(ayoj.f98121a, aynt.m84375a(this.f98183m.mo54145s()));
                            if (b == null || b.length < 7) {
                                str = str10;
                                str2 = str11;
                                Object[] objArr = new Object[1];
                                objArr[0] = b != null ? boan.f132472f.mo68788c().mo68794a(b) : "(none)";
                                throw new ayqq(3, "Bluetooth MAC not contained in BR handover data: %s", objArr);
                            }
                            aynu aynu = new aynu(Arrays.copyOfRange(b, 1, 7), ByteOrder.LITTLE_ENDIAN);
                            if (!aynu.f98093b.equals(ByteOrder.BIG_ENDIAN)) {
                                try {
                                    byte[] bArr3 = aynu.f98092a;
                                    bArr2 = new byte[bArr3.length];
                                    int i3 = 0;
                                    while (true) {
                                        int length = bArr3.length;
                                        if (i3 >= length) {
                                            break;
                                        }
                                        bArr2[i3] = bArr3[(length - i3) - 1];
                                        i3++;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    str = str10;
                                    str8 = str11;
                                    try {
                                        ayqr3.close();
                                    } catch (Throwable th4) {
                                        try {
                                            bqye.m113761a(th2, th4);
                                        } catch (ayqq | BluetoothException e) {
                                            e = e;
                                            str7 = str8;
                                            exc = e;
                                            aypd = null;
                                            str2 = str7;
                                            bnsl bnsl5 = (bnsl) aypn.f98194a.mo68388c();
                                            bnsl5.mo68437a(exc);
                                            bnsl5.mo68432a("aypk", "a", 514, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl5.mo68405a("Couldn't get BR/EDR Handover info via TDS. Trying direct connect.");
                                            this.f98184n.mo54181a(exc);
                                            if (aypd != null) {
                                            }
                                            BluetoothDevice bluetoothDevice = aysl.m84704a(this.f98175a.f98418a.getRemoteDevice(aypd2.f98156a)).f98419a;
                                            String address = bluetoothDevice.getAddress();
                                            ahue = this.f98181g;
                                            if (ahue != null) {
                                            }
                                            this.f98184n.f98142b = bluetoothDevice;
                                            int i4 = Build.VERSION.SDK_INT;
                                            bnsl bnsl6 = (bnsl) aypn.f98194a.mo68390d();
                                            bnsl6.mo68432a("aypk", "a", 572, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl6.mo68420a("Pairing with %s", aypd2);
                                            bArr = this.f98189s;
                                            if (bArr != null) {
                                            }
                                            Context context = this.f98182l;
                                            ayqk ayqk = this.f98183m;
                                            ayns ayns = new ayns(context, bluetoothDevice, ayqk, this.f98184n, aynq, this.f98186p);
                                            if (!this.f98183m.mo54108P()) {
                                            }
                                        }
                                    }
                                    throw th2;
                                }
                            } else {
                                bArr2 = aynu.f98092a;
                            }
                            this.f98184n.mo54183b();
                            this.f98184n.mo54180a(bvjc.BR_EDR_HANDOVER_READ_TRANSPORT_BLOCK);
                            try {
                                UUID uuid = ayoj.f98121a;
                                UUID a5 = aynt.m84375a(this.f98183m.mo54146t());
                                UUID a6 = aynt.m84375a(this.f98183m.mo54149v());
                                Object[] objArr2 = {a6, a5, uuid};
                                Iterator<BluetoothGattDescriptor> it = a2.mo54310a(uuid, a5).getDescriptors().iterator();
                                BluetoothGattDescriptor bluetoothGattDescriptor = null;
                                while (true) {
                                    ? hasNext = it.hasNext();
                                    str = str10;
                                    if (hasNext == 0) {
                                        break;
                                    }
                                    try {
                                        BluetoothGattDescriptor next = it.next();
                                        if (next.getUuid().equals(a6)) {
                                            if (bluetoothGattDescriptor == null) {
                                                bluetoothGattDescriptor = next;
                                            } else {
                                                throw new BluetoothException(String.format("More than one descriptor %s found on characteristic %s service %s on device %s.", a6, a5, uuid, a2.f98336d.mo54358a()));
                                            }
                                        }
                                        str10 = str;
                                    } catch (ayqf | ayqq | BluetoothException e2) {
                                        exc2 = e2;
                                        str2 = str11;
                                        try {
                                            bnsl bnsl7 = (bnsl) aypn.f98194a.mo68388c();
                                            bnsl7.mo68437a(exc2);
                                            bnsl7.mo68432a("aypk", "c", 1286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl7.mo68405a("Failed to get supported profiles from transport block.");
                                            this.f98184n.mo54181a(exc2);
                                            short[] sArr3 = new short[0];
                                            aypd = new aypd(bArr2, sArr3);
                                            ayqr3.close();
                                            if (aypd != null) {
                                            }
                                            BluetoothDevice bluetoothDevice2 = aysl.m84704a(this.f98175a.f98418a.getRemoteDevice(aypd2.f98156a)).f98419a;
                                            String address2 = bluetoothDevice2.getAddress();
                                            ahue = this.f98181g;
                                            if (ahue != null) {
                                            }
                                            this.f98184n.f98142b = bluetoothDevice2;
                                            int i42 = Build.VERSION.SDK_INT;
                                            bnsl bnsl62 = (bnsl) aypn.f98194a.mo68390d();
                                            bnsl62.mo68432a("aypk", "a", 572, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl62.mo68420a("Pairing with %s", aypd2);
                                            bArr = this.f98189s;
                                            if (bArr != null) {
                                            }
                                            Context context2 = this.f98182l;
                                            ayqk ayqk2 = this.f98183m;
                                            ayns ayns2 = new ayns(context2, bluetoothDevice2, ayqk2, this.f98184n, aynq, this.f98186p);
                                            if (!this.f98183m.mo54108P()) {
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            str9 = str2;
                                            th2 = th;
                                            str8 = str9;
                                            ayqr3.close();
                                            throw th2;
                                        }
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                        str8 = str11;
                                        ayqr3.close();
                                        throw th2;
                                    }
                                }
                            } catch (ayqf | ayqq | BluetoothException e3) {
                                e = e3;
                                str = str10;
                                str2 = str11;
                                exc2 = e;
                                bnsl bnsl72 = (bnsl) aypn.f98194a.mo68388c();
                                bnsl72.mo68437a(exc2);
                                bnsl72.mo68432a("aypk", "c", 1286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl72.mo68405a("Failed to get supported profiles from transport block.");
                                this.f98184n.mo54181a(exc2);
                                short[] sArr32 = new short[0];
                                aypd = new aypd(bArr2, sArr32);
                                ayqr3.close();
                                if (aypd != null) {
                                }
                                BluetoothDevice bluetoothDevice22 = aysl.m84704a(this.f98175a.f98418a.getRemoteDevice(aypd2.f98156a)).f98419a;
                                String address22 = bluetoothDevice22.getAddress();
                                ahue = this.f98181g;
                                if (ahue != null) {
                                }
                                this.f98184n.f98142b = bluetoothDevice22;
                                int i422 = Build.VERSION.SDK_INT;
                                bnsl bnsl622 = (bnsl) aypn.f98194a.mo68390d();
                                bnsl622.mo68432a("aypk", "a", 572, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl622.mo68420a("Pairing with %s", aypd2);
                                bArr = this.f98189s;
                                if (bArr != null) {
                                }
                                Context context22 = this.f98182l;
                                ayqk ayqk22 = this.f98183m;
                                ayns ayns22 = new ayns(context22, bluetoothDevice22, ayqk22, this.f98184n, aynq, this.f98186p);
                                if (!this.f98183m.mo54108P()) {
                                }
                            }
                            aypd = new aypd(bArr2, sArr32);
                            try {
                                ayqr3.close();
                            } catch (ayqq | BluetoothException e4) {
                                exc = e4;
                            }
                        } else {
                            throw new ayqq(2, "TDS Control Point result code (%s) was not success in response %s", a4, boan.f132472f.mo68788c().mo68794a(a3));
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        str = str10;
                        str9 = str11;
                        th2 = th;
                        str8 = str9;
                        ayqr3.close();
                        throw th2;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    ayqr3 = ayqr4;
                    str = str10;
                    str9 = str11;
                    th2 = th;
                    str8 = str9;
                    ayqr3.close();
                    throw th2;
                }
            } catch (ayqq | BluetoothException e5) {
                e = e5;
                str = str10;
                str7 = str11;
                exc = e;
                aypd = null;
                str2 = str7;
                bnsl bnsl52 = (bnsl) aypn.f98194a.mo68388c();
                bnsl52.mo68437a(exc);
                bnsl52.mo68432a("aypk", "a", 514, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl52.mo68405a("Couldn't get BR/EDR Handover info via TDS. Trying direct connect.");
                this.f98184n.mo54181a(exc);
                if (aypd != null) {
                }
                BluetoothDevice bluetoothDevice222 = aysl.m84704a(this.f98175a.f98418a.getRemoteDevice(aypd2.f98156a)).f98419a;
                String address222 = bluetoothDevice222.getAddress();
                ahue = this.f98181g;
                if (ahue != null) {
                }
                this.f98184n.f98142b = bluetoothDevice222;
                int i4222 = Build.VERSION.SDK_INT;
                bnsl bnsl6222 = (bnsl) aypn.f98194a.mo68390d();
                bnsl6222.mo68432a("aypk", "a", 572, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6222.mo68420a("Pairing with %s", aypd2);
                bArr = this.f98189s;
                if (bArr != null) {
                }
                Context context222 = this.f98182l;
                ayqk ayqk222 = this.f98183m;
                ayns ayns222 = new ayns(context222, bluetoothDevice222, ayqk222, this.f98184n, aynq, this.f98186p);
                if (!this.f98183m.mo54108P()) {
                }
            }
        } else {
            str = str10;
            str2 = str11;
            aypd = null;
        }
        if (aypd != null) {
            aypd2 = aypd;
        } else {
            String str12 = this.f98177c;
            if (str12 == null) {
                str12 = this.f98185o;
            }
            aypd2 = new aypd(aynj.m84359a(str12), m84428a(this.f98175a.mo54347a(this.f98185o).f98419a, this.f98183m.mo54136j()));
        }
        BluetoothDevice bluetoothDevice2222 = aysl.m84704a(this.f98175a.f98418a.getRemoteDevice(aypd2.f98156a)).f98419a;
        String address2222 = bluetoothDevice2222.getAddress();
        ahue = this.f98181g;
        if (ahue != null) {
            ahue.f68065a.mo37147a(address2222);
        }
        this.f98184n.f98142b = bluetoothDevice2222;
        int i42222 = Build.VERSION.SDK_INT;
        bnsl bnsl62222 = (bnsl) aypn.f98194a.mo68390d();
        bnsl62222.mo68432a("aypk", "a", 572, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl62222.mo68420a("Pairing with %s", aypd2);
        bArr = this.f98189s;
        if (bArr != null) {
            aynq = new aynq(bArr, this.f98187q, this.f98188r);
        } else {
            aynq = null;
        }
        Context context2222 = this.f98182l;
        ayqk ayqk2222 = this.f98183m;
        ayns ayns2222 = new ayns(context2222, bluetoothDevice2222, ayqk2222, this.f98184n, aynq, this.f98186p);
        try {
            if (!this.f98183m.mo54108P()) {
                if (this.f98183m.mo54106N()) {
                    try {
                        i2 = 12;
                        if (bluetoothDevice2222.getBondState() == 12) {
                            short[] c2 = m84436c(bluetoothDevice2222);
                            if (c2.length == 0) {
                                try {
                                    if (this.f98183m.mo54121ab() > 0) {
                                        c2 = m84428a(bluetoothDevice2222, this.f98183m.mo54121ab());
                                    }
                                } catch (PairingException e6) {
                                    pairingException = e6;
                                    str4 = str2;
                                    str3 = str;
                                    i = 1;
                                    bnsl bnsl8 = (bnsl) aypn.f98194a.mo68390d();
                                    bnsl8.mo68432a("aypk", "a", 591, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl8.mo68420a("Failed to directly connect to supported profiles: %s", pairingException.getMessage());
                                    while (i <= this.f98183m.mo54137k()) {
                                    }
                                    if (!ayns2222.mo54162a()) {
                                    }
                                    if (!this.f98183m.mo54108P()) {
                                    }
                                    m84445j();
                                    try {
                                        f98172i = mo54200d();
                                    } catch (BluetoothException e7) {
                                        bnsl bnsl9 = (bnsl) aypn.f98194a.mo68390d();
                                        bnsl9.mo68437a(e7);
                                        bnsl9.mo68432a("aypk", "a", 665, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl9.mo68405a("Fast Pair: head phone does not support firmware read");
                                    }
                                    return m84421a(bluetoothDevice2222);
                                }
                            }
                            if (c2.length != 0) {
                                try {
                                    bnsl bnsl10 = (bnsl) aypn.f98194a.mo68390d();
                                    bnsl10.mo68432a("aypk", "a", 695, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    str4 = str2;
                                    try {
                                        bnsl10.mo68420a(str4, Arrays.toString(c2));
                                        sArr2 = c2;
                                        str3 = str;
                                    } catch (PairingException e8) {
                                        e = e8;
                                        pairingException = e;
                                        str3 = str;
                                        i = 1;
                                        bnsl bnsl82 = (bnsl) aypn.f98194a.mo68390d();
                                        bnsl82.mo68432a("aypk", "a", 591, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl82.mo68420a("Failed to directly connect to supported profiles: %s", pairingException.getMessage());
                                        while (i <= this.f98183m.mo54137k()) {
                                        }
                                        if (!ayns2222.mo54162a()) {
                                        }
                                        if (!this.f98183m.mo54108P()) {
                                        }
                                        m84445j();
                                        f98172i = mo54200d();
                                        return m84421a(bluetoothDevice2222);
                                    }
                                } catch (PairingException e9) {
                                    e = e9;
                                    str4 = str2;
                                    pairingException = e;
                                    str3 = str;
                                    i = 1;
                                    bnsl bnsl822 = (bnsl) aypn.f98194a.mo68390d();
                                    bnsl822.mo68432a("aypk", "a", 591, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl822.mo68420a("Failed to directly connect to supported profiles: %s", pairingException.getMessage());
                                    while (i <= this.f98183m.mo54137k()) {
                                    }
                                    if (!ayns2222.mo54162a()) {
                                    }
                                    if (!this.f98183m.mo54108P()) {
                                    }
                                    m84445j();
                                    f98172i = mo54200d();
                                    return m84421a(bluetoothDevice2222);
                                }
                            } else {
                                str4 = str2;
                                try {
                                    a = ayok.m84383a();
                                    bnsl = (bnsl) aypn.f98194a.mo68388c();
                                    bnsl.mo68432a("aypk", "a", 692, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    str3 = str;
                                } catch (PairingException e10) {
                                    e = e10;
                                    str3 = str;
                                    pairingException = e;
                                    i = 1;
                                    bnsl bnsl8222 = (bnsl) aypn.f98194a.mo68390d();
                                    bnsl8222.mo68432a("aypk", "a", 591, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl8222.mo68420a("Failed to directly connect to supported profiles: %s", pairingException.getMessage());
                                    while (i <= this.f98183m.mo54137k()) {
                                    }
                                    if (!ayns2222.mo54162a()) {
                                    }
                                    if (!this.f98183m.mo54108P()) {
                                    }
                                    m84445j();
                                    f98172i = mo54200d();
                                    return m84421a(bluetoothDevice2222);
                                }
                                try {
                                    bnsl.mo68420a(str3, Arrays.toString(a));
                                    sArr2 = a;
                                } catch (PairingException e11) {
                                    PairingException pairingException2 = e11;
                                    this.f98184n.mo54181a(pairingException2);
                                    throw pairingException2;
                                } catch (PairingException e12) {
                                    e = e12;
                                    pairingException = e;
                                    i = 1;
                                    bnsl bnsl82222 = (bnsl) aypn.f98194a.mo68390d();
                                    bnsl82222.mo68432a("aypk", "a", 591, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl82222.mo68420a("Failed to directly connect to supported profiles: %s", pairingException.getMessage());
                                    while (i <= this.f98183m.mo54137k()) {
                                    }
                                    if (!ayns2222.mo54162a()) {
                                    }
                                    if (!this.f98183m.mo54108P()) {
                                    }
                                    m84445j();
                                    f98172i = mo54200d();
                                    return m84421a(bluetoothDevice2222);
                                }
                            }
                            this.f98184n.mo54180a(bvjc.DIRECTLY_CONNECTED_TO_PROFILE);
                            ayqr ayqr5 = new ayqr(this.f98186p, "Connect to profile directly");
                            try {
                                ayqr2 = ayqr5;
                                try {
                                    m84425a(ayns2222, bluetoothDevice2222, sArr2, 1, this.f98183m.mo54123ad());
                                    bnsl bnsl11 = (bnsl) aypn.f98194a.mo68390d();
                                    bnsl11.mo68432a("aypk", "a", 707, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl11.mo68420a("Directly connected to %s.", bluetoothDevice2222);
                                    this.f98184n.mo54183b();
                                    ayqr2.close();
                                    m84445j();
                                    return m84421a(bluetoothDevice2222);
                                } catch (Throwable th9) {
                                    th = th9;
                                    Throwable th10 = th;
                                    try {
                                        ayqr2.close();
                                    } catch (Throwable th11) {
                                        bqye.m113761a(th10, th11);
                                    }
                                    throw th10;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                ayqr2 = ayqr5;
                                Throwable th102 = th;
                                ayqr2.close();
                                throw th102;
                            }
                        } else {
                            str6 = str2;
                            str5 = str;
                        }
                    } catch (PairingException e13) {
                        e = e13;
                        str4 = str2;
                        str3 = str;
                        pairingException = e;
                        i = 1;
                        bnsl bnsl822222 = (bnsl) aypn.f98194a.mo68390d();
                        bnsl822222.mo68432a("aypk", "a", 591, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl822222.mo68420a("Failed to directly connect to supported profiles: %s", pairingException.getMessage());
                        while (i <= this.f98183m.mo54137k()) {
                        }
                        if (!ayns2222.mo54162a()) {
                        }
                        if (!this.f98183m.mo54108P()) {
                        }
                        m84445j();
                        f98172i = mo54200d();
                        return m84421a(bluetoothDevice2222);
                    }
                } else {
                    str6 = str2;
                    str5 = str;
                    i2 = ayqk2222;
                }
                try {
                    i2 = 1;
                    try {
                        throw new PairingException("Not previously bonded skipping direct connection, %s", Integer.valueOf(bluetoothDevice2222.getBondState()));
                    } catch (PairingException e14) {
                        e = e14;
                        i = i2;
                        pairingException = e;
                        bnsl bnsl8222222 = (bnsl) aypn.f98194a.mo68390d();
                        bnsl8222222.mo68432a("aypk", "a", 591, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl8222222.mo68420a("Failed to directly connect to supported profiles: %s", pairingException.getMessage());
                        while (i <= this.f98183m.mo54137k()) {
                            try {
                                ayqt ayqt = this.f98186p;
                                StringBuilder sb = new StringBuilder(24);
                                sb.append("Pair device #");
                                sb.append(i);
                                ayqr = new ayqr(ayqt, sb.toString());
                                ayns2222.mo54165c();
                                ayqr.close();
                                break;
                            } catch (Exception e15) {
                                this.f98184n.mo54181a(e15);
                                bnsl bnsl12 = (bnsl) aypn.f98194a.mo68387b();
                                bnsl12.mo68437a(e15);
                                bnsl12.mo68432a("aypk", "a", 600, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl12.mo68425a("removeBond() or createBond() failed, attempt %d of %d. Bond state %s", Integer.valueOf(i), Integer.valueOf(this.f98183m.mo54137k()), Integer.valueOf(bluetoothDevice2222.getBondState()));
                                if (i < this.f98183m.mo54137k()) {
                                    mo54198c();
                                    bnsl bnsl13 = (bnsl) aypn.f98194a.mo68390d();
                                    bnsl13.mo68432a("aypk", "a", 608, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl13.mo68405a("Sleeping 1 sec after createBond() failure.");
                                    SystemClock.sleep(1000);
                                }
                                i++;
                            } catch (Throwable th13) {
                                bqye.m113761a(th, th13);
                            }
                        }
                        if (!ayns2222.mo54162a()) {
                            if (this.f98189s != null) {
                                throw new PairingException("createBond() failed, exiting connection process.", new Object[0]);
                            } else if (!this.f98183m.mo54108P()) {
                                bnsl bnsl14 = (bnsl) aypn.f98194a.mo68388c();
                                bnsl14.mo68432a("aypk", "a", 625, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl14.mo68405a("createBond() failed, will try connecting profiles anyway.");
                            } else {
                                throw new PairingException("createBond() failed and skipping connecting to a profile.", new Object[0]);
                            }
                        }
                        if (!this.f98183m.mo54108P()) {
                            if (this.f98183m.mo54150w() && aypd2.f98157b.length == 0) {
                                short[] c3 = m84436c(bluetoothDevice2222);
                                if (c3.length == 0 && this.f98183m.mo54121ab() > 0) {
                                    bnsl bnsl15 = (bnsl) aypn.f98194a.mo68390d();
                                    bnsl15.mo68432a("aypk", "a", 634, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl15.mo68405a("Found no supported profiles in UUID cache, manually trigger SDP.");
                                    m84428a(bluetoothDevice2222, this.f98183m.mo54121ab());
                                }
                                aypd2 = new aypd(aypd2.f98156a, c3);
                            }
                            short[] sArr4 = aypd2.f98157b;
                            if (sArr4.length == 0) {
                                short[] a7 = ayok.m84383a();
                                bnsl bnsl16 = (bnsl) aypn.f98194a.mo68388c();
                                bnsl16.mo68432a("aypk", "a", 645, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl16.mo68420a(str3, Arrays.toString(a7));
                                sArr = a7;
                            } else {
                                bnsl bnsl17 = (bnsl) aypn.f98194a.mo68390d();
                                bnsl17.mo68432a("aypk", "a", 648, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl17.mo68420a(str4, Arrays.toString(sArr4));
                                sArr = sArr4;
                            }
                            m84425a(ayns2222, bluetoothDevice2222, sArr, this.f98183m.mo54138l(), false);
                        }
                        m84445j();
                        if (this.f98183m.mo54116X() && m84427a(this.f98187q.mo54203a(), aynw.f98095a)) {
                            f98172i = mo54200d();
                        }
                        return m84421a(bluetoothDevice2222);
                    }
                } catch (PairingException e16) {
                    e = e16;
                    i = 1;
                    pairingException = e;
                    bnsl bnsl82222222 = (bnsl) aypn.f98194a.mo68390d();
                    bnsl82222222.mo68432a("aypk", "a", 591, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl82222222.mo68420a("Failed to directly connect to supported profiles: %s", pairingException.getMessage());
                    while (i <= this.f98183m.mo54137k()) {
                    }
                    if (!ayns2222.mo54162a()) {
                    }
                    if (!this.f98183m.mo54108P()) {
                    }
                    m84445j();
                    f98172i = mo54200d();
                    return m84421a(bluetoothDevice2222);
                }
            } else {
                throw new PairingException("Skipping connecting to profiles, no direct connection possible.", new Object[0]);
            }
        } catch (PairingException e17) {
            e = e17;
            str6 = str2;
            str5 = str;
            i = 1;
            pairingException = e;
            bnsl bnsl822222222 = (bnsl) aypn.f98194a.mo68390d();
            bnsl822222222.mo68432a("aypk", "a", 591, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl822222222.mo68420a("Failed to directly connect to supported profiles: %s", pairingException.getMessage());
            while (i <= this.f98183m.mo54137k()) {
            }
            if (!ayns2222.mo54162a()) {
            }
            if (!this.f98183m.mo54108P()) {
            }
            m84445j();
            f98172i = mo54200d();
            return m84421a(bluetoothDevice2222);
        }
        throw th;
    }

    /* renamed from: a */
    private final void m84423a(int i) {
        if (!this.f98183m.mo54141o()) {
            int i2 = Build.VERSION.SDK_INT;
            aypc aypc = new aypc(this, this.f98182l, this.f98183m, new String[]{"android.bluetooth.adapter.action.BLE_STATE_CHANGED"}, i);
            try {
                aypc.mo54283a((long) this.f98183m.mo54127c(), TimeUnit.SECONDS);
                aypc.close();
                int i3 = Build.VERSION.SDK_INT;
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long c = ((long) this.f98183m.mo54127c()) * 1000;
            while (SystemClock.elapsedRealtime() - elapsedRealtime < c && i != m84419a(this.f98175a.f98418a)) {
                SystemClock.sleep((long) this.f98183m.mo54142p());
            }
            if (i == m84419a(this.f98175a.f98418a)) {
                int i4 = Build.VERSION.SDK_INT;
                return;
            }
            throw new TimeoutException(String.format(Locale.getDefault(), "Timed out waiting for state %d, current state is %d", Integer.valueOf(i), Integer.valueOf(m84419a(this.f98175a.f98418a))));
        }
        throw th;
    }

    /* renamed from: a */
    private final void m84424a(BluetoothDevice bluetoothDevice, ayns ayns) {
        short[] sArr;
        ayqr ayqr;
        if (this.f98183m.mo54108P()) {
            throw new PairingException("Skipping connecting to profiles, no direct connection possible.", new Object[0]);
        } else if (!this.f98183m.mo54106N() || bluetoothDevice.getBondState() != 12) {
            throw new PairingException("Not previously bonded skipping direct connection, %s", Integer.valueOf(bluetoothDevice.getBondState()));
        } else {
            short[] c = m84436c(bluetoothDevice);
            if (c.length == 0 && this.f98183m.mo54121ab() > 0) {
                c = m84428a(bluetoothDevice, this.f98183m.mo54121ab());
            }
            if (c.length == 0) {
                short[] a = ayok.m84383a();
                bnsl bnsl = (bnsl) aypn.f98194a.mo68388c();
                bnsl.mo68432a("aypk", "a", 692, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Attempting to connect constants profiles, %s", Arrays.toString(a));
                sArr = a;
            } else {
                bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                bnsl2.mo68432a("aypk", "a", 695, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Attempting to connect device profiles, %s", Arrays.toString(c));
                sArr = c;
            }
            this.f98184n.mo54180a(bvjc.DIRECTLY_CONNECTED_TO_PROFILE);
            try {
                ayqr = new ayqr(this.f98186p, "Connect to profile directly");
                m84425a(ayns, bluetoothDevice, sArr, 1, this.f98183m.mo54123ad());
                bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
                bnsl3.mo68432a("aypk", "a", 707, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Directly connected to %s.", bluetoothDevice);
                this.f98184n.mo54183b();
                ayqr.close();
                return;
            } catch (PairingException e) {
                this.f98184n.mo54181a(e);
                throw e;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0170 A[SYNTHETIC, Splitter:B:102:0x0170] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0179 A[SYNTHETIC] */
    /* renamed from: a */
    private final void m84425a(ayns ayns, BluetoothDevice bluetoothDevice, short[] sArr, int i, boolean z) {
        int i2;
        int i3;
        ayno ayno;
        Throwable th;
        Throwable th2;
        Throwable th3;
        ayqr ayqr;
        Throwable th4;
        ayns ayns2 = ayns;
        short[] sArr2 = sArr;
        int length = sArr2.length;
        int i4 = 0;
        while (i4 < length) {
            short s = sArr2[i4];
            if (!this.f98183m.mo54279a(s)) {
                bnsl bnsl = (bnsl) aypn.f98194a.mo68388c();
                bnsl.mo68432a("aypk", "a", 725, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68433a("Ignoring unsupported profile=%s", s);
            } else {
                int i5 = 1;
                while (i5 <= i) {
                    this.f98184n.mo54180a(bvjc.CONNECT_PROFILE);
                    ayox ayox = this.f98184n;
                    Short valueOf = Short.valueOf(s);
                    ayox.f98141a = valueOf;
                    try {
                        if (ayns2.f98084b.mo54279a(s)) {
                            ayoe ayoe = (ayoe) ayok.f98122a.get(valueOf);
                            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                            bnsl2.mo68432a("ayns", "a", 255, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68424a("Connecting to profile=%s on device=%s", ayoe, ayns2.f98086d);
                            if (z) {
                                ayno = new ayno(ayns2);
                            } else {
                                ayno = null;
                            }
                            try {
                                ayqt ayqt = ayns2.f98088f;
                                String valueOf2 = String.valueOf(ayoe);
                                i2 = length;
                                try {
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 9);
                                    sb.append("Connect: ");
                                    sb.append(valueOf2);
                                    ayqr ayqr2 = new ayqr(ayqt, sb.toString());
                                    try {
                                        aynl aynl = new aynl(ayns2, ayoe);
                                        try {
                                            aynp aynp = new aynp(ayns2, ayoe);
                                            try {
                                                BluetoothProfile bluetoothProfile = aynl.f98068a;
                                                i3 = i4;
                                                try {
                                                    if (!((Boolean) ayqm.m84613a(bluetoothProfile).mo54282a("connect", BluetoothDevice.class).mo54281b(ayns2.f98086d)).booleanValue()) {
                                                        bnsl bnsl3 = (bnsl) aypn.f98194a.mo68388c();
                                                        bnsl3.mo68432a("ayns", "a", 274, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl3.mo68409a("connect returned false, expected if connecting, state=%d", bluetoothProfile.getConnectionState(ayns2.f98086d));
                                                    }
                                                    if (bluetoothProfile.getConnectionState(ayns2.f98086d) != 2) {
                                                        ayqr = new ayqr(ayns2.f98088f, "Wait connection");
                                                        aynp.mo54283a((long) ayns2.f98084b.mo54093A(), TimeUnit.SECONDS);
                                                        ayqr.close();
                                                        try {
                                                            aynp.close();
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                        }
                                                    } else {
                                                        BluetoothDevice bluetoothDevice2 = ayns2.f98086d;
                                                        aynp.close();
                                                    }
                                                    try {
                                                        aynl.close();
                                                        try {
                                                            ayqr2.close();
                                                            if (ayno != null) {
                                                                try {
                                                                    ayno.close();
                                                                } catch (ayqn | ConnectException | InterruptedException | ExecutionException | TimeoutException e) {
                                                                    e = e;
                                                                    bnsl bnsl4 = (bnsl) aypn.f98194a.mo68388c();
                                                                    bnsl4.mo68437a(e);
                                                                    bnsl4.mo68432a("aypk", "a", 743, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                    bnsl4.mo68426a("Error connecting to profile=%s for device=%s (attempt %d of %d).", Short.valueOf(s), bluetoothDevice, Integer.valueOf(i5), Integer.valueOf(this.f98183m.mo54138l()));
                                                                    this.f98184n.mo54181a(e);
                                                                    i5++;
                                                                    i4 = i3;
                                                                    length = i2;
                                                                }
                                                            }
                                                            this.f98184n.mo54183b();
                                                            return;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            Throwable th7 = th;
                                                            if (ayno != null) {
                                                            }
                                                            throw th7;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        th = th;
                                                        ayqr2.close();
                                                        throw th;
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    th3 = th;
                                                    aynp.close();
                                                    throw th3;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                i3 = i4;
                                                th3 = th;
                                                aynp.close();
                                                throw th3;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            i3 = i4;
                                            th2 = th;
                                            aynl.close();
                                            throw th2;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        i3 = i4;
                                        th = th;
                                        ayqr2.close();
                                        throw th;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    i3 = i4;
                                    Throwable th72 = th;
                                    if (ayno != null) {
                                        try {
                                            ayno.close();
                                        } catch (Throwable th14) {
                                            bqye.m113761a(th72, th14);
                                        }
                                    }
                                    throw th72;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                i2 = length;
                                i3 = i4;
                                Throwable th722 = th;
                                if (ayno != null) {
                                }
                                throw th722;
                            }
                        } else {
                            throw new ConnectException(2, "Unsupported profile=%s", valueOf);
                        }
                    } catch (ayqn | ConnectException | InterruptedException | ExecutionException | TimeoutException e2) {
                        e = e2;
                        i2 = length;
                        i3 = i4;
                        bnsl bnsl42 = (bnsl) aypn.f98194a.mo68388c();
                        bnsl42.mo68437a(e);
                        bnsl42.mo68432a("aypk", "a", 743, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl42.mo68426a("Error connecting to profile=%s for device=%s (attempt %d of %d).", Short.valueOf(s), bluetoothDevice, Integer.valueOf(i5), Integer.valueOf(this.f98183m.mo54138l()));
                        this.f98184n.mo54181a(e);
                        i5++;
                        i4 = i3;
                        length = i2;
                    }
                }
                continue;
            }
            i4++;
            sArr2 = sArr;
            length = length;
        }
        throw new PairingException("Unable to connect to any profiles in: %s", Arrays.toString(sArr));
        throw th4;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, byte):void
     arg types: [java.lang.String, java.lang.String, byte]
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
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void */
    /* renamed from: a */
    private final void m84426a(aypx aypx, byte[] bArr, aypt aypt) {
        aypw aypw;
        byte[] bArr2;
        aypx aypx2 = aypx;
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        if (length == 64) {
            KeyPair a = ayos.m84394a();
            ayos ayos = new ayos((ECPublicKey) a.getPublic(), (ECPrivateKey) a.getPrivate());
            ECPublicKey eCPublicKey = ayos.f98131a;
            if (eCPublicKey != null) {
                ECPoint w = eCPublicKey.getW();
                bArr2 = bqce.m112562a(ayos.m84395a(w.getAffineX().toByteArray()), ayos.m84395a(w.getAffineY().toByteArray()));
            } else {
                bArr2 = null;
            }
            if (bArr2 != null) {
                bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                bnsl.mo68432a("aypx", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Handshake %s, generates key by ECDH.", aypx2.f98220b);
                KeyAgreement keyAgreement = (KeyAgreement) ayos.m84393a(ayop.f98126a);
                keyAgreement.init(ayos.f98132b);
                keyAgreement.doPhase(((KeyFactory) ayos.m84393a(ayoq.f98127a)).generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOf(bArr3, 32)), new BigInteger(1, Arrays.copyOfRange(bArr3, 32, 64))), ((ECPublicKey) ayos.m84394a().getPublic()).getParams())), true);
                aypw = new aypw(Arrays.copyOf(MessageDigest.getInstance("SHA-256").digest(keyAgreement.generateSecret()), 16), bArr2);
            } else {
                throw new GeneralSecurityException("Failed to do ECDH.");
            }
        } else if (length == 16) {
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
            bnsl2.mo68432a("aypx", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Handshake %s, using the given secret.", aypx2.f98220b);
            aypw = new aypw(bArr3, new byte[0]);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Key length is not correct: ");
            sb.append(length);
            throw new GeneralSecurityException(sb.toString());
        }
        bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
        bnsl3.mo68432a("aypx", "a", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68421a("Handshake %s, flags %s.", (Object) aypx2.f98220b, aypt.f98213b);
        byte[] a2 = bqce.m112562a(aynf.m84293a(aypw.f98217a, aypt.mo54206a()), aypw.f98218b);
        ayri a3 = aypx2.f98219a.mo54203a();
        a3.mo54312a(TimeUnit.SECONDS.toMillis((long) aypx2.f98221c));
        ayrh c = a3.mo54316c(ayod.f98113a, aynz.f98106a);
        bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
        bnsl4.mo68432a("aypx", "b", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68420a("Writing handshake packet to address=%s", aypx2.f98220b);
        a3.mo54313a(ayod.f98113a, aynz.f98106a, a2);
        bnsl bnsl5 = (bnsl) aypn.f98194a.mo68390d();
        bnsl5.mo68432a("aypx", "b", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl5.mo68420a("Waiting handshake packet from address=%s", aypx2.f98220b);
        byte[] a4 = c.mo54309a(TimeUnit.SECONDS.toMillis((long) aypx2.f98221c));
        byte[] bArr4 = aypw.f98217a;
        if (a4.length != 16) {
            String valueOf = String.valueOf(boan.f132472f.mo68794a(a4));
            throw new PairingException(valueOf.length() == 0 ? new String("Handshake failed because of incorrect response: ") : "Handshake failed because of incorrect response: ".concat(valueOf), new Object[0]);
        }
        byte[] b = aynf.m84294b(bArr4, a4);
        byte b2 = b[0];
        if (b2 == 1) {
            String a5 = aynj.m84357a(Arrays.copyOfRange(b, 1, 7));
            bnsl bnsl6 = (bnsl) aypn.f98194a.mo68390d();
            bnsl6.mo68432a("aypx", "a", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68424a("Handshake success with public %s, ble %s", a5, aypx2.f98220b);
            ayng ayng = new ayng(aypw.f98217a, a5);
            this.f98177c = ayng.f98006b;
            this.f98189s = ayng.f98005a;
            return;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Handshake response type incorrect: ");
        sb2.append((int) b2);
        throw new PairingException(sb2.toString(), new Object[0]);
    }

    /* renamed from: a */
    private final boolean m84427a(ayri ayri, UUID uuid) {
        ayqr ayqr;
        try {
            ayqr = new ayqr(this.f98186p, "Get service characteristic list");
            UUID uuid2 = ayod.f98113a;
            new Object[1][0] = uuid2;
            if (!ayri.f98339g) {
                ayri.mo54311a();
            }
            BluetoothGattService bluetoothGattService = null;
            for (BluetoothGattService bluetoothGattService2 : ayri.f98336d.mo54363b()) {
                if (bluetoothGattService2.getUuid().equals(uuid2)) {
                    if (bluetoothGattService == null) {
                        bluetoothGattService = bluetoothGattService2;
                    } else {
                        throw new BluetoothException(String.format("More than one service %s found on device %s.", uuid2, ayri.f98336d.mo54358a()));
                    }
                }
            }
            if (bluetoothGattService != null) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                    if (uuid.equals(bluetoothGattCharacteristic.getUuid())) {
                        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                        bnsl.mo68432a("aypk", "a", 1555, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("characteristic is exists, uuid = %s.", uuid.toString());
                        ayqr.close();
                        return true;
                    }
                }
                ayqr.close();
                bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                bnsl2.mo68432a("aypk", "a", 1562, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("can't find characteristic, uuid = %s.", uuid.toString());
                return false;
            }
            throw new BluetoothException(String.format("Service %s not found on device %s.", uuid2, ayri.f98336d.mo54358a()));
        } catch (BluetoothException e) {
            bnsl bnsl3 = (bnsl) aypn.f98194a.mo68388c();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("aypk", "a", 1560, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Can't get service characteristic list.");
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        if (r3 != null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ca, code lost:
        return new short[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        return r3;
     */
    /* renamed from: a */
    private final short[] m84428a(BluetoothDevice bluetoothDevice, int i) {
        ayom ayom;
        short[] sArr = null;
        int i2 = 1;
        while (true) {
            if (i2 > i) {
                break;
            }
            this.f98184n.mo54180a(bvjc.GET_PROFILES_VIA_SDP);
            try {
                ayqt ayqt = this.f98186p;
                StringBuilder sb = new StringBuilder(52);
                sb.append("Get BR/EDR handover information via SDP #");
                sb.append(i2);
                ayqr ayqr = new ayqr(ayqt, sb.toString());
                try {
                    bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                    bnsl.mo68432a("aypk", "b", 1484, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Getting supported profiles via SDP (Bluetooth Classic) for %s", bluetoothDevice.getAddress());
                    ayom = new ayom(this.f98182l, this.f98183m, bluetoothDevice, "android.bluetooth.device.action.UUID");
                    bluetoothDevice.fetchUuidsWithSdp();
                    ayom.mo54283a((long) this.f98183m.mo54135i(), TimeUnit.SECONDS);
                    ayom.close();
                    sArr = m84436c(bluetoothDevice);
                    try {
                        ayqr.close();
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    }
                } catch (Throwable th) {
                    ayqr.close();
                    throw th;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
                break;
            }
            if (sArr != null && sArr.length != 0) {
                this.f98184n.mo54183b();
                break;
            }
            this.f98184n.mo54181a(new TimeoutException());
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68388c();
            bnsl2.mo68432a("aypk", "a", 1474, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68425a("SDP returned no UUIDs from %s, assuming timeout (attempt %d of %d).", bluetoothDevice.getAddress(), Integer.valueOf(i2), Integer.valueOf(i));
            i2++;
        }
        throw th;
    }

    /* renamed from: a */
    public final aypj mo54190a(byte[] bArr) {
        Throwable th;
        Throwable th2;
        aypx h;
        aypu aypu;
        byte[] bArr2 = bArr;
        this.f98190t = bArr2;
        if (bArr2 != null) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("aypk", "a", (int) ErrorInfo.TYPE_FSC_OTHER_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68426a("Starting to pair %s: key[%s] %s, %s", this.f98185o, Integer.valueOf(bArr2.length), boan.f132472f.mo68794a(bArr2), this.f98183m);
        } else {
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
            bnsl2.mo68432a("aypk", "a", 403, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("Pairing %s: %s", this.f98185o, this.f98183m);
        }
        if (this.f98183m.mo54114V() != null) {
            this.f98184n.mo54179a(this.f98182l, this.f98185o, this.f98183m.mo54114V());
        }
        if (bArr2 != null && this.f98183m.mo54105M()) {
            this.f98184n.mo54180a(bvjc.GET_LOCAL_PUBLIC_ADDRESS);
            if (aynj.m84358a(this.f98182l) != null) {
                this.f98184n.mo54183b();
                this.f98188r = true;
            } else {
                this.f98184n.mo54181a(new IllegalStateException("null bluetooth_address"));
                bnsl bnsl3 = (bnsl) aypn.f98194a.mo68387b();
                bnsl3.mo68432a("aypk", "a", 417, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Want provider to initiate bonding, but cannot access Bluetooth public address. Falling back to initiating bonding ourselves.");
            }
        }
        aypp aypp = new aypp(this.f98182l, this.f98183m, this.f98184n, this.f98175a, new ayoy(this), this.f98185o, this.f98186p, m84442g());
        this.f98187q = aypp;
        if (bArr2 != null) {
            try {
                if (bArr2.length > 0) {
                    ayri a = aypp.mo54203a();
                    try {
                        this.f98184n.mo54180a(bvjc.SECRET_HANDSHAKE);
                        ayqr ayqr = new ayqr(this.f98186p, "Handshake");
                        try {
                            h = m84443h();
                            aypu = new aypu();
                            aypu.mo54207a(aynj.m84359a(this.f98185o));
                            if (this.f98188r) {
                                aypu.mo54209a(ayny.PROVIDER_INITIATES_BONDING);
                            }
                            if (!this.f98188r) {
                                int i = Build.VERSION.SDK_INT;
                            }
                            if (this.f98183m.mo54115W() && m84440d(bArr)) {
                                aypu.mo54209a(ayny.REQUEST_DEVICE_NAME);
                                bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
                                bnsl4.mo68432a("aypk", "i", 1403, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl4.mo68420a("register for the device name response from address=%s", this.f98185o);
                                ayri a2 = this.f98187q.mo54203a();
                                a2.mo54312a(TimeUnit.SECONDS.toMillis((long) this.f98183m.mo54119a()));
                                this.f98179e = new aypf(a2);
                            }
                        } catch (BluetoothException e) {
                            bnsl bnsl5 = (bnsl) aypn.f98194a.mo68390d();
                            bnsl5.mo68432a("aypk", "i", 1411, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl5.mo68405a("Can't register for device name response, no naming characteristic.");
                        } catch (Throwable th3) {
                            th2 = th3;
                            ayqr.close();
                            throw th2;
                        }
                        if (this.f98183m.mo54120aa()) {
                            aypu.mo54209a(ayny.REQUEST_RETROACTIVE_PAIR);
                            aypu.f98215a = (byte[]) bmxy.m108581a(aynj.m84358a(this.f98182l));
                        }
                        aypu.f98209d = 0;
                        m84426a(h, bArr2, new aypv(aypu));
                        String str = this.f98177c;
                        if (str != null) {
                            aypg aypg = this.f98178d;
                            if (aypg != null) {
                                List list = aypg.f98162b;
                                if (list != null) {
                                    if (!list.isEmpty()) {
                                        Iterator it = aypg.f98162b.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            aypm aypm = (aypm) it.next();
                                            byte[] a3 = aynj.m84359a(str);
                                            if (Arrays.equals(aypm.mo54089b().mo73780k(), bnzi.m110902d().mo68722a(bqce.m112562a(aypm.mo54088a().mo73780k(), a3)).mo68740b())) {
                                                aypg.f98161a = aypm.mo54088a().mo73780k();
                                                bnsl bnsl6 = (bnsl) aypn.f98194a.mo68390d();
                                                bnsl6.mo68432a("aypk", "a", 448, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl6.mo68405a("The provider is found in paired history.");
                                                break;
                                            }
                                        }
                                    }
                                }
                                bnsl bnsl7 = (bnsl) aypn.f98194a.mo68390d();
                                bnsl7.mo68432a("aypk", "a", 450, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl7.mo68405a("The provider is not found in paired history.");
                            }
                        }
                        ayqr.close();
                        this.f98184n.mo54183b();
                        aypj a4 = m84422a(this.f98183m.mo54144r());
                        if (a != null) {
                            a.close();
                        }
                        this.f98186p.mo54289a();
                        if (this.f98184n.mo54182a()) {
                            this.f98184n.mo54178a(this.f98182l);
                        }
                        return a4;
                    } catch (Throwable th4) {
                        th = th4;
                        if (a != null) {
                            a.close();
                        }
                        throw th;
                    }
                }
            } catch (ayqn | BluetoothException | PairingException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e2) {
                try {
                    if (this.f98184n.mo54184c()) {
                        this.f98184n.mo54181a(e2);
                    }
                    throw e2;
                } catch (Throwable th5) {
                    this.f98186p.mo54289a();
                    if (this.f98184n.mo54182a()) {
                        this.f98184n.mo54178a(this.f98182l);
                    }
                    throw th5;
                }
            } catch (Throwable th6) {
                bqye.m113761a(th, th6);
            }
        }
        aypj a5 = m84422a(this.f98183m.mo54144r());
        this.f98186p.mo54289a();
        if (this.f98184n.mo54182a()) {
            this.f98184n.mo54178a(this.f98182l);
        }
        return a5;
    }

    /* renamed from: a */
    public final String mo54191a() {
        aypf aypf = this.f98179e;
        if (aypf == null) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("aypk", "a", 336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("getProviderDeviceName failed, deviceNameReceiver == null.");
            return null;
        }
        byte[] bArr = this.f98189s;
        if (bArr != null) {
            String a = aypf.mo54188a(bArr);
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
            bnsl2.mo68432a("aypk", "a", 344, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("getProviderDeviceName = %s.", a);
            Context context = this.f98182l;
            String b = bmxx.m108578b(a);
            if (ayqx.m84636a(context)) {
                bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
                bnsl3.mo68432a("ayqx", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Send device name (%s) to validator", b);
                context.sendBroadcast(new Intent("com.google.android.libraries.bluetooth.fastpair.action.GET_DEVICE_NAME").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.DEVICE_NAME", b));
            }
            return a;
        }
        bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
        bnsl4.mo68432a("aypk", "a", 340, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68405a("getProviderDeviceName failed, pairingSecret == null.");
        return null;
    }

    /* renamed from: a */
    public final void mo54192a(String str) {
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypk", "a", 327, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Update provider device name = %s.", str);
        this.f98191u = str;
        this.f98192v = true;
    }

    /* renamed from: a */
    public final void mo54193a(List list) {
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypk", "a", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Paired history has been set.");
        this.f98178d = new aypg(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo54194a(String str, String str2) {
        ayqr ayqr;
        Object obj;
        if (str == null || str2 == null) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("aypk", "a", 1296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("writeNameToProvider fail because provider name or address is null.");
            return false;
        } else if (this.f98189s != null) {
            try {
                ayqr = new ayqr(this.f98186p, "Encode device name");
                byte[] bArr = this.f98189s;
                if (bArr == null || bArr.length != 16) {
                    if (bArr != null) {
                        obj = Integer.valueOf(bArr.length);
                    } else {
                        obj = "NULL";
                    }
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
                    sb.append("Incorrect secret for encoding name packet, secret.length = ");
                    sb.append(valueOf);
                    throw new GeneralSecurityException(sb.toString());
                } else if (str.length() == 0 || bmzr.m108695a(str) > 48) {
                    String valueOf2 = String.valueOf(Integer.valueOf(bmzr.m108695a(str)));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 66);
                    sb2.append("Invalid name for encoding name packet, Utf8.encodedLength(name) = ");
                    sb2.append(valueOf2);
                    throw new GeneralSecurityException(sb2.toString());
                } else {
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    byte[] bArr2 = new byte[8];
                    new SecureRandom().nextBytes(bArr2);
                    byte[] a = bqce.m112562a(bArr2, ayne.m84290a(bArr, bytes, bArr2));
                    byte[] a2 = bqce.m112562a(Arrays.copyOf(ayqa.m84481a(bArr, a), 8), a);
                    ayqr.close();
                    int i = 1;
                    while (i <= this.f98183m.mo54139m()) {
                        this.f98184n.mo54180a(bvjc.WRITE_DEVICE_NAME);
                        try {
                            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                            bnsl2.mo68432a("aypk", "d", 1342, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68420a("Writing new device name to address=%s", str2);
                            ayri a3 = this.f98187q.mo54203a();
                            a3.mo54312a(TimeUnit.SECONDS.toMillis((long) this.f98183m.mo54119a()));
                            a3.mo54313a(ayod.f98113a, ayoa.f98107a, a2);
                            bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
                            bnsl3.mo68432a("aypk", "d", 1347, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68420a("Finished writing new device name=%s", boan.f132472f.mo68794a(a2));
                            this.f98184n.mo54183b();
                            return true;
                        } catch (BluetoothException e) {
                            bnsl bnsl4 = (bnsl) aypn.f98194a.mo68388c();
                            bnsl4.mo68437a(e);
                            bnsl4.mo68432a("aypk", "a", 1318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68411a("Error writing name attempt %d of %d", i, this.f98183m.mo54139m());
                            this.f98184n.mo54181a(e);
                            Thread.sleep((long) this.f98183m.mo54100H());
                            i++;
                        }
                    }
                    return false;
                }
            } catch (GeneralSecurityException e2) {
                bnsl bnsl5 = (bnsl) aypn.f98194a.mo68388c();
                bnsl5.mo68437a(e2);
                bnsl5.mo68432a("aypk", "a", 1307, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Failed to encrypt device name.");
                return false;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            bnsl bnsl6 = (bnsl) aypn.f98194a.mo68390d();
            bnsl6.mo68432a("aypk", "a", 1300, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("writeNameToProvider fail because no pairingSecret.");
            return false;
        }
        throw th;
    }

    /* renamed from: a */
    public final boolean mo54195a(byte[] bArr, String str) {
        Throwable th;
        ayqr ayqr;
        Throwable th2;
        ayqr ayqr2;
        Throwable th3;
        byte[] bArr2 = bArr;
        if (!this.f98183m.mo54115W()) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("aypk", "a", 1130, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Disable NamingCharacteristic feature, ignoring.");
            return false;
        } else if (bmxx.m108577a(str)) {
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
            bnsl2.mo68432a("aypk", "a", 1134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Provider name is null or empty, ignoring.");
            return false;
        } else if (bArr2 != null && bArr2.length == 16) {
            bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
            bnsl3.mo68432a("aypk", "a", 1142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Start to update device name for provider.");
            if (this.f98183m.mo54114V() != null) {
                this.f98184n.mo54179a(this.f98182l, this.f98185o, this.f98183m.mo54114V());
            }
            aypp aypp = new aypp(this.f98182l, this.f98183m, this.f98184n, this.f98175a, new aypa(this), this.f98185o, this.f98186p, m84430b(true));
            this.f98187q = aypp;
            try {
                ayri a = aypp.mo54203a();
                try {
                    if (!m84427a(a, ayoa.f98107a)) {
                        bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
                        bnsl4.mo68432a("aypk", "a", 1162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("Can't find name characteristic, skip to write name with retry times.");
                        this.f98187q.mo54205b();
                        if (a != null) {
                            a.close();
                        }
                        this.f98186p.mo54289a();
                        return true;
                    }
                    this.f98184n.mo54180a(bvjc.SECRET_HANDSHAKE);
                    ayqr = new ayqr(this.f98186p, "Handshake");
                    aypx h = m84443h();
                    aypq aypq = new aypq();
                    aypq.mo54207a(aynj.m84359a(this.f98185o));
                    aynx aynx = aynx.ADDITIONAL_DATA_CHARACTERISTIC;
                    aypq.f98210e = (byte) (aynx.f98099c | aypq.f98210e);
                    aypq.f98209d = 16;
                    m84426a(h, bArr2, new aypr(aypq));
                    ayqr.close();
                    this.f98184n.mo54183b();
                    ayqr2 = new ayqr(this.f98186p, "WriteNameToProvider");
                    boolean a2 = mo54194a(str, this.f98177c);
                    ayqr2.close();
                    if (a != null) {
                        a.close();
                    }
                    this.f98186p.mo54289a();
                    this.f98187q.mo54205b();
                    return a2;
                } catch (Throwable th4) {
                    th = th4;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            } catch (BluetoothException | PairingException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e) {
                try {
                    if (this.f98184n.mo54184c()) {
                        this.f98184n.mo54181a(e);
                    }
                    throw e;
                } catch (Throwable th5) {
                    this.f98186p.mo54289a();
                    throw th5;
                }
            } catch (Throwable th6) {
                bqye.m113761a(th, th6);
            }
        } else {
            bnsl bnsl5 = (bnsl) aypn.f98194a.mo68390d();
            bnsl5.mo68432a("aypk", "a", 1138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("key is null or key length is not account key size.");
            return false;
        }
        throw th2;
        throw th3;
    }
}
