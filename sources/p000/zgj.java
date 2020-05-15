package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zgj {

    /* renamed from: c */
    private static final srn f55019c = zvt.m46581a();

    /* renamed from: d */
    private static final AtomicReference f55020d = new AtomicReference();

    /* renamed from: a */
    public final bnhe f55021a;

    /* renamed from: b */
    public final caae f55022b;

    /* renamed from: e */
    private final bnhe f55023e;

    /* renamed from: f */
    private final Context f55024f;

    /* renamed from: g */
    private final zgm f55025g;

    /* renamed from: h */
    private final Map f55026h = new EnumMap(bzzi.class);

    private zgj(Context context, zgm zgm) {
        this.f55024f = context;
        caaq a = zvn.m46574a(context);
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "com.google.android.gms.fitness.sensors.ACTIVITY_RECOGNITION");
        bmxy.m108582a(startIntent, "Failed to create startIntent for ActivityRecognitionIntentOperation.");
        bnha h = bnhe.m109414h();
        bnha h2 = bnhe.m109414h();
        bzzi[] values = bzzi.values();
        for (bzzi bzzi : values) {
            this.f55026h.put(bzzi, new ArrayList());
            h.mo67695b(bzzi, yxx.m44964a(bzzi, a));
            Intent intent = new Intent(startIntent);
            intent.setAction(bzzi.f171976c);
            h2.mo67695b(bzzi, PendingIntent.getService(context, 0, intent, 134217728));
        }
        this.f55021a = h.mo67618b();
        this.f55023e = h2.mo67618b();
        yyc a2 = yyd.m44987a();
        a2.mo30856a(caad.RAW);
        a2.mo30857a(bzzn.f172096ai);
        a2.mo30855a(yxy.f54800b);
        a2.mo30858a(a);
        a2.mo30859a("raw_sensor");
        this.f55022b = a2.mo30854a();
        this.f55025g = zgm;
    }

    /* renamed from: a */
    public static zgj m45375a(Context context, zgm zgm) {
        while (true) {
            zgj zgj = (zgj) f55020d.get();
            if (zgj != null) {
                return zgj;
            }
            f55020d.compareAndSet(null, new zgj(context, zgm));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized bqgg mo31089b() {
        return this.f55025g.mo31091a(this.f55024f);
    }

    /* renamed from: b */
    public final synchronized void mo31090b(bzzi bzzi) {
        PendingIntent pendingIntent = (PendingIntent) this.f55023e.get(bzzi);
        bmzs.m108696a(pendingIntent);
        if (!this.f55025g.mo31092a(this.f55024f, pendingIntent)) {
            bnsl bnsl = (bnsl) f55019c.mo68388c();
            bnsl.mo68432a("zgj", "b", 173, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to unregister from activity updates");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bngm mo31085a() {
        return this.f55021a.values();
    }

    /* renamed from: a */
    public final synchronized bngx mo31086a(bzzi bzzi) {
        ArrayList arrayList;
        arrayList = (ArrayList) this.f55026h.get(bzzi);
        bmzs.m108696a(arrayList);
        return bngx.m109368a((Collection) arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized bqgg mo31087a(String str, zgh zgh) {
        bzzi bzzi;
        zgh zgh2 = zgh;
        synchronized (this) {
            long millis = TimeUnit.MICROSECONDS.toMillis(zgh2.f55013c);
            long millis2 = TimeUnit.MICROSECONDS.toMillis(zgh2.f55014d);
            String str2 = zgh2.f55011a.f172328d;
            bzzi[] values = bzzi.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bzzi = null;
                    break;
                }
                bzzi bzzi2 = values[i];
                if (bzzi2.name().toLowerCase(Locale.ROOT).equals(str2)) {
                    bzzi = bzzi2;
                    break;
                }
                i++;
            }
            PendingIntent pendingIntent = (PendingIntent) this.f55023e.get(bzzi);
            bmzs.m108696a(pendingIntent);
            zgm zgm = this.f55025g;
            Context context = this.f55024f;
            String valueOf = String.valueOf(bzzi);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("fitness...ActivityClientManager");
            sb.append(valueOf);
            if (!zgm.mo31093a(context, str, sb.toString(), millis, millis2, cdzd.m135485n(), zgi.m45374a(zgh), pendingIntent)) {
                bnsl bnsl = (bnsl) f55019c.mo68388c();
                bnsl.mo68432a("zgj", "a", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unable to register to activity updates");
                bqgg a = bqga.m112775a((Object) false);
                return a;
            }
            ArrayList arrayList = (ArrayList) this.f55026h.get(bzzi);
            bmzs.m108696a(arrayList);
            arrayList.add(zgh2.f55012b);
            bqgg a2 = bqga.m112775a((Object) true);
            return a2;
        }
    }

    /* renamed from: a */
    public final synchronized void mo31088a(zgg zgg) {
        bzzi[] values = bzzi.values();
        for (bzzi bzzi : values) {
            ArrayList arrayList = (ArrayList) this.f55026h.get(bzzi);
            bmzs.m108696a(arrayList);
            if (arrayList.contains(zgg)) {
                arrayList.remove(zgg);
                if (arrayList.isEmpty()) {
                    mo31090b(bzzi);
                }
            }
        }
    }
}
