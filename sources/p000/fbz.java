package p000;

import android.os.Bundle;
import android.view.View;

/* renamed from: fbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fbz extends fca {

    /* renamed from: j */
    public evj f16243j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo10582a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10663a(Bundle bundle) {
        int i;
        int i2 = 0;
        if (bundle != null) {
            int i3 = bundle.getInt("visible_item", 0);
            i = bundle.getInt("visible_item_offset", 0);
            i2 = i3;
        } else {
            i = 0;
        }
        this.f16243j.getLayoutManager().mo63b(i2, i);
    }

    /* renamed from: d */
    public final boolean mo10664d() {
        aah c = this.f16243j.getLayoutManager();
        int p = c.mo83p();
        View c2 = c.mo66c(p);
        return p == 0 && c2 != null && c2.getTop() <= mo10582a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int p = this.f16243j.getLayoutManager().mo83p();
        View c = this.f16243j.getLayoutManager().mo66c(p);
        if (c != null) {
            int top = c.getTop();
            bundle.putInt("visible_item", p);
            bundle.putInt("visible_item_offset", top);
        }
    }
}
