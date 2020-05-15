package p000;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0087com implements cot {

    /* renamed from: a */
    private final Set f7166a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f7167b;

    /* renamed from: c */
    private boolean f7168c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4037a() {
        this.f7167b = true;
        List a = crd.m7391a(this.f7166a);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ((cou) a.get(i)).mo3687c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4039b() {
        this.f7167b = false;
        List a = crd.m7391a(this.f7166a);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ((cou) a.get(i)).mo3688d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4041c() {
        this.f7168c = true;
        List a = crd.m7391a(this.f7166a);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ((cou) a.get(i)).mo3689e();
        }
    }

    /* renamed from: a */
    public final void mo4038a(cou cou) {
        this.f7166a.add(cou);
        if (this.f7168c) {
            cou.mo3689e();
        } else if (this.f7167b) {
            cou.mo3687c();
        } else {
            cou.mo3688d();
        }
    }

    /* renamed from: b */
    public final void mo4040b(cou cou) {
        this.f7166a.remove(cou);
    }
}
