package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: adfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfg {

    /* renamed from: b */
    private static final adfs f61551b = new adfs("RequestContextLoader");

    /* renamed from: a */
    public final Context f61552a;

    public adfg(Context context) {
        this.f61552a = context;
    }

    /* renamed from: a */
    public static final void m50301a(Context context, adff adff) {
        sdo.m34959a(adff.f61547a);
        new Object[1][0] = adff.f61547a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("instantApps.ClientCookie", 0);
        String encodeToString = Base64.encodeToString(adff.f61547a.mo73642k(), 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("client_cookie", encodeToString);
        Integer num = adff.f61549c;
        if (num == null || adff.f61550d == null) {
            edit.remove("rating_authority");
            edit.remove("rating_value");
        } else {
            edit.putInt("rating_authority", num.intValue());
            edit.putInt("rating_value", adff.f61550d.intValue());
        }
        edit.apply();
    }

    /* renamed from: b */
    public final void mo33417b() {
        bnj bnj;
        adff adff = new adff();
        adff.f61547a = camf.f175264b;
        Context context = this.f61552a;
        Intent intent = new Intent("com.android.vending.contentfilters.IContentFiltersService.BIND");
        intent.setPackage("com.android.vending");
        rex rex = new rex();
        skh a = skh.m35531a();
        try {
            if (a.mo25690a(context.getApplicationContext(), intent, rex, 1)) {
                IBinder a2 = rex.mo24567a();
                Bundle bundle = null;
                if (a2 != null) {
                    IInterface queryLocalInterface = a2.queryLocalInterface("com.android.vending.contentfilters.IContentFiltersService");
                    bnj = !(queryLocalInterface instanceof bnj) ? new bnj(a2) : (bnj) queryLocalInterface;
                } else {
                    bnj = null;
                }
                Bundle a3 = bnj.mo3299a(new int[]{1});
                a.mo25689a(context, rex);
                if (a3 != null) {
                    bundle = a3.getBundle("1");
                }
                if (bundle != null) {
                    if (bundle.containsKey("authority")) {
                        adff.f61549c = Integer.valueOf(bundle.getInt("authority"));
                    }
                    if (bundle.containsKey("filter_level")) {
                        adff.f61550d = Integer.valueOf(bundle.getInt("filter_level"));
                    }
                }
                m50301a(this.f61552a, adff);
                return;
            }
            throw new adfe("Unable to read Finsky Content Filter settings");
        } catch (RemoteException | InterruptedException e) {
            throw new adfe(e);
        } catch (Throwable th) {
            a.mo25689a(context, rex);
            throw th;
        }
    }

    /* renamed from: a */
    public final adff mo33416a() {
        SharedPreferences sharedPreferences = this.f61552a.getSharedPreferences("instantApps.ClientCookie", 0);
        adff adff = new adff();
        adff.f61547a = camf.f175264b;
        if (ceow.f183163a.mo6606a().mo79504e()) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = this.f61552a.getPackageManager();
            for (String str : bmyx.m108640a(',').mo66918a((CharSequence) cepl.f183185a.mo6606a().mo79520D())) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                    String str2 = packageInfo.packageName;
                    int i = packageInfo.versionCode;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                    sb.append(str2);
                    sb.append(":");
                    sb.append(i);
                    arrayList.add(sb.toString());
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
            adff.f61548b = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        String string = sharedPreferences.getString("client_cookie", null);
        if (string != null) {
            try {
                adff.f61547a = (camf) bxvk.m124014a(camf.f175264b, Base64.decode(string, 0));
            } catch (bxwf e2) {
                sharedPreferences.edit().clear().apply();
                adfs adfs = f61551b;
                Log.wtf(adfs.f61571a, adfs.mo33428c(e2, "Error reading client cookie from shared preferences", new Object[0]));
            }
            if (sharedPreferences.contains("rating_authority")) {
                adff.f61549c = Integer.valueOf(sharedPreferences.getInt("rating_authority", 0));
            }
            if (sharedPreferences.contains("rating_value")) {
                adff.f61550d = Integer.valueOf(sharedPreferences.getInt("rating_value", 0));
            }
        }
        return adff;
    }
}
