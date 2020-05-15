package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: uy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1421uy {

    /* renamed from: A */
    C1252or f27294A;

    /* renamed from: B */
    public CharSequence f27295B;

    /* renamed from: C */
    public CharSequence f27296C;

    /* renamed from: D */
    public ColorStateList f27297D = null;

    /* renamed from: E */
    public PorterDuff.Mode f27298E = null;

    /* renamed from: F */
    final /* synthetic */ C1422uz f27299F;

    /* renamed from: a */
    public final Menu f27300a;

    /* renamed from: b */
    public int f27301b;

    /* renamed from: c */
    public int f27302c;

    /* renamed from: d */
    public int f27303d;

    /* renamed from: e */
    public int f27304e;

    /* renamed from: f */
    public boolean f27305f;

    /* renamed from: g */
    public boolean f27306g;

    /* renamed from: h */
    public boolean f27307h;

    /* renamed from: i */
    public int f27308i;

    /* renamed from: j */
    public int f27309j;

    /* renamed from: k */
    public CharSequence f27310k;

    /* renamed from: l */
    public CharSequence f27311l;

    /* renamed from: m */
    public int f27312m;

    /* renamed from: n */
    public char f27313n;

    /* renamed from: o */
    public int f27314o;

    /* renamed from: p */
    public char f27315p;

    /* renamed from: q */
    public int f27316q;

    /* renamed from: r */
    public int f27317r;

    /* renamed from: s */
    public boolean f27318s;

    /* renamed from: t */
    public boolean f27319t;

    /* renamed from: u */
    public boolean f27320u;

    /* renamed from: v */
    public int f27321v;

    /* renamed from: w */
    public int f27322w;

    /* renamed from: x */
    public String f27323x;

    /* renamed from: y */
    public String f27324y;

    /* renamed from: z */
    public String f27325z;

    public C1421uy(C1422uz uzVar, Menu menu) {
        this.f27299F = uzVar;
        this.f27300a = menu;
        mo16119a();
    }

    /* renamed from: a */
    public static final char m20535a(String str) {
        if (str != null) {
            return str.charAt(0);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo16119a() {
        this.f27301b = 0;
        this.f27302c = 0;
        this.f27303d = 0;
        this.f27304e = 0;
        this.f27305f = true;
        this.f27306g = true;
    }

    /* renamed from: b */
    public final SubMenu mo16121b() {
        this.f27307h = true;
        SubMenu addSubMenu = this.f27300a.addSubMenu(this.f27301b, this.f27308i, this.f27309j, this.f27310k);
        mo16120a(addSubMenu.getItem());
        return addSubMenu;
    }

    /* renamed from: a */
    public final Object mo16118a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f27299F.f27330e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo16120a(MenuItem menuItem) {
        boolean z;
        MenuItem enabled = menuItem.setChecked(this.f27318s).setVisible(this.f27319t).setEnabled(this.f27320u);
        boolean z2 = false;
        if (this.f27317r > 0) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.f27311l).setIcon(this.f27312m);
        int i = this.f27321v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f27325z != null) {
            if (!this.f27299F.f27330e.isRestricted()) {
                C1422uz uzVar = this.f27299F;
                if (uzVar.f27331f == null) {
                    uzVar.f27331f = uzVar.mo16122a(uzVar.f27330e);
                }
                menuItem.setOnMenuItemClickListener(new C1420ux(uzVar.f27331f, this.f27325z));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f27317r >= 2) {
            if (menuItem instanceof C1446vw) {
                ((C1446vw) menuItem).mo16281a(true);
            } else if (menuItem instanceof C1453wc) {
                C1453wc wcVar = (C1453wc) menuItem;
                try {
                    if (wcVar.f27490e == null) {
                        wcVar.f27490e = wcVar.f27489d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    wcVar.f27490e.invoke(wcVar.f27489d, true);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.f27323x;
        if (str != null) {
            menuItem.setActionView((View) mo16118a(str, C1422uz.f27326a, this.f27299F.f27328c));
            z2 = true;
        }
        int i2 = this.f27322w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        C1252or orVar = this.f27294A;
        if (orVar != null) {
            if (menuItem instanceof C1181ma) {
                ((C1181ma) menuItem).mo15438a(orVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        C1264pc.m19827a(menuItem, this.f27295B);
        CharSequence charSequence = this.f27296C;
        boolean z3 = menuItem instanceof C1181ma;
        if (z3) {
            ((C1181ma) menuItem).mo15439b(charSequence);
        } else {
            int i3 = Build.VERSION.SDK_INT;
            menuItem.setTooltipText(charSequence);
        }
        char c = this.f27313n;
        int i4 = this.f27314o;
        if (!z3) {
            int i5 = Build.VERSION.SDK_INT;
            menuItem.setAlphabeticShortcut(c, i4);
        } else {
            ((C1181ma) menuItem).setAlphabeticShortcut(c, i4);
        }
        char c2 = this.f27315p;
        int i6 = this.f27316q;
        if (!z3) {
            int i7 = Build.VERSION.SDK_INT;
            menuItem.setNumericShortcut(c2, i6);
        } else {
            ((C1181ma) menuItem).setNumericShortcut(c2, i6);
        }
        PorterDuff.Mode mode = this.f27298E;
        if (mode != null) {
            if (!z3) {
                int i8 = Build.VERSION.SDK_INT;
                menuItem.setIconTintMode(mode);
            } else {
                ((C1181ma) menuItem).setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f27297D;
        if (colorStateList == null) {
            return;
        }
        if (!z3) {
            int i9 = Build.VERSION.SDK_INT;
            menuItem.setIconTintList(colorStateList);
            return;
        }
        ((C1181ma) menuItem).setIconTintList(colorStateList);
    }
}
