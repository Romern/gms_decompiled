package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxy implements ayjm {

    /* renamed from: a */
    public final String f96729a;

    /* renamed from: b */
    public final String f96730b;

    /* renamed from: c */
    public final axxv f96731c;

    /* renamed from: d */
    public final axxw f96732d = new axxw();

    /* renamed from: e */
    public final Object f96733e = new Object();

    /* renamed from: f */
    public boolean f96734f;

    /* renamed from: g */
    public boolean f96735g;

    /* renamed from: h */
    public axyv f96736h;

    /* renamed from: i */
    public axxw f96737i;

    /* renamed from: j */
    public Map f96738j = new HashMap();

    /* renamed from: k */
    public boolean f96739k;

    /* renamed from: l */
    private final ArrayList f96740l = new ArrayList();

    public axxy(String str, String str2, axxv axxv) {
        this.f96729a = str;
        this.f96730b = str2;
        this.f96731c = axxv;
        this.f96732d.mo53751a(true);
    }

    /* renamed from: b */
    public static final boolean m83539b() {
        return Log.isLoggable("datatransport", 2) || Log.isLoggable("WearableVerbose", 2);
    }

    /* renamed from: a */
    public final void mo53753a() {
        synchronized (this.f96733e) {
            this.f96734f = false;
            this.f96735g = false;
            this.f96736h = null;
            this.f96737i.mo53751a(false);
            this.f96740l.add(this.f96737i);
            while (this.f96740l.size() > 20) {
                this.f96740l.remove(0);
            }
            this.f96737i = null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axxv.a(axxi, int, boolean, java.lang.String):boolean
     arg types: [axxi, int, int, java.lang.String]
     candidates:
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, boolean, axue[]):axxu
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[], java.lang.String):java.util.Map
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String):void
      axxv.a(axue, java.lang.String, java.lang.String, boolean):void
      axxv.a(axxi, int, boolean, java.lang.String):boolean */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r12.f96731c.mo53740a(r14, r1, false, r12.f96730b) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        if (android.util.Log.isLoggable("datatransport", 2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        r13 = r12.f96730b;
        r14 = java.lang.String.valueOf(r14.f96647b.f96641c);
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r13).length() + 56) + java.lang.String.valueOf(r14).length());
        r2.append("sendDataItemToPeer: filtering data item for peer: ");
        r2.append(r13);
        r2.append(", uri=");
        r2.append(r14);
        android.util.Log.v("datatransport", r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009b, code lost:
        if (r12.f96739k != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009d, code lost:
        r4 = r14.f96651f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a0, code lost:
        r4 = r14.f96652g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
        r0 = p000.ayev.f97376n.mo74144da();
        r2 = p000.ayfc.f97448k.mo74144da();
        r6 = r14.f96646a.f96377a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b4, code lost:
        if (r2.f164950c == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b6, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bb, code lost:
        r7 = (p000.ayfc) r2.f164949b;
        r6.getClass();
        r8 = r7.f97450a | 1;
        r7.f97450a = r8;
        r7.f97451b = r6;
        r6 = r14.f96646a.f96379c;
        r6.getClass();
        r7.f97450a = r8 | 2;
        r7.f97452c = r6;
        r6 = r14.f96647b.f96641c.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e0, code lost:
        if (r2.f164950c != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e3, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e8, code lost:
        r7 = (p000.ayfc) r2.f164949b;
        r6.getClass();
        r8 = r7.f97450a | 4;
        r7.f97450a = r8;
        r7.f97453d = r6;
        r6 = r8 | 16;
        r7.f97450a = r6;
        r7.f97455f = r4;
        r4 = r14.f96648c;
        r5 = r6 | 32;
        r7.f97450a = r5;
        r7.f97456g = r4;
        r4 = r14.f96650e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0107, code lost:
        if (r4 == null) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0109, code lost:
        r4.getClass();
        r7.f97450a = r5 | 64;
        r7.f97457h = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0112, code lost:
        r4 = r14.f96647b.f96642d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0116, code lost:
        if (r4 == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0118, code lost:
        r4 = p000.bxtx.m123261a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011e, code lost:
        if (r2.f164950c == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0120, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0125, code lost:
        r5 = (p000.ayfc) r2.f164949b;
        r4.getClass();
        r5.f97450a |= 8;
        r5.f97454e = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0134, code lost:
        r4 = r14.f96647b.mo53710a();
        r5 = r4.keySet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0140, code lost:
        if (r2.f164950c != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0143, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0148, code lost:
        ((p000.ayfc) r2.f164949b).f97458i = p000.bxvk.m124030de();
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x015a, code lost:
        if (r5.hasNext() == false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015c, code lost:
        r6 = (java.lang.String) r5.next();
        r7 = p000.ayef.f97291e.mo74144da();
        r8 = p000.ayee.f97286c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x016c, code lost:
        if (r7.f164950c == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016e, code lost:
        r7.mo74035c();
        r7.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0173, code lost:
        r10 = (p000.ayef) r7.f164949b;
        r8.getClass();
        r10.f97295c = r8;
        r8 = r10.f97293a | 2;
        r10.f97293a = r8;
        r10.f97296d = 4;
        r8 = r8 | 4;
        r10.f97293a = r8;
        r6.getClass();
        r10.f97293a = r8 | 1;
        r10.f97294b = r6;
        r8 = p000.ayee.f97286c.mo74144da();
        r6 = ((p000.axuh) r4.get(r6)).f96387b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x019f, code lost:
        if (r8.f164950c != false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a2, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01a7, code lost:
        r10 = (p000.ayee) r8.f164949b;
        r6.getClass();
        r10.f97288a |= 8;
        r10.f97289b = r6;
        r6 = (p000.ayee) r8.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01be, code lost:
        if (r7.f164950c != false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01c1, code lost:
        r7.mo74035c();
        r7.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01c6, code lost:
        r8 = (p000.ayef) r7.f164949b;
        r6.getClass();
        r8.f97295c = r6;
        r8.f97293a |= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01d6, code lost:
        if (r2.f164950c != false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01d9, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01de, code lost:
        r6 = (p000.ayfc) r2.f164949b;
        r7 = (p000.ayef) r7.mo74062i();
        r7.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01f1, code lost:
        if (r6.f97458i.mo73666a() != false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01f3, code lost:
        r6.f97458i = p000.bxvk.m124021a(r6.f97458i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01fb, code lost:
        r6.f97458i.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0202, code lost:
        r4 = r14.f96653h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0206, code lost:
        if (r2.f164950c != false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0209, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x020e, code lost:
        r1 = (p000.ayfc) r2.f164949b;
        r1.f97450a |= 128;
        r1.f97459j = r4;
        r1 = (p000.ayfc) r2.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0222, code lost:
        if (r0.f164950c != false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0225, code lost:
        r0.mo74035c();
        r0.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x022a, code lost:
        r2 = (p000.ayev) r0.f164949b;
        r1.getClass();
        r2.f97385h = r1;
        r2.f97378a |= 64;
        r5 = (p000.ayev) r0.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r1 = r12.f96733e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0243, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r2 = r12.f96737i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0246, code lost:
        if (r2 != null) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0249, code lost:
        r2.mo53749a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x024c, code lost:
        r12.f96732d.mo53749a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0251, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r13.mo53700a(3, r14.f96647b.f96643e, r5, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0260, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0267, code lost:
        if (android.util.Log.isLoggable("datatransport", 3) != false) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0269, code lost:
        r14 = java.lang.String.valueOf(r12.f96730b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0275, code lost:
        if (r14.length() == 0) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0277, code lost:
        r14 = new java.lang.String("  exception while sending dataItem to peer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x027d, code lost:
        r14 = "  exception while sending dataItem to peer".concat(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0281, code lost:
        android.util.Log.d("datatransport", r14, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0286, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x028d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028e, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0295, code lost:
        if (android.util.Log.isLoggable("datatransport", 3) != false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0297, code lost:
        r14 = java.lang.String.valueOf(r12.f96730b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a3, code lost:
        if (r14.length() == 0) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a5, code lost:
        r14 = new java.lang.String("  exception while sending dataItem to peer=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ab, code lost:
        r14 = "  exception while sending dataItem to peer=".concat(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02af, code lost:
        android.util.Log.d("datatransport", r14, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b4, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo53754a(axyv axyv, axxi axxi) {
        if (m83539b()) {
            String str = this.f96730b;
            String valueOf = String.valueOf(axxi);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(valueOf).length());
            sb.append("sendDataItemToPeer: peer=");
            sb.append(str);
            sb.append(", ");
            sb.append(valueOf);
            Log.v("datatransport", sb.toString());
        }
        synchronized (this.f96733e) {
            axyv axyv2 = this.f96736h;
            if (axyv2 != null) {
                int b = axyv2.mo53701b();
            } else if (m83539b()) {
                Log.v("datatransport", "sendDataItemToPeer: no writer");
            }
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        String valueOf = String.valueOf(this.f96730b);
        ssb.println(valueOf.length() == 0 ? new String("connection to peer node: ") : "connection to peer node: ".concat(valueOf));
        synchronized (this.f96733e) {
            ssb.print("Total");
            this.f96732d.mo53750a(ssb);
            ssb.println();
            ssb.print("Current ");
            axxw axxw = this.f96737i;
            if (axxw == null) {
                ssb.print("[not connected]");
            } else {
                axxw.mo53750a(ssb);
            }
            ssb.println();
            ssb.println();
            int size = this.f96740l.size();
            for (int i = 0; i < size; i++) {
                ssb.print("Historic ");
                ((axxw) this.f96740l.get((size - i) - 1)).mo53750a(ssb);
                ssb.println();
            }
        }
    }
}
