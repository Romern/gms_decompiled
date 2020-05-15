package p000;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: fzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzw {

    /* renamed from: b */
    public static fzw f17751b;

    /* renamed from: a */
    public final ReentrantLock f17752a = new ReentrantLock();

    /* renamed from: a */
    public final void mo11570a() {
        rzz.m34730a(!this.f17752a.isHeldByCurrentThread(), "DataBroker left locked!");
    }
}
