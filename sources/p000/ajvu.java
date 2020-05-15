package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ajvu */
public final /* synthetic */ class ajvu implements Callable {

    /* renamed from: a */
    private final ajvw f71383a;

    /* renamed from: b */
    private final Account f71384b;

    public ajvu(ajvw ajvw, Account account) {
        this.f71383a = ajvw;
        this.f71384b = account;
    }

    public final Object call() {
        bxoe bxoe;
        bxpn bxpn;
        int a;
        ajvw ajvw = this.f71383a;
        Account account = this.f71384b;
        Context context = ajvw.f71386a;
        Context applicationContext = context.getApplicationContext();
        akhh akhh = new akhh(context, new akhi(new shl(applicationContext, cfov.f185185a.mo6606a().mo82323af(), (int) cfov.f185185a.mo6606a().mo82324ag(), applicationContext.getApplicationInfo().uid, 9728)), applicationContext.getApplicationInfo().uid, applicationContext.getPackageName());
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = akhh.f71990c;
        clientContext.f30213c = account;
        String str = akhh.f71991d;
        clientContext.f30215e = str;
        clientContext.f30216f = str;
        clientContext.mo17806d("https://www.googleapis.com/auth/webhistory");
        Context context2 = akhh.f71988a;
        int i = 1;
        ajvr ajvr = null;
        try {
            String packageName = context2.getApplicationContext().getPackageName();
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(packageName, 0);
            bxvd da = bxoe.f164138e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxoe bxoe2 = (bxoe) da.f164949b;
            bxoe2.f164141b = 4;
            int i2 = bxoe2.f164140a | 1;
            bxoe2.f164140a = i2;
            packageName.getClass();
            bxoe2.f164140a = i2 | 2;
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
        if (bxoe != null) {
            try {
                akhi akhi = akhh.f71989b;
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
                int i3 = 4 | bxpk.f164282a;
                bxpk.f164282a = i3;
                bxpk.f164283b = language;
                bxoe.getClass();
                bxpk.f164284c = bxoe;
                bxpk.f164282a = i3 | 8;
                bxpk bxpk2 = (bxpk) da2.mo74062i();
                if (akhi.f71992b == null) {
                    akhi.f71992b = chtv.m149566a(chtu.UNARY, "footprints.oneplatform.FootprintsService/GetSettingText", ciie.m150370a(bxpk.f164280d), ciie.m150370a(bxpn.f164287c));
                }
                bxpn = (bxpn) akhi.f71993a.mo25553a(akhi.f71992b, clientContext, bxpk2, 10000, TimeUnit.MILLISECONDS);
                srn srn = ajvp.f71371a;
            } catch (chuw | gid e2) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("akhh", "a", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("FootprintsGrpcClient.getSettingText failed.");
                bxpn = null;
            }
        } else {
            bxpn = null;
        }
        if (bxpn != null) {
            if (bxpn.f164289a != 1) {
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                if (bxpn.f164289a == 2 && (a = bxpm.m122959a(((Integer) bxpn.f164290b).intValue())) != 0) {
                    i = a;
                }
                int i4 = i - 1;
                if (i != 0) {
                    bnsl3.mo68420a("Unable to get consent text for device contacts: uiNotAvailableReason=%s.", i4 != 2 ? i4 != 3 ? "Unknown" : "AlreadyAccepted" : "ShouldNotPrompt");
                } else {
                    throw null;
                }
            } else {
                bsnc bsnc = (bsnc) bxpn.f164290b;
                boab boab = bsnc.f146225a;
                if (boab == null) {
                    boab = boab.f132441b;
                }
                ajvr = new ajvr(ajvx.m59119a(boab), ajvx.m59120a(bsnc.f146226b), ajvx.m59120a(bsnc.f146228d), ajvx.m59120a(bsnc.f146227c), bsnc.f146229e, bsnc.f146230f);
            }
        }
        akhh.f71989b.f71993a.mo25561g();
        if (ajvr != null) {
            return ajvr;
        }
        throw new RemoteException("Unable to retrieve consent text.");
    }
}
