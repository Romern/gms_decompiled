package p000;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aglg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aglg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f65868a;

    /* renamed from: b */
    final /* synthetic */ String f65869b;

    /* renamed from: c */
    final /* synthetic */ String f65870c;

    /* renamed from: d */
    final /* synthetic */ String f65871d;

    /* renamed from: e */
    final /* synthetic */ boolean f65872e;

    /* renamed from: f */
    final /* synthetic */ AppMetadata f65873f;

    /* renamed from: g */
    final /* synthetic */ agln f65874g;

    public aglg(agln agln, AtomicReference atomicReference, String str, String str2, String str3, boolean z, AppMetadata appMetadata) {
        this.f65874g = agln;
        this.f65868a = atomicReference;
        this.f65869b = str;
        this.f65870c = str2;
        this.f65871d = str3;
        this.f65872e = z;
        this.f65873f = appMetadata;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f65868a) {
            try {
                agln agln = this.f65874g;
                aghq aghq = agln.f65887c;
                if (aghq != null) {
                    if (!TextUtils.isEmpty(this.f65869b)) {
                        this.f65868a.set(aghq.mo35393a(this.f65869b, this.f65870c, this.f65871d, this.f65872e));
                    } else {
                        this.f65868a.set(aghq.mo35394a(this.f65870c, this.f65871d, this.f65872e, this.f65873f));
                    }
                    this.f65874g.mo35624q();
                    atomicReference = this.f65868a;
                    atomicReference.notify();
                    return;
                }
                agln.mo35497E().f65564c.mo35438a("(legacy) Failed to get user properties; not connected to service", agid.m54288a(this.f65869b), this.f65870c, this.f65871d);
                this.f65868a.set(Collections.emptyList());
                this.f65868a.notify();
            } catch (RemoteException e) {
                try {
                    this.f65874g.mo35497E().f65564c.mo35438a("(legacy) Failed to get user properties; remote exception", agid.m54288a(this.f65869b), this.f65870c, e);
                    this.f65868a.set(Collections.emptyList());
                    atomicReference = this.f65868a;
                } catch (Throwable th) {
                    this.f65868a.notify();
                    throw th;
                }
            }
        }
    }
}
