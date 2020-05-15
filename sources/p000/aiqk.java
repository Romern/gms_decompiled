package p000;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import com.google.android.gms.beacon.BleSighting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: aiqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiqk {

    /* renamed from: a */
    private final Map f69502a = new C1223np();

    /* renamed from: b */
    private final Map f69503b = new C1223np();

    /* renamed from: c */
    private final Map f69504c = new C1223np();

    /* renamed from: d */
    private final Map f69505d = new C1223np();

    /* renamed from: e */
    private final Map f69506e = new C1223np();

    /* renamed from: f */
    private final Map f69507f = new C1223np();

    /* renamed from: g */
    private final Map f69508g = new C1223np();

    /* renamed from: h */
    private final Map f69509h = new C1223np();

    /* renamed from: a */
    private static aipt m57715a(aipf aipf, int i) {
        return new aipt(aipf.mo37806b(), i);
    }

    /* renamed from: b */
    private static aipg m57722b(byte[] bArr) {
        return new aipg(2, 1, new byte[10], m57721a(bArr), 0);
    }

    /* renamed from: c */
    private final Set m57723c() {
        return new C1225nr(this.f69502a.keySet());
    }

    /* renamed from: a */
    private final Map m57716a(List list, ParcelUuid parcelUuid) {
        byte[] bArr;
        Set c = m57723c();
        C1223np npVar = new C1223np();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            aipf a = aipf.m57642a(bArr2);
            if (a != null) {
                Iterator it2 = c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str = (String) it2.next();
                    if (!npVar.containsKey(str) || ((aipf) npVar.get(str)).f69418a <= a.f69418a) {
                        if (!a.f69420c || parcelUuid == null) {
                            byte[] a2 = ails.m57446a(str.getBytes(), 3);
                            if (!a.f69420c) {
                                byte[] bArr3 = a.f69421d;
                                bArr = Arrays.copyOf(bArr3, bArr3.length);
                            } else {
                                bArr = null;
                            }
                            if (Arrays.equals(a2, bArr)) {
                                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                                bnsl.mo68432a("aiqk", "a", 734, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68424a("Matched service ID %s to GATT advertisement %s.", str, a);
                                npVar.put(str, a);
                                break;
                            }
                        } else if (parcelUuid.equals(this.f69504c.get(str))) {
                            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                            bnsl2.mo68432a("aiqk", "a", 722, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68425a("This GATT advertisement %s is a Fast Advertisement and matched UUID %s in fastAdvertisementServiceUuids map with serviceID %s", a, parcelUuid, str);
                            npVar.put(str, a);
                        }
                    }
                }
            } else {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                bnsl3.mo68432a("aiqk", "a", 701, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Unable to parse raw GATT advertisement %s", ails.m57438a(bArr2));
            }
        }
        return npVar;
    }

    /* renamed from: b */
    public final synchronized void mo37861b() {
        for (String str : m57723c()) {
            for (aipf aipf : ((ailg) this.f69503b.get(str)).mo37633a()) {
                m57717a(aipf);
                aipt aipt = new aipt(aipf.mo37806b(), 0);
                ahpd ahpd = ((ahoj) this.f69502a.get(str)).f67656a;
                ahpd.f67705f.mo36847a(new ahpc(ahpd, aipt));
            }
        }
    }

    /* renamed from: a */
    private final void m57717a(aipf aipf) {
        this.f69507f.remove(aipf);
        this.f69509h.remove(aipf);
        aipg aipg = (aipg) this.f69508g.remove(aipf);
        if (this.f69506e.containsKey(aipg)) {
            Set set = (Set) this.f69506e.get(aipg);
            set.remove(aipf);
            this.f69505d.remove(aipg);
            if (set.isEmpty()) {
                this.f69506e.remove(aipg);
            }
        }
    }

    /* renamed from: a */
    private final void m57718a(aipg aipg, String str) {
        if (!this.f69506e.containsKey(aipg)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiqk", "a", 748, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("No GATT advertisements found for advertisement header %s.", aipg);
            return;
        }
        for (aipf aipf : (Set) this.f69506e.get(aipg)) {
            String str2 = (String) this.f69507f.get(aipf);
            if (m57723c().contains(str2)) {
                ((ailg) this.f69503b.get(str2)).mo37634a(aipf);
                this.f69509h.put(aipf, str);
            }
        }
    }

    /* renamed from: a */
    private final void m57719a(aipg aipg, List list, ParcelUuid parcelUuid) {
        byte[] bArr;
        Set c = m57723c();
        C1223np npVar = new C1223np();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            aipf a = aipf.m57642a(bArr2);
            if (a != null) {
                Iterator it2 = c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str = (String) it2.next();
                    if (!npVar.containsKey(str) || ((aipf) npVar.get(str)).f69418a <= a.f69418a) {
                        if (!a.f69420c || parcelUuid == null) {
                            byte[] a2 = ails.m57446a(str.getBytes(), 3);
                            if (!a.f69420c) {
                                byte[] bArr3 = a.f69421d;
                                bArr = Arrays.copyOf(bArr3, bArr3.length);
                            } else {
                                bArr = null;
                            }
                            if (Arrays.equals(a2, bArr)) {
                                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                                bnsl.mo68432a("aiqk", "a", 734, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68424a("Matched service ID %s to GATT advertisement %s.", str, a);
                                npVar.put(str, a);
                                break;
                            }
                        } else if (parcelUuid.equals(this.f69504c.get(str))) {
                            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                            bnsl2.mo68432a("aiqk", "a", 722, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68425a("This GATT advertisement %s is a Fast Advertisement and matched UUID %s in fastAdvertisementServiceUuids map with serviceID %s", a, parcelUuid, str);
                            npVar.put(str, a);
                        }
                    }
                }
            } else {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                bnsl3.mo68432a("aiqk", "a", 701, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Unable to parse raw GATT advertisement %s", ails.m57438a(bArr2));
            }
        }
        for (String str2 : npVar.keySet()) {
            aipf aipf = (aipf) npVar.get(str2);
            aipg aipg2 = (aipg) this.f69508g.get(aipf);
            if (!cfnv.m140800x()) {
                if (!this.f69508g.containsKey(aipf)) {
                    ((ahoj) this.f69502a.get(str2)).mo36906a(m57715a(aipf, aipg.f69427d), aipf.mo37805a(), aipf.f69420c);
                } else {
                    this.f69505d.remove(aipg2);
                    this.f69506e.remove(aipg2);
                }
            } else if (aipg2 == null) {
                ((ahoj) this.f69502a.get(str2)).mo36906a(m57715a(aipf, aipg.f69427d), aipf.mo37805a(), aipf.f69420c);
            } else if (!aipg2.equals(aipg)) {
                if (aikx.m57355g()) {
                    aipg b = m57722b(aipf.mo37806b());
                    if (!b.equals(aipg2) && b.equals(aipg)) {
                    }
                }
                this.f69505d.remove(aipg2);
                this.f69506e.remove(aipg2);
            }
            this.f69508g.put(aipf, aipg);
            this.f69507f.put(aipf, str2);
        }
        this.f69506e.put(aipg, new C1225nr(npVar.values()));
    }

    /* renamed from: a */
    private final boolean m57720a(aipg aipg) {
        if (!this.f69505d.containsKey(aipg)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiqk", "a", 547, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Received advertisement header %s, but we have never seen it before. Will try reading its GATT advertisement.", aipg);
            return true;
        }
        int c = ((aipe) this.f69505d.get(aipg)).mo37804c() - 1;
        if (c == 1) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aiqk", "a", 561, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Received advertisement header %s. Will retry reading its GATT advertisement.", aipg);
            return true;
        } else if (c != 2) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aiqk", "a", 574, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Received advertisement header %s, but we have recently failed to read its GATT advertisement.", aipg);
            return false;
        } else {
            srn srn = ailf.f69111a;
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m57721a(byte[] bArr) {
        return ails.m57446a(bArr, 4);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final synchronized aiqc mo37856a(aipt aipt, aijn aijn) {
        long j;
        byte[] bArr = aipt.f69461a;
        aipf a = aipf.m57642a(Arrays.copyOf(bArr, bArr.length));
        if (this.f69509h.containsKey(a)) {
            aipg aipg = (aipg) this.f69508g.get(a);
            if (this.f69505d.containsKey(aipg)) {
                j = ((aipe) this.f69505d.get(aipg)).mo37803b();
            } else {
                j = 0;
            }
            try {
                Thread.sleep(Math.max(0L, cfnv.f184625a.mo6606a().mo81732R() - j));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return aijn.f68975a.mo37608a(a.f69419b, (String) this.f69509h.get(a), a.f69422e, aijn.f68976b, aijn.f68977c, aijn.f68978d.f69462b);
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aiqk", "a", 271, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Unable to connect to BLE peripheral %s because there is no MAC address associated with it.", aipt);
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo37857a() {
        this.f69509h.clear();
        this.f69508g.clear();
        this.f69507f.clear();
        this.f69506e.clear();
        this.f69505d.clear();
        this.f69504c.clear();
        this.f69503b.clear();
        this.f69502a.clear();
    }

    /* renamed from: a */
    public final synchronized void mo37858a(BleSighting bleSighting, aijt aijt) {
        if (m57723c().isEmpty()) {
            srn srn = ailf.f69111a;
            return;
        }
        if (bleSighting != null) {
            if (!(bleSighting.f29271a == null || bleSighting.f29272b == null)) {
                byte[] bArr = null;
                for (String str : m57723c()) {
                    ParcelUuid parcelUuid = (ParcelUuid) this.f69504c.get(str);
                    if (parcelUuid != null && (bArr = bleSighting.f29272b.mo20526a(parcelUuid)) != null) {
                        break;
                    }
                }
                if (bArr == null && aikx.m57355g()) {
                    bArr = bleSighting.f29272b.mo20526a(new ParcelUuid(airk.f69554a));
                }
                if (bArr != null) {
                    ParcelUuid parcelUuid2 = new ParcelUuid(airk.f69554a);
                    List list = bleSighting.f29272b.f35398a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ParcelUuid parcelUuid3 = (ParcelUuid) list.get(i);
                        if (!parcelUuid2.equals(parcelUuid3)) {
                            parcelUuid2 = parcelUuid3;
                        }
                    }
                    aipg b = m57722b(bArr);
                    this.f69505d.put(b, new aipe());
                    m57719a(b, Collections.singletonList(bArr), parcelUuid2);
                    m57718a(b, bleSighting.f29271a.getAddress());
                }
                byte[] a = bleSighting.f29272b.mo20526a(new ParcelUuid(airk.f69554a));
                String name = bleSighting.f29271a.getName();
                if (a != null) {
                    srn srn2 = ailf.f69111a;
                    bleSighting.f29271a.getAddress();
                } else if (name == null) {
                    srn srn3 = ailf.f69111a;
                    bleSighting.f29271a.getAddress();
                    buqd buqd = new buqd(new byte[10], new aiqn());
                    for (String str2 : m57723c()) {
                        buqd.mo72978a(str2);
                    }
                    a = aipg.m57650a(2, 10, buqd.mo72980a(), m57721a(bleSighting.f29271a.getAddress().getBytes(aipg.f69424a)), 0);
                } else {
                    srn srn4 = ailf.f69111a;
                    bleSighting.f29271a.getAddress();
                    a = name.getBytes();
                }
                aipg a2 = aipg.m57649a(a);
                if (a2 == null) {
                    ails.m57438a(a);
                    return;
                }
                buqd buqd2 = new buqd(a2.f69426c, new aiqn());
                for (String str3 : m57723c()) {
                    if (buqd2.mo72979a(str3.getBytes(buqd.f154699a))) {
                        if (!this.f69505d.containsKey(a2)) {
                            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                            bnsl.mo68432a("aiqk", "a", 547, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68420a("Received advertisement header %s, but we have never seen it before. Will try reading its GATT advertisement.", a2);
                        } else {
                            int c = ((aipe) this.f69505d.get(a2)).mo37804c() - 1;
                            if (c != 1) {
                                if (c != 2) {
                                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                                    bnsl2.mo68432a("aiqk", "a", 574, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl2.mo68420a("Received advertisement header %s, but we have recently failed to read its GATT advertisement.", a2);
                                }
                                m57718a(a2, bleSighting.f29271a.getAddress());
                                return;
                            }
                            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                            bnsl3.mo68432a("aiqk", "a", 561, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68420a("Received advertisement header %s. Will retry reading its GATT advertisement.", a2);
                        }
                        BluetoothDevice bluetoothDevice = bleSighting.f29271a;
                        Set c2 = m57723c();
                        Map map = this.f69505d;
                        map.put(a2, aijt.f68989a.mo37607a(aysl.m84704a(bluetoothDevice), a2.f69425b, (aipe) map.get(a2), a2.f69427d, c2));
                        m57719a(a2, new ArrayList(((aipe) this.f69505d.get(a2)).mo37799a()), (ParcelUuid) null);
                        m57718a(a2, bleSighting.f29271a.getAddress());
                        return;
                    }
                }
                return;
            }
        }
        srn srn5 = ailf.f69111a;
    }

    /* renamed from: a */
    public final synchronized void mo37859a(String str) {
        this.f69504c.remove(str);
        this.f69503b.remove(str);
        this.f69502a.remove(str);
    }

    /* renamed from: a */
    public final synchronized void mo37860a(String str, ahoj ahoj, ParcelUuid parcelUuid) {
        this.f69502a.put(str, ahoj);
        this.f69503b.put(str, new ailg());
        if (parcelUuid != null) {
            this.f69504c.put(str, parcelUuid);
        }
        this.f69505d.clear();
        for (aipf aipf : new C1225nr(this.f69507f.keySet())) {
            if (((String) this.f69507f.get(aipf)).equals(str)) {
                m57717a(aipf);
            }
        }
    }
}
