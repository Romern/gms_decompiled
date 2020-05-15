package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;

/* renamed from: aqsw */
final /* synthetic */ class aqsw implements tid {

    /* renamed from: a */
    private final aqtb f86725a;

    /* renamed from: b */
    private final int f86726b;

    /* renamed from: c */
    private final TextView f86727c;

    public aqsw(aqtb aqtb, int i, TextView textView) {
        this.f86725a = aqtb;
        this.f86726b = i;
        this.f86727c = textView;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        aqtb aqtb = this.f86725a;
        int i = this.f86726b;
        TextView textView = this.f86727c;
        if (bmxv.mo66813a()) {
            C1334rs.m20107b(textView, new BitmapDrawable(aqtb.f86734a.getResources(), Bitmap.createScaledBitmap((Bitmap) bmxv.mo66814b(), i, i, false)), null, null, null);
        }
    }
}
