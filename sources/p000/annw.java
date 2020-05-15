package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: annw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class annw implements Handler.Callback {

    /* renamed from: f */
    private static annw f77237f;

    /* renamed from: a */
    public final Handler f77238a = new adzt(Looper.getMainLooper(), this);

    /* renamed from: b */
    public final shj f77239b;

    /* renamed from: c */
    public final Context f77240c;

    /* renamed from: d */
    public final BitmapFactory.Options f77241d;

    /* renamed from: e */
    public final Resources f77242e;

    /* renamed from: g */
    private final ExecutorService f77243g = adzl.f62962b.mo25880c(4);

    /* renamed from: h */
    private final HashSet f77244h = new HashSet();

    private annw(Context context) {
        this.f77240c = context.getApplicationContext();
        this.f77239b = new shj(this.f77240c, null, null, true, false, null, null, 6400);
        this.f77242e = this.f77240c.getResources();
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.f77241d = options;
        options.inDensity = 320;
        this.f77241d.inTargetDensity = this.f77242e.getDisplayMetrics().densityDpi;
        this.f77241d.inScaled = true;
    }

    /* renamed from: a */
    public static annw m64835a(Context context) {
        if (f77237f == null) {
            f77237f = new annw(context);
        }
        return f77237f;
    }

    /* renamed from: b */
    public final void mo42018b(annv annv) {
        this.f77244h.remove(annv);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            annu annu = (annu) message.obj;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f77242e, annu.f77235b);
            Iterator it = this.f77244h.iterator();
            while (it.hasNext()) {
                ((annv) it.next()).mo42015a(annu.f77234a, bitmapDrawable);
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            annu annu2 = (annu) message.obj;
            Iterator it2 = this.f77244h.iterator();
            while (it2.hasNext()) {
                ((annv) it2.next()).mo42015a(annu2.f77234a, null);
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo42016a(annv annv) {
        this.f77244h.add(annv);
    }

    /* renamed from: a */
    public final void mo42017a(String str) {
        this.f77243g.execute(new annu(this, str));
    }
}
