package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.App;
import java.util.Formatter;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: uex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uex {

    /* renamed from: a */
    public static final sbw f47388a = new sbw("AuthorizationChecker", "");

    /* renamed from: b */
    public volatile Runnable f47389b;

    /* renamed from: c */
    private final Context f47390c;

    /* renamed from: d */
    private final uhn f47391d;

    /* renamed from: e */
    private final vkv f47392e;

    /* renamed from: f */
    private final ExecutorService f47393f;

    public uex(Context context, uhn uhn, vkv vkv, ExecutorService executorService) {
        this.f47390c = context;
        this.f47391d = uhn;
        this.f47392e = vkv;
        this.f47393f = executorService;
    }

    /* renamed from: a */
    private static final ues m38251a(VolleyError volleyError) {
        if (!(volleyError instanceof AuthFailureError)) {
            return new ues(volleyError.getMessage(), volleyError);
        }
        AuthFailureError authFailureError = (AuthFailureError) volleyError;
        vpf a = vpg.m41003a(authFailureError.networkResponse);
        if (a == null || a.f49706c == null) {
            return new ues(String.format(Locale.US, "server returned response code %d", Integer.valueOf(authFailureError.networkResponse.statusCode)));
        }
        return new ues(String.format(Locale.US, "Server returned error: %s. See https://developers.google.com/drive/handle-errors for details.", a.f49706c));
    }

    /* renamed from: a */
    private static uey m38252a(uey uey, bnic bnic) {
        Set set = uey.f47398e;
        sdo.m34974b(set.containsAll(bnic));
        return !bnic.containsAll(set) ? new uey(uey.f47394a, uey.f47395b, uey.f47396c, uey.f47397d, bnic) : uey;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* renamed from: a */
    public final uev mo27260a(ClientContext clientContext) {
        boolean z;
        uih uih;
        boolean z2;
        ClientContext clientContext2 = clientContext;
        String str = clientContext2.f30216f;
        boolean b = rfz.m33557a(this.f47390c).mo24610b(str);
        try {
            bnia j = bnic.m109500j();
            twt[] values = twt.values();
            for (twt twt : values) {
                if (clientContext2.mo17801a(twt.f46779f)) {
                    if (twt.f46781h) {
                        if (!b) {
                            throw new ues(String.format(Locale.US, "Unsupported scope: %s", twt.f46779f));
                        }
                    }
                    j.mo67629b(twt);
                }
            }
            bnic a = j.mo67751a();
            if (!a.isEmpty()) {
                String e = spn.m35882e(this.f47390c, str);
                if (e != null) {
                    AppIdentity a2 = AppIdentity.m22942a(str, e);
                    uih c = this.f47391d.mo27428c(clientContext2.f30213c.name);
                    uey b2 = this.f47391d.mo27417b(c.f47683b, a2);
                    if (b2 == null || !b2.f47398e.containsAll(a)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (b2 != null) {
                        uih = c;
                        if (b2.f47397d > System.currentTimeMillis()) {
                            z2 = false;
                            if (!z || (z2 && !b)) {
                                return mo27261a(clientContext, a2, a, uih, b2, z);
                            }
                            if (b && z2 && this.f47389b == null) {
                                this.f47389b = new uew(this, clientContext, a2, a, uih, b2);
                                this.f47393f.submit(this.f47389b);
                            }
                            return uev.m38250a(z2 ? ueu.OK : ueu.OK_EXPIRED, m38252a(b2, a), true, null);
                        }
                    } else {
                        uih = c;
                    }
                    z2 = true;
                    if (!z) {
                        this.f47389b = new uew(this, clientContext, a2, a, uih, b2);
                        this.f47393f.submit(this.f47389b);
                        return uev.m38250a(z2 ? ueu.OK : ueu.OK_EXPIRED, m38252a(b2, a), true, null);
                    }
                    return mo27261a(clientContext, a2, a, uih, b2, z);
                }
                throw new ues(String.format(Locale.US, "No certificates for %s from package manager.", str));
            }
            throw new ues("No valid Drive authorization scope provided.");
        } catch (PackageManager.NameNotFoundException e2) {
            throw new ues(String.format(Locale.US, "Package not found: %s", str));
        } catch (ues e3) {
            return uev.m38249a(ueu.FAIL_PERMANENT, e3);
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:3:0x0014 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:8:0x0083 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.common.internal.ClientContext], assign insn: 0x0002: MOVE  (r8v0 ? I:?[OBJECT, ARRAY]) = (r19v0 com.google.android.gms.common.internal.ClientContext) */
    /* JADX WARN: Type inference failed for: r8v8, assign insn: PHI: (r8v8 ?) = (r8v0 ?), (r8v13 ?) binds: [B:3:0x0014, B:8:0x0083] */
    /* JADX WARN: Type inference failed for: r8v9, assign insn: PHI: (r8v9 ?) = (r8v0 ?), (r8v13 ?) binds: [B:3:0x0014, B:8:0x0083] */
    /* JADX WARN: Type inference failed for: r8v10, assign insn: PHI: (r8v10 ?) = (r8v0 ?), (r8v13 ?) binds: [B:3:0x0014, B:8:0x0083] */
    /* JADX WARN: Type inference failed for: r8v11, assign insn: PHI: (r8v11 ?) = (r8v0 ?), (r8v13 ?) binds: [B:3:0x0014, B:8:0x0083] */
    /* JADX WARN: Type inference failed for: r8v13, types: [uey], assign insn: 0x007e: MOVE  (r8v13 ? I:?[OBJECT, ARRAY]) = (r14v0 uey) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c6, code lost:
        r2 = r0.networkResponse;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d4, code lost:
        r2 = r2.statusCode;
        p000.vpg.m41005a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e5, code lost:
        p000.vkv.f49412a.mo25371b("Domain policy restriction: throwing auth exception.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f1, code lost:
        throw new p000.gid(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f3, code lost:
        r0 = e;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f5, code lost:
        r0 = e;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f7, code lost:
        r0 = e;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fe, code lost:
        r6 = r13;
        r8 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0100, code lost:
        if (r8 != null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        r1.f47391d.mo27422b(r6.f47683b, r8.f47395b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0119, code lost:
        return p000.uev.m38249a(p000.ueu.FAIL_PERMANENT, new p000.ues("See https://developers.google.com/drive/android/auth for details on authorizing an application.", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011b, code lost:
        r6 = r13;
        r8 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011d, code lost:
        if (r8 != null) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0120, code lost:
        r1.f47391d.mo27422b(r6.f47683b, r8.f47395b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
        return p000.uev.m38249a(p000.ueu.FAIL_USER_CONSENT_REQUIRED, new p000.ues(r0, r0.mo7366a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0157, code lost:
        if (r8 == null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016c, code lost:
        if (r5.contains(p000.twt.f46773b) != false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016e, code lost:
        p000.uex.f47388a.mo25377c("AuthorizationChecker", "Unexpected APPDATA scope requested for auth");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0182, code lost:
        r0 = p000.ueu.OK_EXPIRED;
        p000.sdo.m34974b(!r5.contains(p000.twt.f46773b));
        r10 = new p000.uey(r22, "745476177629", r20, java.lang.System.currentTimeMillis(), r21);
        r1.f47391d.mo27424b(r10, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01bd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01be, code lost:
        r6 = r13;
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c0, code lost:
        if (r2 != null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c3, code lost:
        r1.f47391d.mo27422b(r6.f47683b, r2.f47395b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d9, code lost:
        return p000.uev.m38249a(p000.ueu.FAIL_TRANSIENT, new p000.ues("Something went wrong while creating app data", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return p000.uev.m38249a(p000.ueu.FAIL_PERMANENT, m38251a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return p000.uev.m38250a(p000.ueu.OK_EXPIRED, m38252a(r8, r5), true, java.lang.Integer.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return p000.uev.m38249a(p000.ueu.FAIL_PERMANENT, m38251a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return p000.uev.m38250a(r0, r10, true, java.lang.Integer.valueOf(r9));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fd A[ExcHandler: gid (e gid), Splitter:B:1:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011a A[ExcHandler: UserRecoverableAuthException (e com.google.android.gms.auth.UserRecoverableAuthException), Splitter:B:1:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bd A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:1:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final uev mo27261a(ClientContext clientContext, AppIdentity appIdentity, bnic bnic, uih uih, uey uey, boolean z) {
        boolean z2;
        bnic bnic2;
        String str;
        ? r8 = clientContext;
        bnic bnic3 = bnic;
        uih uih2 = uih;
        uey uey2 = uey;
        boolean z3 = z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            vlc vlc = new vlc(this.f47392e.mo28605a((ClientContext) r8, 2838));
            shc shc = new shc();
            shc.mo25530a("id");
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("apps/%1$s", shd.m35267a("self"));
            shc.mo25531a(sb);
            String str2 = ((App) vlc.f49432a.mo25536a(clientContext, 0, sb.toString(), (Object) null, App.class)).f30946b;
            int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
            z2 = z3;
            uih uih3 = uih2;
            r8 = uey2;
            bnic2 = bnic3;
            uey uey3 = new uey(uih, str2, appIdentity, System.currentTimeMillis() + ((Long) twy.f46889p.mo58455c()).longValue(), bnic);
            if (!bnic2.contains(twt.f46773b)) {
                str = null;
            } else {
                if (r8 != 0) {
                    if (r8.f47398e.contains(twt.f46773b)) {
                        str = null;
                    }
                }
                str = this.f47392e.mo28599a(uey3);
                if (str == null) {
                    return uev.m38249a(ueu.FAIL_TRANSIENT, new ues("Could not retrieve the resourceId for app data"));
                }
            }
            this.f47391d.mo27424b(uey3, str);
            return uev.m38250a(ueu.OK, uey3, z2, Integer.valueOf(elapsedRealtime2));
        } catch (IllegalArgumentException e) {
        } catch (VolleyError e2) {
            e = e2;
            z2 = z3;
            uey uey4 = uey2;
            bnic2 = bnic3;
            int elapsedRealtime3 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
            if (!z2) {
            }
        } catch (UserRecoverableAuthException e3) {
        } catch (gid e4) {
        }
    }
}
