package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.auth.frp.FrpUpdateIntentOperation;
import java.util.concurrent.CountDownLatch;

/* renamed from: jdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdv extends adzx {

    /* renamed from: a */
    public final ContentResolver f22234a;

    /* renamed from: b */
    public final Uri f22235b;

    /* renamed from: c */
    public final CountDownLatch f22236c;

    public jdv(Handler handler, ContentResolver contentResolver, Uri uri, CountDownLatch countDownLatch) {
        super("auth_account", "BlockingUriObserver", handler);
        this.f22234a = contentResolver;
        this.f22235b = uri;
        this.f22236c = countDownLatch;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        if (this.f22235b.equals(uri)) {
            Logger Logger = FrpUpdateIntentOperation.f10953a;
            String valueOf = String.valueOf(this.f22235b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append(valueOf);
            sb.append(" changed");
            Logger.mo25414c(sb.toString(), new Object[0]);
            this.f22236c.countDown();
        }
    }
}
