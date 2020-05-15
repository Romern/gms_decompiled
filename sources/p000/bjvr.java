package p000;

import android.content.Context;
import android.widget.Toast;

/* renamed from: bjvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjvr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f123398a;

    /* renamed from: b */
    final /* synthetic */ String f123399b;

    public bjvr(Context context, String str) {
        this.f123398a = context;
        this.f123399b = str;
    }

    public final void run() {
        Toast.makeText(this.f123398a, String.format("Overriding MCC/MNC with %s", this.f123399b), 0).show();
    }
}
