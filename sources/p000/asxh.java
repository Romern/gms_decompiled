package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetNotificationSettingsResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetNotificationSettingsRequest;

/* renamed from: asxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asxh extends asio {
    public asxh(rkb rkb) {
        super(rkb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        asxs asxs = new asxs(this);
        ((aswj) ((aswp) rjd).mo25289B()).mo49564a(new GetNotificationSettingsRequest(false), asxs);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new asxl(status, new GetNotificationSettingsResponse(null));
    }
}
