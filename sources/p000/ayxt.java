package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ayxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayxt {

    /* renamed from: a */
    public final Set f98702a = new HashSet();

    /* renamed from: b */
    public final Set f98703b = new HashSet();

    /* renamed from: c */
    public final List f98704c = new ArrayList();

    /* renamed from: d */
    public final List f98705d = new ArrayList();

    /* renamed from: e */
    public final Map f98706e = new HashMap();

    /* renamed from: f */
    public Collection f98707f = null;

    /* renamed from: g */
    public boolean f98708g = false;

    /* renamed from: h */
    private final Map f98709h = new HashMap();

    /* renamed from: b */
    private final ayxs m85050b(aywp aywp) {
        ayxs ayxs = new ayxs(this.f98704c.size(), this.f98702a.size());
        aywu a = ayxs.mo54519a(aywp, -1);
        ArrayList arrayList = new ArrayList(1);
        ayxk.m85037a(aywp, arrayList);
        bptu bptu = a.f98654c;
        if (bptu == null) {
            bptu = bptu.f139179e;
        }
        ayxs.mo54520a(new ayye(1, arrayList, bptu.f139182b));
        this.f98704c.add(ayxs);
        this.f98709h.put(a, ayxs);
        return ayxs;
    }

    /* renamed from: a */
    public final ayxs mo54521a(aywp aywp) {
        boolean z;
        View view;
        int i = aywp.f98638c;
        if (i == -1) {
            bmxy.m108600b(aywp.mo54485b());
            this.f98705d.add(aywp);
            ayxi ayxi = aywp.f98637b;
            if (ayxi.mo54491a()) {
                return m85050b(aywp);
            }
            aywp aywp2 = (aywp) ayxi.mo54498h();
            if (aywp2 == null) {
                aywu a = aywp.mo54483a();
                bxvj bxvj = azag.f98830a;
                Map map = GeneratedMessageLite.f164959aj;
                a.mo74135a(bxvj);
                if (a.f164952m.mo73911a(bxvj.f164958d)) {
                    return m85050b(aywp);
                }
                int i2 = ayww.f98658j;
                ayxi ayxi2 = aywp.f98637b;
                if (ayxi2 instanceof ayww) {
                    view = ((ayww) ayxi2).f98659a;
                } else {
                    view = null;
                }
                while (true) {
                    if (view != null) {
                        if (ayww.m85002b(view)) {
                            String valueOf = String.valueOf(aywp);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 180);
                            sb.append("Unexpected visual element (");
                            sb.append(valueOf);
                            sb.append(") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/impressions#requirements.");
                            Log.e("GIL", sb.toString());
                            break;
                        }
                        ViewParent parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        break;
                    }
                }
                aywp.f98638c = -2;
                return null;
            } else if (aywp2.f98638c == -1 && aywp2.mo54486c()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(null);
                ayxk.m85037a(aywp2, arrayList);
                if (arrayList.size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108600b(z);
                ayxs a2 = mo54522a(arrayList, this.f98702a.size());
                aywu a3 = a2.mo54519a(aywp, -1);
                arrayList.set(0, a3);
                bptu bptu = a3.f98654c;
                if (bptu == null) {
                    bptu = bptu.f139179e;
                }
                a2.mo54520a(new ayye(1, arrayList, bptu.f139182b));
                return a2;
            } else {
                ayxs a4 = mo54521a(aywp2);
                if (a4 == null) {
                    return null;
                }
                bptu bptu2 = ((aywu) aywp2.f98639e.f164949b).f98654c;
                if (bptu2 == null) {
                    bptu2 = bptu.f139179e;
                }
                a4.mo54519a(aywp, bptu2.f139182b);
                return a4;
            }
        } else if (i != -2) {
            return (ayxs) this.f98704c.get(i);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final ayxs mo54522a(List list, int i) {
        aywu aywu = (aywu) bnjd.m109595d(list);
        ayxs ayxs = (ayxs) this.f98709h.get(aywu);
        if (ayxs != null) {
            return ayxs;
        }
        ayxs ayxs2 = new ayxs(this.f98704c.size(), i);
        this.f98704c.add(ayxs2);
        this.f98709h.put(aywu, ayxs2);
        return ayxs2;
    }

    /* renamed from: a */
    public final List mo54523a() {
        bljb a = blkh.m107281a("GIL:LogBatch");
        try {
            ArrayList arrayList = new ArrayList(this.f98704c.size());
            for (ayxs ayxs : this.f98704c) {
                arrayList.add(new ayyf(ayxs.f98695a, ayxs.f98696b, ayxs.f98697c, ayxs.f98698d, ayxs.f98699e, ayxs.f98700f));
            }
            this.f98704c.clear();
            this.f98709h.clear();
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final boolean mo54524a(aywp aywp, int i) {
        if (this.f98702a.contains(aywp)) {
            return false;
        }
        int a = bpca.m111766a(((aywu) aywp.f98639e.f164949b).f98655d);
        if (a == 0) {
            a = 1;
        }
        if (a == i) {
            this.f98703b.remove(aywp);
            return false;
        }
        this.f98703b.add(aywp);
        return true;
    }
}
