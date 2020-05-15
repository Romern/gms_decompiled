package p000;

import com.google.android.gms.nearby.sharing.NotificationChimeraBroadcastReceiver;

/* renamed from: ajmy */
public final /* synthetic */ class ajmy implements aubt {

    /* renamed from: a */
    private final NotificationChimeraBroadcastReceiver f70946a;

    /* renamed from: b */
    private final int f70947b;

    public ajmy(NotificationChimeraBroadcastReceiver notificationChimeraBroadcastReceiver, int i) {
        this.f70946a = notificationChimeraBroadcastReceiver;
        this.f70947b = i;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        NotificationChimeraBroadcastReceiver notificationChimeraBroadcastReceiver = this.f70946a;
        notificationChimeraBroadcastReceiver.f80923a.mo36453a("nearby_sharing", this.f70947b);
    }
}
