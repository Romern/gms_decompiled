package p000;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: auc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class auc extends atf {

    /* renamed from: v */
    private static final String[] f2253v = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: u */
    public int f2254u = 3;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r0.f2251e == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r8 == 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (r0.f2249c == 0) goto L_0x0094;
     */
    /* renamed from: b */
    private static final aub m2117b(atq atq, atq atq2) {
        aub aub = new aub();
        aub.f2247a = false;
        aub.f2248b = false;
        if (atq == null || !atq.f2215a.containsKey("android:visibility:visibility")) {
            aub.f2249c = -1;
            aub.f2251e = null;
        } else {
            aub.f2249c = ((Integer) atq.f2215a.get("android:visibility:visibility")).intValue();
            aub.f2251e = (ViewGroup) atq.f2215a.get("android:visibility:parent");
        }
        if (atq2 == null || !atq2.f2215a.containsKey("android:visibility:visibility")) {
            aub.f2250d = -1;
            aub.f2252f = null;
        } else {
            aub.f2250d = ((Integer) atq2.f2215a.get("android:visibility:visibility")).intValue();
            aub.f2252f = (ViewGroup) atq2.f2215a.get("android:visibility:parent");
        }
        if (atq != null && atq2 != null) {
            int i = aub.f2249c;
            int i2 = aub.f2250d;
            if (i == i2 && aub.f2251e == aub.f2252f) {
                return aub;
            }
            if (i == i2) {
                if (aub.f2252f != null) {
                }
                aub.f2248b = false;
                aub.f2247a = true;
                return aub;
            }
            if (i != 0) {
            }
            aub.f2248b = false;
            aub.f2247a = true;
            return aub;
        } else if (!(atq == null && aub.f2250d == 0)) {
            if (atq2 == null) {
            }
            return aub;
        }
        aub.f2248b = true;
        aub.f2247a = true;
        return aub;
    }

    /* renamed from: d */
    public static void m2118d(atq atq) {
        atq.f2215a.put("android:visibility:visibility", Integer.valueOf(atq.f2216b.getVisibility()));
        atq.f2215a.put("android:visibility:parent", atq.f2216b.getParent());
        int[] iArr = new int[2];
        atq.f2216b.getLocationOnScreen(iArr);
        atq.f2215a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public Animator mo2385a(ViewGroup viewGroup, View view, atq atq) {
        throw null;
    }

    /* renamed from: a */
    public Animator mo2386a(ViewGroup viewGroup, View view, atq atq, atq atq2) {
        throw null;
    }

    /* renamed from: a */
    public final String[] mo2378a() {
        return f2253v;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atf.b(android.view.View, boolean):atq
     arg types: [android.view.View, int]
     candidates:
      auc.b(atq, atq):aub
      atf.b(android.view.View, boolean):atq */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atf.a(android.view.View, boolean):atq
     arg types: [android.view.View, int]
     candidates:
      auc.a(atq, atq):boolean
      atf.a(android.view.ViewGroup, boolean):void
      atf.a(atq, atq):boolean
      atf.a(android.view.View, boolean):atq */
    /* renamed from: a */
    public Animator mo2519a(ViewGroup viewGroup, atq atq, int i, atq atq2, int i2) {
        if ((this.f2254u & 1) != 1 || atq2 == null) {
            return null;
        }
        if (atq == null) {
            View view = (View) atq2.f2216b.getParent();
            if (m2117b(mo2470b(view, false), mo2455a(view, false)).f2247a) {
                return null;
            }
        }
        return mo2386a(viewGroup, atq2.f2216b, atq, atq2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atf.a(android.view.View, boolean):atq
     arg types: [android.view.View, int]
     candidates:
      auc.a(atq, atq):boolean
      atf.a(android.view.ViewGroup, boolean):void
      atf.a(atq, atq):boolean
      atf.a(android.view.View, boolean):atq */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atf.b(android.view.View, boolean):atq
     arg types: [android.view.View, int]
     candidates:
      auc.b(atq, atq):aub
      atf.b(android.view.View, boolean):atq */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* renamed from: b */
    public Animator mo2520b(ViewGroup viewGroup, atq atq, int i, atq atq2, int i2) {
        View view;
        View view2;
        boolean z;
        boolean z2;
        View view3;
        if ((this.f2254u & 2) != 2 || atq == null) {
            return null;
        }
        View view4 = atq.f2216b;
        if (atq2 != null) {
            view = atq2.f2216b;
        } else {
            view = null;
        }
        View view5 = (View) view4.getTag(C0126R.C0129id.save_overlay_view);
        if (view5 != null) {
            view2 = null;
            z = true;
        } else {
            if (view == null || view.getParent() == null) {
                if (view != null) {
                    view3 = null;
                }
                view = null;
                view3 = null;
                z2 = true;
                if (z2) {
                    z = false;
                    view5 = view;
                    view2 = view3;
                } else if (view4.getParent() == null) {
                    view2 = view3;
                    z = false;
                    view5 = view4;
                } else {
                    if (view4.getParent() instanceof View) {
                        View view6 = (View) view4.getParent();
                        if (!m2117b(mo2455a(view6, true), mo2470b(view6, true)).f2247a) {
                            View a = atp.m2088a(viewGroup, view4, view6);
                            z = false;
                            view5 = a;
                            view2 = view3;
                        } else {
                            int id = view6.getId();
                            if (view6.getParent() == null && id != -1) {
                                viewGroup.findViewById(id);
                            } else {
                                z = false;
                                view5 = view;
                                view2 = view3;
                            }
                        }
                    }
                    z = false;
                    view5 = view;
                    view2 = view3;
                }
            } else if (i2 == 4) {
                view3 = view;
                view = null;
                z2 = false;
                if (z2) {
                }
            } else {
                if (view4 == view) {
                    view3 = view;
                    view = null;
                }
                view = null;
                view3 = null;
                z2 = true;
                if (z2) {
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        if (view5 != null) {
            if (!z) {
                int[] iArr = (int[]) atq.f2215a.get("android:visibility:screenLocation");
                int i3 = iArr[0];
                int i4 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                view5.offsetLeftAndRight((i3 - iArr2[0]) - view5.getLeft());
                view5.offsetTopAndBottom((i4 - iArr2[1]) - view5.getTop());
                atv.m2097a(viewGroup).mo2504a(view5);
            }
            Animator a2 = mo2385a(viewGroup, view5, atq);
            if (!z) {
                if (a2 != null) {
                    view4.setTag(C0126R.C0129id.save_overlay_view, view5);
                    mo2463a(new atz(this, viewGroup, view5, view4));
                } else {
                    atv.m2097a(viewGroup).mo2505b(view5);
                }
            }
            return a2;
        } else if (view2 == null) {
            return null;
        } else {
            int visibility = view2.getVisibility();
            aty.m2101a(view2, 0);
            Animator a3 = mo2385a(viewGroup, view2, atq);
            if (a3 != null) {
                aua aua = new aua(view2, i2);
                a3.addListener(aua);
                art.m1916a(a3, aua);
                mo2463a(aua);
            } else {
                aty.m2101a(view2, visibility);
            }
            return a3;
        }
    }

    /* renamed from: a */
    public final Animator mo2376a(ViewGroup viewGroup, atq atq, atq atq2) {
        aub b = m2117b(atq, atq2);
        if (!b.f2247a) {
            return null;
        }
        if (b.f2251e == null && b.f2252f == null) {
            return null;
        }
        if (b.f2248b) {
            return mo2519a(viewGroup, atq, b.f2249c, atq2, b.f2250d);
        }
        return mo2520b(viewGroup, atq, b.f2249c, atq2, b.f2250d);
    }

    /* renamed from: a */
    public void mo2377a(atq atq) {
        m2118d(atq);
    }

    /* renamed from: a */
    public final boolean mo2469a(atq atq, atq atq2) {
        if (atq == null && atq2 == null) {
            return false;
        }
        if (atq != null && atq2 != null && atq2.f2215a.containsKey("android:visibility:visibility") != atq.f2215a.containsKey("android:visibility:visibility")) {
            return false;
        }
        aub b = m2117b(atq, atq2);
        if (!b.f2247a) {
            return false;
        }
        if (b.f2249c == 0 || b.f2250d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo2379b(atq atq) {
        m2118d(atq);
    }
}
