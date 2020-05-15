package p000;

import android.content.Context;
import java.util.logging.Logger;

/* renamed from: vkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vkq {

    /* renamed from: f */
    private static vkq f49392f;

    /* renamed from: a */
    public final vhu f49393a;

    /* renamed from: b */
    public final vho f49394b = new vho();

    /* renamed from: c */
    public final vhg f49395c;

    /* renamed from: d */
    public final vhz f49396d;

    /* renamed from: e */
    public final vgz f49397e;

    /* renamed from: g */
    private final Context f49398g;

    private vkq(Context context, vpu vpu) {
        this.f49398g = context;
        this.f49393a = new vhu(this.f49398g, vpu.f49756c, vpu.f49757d);
        this.f49395c = new vhg(this.f49398g, this.f49393a, vpu.f49748G);
        Context context2 = this.f49398g;
        vho vho = this.f49394b;
        vhu vhu = this.f49393a;
        uhn uhn = vpu.f49757d;
        Logger logger = bkma.f124865a;
        this.f49396d = new vhz(context2, vho, vhu, uhn, vpu.f49776w, vpu.f49748G);
        this.f49397e = new vgz();
    }

    /* renamed from: a */
    public static vkq m40631a(Context context, vpu vpu) {
        vkq vkq;
        Context applicationContext = context.getApplicationContext();
        synchronized (vkq.class) {
            if (f49392f == null) {
                f49392f = new vkq(applicationContext, vpu);
            } else if (f49392f.f49398g != applicationContext) {
                throw new IllegalStateException("attempted to initialize Singletons multiple times with different application context instances.");
            }
            vkq = f49392f;
        }
        return vkq;
    }
}
