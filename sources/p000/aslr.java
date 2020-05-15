package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: aslr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aslr implements C1504y {

    /* renamed from: a */
    final /* synthetic */ atya f89185a;

    /* renamed from: b */
    final /* synthetic */ Context f89186b;

    /* renamed from: c */
    final /* synthetic */ BroadcastReceiver f89187c;

    /* renamed from: d */
    final /* synthetic */ asls f89188d;

    public aslr(asls asls, atya atya, Context context, BroadcastReceiver broadcastReceiver) {
        this.f89188d = asls;
        this.f89185a = atya;
        this.f89186b = context;
        this.f89187c = broadcastReceiver;
    }

    /* renamed from: a */
    public final void mo2a() {
    }

    /* renamed from: a */
    public final void mo3a(C0013ak akVar) {
    }

    /* renamed from: b */
    public final void mo4b() {
        this.f89186b.unregisterReceiver(this.f89187c);
    }

    /* renamed from: c */
    public final void mo5c() {
        this.f89188d.mo2450b(!this.f89185a.mo50312a() ? aslx.INCORRECT : aslx.CORRECT);
        this.f89186b.registerReceiver(this.f89187c, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
    }

    /* renamed from: d */
    public final void mo6d() {
    }

    /* renamed from: e */
    public final void mo7e() {
    }
}
