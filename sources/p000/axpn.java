package p000;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

/* renamed from: axpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axpn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ChannelEventParcelable f96249a;

    /* renamed from: b */
    final /* synthetic */ axpo f96250b;

    public axpn(axpo axpo, ChannelEventParcelable channelEventParcelable) {
        this.f96250b = axpo;
        this.f96249a = channelEventParcelable;
    }

    public final void run() {
        this.f96249a.mo60269a(this.f96250b.f96251a);
        this.f96249a.mo60269a(this.f96250b.f96251a.f96259g);
    }
}
