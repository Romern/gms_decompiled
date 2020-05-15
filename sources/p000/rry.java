package p000;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rry extends IntentOperation {
    private rry() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo25058a(Intent intent) {
        try {
            Intent intent2 = (Intent) intent.getParcelableExtra("broadcast_intent");
            if (intent2 == null) {
                Log.e("ReceiverIntentOperation", "Original intent was null.");
                return;
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("broadcast_targets");
            if (stringArrayExtra == null) {
                Log.w("ReceiverIntentOperation", "No broadcast targets.");
                return;
            }
            ClassLoader classLoader = getClassLoader();
            int length = stringArrayExtra.length;
            int i = 0;
            while (i < length) {
                try {
                    Class<?> loadClass = classLoader.loadClass(stringArrayExtra[i]);
                    if (BroadcastReceiver.class.isAssignableFrom(loadClass)) {
                        ((BroadcastReceiver) loadClass.getConstructor(new Class[0]).newInstance(new Object[0])).onReceive(this, intent2);
                        String action = intent2.getAction();
                        String name = loadClass.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 15 + String.valueOf(name).length());
                        sb.append("Delivered ");
                        sb.append(action);
                        sb.append(" to: ");
                        sb.append(name);
                        sb.toString();
                        i++;
                    } else {
                        String name2 = loadClass.getName();
                        String name3 = BroadcastReceiver.class.getName();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 10 + String.valueOf(name3).length());
                        sb2.append(name2);
                        sb2.append(" is not a ");
                        sb2.append(name3);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    throw new IllegalStateException("Failed to load class for broadcast", e);
                }
            }
        } catch (RuntimeException e2) {
            Log.e("ReceiverIntentOperation", "Failed to unparcel the original Intent.");
        }
    }

    public final void onHandleIntent(Intent intent) {
        Executor executor;
        if ("com.google.android.gms.common.broadcast.DELIVER_BROADCAST".equals(intent.getAction())) {
            if (!cdjb.f180967a.mo6606a().mo77665e()) {
                executor = bqfb.INSTANCE;
            } else {
                executor = rrw.f43564a;
            }
            FutureTask futureTask = new FutureTask(new rrx(this, intent));
            executor.execute(futureTask);
            try {
                futureTask.get(10, TimeUnit.SECONDS);
            } catch (ExecutionException e) {
                if (e.getCause() == null || !(e.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException(e.getCause());
                }
                throw ((RuntimeException) e.getCause());
            } catch (InterruptedException | TimeoutException e2) {
                Log.w("ReceiverIntentOperation", "Broadcast task took longer than expected. Ending operation.");
            }
        }
    }
}
