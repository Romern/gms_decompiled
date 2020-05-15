package p000;

import android.webkit.JavascriptInterface;
import com.google.android.gms.tapandpay.tokenization.AcceptTosChimeraActivity;

/* renamed from: atoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atoy {

    /* renamed from: a */
    final /* synthetic */ AcceptTosChimeraActivity f90620a;

    public atoy(AcceptTosChimeraActivity acceptTosChimeraActivity) {
        this.f90620a = acceptTosChimeraActivity;
    }

    @JavascriptInterface
    public void onBottomReached() {
        AcceptTosChimeraActivity acceptTosChimeraActivity = this.f90620a;
        acceptTosChimeraActivity.runOnUiThread(new atoz(acceptTosChimeraActivity));
    }
}
