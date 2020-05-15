package p000;

import android.content.Context;
import android.view.SubMenu;

/* renamed from: bhji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhji extends C1443vt {
    public bhji(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1446vw vwVar = (C1446vw) mo16217a(i, i2, i3, charSequence);
        bhjt bhjt = new bhjt(this.f27423a, this, vwVar);
        vwVar.mo16280a(bhjt);
        return bhjt;
    }
}
