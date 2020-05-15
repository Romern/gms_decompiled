package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.UserHandle;
import android.util.Log;
import com.google.android.gms.scheduler.execution.TaskConnectionTracker$1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: apit */
final /* synthetic */ class apit implements Runnable {

    /* renamed from: a */
    private final apjc f84497a;

    /* renamed from: b */
    private final apik f84498b;

    /* renamed from: c */
    private final aucf f84499c;

    public apit(apjc apjc, apik apik, aucf aucf) {
        this.f84497a = apjc;
        this.f84498b = apik;
        this.f84499c = aucf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0169, code lost:
        if (r0 != false) goto L_0x016b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b9 A[SYNTHETIC, Splitter:B:60:0x01b9] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d0 A[Catch:{ SecurityException -> 0x020f, Exception -> 0x01dc }] */
    public final void run() {
        apiz apiz;
        int i;
        boolean z;
        apjc apjc = this.f84497a;
        apik apik = this.f84498b;
        aucf aucf = this.f84499c;
        try {
            apja apja = new apja(apik);
            Context b = apjc.f84524c.mo17012b(0);
            if (b == null) {
                String valueOf = String.valueOf(apja.f84518c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Unable to get context for ");
                sb.append(valueOf);
                Log.e("NetworkScheduler.TED", sb.toString());
                apiz = null;
            } else {
                synchronized (apjc.f84522a) {
                    apiz apiz2 = (apiz) apjc.f84523b.get(apja);
                    if (apiz2 == null) {
                        Looper looper = apjc.f84525d;
                        if (apja.f84516a != 0) {
                            i = !cedr.m136296d() ? 2 : 3;
                        } else {
                            i = 1;
                        }
                        apiz apiz3 = new apiz(apjc, apja, looper, i);
                        int i2 = apiz3.f84509c;
                        if (i2 == 1) {
                            apiz = apiz3;
                            z = apjc.f84527f.mo25691a(b, "NetworkScheduler", apja.mo47336a(), apiz, apjc.m70442a());
                        } else if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb2 = new StringBuilder(42);
                                sb2.append("Unexpected execution strategy: ");
                                sb2.append(i2);
                                Log.e("NetworkScheduler.TED", sb2.toString());
                                apiz = apiz3;
                            } else {
                                aucf aucf2 = new aucf();
                                int i3 = apja.f84516a;
                                Bundle bundle = new Bundle();
                                bundle.putBinder("callback", new aalk(apiz3, apiz3));
                                bundle.putInt("OP_CODE", 5);
                                bundle.putParcelable("intent", apiz3.f84508b.mo47336a());
                                if (cdnj.m134211g()) {
                                    bundle.putInt("user_serial", i3);
                                }
                                apiz = apiz3;
                                aajg.m21336a(b, i3, new Intent().putExtras(bundle).setClassName(apiz3.f84514h.f84524c.mo17012b(0), "com.google.android.gms.gcm.nts.SchedulerInternalReceiver"), null, new TaskConnectionTracker$1("scheduler", aucf2), null);
                                try {
                                    Bundle bundle2 = (Bundle) aucu.m76782a((aucb) aucf2.f91388a);
                                    if (bundle2 != null) {
                                        IBinder binder = bundle2.getBinder("binder");
                                        if (binder == null) {
                                            Log.e("NetworkScheduler.TED", "Proxy binder is missing from start proxy broadcast");
                                        } else {
                                            try {
                                                binder.linkToDeath(apiz, 0);
                                                apiz.f84513g = binder;
                                                apjc.f84523b.put(apja, apiz);
                                                ScheduledExecutorService scheduledExecutorService = apjc.f84526e;
                                                apiz.getClass();
                                                ((sny) scheduledExecutorService).schedule(new apiu(apiz), (long) ((int) cedr.m136294b()), TimeUnit.SECONDS);
                                            } catch (RemoteException e) {
                                                Log.e("NetworkScheduler.TED", "Binder linkToDeath failed", e);
                                            }
                                        }
                                    }
                                } catch (ExecutionException e2) {
                                    e = e2;
                                    String valueOf2 = String.valueOf(e);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                                    sb3.append("Failed waiting for ordered broadcast: ");
                                    sb3.append(valueOf2);
                                    Log.e("NetworkScheduler.TED", sb3.toString());
                                    String valueOf3 = String.valueOf(apja.f84518c);
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 32);
                                    sb4.append("Unable to bind to task service: ");
                                    sb4.append(valueOf3);
                                    Log.e("NetworkScheduler.TED", sb4.toString());
                                    apjc.mo47339a(apiz);
                                    apiz = null;
                                    if (apiz != null) {
                                    }
                                } catch (InterruptedException e3) {
                                    e = e3;
                                    String valueOf22 = String.valueOf(e);
                                    StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf22).length() + 38);
                                    sb32.append("Failed waiting for ordered broadcast: ");
                                    sb32.append(valueOf22);
                                    Log.e("NetworkScheduler.TED", sb32.toString());
                                    String valueOf32 = String.valueOf(apja.f84518c);
                                    StringBuilder sb42 = new StringBuilder(String.valueOf(valueOf32).length() + 32);
                                    sb42.append("Unable to bind to task service: ");
                                    sb42.append(valueOf32);
                                    Log.e("NetworkScheduler.TED", sb42.toString());
                                    apjc.mo47339a(apiz);
                                    apiz = null;
                                    if (apiz != null) {
                                    }
                                }
                            }
                            String valueOf322 = String.valueOf(apja.f84518c);
                            StringBuilder sb422 = new StringBuilder(String.valueOf(valueOf322).length() + 32);
                            sb422.append("Unable to bind to task service: ");
                            sb422.append(valueOf322);
                            Log.e("NetworkScheduler.TED", sb422.toString());
                            apjc.mo47339a(apiz);
                            apiz = null;
                        } else {
                            apiz = apiz3;
                            Intent a = apja.mo47336a();
                            int a2 = apjc.m70442a();
                            UserHandle userHandle = (UserHandle) aajg.m21342c(apja.f84516a);
                            sdo.m34959a(userHandle);
                            z = b.bindServiceAsUser(a, apiz, a2, userHandle);
                        }
                    } else {
                        apiz = apiz2;
                    }
                }
            }
            if (apiz != null) {
                synchronized (apiz.f84514h.f84522a) {
                    apiz.f84507a.add(new apjb(apik, aucf));
                    apiz.mo47333c();
                }
                return;
            }
            aucf.mo50391a((Object) 512);
        } catch (SecurityException e4) {
            aucf.mo50393b((Object) 8);
        } catch (Exception e5) {
            String valueOf4 = String.valueOf(apik.f84459a.mo47268f());
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 26);
            sb5.append("Couldn't bind to service: ");
            sb5.append(valueOf4);
            Log.e("NetworkScheduler.TED", sb5.toString());
            aucf.mo50393b((Object) 512);
        }
    }
}
