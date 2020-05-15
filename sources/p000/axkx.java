package p000;

import com.google.android.gms.walletp2p.feature.widgets.fifenetworkimageview.FifeNetworkImageView;

/* renamed from: axkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axkx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f96120a;

    /* renamed from: b */
    final /* synthetic */ FifeNetworkImageView f96121b;

    public axkx(FifeNetworkImageView fifeNetworkImageView, String str) {
        this.f96121b = fifeNetworkImageView;
        this.f96120a = str;
    }

    public final void run() {
        FifeNetworkImageView fifeNetworkImageView = this.f96121b;
        fifeNetworkImageView.setImageUrl(ryx.m34684a(FifeNetworkImageView.m94372a(fifeNetworkImageView.getWidth(), this.f96121b.getHeight(), this.f96121b.f110748g), this.f96120a).toString(), this.f96121b.f110749h);
    }
}
