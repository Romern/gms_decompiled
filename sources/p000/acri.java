package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acri {

    /* renamed from: e */
    private static final Map f60607e = new HashMap();

    /* renamed from: a */
    public final Object f60608a = new Object();

    /* renamed from: b */
    public final Context f60609b;

    /* renamed from: c */
    public final acpl f60610c;

    /* renamed from: d */
    public abrv f60611d;

    /* renamed from: f */
    private final String f60612f;

    /* renamed from: g */
    private Thread f60613g;

    /* renamed from: h */
    private int f60614h;

    private acri(String str, Context context, acpl acpl) {
        this.f60612f = str;
        this.f60609b = context;
        this.f60610c = acpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        return r1;
     */
    /* renamed from: a */
    public static acri m49734a(String str, Context context) {
        synchronized (f60607e) {
            acri acri = (acri) f60607e.get(str);
            if (acri == null) {
                if (cemq.m137369f()) {
                    acri = new acri(str, context, new acpl(context, str, new Intent().setClassName(context, "com.google.android.gms.icing.service.IndexWorkerService").setAction("com.google.android.gms.icing.START_STICKY")));
                    f60607e.put(str, acri);
                } else {
                    absg.m48184a("StaticContext cannot be created as indexing is disabled on this device");
                    return null;
                }
            }
            m49735c();
            int i = acri.f60614h + 1;
            acri.f60614h = i;
            absg.m48185a("onCreate count=%d", Integer.valueOf(i));
            if (acri.f60614h == 1 && celx.f182928a.mo6606a().mo79296c() && acri.f60613g == null) {
                soa soa = new soa(10, new acpx(new abym(acri.f60609b)));
                acri.f60613g = soa;
                soa.start();
            }
        }
    }

    /* renamed from: c */
    private static void m49735c() {
        sdo.m34970a(Looper.getMainLooper() == Looper.myLooper());
    }

    /* renamed from: b */
    public final abrv mo33016b() {
        abrv abrv;
        synchronized (this.f60608a) {
            abrv = this.f60611d;
            if (abrv == null) {
                abrv = new abrv(this.f60609b, this.f60610c, this.f60612f);
                absg.m48185a("%s: Starting asynchronous initialization", this.f60612f);
                abrv.mo32299a(false);
                this.f60611d = abrv;
                new soa(10, new acrh(this, abrv)).start();
            } else {
                absg.m48185a("%s: Re-using cached", this.f60612f);
            }
        }
        return abrv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo33015a() {
        boolean z;
        m49735c();
        int i = this.f60614h - 1;
        this.f60614h = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "More calls to onDestroy than onCreate");
        absg.m48185a("onDestroy count=%d", Integer.valueOf(this.f60614h));
        if (this.f60614h == 0) {
            synchronized (this.f60608a) {
            }
            Thread thread = this.f60613g;
            if (thread != null) {
                thread.interrupt();
                this.f60613g = null;
            }
        }
    }
}
