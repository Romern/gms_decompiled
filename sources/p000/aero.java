package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: aero */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aero {

    /* renamed from: a */
    protected final Context f63682a;

    /* renamed from: b */
    protected final aeri f63683b;

    /* renamed from: c */
    public final C1223np f63684c = new C1223np(1);

    /* renamed from: d */
    public final aerc f63685d;

    /* renamed from: e */
    public final aerh f63686e;

    /* renamed from: f */
    public final C1225nr f63687f;

    /* renamed from: g */
    public boolean f63688g;

    /* renamed from: h */
    public boolean f63689h;

    public aero(Context context, aeri aeri) {
        this.f63682a = context;
        this.f63683b = aeri;
        this.f63685d = new aerl(this);
        this.f63686e = new aerm(this);
        this.f63687f = new C1225nr(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo34492a();

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo34493a(String str, boolean z) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -792039641) {
            if (hashCode != 97798435) {
                if (hashCode == 1843485230 && str.equals("network")) {
                    c = 0;
                    if (c != 0 && c != 1 && c != 2) {
                        mo34495b(str, z);
                        return;
                    }
                    return;
                }
            } else if (str.equals("fused")) {
                c = 2;
                if (c != 0) {
                    return;
                }
                return;
            }
        } else if (str.equals("passive")) {
            c = 1;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo34494b();

    /* renamed from: b */
    public final void mo34495b(String str, boolean z) {
        synchronized (this.f63684c) {
            int i = 0;
            if (z) {
                if (!this.f63687f.add(str)) {
                    return;
                }
            } else if (!this.f63687f.remove(str)) {
                return;
            }
            while (true) {
                C1223np npVar = this.f63684c;
                if (i < npVar.f26809h) {
                    aerd aerd = (aerd) npVar.mo15620b(i);
                    Executor executor = (Executor) this.f63684c.mo15621c(i);
                    executor.execute(new aern(this, aerd, executor, str, z));
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo34496c() {
        boolean z = false;
        if (this.f63688g && this.f63689h) {
            z = true;
        }
        mo34495b("network", z);
    }
}
