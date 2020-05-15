package p000;

import android.graphics.Path;
import android.util.Property;
import com.google.android.libraries.onegoogle.account.disc.RingView;

/* renamed from: bddj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bddj extends Property {
    public bddj(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((RingView) obj).f111395d);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        boolean z;
        RingView ringView = (RingView) obj;
        int intValue = ((Integer) obj2).intValue();
        if (intValue != ringView.f111395d) {
            boolean z2 = true;
            if (ringView.f111393b != -1) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108601b(z, "setRingThickness should be called before setCurrThickness");
            if (ringView.f111394c == -1) {
                z2 = false;
            }
            bmxy.m108601b(z2, "setRingRadius should be called before setCurrThickness");
            ringView.f111395d = intValue;
            int i = ringView.f111394c;
            int i2 = ringView.f111393b;
            ringView.f111392a.reset();
            Path path = ringView.f111392a;
            float f = (float) ringView.f111394c;
            path.addCircle(f, f, (float) ((i - i2) + intValue), Path.Direction.CW);
            ringView.invalidate();
        }
    }
}
