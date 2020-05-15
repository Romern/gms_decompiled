package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: atf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class atf implements Cloneable {

    /* renamed from: u */
    private static final int[] f2166u = {2, 1, 3, 4};

    /* renamed from: v */
    private static final asv f2167v = new asv();

    /* renamed from: y */
    private static final ThreadLocal f2168y = new ThreadLocal();

    /* renamed from: A */
    private boolean f2169A = false;

    /* renamed from: B */
    private boolean f2170B = false;

    /* renamed from: C */
    private ArrayList f2171C = null;

    /* renamed from: D */
    private ArrayList f2172D = new ArrayList();

    /* renamed from: a */
    public long f2173a = -1;

    /* renamed from: b */
    public long f2174b = -1;

    /* renamed from: c */
    public TimeInterpolator f2175c = null;

    /* renamed from: d */
    final ArrayList f2176d = new ArrayList();

    /* renamed from: e */
    final ArrayList f2177e = new ArrayList();

    /* renamed from: f */
    public ArrayList f2178f = null;

    /* renamed from: g */
    public ArrayList f2179g = null;

    /* renamed from: h */
    public ArrayList f2180h = null;

    /* renamed from: i */
    public ArrayList f2181i = null;

    /* renamed from: j */
    public ArrayList f2182j = null;

    /* renamed from: k */
    public atr f2183k = new atr();

    /* renamed from: l */
    public atr f2184l = new atr();

    /* renamed from: m */
    atn f2185m = null;

    /* renamed from: n */
    public int[] f2186n = f2166u;

    /* renamed from: o */
    public ArrayList f2187o;

    /* renamed from: p */
    public ArrayList f2188p;

    /* renamed from: q */
    final ArrayList f2189q = new ArrayList();

    /* renamed from: r */
    atk f2190r;

    /* renamed from: s */
    public atd f2191s;

    /* renamed from: t */
    public asv f2192t = f2167v;

    /* renamed from: w */
    private final String f2193w = getClass().getName();

    /* renamed from: x */
    private ArrayList f2194x = null;

    /* renamed from: z */
    private int f2195z = 0;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.a(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      ps.a(android.view.View, qh):qh
      ps.a(int, android.view.View):void
      ps.a(android.view.View, float):void
      ps.a(android.view.View, android.content.res.ColorStateList):void
      ps.a(android.view.View, android.graphics.PorterDuff$Mode):void
      ps.a(android.view.View, android.graphics.Rect):void
      ps.a(android.view.View, android.graphics.drawable.Drawable):void
      ps.a(android.view.View, java.lang.Runnable):void
      ps.a(android.view.View, java.lang.String):void
      ps.a(android.view.View, oq):void
      ps.a(android.view.View, pi):void
      ps.a(android.view.View, pk):void
      ps.a(android.view.View, qm):void
      ps.a(android.view.View, int):boolean
      ps.a(android.view.View, boolean):void */
    /* renamed from: a */
    private static void m2009a(atr atr, View view, atq atq) {
        atr.f2218a.put(view, atq);
        int id = view.getId();
        if (id >= 0) {
            if (atr.f2219b.indexOfKey(id) >= 0) {
                atr.f2219b.put(id, null);
            } else {
                atr.f2219b.put(id, view);
            }
        }
        String q = C1280ps.m19935q(view);
        if (q != null) {
            if (atr.f2221d.containsKey(q)) {
                atr.f2221d.put(q, null);
            } else {
                atr.f2221d.put(q, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (atr.f2220c.mo15541c(itemIdAtPosition) >= 0) {
                    View view2 = (View) atr.f2220c.mo15534a(itemIdAtPosition);
                    if (view2 != null) {
                        C1280ps.m19900a(view2, false);
                        atr.f2220c.mo15540b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C1280ps.m19900a(view, true);
                atr.f2220c.mo15540b(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: c */
    public static C1223np m2011c() {
        C1223np npVar = (C1223np) f2168y.get();
        if (npVar != null) {
            return npVar;
        }
        C1223np npVar2 = new C1223np();
        f2168y.set(npVar2);
        return npVar2;
    }

    /* renamed from: a */
    public Animator mo2376a(ViewGroup viewGroup, atq atq, atq atq2) {
        return null;
    }

    /* renamed from: a */
    public void mo2457a(long j) {
        this.f2174b = j;
    }

    /* renamed from: a */
    public void mo2458a(TimeInterpolator timeInterpolator) {
        this.f2175c = timeInterpolator;
    }

    /* renamed from: a */
    public void mo2461a(asv asv) {
        if (asv == null) {
            this.f2192t = f2167v;
        } else {
            this.f2192t = asv;
        }
    }

    /* renamed from: a */
    public void mo2462a(atd atd) {
        this.f2191s = atd;
    }

    /* renamed from: a */
    public void mo2464a(atk atk) {
        this.f2190r = atk;
    }

    /* renamed from: a */
    public abstract void mo2377a(atq atq);

    /* renamed from: a */
    public String[] mo2378a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final atq mo2470b(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        atn atn = this.f2185m;
        if (atn != null) {
            return atn.mo2470b(view, z);
        }
        if (!z) {
            arrayList = this.f2188p;
        } else {
            arrayList = this.f2187o;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            atq atq = (atq) arrayList.get(i);
            if (atq != null) {
                if (atq.f2216b == view) {
                    break;
                }
                i++;
            } else {
                return null;
            }
        }
        if (i < 0) {
            return null;
        }
        if (!z) {
            arrayList2 = this.f2187o;
        } else {
            arrayList2 = this.f2188p;
        }
        return (atq) arrayList2.get(i);
    }

    /* renamed from: b */
    public void mo2471b(long j) {
        this.f2173a = j;
    }

    /* renamed from: b */
    public abstract void mo2379b(atq atq);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2477d() {
        mo2479e();
        C1223np c = m2011c();
        ArrayList arrayList = this.f2172D;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (c.containsKey(animator)) {
                mo2479e();
                if (animator != null) {
                    animator.addListener(new asz(this, c));
                    long j = this.f2174b;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f2173a;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.f2175c;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new ata(this));
                    animator.start();
                }
            }
        }
        this.f2172D.clear();
        mo2481f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo2479e() {
        if (this.f2195z == 0) {
            ArrayList arrayList = this.f2171C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2171C.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((ate) arrayList2.get(i)).mo2388b(this);
                }
            }
            this.f2170B = false;
        }
        this.f2195z++;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.a(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      ps.a(android.view.View, qh):qh
      ps.a(int, android.view.View):void
      ps.a(android.view.View, float):void
      ps.a(android.view.View, android.content.res.ColorStateList):void
      ps.a(android.view.View, android.graphics.PorterDuff$Mode):void
      ps.a(android.view.View, android.graphics.Rect):void
      ps.a(android.view.View, android.graphics.drawable.Drawable):void
      ps.a(android.view.View, java.lang.Runnable):void
      ps.a(android.view.View, java.lang.String):void
      ps.a(android.view.View, oq):void
      ps.a(android.view.View, pi):void
      ps.a(android.view.View, pk):void
      ps.a(android.view.View, qm):void
      ps.a(android.view.View, int):boolean
      ps.a(android.view.View, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo2481f() {
        int i;
        int i2 = this.f2195z - 1;
        this.f2195z = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.f2171C;
            if (arrayList == null || arrayList.size() <= 0) {
                i = 0;
            } else {
                ArrayList arrayList2 = (ArrayList) this.f2171C.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((ate) arrayList2.get(i3)).mo2372a(this);
                }
                i = 0;
            }
            while (i < this.f2183k.f2220c.mo15537b()) {
                View view = (View) this.f2183k.f2220c.mo15538b(i);
                if (view != null) {
                    C1280ps.m19900a(view, false);
                }
                i++;
            }
            for (int i4 = 0; i4 < this.f2184l.f2220c.mo15537b(); i4++) {
                View view2 = (View) this.f2184l.f2220c.mo15538b(i4);
                if (view2 != null) {
                    C1280ps.m19900a(view2, false);
                }
            }
            this.f2170B = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2482g() {
        for (int size = this.f2189q.size() - 1; size >= 0; size--) {
            ((Animator) this.f2189q.get(size)).cancel();
        }
        ArrayList arrayList = this.f2171C;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f2171C.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((ate) arrayList2.get(i)).mo2371a();
            }
        }
    }

    /* renamed from: h */
    public atf clone() {
        try {
            atf atf = (atf) super.clone();
            atf.f2172D = new ArrayList();
            atf.f2183k = new atr();
            atf.f2184l = new atr();
            atf.f2187o = null;
            atf.f2188p = null;
            return atf;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public final String toString() {
        return mo2456a("");
    }

    /* renamed from: c */
    private final void m2012c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList arrayList = this.f2179g;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList arrayList2 = this.f2180h;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList arrayList3 = this.f2194x;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!((Class) this.f2194x.get(i)).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        atq atq = new atq(view);
                        if (z) {
                            mo2377a(atq);
                        } else {
                            mo2379b(atq);
                        }
                        atq.f2217c.add(this);
                        mo2475c(atq);
                        if (z) {
                            m2009a(this.f2183k, view, atq);
                        } else {
                            m2009a(this.f2184l, view, atq);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList arrayList4 = this.f2182j;
                        if (arrayList4 != null) {
                            int size2 = arrayList4.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                if (!((Class) this.f2182j.get(i2)).isInstance(view)) {
                                    i2++;
                                } else {
                                    return;
                                }
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            m2012c(viewGroup.getChildAt(i3), z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void mo2480e(View view) {
        this.f2177e.remove(view);
    }

    /* renamed from: b */
    public void mo2472b(View view) {
        if (!this.f2170B) {
            C1223np c = m2011c();
            int i = c.f26809h;
            aue b = aty.m2103b(view);
            for (int i2 = i - 1; i2 >= 0; i2--) {
                atb atb = (atb) c.mo15621c(i2);
                if (atb.f2161a != null && b.equals(atb.f2165e)) {
                    int i3 = Build.VERSION.SDK_INT;
                    ((Animator) c.mo15620b(i2)).pause();
                }
            }
            ArrayList arrayList = this.f2171C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2171C.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((ate) arrayList2.get(i4)).mo2373b();
                }
            }
            this.f2169A = true;
        }
    }

    /* renamed from: d */
    public void mo2478d(View view) {
        this.f2177e.add(view);
    }

    /* renamed from: a */
    private static boolean m2010a(atq atq, atq atq2, String str) {
        Object obj = atq.f2215a.get(str);
        Object obj2 = atq2.f2215a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        return obj == null || obj2 == null || !obj.equals(obj2);
    }

    /* renamed from: b */
    public final void mo2473b(ate ate) {
        ArrayList arrayList = this.f2171C;
        if (arrayList != null) {
            arrayList.remove(ate);
            if (this.f2171C.size() == 0) {
                this.f2171C = null;
            }
        }
    }

    /* renamed from: a */
    public final atq mo2455a(View view, boolean z) {
        atr atr;
        atn atn = this.f2185m;
        if (atn != null) {
            return atn.mo2455a(view, z);
        }
        if (!z) {
            atr = this.f2184l;
        } else {
            atr = this.f2183k;
        }
        return (atq) atr.f2218a.get(view);
    }

    /* renamed from: c */
    public void mo2474c(View view) {
        if (this.f2169A) {
            if (!this.f2170B) {
                C1223np c = m2011c();
                int i = c.f26809h;
                aue b = aty.m2103b(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    atb atb = (atb) c.mo15621c(i2);
                    if (atb.f2161a != null && b.equals(atb.f2165e)) {
                        int i3 = Build.VERSION.SDK_INT;
                        ((Animator) c.mo15620b(i2)).resume();
                    }
                }
                ArrayList arrayList = this.f2171C;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f2171C.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((ate) arrayList2.get(i4)).mo2374c();
                    }
                }
            }
            this.f2169A = false;
        }
    }

    /* renamed from: a */
    public String mo2456a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f2174b != -1) {
            str2 = str2 + "dur(" + this.f2174b + ") ";
        }
        if (this.f2173a != -1) {
            str2 = str2 + "dly(" + this.f2173a + ") ";
        }
        if (this.f2175c != null) {
            str2 = str2 + "interp(" + this.f2175c + ") ";
        }
        if (this.f2176d.size() <= 0 && this.f2177e.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f2176d.size() > 0) {
            for (int i = 0; i < this.f2176d.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f2176d.get(i);
            }
        }
        if (this.f2177e.size() > 0) {
            for (int i2 = 0; i2 < this.f2177e.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f2177e.get(i2);
            }
        }
        return str3 + ")";
    }

    /* renamed from: c */
    public void mo2475c(atq atq) {
        String[] strArr;
        if (this.f2190r != null && !atq.f2215a.isEmpty()) {
            for (String str : aud.f2255a) {
                if (!atq.f2215a.containsKey(str)) {
                    View view = atq.f2216b;
                    Integer num = (Integer) atq.f2215a.get("android:visibility:visibility");
                    if (num == null) {
                        num = Integer.valueOf(view.getVisibility());
                    }
                    atq.f2215a.put("android:visibilityPropagation:visibility", num);
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int round = iArr[0] + Math.round(view.getTranslationX());
                    iArr[0] = round;
                    iArr[0] = round + (view.getWidth() / 2);
                    int round2 = iArr[1] + Math.round(view.getTranslationY());
                    iArr[1] = round2;
                    iArr[1] = round2 + (view.getHeight() / 2);
                    atq.f2215a.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2459a(ViewGroup viewGroup, atr atr, atr atr2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        C1223np npVar;
        View view;
        Animator animator;
        atq atq;
        C1223np npVar2;
        long j;
        long j2;
        Rect rect;
        int i3;
        int i4;
        int i5;
        int i6;
        atq atq2;
        ViewGroup viewGroup2 = viewGroup;
        C1223np c = m2011c();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j3 = Long.MAX_VALUE;
        int i7 = 0;
        while (i7 < size) {
            atq atq3 = (atq) arrayList.get(i7);
            atq atq4 = (atq) arrayList2.get(i7);
            if (atq3 != null && !atq3.f2217c.contains(this)) {
                atq3 = null;
            }
            if (atq4 != null && !atq4.f2217c.contains(this)) {
                atq4 = null;
            }
            if (atq3 == null && atq4 == null) {
                npVar = c;
                i2 = size;
                i = i7;
            } else if (atq3 == null || atq4 == null || mo2469a(atq3, atq4)) {
                Animator a = mo2376a(viewGroup2, atq3, atq4);
                if (a == null) {
                    npVar = c;
                    i2 = size;
                    i = i7;
                } else {
                    if (atq4 == null) {
                        view = atq3.f2216b;
                        i2 = size;
                        animator = a;
                        atq = null;
                    } else {
                        view = atq4.f2216b;
                        String[] a2 = mo2378a();
                        if (a2 == null) {
                            i2 = size;
                            atq2 = null;
                        } else if (a2.length > 0) {
                            atq2 = new atq(view);
                            Animator animator2 = a;
                            i2 = size;
                            atq atq5 = (atq) atr2.f2218a.get(view);
                            if (atq5 != null) {
                                int i8 = 0;
                                while (i8 < a2.length) {
                                    Map map = atq2.f2215a;
                                    String str = a2[i8];
                                    map.put(str, atq5.f2215a.get(str));
                                    i8++;
                                    a2 = a2;
                                }
                            }
                            int i9 = c.f26809h;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= i9) {
                                    a = animator2;
                                    break;
                                }
                                atb atb = (atb) c.get((Animator) c.mo15620b(i10));
                                if (atb.f2163c != null && atb.f2161a == view && atb.f2162b.equals(this.f2193w) && atb.f2163c.equals(atq2)) {
                                    a = null;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            i2 = size;
                            atq2 = null;
                        }
                        animator = a;
                        atq = atq2;
                    }
                    if (animator != null) {
                        atk atk = this.f2190r;
                        if (atk != null) {
                            if (atq3 == null && atq4 == null) {
                                npVar2 = c;
                                i = i7;
                                j2 = 0;
                            } else {
                                atd atd = this.f2191s;
                                if (atd != null) {
                                    rect = atd.mo2387a();
                                } else {
                                    rect = null;
                                }
                                if (atq4 == null) {
                                    i3 = -1;
                                } else {
                                    if (atq3 != null) {
                                        Integer num = (Integer) atq3.f2215a.get("android:visibilityPropagation:visibility");
                                        if (num == null) {
                                            atq3 = atq4;
                                            i3 = 1;
                                        } else if (num.intValue() == 0) {
                                            i3 = -1;
                                        }
                                    }
                                    atq3 = atq4;
                                    i3 = 1;
                                }
                                int a3 = aud.m2128a(atq3, 0);
                                int a4 = aud.m2128a(atq3, 1);
                                i = i7;
                                int[] iArr = new int[2];
                                viewGroup2.getLocationOnScreen(iArr);
                                int round = iArr[0] + Math.round(viewGroup.getTranslationX());
                                int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
                                int width = round + viewGroup.getWidth();
                                int height = round2 + viewGroup.getHeight();
                                if (rect == null) {
                                    i5 = (round + width) / 2;
                                    i4 = (round2 + height) / 2;
                                } else {
                                    int centerX = rect.centerX();
                                    i4 = rect.centerY();
                                    i5 = centerX;
                                }
                                aud aud = (aud) atk;
                                int i11 = aud.f2257c;
                                npVar2 = c;
                                float abs = (float) (i11 != 3 ? i11 != 5 ? i11 != 48 ? i11 != 80 ? 0 : (a4 - round2) + Math.abs(i5 - a3) : (height - a4) + Math.abs(i5 - a3) : Math.abs(i4 - a4) + (a3 - round) : (width - a3) + Math.abs(i4 - a4));
                                int i12 = aud.f2257c;
                                if (i12 == 3 || i12 == 5) {
                                    i6 = viewGroup.getWidth();
                                } else {
                                    i6 = viewGroup.getHeight();
                                }
                                float f = abs / ((float) i6);
                                long j4 = this.f2174b;
                                if (j4 < 0) {
                                    j4 = 300;
                                }
                                j2 = (long) Math.round((((float) (j4 * ((long) i3))) / aud.f2256b) * f);
                            }
                            sparseIntArray.put(this.f2172D.size(), (int) j2);
                            j = Math.min(j2, j3);
                        } else {
                            npVar2 = c;
                            i = i7;
                            j = j3;
                        }
                        npVar = npVar2;
                        npVar.put(animator, new atb(view, this.f2193w, this, aty.m2103b(viewGroup), atq));
                        this.f2172D.add(animator);
                        j3 = j;
                    } else {
                        npVar = c;
                        i = i7;
                    }
                }
            } else {
                npVar = c;
                i2 = size;
                i = i7;
            }
            i7 = i + 1;
            viewGroup2 = viewGroup;
            c = npVar;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                Animator animator3 = (Animator) this.f2172D.get(sparseIntArray.keyAt(i13));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i13)) - j3) + animator3.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2460a(ViewGroup viewGroup, boolean z) {
        int i;
        mo2466a(z);
        if (this.f2176d.size() > 0 || this.f2177e.size() > 0) {
            ArrayList arrayList = this.f2178f;
            if (arrayList == null) {
                i = 0;
            } else if (arrayList.isEmpty()) {
                i = 0;
            }
            while (i < this.f2176d.size()) {
                View findViewById = viewGroup.findViewById(((Integer) this.f2176d.get(i)).intValue());
                if (findViewById != null) {
                    atq atq = new atq(findViewById);
                    if (z) {
                        mo2377a(atq);
                    } else {
                        mo2379b(atq);
                    }
                    atq.f2217c.add(this);
                    mo2475c(atq);
                    if (z) {
                        m2009a(this.f2183k, findViewById, atq);
                    } else {
                        m2009a(this.f2184l, findViewById, atq);
                    }
                }
                i++;
            }
            for (int i2 = 0; i2 < this.f2177e.size(); i2++) {
                View view = (View) this.f2177e.get(i2);
                atq atq2 = new atq(view);
                if (z) {
                    mo2377a(atq2);
                } else {
                    mo2379b(atq2);
                }
                atq2.f2217c.add(this);
                mo2475c(atq2);
                if (z) {
                    m2009a(this.f2183k, view, atq2);
                } else {
                    m2009a(this.f2184l, view, atq2);
                }
            }
            return;
        }
        m2012c(viewGroup, z);
    }

    /* renamed from: a */
    public final void mo2463a(ate ate) {
        if (this.f2171C == null) {
            this.f2171C = new ArrayList();
        }
        this.f2171C.add(ate);
    }

    /* renamed from: a */
    public void mo2465a(Class cls) {
        this.f2194x = atc.m2002a(this.f2194x, cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2466a(boolean z) {
        if (!z) {
            this.f2184l.f2218a.clear();
            this.f2184l.f2219b.clear();
            this.f2184l.f2220c.mo15542c();
            return;
        }
        this.f2183k.f2218a.clear();
        this.f2183k.f2219b.clear();
        this.f2183k.f2220c.mo15542c();
    }

    /* renamed from: a */
    public final void mo2467a(int... iArr) {
        if (iArr.length != 0) {
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                if (i2 <= 0 || i2 > 4) {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
                int i3 = 0;
                while (i3 < i) {
                    if (iArr[i3] != i2) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                }
            }
            this.f2186n = (int[]) iArr.clone();
            return;
        }
        this.f2186n = f2166u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo2468a(View view) {
        ArrayList arrayList;
        int id = view.getId();
        ArrayList arrayList2 = this.f2179g;
        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList3 = this.f2180h;
        if (arrayList3 != null && arrayList3.contains(view)) {
            return false;
        }
        ArrayList arrayList4 = this.f2194x;
        if (arrayList4 != null) {
            int size = arrayList4.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f2194x.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f2181i != null && C1280ps.m19935q(view) != null && this.f2181i.contains(C1280ps.m19935q(view))) {
            return false;
        }
        if ((this.f2176d.size() == 0 && this.f2177e.size() == 0 && ((arrayList = this.f2178f) == null || arrayList.isEmpty())) || this.f2176d.contains(Integer.valueOf(id)) || this.f2177e.contains(view)) {
            return true;
        }
        if (this.f2178f != null) {
            for (int i2 = 0; i2 < this.f2178f.size(); i2++) {
                if (((Class) this.f2178f.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2469a(atq atq, atq atq2) {
        if (!(atq == null || atq2 == null)) {
            String[] a = mo2378a();
            if (a == null) {
                for (String str : atq.f2215a.keySet()) {
                    if (m2010a(atq, atq2, str)) {
                        return true;
                    }
                }
                return false;
            }
            for (String str2 : a) {
                if (m2010a(atq, atq2, str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
