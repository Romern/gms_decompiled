package p000;

/* renamed from: nvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nvj {

    /* renamed from: a */
    public final nvi f36598a = new nvi();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final oos mo21642a() {
        if (!this.f36598a.isEmpty()) {
            return (oos) this.f36598a.peek();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo21644b(oos oos) {
        this.f36598a.push(oos);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo21643a(oos oos) {
        return oos == mo21642a();
    }
}
