package p000;

import android.os.Build;
import android.os.Looper;
import java.util.concurrent.FutureTask;

/* renamed from: auii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auii {

    /* renamed from: a */
    public final auhs f91878a;

    /* renamed from: b */
    public Boolean f91879b;

    /* renamed from: c */
    public long f91880c;

    /* renamed from: d */
    public final /* synthetic */ auij f91881d;

    public auii(auij auij, augv augv, int i) {
        auhs auhs;
        this.f91881d = auij;
        bqgk bqgk = augv.f91796a;
        Looper myLooper = Looper.myLooper();
        myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
        int i2 = Build.VERSION.SDK_INT;
        if (bqgk != null) {
            auhs = new auhs(augv, i, bqgk);
        } else if (Looper.myLooper() != myLooper) {
            FutureTask futureTask = new FutureTask(new auhq(augv, i));
            new adzt(myLooper).mo33956a(futureTask);
            auhs = (auhs) bqga.m112784b(futureTask);
        } else {
            auhs = new auhs(augv, i);
        }
        this.f91878a = auhs;
        this.f91879b = null;
    }
}
