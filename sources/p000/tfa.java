package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;

/* renamed from: tfa */
final /* synthetic */ class tfa implements tid {

    /* renamed from: a */
    private final tfg f45810a;

    /* renamed from: b */
    private final int f45811b;

    /* renamed from: c */
    private final TextView f45812c;

    public tfa(tfg tfg, int i, TextView textView) {
        this.f45810a = tfg;
        this.f45811b = i;
        this.f45812c = textView;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        tfg tfg = this.f45810a;
        int i = this.f45811b;
        TextView textView = this.f45812c;
        if (bmxv.mo66813a()) {
            C1334rs.m20107b(textView, new BitmapDrawable(tfg.f45825c.getContext().getResources(), Bitmap.createScaledBitmap((Bitmap) bmxv.mo66814b(), i, i, false)), null, null, null);
        }
    }
}
