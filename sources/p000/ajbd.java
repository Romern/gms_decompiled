package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.handler.DirectiveHandler$2;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ajbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajbd implements aiyq, aiyg {

    /* renamed from: a */
    public final Context f70304a;

    /* renamed from: b */
    public final buqh f70305b;

    /* renamed from: c */
    public final aixs f70306c;

    /* renamed from: d */
    public final aiyt f70307d;

    /* renamed from: e */
    public final aiyw f70308e;

    /* renamed from: f */
    public final aiyx f70309f;

    /* renamed from: g */
    public Long f70310g = null;

    /* renamed from: h */
    public final buqn f70311h = new ajbc(this, "DirectiveHandler.updateDirectiveState");

    /* renamed from: i */
    private final ajeb f70312i;

    /* renamed from: j */
    private final ajat f70313j;

    /* renamed from: k */
    private final aiyr f70314k;

    /* renamed from: l */
    private final aiyh f70315l;

    /* renamed from: m */
    private final BroadcastReceiver f70316m = new DirectiveHandler$2(this, "nearby");

    /* renamed from: n */
    private boolean f70317n;

    public ajbd(Context context) {
        aixs aixs = new aixs(context);
        this.f70304a = context;
        this.f70306c = aixs;
        this.f70305b = (buqh) ahgz.m55754a(context, buqh.class);
        this.f70312i = (ajeb) ahgz.m55754a(context, ajeb.class);
        this.f70307d = new aiyt(aixs);
        this.f70308e = new aiyw(context);
        this.f70309f = (aiyx) ahgz.m55754a(context, aiyx.class);
        this.f70313j = (ajat) ahgz.m55754a(context, ajat.class);
        aiyr aiyr = (aiyr) ahgz.m55754a(this.f70304a, aiyr.class);
        this.f70314k = aiyr;
        aiyr.mo38295a(this);
        aiyh aiyh = (aiyh) ahgz.m55754a(this.f70304a, aiyh.class);
        this.f70315l = aiyh;
        aiyh.f70062d.mo72984b();
        aiyh.f70063e.add(this);
    }

    /* renamed from: a */
    private static Set m58424a(Strategy strategy) {
        return !strategy.mo44316a() ? Collections.emptySet() : m58427c(strategy);
    }

    /* renamed from: b */
    private static Set m58425b(Strategy strategy) {
        return !strategy.mo44317b() ? Collections.emptySet() : m58427c(strategy);
    }

    /* renamed from: c */
    private static Set m58427c(Strategy strategy) {
        C1225nr nrVar = new C1225nr();
        if (strategy.mo44318c()) {
            nrVar.add(bzbu.BLE_ADVERTISING_PACKET);
        }
        if (strategy.mo44319d()) {
            nrVar.add(bzbu.BLUETOOTH_CLASSIC_NAME);
        }
        if (strategy.mo44320e()) {
            nrVar.add(bzbu.AUDIO_ULTRASOUND_PASSBAND);
        }
        return nrVar;
    }

    /* renamed from: d */
    public final void mo38440d() {
        if (this.f70317n) {
            try {
                this.f70317n = false;
                this.f70304a.unregisterReceiver(this.f70316m);
            } catch (Exception e) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ajbd", "d", 455, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("DirectiveHandler: Exception unregistering mBluetoothStateReceiver.");
            }
        }
    }

    /* renamed from: b */
    private static void m58426b(Set set) {
        set.remove(bzbu.BLE_ADVERTISING_PACKET);
        set.remove(bzbu.BLE_GATT_SERVICE);
        set.remove(bzbu.BLUETOOTH_CLASSIC_NAME);
    }

    /* renamed from: a */
    public final long mo38435a(Set set) {
        byzn byzn;
        ajgm ajgm;
        Set set2 = set;
        bnge s = bnge.m109299s();
        Iterator it = set.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            bzbu bzbu = (bzbu) it.next();
            aiyh aiyh = this.f70315l;
            if (bzbu == bzbu.AUDIO_ULTRASOUND_PASSBAND && aiyh.mo38266b()) {
                aiye aiye = aiyh.f70064f;
                byte[] bArr = aiye.f70054b.f80676b;
                bxvd da = byzn.f169131e.mo74144da();
                int length = bArr.length;
                byte[] bArr2 = new byte[(length + 1)];
                bArr2[0] = aiwg.m58065a();
                System.arraycopy(bArr, 0, bArr2, 1, length);
                String d = sqd.m35972d(bArr2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byzn byzn2 = (byzn) da.f164949b;
                d.getClass();
                byzn2.f169133a |= 1;
                byzn2.f169134b = d;
                srn srn = ahfq.f67120a;
                srv.m36160a(bArr2);
                String str = ((byzn) da.f164949b).f169134b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byzn byzn3 = (byzn) da.f164949b;
                byzn3.f169133a |= 2;
                byzn3.f169135c = elapsedRealtime;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() + ajdq.m58561b(aiye.f70055c.f80692e);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byzn byzn4 = (byzn) da.f164949b;
                byzn4.f169133a |= 4;
                byzn4.f169136d = elapsedRealtime2;
                byzn = (byzn) da.mo74062i();
            } else {
                ajeb ajeb = this.f70312i;
                ajeb.f70411b.mo72984b();
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                byzn[] b = ajeb.mo38541b(bzbu.f169275k);
                if (b != null) {
                    int length2 = b.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        }
                        byzn = b[i];
                        if (byzn.f169135c <= elapsedRealtime3 && byzn.f169136d > elapsedRealtime3) {
                            break;
                        }
                        i++;
                    }
                }
                byzn = null;
            }
            if (byzn != null) {
                ahfv a = ahfv.m55670a(byzn.f169134b);
                s.mo67268a(a, bzbu);
                if (bzbu != bzbu.AUDIO_ULTRASOUND_PASSBAND || !this.f70315l.mo38266b()) {
                    ajgm = new ajgm(a, this.f70313j.mo38412a(bzbu));
                } else {
                    byyn byyn = (byyn) byyo.f168979d.mo74144da();
                    int length3 = a.f67128a.length;
                    if (byyn.f164950c) {
                        byyn.mo74035c();
                        byyn.f164950c = false;
                    }
                    byyo byyo = (byyo) byyn.f164949b;
                    int i2 = byyo.f168981a | 1;
                    byyo.f168981a = i2;
                    byyo.f168982b = length3;
                    "".getClass();
                    byyo.f168981a = 2 | i2;
                    byyo.f168983c = "";
                    srn srn2 = ahfq.f67120a;
                    srv.m36160a(a.f67128a);
                    ajgm = new ajgm(a, (byyo) byyn.mo74062i());
                }
                this.f70307d.mo38308a(bzbu, ajgm);
                j = Math.min(byzn.f169136d, j);
            } else {
                it.remove();
            }
        }
        aiyt aiyt = this.f70307d;
        srn srn3 = ahfq.f67120a;
        ajgs.m58686a(set);
        bnrd a2 = aixs.f70014a.iterator();
        while (a2.hasNext()) {
            bzbu bzbu2 = (bzbu) a2.next();
            if (!set2.contains(bzbu2)) {
                aiyt.mo38307a(bzbu2);
            }
        }
        ajgu ajgu = (ajgu) ahgz.m55754a(this.f70304a, ajgu.class);
        for (ahfv ahfv : s.mo67316o()) {
            Set<bzbu> a3 = s.mo67361a(ahfv);
            ajgu.f70594c.mo72984b();
            if (ajgu.m58687b(ahfv)) {
                if (ajgu.f70592a.get(ahfv) == null) {
                    ajgu.mo38619a(ahfv);
                    byzx byzx = (byzx) byzy.f169191d.mo74144da();
                    String a4 = ahfv.mo36407a();
                    if (byzx.f164950c) {
                        byzx.mo74035c();
                        byzx.f164950c = false;
                    }
                    byzy byzy = (byzy) byzx.f164949b;
                    a4.getClass();
                    byzy.f169193a |= 1;
                    byzy.f169194b = a4;
                    for (bzbu bzbu3 : a3) {
                        bxvd da2 = byzz.f169196e.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        byzz byzz = (byzz) da2.f164949b;
                        byzz.f169199b = bzbu3.f169275k;
                        byzz.f169198a |= 1;
                        byzx.mo74515a((byzz) da2.mo74062i());
                    }
                    ajgu.mo38620a(ahfv, (byzy) byzx.mo74062i());
                }
            }
        }
        this.f70309f.mo38316a(this.f70304a, (String) null, 2, set2);
        return j;
    }

    /* renamed from: b */
    public final void mo38287b() {
        mo38439c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0236  */
    /* renamed from: c */
    public final void mo38439c() {
        boolean z;
        boolean z2;
        long min;
        long j;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        C1225nr nrVar = new C1225nr();
        C1225nr nrVar2 = new C1225nr();
        C1225nr nrVar3 = new C1225nr();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = Long.MAX_VALUE;
        for (aiye aiye : this.f70315l.f70061c) {
            long a = aiye.mo38257a();
            if (elapsedRealtime < a) {
                Strategy strategy = aiye.f70055c;
                nrVar.addAll(m58424a(strategy));
                nrVar2.addAll(m58425b(strategy));
                if (strategy.mo44318c() || strategy.mo44319d()) {
                    nrVar3.add(aiye.f70057e);
                }
                j2 = Math.min(a, j2);
            }
        }
        boolean z3 = false;
        for (aiyo aiyo : this.f70314k.mo38298b()) {
            long j3 = aiyo.f70087e;
            if (elapsedRealtime < j3) {
                Strategy strategy2 = aiyo.f70086d;
                if (aiyo.mo38280a()) {
                    z3 |= strategy2.mo44318c();
                    hashSet2.add(Integer.valueOf(strategy2.f80697j));
                    j = elapsedRealtime;
                } else {
                    j = elapsedRealtime;
                    nrVar.addAll(m58424a(strategy2));
                    nrVar2.addAll(m58425b(strategy2));
                    if (strategy2.mo44318c() || strategy2.mo44319d()) {
                        nrVar3.add(this.f70314k.mo38292a(aiyo));
                    }
                }
                hashSet.addAll(aiyo.f70085c.f80686f);
                j2 = Math.min(j3, j2);
            } else {
                j = elapsedRealtime;
            }
            elapsedRealtime = j;
        }
        if (!nrVar3.isEmpty()) {
            ajgk ajgk = new ajgk(this.f70304a);
            Iterator it = nrVar3.iterator();
            while (true) {
                if (it.hasNext()) {
                    ClientAppIdentifier clientAppIdentifier = (ClientAppIdentifier) it.next();
                    if (clientAppIdentifier != null && (clientAppIdentifier.mo44296d() || ajgk.mo38612b(clientAppIdentifier.mo44294c()))) {
                        break;
                    }
                } else {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                        m58426b(nrVar);
                        m58426b(nrVar2);
                    }
                    if (!this.f70317n) {
                        this.f70317n = true;
                        this.f70304a.registerReceiver(this.f70316m, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                    }
                }
            }
        }
        mo38440d();
        if (!nrVar.contains(bzbu.BLE_ADVERTISING_PACKET)) {
            byyl byyl = this.f70313j.f70278f.f168921d;
            if (byyl == null) {
                byyl = byyl.f168949v;
            }
            if (byyl.f168969t) {
                z = true;
                z2 = z3 & z;
                Set singleton = !z2 ? Collections.singleton(bzbu.BLE_ADVERTISING_PACKET) : Collections.emptySet();
                srn srn = ahfq.f67120a;
                ajgs.m58686a(nrVar);
                ajgs.m58686a(singleton);
                ajgs.m58686a(nrVar2);
                mo38438a(nrVar, hashSet);
                min = Math.min(mo38435a(nrVar2), j2);
                if (!z2) {
                    aixs aixs = this.f70306c;
                    aiyw aiyw = this.f70308e;
                    int[] a2 = sqc.m35960a(hashSet2);
                    aixs.f70018e.mo72984b();
                    buye a3 = aixs.mo38225a();
                    if (a3 == null) {
                        bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                        bnsl.mo68432a("aixs", "a", 385, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Unable to start background listening without NearbyDirect");
                    } else {
                        Set a4 = aixs.mo38227a(hashSet);
                        String str = aixs.f70021h;
                        if (str == null) {
                            str = null;
                        }
                        aixs.f70021h = a3.mo73255a(aixs.m58130a(aixs.m58139a(a2)), aixs.mo38226a(bzbu.BLE_ADVERTISING_PACKET, aiyw, new aixj(aixs)), ajgw.m58695a(aixs.f70017d), a4).f155451b;
                        if (str != null) {
                            a3.mo73259a(str);
                        }
                    }
                } else {
                    aixs aixs2 = this.f70306c;
                    aixs2.f70018e.mo72984b();
                    buye a5 = aixs2.mo38225a();
                    if (a5 == null) {
                        bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                        bnsl2.mo68432a("aixs", "b", 438, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Unable to stop background listening without NearbyDirect");
                    } else {
                        String str2 = aixs2.f70021h;
                        if (str2 != null) {
                            a5.mo73259a(str2);
                            aixs2.f70021h = null;
                        }
                        aixs2.f70020g.mo38392b();
                    }
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (min == Long.MAX_VALUE) {
                    long j4 = min + 3000;
                    Long l = this.f70310g;
                    if (l == null || j4 < l.longValue()) {
                        Long valueOf = Long.valueOf(j4);
                        this.f70310g = valueOf;
                        this.f70305b.mo72983a(this.f70311h, valueOf.longValue() - elapsedRealtime2);
                        return;
                    }
                    return;
                }
                this.f70305b.mo72989e(this.f70311h);
                this.f70310g = null;
                return;
            }
        }
        z = false;
        z2 = z3 & z;
        if (!z2) {
        }
        srn srn2 = ahfq.f67120a;
        ajgs.m58686a(nrVar);
        ajgs.m58686a(singleton);
        ajgs.m58686a(nrVar2);
        mo38438a(nrVar, hashSet);
        min = Math.min(mo38435a(nrVar2), j2);
        if (!z2) {
        }
        long elapsedRealtime22 = SystemClock.elapsedRealtime();
        if (min == Long.MAX_VALUE) {
        }
    }

    /* renamed from: a */
    public final void mo38260a() {
        mo38439c();
    }

    /* renamed from: a */
    public final void mo38286a(aiyo aiyo) {
        mo38439c();
    }

    /* renamed from: a */
    public final void mo38436a(bzbu bzbu) {
        aixs aixs = this.f70306c;
        aixs.f70018e.mo72984b();
        ajgr ajgr = (ajgr) aixs.f70016c.get(bzbu.f169275k);
        if (ajgr != null) {
            ajgr.mo38221b();
            aixs.f70016c.remove(bzbu.f169275k);
            srn srn = ahfq.f67120a;
            ajgs.m58686a(aixs.m58133a(aixs.f70016c));
            return;
        }
        srn srn2 = ahfq.f67120a;
    }

    /* renamed from: a */
    public final void mo38437a(bzbu bzbu, byyo byyo, Set set) {
        ajgr ajgr;
        aixs aixs = this.f70306c;
        aiyw aiyw = this.f70308e;
        aixs.f70018e.mo72984b();
        if (((ajgr) aixs.f70016c.get(bzbu.f169275k)) != null) {
            srn srn = ahfq.f67120a;
            return;
        }
        buye a = aixs.mo38225a();
        if (a == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("aixs", "a", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to start listening without live NearbyDirect");
            return;
        }
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = bzbu.ordinal();
        if (ordinal == 1) {
            ajgr = aixs.f70019f.f70128d;
        } else if (ordinal == 2 || ordinal == 3) {
            ajgr = new aixo(aixs, aixs.f70017d, a, bzbu, set);
        } else if (ordinal != 8) {
            String a2 = ajgs.m58685a(bzbu);
            throw new IllegalStateException(a2.length() == 0 ? new String("Unknown Medium requested: ") : "Unknown Medium requested: ".concat(a2));
        } else {
            ajgr = aixs.f70019f.f70126b;
        }
        if (ajgr.mo38220a()) {
            aixs.f70018e.mo72984b();
            if (!ajgr.mo38220a()) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                bnsl2.mo68432a("aixs", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("%s is not supported to scan", ajgs.m58685a(bzbu));
                return;
            }
            aixs.f70016c.put(bzbu.f169275k, ajgr);
            try {
                srn srn2 = ahfq.f67120a;
                ajgs.m58685a(bzbu);
                ajgr.mo38219a(aiyw, byyo);
            } catch (ajgq e) {
                bnsl bnsl3 = (bnsl) ahfq.f67120a.mo68387b();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("aixs", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Fail to start listening: %s", ajgs.m58685a(bzbu));
            }
        } else {
            srn srn3 = ahfq.f67120a;
            ajgs.m58685a(bzbu);
            ajgr.mo38220a();
        }
    }

    /* renamed from: a */
    public final void mo38438a(Set set, Set set2) {
        byyo byyo;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bzbu bzbu = (bzbu) it.next();
            if (bzbu != bzbu.AUDIO_ULTRASOUND_PASSBAND || !this.f70314k.mo38303e()) {
                byyo = this.f70313j.mo38412a(bzbu);
            } else {
                aiyo aiyo = this.f70314k.f70097h;
                byyn byyn = (byyn) byyo.f168979d.mo74144da();
                int i = aiyo.f70085c.f80687g + 1;
                if (byyn.f164950c) {
                    byyn.mo74035c();
                    byyn.f164950c = false;
                }
                byyo byyo2 = (byyo) byyn.f164949b;
                int i2 = byyo2.f168981a | 1;
                byyo2.f168981a = i2;
                byyo2.f168982b = i;
                "".getClass();
                byyo2.f168981a = i2 | 2;
                byyo2.f168983c = "";
                byyo = (byyo) byyn.mo74062i();
            }
            mo38437a(bzbu, byyo, set2);
        }
        bnrd a = aixs.f70014a.iterator();
        while (a.hasNext()) {
            bzbu bzbu2 = (bzbu) a.next();
            if (!set.contains(bzbu2)) {
                mo38436a(bzbu2);
            }
        }
        this.f70309f.mo38316a(this.f70304a, (String) null, 3, set);
    }
}
