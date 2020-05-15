package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* renamed from: aque */
final /* synthetic */ class aque implements tid {

    /* renamed from: a */
    private final aquj f86823a;

    /* renamed from: b */
    private final ImageView f86824b;

    /* renamed from: c */
    private final Context f86825c;

    /* renamed from: d */
    private final Intent f86826d;

    public aque(aquj aquj, ImageView imageView, Context context, Intent intent) {
        this.f86823a = aquj;
        this.f86824b = imageView;
        this.f86825c = context;
        this.f86826d = intent;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        aquj aquj = this.f86823a;
        ImageView imageView = this.f86824b;
        Context context = this.f86825c;
        Intent intent = this.f86826d;
        if (bmxv.mo66813a()) {
            imageView.setImageDrawable(new BitmapDrawable(context.getResources(), (Bitmap) bmxv.mo66814b()));
            imageView.setVisibility(0);
            imageView.setOnClickListener(new aqui(aquj, intent, context));
        }
    }
}
