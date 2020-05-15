package p000;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: li */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1161li {
    /* renamed from: a */
    public abstract void mo15153a(int i);

    /* renamed from: a */
    public abstract void mo15154a(Typeface typeface);

    /* renamed from: b */
    public final void mo15155b(int i) {
        new Handler(Looper.getMainLooper()).post(new C1160lh(this, i));
    }

    /* renamed from: b */
    public final void mo15156b(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new C1159lg(this, typeface));
    }
}
