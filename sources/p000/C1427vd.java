package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: vd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1427vd implements C1181ma {

    /* renamed from: a */
    private CharSequence f27343a;

    /* renamed from: b */
    private CharSequence f27344b;

    /* renamed from: c */
    private Intent f27345c;

    /* renamed from: d */
    private char f27346d;

    /* renamed from: e */
    private int f27347e = 4096;

    /* renamed from: f */
    private char f27348f;

    /* renamed from: g */
    private int f27349g = 4096;

    /* renamed from: h */
    private Drawable f27350h;

    /* renamed from: i */
    private final Context f27351i;

    /* renamed from: j */
    private CharSequence f27352j;

    /* renamed from: k */
    private CharSequence f27353k;

    /* renamed from: l */
    private ColorStateList f27354l = null;

    /* renamed from: m */
    private PorterDuff.Mode f27355m = null;

    /* renamed from: n */
    private boolean f27356n = false;

    /* renamed from: o */
    private boolean f27357o = false;

    /* renamed from: p */
    private int f27358p = 16;

    public C1427vd(Context context, CharSequence charSequence) {
        this.f27351i = context;
        this.f27343a = charSequence;
    }

    /* renamed from: b */
    private final void m20550b() {
        Drawable drawable = this.f27350h;
        if (drawable == null) {
            return;
        }
        if (this.f27356n || this.f27357o) {
            int i = Build.VERSION.SDK_INT;
            this.f27350h = drawable;
            Drawable mutate = drawable.mutate();
            this.f27350h = mutate;
            if (this.f27356n) {
                C1173lt.m19601a(mutate, this.f27354l);
            }
            if (this.f27357o) {
                C1173lt.m19604a(this.f27350h, this.f27355m);
            }
        }
    }

    /* renamed from: a */
    public final C1252or mo15436a() {
        return null;
    }

    /* renamed from: a */
    public final void mo15437a(CharSequence charSequence) {
        this.f27352j = charSequence;
    }

    /* renamed from: b */
    public final void mo15439b(CharSequence charSequence) {
        this.f27353k = charSequence;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f27349g;
    }

    public final char getAlphabeticShortcut() {
        return this.f27348f;
    }

    public final CharSequence getContentDescription() {
        return this.f27352j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f27350h;
    }

    public final ColorStateList getIconTintList() {
        return this.f27354l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f27355m;
    }

    public final Intent getIntent() {
        return this.f27345c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f27347e;
    }

    public final char getNumericShortcut() {
        return this.f27346d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f27343a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f27344b;
        return charSequence == null ? this.f27343a : charSequence;
    }

    public final CharSequence getTooltipText() {
        return this.f27353k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f27358p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f27358p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f27358p & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f27358p & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f27348f = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f27358p = z | (this.f27358p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f27358p = (!z ? 0 : 2) | (this.f27358p & -3);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f27352j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f27358p = (!z ? 0 : 16) | (this.f27358p & -17);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f27350h = C1133kh.m17836a(this.f27351i, i);
        m20550b();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f27354l = colorStateList;
        this.f27356n = true;
        m20550b();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f27355m = mode;
        this.f27357o = true;
        m20550b();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f27345c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f27346d = c;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f27346d = c;
        this.f27348f = Character.toLowerCase(c2);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f27343a = this.f27351i.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f27343a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f27344b = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f27353k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f27358p & 8;
        if (z) {
            i = 0;
        }
        this.f27358p = i2 | i;
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f27348f = Character.toLowerCase(c);
        this.f27349g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f27346d = c;
        this.f27347e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f27346d = c;
        this.f27347e = KeyEvent.normalizeMetaState(i);
        this.f27348f = Character.toLowerCase(c2);
        this.f27349g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    /* renamed from: a */
    public final void mo15438a(C1252or orVar) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f27350h = drawable;
        m20550b();
        return this;
    }
}
