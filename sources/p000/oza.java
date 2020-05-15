package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: oza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oza {

    /* renamed from: a */
    public int f38643a = -1;

    /* renamed from: b */
    public int f38644b = -1;

    /* renamed from: c */
    public Intent f38645c;

    static {
        odk.m28481a("CAR.SETUP.FRX");
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
    public final void mo22798a(Context context) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f38643a != -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "connectionType is required");
        if (this.f38644b != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108601b(z2, "aaSupportResult is required");
        if (this.f38645c == null) {
            z3 = false;
        }
        bmxy.m108601b(z3, "continueIntent is required");
        Intent intent = new Intent();
        intent.setComponent(nzg.f37003e);
        intent.putExtra("PreSetup.AA_SUPPORT_RESULT", this.f38644b);
        intent.putExtra("PreSetup.CONTINUE_INTENT", this.f38645c);
        intent.putExtra("connection_type", this.f38643a);
        intent.putExtra("PreSetup.SKIP_TO_USB_RESET", false);
        intent.setFlags(276889600);
        context.startActivity(intent);
    }
}
