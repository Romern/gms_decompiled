package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: etm */
final /* synthetic */ class etm implements fgn {

    /* renamed from: a */
    private final eto f15677a;

    /* renamed from: b */
    private final int f15678b;

    public etm(eto eto, int i) {
        this.f15677a = eto;
        this.f15678b = i;
    }

    /* renamed from: a */
    public final void mo10504a(Bitmap bitmap, boolean z) {
        eto eto = this.f15677a;
        int i = this.f15678b;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(eto.f15682t.f15937i.getResources(), bitmap);
        C1173lt.m19599a(bitmapDrawable, i);
        eto.f15681s.mo71076a(bitmapDrawable);
    }
}
