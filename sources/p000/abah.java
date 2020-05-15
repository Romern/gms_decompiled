package p000;

import android.widget.Toast;
import com.android.volley.Response;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.ClickToCallChimeraActivity;

/* renamed from: abah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abah implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ ClickToCallChimeraActivity f56938a;

    public abah(ClickToCallChimeraActivity clickToCallChimeraActivity) {
        this.f56938a = clickToCallChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        Void voidR = (Void) obj;
        abcx.m47469a(this.f56938a, 21, bzps.C2C);
        Toast.makeText(this.f56938a, (int) C0126R.string.gh_c2c_success_message, 1).show();
        this.f56938a.finish();
    }
}
