package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: rk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1326rk extends C1251oq {

    /* renamed from: f */
    private static final Rect f26917f = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: b */
    public final AccessibilityManager f26918b;

    /* renamed from: c */
    public final View f26919c;

    /* renamed from: d */
    public int f26920d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f26921e = Integer.MIN_VALUE;

    /* renamed from: g */
    private final Rect f26922g = new Rect();

    /* renamed from: h */
    private final Rect f26923h = new Rect();

    /* renamed from: i */
    private final Rect f26924i = new Rect();

    /* renamed from: j */
    private final int[] f26925j = new int[2];

    /* renamed from: k */
    private C1325rj f26926k;

    /* renamed from: l */
    private int f26927l = Integer.MIN_VALUE;

    public C1326rk(View view) {
        if (view != null) {
            this.f26919c = view;
            this.f26918b = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C1280ps.m19917f(view) == 0) {
                C1280ps.m19906b(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: e */
    private final void m20072e(int i) {
        int i2 = this.f26927l;
        if (i2 != i) {
            this.f26927l = i;
            mo15815b(i, 128);
            mo15815b(i2, (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* renamed from: f */
    private final C1301qm m20073f(int i) {
        boolean z;
        C1301qm a = C1301qm.m20016a();
        a.mo15780g(true);
        a.mo15767c(true);
        a.mo15755a((CharSequence) "android.view.View");
        a.mo15759b(f26917f);
        a.mo15769d(f26917f);
        a.mo15754a(this.f26919c);
        mo15808a(i, a);
        if (a.mo15781h() == null && a.mo15784i() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        a.mo15753a(this.f26923h);
        if (!this.f26923h.equals(f26917f)) {
            int actions = a.f26877a.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                a.f26877a.setPackageName(this.f26919c.getContext().getPackageName());
                View view = this.f26919c;
                a.f26879c = i;
                int i2 = Build.VERSION.SDK_INT;
                a.f26877a.setSource(view, i);
                if (this.f26920d != i) {
                    a.mo15774e(false);
                    a.mo15752a(64);
                } else {
                    a.mo15774e(true);
                    a.mo15752a(128);
                }
                if (this.f26921e == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    a.mo15752a(2);
                } else if (a.mo15768c()) {
                    a.mo15752a(1);
                }
                a.mo15771d(z);
                this.f26919c.getLocationOnScreen(this.f26925j);
                a.mo15765c(this.f26922g);
                if (this.f26922g.equals(f26917f)) {
                    a.mo15753a(this.f26922g);
                    if (a.f26878b != -1) {
                        C1301qm a2 = C1301qm.m20016a();
                        for (int i3 = a.f26878b; i3 != -1; i3 = a2.f26878b) {
                            View view2 = this.f26919c;
                            a2.f26878b = -1;
                            int i4 = Build.VERSION.SDK_INT;
                            a2.f26877a.setParent(view2, -1);
                            a2.mo15759b(f26917f);
                            mo15808a(0, a2);
                            a2.mo15753a(this.f26923h);
                            this.f26922g.offset(this.f26923h.left, this.f26923h.top);
                        }
                        a2.f26877a.recycle();
                    }
                    this.f26922g.offset(this.f26925j[0] - this.f26919c.getScrollX(), this.f26925j[1] - this.f26919c.getScrollY());
                }
                if (this.f26919c.getLocalVisibleRect(this.f26924i)) {
                    this.f26924i.offset(this.f26925j[0] - this.f26919c.getScrollX(), this.f26925j[1] - this.f26919c.getScrollY());
                    if (this.f26922g.intersect(this.f26924i)) {
                        a.mo15769d(this.f26922g);
                        Rect rect = this.f26922g;
                        if (rect != null && !rect.isEmpty() && this.f26919c.getWindowVisibility() == 0) {
                            ViewParent parent = this.f26919c.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view3 = (View) parent;
                                    if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view3.getParent();
                                } else if (parent != null) {
                                    int i5 = Build.VERSION.SDK_INT;
                                    a.f26877a.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return a;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo15805a(float f, float f2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1301qm mo15806a(int i) {
        if (i != -1) {
            return m20073f(i);
        }
        C1301qm a = C1301qm.m20017a(AccessibilityNodeInfo.obtain(this.f26919c));
        C1280ps.m19899a(this.f26919c, a);
        ArrayList arrayList = new ArrayList();
        mo15810a(arrayList);
        if (a.f26877a.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.f26919c;
                int intValue = ((Integer) arrayList.get(i2)).intValue();
                int i3 = Build.VERSION.SDK_INT;
                a.f26877a.addChild(view, intValue);
            }
            return a;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15807a(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15808a(int i, C1301qm qmVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15809a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15810a(List list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15811a(C1301qm qmVar) {
    }

    /* renamed from: a */
    public abstract boolean mo15812a(int i, int i2);

    /* renamed from: b */
    public final void mo15815b(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i != Integer.MIN_VALUE && this.f26918b.isEnabled() && (parent = this.f26919c.getParent()) != null) {
            if (i != -1) {
                accessibilityEvent = AccessibilityEvent.obtain(i2);
                C1301qm a = mo15806a(i);
                accessibilityEvent.getText().add(a.mo15781h());
                accessibilityEvent.setContentDescription(a.mo15784i());
                accessibilityEvent.setScrollable(a.mo15778f());
                accessibilityEvent.setPassword(a.mo15775e());
                accessibilityEvent.setEnabled(a.mo15772d());
                accessibilityEvent.setChecked(a.mo15764b());
                mo15807a(i, accessibilityEvent);
                if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                    accessibilityEvent.setClassName(a.mo15779g());
                    View view = this.f26919c;
                    int i3 = Build.VERSION.SDK_INT;
                    accessibilityEvent.setSource(view, i);
                    accessibilityEvent.setPackageName(this.f26919c.getContext().getPackageName());
                } else {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
            } else {
                accessibilityEvent = AccessibilityEvent.obtain(i2);
                this.f26919c.onInitializeAccessibilityEvent(accessibilityEvent);
            }
            parent.requestSendAccessibilityEvent(this.f26919c, accessibilityEvent);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rk.a(int, boolean):void
     arg types: [int, int]
     candidates:
      rk.a(float, float):int
      rk.a(int, android.view.accessibility.AccessibilityEvent):void
      rk.a(int, qm):void
      rk.a(android.view.View, qm):void
      rk.a(int, int):boolean
      rk.a(int, android.graphics.Rect):boolean
      oq.a(android.view.View, int):void
      oq.a(android.view.View, android.view.accessibility.AccessibilityEvent):void
      oq.a(android.view.View, qm):void
      rk.a(int, boolean):void */
    /* renamed from: c */
    public final boolean mo15817c(int i) {
        int i2;
        if ((this.f26919c.isFocused() || this.f26919c.requestFocus()) && (i2 = this.f26921e) != i) {
            if (i2 != Integer.MIN_VALUE) {
                mo15818d(i2);
            }
            if (i != Integer.MIN_VALUE) {
                this.f26921e = i;
                mo15809a(i, true);
                mo15815b(i, 8);
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rk.a(int, boolean):void
     arg types: [int, int]
     candidates:
      rk.a(float, float):int
      rk.a(int, android.view.accessibility.AccessibilityEvent):void
      rk.a(int, qm):void
      rk.a(android.view.View, qm):void
      rk.a(int, int):boolean
      rk.a(int, android.graphics.Rect):boolean
      oq.a(android.view.View, int):void
      oq.a(android.view.View, android.view.accessibility.AccessibilityEvent):void
      oq.a(android.view.View, qm):void
      rk.a(int, boolean):void */
    /* renamed from: d */
    public final boolean mo15818d(int i) {
        if (this.f26921e != i) {
            return false;
        }
        this.f26921e = Integer.MIN_VALUE;
        mo15809a(i, false);
        mo15815b(i, 8);
        return true;
    }

    /* renamed from: a */
    public final C1304qp mo342a(View view) {
        if (this.f26926k == null) {
            this.f26926k = new C1325rj(this);
        }
        return this.f26926k;
    }

    /* renamed from: b */
    public final boolean mo15816b(int i) {
        if (this.f26920d != i) {
            return false;
        }
        this.f26920d = Integer.MIN_VALUE;
        this.f26919c.invalidate();
        mo15815b(i, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        return true;
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        super.mo345a(view, qmVar);
        mo15811a(qmVar);
    }

    /* renamed from: a */
    public final boolean mo15813a(int i, Rect rect) {
        C1301qm qmVar;
        C1301qm qmVar2;
        boolean z;
        Object obj;
        int i2;
        int i3 = i;
        Rect rect2 = rect;
        ArrayList arrayList = new ArrayList();
        mo15810a(arrayList);
        C1246ol olVar = new C1246ol();
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            olVar.mo15637a(((Integer) arrayList.get(i5)).intValue(), m20073f(((Integer) arrayList.get(i5)).intValue()));
        }
        int i6 = this.f26921e;
        int i7 = Integer.MIN_VALUE;
        if (i6 != Integer.MIN_VALUE) {
            qmVar = (C1301qm) olVar.mo15646f(i6);
        } else {
            qmVar = null;
        }
        int i8 = -1;
        if (i3 == 1 || i3 == 2) {
            if (C1280ps.m19923h(this.f26919c) == 1) {
                z = true;
            } else {
                z = false;
            }
            int c = olVar.mo15640c();
            ArrayList arrayList2 = new ArrayList(c);
            for (int i9 = 0; i9 < c; i9++) {
                arrayList2.add(C1324ri.m20068a(olVar, i9));
            }
            Collections.sort(arrayList2, new C1327rl(z));
            if (i3 == 1) {
                int size = arrayList2.size();
                if (qmVar != null) {
                    size = arrayList2.indexOf(qmVar);
                }
                int i10 = size - 1;
                obj = i10 >= 0 ? arrayList2.get(i10) : null;
            } else if (i3 == 2) {
                int size2 = arrayList2.size();
                if (qmVar != null) {
                    i2 = arrayList2.lastIndexOf(qmVar);
                } else {
                    i2 = -1;
                }
                int i11 = i2 + 1;
                obj = i11 < size2 ? arrayList2.get(i11) : null;
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
            qmVar2 = (C1301qm) obj;
        } else if (i3 == 17 || i3 == 33 || i3 == 66 || i3 == 130) {
            Rect rect3 = new Rect();
            int i12 = this.f26921e;
            if (i12 != Integer.MIN_VALUE) {
                mo15806a(i12).mo15753a(rect3);
            } else if (rect2 == null) {
                View view = this.f26919c;
                int width = view.getWidth();
                int height = view.getHeight();
                if (i3 == 17) {
                    rect3.set(width, 0, width, height);
                } else if (i3 == 33) {
                    rect3.set(0, height, width, height);
                } else if (i3 == 66) {
                    rect3.set(-1, 0, -1, height);
                } else if (i3 == 130) {
                    rect3.set(0, -1, width, -1);
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            } else {
                rect3.set(rect2);
            }
            Rect rect4 = new Rect(rect3);
            if (i3 == 17) {
                rect4.offset(rect3.width() + 1, 0);
            } else if (i3 == 33) {
                rect4.offset(0, rect3.height() + 1);
            } else if (i3 == 66) {
                rect4.offset(-(rect3.width() + 1), 0);
            } else if (i3 == 130) {
                rect4.offset(0, -(rect3.height() + 1));
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            int c2 = olVar.mo15640c();
            Rect rect5 = new Rect();
            C1301qm qmVar3 = null;
            for (int i13 = 0; i13 < c2; i13++) {
                C1301qm a = C1324ri.m20068a(olVar, i13);
                if (a != qmVar) {
                    ((C1301qm) a).mo15753a(rect5);
                    if (C1328rm.m20093a(rect3, rect5, i3) && (!C1328rm.m20093a(rect3, rect4, i3) || C1328rm.m20092a(i3, rect3, rect5, rect4) || (!C1328rm.m20092a(i3, rect3, rect4, rect5) && C1328rm.m20090a(C1328rm.m20091a(i3, rect3, rect5), C1328rm.m20094b(i3, rect3, rect5)) < C1328rm.m20090a(C1328rm.m20091a(i3, rect3, rect4), C1328rm.m20094b(i3, rect3, rect4))))) {
                        rect4.set(rect5);
                        qmVar3 = a;
                    }
                }
            }
            qmVar2 = qmVar3;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (qmVar2 != null) {
            if (olVar.f26811a) {
                olVar.mo15639b();
            }
            while (true) {
                if (i4 < olVar.f26814d) {
                    if (olVar.f26813c[i4] == qmVar2) {
                        i8 = i4;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            i7 = olVar.mo15638b(i8);
        }
        return mo15817c(i7);
    }

    /* renamed from: a */
    public final boolean mo15814a(MotionEvent motionEvent) {
        if (!this.f26918b.isEnabled() || !this.f26918b.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int a = mo15805a(motionEvent.getX(), motionEvent.getY());
            m20072e(a);
            if (a != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f26927l == Integer.MIN_VALUE) {
            return false;
        } else {
            m20072e(Integer.MIN_VALUE);
            return true;
        }
    }
}
