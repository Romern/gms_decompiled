package p000;

import android.view.ViewGroup;
import com.google.android.wallet.p097ui.common.FifeNetworkImageView;

/* renamed from: bkdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkdh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f124041a;

    /* renamed from: b */
    final /* synthetic */ FifeNetworkImageView f124042b;

    public bkdh(FifeNetworkImageView fifeNetworkImageView, String str) {
        this.f124042b = fifeNetworkImageView;
        this.f124041a = str;
    }

    public final void run() {
        int width = this.f124042b.getWidth();
        int height = this.f124042b.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f124042b.getLayoutParams();
        if (layoutParams.width == -2) {
            width = 0;
        }
        if (layoutParams.height == -2) {
            height = 0;
        }
        FifeNetworkImageView fifeNetworkImageView = this.f124042b;
        fifeNetworkImageView.setImageUrl(bkcd.m105303a(this.f124041a, width, height, fifeNetworkImageView.f151951j, fifeNetworkImageView.f151952k), this.f124042b.f151950i);
    }
}
