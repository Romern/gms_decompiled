package p000;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avrt extends avrk {
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
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce  */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        if (avrl.mo51541h().mo66813a() && avrl.mo51542i().mo66813a()) {
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            if (i == 8) {
                avrl.mo51540g().mo51340G();
                avsf.mo51557a(false);
                avsf.mo51573l().setIndeterminate(true);
                Intent intent = new Intent("android.server.checkin.CHECKIN");
                intent.putExtra("force", true);
                intent.putExtra("fetchSystemUpdates", true);
                ((Activity) avrl).sendBroadcast(intent);
            } else if (i == 3) {
                SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
                Activity activity = (Activity) avrl;
                avry.m79125a(activity, avsf, systemUpdateStatus, avrl.mo51546m());
                avsf.mo51570i().setText((int) C0126R.string.system_update_install_failed_title_text);
                TextView j = avsf.mo51571j();
                int i2 = systemUpdateStatus.f109461c;
                StringBuilder sb = new StringBuilder();
                if (i2 != 263) {
                    if (i2 != 274) {
                        if (i2 != 519) {
                            if (i2 != 530) {
                                if (i2 != 775) {
                                    if (i2 != 786) {
                                        if (i2 != 1031) {
                                            if (!(i2 == 1042 || i2 == 1298)) {
                                                throw new IllegalStateException(String.format("Unable to handle the status: 0x%03X", Integer.valueOf(i2)));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    sb.append(activity.getString(C0126R.string.system_update_install_failed_button_qualifier_text));
                    if (avls.m78739e((Context) avrl)) {
                        sb.append(" (internal debugging only: see go/ota-known-issues");
                        if (i2 == 1042) {
                            sb.append(String.format(", update engine completion code: %d", Integer.valueOf(systemUpdateStatus.f109463e)));
                        }
                        sb.append(')');
                    }
                    j.setText(sb.toString());
                    avsf.mo51574m();
                    avsf.mo51569h().setVisibility(0);
                    avsf.mo51568g().setVisibility(0);
                    avsf.mo51567f().setVisibility(0);
                    avsf.mo51570i().setVisibility(0);
                    avsf.mo51571j().setVisibility(0);
                    avsf.mo51572k().setVisibility(8);
                    avsf.mo51575n();
                    avsf.mo51559b(false);
                    avsf.mo51555a((int) C0126R.string.common_try_again);
                    avsf.mo51557a(true);
                    avsf.mo51566e(false);
                    avsf.mo51564d(false);
                    avsf.mo51562c(false);
                }
                sb.append(activity.getString(C0126R.string.system_update_verify_failed_button_qualifier_text));
                if (avls.m78739e((Context) avrl)) {
                }
                j.setText(sb.toString());
                avsf.mo51574m();
                avsf.mo51569h().setVisibility(0);
                avsf.mo51568g().setVisibility(0);
                avsf.mo51567f().setVisibility(0);
                avsf.mo51570i().setVisibility(0);
                avsf.mo51571j().setVisibility(0);
                avsf.mo51572k().setVisibility(8);
                avsf.mo51575n();
                avsf.mo51559b(false);
                avsf.mo51555a((int) C0126R.string.common_try_again);
                avsf.mo51557a(true);
                avsf.mo51566e(false);
                avsf.mo51564d(false);
                avsf.mo51562c(false);
            }
        }
    }
}
