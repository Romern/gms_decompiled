package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: zmf */
final /* synthetic */ class zmf implements Runnable {

    /* renamed from: a */
    private final zmi f55447a;

    /* renamed from: b */
    private final GetServiceRequest f55448b;

    /* renamed from: c */
    private final String f55449c;

    /* renamed from: d */
    private final int f55450d;

    /* renamed from: e */
    private final int f55451e;

    /* renamed from: f */
    private final sbj f55452f;

    public zmf(zmi zmi, GetServiceRequest getServiceRequest, String str, int i, int i2, sbj sbj) {
        this.f55447a = zmi;
        this.f55448b = getServiceRequest;
        this.f55449c = str;
        this.f55450d = i;
        this.f55451e = i2;
        this.f55452f = sbj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e4  */
    public final void run() {
        String str;
        zmh zmh;
        bmxv bmxv;
        boolean z;
        int i;
        zmi zmi = this.f55447a;
        GetServiceRequest getServiceRequest = this.f55448b;
        String str2 = this.f55449c;
        int i2 = this.f55450d;
        int i3 = this.f55451e;
        sbj sbj = this.f55452f;
        Account account = getServiceRequest.f30234h;
        Account a = getServiceRequest.mo17822a();
        Bundle bundle = null;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        String str3 = a != null ? a.name : null;
        bnic a2 = bnic.m109496a((Object[]) getServiceRequest.f30232f);
        boolean a3 = rzu.m34713a(getServiceRequest);
        yst b = zmi.f55462h.mo30874b();
        if (!a3) {
            try {
                str3 = b.mo30740b(str, str2);
                if (str3 == null) {
                    PendingIntent c = b.mo30742c(str, str2, a2);
                    if (c == null) {
                        i = 5;
                    } else {
                        i = 4;
                    }
                    zmh = new zmh(i, null, c);
                    if (zmh.f55458c != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", zmh.f55458c);
                    }
                    sbj.mo16678a(zmh.f55456a, zmh.f55457b, bundle);
                }
            } catch (ysu e) {
                bnsl bnsl = (bnsl) zmi.f55459a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68420a("%s failed to resolve account name", zmi.f55461b.mo31239b());
                zmh = new zmh(8);
            }
        }
        ytt ytt = new ytt(str2, i2, i3);
        if (str2.equals("com.google.android.gms")) {
            zmh = new zmh(0, zmi.f55461b.mo31240b(str3).mo31232a(ytt));
        } else {
            Status c2 = b.mo30741b(str3).mo30730c(str2, a2);
            if (!c2.mo17710c()) {
                ((bnsl) zmi.f55459a.mo68388c()).mo68424a("Unable to authenticate, package: %s scopes: %s", str2, a2);
                b.mo30712a(str3, str2, a2);
                zmh = new zmh(c2.f30115i, null, c2.f30117k);
            } else {
                b.mo30716b(str3, str2, a2);
                try {
                    zuu k = zmi.f55462h.mo30892k(str3);
                    if (k != null) {
                        SharedPreferences sharedPreferences = zmi.f43904d.getSharedPreferences("fitness_account_service_manager", 0);
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 12);
                        sb.append(str3);
                        sb.append(".lastChecked");
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 10);
                        sb3.append(str3);
                        sb3.append(".supported");
                        String sb4 = sb3.toString();
                        long a4 = zmi.f55462h.mo30869a().mo20505a() - sharedPreferences.getLong(sb2, Long.MIN_VALUE);
                        if (!sharedPreferences.contains(sb4) || a4 > TimeUnit.SECONDS.toMillis(cdyl.f181915a.mo6606a().mo78456e())) {
                            bmxv = bmvz.f131120a;
                        } else {
                            bmxv = bmxv.m108566b(Boolean.valueOf(sharedPreferences.getBoolean(sb4, false)));
                        }
                        if (bmxv.mo66813a() && a4 <= TimeUnit.SECONDS.toMillis(cdyl.f181915a.mo6606a().mo78457f())) {
                            z = ((Boolean) bmxv.mo66814b()).booleanValue();
                        } else if (!ssk.m36235a(zmi.f43904d)) {
                            if (bmxv.mo66813a()) {
                                z = ((Boolean) bmxv.mo66814b()).booleanValue();
                            } else {
                                throw new yqh("No network");
                            }
                        } else if (bmxv.mo66813a()) {
                            z = ((Boolean) bmxv.mo66814b()).booleanValue();
                            zmi.f55463i.execute(new zmg(zmi, k, str3));
                        } else {
                            z = zmi.mo31257a(k, str3, cdyl.f181915a.mo6606a().mo78459h());
                        }
                        if (!z) {
                            zmh = new zmh(5013);
                        }
                    }
                    zlz b2 = zmi.f55461b.mo31240b(str3);
                    zmh = b2 == null ? new zmh(8) : new zmh(0, b2.mo31232a(ytt));
                } catch (yqh e2) {
                    bnsl bnsl2 = (bnsl) zmi.f55459a.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68405a("Failed to determine if account is supported");
                    zmh = new zmh(7);
                }
            }
        }
        if (zmh.f55458c != null) {
        }
        try {
            sbj.mo16678a(zmh.f55456a, zmh.f55457b, bundle);
        } catch (RemoteException e3) {
            bnsl bnsl3 = (bnsl) zmi.f55459a.mo68388c();
            bnsl3.mo68437a(e3);
            bnsl3.mo68420a("%s failed to send response to caller", zmi.f55461b.mo31239b());
        }
    }
}
