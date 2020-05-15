package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: vt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1443vt implements C1179lz {

    /* renamed from: j */
    private static final int[] f27422j = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f27423a;

    /* renamed from: b */
    public C1441vr f27424b;

    /* renamed from: c */
    public final ArrayList f27425c;

    /* renamed from: d */
    public final ArrayList f27426d;

    /* renamed from: e */
    CharSequence f27427e;

    /* renamed from: f */
    Drawable f27428f;

    /* renamed from: g */
    View f27429g;

    /* renamed from: h */
    public C1446vw f27430h;

    /* renamed from: i */
    public boolean f27431i;

    /* renamed from: k */
    private final Resources f27432k;

    /* renamed from: l */
    private boolean f27433l;

    /* renamed from: m */
    private final boolean f27434m;

    /* renamed from: n */
    private final ArrayList f27435n;

    /* renamed from: o */
    private boolean f27436o;

    /* renamed from: p */
    private final ArrayList f27437p;

    /* renamed from: q */
    private boolean f27438q;

    /* renamed from: r */
    private int f27439r = 0;

    /* renamed from: s */
    private boolean f27440s = false;

    /* renamed from: t */
    private boolean f27441t = false;

    /* renamed from: u */
    private boolean f27442u = false;

    /* renamed from: v */
    private boolean f27443v = false;

    /* renamed from: w */
    private final ArrayList f27444w = new ArrayList();

    /* renamed from: x */
    private final CopyOnWriteArrayList f27445x = new CopyOnWriteArrayList();

    /* renamed from: y */
    private boolean f27446y = false;

    public C1443vt(Context context) {
        boolean z = false;
        this.f27423a = context;
        this.f27432k = context.getResources();
        this.f27425c = new ArrayList();
        this.f27435n = new ArrayList();
        this.f27436o = true;
        this.f27426d = new ArrayList();
        this.f27437p = new ArrayList();
        this.f27438q = true;
        if (this.f27432k.getConfiguration().keyboard != 1 && C1281pt.m19947c(ViewConfiguration.get(this.f27423a))) {
            z = true;
        }
        this.f27434m = z;
    }

    /* renamed from: a */
    private final void m20611a(int i, boolean z) {
        if (i >= 0 && i < this.f27425c.size()) {
            this.f27425c.remove(i);
            if (z) {
                mo16242b(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo16218a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: a */
    public void mo16223a(C1441vr vrVar) {
        this.f27424b = vrVar;
    }

    public final MenuItem add(int i) {
        return mo16217a(0, 0, 0, this.f27432k.getString(i));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        PackageManager packageManager = this.f27423a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex >= 0) {
                intent2 = intentArr[resolveInfo.specificIndex];
            } else {
                intent2 = intent;
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = mo16217a(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return i5;
    }

    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f27432k.getString(i));
    }

    /* renamed from: b */
    public final void mo16240b(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f27445x.isEmpty()) {
            Iterator it = this.f27445x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1458wh whVar = (C1458wh) weakReference.get();
                if (whVar == null) {
                    this.f27445x.remove(weakReference);
                } else {
                    int b = whVar.mo474b();
                    if (b > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(b)) != null) {
                        whVar.mo467a(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo16243b() {
        return this.f27446y;
    }

    /* renamed from: c */
    public final void mo16245c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C1466wp) item.getSubMenu()).mo16245c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo16218a(), sparseArray);
        }
    }

    /* renamed from: c */
    public boolean mo16246c() {
        return this.f27433l;
    }

    public final void clear() {
        C1446vw vwVar = this.f27430h;
        if (vwVar != null) {
            mo16244b(vwVar);
        }
        this.f27425c.clear();
        mo16242b(true);
    }

    public final void clearHeader() {
        this.f27428f = null;
        this.f27427e = null;
        this.f27429g = null;
        mo16242b(false);
    }

    public final void close() {
        mo16226a(true);
    }

    /* renamed from: d */
    public final void mo16250d(Bundle bundle) {
        MenuItem findItem;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo16218a());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C1466wp) item.getSubMenu()).mo16250d(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    /* renamed from: d */
    public boolean mo16251d() {
        return this.f27434m;
    }

    /* renamed from: e */
    public final void mo16252e() {
        if (!this.f27440s) {
            this.f27440s = true;
            this.f27441t = false;
            this.f27442u = false;
        }
    }

    /* renamed from: f */
    public final void mo16253f() {
        this.f27440s = false;
        if (this.f27441t) {
            this.f27441t = false;
            mo16242b(this.f27442u);
        }
    }

    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C1446vw vwVar = (C1446vw) this.f27425c.get(i2);
            if (vwVar.f27454a == i) {
                return vwVar;
            }
            if (vwVar.hasSubMenu() && (findItem = vwVar.f27463j.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final ArrayList mo16255g() {
        if (this.f27436o) {
            this.f27435n.clear();
            int size = this.f27425c.size();
            for (int i = 0; i < size; i++) {
                C1446vw vwVar = (C1446vw) this.f27425c.get(i);
                if (vwVar.isVisible()) {
                    this.f27435n.add(vwVar);
                }
            }
            this.f27436o = false;
            this.f27438q = true;
        }
        return this.f27435n;
    }

    public final MenuItem getItem(int i) {
        return (MenuItem) this.f27425c.get(i);
    }

    /* renamed from: h */
    public final void mo16257h() {
        ArrayList g = mo16255g();
        if (this.f27438q) {
            Iterator it = this.f27445x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1458wh whVar = (C1458wh) weakReference.get();
                if (whVar == null) {
                    this.f27445x.remove(weakReference);
                } else {
                    z |= whVar.mo471a();
                }
            }
            if (!z) {
                this.f27426d.clear();
                this.f27437p.clear();
                this.f27437p.addAll(mo16255g());
            } else {
                this.f27426d.clear();
                this.f27437p.clear();
                int size = g.size();
                for (int i = 0; i < size; i++) {
                    C1446vw vwVar = (C1446vw) g.get(i);
                    if (vwVar.mo16290f()) {
                        this.f27426d.add(vwVar);
                    } else {
                        this.f27437p.add(vwVar);
                    }
                }
            }
            this.f27438q = false;
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f27431i) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C1446vw) this.f27425c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final ArrayList mo16259i() {
        mo16257h();
        return this.f27437p;
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo16219a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public C1443vt mo16261j() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo16262k() {
        this.f27438q = true;
        mo16242b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo16263l() {
        this.f27436o = true;
        mo16242b(true);
    }

    /* renamed from: m */
    public final void mo16264m() {
        this.f27439r = 1;
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return mo16227a(findItem(i), i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C1446vw a = mo16219a(i, keyEvent);
        if (a != null) {
            z = mo16227a(a, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            mo16226a(true);
        }
        return z;
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f27425c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1446vw vwVar = (C1446vw) this.f27425c.get(i2);
            if (vwVar.f27455b == i) {
                vwVar.mo16281a(z2);
                vwVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f27446y = z;
    }

    public final void setGroupEnabled(int i, boolean z) {
        int size = this.f27425c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1446vw vwVar = (C1446vw) this.f27425c.get(i2);
            if (vwVar.f27455b == i) {
                vwVar.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i, boolean z) {
        int size = this.f27425c.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1446vw vwVar = (C1446vw) this.f27425c.get(i2);
            if (vwVar.f27455b == i && vwVar.mo16285c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo16242b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f27433l = z;
        mo16242b(false);
    }

    public final int size() {
        return this.f27425c.size();
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return mo16217a(i, i2, i3, this.f27432k.getString(i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f27432k.getString(i4));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vt.a(int, boolean):void
     arg types: [int, int]
     candidates:
      vt.a(int, android.view.KeyEvent):vw
      vt.a(wh, android.content.Context):void
      vt.a(android.view.MenuItem, int):boolean
      vt.a(vt, android.view.MenuItem):boolean
      vt.a(int, boolean):void */
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((C1446vw) this.f27425c.get(i2)).f27455b == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f27425c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((C1446vw) this.f27425c.get(i2)).f27455b != i) {
                    mo16242b(true);
                } else {
                    m20611a(i2, false);
                    i3 = i4;
                }
            }
            mo16242b(true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vt.a(int, boolean):void
     arg types: [int, int]
     candidates:
      vt.a(int, android.view.KeyEvent):vw
      vt.a(wh, android.content.Context):void
      vt.a(android.view.MenuItem, int):boolean
      vt.a(vt, android.view.MenuItem):boolean
      vt.a(int, boolean):void */
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((C1446vw) this.f27425c.get(i2)).f27454a == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        m20611a(i2, true);
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo16217a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1446vw vwVar = (C1446vw) mo16217a(i, i2, i3, charSequence);
        C1466wp wpVar = new C1466wp(this.f27423a, this, vwVar);
        vwVar.mo16280a(wpVar);
        return wpVar;
    }

    /* renamed from: a */
    public MenuItem mo16217a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 >= 0) {
            int[] iArr = f27422j;
            if (i5 < iArr.length) {
                char c = (iArr[i5] << 16) | ((char) i3);
                C1446vw vwVar = new C1446vw(this, i, i2, i3, c, charSequence, this.f27439r);
                ArrayList arrayList = this.f27425c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((C1446vw) arrayList.get(size)).f27456c <= c) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, vwVar);
                mo16242b(true);
                return vwVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return mo16217a(0, 0, 0, charSequence);
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void mo16241b(C1458wh whVar) {
        Iterator it = this.f27445x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1458wh whVar2 = (C1458wh) weakReference.get();
            if (whVar2 == null || whVar2 == whVar) {
                this.f27445x.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public void mo16242b(boolean z) {
        if (this.f27440s) {
            this.f27441t = true;
            if (z) {
                this.f27442u = true;
                return;
            }
            return;
        }
        if (z) {
            this.f27436o = true;
            this.f27438q = true;
        }
        if (!this.f27445x.isEmpty()) {
            mo16252e();
            Iterator it = this.f27445x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1458wh whVar = (C1458wh) weakReference.get();
                if (whVar == null) {
                    this.f27445x.remove(weakReference);
                } else {
                    whVar.mo470a(z);
                }
            }
            mo16253f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1446vw mo16219a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.f27444w;
        arrayList.clear();
        mo16222a(arrayList, i, keyEvent);
        if (!arrayList.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                return (C1446vw) arrayList.get(0);
            }
            boolean c2 = mo16246c();
            for (int i2 = 0; i2 < size; i2++) {
                C1446vw vwVar = (C1446vw) arrayList.get(i2);
                if (!c2) {
                    c = vwVar.f27458e;
                } else {
                    c = vwVar.f27460g;
                }
                if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (c2 && c == 8 && i == 67))) {
                    return vwVar;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo16244b(C1446vw vwVar) {
        boolean z = false;
        if (!this.f27445x.isEmpty() && this.f27430h == vwVar) {
            mo16252e();
            Iterator it = this.f27445x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1458wh whVar = (C1458wh) weakReference.get();
                if (whVar == null) {
                    this.f27445x.remove(weakReference);
                } else {
                    z = whVar.mo472a(vwVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo16253f();
            if (z) {
                this.f27430h = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo16220a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f27432k;
        if (view != null) {
            this.f27429g = view;
            this.f27427e = null;
            this.f27428f = null;
        } else {
            if (i > 0) {
                this.f27427e = resources.getText(i);
            } else if (charSequence != null) {
                this.f27427e = charSequence;
            }
            if (i2 > 0) {
                this.f27428f = C1133kh.m17836a(this.f27423a, i2);
            } else if (drawable != null) {
                this.f27428f = drawable;
            }
            this.f27429g = null;
        }
        mo16242b(false);
    }

    /* renamed from: a */
    public final void mo16221a(Bundle bundle) {
        Parcelable f;
        if (!this.f27445x.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f27445x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1458wh whVar = (C1458wh) weakReference.get();
                if (whVar == null) {
                    this.f27445x.remove(weakReference);
                } else {
                    int b = whVar.mo474b();
                    if (b > 0 && (f = whVar.mo476f()) != null) {
                        sparseArray.put(b, f);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16222a(List list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean c2 = mo16246c();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f27425c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1446vw vwVar = (C1446vw) this.f27425c.get(i3);
                if (vwVar.hasSubMenu()) {
                    vwVar.f27463j.mo16222a(list, i, keyEvent);
                }
                if (!c2) {
                    c = vwVar.f27458e;
                } else {
                    c = vwVar.f27460g;
                }
                if (!c2) {
                    i2 = vwVar.f27459f;
                } else {
                    i2 = vwVar.f27461h;
                }
                if ((modifiers & 69647) == (i2 & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (c2 && c == 8 && i == 67)) && vwVar.isEnabled())) {
                    list.add(vwVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo16224a(C1458wh whVar) {
        mo16225a(whVar, this.f27423a);
    }

    /* renamed from: a */
    public final void mo16225a(C1458wh whVar, Context context) {
        this.f27445x.add(new WeakReference(whVar));
        whVar.mo466a(context, this);
        this.f27438q = true;
    }

    /* renamed from: a */
    public final void mo16226a(boolean z) {
        if (!this.f27443v) {
            this.f27443v = true;
            Iterator it = this.f27445x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1458wh whVar = (C1458wh) weakReference.get();
                if (whVar == null) {
                    this.f27445x.remove(weakReference);
                } else {
                    whVar.mo468a(this, z);
                }
            }
            this.f27443v = false;
        }
    }

    /* renamed from: a */
    public final boolean mo16227a(MenuItem menuItem, int i) {
        return mo16228a(menuItem, (C1458wh) null, i);
    }

    /* renamed from: a */
    public final boolean mo16228a(MenuItem menuItem, C1458wh whVar, int i) {
        boolean z;
        C1446vw vwVar = (C1446vw) menuItem;
        if (vwVar == null || !vwVar.isEnabled()) {
            return false;
        }
        boolean b = vwVar.mo16283b();
        C1252or orVar = vwVar.f27467n;
        boolean z2 = orVar != null && orVar.mo15667e();
        if (vwVar.mo16306i()) {
            b |= vwVar.expandActionView();
            if (b) {
                mo16226a(true);
                return true;
            }
        } else if (vwVar.hasSubMenu() || z2) {
            if ((i & 4) == 0) {
                mo16226a(false);
            }
            if (!vwVar.hasSubMenu()) {
                vwVar.mo16280a(new C1466wp(this.f27423a, this, vwVar));
            }
            C1466wp wpVar = vwVar.f27463j;
            if (z2) {
                orVar.mo15662a(wpVar);
            }
            if (this.f27445x.isEmpty()) {
                z = false;
            } else {
                if (whVar != null) {
                    z = whVar.mo473a(wpVar);
                } else {
                    z = false;
                }
                Iterator it = this.f27445x.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C1458wh whVar2 = (C1458wh) weakReference.get();
                    if (whVar2 == null) {
                        this.f27445x.remove(weakReference);
                    } else if (!z) {
                        z = whVar2.mo473a(wpVar);
                    }
                }
            }
            b |= z;
            if (!b) {
                mo16226a(true);
                return false;
            }
        } else if ((i & 1) == 0) {
            mo16226a(true);
            return b;
        }
        return b;
    }

    /* renamed from: a */
    public boolean mo16229a(C1443vt vtVar, MenuItem menuItem) {
        C1441vr vrVar = this.f27424b;
        return vrVar != null && vrVar.mo133a(vtVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo16230a(C1446vw vwVar) {
        boolean z = false;
        if (!this.f27445x.isEmpty()) {
            mo16252e();
            Iterator it = this.f27445x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1458wh whVar = (C1458wh) weakReference.get();
                if (whVar == null) {
                    this.f27445x.remove(weakReference);
                } else {
                    z = whVar.mo475b(vwVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo16253f();
            if (z) {
                this.f27430h = vwVar;
            }
        }
        return z;
    }
}
