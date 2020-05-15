package p000;

import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ahwr */
final /* synthetic */ class ahwr implements Runnable {

    /* renamed from: a */
    private final ahwt f68252a;

    /* renamed from: b */
    private final HeadsetPiece f68253b;

    /* renamed from: c */
    private final RemoteViews f68254c;

    /* renamed from: d */
    private final AtomicInteger f68255d;

    /* renamed from: e */
    private final ahwl f68256e;

    public ahwr(ahwt ahwt, HeadsetPiece headsetPiece, RemoteViews remoteViews, AtomicInteger atomicInteger, ahwl ahwl) {
        this.f68252a = ahwt;
        this.f68253b = headsetPiece;
        this.f68254c = remoteViews;
        this.f68255d = atomicInteger;
        this.f68256e = ahwl;
    }

    public final void run() {
        ahwt ahwt = this.f68252a;
        HeadsetPiece headsetPiece = this.f68253b;
        RemoteViews remoteViews = this.f68254c;
        AtomicInteger atomicInteger = this.f68255d;
        ahwl ahwl = this.f68256e;
        Bitmap bitmap = null;
        if (headsetPiece.mo60342c() != null && !headsetPiece.mo60342c().isEmpty()) {
            int dimensionPixelSize = ahwt.f68258H.getResources().getDimensionPixelSize(C0126R.dimen.fast_pair_battery_notification_image_size);
            bitmap = ahws.m56804a(headsetPiece.mo60342c(), dimensionPixelSize, dimensionPixelSize);
        }
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(16908294, bush.m120378a(ahwt.f68258H, bitmap));
        }
        srn srn = ahsd.f67925a;
        headsetPiece.mo60342c();
        ahwt.mo37244a(atomicInteger, ahwl);
    }
}
