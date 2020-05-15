package p000;

import android.view.View;
import android.widget.ImageView;

/* renamed from: bkat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkat {

    /* renamed from: a */
    public final ImageView[] f123896a;

    /* renamed from: b */
    public final ImageView[] f123897b;

    /* renamed from: c */
    public final View f123898c;

    /* renamed from: d */
    public bmno f123899d;

    /* renamed from: e */
    public boolean f123900e;

    public bkat(ImageView[] imageViewArr, ImageView[] imageViewArr2, View view) {
        this.f123896a = imageViewArr;
        this.f123897b = imageViewArr2;
        this.f123898c = view;
    }

    /* renamed from: a */
    private static int m105191a(ImageView[] imageViewArr, bmno bmno) {
        if (!(imageViewArr == null || bmno == null)) {
            int length = imageViewArr.length;
            for (int i = 0; i < length; i++) {
                if (bjzb.m104957a(bmno.f130142c, ((bmno) imageViewArr[i].getTag()).f130142c)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo65757b(bmno bmno) {
        return m105191a(this.f123897b, bmno);
    }

    /* renamed from: a */
    public final int mo65756a(bmno bmno) {
        return m105191a(this.f123896a, bmno);
    }
}
