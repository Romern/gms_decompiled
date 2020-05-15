package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: wk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1461wk extends C1431vh implements Menu {

    /* renamed from: d */
    private final C1179lz f27504d;

    public C1461wk(Context context, C1179lz lzVar) {
        super(context);
        if (lzVar != null) {
            this.f27504d = lzVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(int i) {
        return mo16183a(this.f27504d.add(i));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f27504d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr3[i5] = mo16183a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(int i) {
        return mo16184a(this.f27504d.addSubMenu(i));
    }

    public final void clear() {
        C1245ok okVar = this.f27369b;
        if (okVar != null) {
            okVar.clear();
        }
        C1245ok okVar2 = this.f27370c;
        if (okVar2 != null) {
            okVar2.clear();
        }
        this.f27504d.clear();
    }

    public final void close() {
        this.f27504d.close();
    }

    public final MenuItem findItem(int i) {
        return mo16183a(this.f27504d.findItem(i));
    }

    public final MenuItem getItem(int i) {
        return mo16183a(this.f27504d.getItem(i));
    }

    public final boolean hasVisibleItems() {
        return this.f27504d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f27504d.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return this.f27504d.performIdentifierAction(i, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f27504d.performShortcut(i, keyEvent, i2);
    }

    public final void removeGroup(int i) {
        if (this.f27369b != null) {
            int i2 = 0;
            while (true) {
                C1245ok okVar = this.f27369b;
                if (i2 >= okVar.f26809h) {
                    break;
                }
                if (((C1181ma) okVar.mo15620b(i2)).getGroupId() == i) {
                    this.f27369b.mo8152d(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f27504d.removeGroup(i);
    }

    public final void removeItem(int i) {
        if (this.f27369b != null) {
            int i2 = 0;
            while (true) {
                C1245ok okVar = this.f27369b;
                if (i2 < okVar.f26809h) {
                    if (((C1181ma) okVar.mo15620b(i2)).getItemId() == i) {
                        this.f27369b.mo8152d(i2);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        this.f27504d.removeItem(i);
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f27504d.setGroupCheckable(i, z, z2);
    }

    public final void setGroupEnabled(int i, boolean z) {
        this.f27504d.setGroupEnabled(i, z);
    }

    public final void setGroupVisible(int i, boolean z) {
        this.f27504d.setGroupVisible(i, z);
    }

    public final void setQwertyMode(boolean z) {
        this.f27504d.setQwertyMode(z);
    }

    public final int size() {
        return this.f27504d.size();
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return mo16183a(this.f27504d.add(i, i2, i3, i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo16184a(this.f27504d.addSubMenu(i, i2, i3, i4));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo16183a(this.f27504d.add(i, i2, i3, charSequence));
    }

    public final MenuItem add(CharSequence charSequence) {
        return mo16183a(this.f27504d.add(charSequence));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo16184a(this.f27504d.addSubMenu(i, i2, i3, charSequence));
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return mo16184a(this.f27504d.addSubMenu(charSequence));
    }
}
