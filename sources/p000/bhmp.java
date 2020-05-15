package p000;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* renamed from: bhmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhmp implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            bhnd bhnd = (bhnd) message.obj;
            bhnd.f119110e.f119101d = new bhmv(bhnd);
            if (bhnd.f119110e.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = bhnd.f119110e.getLayoutParams();
                if (layoutParams instanceof aip) {
                    aip aip = (aip) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    baseTransientBottomBar$Behavior.f151224g.f119096a = bhnd.f119118m;
                    baseTransientBottomBar$Behavior.f151061f = new bhmx(bhnd);
                    aip.mo787a(baseTransientBottomBar$Behavior);
                    aip.f602g = 80;
                }
                bhnd.mo64017a();
                bhnd.f119110e.setVisibility(4);
                bhnd.f119108c.addView(bhnd.f119110e);
            }
            if (!C1280ps.m19868C(bhnd.f119110e)) {
                bhnd.f119110e.f119100c = new bhmw(bhnd);
            } else {
                bhnd.mo64024g();
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            bhnd bhnd2 = (bhnd) message.obj;
            int i2 = message.arg1;
            if (!bhnd2.mo64027j() || bhnd2.f119110e.getVisibility() != 0) {
                bhnd2.mo64028k();
            } else if (bhnd2.f119110e.f119098a != 1) {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(0, bhnd2.mo64025h());
                valueAnimator.setInterpolator(bhdl.f118328b);
                valueAnimator.setDuration(250L);
                valueAnimator.addListener(new bhmn(bhnd2, i2));
                valueAnimator.addUpdateListener(new bhmo(bhnd2));
                valueAnimator.start();
            } else {
                ValueAnimator a = bhnd2.mo64016a(1.0f, 0.0f);
                a.setDuration(75L);
                a.addListener(new bhmi(bhnd2, i2));
                a.start();
            }
            return true;
        }
    }
}
