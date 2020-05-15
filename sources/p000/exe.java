package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;

/* renamed from: exe */
final /* synthetic */ class exe implements fgn {

    /* renamed from: a */
    private final exf f15967a;

    /* renamed from: b */
    private final MenuItem f15968b;

    public exe(exf exf, MenuItem menuItem) {
        this.f15967a = exf;
        this.f15968b = menuItem;
    }

    /* renamed from: a */
    public final void mo10504a(Bitmap bitmap, boolean z) {
        this.f15968b.setIcon(new BitmapDrawable(this.f15967a.f15971c.getContext().getResources(), bitmap));
    }
}
