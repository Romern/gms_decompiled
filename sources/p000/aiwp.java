package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.LinkedList;
import java.util.List;

/* renamed from: aiwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwp implements ajaa {

    /* renamed from: a */
    public final Context f69948a;

    /* renamed from: b */
    public final buqh f69949b;

    /* renamed from: c */
    public final ajac f69950c;

    /* renamed from: d */
    public final aiyr f69951d;

    /* renamed from: e */
    public final ajej f69952e;

    /* renamed from: f */
    public boolean f69953f;

    /* renamed from: g */
    private final aiyh f69954g;

    /* renamed from: h */
    private final aiyx f69955h;

    /* renamed from: i */
    private final ajat f69956i;

    public aiwp(Context context) {
        ajac ajac = new ajac();
        this.f69948a = context;
        this.f69949b = (buqh) ahgz.m55754a(context, buqh.class);
        this.f69950c = ajac;
        this.f69951d = (aiyr) ahgz.m55754a(context, aiyr.class);
        this.f69954g = (aiyh) ahgz.m55754a(context, aiyh.class);
        this.f69952e = (ajej) ahgz.m55754a(context, ajej.class);
        this.f69955h = (aiyx) ahgz.m55754a(context, aiyx.class);
        this.f69956i = (ajat) ahgz.m55754a(context, ajat.class);
        srn srn = ahfq.f67120a;
    }

    /* renamed from: a */
    private static int m58083a(Context context, ajdm ajdm) {
        int i = ajdm.f70390a;
        if (i == 1) {
            return ajdm.f70391b.f70054b.mo44303b() ? 4 : 0;
        }
        if (i == 2) {
            String str = ajdm.f70392c.f70397a;
            aiye aiye = ((aiyh) ahgz.m55754a(context, aiyh.class)).f70064f;
            return (aiye == null || !aiye.f70053a.equals(str)) ? 0 : 4;
        } else if (i != 3) {
            if (i == 4) {
                return 4;
            }
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("aiwp", "a", 321, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Unknown operation type: %d", ajdm.f70390a);
            return 4;
        } else if (ajdm.f70393d.f70085c.mo44311b()) {
            return 5;
        } else {
            return 4;
        }
    }

    /* renamed from: a */
    private static final IBinder m58084a(ajcd ajcd) {
        if (ajcd != null) {
            return ajcd.asBinder();
        }
        return null;
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
    public final void mo38169a(ajdm ajdm, IBinder iBinder, ClientAppIdentifier clientAppIdentifier) {
        Object obj;
        int i;
        List<ajdm> list;
        int i2;
        ajdt ajdt;
        srn srn = ahfq.f67120a;
        byyl byyl = this.f69956i.f70278f.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        if (byyl.f168952b) {
            this.f69949b.mo72984b();
            int i3 = ajdm.f70390a;
            if (i3 == 1) {
                obj = ajdm.f70391b.f70053a;
            } else if (i3 == 2) {
                obj = ajdm.f70392c.f70397a;
            } else if (i3 == 3) {
                obj = m58084a(ajdm.f70393d.f70084b.f70080a);
            } else if (i3 != 4) {
                obj = null;
            } else {
                obj = m58084a(ajdm.f70394e.f70399a);
            }
            if (obj != null) {
                int i4 = ajdm.f70390a;
                if (i4 == 1 || i4 == 3) {
                    ajac ajac = this.f69950c;
                    String str = clientAppIdentifier.f80669d;
                    ajab ajab = (ajab) ajac.f70218a.get(str);
                    if (ajab == null) {
                        ajab = new ajab(ajac, str);
                        ajac.f70218a.put(str, ajab);
                    }
                    try {
                        if (!ajab.f70215b.containsKey(obj)) {
                            iBinder.linkToDeath(ajab, 0);
                            ajab.f70215b.put(obj, iBinder);
                        }
                    } catch (RemoteException e) {
                        ajab = null;
                    }
                    if (ajab == null) {
                        return;
                    }
                } else {
                    ajac ajac2 = this.f69950c;
                    String str2 = clientAppIdentifier.f80669d;
                    ajab ajab2 = (ajab) ajac2.f70218a.get(str2);
                    if (ajab2 != null) {
                        IBinder iBinder2 = (IBinder) ajab2.f70215b.remove(obj);
                        if (iBinder2 != null) {
                            iBinder2.unlinkToDeath(ajab2, 0);
                        }
                        if (ajab2.f70215b.isEmpty()) {
                            ajac2.mo38352a(str2);
                        }
                    }
                }
            }
            int i5 = ajdm.f70390a;
            if (i5 != 1) {
                i = i5 != 2 ? i5 != 3 ? i5 != 4 ? 0 : 13 : 12 : 11;
            } else {
                i = 10;
            }
            if (i != 0) {
                this.f69955h.mo38315a(this.f69948a, clientAppIdentifier.f80668c.f80723b, i);
            }
            this.f69949b.mo72984b();
            sdo.m34959a(clientAppIdentifier);
            sdo.m34959a(ajdm);
            if (ajdm.f70393d == null) {
                list = bngx.m109356a(ajdm);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(ajdm);
                if (ajdm.f70390a == 3) {
                    aiyo aiyo = ajdm.f70393d;
                    aiyo a = this.f69951d.mo38288a(aiyo.f70084b);
                    if (a != null) {
                        if (sdg.m34949a(a.f70085c, aiyo.f70085c) && sdg.m34949a(a.f70086d, aiyo.f70086d) && ajdq.m58559a(a.f70086d.f80692e)) {
                            ((ajbd) ahgz.m55754a(this.f69948a, ajbd.class)).mo38439c();
                            linkedList.clear();
                        } else {
                            aiyn aiyn = a.f70084b;
                            ajcd ajcd = aiyn.f70080a;
                            if (ajcd == null) {
                                ajdt = ajdt.m58564a(aiyn.f70081b);
                            } else {
                                ajdt = ajdt.m58563a(ajcd);
                            }
                            linkedList.addFirst(ajdm.m58554a(ajdt, (rkl) null));
                        }
                    }
                }
                if (!linkedList.isEmpty()) {
                    list = linkedList;
                } else {
                    ajdm.mo38507b(0);
                    return;
                }
            }
            for (ajdm ajdm2 : list) {
                Context context = this.f69948a;
                int i6 = ajdm2.f70390a;
                if (i6 == 1) {
                    i2 = !ajdm2.f70391b.f70054b.mo44303b() ? 0 : 4;
                } else if (i6 == 2) {
                    String str3 = ajdm2.f70392c.f70397a;
                    aiye aiye = ((aiyh) ahgz.m55754a(context, aiyh.class)).f70064f;
                    i2 = (aiye == null || !aiye.f70053a.equals(str3)) ? 0 : 4;
                } else if (i6 == 3) {
                    i2 = !ajdm2.f70393d.f70085c.mo44311b() ? 4 : 5;
                } else if (i6 != 4) {
                    bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                    bnsl.mo68432a("aiwp", "a", 321, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("Unknown operation type: %d", ajdm2.f70390a);
                    i2 = 4;
                } else {
                    i2 = 4;
                }
                ajdm2.mo38506a(i2, 13);
                int i7 = ajdm2.f70390a;
                if (i7 == 1) {
                    aiye aiye2 = ajdm2.f70391b;
                    sdo.m34970a(aiye2.equals(aiye2));
                    aiye2.f70058f = ajdm2;
                    aiyh aiyh = this.f69954g;
                    aiye aiye3 = ajdm2.f70391b;
                    aiyh.f70062d.mo72984b();
                    aiyh.mo38263a(aiye3.f70053a);
                    boolean add = aiyh.f70061c.add(aiye3);
                    if (aiye3.f70054b.mo44303b()) {
                        aiyh.f70064f = aiye3;
                    }
                    if (add) {
                        aiyh.mo38268d();
                    }
                    aiyh.f70061c.size();
                    ((ajej) ahgz.m55754a(aiyh.f70059a, ajej.class)).mo38548a();
                } else if (i7 == 2) {
                    aiyh aiyh2 = this.f69954g;
                    aiyh2.f70062d.mo72984b();
                    aiyh2.mo38263a(ajdm2.f70392c.f70397a);
                    aiyh2.f70060b.put(ajdm2.f70392c.f70397a, ajdm2);
                    ((ajej) ahgz.m55754a(aiyh2.f70059a, ajej.class)).mo38548a();
                } else if (i7 == 3) {
                    aiyo aiyo2 = ajdm2.f70393d;
                    sdo.m34970a(aiyo2.equals(aiyo2));
                    aiyo2.f70088f = ajdm2;
                    aiyr aiyr = this.f69951d;
                    aiyo aiyo3 = ajdm2.f70393d;
                    aiyr.f70096g.mo72984b();
                    aiyr.mo38299b(aiyo3.f70084b);
                    aiyr.f70094e.put(aiyo3.f70084b, aiyo3);
                    aiyr.f70093d.mo67268a(clientAppIdentifier, aiyo3);
                    aiyr.f70095f.put(aiyo3.f70083a, aiyo3);
                    aiyr.mo38294a();
                    for (aiyq aiyq : aiyr.f70091b) {
                        aiyq.mo38286a(aiyo3);
                    }
                    if (aiyo3.f70085c.mo44309a()) {
                        aiyr.f70097h = aiyo3;
                    }
                    if (aiyo3.f70085c.mo44311b()) {
                        ((ajej) aiyr.f70090a.mo36473a(ajej.class)).mo38548a();
                    }
                } else if (i7 != 4) {
                    bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                    bnsl2.mo68432a("aiwp", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68422a("%s Unexpected operation code %d", (Object) "CopresenceHelper: ", ajdm2.f70390a);
                } else {
                    aiyr aiyr2 = this.f69951d;
                    ajdt ajdt2 = ajdm2.f70394e;
                    aiyr2.f70096g.mo72984b();
                    aiyr2.f70096g.mo72984b();
                    ajcd ajcd2 = ajdt2.f70399a;
                    aiyr2.mo38300b(ajcd2 == null ? aiyr2.mo38290a(ajdt2.f70400b) : aiyr2.mo38289a(ajcd2));
                }
            }
            return;
        }
        ajdm.mo38507b(8);
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
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo38170a(ClientAppIdentifier clientAppIdentifier, ajdm ajdm) {
        List<ajdm> list;
        int i;
        ajdt ajdt;
        this.f69949b.mo72984b();
        sdo.m34959a(clientAppIdentifier);
        sdo.m34959a(ajdm);
        if (ajdm.f70393d == null) {
            list = bngx.m109356a(ajdm);
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.add(ajdm);
            if (ajdm.f70390a == 3) {
                aiyo aiyo = ajdm.f70393d;
                aiyo a = this.f69951d.mo38288a(aiyo.f70084b);
                if (a != null) {
                    if (sdg.m34949a(a.f70085c, aiyo.f70085c) && sdg.m34949a(a.f70086d, aiyo.f70086d) && ajdq.m58559a(a.f70086d.f80692e)) {
                        ((ajbd) ahgz.m55754a(this.f69948a, ajbd.class)).mo38439c();
                        linkedList.clear();
                    } else {
                        aiyn aiyn = a.f70084b;
                        ajcd ajcd = aiyn.f70080a;
                        if (ajcd == null) {
                            ajdt = ajdt.m58564a(aiyn.f70081b);
                        } else {
                            ajdt = ajdt.m58563a(ajcd);
                        }
                        linkedList.addFirst(ajdm.m58554a(ajdt, (rkl) null));
                    }
                }
            }
            if (!linkedList.isEmpty()) {
                list = linkedList;
            } else {
                ajdm.mo38507b(0);
                return;
            }
        }
        for (ajdm ajdm2 : list) {
            Context context = this.f69948a;
            int i2 = ajdm2.f70390a;
            if (i2 == 1) {
                i = !ajdm2.f70391b.f70054b.mo44303b() ? 0 : 4;
            } else if (i2 == 2) {
                String str = ajdm2.f70392c.f70397a;
                aiye aiye = ((aiyh) ahgz.m55754a(context, aiyh.class)).f70064f;
                i = (aiye == null || !aiye.f70053a.equals(str)) ? 0 : 4;
            } else if (i2 == 3) {
                i = !ajdm2.f70393d.f70085c.mo44311b() ? 4 : 5;
            } else if (i2 != 4) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                bnsl.mo68432a("aiwp", "a", 321, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("Unknown operation type: %d", ajdm2.f70390a);
                i = 4;
            } else {
                i = 4;
            }
            ajdm2.mo38506a(i, 13);
            int i3 = ajdm2.f70390a;
            if (i3 == 1) {
                aiye aiye2 = ajdm2.f70391b;
                sdo.m34970a(aiye2.equals(aiye2));
                aiye2.f70058f = ajdm2;
                aiyh aiyh = this.f69954g;
                aiye aiye3 = ajdm2.f70391b;
                aiyh.f70062d.mo72984b();
                aiyh.mo38263a(aiye3.f70053a);
                boolean add = aiyh.f70061c.add(aiye3);
                if (aiye3.f70054b.mo44303b()) {
                    aiyh.f70064f = aiye3;
                }
                if (add) {
                    aiyh.mo38268d();
                }
                srn srn = ahfq.f67120a;
                aiyh.f70061c.size();
                ((ajej) ahgz.m55754a(aiyh.f70059a, ajej.class)).mo38548a();
            } else if (i3 == 2) {
                aiyh aiyh2 = this.f69954g;
                aiyh2.f70062d.mo72984b();
                aiyh2.mo38263a(ajdm2.f70392c.f70397a);
                aiyh2.f70060b.put(ajdm2.f70392c.f70397a, ajdm2);
                ((ajej) ahgz.m55754a(aiyh2.f70059a, ajej.class)).mo38548a();
            } else if (i3 == 3) {
                aiyo aiyo2 = ajdm2.f70393d;
                sdo.m34970a(aiyo2.equals(aiyo2));
                aiyo2.f70088f = ajdm2;
                aiyr aiyr = this.f69951d;
                aiyo aiyo3 = ajdm2.f70393d;
                aiyr.f70096g.mo72984b();
                aiyr.mo38299b(aiyo3.f70084b);
                aiyr.f70094e.put(aiyo3.f70084b, aiyo3);
                aiyr.f70093d.mo67268a(clientAppIdentifier, aiyo3);
                aiyr.f70095f.put(aiyo3.f70083a, aiyo3);
                aiyr.mo38294a();
                for (aiyq aiyq : aiyr.f70091b) {
                    aiyq.mo38286a(aiyo3);
                }
                srn srn2 = ahfq.f67120a;
                if (aiyo3.f70085c.mo44309a()) {
                    aiyr.f70097h = aiyo3;
                }
                if (aiyo3.f70085c.mo44311b()) {
                    ((ajej) aiyr.f70090a.mo36473a(ajej.class)).mo38548a();
                }
            } else if (i3 != 4) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                bnsl2.mo68432a("aiwp", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68422a("%s Unexpected operation code %d", (Object) "CopresenceHelper: ", ajdm2.f70390a);
            } else {
                aiyr aiyr2 = this.f69951d;
                ajdt ajdt2 = ajdm2.f70394e;
                aiyr2.f70096g.mo72984b();
                aiyr2.f70096g.mo72984b();
                ajcd ajcd2 = ajdt2.f70399a;
                aiyr2.mo38300b(ajcd2 == null ? aiyr2.mo38290a(ajdt2.f70400b) : aiyr2.mo38289a(ajcd2));
            }
        }
    }

    /* renamed from: a */
    public final void mo38171a(String str) {
        this.f69949b.mo72987c(new aiwn(this, "onClientAppDied.wipePackage", str));
    }
}
