package p000;

/* renamed from: augj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class augj extends bqdt {

    /* renamed from: a */
    final /* synthetic */ augk f91764a;

    public augj(augk augk) {
        this.f91764a = augk;
    }

    /* renamed from: a */
    public final void mo50510a(aufs aufs) {
        super.mo69138b(aufs);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        augk augk = this.f91764a;
        augk.f91765a.unregisterReceiver(augk.f91767c);
        this.f91764a.f91768d.cancel();
        augk augk2 = this.f91764a;
        augk2.f91767c = null;
        augk2.f91768d = null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f91764a.f91769e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("SmsRequestFuture[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
