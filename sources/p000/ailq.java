package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Build;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.nearby.mediums.NearFieldCommunication$1;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ailq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ailq {

    /* renamed from: a */
    private final Context f69140a;

    /* renamed from: b */
    private final Set f69141b = new C1225nr();

    /* renamed from: c */
    private BroadcastReceiver f69142c;

    /* renamed from: d */
    private final Map f69143d = new C1223np();

    /* renamed from: e */
    private final Map f69144e = new C1223np();

    /* renamed from: f */
    private final Map f69145f = new C1223np();

    /* renamed from: g */
    private final ScheduledExecutorService f69146g = ahhr.m55804a();

    /* renamed from: h */
    private final Map f69147h = new C1223np();

    /* renamed from: i */
    private final Map f69148i = new C1223np();

    /* renamed from: j */
    private final bqgj f69149j = ahhr.m55806b();

    public ailq(Context context) {
        this.f69140a = context.getApplicationContext();
    }

    /* renamed from: e */
    private final boolean m57420e(String str) {
        return this.f69141b.contains(str);
    }

    /* renamed from: f */
    private final boolean m57421f(String str) {
        return this.f69143d.containsKey(str);
    }

    /* renamed from: g */
    private final boolean m57422g(String str) {
        return this.f69148i.containsKey(str);
    }

    /* renamed from: a */
    public final synchronized airy mo37646a(String str, aisb aisb, ahfk ahfk) {
        airy airy;
        airy = null;
        if (ahfk.mo36401b()) {
            srn srn = ailf.f69111a;
            return null;
        }
        try {
            aisb.mo37928a("F00000FE2C");
            airy airy2 = new airy(aisb);
            try {
                if (!airy2.f69606c.mo37927a(new airt(Byte.MIN_VALUE, (byte) 2, (byte) 0, (byte) 0, str.getBytes(), 0)).mo37911c()) {
                    airy = airy2;
                } else {
                    throw new IOException("Failed to connect to remote NFC device");
                }
            } catch (IOException e) {
            }
        } catch (IOException e2) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("ailq", "a", 453, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to connect to NFC device %s.", aisb);
            srz.m36171a(aisb);
            return null;
        }
        return airy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo37655b(String str) {
        if (!m57421f(str)) {
            srn srn = ailf.f69111a;
            return;
        }
        Iterator it = new C1225nr(((ailp) this.f69143d.get(str)).f69139a).iterator();
        while (it.hasNext()) {
            aisb aisb = (aisb) it.next();
            if (!aisb.mo37930c()) {
                ((ailp) this.f69143d.get(str)).f69139a.remove(aisb);
                srn srn2 = ailf.f69111a;
                ahpj ahpj = ((ahom) this.f69144e.get(str)).f67659a;
                ahpj.f67726f.mo36847a(new ahpi(ahpj, aisb));
            }
        }
        if (((ailp) this.f69143d.get(str)).f69139a.isEmpty()) {
            ((ahfi) this.f69147h.remove(str)).mo36396b();
        }
    }

    /* renamed from: c */
    public final synchronized void mo37657c(String str) {
        if (!m57421f(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("ailq", "c", 393, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop NFC discovery because it was never started.");
            return;
        }
        ahfi ahfi = (ahfi) this.f69147h.remove(str);
        if (ahfi != null) {
            ahfi.mo36396b();
        }
        this.f69143d.remove(str);
        this.f69144e.remove(str);
        this.f69145f.remove(str);
        if (this.f69143d.keySet().isEmpty()) {
            ahhd.m55766a(this.f69140a, this.f69142c);
            this.f69142c = null;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("ailq", "c", 410, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("NFC discovery successfully stopped.");
    }

    /* renamed from: d */
    public final synchronized void mo37658d(String str) {
        if (m57422g(str)) {
            this.f69148i.remove(str);
        }
    }

    /* renamed from: a */
    public final synchronized void mo37647a() {
        ahhr.m55805a(this.f69146g, "NearFieldCommunication.onLostExecutor");
        ahhr.m55805a(this.f69149j, "NearFieldCommunication.singleThreadOffloader");
        Iterator it = new C1225nr(this.f69141b).iterator();
        while (it.hasNext()) {
            mo37650a((String) it.next());
        }
        Iterator it2 = new C1225nr(this.f69148i.keySet()).iterator();
        while (it2.hasNext()) {
            mo37658d((String) it2.next());
        }
        Iterator it3 = new C1225nr(this.f69143d.keySet()).iterator();
        while (it3.hasNext()) {
            mo37657c((String) it3.next());
        }
    }

    /* renamed from: b */
    public final boolean mo37656b() {
        if (!cfnv.m140752N()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return this.f69140a.getPackageManager().hasSystemFeature("android.hardware.nfc") && this.f69140a.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ee, code lost:
        if (r6 != false) goto L_0x010f;
     */
    /* renamed from: a */
    public final synchronized void mo37648a(Tag tag) {
        byte[] bArr;
        synchronized (this) {
            IsoDep isoDep = IsoDep.get(tag);
            if (isoDep == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("ailq", "a", 275, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Ignoring discovered NFC tag because it's not of type IsoDep.");
                return;
            }
            airw airw = new airw(isoDep);
            try {
                airw.mo37928a("F00000FE2C");
                boolean z = false;
                for (String str : this.f69143d.keySet()) {
                    if (!((ailp) this.f69143d.get(str)).f69139a.contains(airw)) {
                        bvgm bvgm = (bvgm) this.f69145f.get(str);
                        if (bvgm != null) {
                            airu a = airw.mo37927a(new airt(Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, bvgm.serializeToBytes(), 255));
                            if (!a.mo37911c()) {
                                bvgl bvgl = (bvgl) GeneratedMessageLite.m124016a(bvgl.f156007d, a.f69600a, bxus.m123744c());
                                srn srn = ailf.f69111a;
                                ((ailp) this.f69143d.get(str)).f69139a.add(airw);
                                ahom ahom = (ahom) this.f69144e.get(str);
                                byte[] k = bvgl.f156010b.getKey();
                                if ((bvgl.f156009a & 2) != 0) {
                                    bArr = bvgl.f156011c.getKey();
                                } else {
                                    bArr = null;
                                }
                                ahpj ahpj = ahom.f67659a;
                                ahpj.f67726f.mo36847a(new ahph(ahpj, airw, k, bArr));
                                if (!this.f69147h.containsKey(str)) {
                                    this.f69147h.put(str, ahfi.m55634a(new ailm(this, str), cfnv.f184625a.mo6606a().mo81785ar(), this.f69146g));
                                }
                            } else {
                                srn srn2 = ailf.f69111a;
                                z = true;
                            }
                        }
                    } else {
                        srn srn3 = ailf.f69111a;
                    }
                }
                srz.m36171a(airw);
            } catch (IOException e) {
                try {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("ailq", "a", 286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Failed to connect to discovered NFC tag.");
                    srz.m36171a(airw);
                    if (airw.mo37930c()) {
                        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl3.mo68432a("ailq", "a", 295, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68415a("Will try to read the NFC tag again in %d millis.", cfnv.m140748J());
                        this.f69146g.schedule(new aill(this, tag), cfnv.m140748J(), TimeUnit.MILLISECONDS);
                        return;
                    }
                    bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl4.mo68432a("ailq", "a", 303, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("NFC tag is lost. Discarding.");
                } catch (Throwable th) {
                    srz.m36171a(airw);
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo37649a(Runnable runnable) {
        this.f69149j.execute(runnable);
    }

    /* renamed from: a */
    public final synchronized void mo37650a(String str) {
        if (!m57420e(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("ailq", "a", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop NFC advertising because it was never started.");
            return;
        }
        airz.m57841a().mo37925b(str);
        this.f69141b.remove(str);
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("ailq", "a", 208, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("NFC advertising successfully stopped.");
    }

    /* renamed from: a */
    public final synchronized void mo37651a(String str, airy airy) {
        if (!m57422g(str)) {
            srz.m36171a(airy);
            return;
        }
        ahps ahps = ((ahog) this.f69148i.get(str)).f67653a;
        ahps.f67749c.mo36847a(new ahpr(ahps, airy));
    }

    /* renamed from: a */
    public final synchronized boolean mo37652a(String str, ahog ahog) {
        if (m57422g(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("ailq", "a", 421, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Can't start accepting NFC connections because we're already accepting connections for service id %s.", str);
            return false;
        }
        this.f69148i.put(str, ahog);
        return true;
    }

    /* renamed from: a */
    public final synchronized boolean mo37653a(String str, String str2, ahom ahom, byte[] bArr) {
        if (str == null || ahom == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("ailq", "a", 222, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start NFC discovery because a null serviceId or discoveredDeviceCallback was passed in.");
            return false;
        } else if (m57421f(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("ailq", "a", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Refusing to start NFC discovery because we're already discovering.");
            return false;
        } else if (!mo37656b()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("ailq", "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to start NFC discovery because NFC is not available.");
            return false;
        } else {
            if (this.f69142c == null) {
                NearFieldCommunication$1 nearFieldCommunication$1 = new NearFieldCommunication$1(this, "nearby");
                this.f69142c = nearFieldCommunication$1;
                this.f69140a.registerReceiver(nearFieldCommunication$1, new IntentFilter("android.nfc.action.TAG_DISCOVERED"));
            }
            bxvd da = bvgm.f156012e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgm bvgm = (bvgm) da.f164949b;
            str.getClass();
            int i = bvgm.f156014a | 1;
            bvgm.f156014a = i;
            bvgm.f156015b = str;
            str2.getClass();
            bvgm.f156014a = i | 2;
            bvgm.f156016c = str2;
            if (bArr != null) {
                if (bArr.length > 0) {
                    ByteString a = ByteString.m123261a(bArr);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvgm bvgm2 = (bvgm) da.f164949b;
                    a.getClass();
                    bvgm2.f156014a |= 4;
                    bvgm2.f156017d = a;
                }
            }
            this.f69145f.put(str, (bvgm) da.mo74062i());
            this.f69143d.put(str, new ailp());
            this.f69144e.put(str, ahom);
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
            bnsl4.mo68432a("ailq", "a", 265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("NFC discovery successfully started.");
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo37654a(String str, byte[] bArr, byte[] bArr2, ahpy ahpy) {
        if (str == null || bArr == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("ailq", "a", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start NFC advertising because a null serviceId or tag was passed in.");
            return false;
        } else if (m57420e(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("ailq", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Refusing to start NFC advertising because we're already advertising.");
            return false;
        } else if (!mo37656b()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("ailq", "a", 169, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to start NFC advertising because NFC is not available.");
            return false;
        } else {
            bxvd da = bvgl.f156007d.mo74144da();
            ByteString a = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgl bvgl = (bvgl) da.f164949b;
            a.getClass();
            bvgl.f156009a |= 1;
            bvgl.f156010b = a;
            if (bArr2 != null) {
                if (bArr2.length > 0) {
                    ByteString a2 = ByteString.m123261a(bArr2);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvgl bvgl2 = (bvgl) da.f164949b;
                    a2.getClass();
                    bvgl2.f156009a |= 2;
                    bvgl2.f156011c = a2;
                }
            }
            airz.m57841a().mo37920a(str, ahpy, (bvgl) da.mo74062i(), new ailk(this, str));
            this.f69141b.add(str);
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
            bnsl4.mo68432a("ailq", "a", 186, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("NFC advertising successfully started.");
            return true;
        }
    }
}
