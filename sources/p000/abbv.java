package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* renamed from: abbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abbv extends abce {

    /* renamed from: a */
    final /* synthetic */ Intent f57023a;

    /* renamed from: b */
    final /* synthetic */ WeakReference f57024b;

    /* renamed from: c */
    final /* synthetic */ abbz f57025c;

    /* renamed from: d */
    final /* synthetic */ aard f57026d;

    /* renamed from: e */
    final /* synthetic */ wvd f57027e;

    public abbv(Intent intent, WeakReference weakReference, abbz abbz, aard aard, wvd wvd) {
        this.f57023a = intent;
        this.f57024b = weakReference;
        this.f57025c = abbz;
        this.f57026d = aard;
        this.f57027e = wvd;
    }

    /* renamed from: a */
    public final void mo31999a(GoogleHelp googleHelp) {
        ViewGroup viewGroup;
        boolean z;
        GoogleHelp googleHelp2 = googleHelp;
        long nanoTime = System.nanoTime();
        this.f57023a.putExtra("EXTRA_START_TICK", nanoTime);
        Activity activity = (Activity) this.f57024b.get();
        if (activity == null) {
            this.f57025c.mo17719d(abca.f57032a);
            return;
        }
        if (!(this.f57026d == null && this.f57027e == null)) {
            abck abck = new abck(googleHelp2);
            Context applicationContext = activity.getApplicationContext();
            wvd wvd = this.f57027e;
            aard aard = this.f57026d;
            aare aare = new aare(abck.f57036a);
            if (aard != null) {
                aare.f56363a.f78750A = true;
                z = true;
                abck.m47447a(new abbm(applicationContext, abck.f57036a, aard, nanoTime), 4);
            } else {
                z = true;
            }
            if (wvd != null) {
                aare.f56363a.f78751B = z;
                abck.m47447a(new abbk(applicationContext, abck.f57036a, wvd, nanoTime), 4);
                abck.m47447a(new abbl(applicationContext, abck.f57036a, wvd, nanoTime), 4);
            }
        }
        aare aare2 = new aare(googleHelp2);
        aare2.f56363a.f78783z = rfi.f42869b;
        if (aare2.mo31638d() != null) {
            TogglingData d = aare2.mo31638d();
            String charSequence = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        charSequence = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            d.f78990c = charSequence;
        }
        abbz abbz = this.f57025c;
        Intent intent = this.f57023a;
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp2);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            InProductHelp inProductHelp = (InProductHelp) sef.m35067a(intent, "EXTRA_IN_PRODUCT_HELP", InProductHelp.CREATOR);
            inProductHelp.f78784a = googleHelp2;
            sef.m35071a(inProductHelp, intent, "EXTRA_IN_PRODUCT_HELP");
        }
        activity.startActivityForResult(intent, 123);
        abbz.mo17716a((rkk) Status.f30107a);
    }
}
