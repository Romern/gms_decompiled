package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeoutException;

/* renamed from: inb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class inb extends aaab {

    /* renamed from: a */
    private final inc f21377a;

    /* renamed from: b */
    private final rnt f21378b;

    /* renamed from: c */
    private final String f21379c;

    public inb(inc inc, rnt rnt, String str) {
        super(221, "AuthConfigSync");
        this.f21377a = inc;
        this.f21378b = rnt;
        this.f21379c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            this.f21377a.mo13156a(this.f21379c);
            this.f21378b.mo11797a(Status.f30107a);
        } catch (ina e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw new aaaj(8, "Unknown config sync error");
            } else if (cause instanceof TimeoutException) {
                throw new aaaj(15, "The request to sync configs timed out", null, cause);
            } else if (cause instanceof InterruptedException) {
                Thread.currentThread().interrupt();
                throw new aaaj(14, "The request to sync configs was interrupted", null, cause);
            } else {
                throw new aaaj(13, "An error occurred while trying to sync configs", null, cause);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21378b.mo11797a(status);
    }
}
