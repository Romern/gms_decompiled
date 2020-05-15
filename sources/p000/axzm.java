package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: axzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axzm implements axyu, ayjm, axxg, axzh {

    /* renamed from: a */
    public static axzm f96829a;

    /* renamed from: b */
    static final Uri f96830b = new Uri.Builder().scheme("wear").path("/peers").build();

    /* renamed from: c */
    public final Object f96831c = new Object();

    /* renamed from: d */
    public final Set f96832d = new HashSet();

    /* renamed from: e */
    final ayae f96833e;

    /* renamed from: f */
    public final Map f96834f = new HashMap();

    /* renamed from: g */
    public final ArrayList f96835g = new ArrayList();

    /* renamed from: h */
    public axxv f96836h;

    /* renamed from: i */
    public axwy f96837i;

    /* renamed from: j */
    public final axzl f96838j;

    /* renamed from: k */
    public final boolean f96839k;

    /* renamed from: l */
    public axzt f96840l;

    /* renamed from: m */
    private boolean f96841m = false;

    /* renamed from: n */
    private final ConnectivityManager f96842n;

    public axzm(ConnectivityManager connectivityManager, ayae ayae, boolean z, Context context) {
        sdo.m34959a(connectivityManager);
        this.f96842n = connectivityManager;
        sdo.m34959a(ayae);
        this.f96833e = ayae;
        this.f96839k = z;
        HandlerThread handlerThread = new HandlerThread("NodeService", 9);
        handlerThread.start();
        this.f96838j = new axzl(this, context, handlerThread.getLooper());
    }

    /* renamed from: a */
    private static final void m83601a(axxi axxi) {
        if (Log.isLoggable("NodeService", 4)) {
            Log.i("NodeService", "Invalid peers data item (ids or names). Ignoring.");
            String valueOf = String.valueOf(axxi);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("Data item: ");
            sb.append(valueOf);
            Log.i("NodeService", sb.toString());
            byte[] bArr = axxi.f96647b.f96642d;
            String valueOf2 = String.valueOf(Base64.encodeToString(bArr, 0, Math.min(3000, bArr.length), 0));
            Log.i("NodeService", valueOf2.length() == 0 ? new String("Data (trimmed to 3000 bytes): ") : "Data (trimmed to 3000 bytes): ".concat(valueOf2));
        }
    }

    /* renamed from: a */
    public final void mo53590a(String str, ayev ayev, axyt axyt) {
    }

    /* renamed from: b */
    public final Set mo53786b() {
        Set c;
        synchronized (this.f96831c) {
            mo53795c();
            c = this.f96833e.mo53830c();
        }
        return c;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo53795c() {
        synchronized (this.f96831c) {
            if (!this.f96841m) {
                this.f96841m = true;
                ayae ayae = this.f96833e;
                Cursor a = this.f96836h.mo53726a(ayha.f97559a, f96830b);
                try {
                    a.moveToFirst();
                    while (!a.isAfterLast()) {
                        axxi a2 = axxj.m83472a(a);
                        if (!a2.f96647b.f96639a.equals(this.f96840l.mo53808b().f96814a)) {
                            m83602a(ayae, a2);
                        }
                    }
                    a.close();
                    mo53796d();
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo53796d() {
        if (Log.isLoggable("NodeService", 2)) {
            String valueOf = String.valueOf(this.f96840l);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("updatePeerDataItem: ");
            sb.append(valueOf);
            Log.v("NodeService", sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(1);
        int i = 0;
        for (ayad ayad : this.f96834f.values()) {
            arrayList.add(ayad.f96891a.f96814a);
            arrayList2.add(ayad.f96891a.f96815b);
            if (ayad.f96892b) {
                arrayList3.add(Integer.valueOf(i));
            }
            i++;
        }
        axxf axxf = new axxf(this.f96840l.mo53808b().f96814a, "/peers");
        axos axos = new axos();
        axos.mo53328a("name", this.f96840l.mo53808b().f96815b);
        axos.mo53339c("ids", arrayList);
        axos.mo53339c("names", arrayList2);
        axos.mo53336b("meteredConnections", arrayList3);
        axos.mo53330a("isWatch", this.f96839k);
        axxf.f96642d = axos.mo53333a();
        this.f96836h.mo53728a(ayha.f97559a, axxf);
    }

    /* renamed from: b */
    public final void mo53787b(axxc axxc) {
        synchronized (this.f96831c) {
            Set set = this.f96832d;
            sdo.m34959a(axxc);
            set.remove(axxc);
        }
    }

    /* renamed from: a */
    private static final void m83602a(ayae ayae, axxi axxi) {
        String str = axxi.f96647b.f96639a;
        ayac a = ayae.mo53825a(str);
        if (!axxi.f96648c) {
            try {
                axos a2 = axos.m82822a(axxi.f96647b.f96642d);
                String c = a2.mo53337c("name");
                boolean g = a2.mo53344g("isWatch");
                ArrayList d = a2.mo53340d("ids");
                ArrayList d2 = a2.mo53340d("names");
                if (d == null || d2 == null || d.size() != d2.size()) {
                    m83601a(axxi);
                    return;
                }
                Object obj = a2.f96223a.get("meteredConnections");
                ArrayList arrayList = null;
                if (obj != null) {
                    try {
                        arrayList = (ArrayList) obj;
                    } catch (ClassCastException e) {
                        axos.m82823a("meteredConnections", obj, "ArrayList<Integer>", e);
                    }
                }
                HashSet hashSet = new HashSet();
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    hashSet.add(new ayad(new axzf((String) d.get(i), (String) d2.get(i)), arrayList != null && arrayList.contains(Integer.valueOf(i))));
                }
                ayae.mo53827a(new axzf(str, c), g, hashSet);
            } catch (IllegalArgumentException e2) {
                Log.e("NodeService", "Bad peers data item.");
                m83601a(axxi);
            }
        } else if (a != null) {
            String str2 = a.f96884a.f96814a;
            synchronized (ayae.f96894b) {
                Map map = ayae.f96893a;
                sdo.m34959a((Object) str2);
                map.remove(str2);
                ayae.mo53829b();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo53788b(String str) {
        boolean z;
        synchronized (this.f96831c) {
            mo53795c();
            ayae ayae = this.f96833e;
            synchronized (ayae.f96894b) {
                ayae.mo53826a();
                ayac ayac = (ayac) ayae.f96893a.get(str);
                z = false;
                if (ayac != null) {
                    int i = ayac.f96885b;
                    if (i < Integer.MAX_VALUE) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo53789c(String str) {
        boolean z;
        synchronized (this.f96831c) {
            mo53795c();
            ayac a = this.f96833e.mo53825a(str);
            z = false;
            if (a != null) {
                if (a.f96887d) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public static void m83603a(List list, Set set, Set set2) {
        int i;
        if (!list.isEmpty()) {
            if (Log.isLoggable("NodeService", 3)) {
                String valueOf = String.valueOf(set);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("notifyListeners: old reachable: ");
                sb.append(valueOf);
                Log.d("NodeService", sb.toString());
                String valueOf2 = String.valueOf(set2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("notifyListeners: new reachable: ");
                sb2.append(valueOf2);
                Log.d("NodeService", sb2.toString());
            }
            bnpd c = bnpf.m110057c(set, set2);
            bnpd c2 = bnpf.m110057c(set2, set);
            bnrd a = c.iterator();
            while (true) {
                i = 0;
                if (!a.hasNext()) {
                    break;
                }
                ayac ayac = (ayac) a.next();
                if (Log.isLoggable("NodeService", 3)) {
                    String valueOf3 = String.valueOf(ayac.f96884a);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 37);
                    sb3.append("notifyListeners: onPeerDisconnected: ");
                    sb3.append(valueOf3);
                    Log.d("NodeService", sb3.toString());
                }
                int size = list.size();
                while (i < size) {
                    ((axxc) list.get(i)).mo53600a(ayac.f96884a);
                    i++;
                }
            }
            bnrd a2 = c2.iterator();
            while (a2.hasNext()) {
                ayac ayac2 = (ayac) a2.next();
                if (Log.isLoggable("NodeService", 3)) {
                    String valueOf4 = String.valueOf(ayac2.f96884a);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 34);
                    sb4.append("notifyListeners: onPeerConnected: ");
                    sb4.append(valueOf4);
                    Log.d("NodeService", sb4.toString());
                }
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    axzf axzf = ayac2.f96884a;
                    int i3 = ayac2.f96885b;
                    ((axxc) list.get(i2)).mo53601a(axzf, i3, m83604a(axzf, i3));
                }
            }
            if (c.isEmpty() && c2.isEmpty()) {
                Iterator it = new TreeSet(set).iterator();
                Iterator it2 = new TreeSet(set2).iterator();
                while (it.hasNext()) {
                    ayac ayac3 = (ayac) it.next();
                    ayac ayac4 = (ayac) it2.next();
                    int i4 = ayac3.f96885b;
                    if (i4 == ayac4.f96885b) {
                        if (m83604a(ayac3.f96884a, i4) == m83604a(ayac4.f96884a, ayac4.f96885b)) {
                            if (ayac3.f96887d != ayac4.f96887d) {
                            }
                        }
                    }
                }
                if (Log.isLoggable("NodeService", 3)) {
                    String valueOf5 = String.valueOf(set2.toString());
                    Log.d("NodeService", valueOf5.length() == 0 ? new String("notifyListeners: no connected nodes change, still: ") : "notifyListeners: no connected nodes change, still: ".concat(valueOf5));
                    return;
                }
                return;
            }
            if (Log.isLoggable("NodeService", 3)) {
                String valueOf6 = String.valueOf(set2.toString());
                Log.d("NodeService", valueOf6.length() == 0 ? new String("notifyListeners: onConnectedNodes: ") : "notifyListeners: onConnectedNodes: ".concat(valueOf6));
            }
            int size3 = list.size();
            while (i < size3) {
                ((axxc) list.get(i)).mo53602a(set2);
                i++;
            }
        }
    }

    /* renamed from: a */
    public static boolean m83604a(axzf axzf, int i) {
        return i == 1 && !axzf.equals(axwp.f96618a);
    }

    /* renamed from: a */
    public static final boolean m83605a(boolean z, boolean z2, ayac ayac) {
        if (z && !z2 && !Log.isLoggable("NodeServiceNames", 3)) {
            if (ayac != null) {
                return !ayac.f96889f || ayac.f96885b == 0;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final axzf mo53784a() {
        return this.f96840l.mo53808b();
    }

    /* renamed from: a */
    public final void mo53785a(axxc axxc) {
        synchronized (this.f96831c) {
            Set set = this.f96832d;
            sdo.m34959a(axxc);
            set.add(axxc);
        }
    }

    /* renamed from: a */
    public final void mo53588a(axyv axyv) {
        String str;
        axzf a = axyv.mo53699a();
        boolean z = false;
        if ("cloud".equals(a.f96814a) && C1185me.m19630a(this.f96842n)) {
            z = true;
        }
        if (Log.isLoggable("NodeService", 3)) {
            String str2 = a.f96814a;
            if (!z) {
                str = "";
            } else {
                str = " (metered)";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21 + str.length());
            sb.append("onMessageWriterAdded ");
            sb.append(str2);
            sb.append(str);
            Log.d("NodeService", sb.toString());
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f96838j.post(new axzi(this, a, z));
        } else {
            mo53794a(axzk.m83598a(a, z));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r2.f96885b != 1) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00af, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo53794a(axzk axzk) {
        String str;
        synchronized (this.f96831c) {
            if (this.f96835g.isEmpty()) {
                if (axzk.f96821a) {
                    str = axzk.f96822b.f96814a;
                } else {
                    str = axzk.f96824d;
                }
                mo53795c();
                ayac a = this.f96833e.mo53825a(str);
                if (!axzk.f96821a) {
                    if (a == null) {
                    }
                    if (Log.isLoggable("NodeService", 3)) {
                        String valueOf = String.valueOf(str);
                        Log.d("NodeService", valueOf.length() == 0 ? new String("Ignoring disconnect of non-adjacent node: ") : "Ignoring disconnect of non-adjacent node: ".concat(valueOf));
                    }
                } else if (a != null && a.f96885b == 1 && a.f96887d == axzk.f96823c) {
                    if (Log.isLoggable("NodeService", 3)) {
                        String valueOf2 = String.valueOf(str);
                        Log.d("NodeService", valueOf2.length() == 0 ? new String("Ignoring connect of already adjacent node: ") : "Ignoring connect of already adjacent node: ".concat(valueOf2));
                    }
                }
            }
            this.f96835g.add(axzk);
            if (axzk.f96821a) {
                axzl axzl = this.f96838j;
                this.f96835g.size();
                axzl.mo53792a();
            } else {
                axzl axzl2 = this.f96838j;
                int size = this.f96835g.size();
                Message obtainMessage = axzl2.f96825a.f96838j.obtainMessage(2);
                obtainMessage.arg1 = size;
                obtainMessage.sendToTarget();
            }
        }
    }

    /* renamed from: a */
    public final void mo53589a(String str) {
        if (Log.isLoggable("NodeService", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("NodeService", valueOf.length() == 0 ? new String("onMessageWriterRemoved ") : "onMessageWriterRemoved ".concat(valueOf));
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f96838j.post(new axzj(this, str));
        } else {
            mo53794a(axzk.m83599a(str));
        }
    }

    /* renamed from: a */
    public final void mo53557a(ArrayList arrayList) {
        synchronized (this.f96831c) {
            mo53795c();
            Iterator it = arrayList.iterator();
            Set set = null;
            int i = 0;
            while (it.hasNext()) {
                axxi axxi = (axxi) it.next();
                if (ayha.f97559a.equals(axxi.f96646a) && "/peers".equals(axxi.f96647b.f96640b) && !axxi.f96647b.f96639a.equals(this.f96840l.mo53808b().f96814a)) {
                    if (set == null) {
                        set = this.f96833e.mo53830c();
                    }
                    m83602a(this.f96833e, axxi);
                    i++;
                }
            }
            if (i != 0) {
                Set c = this.f96833e.mo53830c();
                ArrayList arrayList2 = new ArrayList(this.f96832d);
                m83603a(arrayList2, set, c);
            }
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        String str;
        String str2;
        ssb.mo26034a();
        synchronized (this.f96831c) {
            mo53795c();
            this.f96833e.mo53558a(ssb, z, z2);
            ssb.println();
            ssb.println("Reachable Nodes:");
            ssb.mo26034a();
            TreeSet treeSet = new TreeSet(this.f96833e.mo53830c());
            ssb.printf("%20s : %10s : %4s : %8s : %8s\n", "name", "id", "hops", "isNearby", "isWatch");
            if (!treeSet.isEmpty()) {
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    ayac ayac = (ayac) it.next();
                    String str3 = !m83605a(this.f96839k, z2, ayac) ? ayac.f96884a.f96814a : ayac.f96884a.f96815b;
                    boolean z3 = ayac.f96885b == 1 && !axwp.f96618a.equals(ayac.f96884a);
                    Object[] objArr = new Object[5];
                    objArr[0] = str3;
                    objArr[1] = ayac.f96884a.f96814a;
                    objArr[2] = Integer.valueOf(ayac.f96885b);
                    if (!z3) {
                        str = "false";
                    } else {
                        str = "true";
                    }
                    objArr[3] = str;
                    if (!ayac.f96889f) {
                        str2 = "false";
                    } else {
                        str2 = "true";
                    }
                    objArr[4] = str2;
                    ssb.printf("%20s : %10s : %4d : %8s : %8s\n", objArr);
                }
            } else {
                ssb.println("no reachable nodes");
            }
            ssb.mo26035b();
        }
        ssb.mo26035b();
    }
}
