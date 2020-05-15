package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceAuthInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentMap;

/* renamed from: gvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class gvc extends guy {

    /* renamed from: f */
    private static final sbw f19064f = new sbw("AccountTransfer", "[ATExternalAccountTransferBaseOperation]");

    /* renamed from: e */
    final AuthenticatorTransferInfo f19065e;

    public gvc(int i, guk guk, String str, AuthenticatorTransferInfo authenticatorTransferInfo, int i2, boolean z) {
        super(i, guk, str, i2, z);
        sdo.m34959a(authenticatorTransferInfo);
        this.f19065e = authenticatorTransferInfo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12256a(AuthenticatorTransferInfo authenticatorTransferInfo) {
        sbw sbw = f19064f;
        int i = this.f19051c;
        StringBuilder sb = new StringBuilder(61);
        sb.append("sendingResponse for Success with data sessionType:");
        sb.append(i);
        sbw.mo25379d(sb.toString());
        this.f19049a.mo12241a(Status.f30107a, authenticatorTransferInfo);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12257b() {
        mo12259b(new Status(20500));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12260c(Context context) {
        DeviceAuthInfo deviceAuthInfo;
        gub a = gub.m13906a();
        if (this.f19051c != 1) {
            synchronized (a.f19032k) {
                if (a.f19029h == null) {
                    a.f19029h = gvh.m13997a(context, 2);
                }
                deviceAuthInfo = a.f19029h;
            }
        } else {
            synchronized (a.f19032k) {
                if (a.f19028g == null) {
                    a.f19028g = gvh.m13997a(context, 1);
                }
                deviceAuthInfo = a.f19028g;
            }
        }
        DeviceMetaData deviceMetaData = new DeviceMetaData(1, deviceAuthInfo.f10070c, deviceAuthInfo.f10071d, gub.m13906a().mo12226a(context, this.f19051c).contains(this.f19065e.f10062c));
        if (this.f19052d) {
            gtz gtz = new gtz();
            gtz.f19018e = deviceMetaData;
            gtz.f19019f.add(6);
            gtz.mo12221a(this.f19065e.f10062c);
            mo12256a(gtz.mo12219a());
            return;
        }
        this.f19049a.mo12194a(deviceMetaData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12261d(Context context) {
        gtx gtx;
        f19064f.mo25379d(String.format("retrieveData() request:%s & sessionType:%d", this.f19065e, Integer.valueOf(this.f19051c)));
        ConcurrentMap c = gub.m13906a().mo12230c();
        String str = this.f19065e.f10062c;
        if (c.containsKey(str)) {
            gtx = (gtx) c.remove(str);
        } else {
            gtx = gvj.m14015b(context, this.f19065e);
        }
        if (gtx == null) {
            sbw sbw = f19064f;
            int i = this.f19051c;
            StringBuilder sb = new StringBuilder(45);
            sb.append("no data was retrieved sessionType:");
            sb.append(i);
            sbw.mo25379d(sb.toString());
            mo12259b(new Status(20501));
        } else if (gtv.m13893a(gtx.f19006b, context) || this.f19050b == Process.myUid()) {
            if (!this.f19052d) {
                this.f19049a.mo12193a(gtx.f19006b.f10055c.f10064e);
            } else {
                mo12256a(gtx.f19006b.f10055c);
            }
            gvj.m14012a(context, gtx.f19005a);
        } else {
            mo12257b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo12262e(Context context) {
        if (gtv.m13894a(this.f19065e.f10062c, this.f19051c, context)) {
            return true;
        }
        f19064f.mo25369a("Challenge not supported for account typo: %s for session type:%d", this.f19065e.f10062c, Integer.valueOf(this.f19051c));
        mo12259b(new Status(20503));
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo12263f(Context context) {
        String str = this.f19065e.f10062c;
        if (TextUtils.isEmpty(str)) {
            f19064f.mo25377c("AccountTransfer", "InvalidRequest. AccountType in request is not populated");
        } else if (gub.m13906a().mo12225a(context).containsKey(str)) {
            AuthenticatorTransferInfo authenticatorTransferInfo = this.f19065e;
            int i = authenticatorTransferInfo.f10063d;
            if (i == 4) {
                if (authenticatorTransferInfo.f10065f == null) {
                    f19064f.mo25377c("AccountTransfer", "InvalidRequest. Challenge requested but no Pending intent specified");
                }
            } else if (i == 3 && authenticatorTransferInfo.f10064e == null) {
                f19064f.mo25377c("AccountTransfer", "InvalidRequest. SEND_DATA requested but no Transfer data specified.");
            }
            if (gtv.m13892a(context, authenticatorTransferInfo.f10062c, this.f19050b)) {
                return true;
            }
            mo12257b();
            f19064f.mo25366a("AccountTransfer", "Security warning");
            return false;
        } else {
            f19064f.mo25377c("AccountTransfer", String.format("InvalidRequest. AccountType:%s in request is invalid", str));
        }
        gtv.m13890a(this.f19049a, this.f19052d);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        if (this.f19052d) {
            this.f19049a.mo12241a(status, (AuthenticatorTransferInfo) null);
        } else {
            this.f19049a.mo12196a(status);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12258b(Context context) {
        sbw sbw = f19064f;
        int i = this.f19051c;
        StringBuilder sb = new StringBuilder(49);
        sb.append("saveInfoAndCompleteWork() sessionType:");
        sb.append(i);
        sbw.mo25379d(sb.toString());
        long a = gvj.m14008a(context, this.f19065e);
        if (a >= 0) {
            if (this.f19052d) {
                mo12256a((AuthenticatorTransferInfo) null);
            } else {
                this.f19049a.mo12199a();
            }
            String[] strArr = {String.valueOf(a)};
            gtv.f19004a.mo25379d("notifySetup()");
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP");
            intent.setFlags(268435456);
            if (cccc.m129224b()) {
                intent.putExtra("key_extra_ids", strArr);
            }
            context.sendBroadcast(intent);
            return;
        }
        mo12259b(Status.f30109c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12259b(Status status) {
        if (this.f19052d) {
            this.f19049a.mo12241a(status, (AuthenticatorTransferInfo) null);
        } else {
            this.f19049a.mo12196a(status);
        }
    }
}
