package p000;

import android.view.View;
import com.google.android.gms.pay.deeplink.DeepLinkChimeraActivity;

/* renamed from: alhn */
public final /* synthetic */ class alhn implements View.OnClickListener {

    /* renamed from: a */
    private final DeepLinkChimeraActivity f73513a;

    public alhn(DeepLinkChimeraActivity deepLinkChimeraActivity) {
        this.f73513a = deepLinkChimeraActivity;
    }

    public void onClick(View view) {
        this.f73513a.finishAndRemoveTask();
    }
}
