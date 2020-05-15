package p000;

import android.content.Intent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: azjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azjt implements suh {

    /* renamed from: a */
    final /* synthetic */ svm f99531a;

    /* renamed from: b */
    final /* synthetic */ azcb f99532b;

    /* renamed from: c */
    final /* synthetic */ azju f99533c;

    public azjt(azju azju, svm svm, azcb azcb) {
        this.f99533c = azju;
        this.f99531a = svm;
        this.f99532b = azcb;
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
    public final void mo7099a(View view, sui sui) {
        String str;
        boolean z = this.f99531a.f45239a;
        String a = this.f99532b.mo54588a();
        if (!z) {
            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = this.f99533c.f99534a;
            int i = MatchstickSettingsChimeraActivity.f111130A;
            if (!matchstickSettingsChimeraActivity.f111158w.contains(a)) {
                this.f99533c.f99534a.f111159x.add(a);
            } else {
                this.f99533c.f99534a.f111158w.remove(a);
            }
            Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.UNBLOCK_APP");
            intent.putExtra("server_app_id", a);
            intent.putExtra("sync_app_block_state_with_server", false);
            MessagingService.m94557b(intent, this.f99533c.f99534a);
            this.f99533c.f99534a.f111153r.mo55147a(261, a);
        } else {
            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity2 = this.f99533c.f99534a;
            int i2 = MatchstickSettingsChimeraActivity.f111130A;
            if (!matchstickSettingsChimeraActivity2.f111159x.contains(a)) {
                this.f99533c.f99534a.f111158w.add(a);
            } else {
                this.f99533c.f99534a.f111159x.remove(a);
            }
            Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.BLOCK_APP");
            intent2.putExtra("server_app_id", a);
            intent2.putExtra("sync_app_block_state_with_server", false);
            MessagingService.m94557b(intent2, this.f99533c.f99534a);
            this.f99533c.f99534a.f111153r.mo55147a(260, a);
        }
        this.f99531a.setChecked(!z);
        if (this.f99533c.f99534a.f111155t.isEnabled()) {
            if (z) {
                str = this.f99533c.f99534a.getString(C0126R.string.common_off);
            } else {
                str = this.f99533c.f99534a.getString(C0126R.string.common_on);
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
            obtain.getText().add(str);
            obtain.setEnabled(true);
            obtain.setClassName(getClass().getName());
            obtain.setPackageName(this.f99533c.f99534a.f111154s.getPackageName());
            this.f99533c.f99534a.f111155t.sendAccessibilityEvent(obtain);
        }
    }
}
