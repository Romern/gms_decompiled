package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.gms.carrierauth.EAPAKARequest;
import com.google.android.gms.carrierauth.EAPAKAResponse;
import com.google.android.gms.common.api.Status;
import java.util.UUID;

/* renamed from: oqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oqt extends aaab {

    /* renamed from: a */
    private final oqk f38246a;

    /* renamed from: b */
    private final oqo f38247b;

    /* renamed from: c */
    private final EAPAKARequest f38248c;

    /* renamed from: d */
    private final tds f38249d;

    /* renamed from: e */
    private final UUID f38250e = UUID.randomUUID();

    public oqt(Context context, oqk oqk, oqo oqo, EAPAKARequest eAPAKARequest) {
        super(191, "EAPAKA");
        this.f38246a = oqk;
        this.f38247b = oqo;
        this.f38248c = eAPAKARequest;
        this.f38249d = tds.m36774a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i;
        this.f38249d.mo26401a(this.f38250e, 16);
        if (!cdfh.m132920b()) {
            this.f38249d.mo26414b(this.f38250e, 70, 48);
            mo6503a(new Status(33001));
            return;
        }
        try {
            oqk oqk = this.f38246a;
            EAPAKARequest eAPAKARequest = this.f38248c;
            sek sek = oqk.f38239a;
            String valueOf = String.valueOf(eAPAKARequest.f29530c);
            String valueOf2 = String.valueOf(eAPAKARequest.f29529b);
            String valueOf3 = String.valueOf(eAPAKARequest.f29531d);
            String str = eAPAKARequest.f29528a;
            int length = String.valueOf(valueOf).length();
            StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(str).length());
            sb.append("req.appType: ");
            sb.append(valueOf);
            sb.append("; req.authType: ");
            sb.append(valueOf2);
            sb.append("; req.subId: ");
            sb.append(valueOf3);
            sb.append("; req.isimRequest: ");
            sb.append(str);
            sek.mo25412b(sb.toString(), new Object[0]);
            int i2 = Build.VERSION.SDK_INT;
            Integer num = eAPAKARequest.f29530c;
            int i3 = 2;
            if (!(num == null || num.intValue() == 0)) {
                i3 = eAPAKARequest.f29530c.intValue();
            }
            Integer num2 = eAPAKARequest.f29529b;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            TelephonyManager telephonyManager = oqk.f38240b;
            Integer num3 = eAPAKARequest.f29531d;
            if (num3 != null) {
                if (num3.intValue() != -1) {
                    telephonyManager = telephonyManager.createForSubscriptionId(eAPAKARequest.f29531d.intValue());
                }
            }
            String iccAuthentication = telephonyManager.getIccAuthentication(i3, i, eAPAKARequest.f29528a);
            sek sek2 = oqk.f38239a;
            String valueOf4 = String.valueOf(iccAuthentication);
            sek2.mo25412b(valueOf4.length() == 0 ? new String("resp: ") : "resp: ".concat(valueOf4), new Object[0]);
            this.f38249d.mo26402a(this.f38250e, 70, 8);
            this.f38247b.mo22513a(Status.f30107a, new EAPAKAResponse(iccAuthentication));
        } catch (UnsupportedOperationException e) {
            this.f38249d.mo26414b(this.f38250e, 70, 48);
            this.f38247b.mo22513a(new Status(33001), null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f38247b.mo22513a(status, null);
    }
}
