package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.chimera.ActivityBase;
import java.util.Random;

/* renamed from: azbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azbi {

    /* renamed from: a */
    private static Random f98899a;

    /* renamed from: b */
    static String m85191b(boolean z) {
        return cffp.f183941a.mo6606a().mo81126b().replace("apppreviewmessages", m85185a(z));
    }

    /* renamed from: a */
    public static Intent m85184a(Context context, String str, String str2) {
        String a = azot.m85965a(str, azot.m85963a((TelephonyManager) context.getSystemService("phone")));
        if (!TextUtils.isEmpty(a)) {
            return new Intent(str2).setPackage("com.google.android.apps.tachyon").setData(Uri.fromParts("tel", a, null));
        }
        azoj.m85932b("TachystickUtils", "Unable to format the number for Duo intent: %s.", str2);
        return null;
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
    /* renamed from: b */
    private static void m85192b(Context context) {
        String format = String.format("market://details?id=%s&referrer=%s", "com.google.android.apps.tachyon", m85191b(true));
        new Object[1][0] = format;
        Intent intent = new Intent("android.intent.action.VIEW").setData(Uri.parse(format)).putExtra("overlay", true).putExtra("callerId", "com.google.android.gms").setPackage("com.android.vending");
        try {
            azph.m85998a(context).mo55125a(1303);
            ((ActivityBase) context).startActivityForResult(intent, 1001);
        } catch (ActivityNotFoundException e) {
            azoj.m85932b("TachystickUtils", "Failed to launch play store. Fallback to play store link.", new Object[0]);
            azph.m85998a(context).mo55125a(1305);
            m85187a(context);
        }
    }

    /* renamed from: a */
    static String m85185a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("apppreviewmessages");
        if (z) {
            sb.append("ao");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static synchronized Random m85186a() {
        Random random;
        synchronized (azbi.class) {
            if (f98899a == null) {
                f98899a = new Random(System.currentTimeMillis());
            }
            random = f98899a;
        }
        return random;
    }

    /* renamed from: a */
    public static void m85187a(Context context) {
        azph.m85998a(context).mo55125a(1304);
        String valueOf = String.valueOf(cffp.f183941a.mo6606a().mo81127c());
        String valueOf2 = String.valueOf(m85191b(false));
        String str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        new Object[1][0] = str;
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    /* renamed from: a */
    public static void m85188a(Context context, String str) {
        new azbh(context, str).start();
    }

    /* renamed from: a */
    public static void m85189a(String str) {
        int i = Build.VERSION.SDK_INT;
        throw new RemoteException(str);
    }

    /* renamed from: a */
    public static boolean m85190a(Context context, Intent intent) {
        if (intent == null) {
            intent = new Intent("com.google.android.apps.tachyon.action.REGISTER").setPackage("com.google.android.apps.tachyon");
            intent.putExtra(ddr.f12947c, m85185a(false));
        }
        if (azpi.m86078b(context, "com.google.android.apps.tachyon") && azpi.m86070a(context, "com.google.android.apps.tachyon", Long.valueOf(cffm.f183935a.mo6606a().mo81120a()))) {
            try {
                ((ActivityBase) context).startActivityForResult(intent, 0);
                return false;
            } catch (ActivityNotFoundException e) {
                azoj.m85931a("TachystickUtils", e, "Unable to open Duo because activity wasn't found or Duo was too old.", new Object[0]);
                azph.m85998a(context).mo55125a(941);
            }
        }
        if (cffp.f183941a.mo6606a().mo81125a()) {
            m85192b(context);
            return true;
        }
        m85187a(context);
        return true;
    }
}
