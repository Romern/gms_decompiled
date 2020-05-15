package p000;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aglf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aglf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f65862a;

    /* renamed from: b */
    final /* synthetic */ String f65863b;

    /* renamed from: c */
    final /* synthetic */ String f65864c;

    /* renamed from: d */
    final /* synthetic */ String f65865d;

    /* renamed from: e */
    final /* synthetic */ AppMetadata f65866e;

    /* renamed from: f */
    final /* synthetic */ agln f65867f;

    public aglf(agln agln, AtomicReference atomicReference, String str, String str2, String str3, AppMetadata appMetadata) {
        this.f65867f = agln;
        this.f65862a = atomicReference;
        this.f65863b = str;
        this.f65864c = str2;
        this.f65865d = str3;
        this.f65866e = appMetadata;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f65862a) {
            try {
                agln agln = this.f65867f;
                aghq aghq = agln.f65887c;
                if (aghq != null) {
                    if (!TextUtils.isEmpty(this.f65863b)) {
                        this.f65862a.set(aghq.mo35392a(this.f65863b, this.f65864c, this.f65865d));
                    } else {
                        this.f65862a.set(aghq.mo35391a(this.f65864c, this.f65865d, this.f65866e));
                    }
                    this.f65867f.mo35624q();
                    atomicReference = this.f65862a;
                    atomicReference.notify();
                    return;
                }
                agln.mo35497E().f65564c.mo35438a("(legacy) Failed to get conditional properties; not connected to service", agid.m54288a(this.f65863b), this.f65864c, this.f65865d);
                this.f65862a.set(Collections.emptyList());
                this.f65862a.notify();
            } catch (RemoteException e) {
                try {
                    this.f65867f.mo35497E().f65564c.mo35438a("(legacy) Failed to get conditional properties; remote exception", agid.m54288a(this.f65863b), this.f65864c, e);
                    this.f65862a.set(Collections.emptyList());
                    atomicReference = this.f65862a;
                } catch (Throwable th) {
                    this.f65862a.notify();
                    throw th;
                }
            }
        }
    }
}
