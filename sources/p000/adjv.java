package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.instantapps.InstantAppIntentData;
import com.google.android.gms.instantapps.internal.RoutingOptions;

/* renamed from: adjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjv {

    /* renamed from: a */
    public static final adfs f61951a = new adfs("IntentMethods");

    /* renamed from: b */
    private final adjx f61952b;

    /* renamed from: c */
    private final adkd f61953c;

    /* renamed from: d */
    private final adfd f61954d;

    /* renamed from: e */
    private final int f61955e;

    public adjv(adjx adjx, adkd adkd, adfd adfd, int i) {
        this.f61952b = adjx;
        this.f61953c = adkd;
        this.f61954d = adfd;
        this.f61955e = i;
    }

    /* renamed from: a */
    private final Intent m50669a(String str, adfi adfi, long j, Bundle bundle, adkz adkz) {
        Intent a = adfo.m50309a(str, adfi.f61556b.packageName, j);
        if (bundle != null) {
            try {
                Intent intent = (Intent) bundle.getParcelable("key_fallbackIntent");
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.equals(a.getData())) {
                        throw new adfn("Fallback Intent URI does not match Instant App URL");
                    }
                    a.putExtra("key_fallbackIntent", intent);
                }
            } catch (ClassCastException e) {
                throw new adfn("Fallback Intent invalid type");
            }
        }
        adkz.mo33627a(1420);
        try {
            this.f61952b.mo33594a(a);
            adkz.mo33627a(1421);
            return a;
        } catch (adjw e2) {
            throw new adfn(e2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final InstantAppIntentData mo33593a(adfi adfi, String str, Bundle bundle, adkz adkz) {
        byte[] bArr;
        RoutingOptions routingOptions;
        InstantAppIntentData instantAppIntentData;
        String str2;
        String str3;
        adfi adfi2 = adfi;
        Bundle bundle2 = bundle;
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            adfd adfd = this.f61954d;
            adfd.mo33414a(adfi2.f61556b.packageName, adfi2.f61556b.versionCode);
            adfb a = adfd.mo33411a();
            if (bundle2 != null) {
                bArr = bundle2.getByteArray("key_routingOptions");
            } else {
                bArr = null;
            }
            if (bArr != null) {
                routingOptions = (RoutingOptions) sef.m35069a(bArr, RoutingOptions.CREATOR);
            } else {
                routingOptions = new RoutingOptions();
            }
            routingOptions.f79201f = true;
            adke a2 = this.f61953c.mo33597a(str, true, routingOptions, adkz, true);
            int i = a2.f61993a;
            int i2 = a2.f61996d;
            String str4 = a2.f61998f;
            new Object[1][0] = i2 != 0 ? "do not launch" : "may launch";
            if (i2 == 2) {
                instantAppIntentData = new InstantAppIntentData(null, 2, str4);
                str2 = "InstantAppsIntentMethods.Holdback";
            } else if (i == 4) {
                instantAppIntentData = InstantAppIntentData.f79133a;
                str2 = "InstantAppsIntentMethods.SupervisorNotAvailable";
            } else if (i == 0 && !a2.f61997e) {
                instantAppIntentData = InstantAppIntentData.f79133a;
                str2 = "InstantAppsIntentMethods.DestinationNotInstantApp";
            } else if (i == 3) {
                if (ceqd.f183252a.mo6606a().mo79578a()) {
                    instantAppIntentData = new InstantAppIntentData(adlb.m50785a(true).putExtra("downloadSupervisorRedirectIntent", m50669a(str, adfi, currentTimeMillis, bundle, adkz)).putExtra("downloadSupervisorShowPrompt", true), 0, str4);
                    str2 = "InstantAppsIntentMethods.ReinstallSupervisor";
                } else {
                    instantAppIntentData = InstantAppIntentData.f79133a;
                    str2 = "InstantAppsIntentMethods.WillNotReinstallSupervisor";
                }
            } else if (i == 2 || i == 1 || (a2.f61997e && this.f61955e == 0)) {
                if (i2 != 3) {
                    str3 = "InstantAppsIntentMethods.IntentReturned";
                } else {
                    str3 = "InstantAppsIntentMethods.UserPrefersBrowser";
                }
                if (cepu.f183241a.mo6606a().mo79571b() && this.f61955e != 0 && i2 == 3) {
                    instantAppIntentData = InstantAppIntentData.f79133a;
                } else if (this.f61955e == 0) {
                    Intent a3 = m50669a(str, adfi, currentTimeMillis, bundle, adkz);
                    adkz.mo33627a(1405);
                    a3.putExtra("key_eventListProtoBytes", adkz.mo33628a());
                    instantAppIntentData = new InstantAppIntentData(a3, i2, str4);
                } else {
                    Intent a4 = adfo.m50308a(str);
                    if (bundle2 != null) {
                        a4.putExtras(bundle2);
                    }
                    instantAppIntentData = new InstantAppIntentData(a4, i2, str4);
                }
                str2 = str3;
            } else {
                f61951a.mo33426b("Unknown result %d %d", 0, Integer.valueOf(i2));
                return InstantAppIntentData.f79133a;
            }
            a.mo33409a(str2);
            return instantAppIntentData;
        }
        throw new adfn("URL is null");
    }
}
