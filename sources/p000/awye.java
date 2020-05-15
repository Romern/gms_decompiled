package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: awye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awye {
    /* renamed from: a */
    private static void m81492a(Context context, FeedbackOptions feedbackOptions) {
        try {
            aucu.m76783a(wvu.m42361a(context).mo29488b(feedbackOptions), (long) ((Integer) awjl.f94546h.mo58455c()).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("WalletCrash", "Error sending feedback", e);
        }
    }

    /* renamed from: a */
    public static void m81493a(Context context, Throwable th) {
        Log.e("WalletCrash", "UncaughtException", th);
        if (((Boolean) awjl.f94545g.mo58455c()).booleanValue() && !stu.m36328n()) {
            wwv wwv = new wwv(th);
            wwv.f51512j = "com.google.android.gms";
            wwv.mo29496b();
            m81492a(context, wwv.mo29490a());
        }
    }

    /* renamed from: a */
    public static boolean m81494a() {
        return Binder.getCallingUid() == Process.myUid();
    }
}
