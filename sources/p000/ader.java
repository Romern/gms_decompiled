package p000;

import android.accounts.Account;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ader */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ader implements adex {

    /* renamed from: a */
    final /* synthetic */ List f61511a;

    /* renamed from: b */
    final /* synthetic */ String f61512b;

    /* renamed from: c */
    final /* synthetic */ int f61513c;

    /* renamed from: d */
    final /* synthetic */ int f61514d;

    /* renamed from: e */
    final /* synthetic */ adet f61515e;

    public ader(adet adet, List list, String str, int i, int i2) {
        this.f61515e = adet;
        this.f61511a = list;
        this.f61512b = str;
        this.f61513c = i;
        this.f61514d = i2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo33395a() {
        adfb a = this.f61515e.f61521c.mo33411a();
        adff a2 = this.f61515e.f61522d.mo33416a();
        a.mo33409a("RouterBackendClient.getAppSplits.cumulative.gotRequestContextLoader");
        btio a3 = this.f61515e.mo33396a(a2, this.f61511a);
        a.mo33409a("RouterBackendClient.getAppSplits.cumulative.gotRequestContext");
        bxvd da = btia.f148929f.mo74144da();
        bxvd da2 = btiq.f149014e.mo74144da();
        String str = this.f61512b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btiq btiq = (btiq) da2.f164949b;
        str.getClass();
        btiq.f149016a = str;
        btiq.f149018c = this.f61513c;
        btiq.f149019d = this.f61514d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btiq btiq2 = (btiq) da2.mo74062i();
        btiq2.getClass();
        ((btia) da.f164949b).f148931a = btiq2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btia btia = (btia) da.f164949b;
        a3.getClass();
        btia.f148932b = a3;
        btia.f148933c = true;
        btia.f148934d = true;
        Bundle bundle = null;
        try {
            PackageInfo packageInfo = this.f61515e.f61520b.getPackageManager().getPackageInfo("com.google.android.instantapps.supervisor", 128);
            if (packageInfo.applicationInfo != null) {
                bundle = packageInfo.applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        boolean z = !(bundle != null ? bundle.getBoolean("instantapps.appinfohashcheck.enabled") : false);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btia) da.f164949b).f148935e = z;
        btia btia2 = (btia) da.mo74062i();
        new Object[1][0] = btia2;
        try {
            adej adej = this.f61515e.f61525g;
            Account c = adej.f61489a.mo33603c();
            if (c != null) {
                String a4 = adej.mo33389a(c);
                if (a4 != null) {
                    a.mo33409a("RouterBackendClient.getAppSplits.cumulative.gotAuthToken");
                    this.f61515e.f61524f.mo17798a("auth_token", a4);
                    this.f61515e.mo33399c();
                    adfb a5 = this.f61515e.f61521c.mo33411a();
                    try {
                        adet adet = this.f61515e;
                        adeu adeu = adet.f61523e;
                        ClientContext clientContext = adet.f61524f;
                        if (adeu.f61530c == null) {
                            adeu.f61530c = chtv.m149566a(chtu.UNARY, "google.internal.play.atoms.api.v1.WhApiService/GetAppSplits", ciie.m150370a(btia.f148929f), ciie.m150370a(btib.f148936m));
                        }
                        btib btib = (btib) adeu.f61534a.mo25553a(adeu.f61530c, clientContext, btia2, (long) adeu.f61529b, TimeUnit.MILLISECONDS);
                        a5.mo33409a("RouterBackendClient.getAppSplits.success");
                        a.mo33409a("RouterBackendClient.getAppSplits.cumulative.success");
                        return btib;
                    } catch (gid e2) {
                        a5.mo33409a("RouterBackendClient.getAppSplits.authFailure");
                        throw new chuw(chuv.f189223j);
                    }
                } else {
                    throw new chuw(chuv.f189223j);
                }
            } else {
                throw new adev("No eligible account");
            }
        } catch (adev e3) {
            throw new chuw(chuv.f189223j);
        }
    }
}
