package p000;

import android.app.ProgressDialog;
import android.content.Intent;
import android.util.Pair;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;
import java.io.Serializable;

/* renamed from: azkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azkf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Pair f99551a;

    /* renamed from: b */
    final /* synthetic */ azkg f99552b;

    public azkf(azkg azkg, Pair pair) {
        this.f99552b = azkg;
        this.f99551a = pair;
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
    public final void run() {
        azkg azkg = this.f99552b;
        Pair pair = this.f99551a;
        Object[] objArr = {pair.first, pair.second};
        if (((Boolean) pair.first).booleanValue() || ((Boolean) pair.second).booleanValue()) {
            CardChimeraActivity cardChimeraActivity = azkg.f99553a;
            int i = CardChimeraActivity.f111167L;
            if (cardChimeraActivity.f111177I) {
                Intent intent = cardChimeraActivity.getIntent();
                intent.putExtra("wait_for_anonymous_registration_finish", false);
                intent.putExtra("skip_enter_animation", true);
                intent.putExtra("invoke_with_anonymous_registration", (Serializable) pair.first);
                azkg.f99553a.setIntent(intent);
                ProgressDialog progressDialog = azkg.f99553a.f111175G;
                if (progressDialog != null && progressDialog.isShowing()) {
                    azkg.f99553a.f111175G.dismiss();
                }
                azkg.f99553a.recreate();
            }
        }
    }
}
