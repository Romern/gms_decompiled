package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avse extends avrk {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        if (avrl.mo51541h().mo66813a() && avrl.mo51542i().mo66813a() && i == 3) {
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            avsf.mo51566e(false);
            avsf.mo51564d(false);
            avsf.mo51562c(false);
            boolean m = avrl.mo51546m();
            avry.m79125a((Activity) avrl, avsf, (SystemUpdateStatus) avrl.mo51542i().mo66814b(), m);
            avsf.mo51570i().setText((int) C0126R.string.system_update_installing_title_text);
            avsf.mo51569h().setVisibility(0);
            avsf.mo51567f().setVisibility(0);
            avsf.mo51568g().setVisibility(0);
            avsf.mo51570i().setVisibility(0);
            avsf.mo51571j().setVisibility(8);
            avsf.mo51572k().setVisibility(8);
            avsf.mo51557a(false);
            avsf.mo51575n();
            avsf.mo51559b(false);
            avsf.mo51573l().setIndeterminate(true);
        }
    }
}
