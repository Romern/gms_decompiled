package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: bhck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhck {

    /* renamed from: a */
    public final Context f118301a;

    public bhck(Context context) {
        this.f118301a = context;
    }

    /* renamed from: a */
    public final void mo63551a(String str) {
        this.f118301a.sendBroadcast(new Intent(str));
    }
}
