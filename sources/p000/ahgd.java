package p000;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: ahgd */
public final /* synthetic */ class ahgd implements Callable {

    /* renamed from: a */
    private final Context f67144a;

    /* renamed from: b */
    private final Uri f67145b;

    /* renamed from: c */
    private final ContentValues f67146c;

    public ahgd(Context context, Uri uri, ContentValues contentValues) {
        this.f67144a = context;
        this.f67145b = uri;
        this.f67146c = contentValues;
    }

    public final Object call() {
        Context context = this.f67144a;
        return Integer.valueOf(context.getContentResolver().update(this.f67145b, this.f67146c, null, null));
    }
}
