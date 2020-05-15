package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: anno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anno implements Handler.Callback {

    /* renamed from: e */
    private static anno f77208e;

    /* renamed from: a */
    public final Handler f77209a = new adzt(Looper.getMainLooper(), this);

    /* renamed from: b */
    public final shj f77210b;

    /* renamed from: c */
    public final Context f77211c;

    /* renamed from: d */
    public final BitmapFactory.Options f77212d;

    /* renamed from: f */
    private final ExecutorService f77213f = adzl.f62962b.mo25880c(4);

    /* renamed from: g */
    private final HashSet f77214g = new HashSet();

    /* renamed from: h */
    private final Resources f77215h;

    private anno(Context context) {
        this.f77211c = context.getApplicationContext();
        this.f77210b = new shj(this.f77211c, null, null, true, false, null, null, 6400);
        this.f77215h = this.f77211c.getResources();
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.f77212d = options;
        options.inDensity = 320;
        this.f77212d.inTargetDensity = this.f77215h.getDisplayMetrics().densityDpi;
        this.f77212d.inScaled = true;
    }

    /* renamed from: a */
    public static anno m64822a(Context context) {
        if (f77208e == null) {
            f77208e = new anno(context);
        }
        return f77208e;
    }

    /* renamed from: b */
    public final void mo41999b(annn annn) {
        this.f77214g.remove(annn);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            annm annm = (annm) message.obj;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f77215h, annm.f77205b);
            Iterator it = this.f77214g.iterator();
            while (it.hasNext()) {
                ((annn) it.next()).mo41933a(annm.f77204a, bitmapDrawable);
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            annm annm2 = (annm) message.obj;
            Iterator it2 = this.f77214g.iterator();
            while (it2.hasNext()) {
                ((annn) it2.next()).mo41933a(annm2.f77204a, null);
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo41997a(annn annn) {
        this.f77214g.add(annn);
    }

    /* renamed from: a */
    public final void mo41998a(anxl anxl, String str) {
        this.f77213f.execute(new annm(this, ApplicationEntity.m68424a(anxl), str));
    }
}
