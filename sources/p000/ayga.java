package p000;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;

/* renamed from: ayga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayga extends aygz {

    /* renamed from: a */
    final /* synthetic */ ChannelEventParcelable f97511a;

    /* renamed from: b */
    final /* synthetic */ axvz f97512b;

    /* renamed from: c */
    final /* synthetic */ String f97513c;

    /* renamed from: d */
    final /* synthetic */ String f97514d;

    /* renamed from: e */
    final /* synthetic */ int f97515e;

    /* renamed from: f */
    final /* synthetic */ int f97516f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayga(String str, Intent intent, ChannelEventParcelable channelEventParcelable, axvz axvz, String str2, String str3, int i, int i2) {
        super(str, intent);
        this.f97511a = channelEventParcelable;
        this.f97512b = axvz;
        this.f97513c = str2;
        this.f97514d = str3;
        this.f97515e = i;
        this.f97516f = i2;
    }

    /* renamed from: a */
    public final String mo53988a() {
        String valueOf = String.valueOf(this.f97512b);
        String str = this.f97513c;
        String str2 = this.f97514d;
        int i = this.f97515e;
        int i2 = this.f97516f;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 73 + String.valueOf(str).length() + str2.length());
        sb.append("token=");
        sb.append(valueOf);
        sb.append(", path=");
        sb.append(str);
        sb.append(", nodeId=");
        sb.append(str2);
        sb.append(", closeReason=");
        sb.append(i);
        sb.append(", appErrorCode=");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo53989a(aygk aygk, axrv axrv) {
        axrv.mo53370a(this.f97511a);
    }

    /* renamed from: a */
    public final boolean mo53997a(IntentFilter[] intentFilterArr, boolean z, String str, String str2) {
        if (str != null) {
            return str.equals(this.f97511a.f110902a.f110906a);
        }
        return super.mo53997a(intentFilterArr, z, null, str2);
    }
}
