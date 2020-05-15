package p000;

import android.content.Intent;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* renamed from: aygv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aygv extends aygz {

    /* renamed from: a */
    final /* synthetic */ MessageEventParcelable f97551a;

    /* renamed from: b */
    final /* synthetic */ byte[] f97552b;

    /* renamed from: c */
    final /* synthetic */ String f97553c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aygv(String str, Intent intent, MessageEventParcelable messageEventParcelable, byte[] bArr, String str2) {
        super(str, intent);
        this.f97551a = messageEventParcelable;
        this.f97552b = bArr;
        this.f97553c = str2;
    }

    /* renamed from: a */
    public final String mo53988a() {
        StringBuilder sb = new StringBuilder("requestId=");
        sb.append(this.f97551a.f110946a);
        sb.append(", action=");
        sb.append(this.f97551a.f110947b);
        sb.append(", dataSize=");
        byte[] bArr = this.f97552b;
        sb.append(bArr != null ? Integer.valueOf(bArr.length) : null);
        sb.append(", source=");
        sb.append(this.f97553c);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo53989a(aygk aygk, axrv axrv) {
        axrv.mo53371a(this.f97551a);
    }
}
