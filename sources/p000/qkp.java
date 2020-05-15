package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

/* renamed from: qkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qkp extends qku {

    /* renamed from: c */
    public static final /* synthetic */ int f41615c = 0;

    /* renamed from: b */
    public final Handler f41616b = new adzt(Looper.getMainLooper());

    /* renamed from: d */
    private qko f41617d;

    /* renamed from: e */
    private boolean f41618e = false;

    /* renamed from: a */
    private final qko m32300a() {
        if (this.f41617d == null) {
            this.f41617d = new qko(this);
        }
        return this.f41617d;
    }

    public final IBinder onBind(Intent intent) {
        IBinder a = mo24064a(intent);
        if (a != null) {
            return a;
        }
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        Log.w("GmsApiChimeraSvc", valueOf.length() == 0 ? new String("Failing connection to missing API ") : "Failing connection to missing API ".concat(valueOf));
        if (action == null || sqz.m36058a(cdlb.f181182a.mo6606a().mo77851b(), action)) {
            return null;
        }
        return cdlb.f181182a.mo6606a().mo77850a() ? new qkn(this, intent, m32300a()) : m32300a();
    }

    public final void onDestroy() {
        this.f41618e = true;
        super.onDestroy();
    }

    /* renamed from: a */
    public final IBinder mo24064a(Intent intent) {
        if (!this.f41618e) {
            return super.onBind(intent);
        }
        return null;
    }
}
