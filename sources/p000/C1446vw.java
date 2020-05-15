package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: vw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1446vw implements C1181ma {

    /* renamed from: A */
    private int f27451A = 16;

    /* renamed from: B */
    private View f27452B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f27453C;

    /* renamed from: a */
    public final int f27454a;

    /* renamed from: b */
    public final int f27455b;

    /* renamed from: c */
    public final int f27456c;

    /* renamed from: d */
    public CharSequence f27457d;

    /* renamed from: e */
    public char f27458e;

    /* renamed from: f */
    public int f27459f = 4096;

    /* renamed from: g */
    public char f27460g;

    /* renamed from: h */
    public int f27461h = 4096;

    /* renamed from: i */
    public final C1443vt f27462i;

    /* renamed from: j */
    public C1466wp f27463j;

    /* renamed from: k */
    public CharSequence f27464k;

    /* renamed from: l */
    public CharSequence f27465l;

    /* renamed from: m */
    public int f27466m;

    /* renamed from: n */
    public C1252or f27467n;

    /* renamed from: o */
    public boolean f27468o = false;

    /* renamed from: p */
    private final int f27469p;

    /* renamed from: q */
    private CharSequence f27470q;

    /* renamed from: r */
    private Intent f27471r;

    /* renamed from: s */
    private Drawable f27472s;

    /* renamed from: t */
    private int f27473t = 0;

    /* renamed from: u */
    private MenuItem.OnMenuItemClickListener f27474u;

    /* renamed from: v */
    private ColorStateList f27475v = null;

    /* renamed from: w */
    private PorterDuff.Mode f27476w = null;

    /* renamed from: x */
    private boolean f27477x = false;

    /* renamed from: y */
    private boolean f27478y = false;

    /* renamed from: z */
    private boolean f27479z = false;

    public C1446vw(C1443vt vtVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f27462i = vtVar;
        this.f27454a = i2;
        this.f27455b = i;
        this.f27469p = i3;
        this.f27456c = i4;
        this.f27457d = charSequence;
        this.f27466m = i5;
    }

    /* renamed from: a */
    private final Drawable m20646a(Drawable drawable) {
        if (drawable != null && this.f27479z && (this.f27477x || this.f27478y)) {
            int i = Build.VERSION.SDK_INT;
            drawable = drawable.mutate();
            if (this.f27477x) {
                C1173lt.m19601a(drawable, this.f27475v);
            }
            if (this.f27478y) {
                C1173lt.m19604a(drawable, this.f27476w);
            }
            this.f27479z = false;
        }
        return drawable;
    }

    /* renamed from: a */
    public final C1252or mo15436a() {
        return this.f27467n;
    }

    /* renamed from: a */
    public final void mo16281a(boolean z) {
        this.f27451A = (!z ? 0 : 4) | (this.f27451A & -5);
    }

    /* renamed from: b */
    public final void mo15439b(CharSequence charSequence) {
        this.f27465l = charSequence;
        this.f27462i.mo16242b(false);
    }

    /* renamed from: c */
    public final char mo16284c() {
        return !this.f27462i.mo16246c() ? this.f27458e : this.f27460g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo16285c(boolean z) {
        int i = this.f27451A;
        int i2 = (!z ? 8 : 0) | (i & -9);
        this.f27451A = i2;
        return i != i2;
    }

    public final boolean collapseActionView() {
        if ((this.f27466m & 8) == 0) {
            return false;
        }
        if (this.f27452B == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f27453C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f27462i.mo16244b(this);
    }

    /* renamed from: d */
    public final void mo16286d(boolean z) {
        this.f27451A = !z ? this.f27451A & -33 : this.f27451A | 32;
    }

    /* renamed from: e */
    public final void mo16288e(boolean z) {
        this.f27468o = z;
        this.f27462i.mo16242b(false);
    }

    /* renamed from: e */
    public final boolean mo16289e() {
        return (this.f27451A & 4) != 0;
    }

    public final boolean expandActionView() {
        if (!mo16306i()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f27453C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f27462i.mo16230a(this);
    }

    /* renamed from: f */
    public final boolean mo16290f() {
        return (this.f27451A & 32) == 32;
    }

    /* renamed from: g */
    public final boolean mo16291g() {
        return (this.f27466m & 1) == 1;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f27452B;
        if (view != null) {
            return view;
        }
        C1252or orVar = this.f27467n;
        if (orVar == null) {
            return null;
        }
        View a = orVar.mo15661a(this);
        this.f27452B = a;
        return a;
    }

    public final int getAlphabeticModifiers() {
        return this.f27461h;
    }

    public final char getAlphabeticShortcut() {
        return this.f27460g;
    }

    public final CharSequence getContentDescription() {
        return this.f27464k;
    }

    public final int getGroupId() {
        return this.f27455b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f27472s;
        if (drawable != null) {
            return m20646a(drawable);
        }
        int i = this.f27473t;
        if (i == 0) {
            return null;
        }
        Drawable b = C1391tv.m20459b(this.f27462i.f27423a, i);
        this.f27473t = 0;
        this.f27472s = b;
        return m20646a(b);
    }

    public final ColorStateList getIconTintList() {
        return this.f27475v;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f27476w;
    }

    public final Intent getIntent() {
        return this.f27471r;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f27454a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f27459f;
    }

    public final char getNumericShortcut() {
        return this.f27458e;
    }

    public final int getOrder() {
        return this.f27469p;
    }

    public final SubMenu getSubMenu() {
        return this.f27463j;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f27457d;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f27470q;
        if (charSequence == null) {
            charSequence = this.f27457d;
        }
        int i = Build.VERSION.SDK_INT;
        return charSequence;
    }

    public final CharSequence getTooltipText() {
        return this.f27465l;
    }

    /* renamed from: h */
    public final boolean mo16304h() {
        return (this.f27466m & 2) == 2;
    }

    public final boolean hasSubMenu() {
        return this.f27463j != null;
    }

    /* renamed from: i */
    public final boolean mo16306i() {
        C1252or orVar;
        if ((this.f27466m & 8) != 0) {
            if (this.f27452B == null && (orVar = this.f27467n) != null) {
                this.f27452B = orVar.mo15661a(this);
            }
            if (this.f27452B != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.f27468o;
    }

    public final boolean isCheckable() {
        return (this.f27451A & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f27451A & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f27451A & 16) != 0;
    }

    public final boolean isVisible() {
        C1252or orVar = this.f27467n;
        return (orVar != null && orVar.mo15664b()) ? (this.f27451A & 8) == 0 && this.f27467n.mo15665c() : (this.f27451A & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f27462i.f27423a;
        mo16279a(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f27460g != c) {
            this.f27460g = Character.toLowerCase(c);
            this.f27462i.mo16242b(false);
        }
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f27451A;
        boolean z2 = z | (i & true);
        this.f27451A = z2 ? 1 : 0;
        if (i != z2) {
            this.f27462i.mo16242b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        boolean z2;
        if ((this.f27451A & 4) != 0) {
            C1443vt vtVar = this.f27462i;
            int i = this.f27455b;
            int size = vtVar.f27425c.size();
            vtVar.mo16252e();
            for (int i2 = 0; i2 < size; i2++) {
                C1446vw vwVar = (C1446vw) vtVar.f27425c.get(i2);
                if (vwVar.f27455b == i && vwVar.mo16289e() && vwVar.isCheckable()) {
                    if (vwVar == this) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    vwVar.mo16282b(z2);
                }
            }
            vtVar.mo16253f();
        } else {
            mo16282b(z);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        mo15437a(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        if (!z) {
            this.f27451A &= -17;
        } else {
            this.f27451A |= 16;
        }
        this.f27462i.mo16242b(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f27472s = null;
        this.f27473t = i;
        this.f27479z = true;
        this.f27462i.mo16242b(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f27475v = colorStateList;
        this.f27477x = true;
        this.f27479z = true;
        this.f27462i.mo16242b(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f27476w = mode;
        this.f27478y = true;
        this.f27479z = true;
        this.f27462i.mo16242b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f27471r = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f27458e != c) {
            this.f27458e = c;
            this.f27462i.mo16242b(false);
        }
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f27453C = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f27474u = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f27458e = c;
        this.f27460g = Character.toLowerCase(c2);
        this.f27462i.mo16242b(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f27466m = i;
            this.f27462i.mo16262k();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setTitle(int i) {
        setTitle(this.f27462i.f27423a.getString(i));
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f27470q = charSequence;
        this.f27462i.mo16242b(false);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        mo15439b(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        if (mo16285c(z)) {
            this.f27462i.mo16263l();
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f27457d;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo16282b(boolean z) {
        int i = this.f27451A;
        int i2 = (!z ? 0 : 2) | (i & -3);
        this.f27451A = i2;
        if (i != i2) {
            this.f27462i.mo16242b(false);
        }
    }

    /* renamed from: d */
    public final boolean mo16287d() {
        return this.f27462i.mo16251d() && mo16284c() != 0;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f27473t = 0;
        this.f27472s = drawable;
        this.f27479z = true;
        this.f27462i.mo16242b(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f27458e == c && this.f27459f == i) {
            return this;
        }
        this.f27458e = c;
        this.f27459f = KeyEvent.normalizeMetaState(i);
        this.f27462i.mo16242b(false);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f27457d = charSequence;
        this.f27462i.mo16242b(false);
        C1466wp wpVar = this.f27463j;
        if (wpVar != null) {
            wpVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    /* renamed from: b */
    public final boolean mo16283b() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f27474u;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C1443vt vtVar = this.f27462i;
        if (vtVar.mo16229a(vtVar, this)) {
            return true;
        }
        Intent intent = this.f27471r;
        if (intent != null) {
            try {
                this.f27462i.f27423a.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C1252or orVar = this.f27467n;
        if (orVar == null || !orVar.mo15666d()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        mo16279a(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f27460g == c && this.f27461h == i) {
            return this;
        }
        this.f27460g = Character.toLowerCase(c);
        this.f27461h = KeyEvent.normalizeMetaState(i);
        this.f27462i.mo16242b(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f27458e = c;
        this.f27459f = KeyEvent.normalizeMetaState(i);
        this.f27460g = Character.toLowerCase(c2);
        this.f27461h = KeyEvent.normalizeMetaState(i2);
        this.f27462i.mo16242b(false);
        return this;
    }

    /* renamed from: a */
    public static void m20647a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    public final CharSequence mo16278a(C1459wi wiVar) {
        return (wiVar != null && wiVar.mo1210b()) ? getTitleCondensed() : this.f27457d;
    }

    /* renamed from: a */
    public final void mo16279a(View view) {
        int i;
        this.f27452B = view;
        this.f27467n = null;
        if (view != null && view.getId() == -1 && (i = this.f27454a) > 0) {
            view.setId(i);
        }
        this.f27462i.mo16262k();
    }

    /* renamed from: a */
    public final void mo15437a(CharSequence charSequence) {
        this.f27464k = charSequence;
        this.f27462i.mo16242b(false);
    }

    /* renamed from: a */
    public final void mo15438a(C1252or orVar) {
        C1252or orVar2 = this.f27467n;
        if (orVar2 != null) {
            orVar2.f26821a = null;
        }
        this.f27452B = null;
        this.f27467n = orVar;
        this.f27462i.mo16242b(true);
        C1252or orVar3 = this.f27467n;
        if (orVar3 != null) {
            orVar3.mo15663a(new C1445vv(this));
        }
    }

    /* renamed from: a */
    public final void mo16280a(C1466wp wpVar) {
        this.f27463j = wpVar;
        wpVar.setHeaderTitle(this.f27457d);
    }
}
