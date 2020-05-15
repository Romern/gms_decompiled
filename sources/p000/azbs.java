package p000;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* renamed from: azbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azbs {

    /* renamed from: a */
    public final Context f98921a;

    public azbs(Context context) {
        this.f98921a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo54580a(String str) {
        try {
            gie.m13196b(this.f98921a, str);
        } catch (gid | IOException e) {
            Log.e("OAuthProvider", "Failed to clear GAIA OAuth token");
        }
    }
}
