package p000;

import android.widget.Toast;
import com.android.volley.Response;
import com.google.android.gms.googlehelp.helpactivities.EmailChimeraActivity;

/* renamed from: abak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abak implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ EmailChimeraActivity f56944a;

    public abak(EmailChimeraActivity emailChimeraActivity) {
        this.f56944a = emailChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        Void voidR = (Void) obj;
        this.f56944a.finish();
        EmailChimeraActivity emailChimeraActivity = this.f56944a;
        Toast.makeText(emailChimeraActivity, emailChimeraActivity.f78934b, 0).show();
    }
}
