package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aynn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aynn extends ayqp {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f98074a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aynn(Context context, ayqk ayqk, Handler handler, String[] strArr, AtomicBoolean atomicBoolean) {
        super(context, ayqk, handler, strArr);
        this.f98074a = atomicBoolean;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54158a(Intent intent) {
        this.f98074a.set(true);
        close();
    }
}
