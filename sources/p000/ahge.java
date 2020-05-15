package p000;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: ahge */
final /* synthetic */ class ahge implements Callable {

    /* renamed from: a */
    private final Context f67147a;

    /* renamed from: b */
    private final Uri f67148b;

    public ahge(Context context, Uri uri) {
        this.f67147a = context;
        this.f67148b = uri;
    }

    public final Object call() {
        Context context = this.f67147a;
        return Integer.valueOf(context.getContentResolver().delete(this.f67148b, null, null));
    }
}
