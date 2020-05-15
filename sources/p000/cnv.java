package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: cnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cnv implements cdn {
    /* renamed from: a */
    public final int mo3745a() {
        return 1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3725a(Object obj, File file, cdk cdk) {
        try {
            cqp.m7364a(((cnu) ((cgj) obj).mo3842b()).mo4010c(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }
}
