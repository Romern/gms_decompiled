package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.location.geofencer.service.BlockingChreGeofenceHardware$1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: bfyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfyq implements bugo, bugl, bugs {

    /* renamed from: w */
    public static final bfyp f115705w = new bfyp();

    /* renamed from: a */
    public final ArrayList f115706a = new ArrayList();

    /* renamed from: b */
    public final C1223np f115707b = new C1223np();

    /* renamed from: c */
    public final ArrayList f115708c = new ArrayList();

    /* renamed from: d */
    public bufe[] f115709d;

    /* renamed from: e */
    public final ArrayList f115710e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f115711f = new ArrayList();

    /* renamed from: g */
    public int f115712g = -1;

    /* renamed from: h */
    public bugn f115713h = null;

    /* renamed from: i */
    public bugr f115714i = null;

    /* renamed from: j */
    public final bfzt f115715j;

    /* renamed from: k */
    public Location f115716k = null;

    /* renamed from: l */
    public final bfwf f115717l = new bfwf(this.f115730z, 0, null, -2, "");

    /* renamed from: m */
    public final skc f115718m;

    /* renamed from: n */
    public final spf f115719n;

    /* renamed from: o */
    public final skb f115720o;

    /* renamed from: p */
    public final spb f115721p;

    /* renamed from: q */
    public int f115722q;

    /* renamed from: r */
    public int f115723r = 0;

    /* renamed from: s */
    public Runnable f115724s = null;

    /* renamed from: t */
    public final boolean f115725t;

    /* renamed from: u */
    public final ArrayDeque f115726u = new ArrayDeque();

    /* renamed from: v */
    public final ArrayDeque f115727v = new ArrayDeque();

    /* renamed from: x */
    public final bfww f115728x;

    /* renamed from: y */
    public bxvd f115729y;

    /* renamed from: z */
    private final ParcelableGeofence f115730z = new ParcelableGeofence("<Sentinel>", 1, 1, 0.0d, 0.0d, 1000.0f, 0, 0, 0);

    public bfyq(Context context, bfzt bfzt, skc skc, spf spf, bfww bfww) {
        this.f115715j = bfzt;
        this.f115718m = skc;
        this.f115719n = spf;
        boolean h = soz.m35811h(context);
        this.f115725t = h;
        if (h) {
            this.f115713h = new bgcb().mo62634a(context);
        }
        if (this.f115725t) {
            int i = Build.VERSION.SDK_INT;
            if (!ceub.m138248c()) {
                this.f115721p = null;
                this.f115720o = skb.m35502a("location", "BlockingChreGeofenceHardware", new bfym(this));
            } else {
                this.f115721p = new BlockingChreGeofenceHardware$1(this, "location");
                this.f115720o = null;
            }
        } else {
            this.f115720o = null;
            this.f115721p = null;
        }
        this.f115728x = bfww;
    }

    /* renamed from: a */
    public final void mo61880a(int i) {
        if (i != 1) {
            if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                bfxc.m98134c("ChreGeofenceHardware", "Geofence app unavailable.");
            }
            this.f115715j.mo62553d((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED);
        }
    }

    /* renamed from: b */
    public final void mo62435b() {
        synchronized (this.f115706a) {
            this.f115706a.clear();
            int i = this.f115712g;
            if (i > 0) {
                this.f115706a.addAll(Collections.nCopies(i, null));
                this.f115709d = new bufe[this.f115712g];
            }
            this.f115707b.clear();
            this.f115708c.clear();
            for (int i2 = 0; i2 < this.f115712g; i2++) {
                this.f115708c.add(Integer.valueOf(i2));
            }
            this.f115727v.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.util.Collection], assign insn: 0x0019: IGET  (r3v0 ? I:java.util.Collection) = (r2v2 bfyp) bfyp.a java.util.Collection */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.util.Collection], assign insn: 0x0039: IGET  (r2v3 ? I:java.util.Collection) = (r2v2 bfyp) bfyp.b java.util.Collection */
    /* renamed from: c */
    public final C1223np mo62437c() {
        C1223np npVar = new C1223np(this.f115707b);
        Iterator it = this.f115727v.iterator();
        while (it.hasNext()) {
            bfyp bfyp = (bfyp) it.next();
            ? r3 = bfyp.f115703a;
            if (r3 != 0) {
                int size = r3.size();
                for (int i = 0; i < size; i++) {
                    bfyo bfyo = (bfyo) r3.get(i);
                    npVar.put(bfyo.f115702b, Integer.valueOf(bfyo.f115701a));
                }
            }
            ? r2 = bfyp.f115704b;
            if (r2 != 0) {
                int size2 = r2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    npVar.remove(((bfyo) r2.get(i2)).f115702b);
                }
            }
        }
        return npVar;
    }

    /* renamed from: cr */
    public final void mo61886cr() {
        if (Log.isLoggable("ChreGeofenceHardware", 5)) {
            bfxc.m98134c("ChreGeofenceHardware", "Geofence app available.");
        }
        this.f115715j.mo62553d((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED);
    }

    /* renamed from: d */
    public final void mo62438d() {
        buew buew = (buew) buey.f153665e.mo74144da();
        this.f115726u.clear();
        this.f115727v.clear();
        if (buew.f164950c) {
            buew.mo74035c();
            buew.f164950c = false;
        }
        buey buey = (buey) buew.f164949b;
        buey.f153668b = 0;
        buey.f153667a |= 1;
        mo62427a((buey) buew.mo74062i(), f115705w);
        mo62435b();
    }

    /* renamed from: e */
    public final void mo62439e() {
        buew buew = (buew) buey.f153665e.mo74144da();
        if (buew.f164950c) {
            buew.mo74035c();
            buew.f164950c = false;
        }
        buey buey = (buey) buew.f164949b;
        buey.f153668b = 2;
        buey.f153667a |= 1;
        mo62427a((buey) buew.mo74062i(), f115705w);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo62440f() {
        return this.f115712g > 0 && this.f115723r == 3;
    }

    /* renamed from: a */
    public final void mo62426a(buey buey) {
        bugr bugr = this.f115714i;
        if (bugr != null) {
            bugr.mo72640a(0, 1, buey);
            if (ceub.m138248c() && this.f115721p != null) {
                this.f115719n.mo25930a("BlockingChreGeofenceHardware", 2, SystemClock.elapsedRealtime() + 5000, this.f115721p, (Handler) null, (WorkSource) null);
            } else {
                this.f115718m.mo25676a("BlockingChreGeofenceHardware", 2, SystemClock.elapsedRealtime() + 5000, this.f115720o, (String) null);
            }
        }
    }

    /* renamed from: b */
    public final void mo61884b(int i) {
        if (this.f115714i != null) {
            buew buew = (buew) buey.f153665e.mo74144da();
            if (buew.f164950c) {
                buew.mo74035c();
                buew.f164950c = false;
            }
            buey buey = (buey) buew.f164949b;
            buey.f153668b = 0;
            buey.f153667a |= 1;
            mo62426a((buey) buew.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo62427a(buey buey, bfyp bfyp) {
        this.f115726u.add(buey);
        if (this.f115727v.isEmpty()) {
            this.f115715j.mo62553d((int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED);
        }
        this.f115727v.add(bfyp);
    }

    /* renamed from: a */
    public final void mo61878a(bugn bugn, bugr bugr, buhd buhd) {
        if (bugr.mo72639a() == 5147455389092024324L) {
            try {
                int a = bufp.m119413a(buhd.f153831a);
                if (a != 0) {
                    int i = a - 1;
                    if (i == 1) {
                        buez buez = (buez) buhd.mo72661a((bxxk) buez.f153671d.mo74142c(7));
                        if (buez != null) {
                            this.f115715j.mo62545b((int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, buez);
                        } else {
                            boolean z = bfxc.f115575a;
                        }
                    } else if (i == 2) {
                        bufg bufg = (bufg) buhd.mo72661a((bxxk) bufg.f153692c.mo74142c(7));
                        if (bufg != null) {
                            this.f115715j.mo62545b((int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, bufg);
                        } else {
                            boolean z2 = bfxc.f115575a;
                        }
                    } else if (i != 3) {
                        boolean z3 = bfxc.f115575a;
                    } else if (((buet) buhd.mo72661a((bxxk) buet.f153644a.mo74142c(7))) != null) {
                        this.f115715j.mo62512a(LocationAvailability.m66850a(1000, 1, 1, SystemClock.elapsedRealtimeNanos()));
                    } else {
                        boolean z4 = bfxc.f115575a;
                    }
                } else {
                    boolean z5 = bfxc.f115575a;
                }
            } catch (Exception e) {
                if (Log.isLoggable("ChreGeofenceHardware", 6)) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                    sb.append("Error on message received: ");
                    sb.append(valueOf);
                    bfxc.m98133b("ChreGeofenceHardware", sb.toString());
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo62436b(ArrayList arrayList, ArrayList arrayList2) {
        bxvd bxvd = this.f115729y;
        if (bxvd != null) {
            arrayList2.add(new bfyo(((bues) bxvd.f164949b).f153640h, this.f115717l));
            mo62431a(arrayList, arrayList2, (bues) this.f115729y.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo62428a(Runnable runnable) {
        if (this.f115722q >= 131072 && mo62440f()) {
            Arrays.fill(this.f115709d, (Object) null);
            buew buew = (buew) buey.f153665e.mo74144da();
            if (buew.f164950c) {
                buew.mo74035c();
                buew.f164950c = false;
            }
            buey buey = (buey) buew.f164949b;
            buey.f153668b = 3;
            buey.f153667a |= 1;
            mo62426a((buey) buew.mo74062i());
            this.f115724s = runnable;
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public final void mo62429a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            bfyp bfyp = new bfyp();
            bfyp.f115704b = arrayList;
            buew buew = (buew) buey.f153665e.mo74144da();
            if (buew.f164950c) {
                buew.mo74035c();
                buew.f164950c = false;
            }
            buey buey = (buey) buew.f164949b;
            buey.f153668b = 2;
            buey.f153667a |= 1;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bfyo bfyo = (bfyo) arrayList.get(i);
                buew.mo72625a(bfyo.f115701a);
                this.f115708c.add(Integer.valueOf(bfyo.f115701a));
            }
            mo62427a((buey) buew.mo74062i(), bfyp);
        }
    }

    /* renamed from: a */
    public final void mo62430a(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            bfyp bfyp = new bfyp();
            bfyp.f115703a = new ArrayList(arrayList2);
            buew buew = (buew) buey.f153665e.mo74144da();
            if (buew.f164950c) {
                buew.mo74035c();
                buew.f164950c = false;
            }
            buey buey = (buey) buew.f164949b;
            buey.f153668b = 1;
            buey.f153667a = 1 | buey.f153667a;
            if (!buey.f153669c.mo73666a()) {
                buey.f153669c = GeneratedMessageLite.m124021a(buey.f153669c);
            }
            bxsy.m123078a(arrayList, buey.f153669c);
            mo62427a((buey) buew.mo74062i(), bfyp);
            arrayList2.clear();
            arrayList.clear();
        }
    }

    /* renamed from: a */
    public final void mo62431a(ArrayList arrayList, ArrayList arrayList2, bues bues) {
        arrayList.add(bues);
        if (arrayList.size() == 25) {
            mo62430a(arrayList, arrayList2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: od.a(java.util.Map, java.util.Collection):boolean
     arg types: [np, java.util.List]
     candidates:
      od.a(java.util.Set, java.lang.Object):boolean
      od.a(int, int):java.lang.Object
      od.a(int, java.lang.Object):java.lang.Object
      od.a(java.lang.Object, java.lang.Object):void
      od.a(java.lang.Object[], int):java.lang.Object[]
      od.a(java.util.Map, java.util.Collection):boolean */
    /* renamed from: a */
    public final void mo62432a(List list) {
        C1223np c = mo62437c();
        C1223np npVar = new C1223np(c);
        C1238od.m19743a((Map) npVar, (Collection) list);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : npVar.entrySet()) {
            arrayList.add(new bfyo(((Integer) entry.getValue()).intValue(), (bfwf) entry.getKey()));
        }
        mo62429a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bfwf bfwf = (bfwf) it.next();
            if (!c.containsKey(bfwf)) {
                ArrayList arrayList4 = this.f115708c;
                int intValue = ((Integer) arrayList4.remove(arrayList4.size() - 1)).intValue();
                arrayList3.add(new bfyo(intValue, bfwf));
                mo62431a(arrayList2, arrayList3, bfwf.mo62352a(intValue));
            }
        }
        if (this.f115729y != null) {
            ArrayList arrayList5 = this.f115708c;
            int intValue2 = ((Integer) arrayList5.remove(arrayList5.size() - 1)).intValue();
            bxvd bxvd = this.f115729y;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bues bues = (bues) bxvd.f164949b;
            bues bues2 = bues.f153631l;
            bues.f153633a |= 64;
            bues.f153640h = intValue2;
            arrayList3.add(new bfyo(intValue2, this.f115717l));
            mo62431a(arrayList2, arrayList3, (bues) this.f115729y.mo74062i());
        }
        mo62430a(arrayList2, arrayList3);
    }

    /* renamed from: a */
    public final void mo62433a(List list, boolean z) {
        bfwf bfwf;
        byte b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            buev buev = (buev) list.get(i);
            int i2 = buev.f153660a;
            if ((i2 & 1) == 0 || (i2 & 2) == 0 || (i2 & 4) == 0) {
                boolean z2 = bfxc.f115575a;
            } else {
                int i3 = buev.f153661b;
                if (i3 < 0 || i3 >= this.f115706a.size()) {
                    boolean z3 = bfxc.f115575a;
                } else {
                    if (!z) {
                        bfwf = (bfwf) this.f115715j.f115808m.f115752j.get(Integer.valueOf(buev.f153662c));
                    } else {
                        bfwf = (bfwf) this.f115706a.get(buev.f153661b);
                        if (!(bfwf == null || bfwf.f115492j == buev.f153662c)) {
                            bfwf = null;
                        }
                    }
                    if (!(bfwf == null || bfwf == this.f115717l)) {
                        boolean z4 = bfxc.f115575a;
                        bufe bufe = buev.f153663d;
                        if (bufe == null) {
                            bufe = bufe.f153679f;
                        }
                        int i4 = bufe.f153681a;
                        if ((i4 & 8) != 0) {
                            bfwf.f115491i = bufe.f153685e;
                        }
                        if ((i4 & 1) != 0) {
                            int a = bufd.m119401a(bufe.f153682b);
                            if (a == 0) {
                                a = 1;
                            }
                            int i5 = a - 1;
                            if (i5 != 0) {
                                b = i5 != 1 ? i5 != 2 ? (byte) 3 : 2 : 1;
                            } else {
                                b = 0;
                            }
                            bfwf.f115493k.f115513b = b;
                        }
                        if ((bufe.f153681a & 2) != 0) {
                            int a2 = bufb.m119399a(bufe.f153683c);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            int i6 = a2 - 1;
                            if (i6 == 0) {
                                bfwf.f115490h = false;
                            } else if (i6 == 1) {
                                bfwf.f115490h = false;
                                bfwf.f115487e = 1;
                            } else if (i6 != 2) {
                                bfwf.f115490h = true;
                                bfwf.f115489g = -1;
                                bfwf.f115487e = 1;
                            } else {
                                bfwf.f115491i = true;
                                bfwf.f115490h = false;
                                bfwf.f115489g = -1;
                                bfwf.f115487e = 2;
                            }
                        }
                        if ((bufe.f153681a & 4) != 0) {
                            bfwf.f115489g = ((long) bufe.f153684d) * 1000;
                            if (bfwf.f115490h || bfwf.f115487e != 1) {
                                Log.wtf("GeofenceState", new IllegalStateException("dwellCheckStartPlatformSec shouldn't be set if already dwelled or not inside."));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo62434a(long j) {
        int i;
        int i2;
        boolean z;
        if (this.f115729y == null) {
            return false;
        }
        if (!this.f115710e.isEmpty()) {
            i = 3;
        } else {
            i = 2;
        }
        ArrayList arrayList = this.f115711f;
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            bfwf bfwf = (bfwf) arrayList.get(i3);
            long j3 = bfwf.mo62355c() ? (bfwf.f115489g + ((long) bfwf.f115483a.f79446i)) - j : -1;
            if (j3 < j2) {
                j2 = j3;
            }
        }
        if (j2 != Long.MAX_VALUE) {
            i |= 4;
        }
        if (j2 != Long.MAX_VALUE) {
            i2 = ((int) (j2 / 1000)) + 1;
        } else {
            i2 = -1;
        }
        bxvd bxvd = this.f115729y;
        bues bues = (bues) bxvd.f164949b;
        if ((bues.f153633a & 16) != 0 && bues.f153638f == i2) {
            z = false;
        } else {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bues bues2 = (bues) bxvd.f164949b;
            bues bues3 = bues.f153631l;
            bues2.f153633a |= 16;
            bues2.f153638f = i2;
            z = true;
        }
        bxvd bxvd2 = this.f115729y;
        bues bues4 = (bues) bxvd2.f164949b;
        if ((bues4.f153633a & 32) != 0 && bues4.f153639g == i) {
            return z;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bues bues5 = (bues) bxvd2.f164949b;
        bues bues6 = bues.f153631l;
        bues5.f153633a |= 32;
        bues5.f153639g = i;
        bxvd bxvd3 = this.f115729y;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bues bues7 = (bues) bxvd3.f164949b;
        bues7.f153633a |= 128;
        bues7.f153641i = i;
        return true;
    }
}
