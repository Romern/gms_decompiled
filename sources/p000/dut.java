package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: dut */
final /* synthetic */ class dut implements Runnable {

    /* renamed from: a */
    private final WriteBatchImpl f14116a;

    /* renamed from: b */
    private final ContextManagerClientInfo f14117b;

    public dut(WriteBatchImpl writeBatchImpl, ContextManagerClientInfo contextManagerClientInfo) {
        this.f14116a = writeBatchImpl;
        this.f14117b = contextManagerClientInfo;
    }

    public final void run() {
        dwq.m9672p().mo10036a(this.f14116a, this.f14117b);
    }
}
