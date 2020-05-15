package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: rj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1325rj extends C1304qp {

    /* renamed from: b */
    final /* synthetic */ C1326rk f26916b;

    public C1325rj(C1326rk rkVar) {
        this.f26916b = rkVar;
    }

    /* renamed from: a */
    public final C1301qm mo15792a(int i) {
        return C1301qm.m20017a(AccessibilityNodeInfo.obtain(this.f26916b.mo15806a(i).f26877a));
    }

    /* renamed from: b */
    public final C1301qm mo15794b(int i) {
        int i2 = i != 2 ? this.f26916b.f26921e : this.f26916b.f26920d;
        if (i2 != Integer.MIN_VALUE) {
            return mo15792a(i2);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo15793a(int i, int i2, Bundle bundle) {
        int i3;
        C1326rk rkVar = this.f26916b;
        if (i == -1) {
            return C1280ps.m19902a(rkVar.f26919c, i2, bundle);
        }
        if (i2 == 1) {
            return rkVar.mo15817c(i);
        }
        if (i2 == 2) {
            return rkVar.mo15818d(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return rkVar.mo15812a(i, i2);
            }
            return rkVar.mo15816b(i);
        } else if (!rkVar.f26918b.isEnabled() || !rkVar.f26918b.isTouchExplorationEnabled() || (i3 = rkVar.f26920d) == i) {
            return false;
        } else {
            if (i3 != Integer.MIN_VALUE) {
                rkVar.mo15816b(i3);
            }
            rkVar.f26920d = i;
            rkVar.f26919c.invalidate();
            rkVar.mo15815b(i, (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
            return true;
        }
    }
}
