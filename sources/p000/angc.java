package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: angc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angc {
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
    public static cahq m64195a(Context context, String str, String str2, int i, boolean z) {
        Intent intent = new Intent("com.google.android.gms.phenotype.UPDATE");
        if (cgdy.f186626a.mo6606a().mo83514b()) {
            intent.setFlags(32);
        }
        intent.setPackage(str2);
        if (!cgdy.f186626a.mo6606a().mo83515c()) {
            intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
        } else {
            String a = angb.m64191a(str);
            if ((angb.m64194c(a).f142111a & 2) != 0) {
                intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", a);
                int indexOf = str.indexOf(35);
                if (indexOf != -1) {
                    String substring = str.substring(indexOf + 1);
                    if (!TextUtils.isEmpty(substring)) {
                        intent.putExtra("com.google.android.gms.phenotype.SUBPACKAGE_NAME", substring);
                    }
                }
            } else {
                intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
            }
        }
        intent.putExtra("com.google.android.gms.phenotype.UPDATE_REASON", i);
        if (z) {
            intent.putExtra("com.google.android.gms.phenotype.URGENT", true);
        }
        context.sendBroadcast(intent);
        if (!cgec.f186635a.mo6606a().mo83525f()) {
            return null;
        }
        bxvd da = cahq.f174586f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cahq cahq = (cahq) da.f164949b;
        str.getClass();
        int i2 = cahq.f174588a | 1;
        cahq.f174588a = i2;
        cahq.f174589b = str;
        str2.getClass();
        int i3 = i2 | 2;
        cahq.f174588a = i3;
        cahq.f174590c = str2;
        int i4 = i3 | 4;
        cahq.f174588a = i4;
        cahq.f174591d = i;
        cahq.f174588a = i4 | 8;
        cahq.f174592e = z;
        return (cahq) da.mo74062i();
    }
}
