package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: dyc */
final /* synthetic */ class dyc implements Runnable {

    /* renamed from: a */
    private final WriteBatchImpl f14384a;

    /* renamed from: b */
    private final ContextManagerClientInfo f14385b;

    public dyc(WriteBatchImpl writeBatchImpl, ContextManagerClientInfo contextManagerClientInfo) {
        this.f14384a = writeBatchImpl;
        this.f14385b = contextManagerClientInfo;
    }

    public final void run() {
        dwq.m9672p().mo10036a(this.f14384a, this.f14385b);
    }
}
