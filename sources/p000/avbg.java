package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import java.util.ArrayList;

/* renamed from: avbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbg extends avav {
    public avbg(Context context, avdl avdl, ClientContext clientContext, String str) {
        super(context, avdl, clientContext, str, "GetDeviceDataUploadOptedInAccountsOperation");
        this.f92888i = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        DeviceDataUploadOptInFlags deviceDataUploadOptInFlags;
        super.mo6502a(context);
        mo51133b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        avce.m78238a(this.f92882c);
        for (Account account : soz.m35801d(context, "com.google.android.gms")) {
            if (!chbh.m148008f()) {
                avcb a = new avcc(this.f92882c, account).mo51137a();
                if (a.f92942a.mo17710c()) {
                    deviceDataUploadOptInFlags = avbf.m78187a(this.f92882c, account, a, this.f92889j);
                } else {
                    Status status = a.f92942a;
                    throw new aaaj(status.f30115i, status.f30116j);
                }
            } else {
                deviceDataUploadOptInFlags = avjd.m78605a(avjf.f93267a.mo58362b(account));
            }
            if (deviceDataUploadOptInFlags.f109341b) {
                arrayList2.add(account.name);
            }
            if (deviceDataUploadOptInFlags.f109340a) {
                arrayList.add(account.name);
            }
        }
        mo51131a(0);
        this.f92883d.mo51157a(Status.f30107a, new DeviceDataUploadOptedInAccountsParcelable(arrayList, arrayList2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51131a(status.f30115i);
        this.f92883d.mo51157a(status, (DeviceDataUploadOptedInAccountsParcelable) null);
    }
}
