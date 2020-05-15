package p000;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: aytx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aytx {

    /* renamed from: a */
    private final Context f98484a;

    /* renamed from: b */
    private final Object f98485b = new Object();

    /* renamed from: c */
    private File f98486c;

    public aytx(Context context) {
        this.f98484a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final File mo54435a() {
        File file;
        synchronized (this.f98485b) {
            if (this.f98486c == null) {
                int i = Build.VERSION.SDK_INT;
                this.f98486c = this.f98484a.getDataDir();
            }
            file = this.f98486c;
        }
        return file;
    }
}
