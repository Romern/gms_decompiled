package p000;

import java.util.Set;

/* renamed from: bhti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhti implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhtn f119542a;

    /* renamed from: b */
    final /* synthetic */ Set f119543b;

    /* renamed from: c */
    final /* synthetic */ long[] f119544c;

    public bhti(bhtn bhtn, Set set, long[] jArr) {
        this.f119542a = bhtn;
        this.f119543b = set;
        this.f119544c = jArr;
    }

    public final void run() {
        this.f119542a.mo64221a(this.f119543b, this.f119544c);
    }
}
