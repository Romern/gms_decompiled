package p000;

import android.content.Context;
import android.os.AsyncTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: agaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agaf {
    /* renamed from: a */
    public static void m53796a(Context context, String str, String str2) {
        AsyncTask.SERIAL_EXECUTOR.execute(new agae(context, str, str2));
    }

    /* renamed from: b */
    public static void m53797b(Context context, String str, String str2) {
        aucb a = axoz.m82854b(context).mo24694a(str, str2, (byte[]) null);
        try {
            aucu.m76783a(a, 10000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException | TimeoutException e) {
            agac.m53791a(e, str2.length() == 0 ? new String("Unable to send message ") : "Unable to send message ".concat(str2), new Object[0]);
        } catch (InterruptedException e2) {
            return;
        }
        if (!a.mo50384b()) {
            agac.m53791a(a.mo50387e(), str2.length() == 0 ? new String("Unable to send message ") : "Unable to send message ".concat(str2), new Object[0]);
        }
    }
}
