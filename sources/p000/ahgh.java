package p000;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: ahgh */
final /* synthetic */ class ahgh implements Callable {

    /* renamed from: a */
    private final Cursor f67157a;

    /* renamed from: b */
    private final int f67158b;

    public ahgh(Cursor cursor, int i) {
        this.f67157a = cursor;
        this.f67158b = i;
    }

    public final Object call() {
        return this.f67157a.getString(this.f67158b);
    }
}
