package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.location.internal.server.ServiceThread$LogRequestReceiver;
import java.io.File;

/* renamed from: bgdm */
public final /* synthetic */ class bgdm implements Runnable {

    /* renamed from: a */
    private final ServiceThread$LogRequestReceiver f116135a;

    /* renamed from: b */
    private final Context f116136b;

    /* renamed from: c */
    private final Intent f116137c;

    public bgdm(ServiceThread$LogRequestReceiver serviceThread$LogRequestReceiver, Context context, Intent intent) {
        this.f116135a = serviceThread$LogRequestReceiver;
        this.f116136b = context;
        this.f116137c = intent;
    }

    public final void run() {
        ServiceThread$LogRequestReceiver serviceThread$LogRequestReceiver = this.f116135a;
        Context context = this.f116136b;
        Intent intent = this.f116137c;
        if (serviceThread$LogRequestReceiver.f150815a != null) {
            File file = new File(new File(context.getCacheDir(), "compactlog"), "CompactLoggerTmpFullLogFile");
            bfok a = serviceThread$LogRequestReceiver.f150815a.mo62044a(file, intent.getLongExtra("boot_time", -1), intent.getLongExtra("last_event_time", -1), intent.getIntExtra("max_location_historian_events", -1), intent.getLongExtra("current_time_key", -1));
            if (a != null) {
                Uri a2 = C1136kk.m17966a(context, "com.google.android.gms.fileprovider", file);
                Intent intent2 = new Intent("com.google.android.location.internal.server.SEND_LOG_DATA_ACTION");
                intent2.putExtra("content_uri_key", a2.toString());
                intent2.putExtra("data_version_key", 4);
                intent2.putExtra("boot_time", a.f114551a);
                intent2.putExtra("last_event_time", a.f114552b);
                context.getApplicationContext().sendBroadcast(intent2);
            }
        }
    }
}
