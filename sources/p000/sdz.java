package p000;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: sdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sdz implements sbg {

    /* renamed from: a */
    sex f44083a;

    /* renamed from: b */
    private final Context f44084b;

    /* renamed from: c */
    private final sts f44085c;

    /* renamed from: d */
    private final Object f44086d = new Object();

    public sdz(Context context) {
        sts sts = new sts(context);
        this.f44084b = context;
        this.f44085c = sts;
    }

    /* renamed from: a */
    public final ConnectionResult mo25330a(GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo) {
        if (!sts.m36312b()) {
            return new ConnectionResult(0);
        }
        String c = cdpf.f181509a.mo6606a().mo78141c();
        if (TextUtils.isEmpty(c)) {
            return new ConnectionResult(0);
        }
        for (String str : bmyx.m108640a(',').mo66918a((CharSequence) c)) {
            try {
                if (Integer.parseInt(str) == getServiceRequest.f30228b) {
                    return new ConnectionResult(0);
                }
            } catch (NumberFormatException e) {
                return new ConnectionResult(0);
            }
        }
        this.f44085c.mo26076a(3);
        if (!cdpf.f181509a.mo6606a().mo78140b()) {
            return new ConnectionResult(6, this.f44085c.mo26075a());
        }
        synchronized (this.f44086d) {
            if (this.f44083a == null) {
                sex a = sex.m35104a(this.f44084b);
                this.f44083a = a;
                if (a != null) {
                    int i = Build.VERSION.SDK_INT;
                    a.mo25442a(new NotificationChannel("uncertified_device", "Play Protect", 4));
                }
            }
        }
        sex sex = this.f44083a;
        String string = this.f44084b.getResources().getString(C0126R.string.play_protect_uncertified_device_notification_title);
        String string2 = this.f44084b.getResources().getString(C0126R.string.play_protect_uncertified_device_notification_content);
        if (sex != null) {
            C1102je jeVar = new C1102je(this.f44084b, "uncertified_device");
            jeVar.mo13640e(string);
            jeVar.mo13632b(string2);
            jeVar.mo13630b((int) C0126R.C0127drawable.quantum_ic_warning_googred_24);
            jeVar.f22271w = this.f44084b.getResources().getColor(C0126R.color.play_protect_google_red500);
            jeVar.mo13633b(true);
            C1101jd jdVar = new C1101jd();
            jdVar.mo13593a(string2);
            jeVar.mo13626a(jdVar);
            jeVar.f22258j = 2;
            jeVar.f22254f = this.f44085c.mo26075a();
            sex.mo25441a((int) C0126R.C0129id.play_protect_notification, jeVar.mo13629b());
        }
        return new ConnectionResult(9, null, string);
    }
}
