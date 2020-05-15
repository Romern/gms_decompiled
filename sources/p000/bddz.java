package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bddz */
public final /* synthetic */ class bddz implements Runnable {

    /* renamed from: a */
    private final bdeh f105392a;

    public bddz(bdeh bdeh) {
        this.f105392a = bdeh;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        Bitmap bitmap;
        bdeh bdeh = this.f105392a;
        C1245ok okVar = bdej.f105415a;
        ImageView imageView = (ImageView) bdeh.f105408a.get();
        if (!bdeh.f105411d && imageView != null) {
            Object obj = ((bddt) bdeh.f105410c).f105384b;
            if (obj != null) {
                int a = bddx.m90628a(imageView);
                bdek bdek = bdeh.f105410c;
                String a2 = bdej.m90636a(((bddt) bdek).f105383a, bdeh.f105409b, bdek, a);
                synchronized (bdej.f105415a) {
                    bitmap = (Bitmap) bdej.f105415a.get(a2);
                }
                if (bitmap == null) {
                    bdeh.f105409b.mo57914a().mo12344a(obj, a, new bdeb(bdeh, a2, obj, a));
                } else {
                    bdeh.mo57937a(bitmap);
                }
            } else {
                Context context = imageView.getContext();
                if (bdcw.f105347a == null) {
                    bdcw.f105347a = C1391tv.m20459b(context, C0126R.C0127drawable.quantum_gm_ic_account_circle_vd_theme_24);
                }
                Drawable drawable = bdcw.f105347a;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, bddd.f105356a, C0126R.attr.ogAccountParticleDiscStyle, 2132017910);
                try {
                    int color = obtainStyledAttributes.getColor(6, context.getResources().getColor(C0126R.color.og_menu_title_color_light));
                    obtainStyledAttributes.recycle();
                    bdds.m90618a(drawable, color);
                    bdeh.mo57938a(drawable);
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            }
        }
    }
}
