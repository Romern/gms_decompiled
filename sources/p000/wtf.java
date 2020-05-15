package p000;

import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wtf */
final /* synthetic */ class wtf implements Runnable {

    /* renamed from: a */
    private final wts f51292a;

    /* renamed from: b */
    private final aiaa f51293b;

    public wtf(wts wts, aiaa aiaa) {
        this.f51292a = wts;
        this.f51293b = aiaa;
    }

    public final void run() {
        wts wts = this.f51292a;
        aiaa aiaa = this.f51293b;
        View view = wts.f51318e;
        if (view == null || wts.f51319f == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68432a("wts", "a", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DeviceDetail: UpdateHeader but view is null.");
            return;
        }
        ((ImageView) view.findViewById(C0126R.C0129id.icon)).setImageBitmap(wsm.m42216a(aiaa));
        wts.f51319f.setText(aiaa.f68520h);
    }
}
