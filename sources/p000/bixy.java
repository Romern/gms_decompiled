package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bixy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixy {

    /* renamed from: e */
    private static bixy f122241e;

    /* renamed from: f */
    private static final long f122242f = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    private final Context f122243a;

    /* renamed from: b */
    private final ExecutorService f122244b = bixo.f122211a.f122213c;

    /* renamed from: c */
    private final ExecutorService f122245c = bixo.f122212b.f122213c;

    /* renamed from: d */
    private final long f122246d = f122242f;

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService], assign insn: 0x0007: IGET  (r3v2 ? I:java.util.concurrent.Executor) = (r3v1 bixo) bixo.c java.util.concurrent.Executor */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService], assign insn: 0x000d: IGET  (r3v4 ? I:java.util.concurrent.Executor) = (r3v3 bixo) bixo.c java.util.concurrent.Executor */
    private bixy(Context context) {
        this.f122243a = context;
    }

    /* renamed from: a */
    public static synchronized bixy m102959a(Context context) {
        bixy bixy;
        synchronized (bixy.class) {
            if (f122241e == null) {
                f122241e = new bixy(context.getApplicationContext());
            }
            bixy = f122241e;
        }
        return bixy;
    }

    /* renamed from: b */
    public final void mo64854b(int i, Bundle bundle) {
        try {
            bixk a = biyc.m102966a(this.f122243a, this.f122246d, TimeUnit.MILLISECONDS);
            if (a == null) {
                Log.w("SucServiceInvoker", "logMetric failed since service reference is null. Are the permissions valid?");
                return;
            }
            Bundle bundle2 = Bundle.EMPTY;
            Parcel bj = a.mo8529bj();
            bj.writeInt(i);
            dcl.m8165a(bj, bundle);
            dcl.m8165a(bj, bundle2);
            a.mo8530c(2, bj);
        } catch (RemoteException | InterruptedException | TimeoutException e) {
            Log.e("SucServiceInvoker", String.format("Exception occurred while trying to log metric = [%s]", bundle), e);
        }
    }

    /* renamed from: a */
    public final void mo64852a(int i, Bundle bundle) {
        try {
            this.f122244b.execute(new bixw(this, i, bundle));
        } catch (RejectedExecutionException e) {
            Log.e("SucServiceInvoker", String.format("Metric of type %d dropped since queue is full.", Integer.valueOf(i)), e);
        }
    }

    /* renamed from: a */
    public final void mo64853a(String str, Bundle bundle) {
        try {
            this.f122245c.execute(new bixx(this, str, bundle));
        } catch (RejectedExecutionException e) {
            Log.e("SucServiceInvoker", String.format("Screen %s bind back fail.", str), e);
        }
    }

    /* renamed from: b */
    public final void mo64855b(String str, Bundle bundle) {
        try {
            bixk a = biyc.m102966a(this.f122243a, this.f122246d, TimeUnit.MILLISECONDS);
            if (a != null) {
                Parcel bj = a.mo8529bj();
                bj.writeString(str);
                dcl.m8165a(bj, bundle);
                a.mo8530c(1, bj);
                return;
            }
            Log.w("SucServiceInvoker", "BindBack failed since service reference is null. Are the permissions valid?");
        } catch (RemoteException | InterruptedException | TimeoutException e) {
            Log.e("SucServiceInvoker", String.format("Exception occurred while %s trying bind back to SetupWizard.", str), e);
        }
    }
}
