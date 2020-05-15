package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: xku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xku extends xkh {

    /* renamed from: a */
    static final bypx f52608a = bypx.m125083a(1);

    /* renamed from: b */
    static final bypx f52609b = bypx.m125083a(2);

    /* renamed from: c */
    static final bypx f52610c = bypx.m125083a(3);

    /* renamed from: d */
    static final bypx f52611d = bypx.m125083a(4);

    /* renamed from: e */
    static final bypx f52612e = bypx.m125083a(5);

    /* renamed from: f */
    static final bypx f52613f = bypx.m125083a(6);

    /* renamed from: i */
    private static final bnic f52614i = bniq.m109552a((Comparable) f52608a, (Comparable) f52610c);

    /* renamed from: j */
    private static final bnic f52615j;

    /* renamed from: k */
    private static final bnic f52616k = bnic.m109493a(xqv.f52942g, xqv.f52943h, xqv.f52944i, xqv.f52945j, xqv.f52946k);

    /* renamed from: t */
    private static final Logger f52617t = new Logger(new String[]{"AuthenticatorGetInfoResponseData"}, (short[]) null);

    /* renamed from: g */
    public final boolean f52618g;

    /* renamed from: h */
    public final boolean f52619h;

    /* renamed from: l */
    private final List f52620l;

    /* renamed from: m */
    private final List f52621m;

    /* renamed from: n */
    private final byte[] f52622n;

    /* renamed from: o */
    private final boolean f52623o;

    /* renamed from: p */
    private final boolean f52624p;

    /* renamed from: q */
    private final Boolean f52625q;

    /* renamed from: r */
    private final Long f52626r;

    /* renamed from: s */
    private final List f52627s;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bniq.a(java.lang.Comparable, java.lang.Comparable):bniq
     arg types: [bypx, bypx]
     candidates:
      bniq.a(java.lang.Object, boolean):bniq
      bnic.a(int, java.lang.Object[]):bnic
      bnic.a(java.lang.Object, java.lang.Object):bnic
      bnic.a(int, int):boolean
      bngm.a(java.lang.Object[], int):int
      bniq.a(java.lang.Comparable, java.lang.Comparable):bniq */
    static {
        Comparable[] comparableArr = {f52608a, f52610c, f52609b, f52612e, f52613f, f52611d};
        System.arraycopy(new bypx[0], 0, comparableArr, 6, 0);
        f52615j = bniq.m109553a(bnnt.f131877a, 6, comparableArr);
    }

    public xku(List list, List list2, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, Long l, List list3) {
        this.f52620l = list;
        this.f52621m = list2;
        this.f52622n = bArr;
        this.f52623o = z;
        this.f52624p = z2;
        this.f52618g = z3;
        this.f52619h = z4;
        this.f52625q = bool;
        this.f52626r = l;
        this.f52627s = list3;
    }

    /* renamed from: a */
    private static bypn m43115a(List list) {
        sdo.m34959a(list);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(bypx.m125085a((String) list.get(i)));
        }
        return bypx.m125079a(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xku) {
            xku xku = (xku) obj;
            if (!this.f52620l.equals(xku.f52620l) || !bmxi.m108538a(this.f52621m, xku.f52621m) || !Arrays.equals(this.f52622n, xku.f52622n) || this.f52623o != xku.f52623o || !bmxi.m108538a(this.f52625q, xku.f52625q) || this.f52624p != xku.f52624p || this.f52618g != xku.f52618g || this.f52619h != xku.f52619h || !bmxi.m108538a(this.f52626r, xku.f52626r) || !bmxi.m108538a(this.f52627s, xku.f52627s)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52620l, this.f52621m, Integer.valueOf(Arrays.hashCode(this.f52622n)), Boolean.valueOf(this.f52623o), this.f52625q, Boolean.valueOf(this.f52624p), Boolean.valueOf(this.f52618g), Boolean.valueOf(this.f52619h), this.f52626r, this.f52627s});
    }

    /* renamed from: a */
    private static List m43116a(bypx bypx, String str, bnic bnic) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(bypx);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82 + str.length());
        sb.append("Response map for AuthenticatorGetInfo contains a non-array CBOR value: ");
        sb.append(valueOf);
        sb.append(" for ");
        sb.append(str);
        sb.append(" label");
        bnre i = xkc.m43087e(bypx, sb.toString()).listIterator();
        while (i.hasNext()) {
            bypx bypx2 = (bypx) i.next();
            String valueOf2 = String.valueOf(bypx2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 91 + str.length());
            sb2.append("Response map for AuthenticatorGetInfo contains a non-textstring CBOR element: ");
            sb2.append(valueOf2);
            sb2.append(" in array of ");
            sb2.append(str);
            String c = xkc.m43085c(bypx2, sb2.toString());
            if (bnic.contains(c)) {
                arrayList.add(c);
            } else {
                String valueOf3 = String.valueOf(bypx2);
                StringBuilder sb3 = new StringBuilder(str.length() + 67 + String.valueOf(valueOf3).length());
                sb3.append("Response map for AuthenticatorGetInfo contains an invalid ");
                sb3.append(str);
                sb3.append(" string: ");
                sb3.append(valueOf3);
                throw new xkk(sb3.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static xku m43117a(bypx bypx) {
        bnim a = xkc.m43083a(bypx, "Response data for AuthenticatorGetInfo not encoded in CBOR map");
        if (a.f131670c.containsAll(f52614i)) {
            bnrd a2 = bnpf.m110057c(a.f131670c, f52615j).iterator();
            while (a2.hasNext()) {
                f52617t.mo25414c("Unrecognized key present in response map: %s", (bypx) a2.next());
            }
            xkt xkt = new xkt();
            xkt.mo29879b(m43116a((bypx) a.get(f52608a), "versions", xkt.f52597b));
            bypx bypx2 = (bypx) a.get(f52610c);
            String obj = bypx2.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 93);
            sb.append("Response map for AuthenticatorGetInfo contains a non-bytestring CBOR value: ");
            sb.append(obj);
            sb.append(" for aaguid label");
            byte[] b = xkc.m43084b(bypx2, sb.toString());
            int length = b.length;
            if (length == 16) {
                xkt.mo29878a(b);
                if (a.containsKey(f52609b)) {
                    xkt.mo29877a(m43116a((bypx) a.get(f52609b), "extensions", xkt.f52596a));
                }
                if (a.containsKey(f52612e)) {
                    bypx bypx3 = (bypx) a.get(f52612e);
                    String obj2 = bypx3.toString();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(obj2).length() + 89);
                    sb2.append("Response map for AuthenticatorGetInfo contains a non-integer value: ");
                    sb2.append(obj2);
                    sb2.append(" for maxMsgSize label");
                    long d = xkc.m43086d(bypx3, sb2.toString());
                    if (d > 0) {
                        sdo.m34974b(d > 0);
                        xkt.f52603h = Long.valueOf(d);
                    } else {
                        StringBuilder sb3 = new StringBuilder(118);
                        sb3.append("Response map for AuthenticatorGetInfo contains a non-positive integer value: ");
                        sb3.append(d);
                        sb3.append(" for maxMsgSize label");
                        throw new xkk(sb3.toString());
                    }
                }
                if (a.containsKey(f52613f)) {
                    bypx bypx4 = (bypx) a.get(f52613f);
                    ArrayList arrayList = new ArrayList();
                    String obj3 = bypx4.toString();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(obj3).length() + 94);
                    sb4.append("Response map for AuthenticatorGetInfo contains a non-array CBOR value: ");
                    sb4.append(obj3);
                    sb4.append(" for pinProtocols label");
                    bnre i = xkc.m43087e(bypx4, sb4.toString()).listIterator();
                    while (i.hasNext()) {
                        bypx bypx5 = (bypx) i.next();
                        String obj4 = bypx5.toString();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(obj4).length() + 100);
                        sb5.append("Response map for AuthenticatorGetInfo contains a non-integer CBOR element: ");
                        sb5.append(obj4);
                        sb5.append(" in array of pinProtocols");
                        int d2 = (int) xkc.m43086d(bypx5, sb5.toString());
                        if (d2 == 1) {
                            arrayList.add(1);
                        } else {
                            StringBuilder sb6 = new StringBuilder(83);
                            sb6.append("Response map for AuthenticatorGetInfo contains an invalid pin protocol: ");
                            sb6.append(d2);
                            throw new xkk(sb6.toString());
                        }
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        sdo.m34974b(((Integer) arrayList.get(i2)).intValue() == 1);
                    }
                    xkt.f52604i = arrayList;
                }
                if (a.containsKey(f52611d)) {
                    bypx bypx6 = (bypx) a.get(f52611d);
                    String obj5 = bypx6.toString();
                    StringBuilder sb7 = new StringBuilder(String.valueOf(obj5).length() + 87);
                    sb7.append("Response map for AuthenticatorGetInfo contains a non-map CBOR value: ");
                    sb7.append(obj5);
                    sb7.append(" for options label");
                    bnim a3 = xkc.m43083a(bypx6, sb7.toString());
                    HashMap hashMap = new HashMap();
                    bnrd a4 = a3.entrySet().iterator();
                    while (a4.hasNext()) {
                        Map.Entry entry = (Map.Entry) a4.next();
                        bypx bypx7 = (bypx) entry.getKey();
                        bypx bypx8 = (bypx) entry.getValue();
                        if (!f52616k.contains(bypx7)) {
                            f52617t.mo25414c("Unrecognized key present in map of options: %s", bypx7);
                        } else {
                            String obj6 = bypx8.toString();
                            String obj7 = bypx7.toString();
                            StringBuilder sb8 = new StringBuilder(String.valueOf(obj6).length() + 110 + String.valueOf(obj7).length());
                            sb8.append("Response map for AuthenticatorGetInfo contains a non-boolean value: ");
                            sb8.append(obj6);
                            sb8.append(" for recognized option: ");
                            sb8.append(obj7);
                            sb8.append(" in map of options");
                            String sb9 = sb8.toString();
                            sdo.m34959a(bypx8);
                            try {
                                hashMap.put(bypx7, Boolean.valueOf(((bypo) bypx8.mo74443a(bypo.class)).f167356a));
                            } catch (bypw e) {
                                throw new xkk(sb9, e);
                            }
                        }
                    }
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        bypx bypx9 = (bypx) entry2.getKey();
                        if (bypx9.equals(xqv.f52942g)) {
                            xkt.f52598c = ((Boolean) entry2.getValue()).booleanValue();
                        } else if (bypx9.equals(xqv.f52943h)) {
                            xkt.f52599d = ((Boolean) entry2.getValue()).booleanValue();
                        } else if (bypx9.equals(xqv.f52944i)) {
                            xkt.f52602g = (Boolean) entry2.getValue();
                        } else if (bypx9.equals(xqv.f52945j)) {
                            xkt.f52600e = ((Boolean) entry2.getValue()).booleanValue();
                        } else if (bypx9.equals(xqv.f52946k)) {
                            xkt.f52601f = ((Boolean) entry2.getValue()).booleanValue();
                        } else {
                            String valueOf = String.valueOf(entry2.getKey());
                            StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf).length() + 45);
                            sb10.append("Requested processing of unrecognized option: ");
                            sb10.append(valueOf);
                            throw new IllegalArgumentException(sb10.toString());
                        }
                    }
                }
                return xkt.mo29876a();
            }
            StringBuilder sb11 = new StringBuilder(96);
            sb11.append("Response map for AuthenticatorGetInfo contains a bytestring of size ");
            sb11.append(length);
            sb11.append(" for aaguid label");
            throw new xkk(sb11.toString());
        }
        throw new xkk("Response map for AuthenticatorGetInfo is missing one or more of the  versions and AAGUID required fields");
    }

    /* renamed from: a */
    public final bypu mo29865a() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(new bypt(f52608a, m43115a(this.f52620l)));
            arrayList.add(new bypt(f52610c, bypx.m125082a(this.f52622n)));
            bypx bypx = f52611d;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new bypt(xqv.f52946k, bypx.m125081a(this.f52619h)));
            arrayList2.add(new bypt(xqv.f52945j, bypx.m125081a(this.f52618g)));
            arrayList2.add(new bypt(xqv.f52943h, bypx.m125081a(this.f52624p)));
            arrayList2.add(new bypt(xqv.f52942g, bypx.m125081a(this.f52623o)));
            if (this.f52625q != null) {
                arrayList2.add(new bypt(xqv.f52944i, bypx.m125081a(this.f52625q.booleanValue())));
            }
            arrayList.add(new bypt(bypx, bypx.m125086b(arrayList2)));
            if (this.f52621m != null) {
                arrayList.add(new bypt(f52609b, m43115a(this.f52621m)));
            }
            if (this.f52626r != null) {
                arrayList.add(new bypt(f52612e, bypx.m125083a(this.f52626r.longValue())));
            }
            if (this.f52627s != null) {
                bypx bypx2 = f52613f;
                List<Integer> list = this.f52627s;
                sdo.m34959a(list);
                ArrayList arrayList3 = new ArrayList();
                for (Integer num : list) {
                    arrayList3.add(bypx.m125083a((long) num.intValue()));
                }
                arrayList.add(new bypt(bypx2, bypx.m125079a(arrayList3)));
            }
            return bypx.m125086b(arrayList);
        } catch (bypm e) {
            throw new RuntimeException(e);
        }
    }
}
