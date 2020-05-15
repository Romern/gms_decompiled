package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: wc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1453wc extends C1431vh implements MenuItem {

    /* renamed from: d */
    public final C1181ma f27489d;

    /* renamed from: e */
    public Method f27490e;

    public C1453wc(Context context, C1181ma maVar) {
        super(context);
        if (maVar != null) {
            this.f27489d = maVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f27489d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f27489d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        C1252or a = this.f27489d.mo15436a();
        if (a instanceof C1447vx) {
            return ((C1447vx) a).f27480b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f27489d.getActionView();
        return actionView instanceof C1449vz ? (View) ((C1449vz) actionView).f27483a : actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f27489d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f27489d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f27489d.getContentDescription();
    }

    public final int getGroupId() {
        return this.f27489d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f27489d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f27489d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f27489d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f27489d.getIntent();
    }

    public final int getItemId() {
        return this.f27489d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f27489d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f27489d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f27489d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f27489d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return mo16184a(this.f27489d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.f27489d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f27489d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f27489d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f27489d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f27489d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f27489d.isCheckable();
    }

    public final boolean isChecked() {
        return this.f27489d.isChecked();
    }

    public final boolean isEnabled() {
        return this.f27489d.isEnabled();
    }

    public final boolean isVisible() {
        return this.f27489d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        int i = Build.VERSION.SDK_INT;
        C1448vy vyVar = new C1448vy(this, actionProvider);
        C1181ma maVar = this.f27489d;
        if (actionProvider == null) {
            vyVar = null;
        }
        maVar.mo15438a(vyVar);
        return this;
    }

    public final MenuItem setActionView(int i) {
        this.f27489d.setActionView(i);
        View actionView = this.f27489d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f27489d.setActionView(new C1449vz(actionView));
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f27489d.setAlphabeticShortcut(c);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f27489d.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f27489d.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f27489d.mo15437a(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f27489d.setEnabled(z);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f27489d.setIcon(i);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f27489d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f27489d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f27489d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f27489d.setNumericShortcut(c);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        C1451wa waVar;
        C1181ma maVar = this.f27489d;
        if (onActionExpandListener != null) {
            waVar = new C1451wa(this, onActionExpandListener);
        } else {
            waVar = null;
        }
        maVar.setOnActionExpandListener(waVar);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        C1452wb wbVar;
        C1181ma maVar = this.f27489d;
        if (onMenuItemClickListener != null) {
            wbVar = new C1452wb(this, onMenuItemClickListener);
        } else {
            wbVar = null;
        }
        maVar.setOnMenuItemClickListener(wbVar);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f27489d.setShortcut(c, c2);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.f27489d.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.f27489d.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f27489d.setTitle(i);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f27489d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f27489d.mo15439b(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        C1181ma maVar = this.f27489d;
        maVar.setVisible(z);
        return maVar;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f27489d.setAlphabeticShortcut(c, i);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f27489d.setIcon(drawable);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f27489d.setNumericShortcut(c, i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f27489d.setShortcut(c, c2, i, i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f27489d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1449vz(view);
        }
        this.f27489d.setActionView(view);
        return this;
    }
}
