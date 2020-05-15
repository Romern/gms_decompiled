package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: ahj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahj {

    /* renamed from: a */
    private final Intent f543a = new Intent("android.intent.action.VIEW");

    /* renamed from: b */
    private final aha f544b = new aha();

    public ahj() {
    }

    /* renamed from: a */
    private final void m754a(IBinder iBinder) {
        Bundle bundle = new Bundle();
        C1004fv.m12455a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
        this.f543a.putExtras(bundle);
    }

    /* renamed from: a */
    public final void mo704a(int i) {
        this.f544b.f538a = Integer.valueOf(i | -16777216);
    }

    /* renamed from: b */
    public final void mo705b() {
        this.f543a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [fo, android.os.IBinder], assign insn: 0x0020: IGET  (r3v1 ? I:fo) = (r3v0 ahm) ahm.a fo */
    public ahj(ahm ahm) {
        if (ahm != null) {
            this.f543a.setPackage(ahm.f548b.getPackageName());
            m754a((IBinder) ahm.f547a);
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
    public final ahk mo703a() {
        if (!this.f543a.hasExtra("android.support.customtabs.extra.SESSION")) {
            m754a((IBinder) null);
        }
        this.f543a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        Intent intent = this.f543a;
        ahb ahb = new ahb(this.f544b.f538a);
        Bundle bundle = new Bundle();
        Integer num = ahb.f539a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle);
        return new ahk(this.f543a);
    }
}
