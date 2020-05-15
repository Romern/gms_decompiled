package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ayqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ayqp extends BroadcastReceiver implements AutoCloseable {

    /* renamed from: a */
    private final Context f98292a;

    /* renamed from: b */
    private final bqgy f98293b;

    /* renamed from: c */
    public long f98294c;

    public ayqp(Context context, ayqk ayqk, Handler handler, String... strArr) {
        this.f98293b = bqgy.m112818c();
        bnsp bnsp = aypn.f98194a;
        Arrays.toString(strArr);
        this.f98292a = context;
        IntentFilter intentFilter = new IntentFilter();
        if (ayqk.mo54112T()) {
            intentFilter.setPriority(1000);
        }
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
        context.registerReceiver(this, intentFilter, null, handler);
    }

    /* renamed from: a */
    public final void mo54283a(long j, TimeUnit timeUnit) {
        bnsp bnsp = aypn.f98194a;
        try {
            this.f98293b.get(j, timeUnit);
        } catch (TimeoutException e) {
            if (this.f98294c > 0) {
                bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                bnsl.mo68432a("ayqp", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68415a("Extend timeout for %s seconds", this.f98294c);
                this.f98293b.get(this.f98294c, TimeUnit.SECONDS);
                return;
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54158a(Intent intent);

    public final void close() {
        mo54284a((Exception) null);
    }

    public final void onReceive(Context context, Intent intent) {
        bnsp bnsp = aypn.f98194a;
        intent.getAction();
        try {
            mo54158a(intent);
        } catch (Exception e) {
            mo54284a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54284a(Exception exc) {
        try {
            this.f98292a.unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
        }
        if (exc != null) {
            this.f98293b.mo69136a((Throwable) exc);
        } else {
            this.f98293b.mo69138b((Object) null);
        }
    }

    public ayqp(Context context, ayqk ayqk, String... strArr) {
        this(context, ayqk, null, strArr);
    }
}
