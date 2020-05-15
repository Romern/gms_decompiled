package p000;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ajbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajbn {

    /* renamed from: a */
    public static final ajbm f70327a = ajbf.f70319a;

    /* renamed from: b */
    public static final ajbm f70328b = ajbg.f70320a;

    /* renamed from: c */
    public static final ajbm f70329c = ajbh.f70321a;

    /* renamed from: d */
    public final ajbr f70330d;

    /* renamed from: e */
    public final aiyr f70331e;

    /* renamed from: f */
    public final ajai f70332f;

    /* renamed from: g */
    public final ajaj f70333g = new ajaj(this.f70334h, "nearby_messages", "nearby_background_messages.db");

    /* renamed from: h */
    private final Context f70334h;

    /* renamed from: i */
    private final aiyx f70335i;

    /* renamed from: j */
    private final aiya f70336j;

    public ajbn(Context context) {
        this.f70334h = context;
        ajai ajai = (ajai) ahgz.m55754a(context, ajai.class);
        this.f70332f = ajai;
        ajai.mo38387a(new ajbi(this));
        aiyr aiyr = (aiyr) ahgz.m55754a(context, aiyr.class);
        this.f70331e = aiyr;
        aiyr.mo38295a(new ajbj(this));
        this.f70330d = new ajbr(context, new ajbe(this));
        this.f70335i = (aiyx) ahgz.m55754a(context, aiyx.class);
        this.f70336j = (aiya) ahgz.m55754a(this.f70334h, aiya.class);
    }

    /* renamed from: a */
    public static NearbyDevice m58446a(ajag ajag) {
        return new NearbyDevice(ajag.f70231a, ajag.f70232b);
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:5:0x000a */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Integer], assign insn: 0x003f: INVOKE  (r0v11 ? I:java.lang.Integer) = (r0v10 int) type: STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    private static String m58452b(byzr byzr) {
        byzh byzh;
        String str;
        String str2 = "null";
        if (byzr == null) {
            return str2;
        }
        byze byze = byzr.f169154c;
        if (byze == null) {
            byze = byze.f169064e;
        }
        if (byze != null) {
            Object[] objArr = new Object[2];
            if ((byze.f169066a & 1) != 0) {
                byzh = byze.f169067b;
                if (byzh == null) {
                    byzh = byzh.f169078d;
                }
            } else {
                byzh = null;
            }
            if (byzh != null) {
                str = String.format("%s/%s", byzh.f169081b, byzh.f169082c);
            } else {
                str = str2;
            }
            objArr[0] = str;
            if ((2 & byze.f169066a) != 0) {
                str2 = Integer.valueOf(byze.f169068c.mo73744a());
            }
            objArr[1] = str2;
            str2 = String.format("Message{type=%s, payload=<%s bytes>}", objArr);
        }
        String valueOf = String.valueOf(byzr.f169153b);
        String a = aizs.m58302a(byzr.f169155d);
        String valueOf2 = String.valueOf(byzr.f169156e);
        String str3 = byzr.f169157f;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 80 + length2 + length3 + String.valueOf(valueOf2).length() + String.valueOf(str3).length());
        sb.append("SubscribedMessage{publishedMessage=");
        sb.append(str2);
        sb.append(", subscriptionIds=");
        sb.append(valueOf);
        sb.append(", beaconIds=");
        sb.append(a);
        sb.append(", urls=");
        sb.append(valueOf2);
        sb.append(", etag=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnec.a(java.util.Collection, bmxz):java.util.Collection
     arg types: [java.util.List, ajbo]
     candidates:
      bnec.a(java.util.Collection, bmxj):java.util.Collection
      bnec.a(java.util.Collection, java.lang.Object):boolean
      bnec.a(java.util.Collection, java.util.Collection):boolean
      bnec.a(java.util.Collection, bmxz):java.util.Collection */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0209 A[RETURN] */
    /* renamed from: a */
    private final void m58447a(ClientAppIdentifier clientAppIdentifier, bxvf bxvf) {
        Set set;
        this.f70330d.mo38453a(clientAppIdentifier).f70348f = null;
        srn srn = ahfq.f67120a;
        m58452b((byzr) bxvf.mo74062i());
        ajbs a = this.f70330d.mo38453a(clientAppIdentifier);
        if (!cfop.m141879i()) {
            List unmodifiableList = Collections.unmodifiableList(((byzr) bxvf.f164949b).f169153b);
            aiyr aiyr = a.f70344b;
            aiyr.getClass();
            Collection a2 = bnec.m109117a((Collection) unmodifiableList, (bmxz) new ajbo(aiyr));
            a2.size();
            unmodifiableList.size();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            byzr byzr = byzr.f169150h;
            ((byzr) bxvf.f164949b).f169153b = GeneratedMessageLite.m124030de();
            bxvf.mo74129a(a2);
            if (((byzr) bxvf.f164949b).f169153b.size() == 0) {
                set = Collections.emptySet();
                if (!set.isEmpty()) {
                    ajdv ajdv = new ajdv();
                    ajdv.f70402b = mo38443a((byzr) bxvf.mo74062i());
                    ajdv.mo38532c();
                    List b = this.f70332f.mo38391b(Collections.unmodifiableList(((byzr) bxvf.f164949b).f169155d));
                    ajai ajai = this.f70332f;
                    List<String> unmodifiableList2 = Collections.unmodifiableList(((byzr) bxvf.f164949b).f169156e);
                    ajai.f70251l.mo72984b();
                    ArrayList arrayList = new ArrayList();
                    for (String str : unmodifiableList2) {
                        for (ajag ajag : ajai.f70246g.values()) {
                            if (ajag.mo38372c().contains(str)) {
                                arrayList.add(ajag);
                            }
                        }
                    }
                    Collections.sort(arrayList);
                    b.addAll(arrayList);
                    if (!b.isEmpty()) {
                        ajag ajag2 = (ajag) b.get(0);
                        ajdv.mo38527a(m58446a(ajag2));
                        byzu byzu = ((byzr) bxvf.f164949b).f169158g;
                        if (byzu == null) {
                            byzu = byzu.f169175b;
                        }
                        double d = byzu.f169177a;
                        if (d <= 0.0d || (ajag2.mo38370a() && d >= ajag2.f70237g)) {
                            if (ajag2.mo38370a()) {
                                ajdv.mo38529a(new DistanceImpl(ajag2.f70237g));
                            }
                            Iterator it = Collections.unmodifiableList(((byzr) bxvf.f164949b).f169155d).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    BleSignalImpl a3 = ajag2.mo38367a((byys) it.next());
                                    if (a3 != null) {
                                        ajdv.mo38528a(a3);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            Iterator it2 = Collections.unmodifiableList(((byzr) bxvf.f164949b).f169156e).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    BleSignalImpl a4 = ajag2.mo38369a((String) it2.next());
                                    if (a4 != null) {
                                        ajdv.mo38528a(a4);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            ajdv.mo38526a(ajag2.mo38378h());
                        } else {
                            return;
                        }
                    }
                    if (cfop.m141879i()) {
                        m58448a(ajdv.mo38525a(), clientAppIdentifier);
                        return;
                    } else {
                        m58450a(ajdv.mo38525a(), set);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        if (cfop.m141878h() || !a.mo38458a((byzr) bxvf.mo74062i())) {
            C1231nx nxVar = a.f70343a;
            byze byze = ((byzr) bxvf.f164949b).f169154c;
            if (byze == null) {
                byze = byze.f169064e;
            }
            byzr byzr2 = (byzr) nxVar.mo15547a(byze, (byzr) bxvf.mo74062i());
            if (!cfop.m141879i()) {
                HashSet hashSet = new HashSet(Collections.unmodifiableList(((byzr) bxvf.f164949b).f169153b));
                if (byzr2 != null) {
                    bxwc bxwc = byzr2.f169153b;
                    hashSet.removeAll(bxwc);
                    HashSet hashSet2 = new HashSet(hashSet);
                    hashSet2.addAll(bxwc);
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    ((byzr) bxvf.f164949b).f169153b = GeneratedMessageLite.m124030de();
                    bxvf.mo74129a(hashSet2);
                }
                set = hashSet;
            } else {
                set = byzr2 == null ? Collections.singleton("0") : Collections.emptySet();
            }
            if (!set.isEmpty()) {
            }
        } else {
            set = Collections.emptySet();
            if (!set.isEmpty()) {
            }
        }
    }

    /* renamed from: b */
    private final void m58453b(Update update, aiyo aiyo) {
        ClientAppIdentifier a;
        if (cfos.m141988b() && ((bnsl) ahfq.f67120a.mo68390d()).mo68447l()) {
            if (update.mo44364a(1)) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
                bnsl.mo68432a("ajbn", "b", 334, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("%s found %s", "MessageHandler: ", update.mo44363a());
            } else if (update.mo44364a(2)) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68390d();
                bnsl2.mo68432a("ajbn", "b", 336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68424a("%s lost %s", "MessageHandler: ", update.mo44363a());
            }
        }
        if (update.mo44364a(1) && (a = this.f70331e.mo38292a(aiyo)) != null) {
            aixz aixz = new aixz(a, 6);
            aiya aiya = this.f70336j;
            Message message = update.f80795c;
            List singletonList = Collections.singletonList(aiyo.f70083a);
            bxvd da = bywm.f168613n.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywm bywm = (bywm) da.f164949b;
            bywm.f168616b = 5;
            bywm.f168615a |= 1;
            int a2 = aixz.mo38239a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywm bywm2 = (bywm) da.f164949b;
            bywm2.f168615a = 2 | bywm2.f168615a;
            bywm2.f168617c = a2;
            bywc bywc = (bywc) bywd.f168555d.mo74144da();
            bywz a3 = aiya.mo38240a(message);
            if (bywc.f164950c) {
                bywc.mo74035c();
                bywc.f164950c = false;
            }
            bywd bywd = (bywd) bywc.f164949b;
            a3.getClass();
            bywd.f168558b = a3;
            bywd.f168557a |= 1;
            bywc.mo74511a(singletonList);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywm bywm3 = (bywm) da.f164949b;
            bywd bywd2 = (bywd) bywc.mo74062i();
            bywd2.getClass();
            bywm3.f168626l = bywd2;
            bywm3.f168615a |= 1024;
            aiya.mo38243a(aixz, (bywm) da.mo74062i());
        }
    }

    /* renamed from: b */
    public final ajaj mo38452b(ClientAppIdentifier clientAppIdentifier) {
        ajbs a = this.f70330d.mo38453a(clientAppIdentifier);
        if (a.f70347e == null) {
            Context context = a.f70345c;
            String valueOf = String.valueOf(a.f70346d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append(valueOf);
            sb.append("_nearby_background_messages.db");
            a.f70347e = new ajaj(context, "nearby_messages", sb.toString());
        }
        return a.f70347e;
    }

    /* renamed from: a */
    private final void m58448a(Update update, ClientAppIdentifier clientAppIdentifier) {
        for (aiyo aiyo : this.f70331e.mo38293a(clientAppIdentifier)) {
            if (aiyo.f70085c.mo44310a(update.f80795c)) {
                mo38451a(update, aiyo);
            }
        }
    }

    /* renamed from: a */
    private final void m58449a(Update update, Collection collection) {
        Update update2;
        ClientAppIdentifier a;
        String str;
        Update update3 = update;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aiyo aiyo = (aiyo) it.next();
            Message message = update3.f80795c;
            ClientAppIdentifier a2 = this.f70331e.mo38292a(aiyo);
            if (a2 == null || !a2.mo44292a(3)) {
                message = new Message(message.f80676b, message.f80678d, message.f80677c, new NearbyDevice[]{message.mo44304c()}, 0);
            }
            if (!update3.f80795c.equals(message)) {
                ajdv ajdv = new ajdv(update3);
                ajdv.f70402b = message;
                update2 = ajdv.mo38525a();
            } else {
                update2 = update3;
            }
            if (!aiyo.f70084b.mo38276a(this.f70334h, update2)) {
                this.f70331e.mo38300b(aiyo);
            } else {
                ajaj b = cfop.m141879i() ? mo38452b(a2) : this.f70333g;
                if (!cfop.m141879i()) {
                    str = aiyo.f70083a;
                } else {
                    str = "0";
                }
                if (aiyo.mo38280a()) {
                    if (update2.mo44364a(1)) {
                        Message message2 = update2.f80795c;
                        String a3 = ajaj.m58361a(message2);
                        byzr byzr = (byzr) b.mo36459a(a3);
                        if (byzr == null) {
                            bxvf bxvf = (bxvf) byzr.f169150h.mo74144da();
                            byze a4 = ajek.m58598a(message2);
                            if (bxvf.f164950c) {
                                bxvf.mo74035c();
                                bxvf.f164950c = false;
                            }
                            byzr byzr2 = (byzr) bxvf.f164949b;
                            a4.getClass();
                            byzr2.f169154c = a4;
                            byzr2.f169152a |= 1;
                            byzr = (byzr) bxvf.mo74062i();
                        }
                        bxvd bxvd = (bxvd) byzr.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) byzr);
                        bxvf bxvf2 = (bxvf) bxvd;
                        if (!Collections.unmodifiableList(((byzr) bxvf2.f164949b).f169153b).contains(str)) {
                            bxvf2.mo74130a(str);
                        }
                        b.mo36462a(a3, (byzr) bxvf2.mo74062i());
                    } else if (update2.mo44364a(2)) {
                        String a5 = ajaj.m58361a(update2.f80795c);
                        byzr byzr3 = (byzr) b.mo36459a(a5);
                        if (byzr3 != null) {
                            bxvd bxvd2 = (bxvd) byzr3.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) byzr3);
                            bxvf bxvf3 = (bxvf) bxvd2;
                            if (bxvf3.f164950c) {
                                bxvf3.mo74035c();
                                bxvf3.f164950c = false;
                            }
                            ((byzr) bxvf3.f164949b).f169153b = GeneratedMessageLite.m124030de();
                            bxwc bxwc = byzr3.f169153b;
                            int size = bxwc.size();
                            for (int i = 0; i < size; i++) {
                                String str2 = (String) bxwc.get(i);
                                if (!str.equals(str2)) {
                                    bxvf3.mo74130a(str2);
                                }
                            }
                            if (((byzr) bxvf3.f164949b).f169153b.size() != 0) {
                                b.mo36462a(a5, (byzr) bxvf3.mo74062i());
                            } else {
                                b.mo36465b(a5);
                            }
                        }
                    }
                }
            }
            if (cfos.m141988b() && ((bnsl) ahfq.f67120a.mo68390d()).mo68447l()) {
                if (update3.mo44364a(1)) {
                    bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
                    bnsl.mo68432a("ajbn", "b", 334, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68424a("%s found %s", "MessageHandler: ", update.mo44363a());
                } else if (update3.mo44364a(2)) {
                    bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68390d();
                    bnsl2.mo68432a("ajbn", "b", 336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68424a("%s lost %s", "MessageHandler: ", update.mo44363a());
                }
            }
            if (update3.mo44364a(1) && (a = this.f70331e.mo38292a(aiyo)) != null) {
                aixz aixz = new aixz(a, 6);
                aiya aiya = this.f70336j;
                Message message3 = update3.f80795c;
                List singletonList = Collections.singletonList(aiyo.f70083a);
                bxvd da = bywm.f168613n.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bywm bywm = (bywm) da.f164949b;
                bywm.f168616b = 5;
                bywm.f168615a |= 1;
                int a6 = aixz.mo38239a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bywm bywm2 = (bywm) da.f164949b;
                bywm2.f168615a = 2 | bywm2.f168615a;
                bywm2.f168617c = a6;
                bywc bywc = (bywc) bywd.f168555d.mo74144da();
                bywz a7 = aiya.mo38240a(message3);
                if (bywc.f164950c) {
                    bywc.mo74035c();
                    bywc.f164950c = false;
                }
                bywd bywd = (bywd) bywc.f164949b;
                a7.getClass();
                bywd.f168558b = a7;
                bywd.f168557a = 1 | bywd.f168557a;
                bywc.mo74511a(singletonList);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bywm bywm3 = (bywm) da.f164949b;
                bywd bywd2 = (bywd) bywc.mo74062i();
                bywd2.getClass();
                bywm3.f168626l = bywd2;
                bywm3.f168615a |= 1024;
                aiya.mo38243a(aixz, (bywm) da.mo74062i());
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Collection):void
     arg types: [com.google.android.gms.nearby.messages.internal.Update, java.util.HashSet]
     candidates:
      ajbn.a(com.google.android.gms.nearby.messages.ClientAppIdentifier, bxvf):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, com.google.android.gms.nearby.messages.ClientAppIdentifier):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Set):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, aiyo):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Collection):void */
    /* renamed from: a */
    private final void m58450a(Update update, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aiyo a = this.f70331e.mo38291a((String) it.next());
            if (a == null) {
                srn srn = ahfq.f67120a;
            } else {
                hashSet.add(a);
            }
        }
        m58449a(update, (Collection) hashSet);
    }

    /* renamed from: a */
    private final byzr[] m58451a(byzr[] byzrArr) {
        String str;
        byzr[] byzrArr2 = byzrArr;
        ArrayList arrayList = new ArrayList();
        for (byzr byzr : byzrArr2) {
            byze byze = byzr.f169154c;
            if (byze == null) {
                byze = byze.f169064e;
            }
            byzh byzh = byze.f169067b;
            if (byzh == null) {
                byzh = byzh.f169078d;
            }
            if ("com.google.nearby.discoverer".equals(byzh.f169081b)) {
                try {
                    byze byze2 = byzr.f169154c;
                    if (byze2 == null) {
                        byze2 = byze.f169064e;
                    }
                    byzi byzi = (byzi) GeneratedMessageLite.m124007a(byzi.f169083x, byze2.f169068c);
                    int i = 5;
                    bxvd bxvd = (bxvd) byzi.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) byzi);
                    bzbk a = bzbk.m125615a(((byzi) ((bxvf) bxvd).f164949b).f169086b);
                    if (a == null) {
                        a = bzbk.NEARBY_TYPE_UNKNOWN;
                    }
                    if (a == bzbk.NEARBY_DEVICE) {
                        try {
                            Set<ajag> a2 = this.f70332f.mo38386a((byys[]) byzr.f169155d.toArray(new byys[0]));
                            if (a2.size() > 1) {
                                int i2 = 1;
                                for (ajag ajag : a2) {
                                    bxvf bxvf = (bxvf) byzi.f169083x.mo74144da();
                                    byze byze3 = byzr.f169154c;
                                    if (byze3 == null) {
                                        byze3 = byze.f169064e;
                                    }
                                    bxvf.mo73635b(byze3.f169068c.getKey(), bxus.m123744c());
                                    byzr byzr2 = (byzr) GeneratedMessageLite.m124014a(byzr.f169150h, byzr.serializeToBytes());
                                    bxvd bxvd2 = (bxvd) byzr2.mo74142c(i);
                                    bxvd2.mo73625a((GeneratedMessageLite) byzr2);
                                    bxvf bxvf2 = (bxvf) bxvd2;
                                    String str2 = ((byzi) bxvf.f164949b).f169087c;
                                    String str3 = ajag.f70232b;
                                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                                    sb.append(str2);
                                    sb.append("_");
                                    sb.append(str3);
                                    String sb2 = sb.toString();
                                    if (bxvf.f164950c) {
                                        bxvf.mo74035c();
                                        bxvf.f164950c = false;
                                    }
                                    byzi byzi2 = (byzi) bxvf.f164949b;
                                    sb2.getClass();
                                    byzi2.f169085a |= 2;
                                    byzi2.f169087c = sb2;
                                    if (cfoj.m141564n()) {
                                        str = ((byzi) bxvf.f164949b).f169088d;
                                    } else {
                                        String str4 = ((byzi) bxvf.f164949b).f169088d;
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 14);
                                        sb3.append("(");
                                        sb3.append(i2);
                                        sb3.append(") ");
                                        sb3.append(str4);
                                        str = sb3.toString();
                                    }
                                    if (bxvf.f164950c) {
                                        bxvf.mo74035c();
                                        bxvf.f164950c = false;
                                    }
                                    byzi byzi3 = (byzi) bxvf.f164949b;
                                    str.getClass();
                                    byzi3.f169085a |= 4;
                                    byzi3.f169088d = str;
                                    if (bxvf2.f164950c) {
                                        bxvf2.mo74035c();
                                        bxvf2.f164950c = false;
                                    }
                                    ((byzr) bxvf2.f164949b).f169155d = GeneratedMessageLite.m124030de();
                                    bxvf2.mo74127a(ajag.mo38379i());
                                    byze byze4 = ((byzr) bxvf2.f164949b).f169154c;
                                    if (byze4 == null) {
                                        byze4 = byze.f169064e;
                                    }
                                    bxvd bxvd3 = (bxvd) byze4.mo74142c(5);
                                    bxvd3.mo73625a((GeneratedMessageLite) byze4);
                                    ByteString aL = ((byzi) bxvf.mo74062i()).mo73639aL();
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    byze byze5 = (byze) bxvd3.f164949b;
                                    aL.getClass();
                                    byze5.f169066a |= 2;
                                    byze5.f169068c = aL;
                                    if (bxvf2.f164950c) {
                                        bxvf2.mo74035c();
                                        bxvf2.f164950c = false;
                                    }
                                    byzr byzr3 = (byzr) bxvf2.f164949b;
                                    byze byze6 = (byze) bxvd3.mo74062i();
                                    byze6.getClass();
                                    byzr3.f169154c = byze6;
                                    byzr3.f169152a |= 1;
                                    arrayList.add((byzr) bxvf2.mo74062i());
                                    i2++;
                                    i = 5;
                                }
                            }
                        } catch (bxwf e) {
                            e = e;
                            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                            bnsl.mo68437a(e);
                            bnsl.mo68432a("ajbn", "a", 726, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("Parsing proto message from bytes failed, skipping.");
                        }
                    }
                } catch (bxwf e2) {
                    e = e2;
                    bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("ajbn", "a", 726, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Parsing proto message from bytes failed, skipping.");
                }
            }
            arrayList.add(byzr);
        }
        return (byzr[]) arrayList.toArray(new byzr[0]);
    }

    /* renamed from: a */
    public final Message mo38443a(byzr byzr) {
        byze byze = byzr.f169154c;
        if (byze == null) {
            byze = byze.f169064e;
        }
        List b = this.f70332f.mo38391b(byzr.f169155d);
        NearbyDevice[] nearbyDeviceArr = new NearbyDevice[b.size()];
        for (int i = 0; i < b.size(); i++) {
            nearbyDeviceArr[i] = m58446a((ajag) b.get(i));
        }
        return ajek.m58602a(byze, nearbyDeviceArr);
    }

    /* renamed from: a */
    public final String mo38444a(ClientAppIdentifier clientAppIdentifier) {
        return this.f70330d.mo38453a(clientAppIdentifier).f70348f;
    }

    /* renamed from: a */
    public final void mo38445a(int i, ajag ajag, Map map, Map map2, ajbm ajbm) {
        Message a;
        for (Object obj : map.keySet()) {
            ajdv ajdv = new ajdv();
            if (ajai.m58348a(i, 4)) {
                ajdv.mo38529a(new DistanceImpl(ajag.f70237g));
            }
            if (ajai.m58348a(i, 16)) {
                BleSignalImpl bleSignalImpl = (BleSignalImpl) map2.get(obj);
                if (!sdg.m34949a((BleSignalImpl) map.get(obj), bleSignalImpl)) {
                    ajdv.mo38528a(bleSignalImpl);
                }
            }
            if (!ajdv.mo38531b() && (a = ajbm.mo38441a(obj, m58446a(ajag))) != null) {
                ajdv.f70402b = a;
                mo38451a(ajdv.mo38525a(), (aiyo) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo38446a(ajag ajag, Map map, Map map2, ajbm ajbm) {
        for (Object obj : map2.keySet()) {
            if (!map.containsKey(obj)) {
                NearbyDevice a = m58446a(ajag);
                ajdv ajdv = new ajdv();
                ajdv.mo38532c();
                ajdv.mo38527a(a);
                if (ajag.mo38370a()) {
                    ajdv.mo38529a(new DistanceImpl(ajag.f70237g));
                }
                if (map2.get(obj) != null) {
                    ajdv.mo38528a((BleSignalImpl) map2.get(obj));
                }
                Message a2 = ajbm.mo38441a(obj, a);
                if (a2 != null) {
                    ajdv.f70402b = a2;
                    mo38451a(ajdv.mo38525a(), (aiyo) null);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Set):void
     arg types: [com.google.android.gms.nearby.messages.internal.Update, bnic]
     candidates:
      ajbn.a(com.google.android.gms.nearby.messages.ClientAppIdentifier, bxvf):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, com.google.android.gms.nearby.messages.ClientAppIdentifier):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Collection):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, aiyo):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Set):void */
    /* renamed from: a */
    public final void mo38447a(ajdv ajdv, byzr byzr, ClientAppIdentifier clientAppIdentifier) {
        ajdv.f70402b = mo38443a(byzr);
        Update a = ajdv.mo38525a();
        if (!cfop.m141879i()) {
            m58450a(a, (Set) bnic.m109495a((Collection) byzr.f169153b));
        } else {
            m58448a(a, clientAppIdentifier);
        }
    }

    /* renamed from: a */
    public final void mo38448a(ajdv ajdv, NearbyDevice nearbyDevice, Set set, Set set2, Set set3, aiyo aiyo) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Message a = f70327a.mo38441a((byys) it.next(), nearbyDevice);
            if (a != null) {
                ajdv.f70402b = a;
                mo38451a(ajdv.mo38525a(), aiyo);
            }
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            ajdv.f70402b = f70328b.mo38441a((String) it2.next(), nearbyDevice);
            mo38451a(ajdv.mo38525a(), aiyo);
        }
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            ajdv.f70402b = f70329c.mo38441a((aizv) it3.next(), nearbyDevice);
            mo38451a(ajdv.mo38525a(), aiyo);
        }
    }

    /* renamed from: a */
    public final void mo38449a(bxvf bxvf) {
        HashSet<ClientAppIdentifier> hashSet = new HashSet();
        for (String str : Collections.unmodifiableList(((byzr) bxvf.f164949b).f169153b)) {
            aiyr aiyr = this.f70331e;
            ClientAppIdentifier a = aiyr.mo38292a(aiyr.mo38291a(str));
            if (a != null) {
                hashSet.add(a);
            }
        }
        for (ClientAppIdentifier clientAppIdentifier : hashSet) {
            m58447a(clientAppIdentifier, bxvf);
        }
    }

    /* renamed from: a */
    public final void mo38450a(ClientAppIdentifier clientAppIdentifier, byzr[] byzrArr, String str) {
        byzr[] byzrArr2;
        int i;
        String str2;
        ClientAppIdentifier clientAppIdentifier2 = clientAppIdentifier;
        byzr[] byzrArr3 = byzrArr;
        srn srn = ahfq.f67120a;
        int i2 = 0;
        if (byzrArr3 != null) {
            int length = byzrArr3.length;
            ArrayList arrayList = new ArrayList(length);
            for (byzr byzr : byzrArr3) {
                arrayList.add(m58452b(byzr));
            }
            arrayList.toString();
        }
        if (byzrArr3 != null) {
            byzrArr2 = byzrArr3;
        } else {
            byzrArr2 = new byzr[0];
        }
        int i3 = 5;
        if (ahfo.m55646a(this.f70334h)) {
            ArrayList arrayList2 = new ArrayList();
            int length2 = byzrArr2.length;
            int i4 = 0;
            while (i4 < length2) {
                byzr byzr2 = byzrArr2[i4];
                byze byze = byzr2.f169154c;
                if (byze == null) {
                    byze = byze.f169064e;
                }
                byzh byzh = byze.f169067b;
                if (byzh == null) {
                    byzh = byzh.f169078d;
                }
                if ("com.google.nearby.discoverer".equals(byzh.f169081b)) {
                    byze byze2 = byzr2.f169154c;
                    if (byze2 == null) {
                        byze2 = byze.f169064e;
                    }
                    byzi byzi = (byzi) GeneratedMessageLite.m124007a(byzi.f169083x, byze2.f169068c);
                    bxvd bxvd = (bxvd) byzi.mo74142c(i3);
                    bxvd.mo73625a((GeneratedMessageLite) byzi);
                    bzbk a = bzbk.m125615a(((byzi) ((bxvf) bxvd).f164949b).f169086b);
                    if (a == null) {
                        a = bzbk.NEARBY_TYPE_UNKNOWN;
                    }
                    if (a == bzbk.NEARBY_DEVICE) {
                        Set<ajag> a2 = this.f70332f.mo38386a((byys[]) byzr2.f169155d.toArray(new byys[i2]));
                        if (a2.size() > 1) {
                            int i5 = 1;
                            for (ajag ajag : a2) {
                                bxvf bxvf = (bxvf) byzi.f169083x.mo74144da();
                                byze byze3 = byzr2.f169154c;
                                if (byze3 == null) {
                                    byze3 = byze.f169064e;
                                }
                                bxvf.mo73635b(byze3.f169068c.getKey(), bxus.m123744c());
                                byzr byzr3 = (byzr) GeneratedMessageLite.m124014a(byzr.f169150h, byzr2.serializeToBytes());
                                bxvd bxvd2 = (bxvd) byzr3.mo74142c(i3);
                                bxvd2.mo73625a((GeneratedMessageLite) byzr3);
                                bxvf bxvf2 = (bxvf) bxvd2;
                                String str3 = ((byzi) bxvf.f164949b).f169087c;
                                String str4 = ajag.f70232b;
                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
                                sb.append(str3);
                                sb.append("_");
                                sb.append(str4);
                                String sb2 = sb.toString();
                                if (bxvf.f164950c) {
                                    bxvf.mo74035c();
                                    try {
                                        bxvf.f164950c = false;
                                    } catch (bxwf e) {
                                        e = e;
                                        bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                                        bnsl.mo68437a(e);
                                        bnsl.mo68432a("ajbn", "a", 726, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl.mo68405a("Parsing proto message from bytes failed, skipping.");
                                        i4++;
                                        i2 = 0;
                                        i3 = 5;
                                    }
                                }
                                try {
                                    byzi byzi2 = (byzi) bxvf.f164949b;
                                    sb2.getClass();
                                    byzi2.f169085a |= 2;
                                    byzi2.f169087c = sb2;
                                    if (cfoj.m141564n()) {
                                        str2 = ((byzi) bxvf.f164949b).f169088d;
                                    } else {
                                        String str5 = ((byzi) bxvf.f164949b).f169088d;
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 14);
                                        sb3.append("(");
                                        sb3.append(i5);
                                        sb3.append(") ");
                                        sb3.append(str5);
                                        str2 = sb3.toString();
                                    }
                                    if (bxvf.f164950c) {
                                        bxvf.mo74035c();
                                        bxvf.f164950c = false;
                                    }
                                    byzi byzi3 = (byzi) bxvf.f164949b;
                                    str2.getClass();
                                    byzi3.f169085a |= 4;
                                    byzi3.f169088d = str2;
                                    if (bxvf2.f164950c) {
                                        bxvf2.mo74035c();
                                        bxvf2.f164950c = false;
                                    }
                                    ((byzr) bxvf2.f164949b).f169155d = GeneratedMessageLite.m124030de();
                                    bxvf2.mo74127a(ajag.mo38379i());
                                    byze byze4 = ((byzr) bxvf2.f164949b).f169154c;
                                    if (byze4 == null) {
                                        byze4 = byze.f169064e;
                                    }
                                    bxvd bxvd3 = (bxvd) byze4.mo74142c(5);
                                    bxvd3.mo73625a((GeneratedMessageLite) byze4);
                                    ByteString aL = ((byzi) bxvf.mo74062i()).mo73639aL();
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    byze byze5 = (byze) bxvd3.f164949b;
                                    aL.getClass();
                                    byze5.f169066a |= 2;
                                    byze5.f169068c = aL;
                                    if (bxvf2.f164950c) {
                                        bxvf2.mo74035c();
                                        bxvf2.f164950c = false;
                                    }
                                    byzr byzr4 = (byzr) bxvf2.f164949b;
                                    byze byze6 = (byze) bxvd3.mo74062i();
                                    byze6.getClass();
                                    byzr4.f169154c = byze6;
                                    byzr4.f169152a |= 1;
                                    arrayList2.add((byzr) bxvf2.mo74062i());
                                    i5++;
                                    i3 = 5;
                                } catch (bxwf e2) {
                                    e = e2;
                                    bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                                    bnsl2.mo68437a(e);
                                    bnsl2.mo68432a("ajbn", "a", 726, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl2.mo68405a("Parsing proto message from bytes failed, skipping.");
                                    i4++;
                                    i2 = 0;
                                    i3 = 5;
                                }
                            }
                            i4++;
                            i2 = 0;
                            i3 = 5;
                        }
                    }
                }
                arrayList2.add(byzr2);
                i4++;
                i2 = 0;
                i3 = 5;
            }
            byzrArr2 = (byzr[]) arrayList2.toArray(new byzr[i2]);
            i = 0;
        } else {
            i = 0;
        }
        Arrays.sort(byzrArr2, new ajbl(this));
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (byzr byzr5 : byzrArr2) {
            hashSet2.addAll(byzr5.f169153b);
        }
        this.f70335i.mo38320a((String) null, 9, hashSet2, hashSet);
        ajbs a3 = this.f70330d.mo38453a(clientAppIdentifier2);
        Map b = a3.mo38459b();
        int length3 = byzrArr2.length;
        while (i < length3) {
            byzr byzr6 = byzrArr2[i];
            bxvd bxvd4 = (bxvd) byzr6.mo74142c(5);
            bxvd4.mo73625a((GeneratedMessageLite) byzr6);
            m58447a(clientAppIdentifier2, (bxvf) bxvd4);
            byze byze7 = byzr6.f169154c;
            if (byze7 == null) {
                byze7 = byze.f169064e;
            }
            b.remove(byze7);
            i++;
        }
        for (byze byze8 : b.keySet()) {
            byzh byzh2 = byze8.f169067b;
            if (byzh2 == null) {
                byzh2 = byzh.f169078d;
            }
            if (!"__audio_bytes".equals(byzh2.f169082c)) {
                a3.f70343a.mo15552b(byze8);
            }
        }
        this.f70330d.mo38453a(clientAppIdentifier2).f70348f = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Collection):void
     arg types: [com.google.android.gms.nearby.messages.internal.Update, nr]
     candidates:
      ajbn.a(com.google.android.gms.nearby.messages.ClientAppIdentifier, bxvf):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, com.google.android.gms.nearby.messages.ClientAppIdentifier):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Set):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, aiyo):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Collection):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Collection):void
     arg types: [com.google.android.gms.nearby.messages.internal.Update, java.util.Set]
     candidates:
      ajbn.a(com.google.android.gms.nearby.messages.ClientAppIdentifier, bxvf):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, com.google.android.gms.nearby.messages.ClientAppIdentifier):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Set):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, aiyo):void
      ajbn.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Collection):void */
    /* renamed from: a */
    public final void mo38451a(Update update, aiyo aiyo) {
        if (aiyo == null) {
            aiyr aiyr = this.f70331e;
            Message message = update.f80795c;
            aiyr.f70096g.mo72984b();
            C1225nr nrVar = new C1225nr();
            for (aiyo aiyo2 : aiyr.f70094e.values()) {
                if (aiyo2.f70085c.mo44310a(message)) {
                    nrVar.add(aiyo2);
                }
            }
            m58449a(update, (Collection) nrVar);
        } else if (aiyo.f70085c.mo44310a(update.f80795c)) {
            m58449a(update, (Collection) Collections.singleton(aiyo));
        }
    }
}
