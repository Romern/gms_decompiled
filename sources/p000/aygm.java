package p000;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;

/* renamed from: aygm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aygm extends aygz {

    /* renamed from: a */
    final /* synthetic */ AncsNotificationParcelable f97539a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aygm(String str, Intent intent, AncsNotificationParcelable ancsNotificationParcelable) {
        super(str, intent);
        this.f97539a = ancsNotificationParcelable;
    }

    /* renamed from: a */
    public final String mo53988a() {
        return this.f97539a.toString();
    }

    /* renamed from: a */
    public final void mo53989a(aygk aygk, axrv axrv) {
        axrv.mo53368a(this.f97539a);
    }

    /* renamed from: a */
    public final boolean mo53997a(IntentFilter[] intentFilterArr, boolean z, String str, String str2) {
        return z && super.mo53997a(intentFilterArr, true, str, str2);
    }
}
