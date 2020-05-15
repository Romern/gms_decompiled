package p000;

import android.graphics.drawable.Drawable;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: avrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avrq extends avrk {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        if (avrl.mo51542i().mo66813a() && avrl.mo51541h().mo66813a() && i == 3) {
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            if (avsf.mo51563d() == 5) {
                int i2 = Build.VERSION.SDK_INT;
                bmxy.m108589a(true, (Object) "Unexpected manipulation of GLIF3 icon on unsupported platform version.");
                GlifLayout glifLayout = (GlifLayout) avsf.mo51565e();
                Drawable drawable = ((Activity) avrl).getDrawable(C0126R.C0127drawable.warning_icon);
                if (drawable != null) {
                    glifLayout.mo71362a(drawable);
                }
            }
            avsf.mo51574m();
            avsf.mo51570i().setText((int) C0126R.string.system_update_device_corruption_status_text);
            avsf.mo51570i().setVisibility(0);
            avsf.mo51567f().setText((int) C0126R.string.system_update_device_corruption_description_text);
            avsf.mo51567f().setVisibility(0);
            avsf.mo51571j().setVisibility(8);
            avsf.mo51557a(false);
            avsf.mo51575n();
            avsf.mo51562c(false);
            avsf.mo51559b(false);
            avsf.mo51564d(false);
            avsf.mo51566e(false);
            avsf.mo51568g().setVisibility(8);
        }
    }
}
