package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Iterator;

/* renamed from: aacx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aacx extends rzu {
    public aacx(Context context) {
        super(context, 1, new int[0]);
    }

    /* renamed from: a */
    private static int m21105a(Context context) {
        try {
            return svr.m36484b(context).mo26176b("com.google.android.play.games", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16737a(int i, sck sck, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        Bundle bundle2 = bundle != null ? bundle : new Bundle();
        bundle2.putString("com.google.android.gms.games.key.gamePackageName", str3);
        bundle2.putString("com.google.android.gms.games.key.desiredLocale", str4);
        bundle2.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(iBinder));
        super.mo16737a(i, sck, i2, str, str2, strArr, bundle2, iBinder, str3, str4);
    }

    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        Bundle bundle;
        String str;
        int i;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        ClassLoader classLoader = getClass().getClassLoader();
        Context context = this.f43904d;
        int i2 = getServiceRequest2.f30229c;
        StringBuilder sb = new StringBuilder(42);
        sb.append("client connected with version: ");
        sb.append(i2);
        aaeg.m21154a("GamesServiceBroker", sb.toString());
        Account account = getServiceRequest2.f30234h;
        Bundle bundle2 = getServiceRequest2.f30233g;
        bundle2.setClassLoader(classLoader);
        String string = bundle2.getString("com.google.android.gms.games.key.gamePackageName");
        int i3 = 2;
        aacz.m21111a(context, 2, account, string);
        if (account == null || TextUtils.isEmpty(string)) {
            String str2 = account != null ? "not null" : "null";
            StringBuilder sb2 = new StringBuilder(str2.length() + 79 + String.valueOf(string).length());
            sb2.append("Play games failed to connect. Invalid parameters account = ");
            sb2.append(str2);
            sb2.append(", gamePackageName = ");
            sb2.append(string);
            str = sb2.toString();
            aacz.m21111a(context, 3, account, string);
            i3 = -1;
            bundle = null;
        } else {
            int i4 = rfi.f42869b;
            int a = sqr.m35996a(context, "com.google.android.play.games");
            int a2 = m21105a(context);
            try {
                Iterator it = ModuleManager.get(context).getAllModules().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = 0;
                        break;
                    }
                    ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                    if ("com.google.android.gms.games".equals(moduleInfo.moduleId)) {
                        i = moduleInfo.moduleVersion;
                        break;
                    }
                }
            } catch (InvalidConfigException e) {
                aaeg.m21158b("GamesServiceBroker", "Can't get games stub module version", e);
                i = 0;
            }
            aaeg.m21157b("GamesServiceBroker", String.format("Client connected with SDK %s, Services %s, Stub module %s, and Games %s", Integer.valueOf(getServiceRequest2.f30229c), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(a2)));
            if (a > i4 || cear.f182181a.mo6606a().mo78701d() > ((long) i4)) {
                aacz.m21111a(context, 4, account, string);
                str = "Play services is out of date; newer version required";
                bundle = null;
            } else if (cear.f182181a.mo6606a().mo78699b() || soz.m35809g(context, "uca").isEmpty()) {
                if (aaeg.m21156a(3)) {
                    aaeg.m21154a("GamesServiceBroker", "did not meet criteria to check for unicorn");
                }
                if ((cear.f182181a.mo6606a().mo78698a() && a2 > 0) || "com.google.android.play.games".equals(string)) {
                    try {
                        aaeg.m21157b("GamesServiceBroker", "Let's wait some time.");
                        aacz.m21111a(context, 9, account, string);
                        Thread.sleep(cear.f182181a.mo6606a().mo78702e());
                        aacz.m21111a(context, 10, account, string);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                    }
                    int a3 = m21105a(context);
                    if (a3 != a2) {
                        aacz.m21111a(context, 7, account, string);
                        aaeg.m21157b("GamesServiceBroker", String.format("Games are updated to %s", Integer.valueOf(a3)));
                        a2 = a3;
                    }
                }
                if (a2 <= i) {
                    String a4 = spn.m35849a(context, string, "com.google.android.gms.games.APP_ID");
                    int hashCode = string.hashCode();
                    Intent intent = new Intent("com.google.android.gms.games.PLAY_GAMES_UPGRADE");
                    intent.setPackage(context.getPackageName());
                    intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", string);
                    intent.putExtra("com.google.android.gms.games.GAME_ID", a4);
                    PendingIntent activity = PendingIntent.getActivity(context, hashCode, intent, 134217728);
                    bundle = new Bundle();
                    bundle.putParcelable("pendingIntent", activity);
                    i3 = 6;
                    aacz.m21111a(context, 6, account, string);
                    str = "Launching Play games upgrade activity";
                } else {
                    aaeg.m21159c("GamesServiceBroker", "Waiting didn't help.");
                    aacz.m21111a(context, 8, account, string);
                    i3 = 18;
                    str = null;
                    bundle = null;
                }
            } else {
                aacz.m21111a(context, 5, account, string);
                i3 = 13;
                str = "Play games does not support unicorn accounts";
                bundle = null;
            }
        }
        if (str != null && aaeg.m21156a(5)) {
            aaeg.m21157b("GamesServiceBroker", str);
        }
        try {
            sbj.mo16678a(i3, (IBinder) null, bundle);
        } catch (RemoteException e3) {
            aaeg.m21155a("GamesServiceBroker", "Remote exception during get service", e3);
        }
    }
}
