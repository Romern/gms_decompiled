package p000;

import android.view.View;
import com.google.android.gms.pay.deeplink.DeepLinkChimeraActivity;

/* renamed from: alhp */
public final /* synthetic */ class alhp implements View.OnClickListener {

    /* renamed from: a */
    private final DeepLinkChimeraActivity f73515a;

    public alhp(DeepLinkChimeraActivity deepLinkChimeraActivity) {
        this.f73515a = deepLinkChimeraActivity;
    }

    public void onClick(View view) {
        this.f73515a.finishAndRemoveTask();
    }
}
