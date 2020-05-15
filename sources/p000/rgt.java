package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;

/* renamed from: rgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rgt implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f42940a;

    /* renamed from: b */
    final /* synthetic */ AccountPickerChimeraActivity f42941b;

    public rgt(AccountPickerChimeraActivity accountPickerChimeraActivity, RecyclerView recyclerView) {
        this.f42941b = accountPickerChimeraActivity;
        this.f42940a = recyclerView;
    }

    public final void onGlobalLayout() {
        AccountPickerChimeraActivity accountPickerChimeraActivity = this.f42941b;
        accountPickerChimeraActivity.f30084k.f61156h.mo2445a(accountPickerChimeraActivity, new rgs(this));
        this.f42940a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
