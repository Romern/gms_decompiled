package p000;

import android.content.Context;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: ssz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssz {

    /* renamed from: a */
    public static final Object f45111a = new Object();

    /* renamed from: b */
    public final String f45112b;

    /* renamed from: c */
    public final Context f45113c;

    /* renamed from: d */
    public FileOutputStream f45114d;

    public ssz(Context context, String str) {
        this.f45113c = context;
        this.f45112b = str;
    }

    /* renamed from: a */
    public final void mo26064a() {
        synchronized (f45111a) {
            FileOutputStream fileOutputStream = this.f45114d;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    Log.e("ProtoLiteFileLogger", "Failed to close usage file stream.", e);
                }
                this.f45114d = null;
            }
        }
    }
}
