package p000;

import android.graphics.Bitmap;
import java.nio.IntBuffer;

/* renamed from: nuz */
final /* synthetic */ class nuz implements Runnable {

    /* renamed from: a */
    private final nvk f36577a;

    /* renamed from: b */
    private final opz f36578b;

    /* renamed from: c */
    private final IntBuffer f36579c;

    public nuz(nvk nvk, opz opz, IntBuffer intBuffer) {
        this.f36577a = nvk;
        this.f36578b = opz;
        this.f36579c = intBuffer;
    }

    public final void run() {
        nvk nvk = this.f36577a;
        opz opz = this.f36578b;
        IntBuffer intBuffer = this.f36579c;
        int i = nvk.f36668n.f38091a.f37024b;
        int i2 = nvk.f36668n.f38091a.f37025c;
        int[] array = intBuffer.array();
        for (int i3 = 0; i3 < array.length; i3++) {
            int i4 = array[i3];
            array[i3] = (i4 & -16711936) | ((i4 >> 16) & 255) | ((i4 & 255) << 16);
        }
        opz.mo21217a(Bitmap.createBitmap(array, (i2 - 1) * i, -i, i, i2, Bitmap.Config.ARGB_8888));
    }
}
