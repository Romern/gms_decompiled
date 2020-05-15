package p000;

import android.view.View;
import com.google.android.gms.pay.deeplink.DeepLinkChimeraActivity;

/* renamed from: alho */
public final /* synthetic */ class alho implements View.OnClickListener {

    /* renamed from: a */
    private final DeepLinkChimeraActivity f73514a;

    public alho(DeepLinkChimeraActivity deepLinkChimeraActivity) {
        this.f73514a = deepLinkChimeraActivity;
    }

    public void onClick(View view) {
        this.f73514a.finishAndRemoveTask();
    }
}
