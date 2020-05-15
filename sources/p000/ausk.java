package p000;

import java.util.concurrent.Future;

/* renamed from: ausk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ausk extends ausr {

    /* renamed from: a */
    final /* synthetic */ ausl f92420a;

    /* renamed from: b */
    final /* synthetic */ Future f92421b;

    /* renamed from: c */
    final /* synthetic */ ausa f92422c;

    public ausk(ausl ausl, Future future, ausa ausa) {
        this.f92420a = ausl;
        this.f92421b = future;
        this.f92422c = ausa;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo50871a() {
        return this.f92420a.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50872b() {
        this.f92421b.cancel(true);
        ausa ausa = this.f92422c;
        ausa.f92397a.mo50854a(ausa.f92398b.mo50909a(), ausf.f92405b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo50873c() {
        return this.f92421b.isDone();
    }
}
