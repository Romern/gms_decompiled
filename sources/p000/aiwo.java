package p000;

import com.google.location.nearby.messages.debug.internal.DebugPokeRequest;

/* renamed from: aiwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwo extends buqn {

    /* renamed from: a */
    final /* synthetic */ DebugPokeRequest f69945a;

    /* renamed from: b */
    final /* synthetic */ aiwp f69946b;

    /* renamed from: c */
    final /* synthetic */ bvhc f69947c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiwo(aiwp aiwp, String str, bvhc bvhc, DebugPokeRequest debugPokeRequest) {
        super(str);
        this.f69946b = aiwp;
        this.f69947c = bvhc;
        this.f69945a = debugPokeRequest;
    }

    public final void run() {
        aiwq aiwq = (aiwq) ahgz.m55754a(this.f69946b.f69948a, aiwq.class);
        bvhc bvhc = this.f69947c;
        if (bvhc != null && aiwq != null) {
            aiwq.mo38174a(this.f69945a, bvhc);
        }
    }
}
