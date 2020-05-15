package p000;

import android.os.Message;
import java.util.Vector;

/* renamed from: ayci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayci {

    /* renamed from: a */
    private final Vector f97124a = new Vector();

    /* renamed from: b */
    private int f97125b = 20;

    /* renamed from: c */
    private int f97126c = 0;

    /* renamed from: d */
    private int f97127d = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo53883a() {
        return this.f97124a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo53886b() {
        this.f97126c = 0;
        this.f97124a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo53887c() {
        this.f97125b = 50;
        this.f97127d = 0;
        mo53886b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized aych mo53884a(int i) {
        int i2;
        i2 = this.f97126c + i;
        int i3 = this.f97125b;
        if (i2 >= i3) {
            i2 -= i3;
        }
        return i2 < mo53883a() ? (aych) this.f97124a.get(i2) : null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo53885a(aycl aycl, Message message, String str, aycg aycg, aycg aycg2) {
        this.f97127d++;
        if (this.f97124a.size() < this.f97125b) {
            this.f97124a.add(new aych(aycl, message, str, aycg, aycg2));
            return;
        }
        aych aych = (aych) this.f97124a.get(this.f97126c);
        int i = this.f97126c + 1;
        this.f97126c = i;
        if (i >= this.f97125b) {
            this.f97126c = 0;
        }
        aych.mo53881a(aycl, message, str, aycg, aycg2);
    }
}
