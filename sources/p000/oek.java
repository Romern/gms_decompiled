package p000;

import android.os.ConditionVariable;
import java.util.HashSet;
import java.util.List;

/* renamed from: oek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oek implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConditionVariable f37367a;

    /* renamed from: b */
    final /* synthetic */ oen f37368b;

    public oek(oen oen, ConditionVariable conditionVariable) {
        this.f37368b = oen;
        this.f37367a = conditionVariable;
    }

    public final void run() {
        this.f37368b.f37379f = ccuf.f179931a.mo6606a().mo76787C();
        this.f37368b.f37376c = oen.m28583a(ccuf.f179931a.mo6606a().mo76790a());
        this.f37368b.f37377d = oen.m28583a(ccuf.f179931a.mo6606a().mo76791b());
        oen oen = this.f37368b;
        List<String> c = oen.f37372b.mo66925c((CharSequence) ccuf.f179931a.mo6606a().mo76813x());
        HashSet hashSet = new HashSet();
        for (String str : c) {
            nhg b = oen.m28591b(str);
            if (b != null) {
                hashSet.add(b);
            }
        }
        oen.f37378e = hashSet;
        this.f37368b.f37380g = ccuf.f179931a.mo6606a().mo76785A();
        this.f37368b.f37381h.countDown();
        this.f37367a.open();
    }
}
