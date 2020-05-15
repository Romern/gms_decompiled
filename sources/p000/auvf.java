package p000;

import android.view.View;
import com.google.android.gms.trustlet.onbody.discovery.PromoteScreenLockAndOnbodyChimeraActivity;

/* renamed from: auvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auvf implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f92595a;

    /* renamed from: b */
    final /* synthetic */ PromoteScreenLockAndOnbodyChimeraActivity f92596b;

    public auvf(PromoteScreenLockAndOnbodyChimeraActivity promoteScreenLockAndOnbodyChimeraActivity, boolean z) {
        this.f92596b = promoteScreenLockAndOnbodyChimeraActivity;
        this.f92595a = z;
    }

    public void onClick(View view) {
        if (this.f92595a) {
            this.f92596b.setResult(-1);
        } else {
            this.f92596b.setResult(0);
        }
        this.f92596b.finish();
    }
}
