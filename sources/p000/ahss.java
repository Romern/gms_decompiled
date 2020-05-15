package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.PrintWriter;

/* renamed from: ahss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahss implements AutoCloseable {

    /* renamed from: a */
    private final PrintWriter f67956a;

    /* renamed from: b */
    private final int f67957b;

    /* renamed from: c */
    private int f67958c = 0;

    public ahss(PrintWriter printWriter, int i) {
        this.f67956a = printWriter;
        this.f67957b = i;
    }

    /* renamed from: a */
    public final void mo37030a(String str, Object... objArr) {
        int i = this.f67958c + 1;
        this.f67958c = i;
        if (i <= this.f67957b) {
            this.f67956a.println(String.format(str, objArr));
        }
    }

    public final void close() {
        if (this.f67958c > this.f67957b) {
            this.f67956a.printf("\nData capped due to size limit: %d of %d lines printed.\n", Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR), Integer.valueOf(this.f67958c));
        }
    }
}
