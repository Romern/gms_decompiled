package p000;

import android.os.Message;

/* renamed from: aybr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aybr extends aycg {

    /* renamed from: a */
    final /* synthetic */ aybu f97035a;

    public aybr(aybu aybu) {
        this.f97035a = aybu;
    }

    /* renamed from: a */
    public final void mo53860a() {
        aybu aybu = this.f97035a;
        aybu.f97054d = new aybw();
        while (aybu.f97053c.size() >= 100) {
            aybu.f97053c.poll();
        }
        aybu.f97053c.add(aybu.f97054d);
        this.f97035a.mo53895b(4);
    }

    /* renamed from: a */
    public final boolean mo53861a(Message message) {
        return true;
    }

    /* renamed from: b */
    public final void mo53862b() {
        this.f97035a.mo53871d();
    }

    /* renamed from: c */
    public final String mo53863c() {
        return "ScanningState";
    }
}
