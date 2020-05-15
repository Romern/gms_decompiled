package p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.setupdesign.items.ExpandableSwitchItem;

/* renamed from: bizk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bizk extends C1251oq {

    /* renamed from: b */
    final /* synthetic */ ExpandableSwitchItem f122386b;

    public bizk(ExpandableSwitchItem expandableSwitchItem) {
        this.f122386b = expandableSwitchItem;
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        super.mo345a(view, qmVar);
        qmVar.mo15757a(this.f122386b.f151497b ? C1298qj.f26867h : C1298qj.f26866g);
    }

    /* renamed from: a */
    public final boolean mo346a(View view, int i, Bundle bundle) {
        if (i != 262144 && i != 524288) {
            return super.mo346a(view, i, bundle);
        }
        ExpandableSwitchItem expandableSwitchItem = this.f122386b;
        expandableSwitchItem.mo71391c(!expandableSwitchItem.f151497b);
        return true;
    }
}
