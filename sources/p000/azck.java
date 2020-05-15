package p000;

import android.graphics.Bitmap;

/* renamed from: azck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azck {

    /* renamed from: a */
    public final ryw f98979a;

    /* renamed from: b */
    private final int f98980b;

    public azck(int i) {
        this.f98980b = i;
        this.f98979a = new ryw(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return r2;
     */
    /* renamed from: a */
    public final synchronized Bitmap mo54631a(String str) {
        Bitmap bitmap = (Bitmap) this.f98979a.mo15546a(str);
        if (bitmap == null) {
            Bitmap bitmap2 = (Bitmap) this.f98979a.mo15546a("__dft__");
            if (bitmap2 != null) {
                return bitmap2;
            }
            bitmap = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo54632a(String str, Bitmap bitmap) {
        Object[] objArr = {str, Integer.valueOf(bitmap.getByteCount())};
        if (bitmap.getByteCount() > this.f98980b) {
            Object[] objArr2 = {Integer.valueOf(bitmap.getByteCount()), this.f98979a};
        }
        if (str != null) {
            this.f98979a.mo15547a(str, bitmap);
        }
    }
}
