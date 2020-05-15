package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1437vn extends C1454wd implements View.OnKeyListener, PopupWindow.OnDismissListener, C1458wh {

    /* renamed from: a */
    public final Handler f27381a;

    /* renamed from: b */
    public final List f27382b = new ArrayList();

    /* renamed from: c */
    final ViewTreeObserver.OnGlobalLayoutListener f27383c = new C1432vi(this);

    /* renamed from: d */
    View f27384d;

    /* renamed from: e */
    ViewTreeObserver f27385e;

    /* renamed from: f */
    boolean f27386f;

    /* renamed from: h */
    private final Context f27387h;

    /* renamed from: i */
    private final int f27388i;

    /* renamed from: j */
    private final int f27389j;

    /* renamed from: k */
    private final boolean f27390k;

    /* renamed from: l */
    private final List f27391l = new ArrayList();

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f27392m = new C1433vj(this);

    /* renamed from: n */
    private final aaq f27393n = new C1435vl(this);

    /* renamed from: o */
    private int f27394o = 0;

    /* renamed from: p */
    private int f27395p = 0;

    /* renamed from: q */
    private View f27396q;

    /* renamed from: r */
    private int f27397r;

    /* renamed from: s */
    private boolean f27398s;

    /* renamed from: t */
    private boolean f27399t;

    /* renamed from: u */
    private int f27400u;

    /* renamed from: v */
    private int f27401v;

    /* renamed from: w */
    private boolean f27402w;

    /* renamed from: x */
    private boolean f27403x;

    /* renamed from: y */
    private C1457wg f27404y;

    /* renamed from: z */
    private PopupWindow.OnDismissListener f27405z;

    public C1437vn(Context context, View view, int i, boolean z) {
        this.f27387h = context;
        this.f27396q = view;
        this.f27389j = i;
        this.f27390k = z;
        this.f27402w = false;
        this.f27397r = m20571i();
        Resources resources = context.getResources();
        this.f27388i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0126R.dimen.abc_config_prefDialogWidth));
        this.f27381a = new Handler();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, zl, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0147  */
    /* renamed from: c */
    private final void m20570c(C1443vt vtVar) {
        View view;
        C1436vm vmVar;
        int i;
        MenuItem menuItem;
        int i2;
        C1440vq vqVar;
        int firstVisiblePosition;
        C1443vt vtVar2 = vtVar;
        LayoutInflater from = LayoutInflater.from(this.f27387h);
        C1440vq vqVar2 = new C1440vq(vtVar2, from, this.f27390k, C0126R.C0128layout.abc_cascading_menu_item_layout);
        if (!mo107e() && this.f27402w) {
            vqVar2.f27417b = true;
        } else if (mo107e()) {
            vqVar2.f27417b = C1454wd.m20680b(vtVar);
        }
        int a = m20678a(vqVar2, this.f27387h, this.f27388i);
        aas aas = new aas(this.f27387h, this.f27389j);
        aas.f85a = this.f27393n;
        aas.f68m = this;
        aas.mo100a(this);
        aas.f67l = this.f27396q;
        aas.f65j = this.f27395p;
        aas.mo114m();
        aas.mo113l();
        aas.mo99a(vqVar2);
        aas.mo106d(a);
        aas.f65j = this.f27395p;
        if (this.f27382b.size() > 0) {
            List list = this.f27382b;
            vmVar = (C1436vm) list.get(list.size() - 1);
            C1443vt vtVar3 = vmVar.f27379b;
            int size = vtVar3.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = vtVar3.getItem(i3);
                if (menuItem.hasSubMenu() && vtVar2 == menuItem.getSubMenu()) {
                    break;
                }
                i3++;
            }
            if (menuItem != null) {
                ListView a2 = vmVar.mo16189a();
                ListAdapter adapter = a2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    vqVar = (C1440vq) headerViewListAdapter.getWrappedAdapter();
                } else {
                    vqVar = (C1440vq) adapter;
                    i2 = 0;
                }
                int count = vqVar.getCount();
                int i4 = 0;
                while (true) {
                    if (i4 < count) {
                        if (menuItem == vqVar.getItem(i4)) {
                            break;
                        }
                        i4++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                view = (i4 == -1 || (firstVisiblePosition = (i4 + i2) - a2.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= a2.getChildCount()) ? null : a2.getChildAt(firstVisiblePosition);
            } else {
                view = null;
            }
        } else {
            vmVar = null;
            view = null;
        }
        if (view != null) {
            int i5 = Build.VERSION.SDK_INT;
            aas.f72q.setTouchModal(false);
            int i6 = Build.VERSION.SDK_INT;
            aas.f72q.setEnterTransition(null);
            List list2 = this.f27382b;
            ListView a3 = ((C1436vm) list2.get(list2.size() - 1)).mo16189a();
            int[] iArr = new int[2];
            a3.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f27384d.getWindowVisibleDisplayFrame(rect);
            if (this.f27397r == 1) {
                if (iArr[0] + a3.getWidth() + a > rect.right) {
                    i = 0;
                    this.f27397r = i;
                    int i7 = Build.VERSION.SDK_INT;
                    aas.f67l = view;
                    if ((this.f27395p & 5) != 5) {
                        if (i != 0) {
                            a = view.getWidth();
                        } else {
                            a = -a;
                        }
                    } else if (i == 0) {
                        a = -view.getWidth();
                    }
                    aas.f62g = a;
                    aas.f64i = true;
                    aas.f63h = true;
                    aas.mo96a(0);
                }
            } else if (iArr[0] - a >= 0) {
                i = 0;
                this.f27397r = i;
                int i72 = Build.VERSION.SDK_INT;
                aas.f67l = view;
                if ((this.f27395p & 5) != 5) {
                }
                aas.f62g = a;
                aas.f64i = true;
                aas.f63h = true;
                aas.mo96a(0);
            }
            i = 1;
            this.f27397r = i;
            int i722 = Build.VERSION.SDK_INT;
            aas.f67l = view;
            if ((this.f27395p & 5) != 5) {
            }
            aas.f62g = a;
            aas.f64i = true;
            aas.f63h = true;
            aas.mo96a(0);
        } else {
            if (this.f27398s) {
                aas.f62g = this.f27400u;
            }
            if (this.f27399t) {
                aas.mo96a(this.f27401v);
            }
            aas.mo97a(this.f27491g);
        }
        this.f27382b.add(new C1436vm(aas, vtVar2, this.f27397r));
        aas.mo101aI();
        C1543zl zlVar = aas.f60e;
        zlVar.setOnKeyListener(this);
        if (vmVar == null && this.f27403x && vtVar2.f27427e != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate((int) C0126R.C0128layout.abc_popup_menu_header_item_layout, (ViewGroup) zlVar, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(vtVar2.f27427e);
            zlVar.addHeaderView(frameLayout, null, false);
            aas.mo101aI();
        }
    }

    /* renamed from: i */
    private final int m20571i() {
        return C1280ps.m19923h(this.f27396q) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public final void mo16190a(int i) {
        if (this.f27394o != i) {
            this.f27394o = i;
            this.f27395p = C1256ov.m19815a(i, C1280ps.m19923h(this.f27396q));
        }
    }

    /* renamed from: a */
    public final void mo467a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public final void mo16192a(PopupWindow.OnDismissListener onDismissListener) {
        this.f27405z = onDismissListener;
    }

    /* renamed from: a */
    public final void mo469a(C1457wg wgVar) {
        this.f27404y = wgVar;
    }

    /* renamed from: a */
    public final boolean mo471a() {
        return false;
    }

    /* renamed from: aI */
    public final void mo101aI() {
        if (!mo107e()) {
            List list = this.f27391l;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m20570c((C1443vt) list.get(i));
            }
            this.f27391l.clear();
            View view = this.f27396q;
            this.f27384d = view;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = this.f27385e;
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                this.f27385e = viewTreeObserver2;
                if (viewTreeObserver == null) {
                    viewTreeObserver2.addOnGlobalLayoutListener(this.f27383c);
                }
                this.f27384d.addOnAttachStateChangeListener(this.f27392m);
            }
        }
    }

    /* renamed from: b */
    public final void mo16194b(int i) {
        this.f27398s = true;
        this.f27400u = i;
    }

    /* renamed from: b */
    public final void mo16195b(boolean z) {
        this.f27402w = z;
    }

    /* renamed from: c */
    public final void mo16196c(int i) {
        this.f27399t = true;
        this.f27401v = i;
    }

    /* renamed from: c */
    public final void mo16197c(boolean z) {
        this.f27403x = z;
    }

    /* renamed from: d */
    public final void mo105d() {
        int size = this.f27382b.size();
        if (size > 0) {
            C1436vm[] vmVarArr = (C1436vm[]) this.f27382b.toArray(new C1436vm[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1436vm vmVar = vmVarArr[i];
                if (vmVar.f27378a.mo107e()) {
                    vmVar.f27378a.mo105d();
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo107e() {
        return this.f27382b.size() > 0 && ((C1436vm) this.f27382b.get(0)).f27378a.mo107e();
    }

    /* renamed from: f */
    public final Parcelable mo476f() {
        return null;
    }

    /* renamed from: g */
    public final ListView mo109g() {
        if (this.f27382b.isEmpty()) {
            return null;
        }
        List list = this.f27382b;
        return ((C1436vm) list.get(list.size() - 1)).mo16189a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo16198h() {
        return false;
    }

    public final void onDismiss() {
        C1436vm vmVar;
        int size = this.f27382b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                vmVar = null;
                break;
            }
            vmVar = (C1436vm) this.f27382b.get(i);
            if (!vmVar.f27378a.mo107e()) {
                break;
            }
            i++;
        }
        if (vmVar != null) {
            vmVar.f27379b.mo16226a(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo105d();
        return true;
    }

    /* renamed from: a */
    public final void mo16191a(View view) {
        if (this.f27396q != view) {
            this.f27396q = view;
            this.f27395p = C1256ov.m19815a(this.f27394o, C1280ps.m19923h(view));
        }
    }

    /* renamed from: a */
    public final void mo16193a(C1443vt vtVar) {
        vtVar.mo16225a(this, this.f27387h);
        if (mo107e()) {
            m20570c(vtVar);
        } else {
            this.f27391l.add(vtVar);
        }
    }

    /* renamed from: a */
    public final void mo468a(C1443vt vtVar, boolean z) {
        int size = this.f27382b.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (vtVar == ((C1436vm) this.f27382b.get(i)).f27379b) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f27382b.size()) {
                ((C1436vm) this.f27382b.get(i2)).f27379b.mo16226a(false);
            }
            C1436vm vmVar = (C1436vm) this.f27382b.remove(i);
            vmVar.f27379b.mo16241b(this);
            if (this.f27386f) {
                aas aas = vmVar.f27378a;
                int i3 = Build.VERSION.SDK_INT;
                aas.f72q.setExitTransition(null);
                vmVar.f27378a.f72q.setAnimationStyle(0);
            }
            vmVar.f27378a.mo105d();
            int size2 = this.f27382b.size();
            if (size2 > 0) {
                this.f27397r = ((C1436vm) this.f27382b.get(size2 - 1)).f27380c;
            } else {
                this.f27397r = m20571i();
            }
            if (size2 == 0) {
                mo105d();
                C1457wg wgVar = this.f27404y;
                if (wgVar != null) {
                    wgVar.mo15958a(vtVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f27385e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f27385e.removeGlobalOnLayoutListener(this.f27383c);
                    }
                    this.f27385e = null;
                }
                this.f27384d.removeOnAttachStateChangeListener(this.f27392m);
                this.f27405z.onDismiss();
            } else if (z) {
                ((C1436vm) this.f27382b.get(0)).f27379b.mo16226a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo470a(boolean z) {
        List list = this.f27382b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m20679a(((C1436vm) list.get(i)).mo16189a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo473a(C1466wp wpVar) {
        List list = this.f27382b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C1436vm vmVar = (C1436vm) list.get(i);
            i++;
            if (wpVar == vmVar.f27379b) {
                vmVar.mo16189a().requestFocus();
                return true;
            }
        }
        if (!wpVar.hasVisibleItems()) {
            return false;
        }
        mo16193a((C1443vt) wpVar);
        C1457wg wgVar = this.f27404y;
        if (wgVar != null) {
            wgVar.mo15959a(wpVar);
        }
        return true;
    }
}
