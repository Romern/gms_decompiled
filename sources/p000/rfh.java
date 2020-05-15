package p000;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: rfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rfh extends adzt {

    /* renamed from: a */
    final /* synthetic */ rfi f42866a;

    /* renamed from: b */
    private final Context f42867b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfh(rfi rfi, Context context) {
        super(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f42866a = rfi;
        this.f42867b = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            int i = message.what;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int b = this.f42866a.mo24590b(this.f42867b);
        if (rfy.m33547b(b)) {
            this.f42866a.mo24586a(this.f42867b, b);
        }
    }
}
