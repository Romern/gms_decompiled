package p000;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: acsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acsj implements bdru {

    /* renamed from: a */
    private final int f60680a;

    /* renamed from: b */
    private boolean f60681b = false;

    /* renamed from: c */
    private ArrayList f60682c = new ArrayList();

    public acsj(int i) {
        boolean z = false;
        sdo.m34974b(i >= 0 ? true : z);
        this.f60680a = i;
    }

    /* renamed from: b */
    private final void m49802b() {
        this.f60681b = true;
        this.f60682c.clear();
    }

    /* renamed from: a */
    public final synchronized bqgg mo33056a() {
        m49802b();
        return bqga.m112775a((Object) null);
    }

    /* renamed from: a */
    public final synchronized bqgg mo33057a(Collection collection) {
        if (!this.f60681b) {
            if (collection.size() > this.f60680a - this.f60682c.size()) {
                m49802b();
            } else {
                this.f60682c.addAll(collection);
            }
        }
        return bqga.m112775a((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo33058a(acsm acsm) {
        if (this.f60681b) {
            acsm.mo33061b();
            this.f60681b = false;
        } else if (!this.f60682c.isEmpty()) {
            acsm.mo33062c();
            this.f60682c = new ArrayList();
        }
    }
}
