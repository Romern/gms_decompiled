package p000;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: ahgj */
final /* synthetic */ class ahgj implements Callable {

    /* renamed from: a */
    private final Cursor f67161a;

    /* renamed from: b */
    private final int f67162b;

    public ahgj(Cursor cursor, int i) {
        this.f67161a = cursor;
        this.f67162b = i;
    }

    public final Object call() {
        return Boolean.valueOf(this.f67161a.getInt(this.f67162b) != 0);
    }
}
