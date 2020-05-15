package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Message;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.scheduler.execution.TaskExecutionDelegator$TaskCompletingReceiver;
import java.util.List;

/* renamed from: apje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apje {

    /* renamed from: a */
    private final aamf f84529a;

    /* renamed from: b */
    private final apjc f84530b;

    public apje(aamf aamf, apjc apjc) {
        this.f84529a = aamf;
        this.f84530b = apjc;
    }

    /* renamed from: a */
    private final aucb m70445a(apik apik) {
        apjc apjc = this.f84530b;
        aucf aucf = new aucf();
        apjc.f84526e.execute(new apit(apjc, apik, aucf));
        return aucf.f91388a;
    }

    /* renamed from: a */
    public static boolean m70446a(int i) {
        return ((i + -1) & i) == 0 && (i & 3724) > 0;
    }

    /* renamed from: b */
    public static boolean m70447b(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public final synchronized aucb mo47340a(Context context, apik apik) {
        aucb aucb;
        Intent intent;
        Intent intent2;
        if (!aphm.m70305b(apik.f84459a)) {
            String valueOf = String.valueOf(apik.f84459a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("Running in whitelist mode. Ignoring task: ");
            sb.append(valueOf);
            Log.w("NetworkScheduler.TED", sb.toString());
            return aucu.m76778a((Object) 2);
        }
        if (apik.f84459a.mo47280q()) {
            apik.f84459a.mo47264c();
        }
        int k = apik.mo47305k();
        PackageManager c = this.f84529a.mo17013c(k);
        if (c == null) {
            return aucu.m76778a((Object) 4);
        } else if (apik.mo47301g()) {
            if (k != 0) {
                Intent i = apik.mo47303i();
                if (cdnj.f181319a.mo6606a().mo77993P()) {
                    String action = i.getAction();
                    String str = i.getPackage();
                    if (action != null) {
                        if (str != null) {
                            intent2 = new Intent(action).setPackage(str);
                        }
                    }
                    int k2 = apik.mo47305k();
                    StringBuilder sb2 = new StringBuilder(91);
                    sb2.append("Failed to schedule task for user: ");
                    sb2.append(k2);
                    sb2.append(". Can't find correct gmscore internal receiver");
                    Log.e("NetworkScheduler.TED", sb2.toString());
                    aucb = aucu.m76778a(Integer.valueOf((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                } else {
                    intent2 = i;
                }
                List<ResolveInfo> queryBroadcastReceivers = c.queryBroadcastReceivers(intent2, 0);
                if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() == 1) {
                    try {
                        if (!apik.mo47296b()) {
                            aucf aucf = new aucf();
                            aajg.m21336a(context, apik.mo47305k(), i, "com.google.android.gms.permission.INTERNAL_BROADCAST", new TaskExecutionDelegator$TaskCompletingReceiver(aucf), null);
                            aucb = aucf.f91388a;
                        } else {
                            aucb = m70445a(apik);
                        }
                    } catch (IllegalStateException e) {
                        String valueOf2 = String.valueOf(apik.f84459a.mo47268f());
                        int k3 = apik.mo47305k();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 80);
                        sb3.append("Couldn't bind to service: ");
                        sb3.append(valueOf2);
                        sb3.append(" on user ");
                        sb3.append(k3);
                        sb3.append(". Are you using an up-to-date SDK?");
                        Log.e("NetworkScheduler.TED", sb3.toString());
                        aucb = aucu.m76778a((Object) 64);
                    }
                }
                int k22 = apik.mo47305k();
                StringBuilder sb22 = new StringBuilder(91);
                sb22.append("Failed to schedule task for user: ");
                sb22.append(k22);
                sb22.append(". Can't find correct gmscore internal receiver");
                Log.e("NetworkScheduler.TED", sb22.toString());
                aucb = aucu.m76778a(Integer.valueOf((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            } else {
                ComponentName componentName = null;
                if (!apik.mo47297c()) {
                    intent = apik.mo47304j();
                    if (intent == null) {
                        String valueOf3 = String.valueOf((Object) null);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 37);
                        sb4.append("Invalid service definition provided: ");
                        sb4.append(valueOf3);
                        Log.e("NetworkScheduler.TED", sb4.toString());
                        aucb = aucu.m76778a((Object) 32);
                    }
                } else {
                    intent = null;
                }
                try {
                    if (!apik.mo47296b()) {
                        sdo.m34959a(intent);
                        componentName = context.startService(intent);
                        if (componentName == null) {
                            String valueOf4 = String.valueOf(intent);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 24);
                            sb5.append("Couldn't start service: ");
                            sb5.append(valueOf4);
                            Log.e("NetworkScheduler.TED", sb5.toString());
                            aucb = aucu.m76778a((Object) 128);
                        } else {
                            aucb = aucu.m76778a((Object) 1);
                        }
                    } else {
                        aucb = m70445a(apik);
                    }
                } catch (RuntimeException e2) {
                    if (!(e2.getCause() instanceof TransactionTooLargeException)) {
                        throw e2;
                    }
                } catch (SecurityException e3) {
                    String valueOf5 = String.valueOf(intent);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 61);
                    sb6.append("Couldn't start service: ");
                    sb6.append(valueOf5);
                    sb6.append(". Are your permissions set correctly?");
                    Log.e("NetworkScheduler.TED", sb6.toString());
                    aucb = aucu.m76778a((Object) 8);
                } catch (IllegalStateException e4) {
                    String valueOf6 = String.valueOf(apik.f84459a.mo47268f());
                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf6).length() + 60);
                    sb7.append("Couldn't bind to Service: ");
                    sb7.append(valueOf6);
                    sb7.append(". Are you using an up-to-date SDK?");
                    Log.e("NetworkScheduler.TED", sb7.toString());
                    aucb = aucu.m76778a((Object) 64);
                }
            }
            aucb.mo50371a(new apjd(apik));
            return aucb;
        } else {
            return aucu.m76778a((Object) 32);
        }
    }

    /* renamed from: a */
    public final boolean mo47341a(apik apik, int i) {
        boolean z;
        apjb a;
        boolean z2 = true;
        if (apik.mo47296b()) {
            apjc apjc = this.f84530b;
            synchronized (apjc.f84522a) {
                apiz apiz = (apiz) apjc.f84523b.get(new apja(apik));
                if (apiz != null) {
                    synchronized (apiz.f84514h.f84522a) {
                        try {
                            a = apiz.mo47326a(apik.f84459a.mo47266e());
                            if (a == null) {
                                if (apiz.f84507a.isEmpty()) {
                                    apiz.close();
                                }
                            } else if (apiz.f84510d == null) {
                                a.f84520a.mo50393b((Object) 2048);
                                if (apiz.f84507a.isEmpty()) {
                                    apiz.close();
                                }
                            } else {
                                Message a2 = apiz.mo47325a(apiz.m70429a(a), 2);
                                a2.arg1 = aecb.m51624a(i);
                                aali aali = apiz.f84510d;
                                if (aali != null) {
                                    aali.mo16969a(a2);
                                    if (apiz.f84507a.isEmpty()) {
                                        apiz.close();
                                    }
                                    z = true;
                                } else if (apiz.f84507a.isEmpty()) {
                                    apiz.close();
                                }
                            }
                        } catch (RemoteException e) {
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                            sb.append("error timing out task: ");
                            sb.append(valueOf);
                            Log.e("NetworkScheduler.TED", sb.toString());
                            a.f84520a.mo50393b((Object) 2048);
                            if (apiz.f84507a.isEmpty()) {
                                apiz.close();
                            }
                        } catch (Throwable th) {
                            if (apiz.f84507a.isEmpty()) {
                                apiz.close();
                            }
                            throw th;
                        }
                    }
                }
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        apik.mo47295b(i);
        return z2;
    }
}
