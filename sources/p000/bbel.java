package p000;

import android.net.Uri;

/* renamed from: bbel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbel implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Uri f102485a;

    /* renamed from: b */
    final /* synthetic */ bben f102486b;

    public bbel(bben bben, Uri uri) {
        this.f102486b = bben;
        this.f102485a = uri;
    }

    public final void run() {
        this.f102486b.f102488b.remove(this.f102485a);
    }
}
