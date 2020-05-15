package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: akhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akhh {

    /* renamed from: a */
    public final Context f71988a;

    /* renamed from: b */
    public final akhi f71989b;

    /* renamed from: c */
    public final int f71990c;

    /* renamed from: d */
    public final String f71991d;

    public akhh(Context context, akhi akhi, int i, String str) {
        this.f71988a = context;
        this.f71989b = akhi;
        this.f71990c = i;
        this.f71991d = str;
    }

    /* renamed from: a */
    private static final bxoe m59707a(Context context) {
        try {
            String packageName = context.getApplicationContext().getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            bxvd da = bxoe.f164138e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxoe bxoe = (bxoe) da.f164949b;
            bxoe.f164141b = 4;
            int i = bxoe.f164140a | 1;
            bxoe.f164140a = i;
            packageName.getClass();
            bxoe.f164140a = i | 2;
            bxoe.f164142c = packageName;
            bxoe.m122917a(bxoe);
            if (packageInfo.versionName != null) {
                String str = packageInfo.versionName;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxoe bxoe2 = (bxoe) da.f164949b;
                str.getClass();
                bxoe2.f164140a |= 4;
                bxoe2.f164143d = str;
            }
            return (bxoe) da.mo74062i();
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("akhh", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to get package info.");
            return null;
        }
    }

    /* renamed from: a */
    public final bxpn mo39446a(Account account) {
        bxoe bxoe;
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = this.f71990c;
        clientContext.f30213c = account;
        String str = this.f71991d;
        clientContext.f30215e = str;
        clientContext.f30216f = str;
        clientContext.mo17806d("https://www.googleapis.com/auth/webhistory");
        Context context = this.f71988a;
        try {
            String packageName = context.getApplicationContext().getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            bxvd da = bxoe.f164138e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxoe bxoe2 = (bxoe) da.f164949b;
            bxoe2.f164141b = 4;
            int i = bxoe2.f164140a | 1;
            bxoe2.f164140a = i;
            packageName.getClass();
            bxoe2.f164140a = i | 2;
            bxoe2.f164142c = packageName;
            bxoe.m122917a(bxoe2);
            if (packageInfo.versionName != null) {
                String str2 = packageInfo.versionName;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxoe bxoe3 = (bxoe) da.f164949b;
                str2.getClass();
                bxoe3.f164140a |= 4;
                bxoe3.f164143d = str2;
            }
            bxoe = (bxoe) da.mo74062i();
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("akhh", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to get package info.");
            bxoe = null;
        }
        if (bxoe == null) {
            return null;
        }
        try {
            akhi akhi = this.f71989b;
            bxvd da2 = bxpk.f164280d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxpk.m122956a((bxpk) da2.f164949b);
            String language = bute.m120428b().getLanguage();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxpk bxpk = (bxpk) da2.f164949b;
            language.getClass();
            int i2 = 4 | bxpk.f164282a;
            bxpk.f164282a = i2;
            bxpk.f164283b = language;
            bxoe.getClass();
            bxpk.f164284c = bxoe;
            bxpk.f164282a = i2 | 8;
            bxpk bxpk2 = (bxpk) da2.mo74062i();
            if (akhi.f71992b == null) {
                akhi.f71992b = chtv.m149566a(chtu.UNARY, "footprints.oneplatform.FootprintsService/GetSettingText", ciie.m150370a(bxpk.f164280d), ciie.m150370a(bxpn.f164287c));
            }
            bxpn bxpn = (bxpn) akhi.f71993a.mo25553a(akhi.f71992b, clientContext, bxpk2, 10000, TimeUnit.MILLISECONDS);
            srn srn = ajvp.f71371a;
            return bxpn;
        } catch (chuw | gid e2) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("akhh", "a", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("FootprintsGrpcClient.getSettingText failed.");
            return null;
        }
    }
}
