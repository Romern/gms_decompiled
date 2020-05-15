package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: adpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adpm extends adzx {

    /* renamed from: a */
    static final Long f62453a = Long.valueOf(TimeUnit.SECONDS.toMillis(ceqm.f183265a.mo6606a().mo79596I()));

    /* renamed from: c */
    static adpm f62454c;

    /* renamed from: b */
    public final AtomicBoolean f62455b = new AtomicBoolean(false);

    /* renamed from: d */
    private final Handler f62456d;

    /* renamed from: e */
    private final Runnable f62457e;

    private adpm(Context context) {
        super("ipa", "MediastoreContentObserver", null);
        this.f62456d = new adzt(context.getMainLooper());
        this.f62457e = new adpl(this, context);
    }

    /* renamed from: a */
    public static void m50941a(Context context) {
        synchronized (adpm.class) {
            if (f62454c == null) {
                f62454c = new adpm(context);
            }
            f62454c.onChange(false);
        }
    }

    /* renamed from: b */
    public static synchronized void m50942b(Context context) {
        synchronized (adpm.class) {
            if (f62454c == null) {
                f62454c = new adpm(context.getApplicationContext());
                ContentResolver contentResolver = context.getContentResolver();
                try {
                    contentResolver.registerContentObserver(MediaStore.Files.getContentUri("external"), true, f62454c);
                    if (ceqm.m137874e()) {
                        contentResolver.registerContentObserver(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, true, f62454c);
                    }
                } catch (NoClassDefFoundError | SecurityException e) {
                    adns.m50862a().mo33690a(52);
                    adnt.m50874c("Could not register mediastore content observer");
                }
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m50943c(Context context) {
        synchronized (adpm.class) {
            if (f62454c != null) {
                context.getContentResolver().unregisterContentObserver(f62454c);
                f62454c = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        new Object[1][0] = Boolean.valueOf(z);
        if (!this.f62455b.getAndSet(true)) {
            this.f62456d.postDelayed(this.f62457e, f62453a.longValue());
        }
    }
}
