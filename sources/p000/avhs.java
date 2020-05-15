package p000;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.udc.p077ui.UdcConsentChimeraActivity;

/* renamed from: avhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avhs implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f93187a;

    /* renamed from: b */
    final /* synthetic */ UdcConsentChimeraActivity f93188b;

    public avhs(UdcConsentChimeraActivity udcConsentChimeraActivity, View view) {
        this.f93188b = udcConsentChimeraActivity;
        this.f93187a = view;
    }

    public final void onGlobalLayout() {
        Activity containerActivity = this.f93188b.getContainerActivity();
        srn srn = avgq.f93152a;
        try {
            Rect rect = new Rect();
            containerActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            bnsl bnsl = (bnsl) avgq.f93152a.mo68388c();
            bnsl.mo68432a("avgq", "a", 42, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Root view bounds: %s", rect.flattenToString());
            WindowManager.LayoutParams attributes = containerActivity.getWindow().getAttributes();
            attributes.width = rect.width();
            attributes.height = rect.height();
            attributes.gravity = 48;
            containerActivity.getWindow().setAttributes(attributes);
        } catch (Exception e) {
            bnsl bnsl2 = (bnsl) avgq.f93152a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("avgq", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Couldn't hide caption bar");
        }
        this.f93187a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
