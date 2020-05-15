package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.wearable.service.WearableChimeraService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: aygj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aygj {

    /* renamed from: a */
    public final Context f97523a;

    /* renamed from: b */
    public final Set f97524b = new HashSet();

    /* renamed from: c */
    public final boolean f97525c;

    /* renamed from: d */
    public final boolean f97526d;

    /* renamed from: e */
    public final axue f97527e;

    /* renamed from: f */
    public final aygg f97528f;

    /* renamed from: g */
    public volatile boolean f97529g;

    /* renamed from: h */
    private final Map f97530h = new HashMap();

    public aygj(Context context, aygg aygg, axue axue) {
        this.f97523a = context;
        this.f97527e = axue;
        this.f97528f = aygg;
        boolean z = false;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("com.google.android.gms.wearable.BIND_LISTENER").setPackage(axue.f96378b), 0);
        if (queryIntentServices != null) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                this.f97524b.add(mo54006a(resolveInfo.serviceInfo.name, aygg));
            }
        }
        this.f97525c = WearableChimeraService.m94435a(context, axue.f96378b);
        String str = axue.f96378b;
        int a = sqr.m35996a(context, str);
        if (a <= 0 && Log.isLoggable("WearableService", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("WearableService", valueOf.length() == 0 ? new String("package or google-play-services version not found: ") : "package or google-play-services version not found: ".concat(valueOf));
        }
        this.f97526d = a >= 8200000 ? true : z;
        this.f97529g = sqr.m36000c(context, axue.f96378b);
    }

    /* renamed from: a */
    public final aygk mo54006a(String str, aygg aygg) {
        aygk aygk;
        synchronized (this.f97530h) {
            aygk = (aygk) this.f97530h.get(str);
            if (aygk == null) {
                aygk = new aygk(this, str, aygg);
                this.f97530h.put(str, aygk);
            }
        }
        return aygk;
    }

    /* renamed from: a */
    public final void mo54007a(Context context) {
        synchronized (this.f97530h) {
            for (aygk aygk : this.f97530h.values()) {
                aygk.mo54009a(context);
            }
        }
    }
}
