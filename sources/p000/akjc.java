package p000;

import android.graphics.Bitmap;
import android.os.Message;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: akjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjc extends adzt {

    /* renamed from: a */
    private final WeakReference f72075a;

    public akjc(ImageView imageView) {
        this.f72075a = new WeakReference(imageView);
    }

    public final void handleMessage(Message message) {
        ImageView imageView = (ImageView) this.f72075a.get();
        if (imageView != null && message.what == 1) {
            imageView.setImageBitmap((Bitmap) message.obj);
        }
    }
}
