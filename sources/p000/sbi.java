package p000;

import android.content.Context;
import android.util.Log;
import java.lang.Thread;

/* renamed from: sbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sbi implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    protected final Context f43992a;

    /* renamed from: b */
    private Thread.UncaughtExceptionHandler f43993b;

    protected sbi(Context context) {
        sba sba = new sba();
        sdo.checkIfNull(context, "Context cannot be null.");
        this.f43992a = context;
        sdo.checkIfNull(sba, "exceptionHandlerUtils cannot be null.");
    }

    /* renamed from: a */
    public final void mo25336a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!getClass().isInstance(defaultUncaughtExceptionHandler)) {
            this.f43993b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo24988a(Thread thread, Throwable th);

    public final void uncaughtException(Thread thread, Throwable th) {
        Throwable th2;
        try {
            if (!mo24988a(thread, th)) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f43993b;
                if (uncaughtExceptionHandler == null) {
                    Log.e("BaseUncaughtHandler", "No handler available which handled the exception. Original exception: ", th);
                    spn.m35884e();
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
                return;
            }
            return;
        } catch (RuntimeException e) {
            Log.e("BaseUncaughtHandler", "Hit an exception while processing the UncaughtExceptionHandler. Original exception: ", th);
            throw e;
        } catch (Throwable th3) {
            th2 = th3;
            th = e;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f43993b;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        }
        throw th2;
    }
}
