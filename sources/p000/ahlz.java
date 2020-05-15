package p000;

import android.bluetooth.BluetoothDevice;
import android.os.SystemClock;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ahlz */
final /* synthetic */ class ahlz implements Runnable {

    /* renamed from: a */
    private final ahmn f67496a;

    /* renamed from: b */
    private final String f67497b;

    /* renamed from: c */
    private final bqgy f67498c;

    /* renamed from: d */
    private final ahkv f67499d;

    /* renamed from: e */
    private final ConnectionOptions f67500e;

    /* renamed from: f */
    private final byte[] f67501f;

    /* renamed from: g */
    private final byte[] f67502g;

    /* renamed from: h */
    private final aify f67503h;

    public ahlz(ahmn ahmn, String str, bqgy bqgy, ahkv ahkv, ConnectionOptions connectionOptions, byte[] bArr, byte[] bArr2, aify aify) {
        this.f67496a = ahmn;
        this.f67497b = str;
        this.f67498c = bqgy;
        this.f67499d = ahkv;
        this.f67500e = connectionOptions;
        this.f67501f = bArr;
        this.f67502g = bArr2;
        this.f67503h = aify;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:96:0x023b */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:31:0x00c8 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:203:0x01a2 */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Type inference failed for: r11v0, types: [byte[]], assign insn: 0x000e: IGET  (r11v0 ? I:byte[]) = (r25v0 'this' ahlz A[THIS]) ahlz.g byte[] */
    /* JADX WARN: Type inference failed for: r15v1, assign insn: PHI: (r15v1 ?) = (r15v0 char), (r15v36 char) binds: [B:31:0x00c8, B:47:0x0138] */
    /* JADX WARN: Type inference failed for: r16v0, types: [ahna], assign insn: PHI: (r16v0 ?) = (r16v1 ?), (r16v2 ?) binds: [B:186:0x045c, B:175:0x040b] */
    /* JADX WARN: Type inference failed for: r16v1, assign insn: 0x045c: CONST  (r16v1 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r4v8, types: [ahna], assign insn: 0x01d8: INVOKE  (r4v8 ? I:ahna) = (r8v0 ahmn), (r6v7 ahkv), (r3v9 ahmg) type: VIRTUAL call: ahmn.a(ahkv, ahmg):ahna */
    /* JADX WARN: Type inference failed for: r16v2, assign insn: 0x040b: MOVE  (r16v2 ? I:?[OBJECT, ARRAY]) = (r10v2 byte[]) */
    /* JADX WARN: Type inference failed for: r11v3, assign insn: PHI: (r11v3 ?) = (r11v0 ?), (r11v6 ?) binds: [B:96:0x023b, B:165:0x03ee] */
    /* JADX WARN: Type inference failed for: r6v12, types: [ahna], assign insn: 0x03eb: MOVE  (r6v12 ? I:?[OBJECT, ARRAY]) = (r10v10 byte[]) */
    /* JADX WARN: Type inference failed for: r11v6, assign insn: 0x03ec: MOVE  (r11v6 ? I:?[OBJECT, ARRAY]) = (r7v4 bqgy) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahmn.a(ahkv, bvif, java.lang.String, boolean, long):void
     arg types: [ahkv, bvif, java.lang.String, int, long]
     candidates:
      ahmn.a(ahkv, java.lang.String, byte[], com.google.android.gms.nearby.connection.AdvertisingOptions, aify):int
      ahmn.a(ahkv, java.lang.String, ahna, int, bqgy):void
      ahqi.a(ahkv, java.lang.String, byte[], com.google.android.gms.nearby.connection.AdvertisingOptions, aify):int
      ahmn.a(ahkv, bvif, java.lang.String, boolean, long):void */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0405, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0407, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0408, code lost:
        r10 = r4;
        r15 = r6;
        r11 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0457, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0459, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x045a, code lost:
        r15 = r6;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0476, code lost:
        r6 = ((p000.ahmf) r0).f67520b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x047c, code lost:
        r16.mo36865l();
        p000.ahmn.m56139a(r15, r16.mo36865l(), r9, false, r23);
        r6 = 8012;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0407 A[ExcHandler: ahmf (e ahmf), Splitter:B:78:0x01dc] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0457 A[ExcHandler: IOException (e java.io.IOException), PHI: r6 r7 10  PHI: (r6v6 ahkv) = (r6v0 ahkv), (r6v7 ahkv) binds: [B:64:0x019a, B:76:0x01d8] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r7v3 bqgy) = (r7v0 bqgy), (r7v4 bqgy) binds: [B:64:0x019a, B:76:0x01d8] A[DONT_GENERATE, DONT_INLINE], Splitter:B:64:0x019a] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b6 A[Catch:{ ahmf -> 0x0459, IOException -> 0x0457 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01bc A[Catch:{ ahmf -> 0x0459, IOException -> 0x0457 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c4 A[Catch:{ ahmf -> 0x0459, IOException -> 0x0457 }] */
    /* JADX WARNING: Unknown variable types count: 4 */
    public final void run() {
        bqgy bqgy;
        List<ahmg> list;
        char c;
        String str;
        ? r16;
        bqgy bqgy2;
        int i;
        ahkv ahkv;
        bvif bvif;
        int i2;
        long elapsedRealtime;
        ahmg ahmg;
        buub buub;
        ahmn ahmn = this.f67496a;
        String str2 = this.f67497b;
        bqgy bqgy3 = this.f67498c;
        ahkv ahkv2 = this.f67499d;
        ConnectionOptions connectionOptions = this.f67500e;
        byte[] bArr = this.f67501f;
        ? r11 = this.f67502g;
        aify aify = this.f67503h;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (ahmn.f67551h.containsKey(str2)) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("In requestConnection(), connection requested with endpoint %s, but we already have a pending connection with them", str2);
            bqgy3.mo69138b((Object) 8003);
        } else if (!ahmn.m56143g(ahkv2) || ahmn.mo36855c(ahkv2)) {
            ahmh ahmh = (ahmh) ahmn.f67550g.get(ahkv2);
            if (ahmh == null) {
                bqgy = bqgy3;
            } else if (!ahmh.mo36831c(str2)) {
                bqgy = bqgy3;
            } else {
                ahkv2.mo36695a(str2, connectionOptions);
                ahmh ahmh2 = (ahmh) ahmn.f67550g.get(ahkv2);
                if (ahmh2 == null) {
                    list = new ArrayList();
                } else {
                    list = ahmh2.mo36830b(str2);
                }
                byte[] bArr2 = connectionOptions.f80465i;
                int i3 = 1;
                boolean z = false;
                if (bArr2 != null) {
                    int i4 = 6;
                    c = 6;
                    if (bArr2.length == 6) {
                        StringBuilder sb = new StringBuilder(18);
                        int i5 = 0;
                        while (i5 < i4) {
                            byte b = bArr2[i5];
                            if (sb.length() > 0) {
                                sb.append(':');
                            }
                            Object[] objArr = new Object[i3];
                            objArr[0] = Byte.valueOf(b);
                            sb.append(String.format("%02x", objArr));
                            i5++;
                            i3 = 1;
                            i4 = 6;
                        }
                        str = bmwb.m108444b(sb.toString());
                        c = i4;
                        if (str != null) {
                            ArrayList arrayList = new ArrayList(list);
                            if (cfnv.m140799w()) {
                                if (list.isEmpty()) {
                                    ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("Cannot append remote Bluetooth MAC Address, because endpointId %s has not been discovered", str2);
                                } else {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            bvif bvif2 = bvif.BLUETOOTH;
                                            boolean equals = bvif2.equals(((ahmg) it.next()).f67524e);
                                            c = bvif2;
                                            if (equals) {
                                                srn srn = ahkm.f67363a;
                                                c = bvif2;
                                                break;
                                            }
                                        } else {
                                            BluetoothDevice c2 = ahmn.f67546c.mo36925c(str);
                                            if (c2 == null) {
                                                ((bnsl) ahkm.f67363a.mo68388c()).mo68405a("Cannot append remote Bluetooth MAC Address, because a valid Bluetooth device could not be derived.");
                                                c = c;
                                            } else {
                                                arrayList.add(new ahme(c2, str2, ((ahmg) list.get(0)).f67522c, ((ahmg) list.get(0)).f67523d));
                                                srn srn2 = ahkm.f67363a;
                                                c = c;
                                            }
                                        }
                                    }
                                }
                            }
                            list = arrayList;
                            c = c;
                        }
                        if (cfnv.m140756R() && connectionOptions.f80466j) {
                            ArrayList arrayList2 = new ArrayList(list);
                            if (list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (bvif.WEB_RTC.equals(((ahmg) it2.next()).f67524e)) {
                                            srn srn3 = ahkm.f67363a;
                                            break;
                                        }
                                    } else {
                                        arrayList2.add(new ahml(str2, ((ahmg) list.get(0)).f67522c, ((ahmg) list.get(0)).f67523d));
                                        srn srn4 = ahkm.f67363a;
                                        break;
                                    }
                                }
                            } else {
                                ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("Cannot append remote WebRTC Peer Id, because endpointId %s has not been discovered", str2);
                            }
                            list = arrayList2;
                        }
                        Collections.sort(list, ahmn.f67544a);
                        bvif = bvif.UNKNOWN_MEDIUM;
                        i2 = 13;
                        ahkv = c;
                        for (ahmg ahmg2 : list) {
                            elapsedRealtime = SystemClock.elapsedRealtime();
                            if (ahkv2.mo36710b(ahmg2.f67521b, ahmg2.f67524e)) {
                                ? a = ahmn.mo36839a(ahkv2, ahmg2);
                                try {
                                    ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("In requestConnection(), successfully created an EndpointChannel to endpoint %s", str2);
                                    int nextInt = ahmn.f67548e.nextInt();
                                    List<bvif> f = ahmn.mo36861f();
                                    if (ahmn.m56142c(ahkv2, str2)) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (bvif bvif3 : f) {
                                            if (bvif3 == bvif.BLE) {
                                                arrayList3.add(bvif3);
                                            }
                                        }
                                        f = arrayList3;
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (bvif bvif4 : f) {
                                        if (ahkv2.mo36710b(str2, bvif4)) {
                                            arrayList4.add(bvif4);
                                        }
                                    }
                                    String c3 = ahkv2.mo36711c();
                                    boolean e = ahmn.f67546c.mo36929e();
                                    bxvd da = buuc.f154922j.mo74144da();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = z;
                                    }
                                    buuc buuc = (buuc) da.f164949b;
                                    buuc.f154924a |= 8;
                                    buuc.f154928e = nextInt;
                                    if (bArr != null) {
                                        ByteString a2 = ByteString.m123261a(bArr);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        buuc buuc2 = (buuc) da.f164949b;
                                        a2.getClass();
                                        buuc2.f154924a |= 16;
                                        buuc2.f154930h = a2;
                                        String str3 = new String(bArr, ahkv.f67378a);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        buuc buuc3 = (buuc) da.f164949b;
                                        str3.getClass();
                                        buuc3.f154924a |= 2;
                                        buuc3.f154926c = str3;
                                    }
                                    if (c3 != null) {
                                        buuc buuc4 = (buuc) da.f164949b;
                                        c3.getClass();
                                        buuc4.f154924a |= 1;
                                        buuc4.f154925b = c3;
                                    }
                                    if (r11 != 0) {
                                        ByteString a3 = ByteString.m123261a((byte[]) r11);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        buuc buuc5 = (buuc) da.f164949b;
                                        a3.getClass();
                                        buuc5.f154924a |= 4;
                                        buuc5.f154927d = a3;
                                    }
                                    bxvd da2 = buug.f154941c.mo74144da();
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    buug buug = (buug) da2.f164949b;
                                    buug.f154943a |= 1;
                                    buug.f154944b = e;
                                    buug buug2 = (buug) da2.mo74062i();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    buuc buuc6 = (buuc) da.f164949b;
                                    buug2.getClass();
                                    buuc6.f154931i = buug2;
                                    buuc6.f154924a |= 32;
                                    ArrayList arrayList5 = new ArrayList(arrayList4.size());
                                    for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                                        buub buub2 = buub.UNKNOWN_MEDIUM;
                                        buuw buuw = buuw.UNKNOWN_FRAME_TYPE;
                                        switch (((bvif) arrayList4.get(i6)).ordinal()) {
                                            case 1:
                                                buub = buub.MDNS;
                                                break;
                                            case 2:
                                                buub = buub.BLUETOOTH;
                                                break;
                                            case 3:
                                                buub = buub.WIFI_HOTSPOT;
                                                break;
                                            case 4:
                                                buub = buub.BLE;
                                                break;
                                            case 5:
                                                buub = buub.WIFI_LAN;
                                                break;
                                            case 6:
                                                buub = buub.WIFI_AWARE;
                                                break;
                                            case 7:
                                                buub = buub.NFC;
                                                break;
                                            case 8:
                                                buub = buub.WIFI_DIRECT;
                                                break;
                                            case 9:
                                                buub = buub.WEB_RTC;
                                                break;
                                            default:
                                                buub = buub.UNKNOWN_MEDIUM;
                                                break;
                                        }
                                        arrayList5.add(buub);
                                    }
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    buuc buuc7 = (buuc) da.f164949b;
                                    if (!buuc7.f154929f.mo73666a()) {
                                        buuc7.f154929f = GeneratedMessageLite.m124019a(buuc7.f154929f);
                                    }
                                    int size = arrayList5.size();
                                    for (int i7 = 0; i7 < size; i7++) {
                                        buuc7.f154929f.mo74153d(((buub) arrayList5.get(i7)).f154920k);
                                    }
                                    a.mo36799a(ahoy.m56304a(buuw.CONNECTION_REQUEST, da.mo74062i()).serializeToBytes());
                                    ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("In requestConnection(), wrote ConnectionRequestFrame to endpoint %s", str2);
                                    Map map = ahmn.f67551h;
                                    ahmh ahmh3 = (ahmh) ahmn.f67550g.get(ahkv2);
                                    if (ahmh3 == null || !ahmh3.mo36831c(str2)) {
                                        ahmg = null;
                                    } else {
                                        ahmg = (ahmg) ahmh3.mo36830b(str2).get(0);
                                    }
                                    map.put(str2, new ahmj(ahkv2, ahmg.f67522c, a, nextInt, false, elapsedRealtime2, null, aify, bqgy3, null, false));
                                    ahmz ahmz = ahmn.f67547d;
                                    bArr = a;
                                    ahkv = ahkv2;
                                    r11 = bqgy3;
                                    ahmz.f67592d.execute(new ahmv(ahmz, ahkv2, str2, bArr, ahmn));
                                    return;
                                } catch (IOException e2) {
                                    throw new IOException("Failed to write ConnectionRequestFrame", e2);
                                } catch (ahmf e3) {
                                } catch (ahmf | IOException e4) {
                                    e = e4;
                                    ahkv ahkv3 = ahkv;
                                    bqgy bqgy4 = r11;
                                    r16 = bArr;
                                    bqgy2 = bqgy4;
                                    bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
                                    bnsl.mo68437a(e);
                                    bnsl.mo68418a("requestConnection() for client %d failed to initialize the connection with endpoint %s", ahkv3.mo36706b(), str2);
                                    if (!(e instanceof ahmf)) {
                                    }
                                    ahmn.mo36843a(ahkv3, str2, (ahna) r16, i, bqgy2);
                                    return;
                                }
                            } else {
                                ahkv = ahkv2;
                                z = false;
                            }
                        }
                        String valueOf = String.valueOf(str2);
                        throw new ahmf(bvif, i2, valueOf.length() != 0 ? new String("Failed to connect to endpoint ") : "Failed to connect to endpoint ".concat(valueOf));
                    }
                }
                str = null;
                if (str != null) {
                }
                ArrayList arrayList22 = new ArrayList(list);
                if (list.isEmpty()) {
                }
                list = arrayList22;
                Collections.sort(list, ahmn.f67544a);
                try {
                    bvif = bvif.UNKNOWN_MEDIUM;
                    i2 = 13;
                    ahkv = c;
                    while (r12.hasNext()) {
                    }
                    String valueOf2 = String.valueOf(str2);
                    throw new ahmf(bvif, i2, valueOf2.length() != 0 ? new String("Failed to connect to endpoint ") : "Failed to connect to endpoint ".concat(valueOf2));
                } catch (ahmf e5) {
                    ahkv = ahkv2;
                    bqgy2 = bqgy3;
                    ahmf ahmf = e5;
                    try {
                        bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68388c();
                        bnsl2.mo68437a(ahmf);
                        bnsl2.mo68424a("Failed to connect to endpoint %s over medium %s", str2, ahmf.f67519a.name());
                        bvif = ahmf.f67519a;
                        aify aify2 = aify;
                        int i8 = ahmf.f67520b;
                        ahmn.m56139a(ahkv, bvif, str2, false, elapsedRealtime);
                        bqgy3 = bqgy2;
                        ahkv2 = ahkv;
                        aify = aify2;
                        i2 = i8;
                        z = false;
                    } catch (ahmf | IOException e6) {
                        e = e6;
                        r16 = 0;
                        bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68387b();
                        bnsl3.mo68437a(e);
                        bnsl3.mo68418a("requestConnection() for client %d failed to initialize the connection with endpoint %s", ahkv3.mo36706b(), str2);
                        if (!(e instanceof ahmf)) {
                        }
                        ahmn.mo36843a(ahkv3, str2, (ahna) r16, i, bqgy2);
                        return;
                    }
                } catch (IOException e7) {
                }
            }
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("In requestConnection(), given unknown endpoint %s", str2);
            bqgy.mo69138b((Object) 8011);
        } else {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("In requestConnection(), client %d attempted a connection with endpoint %s, but outgoing connections are disallowed", ahkv2.mo36706b(), str2);
            bqgy3.mo69138b((Object) 8009);
        }
    }
}
