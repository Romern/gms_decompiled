package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.provider.Telephony;
import android.util.Log;

/* renamed from: auhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auhy {

    /* renamed from: a */
    public static final String[] f91855a = {"address"};

    /* renamed from: b */
    public final Context f91856b;

    /* renamed from: c */
    public final auhx f91857c;

    /* renamed from: d */
    public final auhw f91858d;

    public auhy(Context context, Handler handler, auhw auhw) {
        int i = Build.VERSION.SDK_INT;
        bmxy.m108600b(true);
        this.f91856b = context;
        this.f91857c = new auhx(this, handler);
        this.f91858d = auhw;
    }

    /* renamed from: a */
    public final void mo50546a() {
        try {
            this.f91856b.getContentResolver().registerContentObserver(Telephony.Sms.CONTENT_URI, true, this.f91857c);
        } catch (NoClassDefFoundError | SecurityException e) {
            Log.w("Thunderbird", "cannot register sms listener", e);
        }
    }
}
