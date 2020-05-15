package p000;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/* renamed from: aqpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqpb implements Runnable {

    /* renamed from: a */
    private final Context f86464a;

    /* renamed from: b */
    private final String f86465b;

    public aqpb(Context context, String str) {
        this.f86464a = context.getApplicationContext();
        this.f86465b = str;
    }

    public final void run() {
        Toast.makeText(this.f86464a, this.f86465b, 1).show();
        Log.i("SignInHelper", this.f86465b);
    }
}
