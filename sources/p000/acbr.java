package p000;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: acbr */
final /* synthetic */ class acbr implements barb {

    /* renamed from: a */
    private final Context f59450a;

    public acbr(Context context) {
        this.f59450a = context;
    }

    /* renamed from: a */
    public final Object mo32621a() {
        try {
            return (Integer) aucu.m76782a(qwh.m32998a(this.f59450a).mo24319a());
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("Failed to get BootCount", e);
        }
    }
}
