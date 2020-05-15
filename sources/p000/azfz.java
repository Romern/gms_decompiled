package p000;

import android.content.Context;

/* renamed from: azfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azfz {

    /* renamed from: a */
    private final Object f99257a = new Object();

    /* renamed from: b */
    private final String f99258b;

    /* renamed from: c */
    private asfb f99259c;

    public azfz(String str) {
        this.f99258b = str;
    }

    /* renamed from: a */
    public final void mo54888a() {
        synchronized (this.f99257a) {
            asfb asfb = this.f99259c;
            if (asfb != null && asfb.mo49124e()) {
                this.f99259c.mo49120c();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo54890b() {
        boolean z;
        synchronized (this.f99257a) {
            asfb asfb = this.f99259c;
            z = false;
            if (asfb != null && asfb.mo49124e()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo54889a(Context context) {
        synchronized (this.f99257a) {
            if (this.f99259c == null) {
                this.f99259c = new asfb(context, this.f99258b, "com.google.android.gms");
            }
            this.f99259c.mo49117b();
        }
    }
}
