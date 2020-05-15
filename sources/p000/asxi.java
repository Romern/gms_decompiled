package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;
import com.google.android.gms.tapandpay.internal.firstparty.SetNotificationSettingsRequest;

/* renamed from: asxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asxi extends asio {

    /* renamed from: a */
    final /* synthetic */ NotificationSettings f89881a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asxi(rkb rkb, NotificationSettings notificationSettings) {
        super(rkb);
        this.f89881a = notificationSettings;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        asxt asxt = new asxt(this);
        ((aswj) ((aswp) rjd).mo25289B()).mo49577a(new SetNotificationSettingsRequest(this.f89881a), asxt);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return status;
    }
}
