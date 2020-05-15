package p000;

import android.support.p002v7.widget.RecyclerView;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;

/* renamed from: apxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apxk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ svm f85065a;

    /* renamed from: b */
    final /* synthetic */ VerifyAppsSettingsChimeraActivity f85066b;

    public apxk(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, svm svm) {
        this.f85066b = verifyAppsSettingsChimeraActivity;
        this.f85065a = svm;
    }

    public final void run() {
        acm findViewHolderForAdapterPosition;
        int indexOf = ((svi) this.f85066b.f41601g).f45221a.mo26154g().indexOf(this.f85065a);
        if (indexOf >= 0 && (findViewHolderForAdapterPosition = ((RecyclerView) this.f85066b.findViewById(16908298)).findViewHolderForAdapterPosition(indexOf)) != null) {
            CompoundButton compoundButton = (CompoundButton) findViewHolderForAdapterPosition.f201a.findViewById(C0126R.C0129id.toggle);
            compoundButton.setChecked(this.f85065a.f45239a);
            compoundButton.sendAccessibilityEvent(1);
        }
    }
}
