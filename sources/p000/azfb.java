package p000;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.net.MessagingService;

/* renamed from: azfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azfb extends dck implements azfc {

    /* renamed from: a */
    final /* synthetic */ MessagingService f99215a;

    public azfb() {
        super("com.google.android.libraries.matchstick.net.IMessagingService");
    }

    /* renamed from: a */
    public final void mo54858a(String str) {
        this.f99215a.f111089i = str;
    }

    /* renamed from: b */
    public final void mo54859b(String str) {
        if (TextUtils.equals(this.f99215a.f111089i, str)) {
            this.f99215a.f111089i = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azfb(MessagingService messagingService) {
        super("com.google.android.libraries.matchstick.net.IMessagingService");
        this.f99215a = messagingService;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo54858a(parcel.readString());
        } else if (i != 2) {
            return false;
        } else {
            mo54859b(parcel.readString());
        }
        return true;
    }
}
