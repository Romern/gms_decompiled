package p000;

import java.util.concurrent.Future;

/* renamed from: asfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfa {

    /* renamed from: a */
    public boolean f88800a = true;

    /* renamed from: b */
    public Future f88801b;

    /* renamed from: c */
    final /* synthetic */ asfb f88802c;

    /* renamed from: d */
    private final String f88803d;

    public asfa(asfb asfb, String str) {
        this.f88802c = asfb;
        this.f88803d = str;
    }

    /* renamed from: a */
    public final void mo49109a() {
        asfb asfb = this.f88802c;
        asez asez = asfb.f88804n;
        synchronized (asfb.f88807a) {
            this.f88802c.f88809c.remove(this);
            if (this.f88800a) {
                this.f88800a = false;
                Future future = this.f88801b;
                if (future != null) {
                    future.cancel(false);
                    this.f88801b = null;
                }
                this.f88802c.mo49119b(this.f88803d);
            }
        }
    }
}
