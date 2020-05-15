package p000;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: ahgi */
final /* synthetic */ class ahgi implements Callable {

    /* renamed from: a */
    private final Cursor f67159a;

    /* renamed from: b */
    private final int f67160b;

    public ahgi(Cursor cursor, int i) {
        this.f67159a = cursor;
        this.f67160b = i;
    }

    public final Object call() {
        return Long.valueOf(this.f67159a.getLong(this.f67160b));
    }
}
