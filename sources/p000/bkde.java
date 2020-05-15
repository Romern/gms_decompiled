package p000;

import android.text.TextUtils;
import android.view.View;
import com.google.android.wallet.p097ui.common.DateEditText;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.FormSpinner;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.RegionCodeView;
import com.google.android.wallet.p097ui.common.SelectFieldView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bkde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkde {

    /* renamed from: d */
    public final long f124038d;

    /* renamed from: e */
    public final Object f124039e;

    /* renamed from: f */
    public final Object f124040f;

    public bkde(long j, Object obj, Object obj2) {
        this.f124038d = j;
        this.f124039e = obj;
        this.f124040f = obj2;
    }

    /* renamed from: a */
    public static String m105344a(List list, String str) {
        String str2 = null;
        if (!m105348a(list, null, false)) {
            return "";
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) list.get(i)).f124039e;
            String a = obj instanceof bkdw ? ((bkdw) obj).mo52823a(str) : obj instanceof View ? bkft.m105634a((Object) ((View) obj)) : "";
            if (!TextUtils.isEmpty(a)) {
                str2 = str2 != null ? String.format(str, str2, a) : a;
            }
        }
        return str2;
    }

    /* renamed from: b */
    public static boolean m105349b(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) list.get(i)).f124039e;
            if (obj instanceof bkdm) {
                if (((bkdm) obj).mo52817Q()) {
                    return true;
                }
            } else if (obj instanceof bkdf) {
                bkdf bkdf = (bkdf) obj;
                if (!TextUtils.isEmpty(bkdf.getError())) {
                    bkdf.mo65800cN();
                    return true;
                }
            } else if (obj instanceof View) {
                View view = (View) obj;
                if (!TextUtils.isEmpty(bkft.m105632a(view))) {
                    bkfr.m105598b(view);
                    return true;
                }
            } else {
                throw new IllegalStateException(String.format("Unexpected field type: %s", obj.getClass().getName()));
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkft.a(android.view.View, boolean):boolean
     arg types: [android.view.View, int]
     candidates:
      bkft.a(bmqf, com.google.android.wallet.ui.common.FormEditText):bmqf
      bkft.a(android.view.View, bmqf):bmqk
      bkft.a(android.view.View, java.lang.String):void
      bkft.a(int, bmqf):boolean
      bkft.a(android.view.View, boolean):boolean */
    /* renamed from: c */
    public static boolean m105350c(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) list.get(i)).f124039e;
            if (obj instanceof bkdm) {
                if (((bkdm) obj).mo52818R()) {
                    return true;
                }
            } else if (obj instanceof bkdf) {
                bkdf bkdf = (bkdf) obj;
                if (!bkdf.mo65798cL() || !TextUtils.isEmpty(bkdf.getError())) {
                    bkdf.mo65800cN();
                    return true;
                }
            } else if (obj instanceof View) {
                View view = (View) obj;
                if (!bkft.m105638a(view, false) || !TextUtils.isEmpty(bkft.m105632a(view))) {
                    bkfr.m105598b(view);
                    return true;
                }
            } else {
                String valueOf = String.valueOf(obj.getClass().getName());
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unexpected field type: ") : "Unexpected field type: ".concat(valueOf));
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m105351d(List list) {
        boolean z;
        Object obj;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bkde bkde = (bkde) list.get(i);
            Object obj2 = bkde.f124039e;
            if (obj2 instanceof View) {
                obj2 = bkft.m105641b((View) obj2);
            }
            if (obj2 instanceof bkdf) {
                bkdf bkdf = (bkdf) obj2;
                if (bkdf.mo65798cL()) {
                    if (bkdf instanceof DateEditText) {
                        obj = bkde.f124040f;
                        if (obj == null) {
                            obj = blxc.f128037e;
                        }
                        z = true;
                    } else if ((bkdf instanceof FormEditText) || (bkdf instanceof SelectFieldView)) {
                        Object obj3 = bkde.f124040f;
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        z = true;
                    } else if (bkdf instanceof FormSpinner) {
                        Object obj4 = bkde.f124040f;
                        if (obj4 == null) {
                            obj4 = ((FormSpinner) bkdf).mo71968a(0);
                        }
                        z = true;
                    } else if (bkdf instanceof RegionCodeView) {
                        obj = bkde.f124040f;
                        z = true;
                    } else if (bkdf instanceof bkew) {
                        obj = bkde.f124040f;
                        z = true;
                    } else {
                        obj = null;
                        z = false;
                    }
                    if (z && !bkdf.mo65795a(obj)) {
                        return true;
                    }
                } else {
                    continue;
                }
            } else if ((obj2 instanceof bkdm) && ((bkdm) obj2).mo52819S()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static ArrayList m105352e(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) list.get(i)).f124039e;
            if (obj instanceof bkdm) {
                ArrayList T = ((bkdm) obj).mo52820T();
                if (T != null) {
                    arrayList.addAll(T);
                }
            } else if (obj instanceof View) {
                View view = (View) obj;
                if (chgu.m148707b()) {
                    View b = bkft.m105641b(view);
                    if (!(b instanceof FormEditText) || !((FormEditText) b).f151998R) {
                        arrayList.add(view);
                    }
                } else {
                    arrayList.add(view);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static void m105353f(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) list.get(i)).f124039e;
            if (obj instanceof bjzo) {
                ((bjzo) obj).f123708h.mo65714g();
            } else if (obj instanceof bkdg) {
                m105353f(((bkdg) obj).mo52778bW());
            }
        }
    }

    /* renamed from: g */
    public static void m105354g(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) list.get(i)).f124039e;
            if (obj instanceof bjzo) {
                ((bjzo) obj).mo65670t();
            } else if (obj instanceof bkdg) {
                m105354g(((bkdg) obj).mo52778bW());
            }
        }
    }

    /* renamed from: h */
    public static void m105355h(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) list.get(i)).f124039e;
            if (obj instanceof bjzo) {
                bjzo bjzo = (bjzo) obj;
                bjzo.f123699a.setVisibility(bjzo.f123705g);
            } else if (obj instanceof bkdg) {
                m105355h(((bkdg) obj).mo52778bW());
            }
        }
    }

    /* renamed from: i */
    public static View m105356i(List list) {
        Object obj;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = ((bkde) list.get(i)).f124039e;
            if (!(obj instanceof FormHeaderView) && !(obj instanceof InfoMessageView)) {
                break;
            }
            i++;
        }
        if (obj instanceof bkdx) {
            return ((bkdx) obj).mo52945ck();
        }
        if (obj instanceof RegionCodeView) {
            RegionCodeView regionCodeView = (RegionCodeView) obj;
            return !regionCodeView.f152186g ? regionCodeView.f152184e : regionCodeView.f152183d;
        } else if (obj instanceof View) {
            return bkft.m105641b((View) obj);
        } else {
            if (obj instanceof bkev) {
                return ((bkev) obj).f124104b;
            }
            return null;
        }
    }

    /* renamed from: j */
    public static FormEditText m105357j(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            Object obj = ((bkde) list.get(size)).f124039e;
            if (obj instanceof bkdx) {
                FormEditText j = m105357j(((bkdx) obj).mo52778bW());
                if (j != null) {
                    return j;
                }
            } else if (obj instanceof bkev) {
                return ((bkev) obj).f124104b;
            } else {
                if (obj instanceof View) {
                    View b = bkft.m105641b((View) obj);
                    if (b instanceof FormEditText) {
                        return (FormEditText) b;
                    }
                    if (b instanceof bkew) {
                        return ((bkew) b).f124118c;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public static void m105358k(List list) {
        if (list.size() == 1) {
            Object obj = ((bkde) list.get(0)).f124039e;
            if (obj instanceof bkdx) {
                m105358k(((bkdx) obj).mo52778bW());
            } else if (obj instanceof View) {
                View b = bkft.m105641b((View) obj);
                if (b instanceof FormSpinner) {
                    b.performClick();
                } else if (b instanceof RegionCodeView) {
                    RegionCodeView regionCodeView = (RegionCodeView) b;
                    if (!regionCodeView.f152186g) {
                        regionCodeView.f152184e.performClick();
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public static boolean m105359l(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) list.get(i)).f124039e;
            if (obj instanceof bkdx) {
                bkdx bkdx = (bkdx) obj;
                if (!bkdx.isResumed() || !m105359l(bkdx.mo52778bW())) {
                    return false;
                }
            } else if ((obj instanceof bkev) && !((bkev) obj).isResumed()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m105360m(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bkde bkde = (bkde) list.get(i);
            Object obj = bkde.f124039e;
            if (obj instanceof bkea) {
                if (((bkea) obj).mo52807bT()) {
                    return true;
                }
            } else if (!m105346a(bkde.f124038d, (List) null)) {
                continue;
            } else if (obj instanceof bkdf) {
                if (!TextUtils.isEmpty(((bkdf) obj).getError())) {
                    return true;
                }
            } else if (!(obj instanceof View)) {
                throw new IllegalStateException(String.format("Unexpected field type: %s", obj.getClass().getName()));
            } else if (!TextUtils.isEmpty(bkft.m105632a((View) obj))) {
                return true;
            }
        }
        return false;
    }

    public bkde(bkdm bkdm) {
        this(bkdm.mo52837W(), bkdm, null);
    }

    /* renamed from: a */
    public static void m105345a(List list, int i) {
        View view;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ((bkde) list.get(i2)).f124039e;
            if (obj instanceof bkdm) {
                ((bkdm) obj).mo52834e(i);
            } else if (obj instanceof View) {
                View view2 = (View) obj;
                if (chgu.m148707b()) {
                    View b = bkft.m105641b(view2);
                    if (!(b instanceof FormEditText) || !((FormEditText) b).f151998R) {
                        view2.setVisibility(i);
                    }
                } else {
                    view2.setVisibility(i);
                }
            } else if (((Boolean) bjwe.f123472G.mo54082a()).booleanValue() && (obj instanceof bkev) && (view = ((bkev) obj).f124103a) != null) {
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public static boolean m105346a(long j, List list) {
        return list == null || (j > 100 && list.contains(Long.valueOf(j)));
    }

    /* renamed from: a */
    public static boolean m105347a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) list.get(i)).f124039e;
            if (obj instanceof bkdm) {
                if (((bkdm) obj).mo52816P()) {
                    return true;
                }
            } else if (obj instanceof bkdf) {
                if (((bkdf) obj).mo65800cN()) {
                    return true;
                }
            } else if (!(obj instanceof View)) {
                throw new IllegalStateException(String.format("Unexpected field type: %s", obj.getClass().getName()));
            } else if (bkfr.m105598b((View) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkft.a(android.view.View, boolean):boolean
     arg types: [android.view.View, int]
     candidates:
      bkft.a(bmqf, com.google.android.wallet.ui.common.FormEditText):bmqf
      bkft.a(android.view.View, bmqf):bmqk
      bkft.a(android.view.View, java.lang.String):void
      bkft.a(int, bmqf):boolean
      bkft.a(android.view.View, boolean):boolean */
    /* renamed from: a */
    public static boolean m105348a(List list, List list2, boolean z) {
        List list3;
        if (list2 != null && list2.isEmpty()) {
            return true;
        }
        int size = list.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            bkde bkde = (bkde) list.get(i);
            Object obj = bkde.f124039e;
            if (obj instanceof bkea) {
                bkea bkea = (bkea) obj;
                if (!m105346a(bkde.f124038d, list2)) {
                    list3 = list2;
                } else {
                    list3 = null;
                }
                if (z) {
                    z2 = bkea.mo52804a(list3) && z2;
                } else if (!bkea.mo52806b(list3)) {
                    return false;
                }
            } else if (!m105346a(bkde.f124038d, list2)) {
                continue;
            } else if (obj instanceof bkdf) {
                bkdf bkdf = (bkdf) obj;
                if (z) {
                    z2 = bkdf.mo65799cM() && z2;
                } else if (!bkdf.mo65798cL()) {
                    return false;
                }
            } else if (!(obj instanceof View)) {
                throw new IllegalStateException(String.format("Unexpected field type: %s", obj.getClass().getName()));
            } else if (z) {
                z2 = bkft.m105638a((View) obj, true) && z2;
            } else if (!bkft.m105638a((View) obj, false)) {
                return false;
            }
        }
        return z2;
    }
}
