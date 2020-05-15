package p000;

import android.os.FileObserver;
import android.os.Process;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: dfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dfv extends FileObserver {

    /* renamed from: a */
    public final dfy f13022a;

    /* renamed from: b */
    public final LinkedBlockingQueue f13023b = new LinkedBlockingQueue(1);

    /* renamed from: c */
    private final String f13024c;

    public dfv(dfy dfy, String str) {
        super(str, 962);
        this.f13022a = dfy;
        this.f13024c = str;
    }

    public final void onEvent(int i, String str) {
        if ("downgrade_from_config.fb".equals(str)) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Downgrade file event: ");
            sb.append(i);
            sb.toString();
            if (new File(this.f13024c, "downgrade_from_config.fb").exists()) {
                stopWatching();
                Process.killProcess(Process.myPid());
            }
        } else if ("current_config.fb".equals(str)) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Config file event: ");
            sb2.append(i);
            sb2.toString();
            if (new File(this.f13024c, "current_config.fb").exists()) {
                this.f13023b.offer(1);
            }
        }
    }
}
