package p000;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: avzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avzl {

    /* renamed from: a */
    private final Context f94107a;

    /* renamed from: b */
    private final Object f94108b = new Object();

    /* renamed from: c */
    private final String f94109c;

    /* renamed from: d */
    private final String f94110d;

    /* renamed from: e */
    private final String f94111e;

    /* renamed from: f */
    private final boolean f94112f;

    /* renamed from: g */
    private boolean f94113g;

    /* renamed from: h */
    private boolean f94114h;

    /* renamed from: i */
    private Object f94115i;

    public avzl(Context context, String str, String str2) {
        boolean z = false;
        this.f94113g = false;
        this.f94114h = false;
        this.f94107a = context;
        this.f94109c = str;
        StringBuilder sb = new StringBuilder(str2.length() + 39);
        sb.append("com.google.android.gms.vision.dynamite.");
        sb.append(str2);
        this.f94110d = sb.toString();
        this.f94111e = str2;
        if (context != null) {
            bdyx.m91615b(context);
            bnhe a = bnhe.m109411a("barcode", Boolean.valueOf(chef.f188522a.mo6606a().mo85168b()), "face", Boolean.TRUE, "ica", Boolean.valueOf(chef.f188522a.mo6606a().mo85169c()), "ocr", Boolean.TRUE);
            if (a.containsKey(str2) && ((Boolean) a.get(str2)).booleanValue()) {
                z = true;
            }
        }
        this.f94112f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo51745a(waq waq, Context context);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo51746a();

    /* renamed from: b */
    public final boolean mo51757b() {
        return mo51759d() != null;
    }

    /* renamed from: c */
    public final void mo51758c() {
        synchronized (this.f94108b) {
            if (this.f94115i != null) {
                try {
                    mo51746a();
                } catch (RemoteException e) {
                    Log.e(this.f94109c, "Could not finalize native handle", e);
                }
            }
        }
    }

    /* renamed from: d */
    public final Object mo51759d() {
        waq waq;
        synchronized (this.f94108b) {
            Object obj = this.f94115i;
            if (obj != null) {
                return obj;
            }
            try {
                waq = waq.m41676a(this.f94107a, waq.f50356d, this.f94110d);
            } catch (wam e) {
                Context context = this.f94107a;
                String str = this.f94111e;
                boolean z = this.f94112f;
                String format = String.format("%s.%s", "com.google.android.gms.vision", str);
                if (!z) {
                    format = "com.google.android.gms.vision.dynamite";
                }
                try {
                    new Object[1][0] = format;
                    waq = waq.m41676a(context, !z ? waq.f50356d : waq.f50353a, format);
                } catch (wam e2) {
                    avxz.m79526a(e2, "Error loading module %s optional module %b", format, Boolean.valueOf(z));
                    waq = null;
                }
                if (waq == null && this.f94112f && !this.f94113g) {
                    String str2 = this.f94111e;
                    if (str2.length() == 0) {
                        new String("Broadcasting download intent for dependency ");
                    } else {
                        "Broadcasting download intent for dependency ".concat(str2);
                    }
                    String str3 = this.f94111e;
                    Intent a = avzb.m79538a();
                    a.putExtra("com.google.android.gms.vision.DEPENDENCIES", str3);
                    a.setAction("com.google.android.gms.vision.DEPENDENCY");
                    this.f94107a.sendBroadcast(a);
                    this.f94113g = true;
                }
            }
            if (waq != null) {
                try {
                    this.f94115i = mo51745a(waq, this.f94107a);
                } catch (RemoteException | wam e3) {
                    Log.e(this.f94109c, "Error creating remote native handle", e3);
                }
            }
            if (!this.f94114h) {
                if (this.f94115i == null) {
                    Log.w(this.f94109c, "Native handle not yet available. Reverting to no-op handle.");
                    this.f94114h = true;
                }
            } else if (this.f94115i != null) {
                Log.w(this.f94109c, "Native handle is now available.");
            }
            Object obj2 = this.f94115i;
            return obj2;
        }
    }
}
