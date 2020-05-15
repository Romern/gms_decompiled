package p000;

import com.android.volley.toolbox.ImageLoader;

/* renamed from: bof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bof implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ImageLoader.ImageContainer f5235a;

    /* renamed from: b */
    final /* synthetic */ bog f5236b;

    public bof(bog bog, ImageLoader.ImageContainer imageContainer) {
        this.f5236b = bog;
        this.f5235a = imageContainer;
    }

    public final void run() {
        this.f5236b.onResponse(this.f5235a, false);
    }
}
