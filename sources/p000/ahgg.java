package p000;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: ahgg */
public final /* synthetic */ class ahgg implements Callable {

    /* renamed from: a */
    private final Context f67155a;

    /* renamed from: b */
    private final Uri f67156b;

    public ahgg(Context context, Uri uri) {
        this.f67155a = context;
        this.f67156b = uri;
    }

    public final Object call() {
        return becp.m91787a(this.f67155a, this.f67156b, beco.f106909a);
    }
}
