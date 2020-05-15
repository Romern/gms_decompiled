package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: jkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jkh extends jns {

    /* renamed from: a */
    private static final sek f22702a = jsy.m17256a("ConnectionEventRouter");

    /* renamed from: b */
    private static jkh f22703b;

    /* renamed from: c */
    private final jnj f22704c;

    /* renamed from: d */
    private final bnmu f22705d = bnge.m109299s();

    public jkh(jnj jnj, Executor executor) {
        super(executor);
        this.f22704c = jnj;
    }

    /* renamed from: a */
    public static synchronized jkh m16839a() {
        jkh jkh;
        synchronized (jkh.class) {
            if (f22703b == null) {
                f22703b = new jkh(jnj.m16961a(), snp.m35704b(10));
            }
            jkh = f22703b;
        }
        return jkh;
    }

    /* renamed from: a */
    public final synchronized void mo13830a(jkg jkg) {
        ((bndq) this.f22705d).mo67272e(jkg);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        m16840a(r6, r7, 4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* renamed from: b */
    public final void mo13832b(String str, int i) {
        jnj jnj = this.f22704c;
        synchronized (jnj.f22879c) {
            jni jni = (jni) jnj.f22878b.get(str);
            if (jni == null) {
                jnj.f22876a.mo25418e("Failed to mark device ID %s for connection failure: not found", jkr.m16853a(str));
                return;
            }
            jnt jnt = (jnt) jni.f22874c.get(i);
            if (jnt != null) {
                if (jnt.mo13825e() != 0) {
                    jnj.f22876a.mo25418e("Failed to mark device ID %s for connection failure: currently connected", jkr.m16853a(str));
                    jni.f22875d.put(i, false);
                    return;
                }
            }
            boolean z = jni.f22875d.get(i);
            jni.f22875d.put(i, false);
        }
    }

    /* renamed from: a */
    private final synchronized void m16840a(String str, int i, int i2, int i3) {
        f22702a.mo25412b("Notifying callbacks for state change, old=%s, new=%s", ConnectionInfo.m6759a(i2), ConnectionInfo.m6759a(i3));
        C1225nr<jkg> nrVar = new C1225nr(((bndd) this.f22705d).f131478b);
        for (Map.Entry entry : ((bndq) this.f22705d).mo67315n()) {
            try {
                ((jsm) entry.getValue()).mo13884a(str, i, i2, i3);
            } catch (RemoteException e) {
                f22702a.mo25417e("Got RemoteException when invoking onConnectionStatusChanged()", e, new Object[0]);
                nrVar.add((jkg) entry.getKey());
            }
        }
        for (jkg jkg : nrVar) {
            ((bndq) this.f22705d).mo67272e(jkg);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        m16840a(r8, r9, 0, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo13829a(String str, int i) {
        jnj jnj = this.f22704c;
        synchronized (jnj.f22879c) {
            jni jni = (jni) jnj.f22878b.get(str);
            if (jni == null) {
                jnj.f22876a.mo25418e("Failed to mark device ID %s as connecting: not found", jkr.m16853a(str));
                return;
            }
            jnt jnt = (jnt) jni.f22874c.get(i);
            if (jnt != null) {
                if (jnt.mo13825e() != 0) {
                    jnj.f22876a.mo25418e("Failed to mark device ID %s as connecting: currently connected", jkr.m16853a(str));
                    jni.f22875d.put(i, false);
                    return;
                }
            }
            boolean z = jni.f22875d.get(i, false);
            jni.f22875d.put(i, true);
            jnj.f22876a.mo25412b("Marked device ID %s as connecting, already_connected=%s", jkr.m16853a(str), Boolean.valueOf(z));
            boolean z2 = !z;
        }
    }

    /* renamed from: a */
    public final synchronized void mo13831a(jkg jkg, jsm jsm) {
        this.f22705d.mo67268a(jkg, jsm);
    }

    /* renamed from: a */
    public final synchronized void mo13779a(jnt jnt, int i, int i2) {
        String str;
        if (jnt.mo13824d() != null) {
            str = jnt.mo13824d();
        } else {
            str = "";
        }
        int c = jnt.mo13822c();
        if (!str.isEmpty()) {
            if (i2 == 0) {
                jnj jnj = this.f22704c;
                synchronized (jnj.f22879c) {
                    jni jni = (jni) jnj.f22878b.get(str);
                    if (jni != null) {
                        jni.f22874c.remove(c);
                    }
                }
            } else if (this.f22704c.mo13903a(str, c) != jnt) {
                jnj jnj2 = this.f22704c;
                synchronized (jnj2.f22879c) {
                    jni jni2 = (jni) jnj2.f22878b.get(str);
                    if (jni2 != null) {
                        jni2.f22874c.put(jnt.mo13822c(), jnt);
                        jni2.f22875d.put(jnt.mo13822c(), false);
                    } else {
                        jnj.f22876a.mo25412b("SecureChannel established for unregistered device. Disconnecting.", new Object[0]);
                        jnt.mo13827g();
                    }
                }
            }
        }
        m16840a(str, c, i, i2);
    }

    /* renamed from: a */
    public final synchronized void mo13780a(jnt jnt, String str, byte[] bArr) {
        String d = jnt.mo13824d();
        sdo.m34959a((Object) d);
        C1225nr<jkg> nrVar = new C1225nr(((bndd) this.f22705d).f131478b);
        for (Map.Entry entry : ((bndq) this.f22705d).mo67315n()) {
            try {
                ((jsm) entry.getValue()).mo13885a(d, str, bArr);
            } catch (RemoteException e) {
                f22702a.mo25417e("Got RemoteException when invoking onMessageReceived()", e, new Object[0]);
                nrVar.add((jkg) entry.getKey());
            }
        }
        for (jkg jkg : nrVar) {
            ((bndq) this.f22705d).mo67272e(jkg);
        }
    }
}
