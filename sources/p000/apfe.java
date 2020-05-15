package p000;

import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Set;

/* renamed from: apfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apfe extends aaab {

    /* renamed from: a */
    static final Set f84296a = new HashSet();

    /* renamed from: b */
    private final aoyh f84297b = aoyh.m69805a("RestoreContactsOp");

    /* renamed from: c */
    private final apbn f84298c;

    /* renamed from: d */
    private final String f84299d;

    /* renamed from: e */
    private final String f84300e;

    /* renamed from: f */
    private final String f84301f;

    /* renamed from: g */
    private final String[] f84302g;

    /* renamed from: h */
    private final aoyq f84303h = new aoyq(4);

    public apfe(apbn apbn, String str, String str2, String str3, String[] strArr) {
        super(135, "RestoreContacts");
        this.f84298c = apbn;
        this.f84299d = str;
        this.f84300e = str2;
        this.f84301f = str3;
        this.f84302g = strArr;
    }

    /* renamed from: a */
    private static void m70142a(Context context, int i) {
        aoyj.m69819a().mo46991a(i, sey.m35126a(context.getApplicationContext()).mo25460a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aozc.a(btem, java.lang.String, boolean):void
     arg types: [btem, java.lang.String, int]
     candidates:
      aozc.a(btem, java.lang.String, apfc):void
      aozc.a(btem, java.lang.String, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0214 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc A[Catch:{ all -> 0x01fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2 A[Catch:{ all -> 0x01fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0157 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a1  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:114:0x01c3=Splitter:B:114:0x01c3, B:95:0x0166=Splitter:B:95:0x0166, B:34:0x009a=Splitter:B:34:0x009a, B:76:0x012a=Splitter:B:76:0x012a, B:57:0x00ee=Splitter:B:57:0x00ee} */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        gid e;
        chuw e2;
        RemoteException e3;
        OperationApplicationException e4;
        RuntimeException e5;
        synchronized (f84296a) {
            boolean z = false;
            boolean z2 = true;
            if (f84296a.contains(this.f84300e)) {
                new Object[1][0] = this.f84301f;
                m70142a(context, 6);
                this.f84298c.mo46970a(Status.f30111e);
                return;
            }
            f84296a.add(this.f84300e);
            aoyo aoyo = new aoyo(context);
            int i = 4;
            try {
                this.f84303h.mo47010a();
                btem a = new apbv(context).mo47087a(apbs.m70036a(context, this.f84299d), this.f84300e, this.f84302g, "");
                this.f84303h.mo47012a(context, "fetch_contacts", true);
                aozd.m69896a(context, apfg.m70150a("SUW_Restore")).mo47033a(a, this.f84299d, false);
                try {
                    apet.m70119a(context, this.f84300e, System.currentTimeMillis());
                    m70142a(context, 3);
                    this.f84298c.mo46970a(Status.f30107a);
                    synchronized (f84296a) {
                        f84296a.remove(this.f84300e);
                    }
                } catch (gid e6) {
                    e = e6;
                    aoyo.mo47009a(e, cgjy.m145765l());
                    this.f84297b.mo46980a(e, "Auth Exception when fetching contacts from server");
                    aoyj.m69819a().mo46996a("restore_error:authentication_failure");
                    if (z2) {
                        i = 3;
                    }
                    m70142a(context, i);
                    this.f84298c.mo46970a(z2 ? Status.f30109c : Status.f30107a);
                    synchronized (f84296a) {
                        f84296a.remove(this.f84300e);
                    }
                } catch (chuw e7) {
                    e2 = e7;
                    aoyo.mo47009a(e2, cgjy.m145765l());
                    this.f84297b.mo46980a(e2, "Status Exception when fetching contacts from server");
                    aoyj a2 = aoyj.m69819a();
                    String valueOf = String.valueOf(e2.f189236a.f189233s);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                    sb.append("restore_error:status_error:");
                    sb.append(valueOf);
                    a2.mo46996a(sb.toString());
                    if (z2) {
                        i = 3;
                    }
                    m70142a(context, i);
                    this.f84298c.mo46970a(z2 ? Status.f30109c : Status.f30107a);
                    synchronized (f84296a) {
                        f84296a.remove(this.f84300e);
                    }
                } catch (RemoteException e8) {
                    e3 = e8;
                    aoyo.mo47009a(e3, cgjy.m145765l());
                    this.f84297b.mo46980a(e3, "Contacts write failed during the execution of a remote method.");
                    aoyj.m69819a().mo46996a("restore_error:cp2_remote_exception");
                    if (z2) {
                        i = 3;
                    }
                    m70142a(context, i);
                    this.f84298c.mo46970a(z2 ? Status.f30109c : Status.f30107a);
                    synchronized (f84296a) {
                        f84296a.remove(this.f84300e);
                    }
                } catch (OperationApplicationException e9) {
                    e4 = e9;
                    aoyo.mo47009a(e4, cgjy.m145765l());
                    this.f84297b.mo46980a(e4, "Failed to write contacts to CP2.");
                    aoyj.m69819a().mo46996a("restore_error:cp2_operation_exception");
                    if (z2) {
                        i = 3;
                    }
                    m70142a(context, i);
                    this.f84298c.mo46970a(z2 ? Status.f30109c : Status.f30107a);
                    synchronized (f84296a) {
                        f84296a.remove(this.f84300e);
                    }
                } catch (RuntimeException e10) {
                    e5 = e10;
                    try {
                        aoyo.mo47009a(e5, cgjy.m145766m());
                        this.f84297b.mo46980a(e5, "Failed to restore contacts due to runtime exception.");
                        aoyj a3 = aoyj.m69819a();
                        String valueOf2 = String.valueOf(e5.getMessage());
                        a3.mo46996a(valueOf2.length() != 0 ? new String("restore_error:runtime_error:") : "restore_error:runtime_error:".concat(valueOf2));
                        if (z2) {
                            i = 3;
                        }
                        m70142a(context, i);
                        this.f84298c.mo46970a(z2 ? Status.f30109c : Status.f30107a);
                        synchronized (f84296a) {
                            f84296a.remove(this.f84300e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = z2;
                        if (z) {
                        }
                        m70142a(context, i);
                        this.f84298c.mo46970a(!z ? Status.f30109c : Status.f30107a);
                        synchronized (f84296a) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                    if (z) {
                        i = 3;
                    }
                    m70142a(context, i);
                    this.f84298c.mo46970a(!z ? Status.f30109c : Status.f30107a);
                    synchronized (f84296a) {
                        f84296a.remove(this.f84300e);
                    }
                    throw th;
                }
            } catch (gid e11) {
                e = e11;
                z2 = false;
                aoyo.mo47009a(e, cgjy.m145765l());
                this.f84297b.mo46980a(e, "Auth Exception when fetching contacts from server");
                aoyj.m69819a().mo46996a("restore_error:authentication_failure");
                if (z2) {
                }
                m70142a(context, i);
                this.f84298c.mo46970a(z2 ? Status.f30109c : Status.f30107a);
                synchronized (f84296a) {
                }
            } catch (chuw e12) {
                e2 = e12;
                z2 = false;
                aoyo.mo47009a(e2, cgjy.m145765l());
                this.f84297b.mo46980a(e2, "Status Exception when fetching contacts from server");
                aoyj a22 = aoyj.m69819a();
                String valueOf3 = String.valueOf(e2.f189236a.f189233s);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
                sb2.append("restore_error:status_error:");
                sb2.append(valueOf3);
                a22.mo46996a(sb2.toString());
                if (z2) {
                }
                m70142a(context, i);
                this.f84298c.mo46970a(z2 ? Status.f30109c : Status.f30107a);
                synchronized (f84296a) {
                }
            } catch (RemoteException e13) {
                e3 = e13;
                z2 = false;
                aoyo.mo47009a(e3, cgjy.m145765l());
                this.f84297b.mo46980a(e3, "Contacts write failed during the execution of a remote method.");
                aoyj.m69819a().mo46996a("restore_error:cp2_remote_exception");
                if (z2) {
                }
                m70142a(context, i);
                this.f84298c.mo46970a(z2 ? Status.f30109c : Status.f30107a);
                synchronized (f84296a) {
                }
            } catch (OperationApplicationException e14) {
                e4 = e14;
                z2 = false;
                aoyo.mo47009a(e4, cgjy.m145765l());
                this.f84297b.mo46980a(e4, "Failed to write contacts to CP2.");
                aoyj.m69819a().mo46996a("restore_error:cp2_operation_exception");
                if (z2) {
                }
                m70142a(context, i);
                this.f84298c.mo46970a(z2 ? Status.f30109c : Status.f30107a);
                synchronized (f84296a) {
                }
            } catch (RuntimeException e15) {
                e5 = e15;
                z2 = false;
                aoyo.mo47009a(e5, cgjy.m145766m());
                this.f84297b.mo46980a(e5, "Failed to restore contacts due to runtime exception.");
                aoyj a32 = aoyj.m69819a();
                String valueOf22 = String.valueOf(e5.getMessage());
                a32.mo46996a(valueOf22.length() != 0 ? new String("restore_error:runtime_error:") : "restore_error:runtime_error:".concat(valueOf22));
                if (z2) {
                }
                m70142a(context, i);
                this.f84298c.mo46970a(z2 ? Status.f30109c : Status.f30107a);
                synchronized (f84296a) {
                }
            } catch (Throwable th3) {
                th = th3;
                if (z) {
                }
                m70142a(context, i);
                this.f84298c.mo46970a(!z ? Status.f30109c : Status.f30107a);
                synchronized (f84296a) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f84298c.mo46970a(status);
    }
}
