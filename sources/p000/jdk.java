package p000;

import android.content.ComponentName;
import android.view.View;
import com.google.android.gms.auth.frp.FreUnlockChimeraActivity;

/* renamed from: jdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdk implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FreUnlockChimeraActivity f22228a;

    public jdk(FreUnlockChimeraActivity freUnlockChimeraActivity) {
        this.f22228a = freUnlockChimeraActivity;
    }

    public void onClick(View view) {
        ims g = this.f22228a.mo14202g();
        if (((Boolean) g.mo13147a(FreUnlockChimeraActivity.f10934d, false)).booleanValue()) {
            this.f22228a.mo7712a((ComponentName) g.mo13146a(FreUnlockChimeraActivity.f10932b), (String) g.mo13146a(FreUnlockChimeraActivity.f10933c));
        } else {
            this.f22228a.mo7711a();
        }
    }
}
