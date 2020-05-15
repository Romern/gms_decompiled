package p000;

import android.os.Vibrator;

/* renamed from: asur */
final /* synthetic */ class asur implements Runnable {

    /* renamed from: a */
    private final Vibrator f89766a;

    /* renamed from: b */
    private final long[] f89767b;

    public asur(Vibrator vibrator, long[] jArr) {
        this.f89766a = vibrator;
        this.f89767b = jArr;
    }

    public final void run() {
        Vibrator vibrator = this.f89766a;
        long[] jArr = this.f89767b;
        long[] jArr2 = asus.f89768a;
        vibrator.vibrate(jArr, -1);
    }
}
