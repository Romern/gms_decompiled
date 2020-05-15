package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: alt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alt implements ang, amw {

    /* renamed from: a */
    final Context f849a;

    /* renamed from: b */
    final ArrayList f850b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f851c = new ArrayList();

    /* renamed from: d */
    public final Map f852d = new HashMap();

    /* renamed from: e */
    public final ArrayList f853e = new ArrayList();

    /* renamed from: f */
    final amy f854f = new amy();

    /* renamed from: g */
    final alq f855g = new alq(this);

    /* renamed from: h */
    final anh f856h;

    /* renamed from: i */
    public amx f857i;

    /* renamed from: j */
    alv f858j;

    /* renamed from: k */
    aky f859k;

    /* renamed from: l */
    public final Map f860l = new HashMap();

    /* renamed from: m */
    aku f861m = new alp(this);

    /* renamed from: n */
    private final ArrayList f862n = new ArrayList();

    /* renamed from: o */
    private final alr f863o = new alr(this);

    /* renamed from: p */
    private final boolean f864p;

    /* renamed from: q */
    private alv f865q;

    /* renamed from: r */
    private alv f866r;

    /* renamed from: s */
    private akp f867s;

    public alt(Context context) {
        this.f849a = context;
        synchronized (C1175lv.f26666a) {
            if (((C1175lv) C1175lv.f26666a.get(context)) == null) {
                C1175lv.f26666a.put(context, new C1175lv());
            }
        }
        int i = Build.VERSION.SDK_INT;
        this.f864p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i2 = Build.VERSION.SDK_INT;
        this.f856h = new amz(context, this);
    }

    /* renamed from: a */
    private final int m1028a(alv alv, ako ako) {
        int a = alv.mo996a(ako);
        if (a != 0) {
            if ((a & 1) != 0) {
                this.f855g.mo983a(259, alv);
            }
            if ((a & 2) != 0) {
                this.f855g.mo983a(260, alv);
            }
            if ((a & 4) != 0) {
                this.f855g.mo983a(261, alv);
            }
        }
        return a;
    }

    /* renamed from: c */
    private final void m1031c() {
        alv alv = this.f858j;
        if (alv != null) {
            amy amy = this.f854f;
            amy.f954a = alv.f881j;
            amy.f955b = alv.f882k;
            amy.f956c = alv.f880i;
            amy.f957d = alv.f879h;
            amy.f958e = alv.f878g;
            if (this.f862n.size() > 0) {
                als als = (als) this.f862n.get(0);
                throw null;
            }
        }
    }

    /* renamed from: b */
    public final alu mo990b(akz akz) {
        int size = this.f853e.size();
        for (int i = 0; i < size; i++) {
            if (((alu) this.f853e.get(i)).f868a == akz) {
                return (alu) this.f853e.get(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo991b() {
        boolean z;
        alk alk = new alk();
        int size = this.f850b.size();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            size--;
            z = true;
            if (size < 0) {
                break;
            }
            alw alw = (alw) ((WeakReference) this.f850b.get(size)).get();
            if (alw == null) {
                this.f850b.remove(size);
            } else {
                int size2 = alw.f895c.size();
                for (int i = 0; i < size2; i++) {
                    aln aln = (aln) alw.f895c.get(i);
                    alk.mo972a(aln.f843c);
                    int i2 = aln.f844d;
                    boolean z4 = i2 & true;
                    z3 |= z4;
                    z2 |= z4;
                    if ((i2 & 4) != 0 && !this.f864p) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        z2 = true;
                    }
                }
            }
        }
        all a = !z2 ? all.f838c : alk.mo971a();
        akp akp = this.f867s;
        if (akp == null || !akp.mo919a().equals(a) || this.f867s.mo920b() != z3) {
            if (!a.mo976c() || z3) {
                if (!z3) {
                    z = false;
                }
                this.f867s = new akp(a, z);
            } else if (this.f867s != null) {
                this.f867s = null;
            } else {
                return;
            }
            if (z2 && !z3 && this.f864p) {
                Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
            }
            int size3 = this.f853e.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ((alu) this.f853e.get(i3)).f868a.mo947a(this.f867s);
            }
        }
    }

    /* renamed from: a */
    private final int m1029a(String str) {
        int size = this.f851c.size();
        for (int i = 0; i < size; i++) {
            if (((alv) this.f851c.get(i)).f874c.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private final boolean m1030a(alv alv) {
        return alv.mo1003e() == this.f856h && alv.mo999a("android.media.intent.category.LIVE_AUDIO") && !alv.mo999a("android.media.intent.category.LIVE_VIDEO");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final alv mo985a() {
        alv alv = this.f858j;
        if (alv != null) {
            return alv;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    /* renamed from: a */
    public final void mo986a(akz akz) {
        if (mo990b(akz) == null) {
            alu alu = new alu(akz);
            this.f853e.add(alu);
            this.f855g.mo983a(513, alu);
            mo987a(alu, akz.f808g);
            akz.mo948a(this.f863o);
            akz.mo947a(this.f867s);
        }
    }

    /* renamed from: a */
    public final void mo987a(alu alu, alb alb) {
        boolean z;
        Iterator it;
        int i;
        String format;
        alu alu2 = alu;
        alb alb2 = alb;
        if (alu2.f870c != alb2) {
            alu2.f870c = alb2;
            int i2 = 0;
            if (alb2 != null && (alb.mo955a() || alb2 == this.f856h.f808g)) {
                List list = alb2.f815b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                z = false;
                int i3 = 0;
                while (it2.hasNext()) {
                    ako ako = (ako) it2.next();
                    if (ako == null || !ako.mo918v()) {
                        Log.w("MediaRouter", "Ignoring invalid system route descriptor: " + ako);
                        it2 = it2;
                        i2 = 0;
                    } else {
                        String a = ako.mo896a();
                        int size = alu2.f869b.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                if (((alv) alu2.f869b.get(i4)).f873b.equals(a)) {
                                    break;
                                }
                                i4++;
                            } else {
                                i4 = -1;
                                break;
                            }
                        }
                        if (i4 < 0) {
                            String flattenToShortString = alu.mo994b().flattenToShortString();
                            String str = flattenToShortString + ":" + a;
                            if (m1029a(str) < 0) {
                                this.f852d.put(new C1240of(flattenToShortString, a), str);
                                it = it2;
                            } else {
                                Log.w("MediaRouter", "Either " + a + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
                                int i5 = 2;
                                while (true) {
                                    Locale locale = Locale.US;
                                    it = it2;
                                    Object[] objArr = new Object[2];
                                    objArr[i2] = str;
                                    objArr[1] = Integer.valueOf(i5);
                                    format = String.format(locale, "%s_%d", objArr);
                                    if (m1029a(format) < 0) {
                                        break;
                                    }
                                    i5++;
                                    it2 = it;
                                    i2 = 0;
                                }
                                this.f852d.put(new C1240of(flattenToShortString, a), format);
                                str = format;
                            }
                            alv alv = new alv(alu2, a, str);
                            i = i3 + 1;
                            alu2.f869b.add(i3, alv);
                            this.f851c.add(alv);
                            if (ako.mo897b().size() > 0) {
                                arrayList.add(new C1240of(alv, ako));
                            } else {
                                alv.mo996a(ako);
                                this.f855g.mo983a(257, alv);
                            }
                        } else {
                            it = it2;
                            if (i4 < i3) {
                                Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + ako);
                            } else {
                                alv alv2 = (alv) alu2.f869b.get(i4);
                                i = i3 + 1;
                                Collections.swap(alu2.f869b, i4, i3);
                                if (ako.mo897b().size() > 0) {
                                    arrayList2.add(new C1240of(alv2, ako));
                                } else if (m1028a(alv2, ako) != 0 && alv2 == this.f858j) {
                                    i3 = i;
                                    z = true;
                                }
                            }
                            it2 = it;
                            i2 = 0;
                        }
                        i3 = i;
                        it2 = it;
                        i2 = 0;
                    }
                }
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    C1240of ofVar = (C1240of) arrayList.get(i6);
                    alv alv3 = (alv) ofVar.f26798a;
                    alv3.mo996a((ako) ofVar.f26799b);
                    this.f855g.mo983a(257, alv3);
                }
                int size3 = arrayList2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    C1240of ofVar2 = (C1240of) arrayList2.get(i7);
                    alv alv4 = (alv) ofVar2.f26798a;
                    if (m1028a(alv4, (ako) ofVar2.f26799b) != 0 && alv4 == this.f858j) {
                        z = true;
                    }
                }
                i2 = i3;
            } else {
                Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + alb2);
                z = false;
            }
            for (int size4 = alu2.f869b.size() - 1; size4 >= i2; size4--) {
                alv alv5 = (alv) alu2.f869b.get(size4);
                alv5.mo996a((ako) null);
                this.f851c.remove(alv5);
            }
            mo989a(z);
            for (int size5 = alu2.f869b.size() - 1; size5 >= i2; size5--) {
                this.f855g.mo983a(258, (alv) alu2.f869b.remove(size5));
            }
            this.f855g.mo983a(515, alu2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 == r6) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0178 A[RETURN] */
    /* renamed from: a */
    public final void mo988a(alv alv, int i) {
        alv alv2;
        if (alw.f893a != null) {
            if (this.f866r != null) {
                alw.m1051a();
                alv alv3 = alw.f893a.f865q;
                if (alv3 == null) {
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
            }
            alv2 = this.f858j;
            if (alv2 == alv) {
                if (alv2 != null) {
                    Message obtainMessage = this.f855g.obtainMessage(263, alv2);
                    obtainMessage.arg1 = i;
                    obtainMessage.sendToTarget();
                    aky aky = this.f859k;
                    if (aky != null) {
                        aky.mo938a(i);
                        this.f859k.mo941c();
                        this.f859k = null;
                    }
                    if (!this.f860l.isEmpty()) {
                        for (aky aky2 : this.f860l.values()) {
                            aky2.mo938a(i);
                            aky2.mo941c();
                        }
                        this.f860l.clear();
                    }
                }
                alb alb = alv.f872a.f870c;
                if (alb != null && alb.f816c) {
                    akv b = alv.mo1003e().mo950b(alv.f873b);
                    b.mo932a(C1133kh.m17846d(this.f849a), this.f861m);
                    this.f859k = b;
                    this.f858j = alv;
                } else {
                    this.f859k = alv.mo1003e().mo945a(alv.f873b);
                    this.f858j = alv;
                }
                aky aky3 = this.f859k;
                if (aky3 != null) {
                    aky3.mo943d();
                }
                this.f855g.mo983a(262, this.f858j);
                if (this.f858j.mo1001c()) {
                    List<alv> d = this.f858j.mo1002d();
                    this.f860l.clear();
                    for (alv alv4 : d) {
                        aky a = alv4.mo1003e().mo946a(alv4.f873b, this.f858j.f873b);
                        a.mo943d();
                        this.f860l.put(alv4.f874c, a);
                    }
                }
                m1031c();
                return;
            }
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 3; i2 < stackTrace.length; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            sb.append(stackTraceElement.getClassName());
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("  ");
        }
        if (alw.f893a == null) {
            Log.w("MediaRouter", "setSelectedRouteInternal is called while sGlobal is null: pkgName=" + this.f849a.getPackageName() + ", callers=" + sb.toString());
        } else {
            Log.w("MediaRouter", "Default route is selected while a BT route is available: pkgName=" + this.f849a.getPackageName() + ", callers=" + sb.toString());
        }
        alv2 = this.f858j;
        if (alv2 == alv) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo989a(boolean z) {
        alv alv;
        alv alv2 = this.f865q;
        if (alv2 != null && !alv2.mo997a()) {
            Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: " + this.f865q);
            this.f865q = null;
        }
        if (this.f865q == null && !this.f851c.isEmpty()) {
            ArrayList arrayList = this.f851c;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                alv alv3 = (alv) arrayList.get(i);
                if (alv3.mo1003e() == this.f856h && alv3.f873b.equals("DEFAULT_ROUTE") && alv3.mo997a()) {
                    this.f865q = alv3;
                    Log.i("MediaRouter", "Found default route: " + this.f865q);
                    break;
                }
                i++;
            }
        }
        alv alv4 = this.f866r;
        if (alv4 != null && !alv4.mo997a()) {
            Log.i("MediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f866r);
            this.f866r = null;
        }
        if (this.f866r == null && !this.f851c.isEmpty()) {
            ArrayList arrayList2 = this.f851c;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                alv alv5 = (alv) arrayList2.get(i2);
                if (m1030a(alv5) && alv5.mo997a()) {
                    this.f866r = alv5;
                    Log.i("MediaRouter", "Found bluetooth route: " + this.f866r);
                    break;
                }
                i2++;
            }
        }
        alv alv6 = this.f858j;
        if (alv6 == null || !alv6.f877f) {
            Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: " + this.f858j);
            ArrayList arrayList3 = this.f851c;
            int size3 = arrayList3.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size3) {
                    alv = this.f865q;
                    break;
                }
                alv = (alv) arrayList3.get(i3);
                if (alv != this.f865q && m1030a(alv) && alv.mo997a()) {
                    break;
                }
                i3++;
            }
            mo988a(alv, 0);
        } else if (z) {
            if (alv6.mo1001c()) {
                List<alv> d = this.f858j.mo1002d();
                HashSet hashSet = new HashSet();
                for (alv alv7 : d) {
                    hashSet.add(alv7.f874c);
                }
                Iterator it = this.f860l.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        aky aky = (aky) entry.getValue();
                        aky.mo944e();
                        aky.mo941c();
                        it.remove();
                    }
                }
                for (alv alv8 : d) {
                    if (!this.f860l.containsKey(alv8.f874c)) {
                        aky a = alv8.mo1003e().mo946a(alv8.f873b, this.f858j.f873b);
                        a.mo943d();
                        this.f860l.put(alv8.f874c, a);
                    }
                }
            }
            m1031c();
        }
    }
}
