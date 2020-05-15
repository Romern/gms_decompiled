package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.fitness.store.listener.DataUpdateListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zsm implements Handler.Callback {

    /* renamed from: a */
    public static final srn f55804a = zvt.m46581a();

    /* renamed from: b */
    public final yst f55805b;

    /* renamed from: c */
    public final Handler f55806c;

    /* renamed from: d */
    public final Context f55807d;

    /* renamed from: e */
    public final yuc f55808e;

    /* renamed from: f */
    public final sqv f55809f;

    /* renamed from: g */
    public final int f55810g;

    /* renamed from: h */
    public final int f55811h;

    /* renamed from: i */
    public final int f55812i;

    /* renamed from: j */
    public final AtomicInteger f55813j = new AtomicInteger(0);

    /* renamed from: k */
    public final Map f55814k = new WeakHashMap();

    /* renamed from: l */
    public final Map f55815l = new WeakHashMap();

    /* renamed from: m */
    public final ytk f55816m;

    private zsm(Context context, Handler handler, int i, long j, int i2, int i3, int i4, ytk ytk, yst yst, sqv sqv) {
        Context applicationContext = context.getApplicationContext();
        yuc yuc = new yuc(i, j);
        this.f55816m = ytk;
        this.f55805b = yst;
        this.f55807d = applicationContext;
        this.f55806c = handler;
        this.f55808e = yuc;
        this.f55810g = i2;
        this.f55811h = i3;
        this.f55812i = i4;
        this.f55809f = sqv;
    }

    /* renamed from: a */
    public static zsm m46221a(Context context, Handler handler, int i, long j, int i2, int i3, int i4, ytk ytk, yst yst, sqv sqv) {
        return new zsm(context, handler, i, j, i2, i3, i4, ytk, yst, sqv);
    }

    /* renamed from: b */
    public final void mo31439b(String str, String str2, PendingIntent pendingIntent) {
        List a = mo31438a(str, str2, pendingIntent);
        boolean z = true;
        if (!a.isEmpty() && a.size() != 1) {
            z = false;
        }
        bmxy.m108600b(z);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f55816m.mo30752b((DataUpdateListener) a.get(i));
        }
        DataUpdateListener dataUpdateListener = (DataUpdateListener) bnjd.m109589b(a, (Object) null);
    }

    public final boolean handleMessage(Message message) {
        return false;
    }

    /* renamed from: a */
    public final List mo31438a(String str, String str2, PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        for (DataUpdateListener dataUpdateListener : this.f55816m.mo30751b()) {
            if (dataUpdateListener.f32449a.equals(str) && ((str2 == null || str2.equals(dataUpdateListener.f32450b)) && (pendingIntent == null || bmxi.m108538a(pendingIntent, dataUpdateListener.f32453e)))) {
                arrayList.add(dataUpdateListener);
            }
        }
        return arrayList;
    }
}
