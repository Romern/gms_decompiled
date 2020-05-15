package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: fgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fgk {

    /* renamed from: e */
    public static final Object f16509e = new Object();

    /* renamed from: a */
    public final WeakReference f16510a;

    /* renamed from: b */
    public WeakReference f16511b = null;

    /* renamed from: c */
    public WeakReference f16512c = null;

    /* renamed from: d */
    public final Handler f16513d;

    public fgk(View view) {
        this.f16510a = new WeakReference(view);
        this.f16513d = new adzt(Looper.getMainLooper());
    }
}
