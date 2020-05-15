package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: qkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qkz extends IntentOperation {

    /* renamed from: a */
    private final aabl f41630a;

    /* renamed from: b */
    private final IntentOperation f41631b;

    public qkz(IntentOperation intentOperation, aabl aabl) {
        this.f41631b = intentOperation;
        this.f41630a = aabl;
    }

    public final void init(Context context) {
        super.init(context);
        blji b = this.f41630a.mo16696b("init");
        try {
            this.f41631b.init(context);
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        blji b = this.f41630a.mo16696b("onDestroy");
        try {
            this.f41631b.onDestroy();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onHandleIntent(Intent intent) {
        adyw a;
        blji a2 = this.f41630a.mo16695a("onHandleIntent", intent);
        try {
            a = adyv.m51453a();
            this.f41631b.onHandleIntent(intent);
            if (a != null) {
                a.close();
            }
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }

    public final void onHandleIntent(Intent intent, boolean z) {
        adyw a;
        blji a2 = this.f41630a.mo16695a("onHandleIntentWithRedelivery", intent);
        try {
            a = adyv.m51453a();
            this.f41631b.onHandleIntent(intent, z);
            if (a != null) {
                a.close();
            }
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }
}
