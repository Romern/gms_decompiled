package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.PowerManager;
import android.util.Pair;
import android.view.Display;
import java.util.ArrayList;

/* renamed from: aezs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezs implements aeyq {

    /* renamed from: a */
    private static avua f64050a;

    /* renamed from: b */
    private final Context f64051b;

    /* renamed from: c */
    private final PowerManager f64052c;

    /* renamed from: d */
    private final bosx f64053d;

    public aezs(Context context, bosx bosx) {
        this.f64051b = context;
        this.f64052c = (PowerManager) context.getSystemService("power");
        this.f64053d = bosx;
    }

    /* renamed from: a */
    public final aeyp mo34658a(long j) {
        int i;
        int i2;
        bxvd da = bowx.f135200f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bowx bowx = (bowx) da.f164949b;
        bowx.f135202a |= 4;
        bowx.f135204c = j;
        int i3 = Build.VERSION.SDK_INT;
        Display[] displays = ((DisplayManager) this.f64051b.getSystemService("display")).getDisplays();
        int length = displays.length;
        int i4 = 0;
        boolean z = false;
        while (true) {
            i = 2;
            boolean z2 = true;
            if (i4 >= length) {
                break;
            }
            if (displays[i4].getState() != 2) {
                z2 = false;
            }
            z |= z2;
            i4++;
        }
        if (!z) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bowx bowx2 = (bowx) da.f164949b;
        bowx2.f135205d = i2 - 1;
        bowx2.f135202a |= 32;
        if (!this.f64052c.isInteractive()) {
            i = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bowx bowx3 = (bowx) da.f164949b;
        bowx3.f135206e = i - 1;
        int i5 = bowx3.f135202a | 64;
        bowx3.f135202a = i5;
        bosx bosx = this.f64053d;
        bosx.getClass();
        bowx3.f135203b = bosx;
        bowx3.f135202a = i5 | 1;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Pair.create("LB_D", (bowx) da.mo74062i()));
        return new aezq(arrayList.iterator());
    }

    /* renamed from: a */
    public final String mo34660a(bxxc bxxc) {
        return "";
    }

    /* renamed from: b */
    public final boolean mo34661b() {
        return false;
    }

    /* renamed from: a */
    public final avua mo34659a() {
        if (f64050a == null) {
            f64050a = new aezr();
        }
        return f64050a;
    }
}
