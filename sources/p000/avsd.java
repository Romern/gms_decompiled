package p000;

import android.os.Build;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsd extends avrk {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        String str;
        if (avrl.mo51541h().mo66813a() && avrl.mo51542i().mo66813a()) {
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
            if (i == 4) {
                avry.m79124a(systemUpdateStatus.f109464f, avsf);
            } else if (i == 3) {
                boolean m = avrl.mo51546m();
                Activity activity = (Activity) avrl;
                avry.m79125a(activity, avsf, systemUpdateStatus, m);
                TextView i2 = avsf.mo51570i();
                int i3 = Build.VERSION.SDK_INT;
                if (!systemUpdateStatus.f109471m && systemUpdateStatus.f109461c != 15) {
                    str = activity.getString(C0126R.string.system_update_installing_title_text);
                } else {
                    str = activity.getString(C0126R.string.system_update_downloading_title_text);
                }
                i2.setText(str);
                boolean z = false;
                avsf.mo51569h().setVisibility(0);
                avsf.mo51567f().setVisibility(0);
                avsf.mo51568g().setVisibility(0);
                avsf.mo51570i().setVisibility(0);
                avsf.mo51571j().setVisibility(8);
                avsf.mo51572k().setVisibility(8);
                avsf.mo51557a(false);
                avsf.mo51575n();
                avsf.mo51559b(false);
                avsf.mo51566e(false);
                avsf.mo51564d(false);
                avsf.mo51562c(false);
                if (systemUpdateStatus.f109461c == 15) {
                    ProgressBar l = avsf.mo51573l();
                    if (systemUpdateStatus.f109464f <= 0.0d) {
                        z = true;
                    }
                    l.setIndeterminate(z);
                    avsf.mo51573l().setMax(100);
                    avsf.mo51573l().setProgress((int) (systemUpdateStatus.f109464f * 100.0d));
                    return;
                }
                avsf.mo51573l().setIndeterminate(true);
            }
        }
    }
}
