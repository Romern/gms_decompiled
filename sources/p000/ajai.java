package p000;

import android.content.Context;
import com.google.android.gms.leveldb.WriteBatch;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: ajai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajai implements aixa {

    /* renamed from: a */
    public static final ahfo f70240a = new ahfo();

    /* renamed from: b */
    public final aizw f70241b = new aizw();

    /* renamed from: c */
    public final nez f70242c = new nez();

    /* renamed from: d */
    public final Context f70243d;

    /* renamed from: e */
    public final ajat f70244e;

    /* renamed from: f */
    public final int f70245f;

    /* renamed from: g */
    public final Map f70246g = new HashMap();

    /* renamed from: h */
    public final Map f70247h = new HashMap();

    /* renamed from: i */
    public final Map f70248i = new HashMap();

    /* renamed from: j */
    public final ajaf f70249j;

    /* renamed from: k */
    public final Collection f70250k = new ArrayList();

    /* renamed from: l */
    public final buqh f70251l;

    /* renamed from: m */
    private final aiya f70252m;

    public ajai(Context context) {
        this.f70243d = context;
        ajat ajat = (ajat) ahgz.m55754a(context, ajat.class);
        this.f70244e = ajat;
        this.f70245f = ajat.mo38427m().f168868g;
        ((aixb) ahgz.m55754a(context, aixb.class)).mo38196a(this);
        this.f70251l = (buqh) ahgz.m55754a(context, buqh.class);
        this.f70249j = (ajaf) ahgz.m55754a(context, ajaf.class);
        this.f70252m = (aiya) ahgz.m55754a(this.f70243d, aiya.class);
    }

    /* renamed from: a */
    public static boolean m58348a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: b */
    public final List mo38391b(List list) {
        this.f70251l.mo72984b();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byys byys = (byys) it.next();
            if (this.f70247h.containsKey(byys)) {
                arrayList.add((ajag) this.f70246g.get(this.f70247h.get(byys)));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public final int mo38382a(ajag ajag, BleSignalImpl bleSignalImpl, byys byys, String str, byte[] bArr) {
        int i;
        this.f70251l.mo72984b();
        int i2 = 0;
        if (byys != null) {
            mo38388a(byys, ajag);
            i = ajag.m58331a(byys, bleSignalImpl, ajag.f70233c, 1);
            if (m58348a(i, 1)) {
                srn srn = ahfq.f67120a;
            }
        } else {
            i = 0;
        }
        if (str != null) {
            i |= ajag.m58331a(str, bleSignalImpl, ajag.f70234d, 2);
            if (m58348a(i, 2)) {
                srn srn2 = ahfq.f67120a;
                String str2 = ajag.f70232b;
            }
        }
        if (bArr == null) {
            return i;
        }
        if (!Arrays.equals(ajag.f70239i, bArr)) {
            ajag.f70239i = bArr;
            i2 = 8;
        }
        return i | i2;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List, java.util.Collection], assign insn: 0x002b: IGET  (r1v5 ? I:java.util.Collection) = (r9v0 'this' ajai A[THIS]) ajai.k java.util.Collection */
    /* renamed from: b */
    public final void mo38392b() {
        int i;
        this.f70251l.mo72984b();
        srn srn = ahfq.f67120a;
        this.f70246g.size();
        this.f70247h.size();
        ArrayList arrayList = new ArrayList(this.f70246g.values());
        this.f70246g.clear();
        this.f70247h.clear();
        this.f70248i.clear();
        ? r1 = this.f70250k;
        int size = r1.size();
        int i2 = 0;
        while (i2 < size) {
            ajah ajah = (ajah) r1.get(i2);
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 >= size2) {
                    break;
                }
                ajah.mo38309a((ajag) arrayList.get(i3));
                i3++;
            }
            i2 = i;
        }
        this.f70241b.f70196a = new aizz();
    }

    /* renamed from: a */
    public final long mo38383a(List list) {
        this.f70251l.mo72984b();
        int size = list.size();
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            ajag a = mo38384a((byys) list.get(i));
            if (a != null) {
                long j2 = a.f70236f;
                if (j2 < j) {
                    j = j2;
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public final ajag mo38384a(byys byys) {
        this.f70251l.mo72984b();
        return (ajag) this.f70246g.get(this.f70247h.get(byys));
    }

    /* renamed from: a */
    public final Collection mo38385a() {
        this.f70251l.mo72984b();
        return this.f70246g.values();
    }

    /* renamed from: a */
    public final Set mo38386a(byys... byysArr) {
        this.f70251l.mo72984b();
        TreeSet treeSet = new TreeSet();
        for (ajag ajag : this.f70246g.values()) {
            for (byys byys : byysArr) {
                if (ajag.f70233c.containsKey(byys)) {
                    treeSet.add(ajag);
                }
            }
        }
        return treeSet;
    }

    /* renamed from: a */
    public final void mo38195a(int i) {
        this.f70251l.mo72984b();
        if (i >= 80) {
            mo38392b();
        }
    }

    /* renamed from: a */
    public final void mo38387a(ajah ajah) {
        this.f70250k.add(ajah);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.util.Collection], assign insn: 0x004d: IGET  (r0v5 ? I:java.util.Collection) = (r4v0 'this' ajai A[THIS]) ajai.k java.util.Collection */
    /* renamed from: a */
    public final void mo38388a(byys byys, ajag ajag) {
        for (ajag ajag2 : mo38385a()) {
            if (ajag2.f70233c.containsKey(byys) && (ajag == null || ajag2.compareTo(ajag) < 0)) {
                ajag = ajag2;
            }
        }
        String str = (String) this.f70247h.get(byys);
        if (ajag == null) {
            this.f70247h.remove(byys);
            this.f70248i.remove(byys);
        } else if (!ajag.f70232b.equals(str)) {
            this.f70247h.put(byys, ajag.f70232b);
            if (str != null) {
                ? r0 = this.f70250k;
                int size = r0.size();
                for (int i = 0; i < size; i++) {
                    ((ajah) r0.get(i)).mo38381a(byys, ajag);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo38389a(String str, int i, int i2, double d, byys byys, int i3) {
        String str2;
        String str3;
        String str4 = str;
        byys byys2 = byys;
        int i4 = i3;
        bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
        bnsl.mo68432a("ajai", "a", 538, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Double valueOf3 = Double.valueOf(d);
        String a = boan.f132472f.mo68794a(byys2.f169006c.getKey());
        String a2 = bzal.m125582a(i3);
        if (i4 != 0) {
            bnsl.mo68428a("BleDeviceCache: new Fast Pair device [%s]: rssi=%d, tx=%d, distance=%.2fm, id=%s, scanMode=%s", str, valueOf, valueOf2, valueOf3, a, a2);
            aiya aiya = this.f70252m;
            aixx aixx = new aixx();
            ByteString bxtx = byys2.f169006c;
            if (bxtx != null) {
                aixx.f70039a = bxtx;
                aixx.f70040b = valueOf;
                aixx.f70041c = valueOf2;
                aixx.f70042d = valueOf3;
                if (str4 != null) {
                    aixx.f70043e = str4;
                    if (i4 != 0) {
                        aixx.f70044f = i4;
                        String str5 = aixx.f70039a == null ? " modelId" : "";
                        if (aixx.f70040b == null) {
                            str5 = str5.concat(" rssi");
                        }
                        if (aixx.f70041c == null) {
                            str5 = String.valueOf(str5).concat(" txPower");
                        }
                        if (aixx.f70042d == null) {
                            str5 = String.valueOf(str5).concat(" distance");
                        }
                        if (aixx.f70043e == null) {
                            str5 = String.valueOf(str5).concat(" macAddress");
                        }
                        if (aixx.f70044f == 0) {
                            str5 = String.valueOf(str5).concat(" bleScanMode");
                        }
                        if (!str5.isEmpty()) {
                            String valueOf4 = String.valueOf(str5);
                            throw new IllegalStateException(valueOf4.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf4));
                        }
                        aiwh aiwh = new aiwh(aixx.f70039a, aixx.f70040b.intValue(), aixx.f70041c.intValue(), aixx.f70042d.doubleValue(), aixx.f70043e, aixx.f70044f);
                        bxvd da = bywm.f168613n.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bywm bywm = (bywm) da.f164949b;
                        bywm.f168616b = 10;
                        bywm.f168615a |= 1;
                        bxvd da2 = byvz.f168541e.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        byvz byvz = (byvz) da2.f164949b;
                        byvz.f168544b = 1;
                        int i5 = byvz.f168543a | 1;
                        byvz.f168543a = i5;
                        byvz.f168543a = i5 | 2;
                        byvz.f168545c = 1;
                        bxvd da3 = byvt.f168503i.mo74144da();
                        byte a3 = aiwh.f69930a.mo73744a() == 3 ? ((aiwh.f69930a.mo73743a(0) & 255) << 16) | ((aiwh.f69930a.mo73743a(1) & 255) << 8) | (aiwh.f69930a.mo73743a(2) & 255) : 0;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        byvt byvt = (byvt) da3.f164949b;
                        byvt.f168505a |= 1;
                        byvt.f168506b = a3;
                        int i6 = aiwh.f69931b;
                        byvt byvt2 = (byvt) da3.f164949b;
                        byvt2.f168505a |= 2;
                        byvt2.f168507c = i6;
                        int i7 = aiwh.f69932c;
                        byvt byvt3 = (byvt) da3.f164949b;
                        byvt3.f168505a |= 4;
                        byvt3.f168508d = i7;
                        double d2 = aiwh.f69933d;
                        byvt byvt4 = (byvt) da3.f164949b;
                        byvt4.f168505a |= 8;
                        byvt4.f168509e = d2;
                        long longValue = aiya.mo72977b(aiwh.f69934e).longValue();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        byvt byvt5 = (byvt) da3.f164949b;
                        byvt5.f168505a |= 16;
                        byvt5.f168510f = longValue;
                        int i8 = aiwh.f69935f;
                        byvt byvt6 = (byvt) da3.f164949b;
                        int i9 = i8 - 1;
                        if (i8 != 0) {
                            byvt6.f168511g = i9;
                            byvt6.f168505a |= 32;
                            int a4 = ahfz.m55679a();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            byvt byvt7 = (byvt) da3.f164949b;
                            byvt7.f168512h = a4 - 1;
                            byvt7.f168505a |= 64;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            byvz byvz2 = (byvz) da2.f164949b;
                            byvt byvt8 = (byvt) da3.mo74062i();
                            byvt8.getClass();
                            byvz2.f168546d = byvt8;
                            byvz2.f168543a |= 4;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bywm bywm2 = (bywm) da.f164949b;
                            byvz byvz3 = (byvz) da2.mo74062i();
                            byvz3.getClass();
                            bywm2.f168627m = byvz3;
                            bywm2.f168615a |= 2048;
                            if (cfos.m141988b()) {
                                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68390d();
                                bnsl2.mo68432a("aiya", "a", 277, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                byvz byvz4 = ((bywm) da.f164949b).f168627m;
                                if (byvz4 == null) {
                                    byvz4 = byvz.f168541e;
                                }
                                int a5 = bzbh.m125612a(byvz4.f168544b);
                                if (a5 == 0) {
                                    a5 = 1;
                                }
                                String str6 = a5 != 1 ? "CACHE_TYPE_FAST_PAIR" : "CACHE_TYPE_UNKNOWN";
                                byvz byvz5 = ((bywm) da.f164949b).f168627m;
                                if (byvz5 == null) {
                                    byvz5 = byvz.f168541e;
                                }
                                byvt byvt9 = byvz5.f168546d;
                                if (byvt9 == null) {
                                    byvt9 = byvt.f168503i;
                                }
                                Integer valueOf5 = Integer.valueOf(byvt9.f168506b);
                                byvz byvz6 = ((bywm) da.f164949b).f168627m;
                                if (byvz6 == null) {
                                    byvz6 = byvz.f168541e;
                                }
                                byvt byvt10 = byvz6.f168546d;
                                if (byvt10 == null) {
                                    byvt10 = byvt.f168503i;
                                }
                                Double valueOf6 = Double.valueOf(byvt10.f168509e);
                                String str7 = aiwh.f69934e;
                                byvz byvz7 = ((bywm) da.f164949b).f168627m;
                                if (byvz7 == null) {
                                    byvz7 = byvz.f168541e;
                                }
                                byvt byvt11 = byvz7.f168546d;
                                if (byvt11 == null) {
                                    byvt11 = byvt.f168503i;
                                }
                                Long valueOf7 = Long.valueOf(byvt11.f168510f);
                                byvz byvz8 = ((bywm) da.f164949b).f168627m;
                                if (byvz8 == null) {
                                    byvz8 = byvz.f168541e;
                                }
                                byvt byvt12 = byvz8.f168546d;
                                if (byvt12 == null) {
                                    byvt12 = byvt.f168503i;
                                }
                                int b = bzal.m125583b(byvt12.f168511g);
                                if (b == 0) {
                                    b = 1;
                                }
                                String a6 = bzal.m125582a(b);
                                byvz byvz9 = ((bywm) da.f164949b).f168627m;
                                if (byvz9 == null) {
                                    byvz9 = byvz.f168541e;
                                }
                                byvt byvt13 = byvz9.f168546d;
                                if (byvt13 == null) {
                                    byvt13 = byvt.f168503i;
                                }
                                int a7 = bvjb.m121166a(byvt13.f168512h);
                                if (a7 == 0) {
                                    a7 = 1;
                                }
                                if (a7 == 1) {
                                    str3 = "UNKNOWN_USER_TYPE";
                                } else if (a7 == 2) {
                                    str3 = "PRODUCTION";
                                } else if (a7 == 3) {
                                    str3 = "MODULEFOOD";
                                } else if (a7 == 4) {
                                    str3 = "TEST";
                                } else if (a7 != 5) {
                                    str2 = "AUTO_TEST";
                                    bnsl2.mo68429a("NearbyMessagesLogger UPDATE %s, model %s, distance .%2fm, address %s (salted %s), scan mode %s, user type %s", str6, valueOf5, valueOf6, str7, valueOf7, a6, str2);
                                } else {
                                    str3 = "PRESTO_DOGFOOD";
                                }
                                str2 = str3;
                                bnsl2.mo68429a("NearbyMessagesLogger UPDATE %s, model %s, distance .%2fm, address %s (salted %s), scan mode %s, user type %s", str6, valueOf5, valueOf6, str7, valueOf7, a6, str2);
                            }
                            aiya.mo72976a((String) null, (String) null, (bywm) da.mo74062i());
                            return;
                        }
                        throw null;
                    }
                    throw new NullPointerException("Null bleScanMode");
                }
                throw new NullPointerException("Null macAddress");
            }
            throw new NullPointerException("Null modelId");
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo38390a(byyr[] byyrArr) {
        if (byyrArr != null && (r0 = byyrArr.length) > 0) {
            ajaf ajaf = this.f70249j;
            if (ajaf.mo38365c()) {
                WriteBatch create = WriteBatch.create();
                for (byyr byyr : byyrArr) {
                    byys byys = byyr.f168999b;
                    if (byys == null) {
                        byys = byys.f169002d;
                    }
                    ajae ajae = new ajae(byys);
                    bgfc a = ajaf.mo38357a(ajae);
                    if (a == null) {
                        a = ajaf.mo38358a((Collection) bnon.f131923a);
                    }
                    bxvd bxvd = (bxvd) a.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) a);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bgfc bgfc = (bgfc) bxvd.f164949b;
                    bgfc bgfc2 = bgfc.f116334f;
                    byyr.getClass();
                    bgfc.f116339d = byyr;
                    bgfc.f116336a |= 2;
                    ajaf.m58316a(create, ajae, (bgfc) bxvd.mo74062i());
                }
                ajaf.mo38360a(create);
            }
        }
    }
}
