package p000;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: ahgc */
public final /* synthetic */ class ahgc implements Callable {

    /* renamed from: a */
    private final Context f67141a;

    /* renamed from: b */
    private final Uri f67142b;

    /* renamed from: c */
    private final ContentValues f67143c;

    public ahgc(Context context, Uri uri, ContentValues contentValues) {
        this.f67141a = context;
        this.f67142b = uri;
        this.f67143c = contentValues;
    }

    public final Object call() {
        Context context = this.f67141a;
        return context.getContentResolver().insert(this.f67142b, this.f67143c);
    }
}
