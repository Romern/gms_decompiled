package p000;

import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: apff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apff extends aaab {

    /* renamed from: a */
    static final Set f84304a = new HashSet();

    /* renamed from: b */
    private static final AtomicInteger f84305b = new AtomicInteger(0);

    /* renamed from: c */
    private final aoyh f84306c = aoyh.m69805a("RestoreContactsOp");

    /* renamed from: d */
    private final apbn f84307d;

    /* renamed from: e */
    private final String f84308e;

    /* renamed from: f */
    private final String f84309f;

    /* renamed from: g */
    private final String f84310g;

    /* renamed from: h */
    private final String f84311h;

    /* renamed from: i */
    private final String[] f84312i;

    /* renamed from: j */
    private final aoyq f84313j = new aoyq(4);

    public apff(apbn apbn, String str, String str2, String str3, String str4, String[] strArr) {
        super(135, "RestoreContacts");
        this.f84307d = apbn;
        this.f84308e = str;
        this.f84309f = str2;
        this.f84310g = str3;
        this.f84311h = str4;
        this.f84312i = strArr;
    }

    /* renamed from: a */
    private static void m70145a(Context context, int i) {
        aoyj.m69819a().mo46991a(i, m70146b(context).mo25460a());
    }

    /* renamed from: b */
    private static sey m70146b(Context context) {
        return sey.m35126a(context.getApplicationContext());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: je.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      je.a(int, java.lang.CharSequence, android.app.PendingIntent):void
      je.a(int, int, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        r3 = p000.apff.f84305b.getAndIncrement();
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (p000.cgkf.m145855b() != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = new p000.C1102je(r2);
        r8 = m70146b(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r8.mo25460a() == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0.mo13640e(r2.getString(com.felicanetworks.mfc.C0126R.string.romanesco_contacts_restore_title));
        r0.mo13632b(r2.getString(com.felicanetworks.mfc.C0126R.string.romanesco_restore_contacts_in_the_background));
        r0.mo13630b(17301628);
        r0.mo13617a(0, 0, true);
        r0.mo13633b(true);
        r0.f22269u = "progress";
        r8.mo25459a("romanesco:contacts_restore", r3, r0.mo13629b());
        r9 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        r9 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        if (m70146b(r17).mo25460a() == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0087, code lost:
        r0 = p000.apfd.m70140a().mo47152a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        r8 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        r10 = new p000.aoyo(r2);
        r12 = (int) p000.cgjy.f187097a.mo6606a().mo83927E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        if (r8 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        r8.mo47150a(0, r8.f84288a.getString(com.felicanetworks.mfc.C0126R.string.romanesco_downloading_contacts));
        r11 = 0;
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
        r11 = 0;
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.f84313j.mo47010a();
        r7 = new p000.apbv(r2).mo47087a(p000.apbs.m70036a(r2, r1.f84309f), r1.f84310g, r1.f84312i, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.f84313j.mo47012a(r2, "fetch_contacts", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d7, code lost:
        if (r8 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d9, code lost:
        r8.mo47150a(120, r8.f84288a.getString(com.felicanetworks.mfc.C0126R.string.romanesco_skipping_duplicate_contacts));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e7, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e9, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00eb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ed, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ef, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        r10.mo47009a(r0, p000.cgjy.m145765l());
        r1.f84306c.mo46980a(r0, "Status Exception when fetching contacts from server");
        r5 = p000.aoyj.m69819a();
        r0 = java.lang.String.valueOf(r0.f189236a.f189233s);
        r14 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 27);
        r14.append("restore_error:status_error:");
        r14.append(r0);
        r5.mo46996a(r14.toString());
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x012c, code lost:
        r10.mo47009a(r0, p000.cgjy.m145765l());
        r1.f84306c.mo46980a(r0, "Auth Exception when fetching contacts from server");
        p000.aoyj.m69819a().mo46996a("restore_error:authentication_failure");
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0145, code lost:
        if (r13 == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x014f, code lost:
        if (r7 != null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0151, code lost:
        r0 = p000.bmvz.f131120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0154, code lost:
        r0 = p000.bmxv.m108566b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015c, code lost:
        if (r0.mo66813a() == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015e, code lost:
        r0 = mo47153a(r8, r2, r10, (p000.btem) r0.mo66814b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0169, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016e, code lost:
        if (p000.cgkf.m145855b() != false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0170, code lost:
        r5 = m70146b(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0178, code lost:
        if (r5.mo25460a() != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017a, code lost:
        if (r0 == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x017c, code lost:
        r6 = com.felicanetworks.mfc.C0126R.string.common_something_went_wrong;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0180, code lost:
        r6 = com.felicanetworks.mfc.C0126R.string.romanesco_contacts_restore_success;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0183, code lost:
        r9.mo13617a(0, 0, false);
        r9.mo13632b(r2.getString(r6));
        r9.mo13630b(17301628);
        r9.mo13627a(true);
        r9.mo13633b(false);
        r9.f22269u = "progress";
        r5.mo25459a("romanesco:contacts_restore", r3, r9.mo13629b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a9, code lost:
        if (r8 != null) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ab, code lost:
        if (r0 == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ad, code lost:
        r8.mo47151b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b1, code lost:
        r8.mo47148a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b4, code lost:
        if (r0 != false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b6, code lost:
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b8, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b9, code lost:
        m70145a(r2, r3);
        r2 = r1.f84307d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01be, code lost:
        if (r0 != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c0, code lost:
        r0 = com.google.android.gms.common.api.Status.f30109c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c3, code lost:
        r0 = com.google.android.gms.common.api.Status.f30107a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c5, code lost:
        r2.mo46970a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ca, code lost:
        monitor-enter(p000.apff.f84304a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        p000.apff.f84304a.remove(r1.f84310g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d3, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01cb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014f A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Context context2 = context;
        synchronized (f84304a) {
            if (f84304a.contains(this.f84310g)) {
                new Object[1][0] = this.f84311h;
                m70145a(context2, 6);
                this.f84307d.mo46970a(Status.f30111e);
                return;
            }
            f84304a.add(this.f84310g);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f84307d.mo46970a(status);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aozc.a(btem, java.lang.String, boolean):void
     arg types: [btem, java.lang.String, int]
     candidates:
      aozc.a(btem, java.lang.String, apfc):void
      aozc.a(btem, java.lang.String, boolean):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* renamed from: a */
    public final boolean mo47153a(apfc apfc, Context context, aoyo aoyo, btem btem) {
        boolean z = true;
        try {
            aozc a = aozd.m69896a(context, apfg.m70150a(this.f84308e));
            if (apfc == null) {
                a.mo47033a(btem, this.f84309f, false);
            } else {
                a.mo47032a(btem, this.f84309f, apfc);
            }
            try {
                apet.m70119a(context, this.f84310g, System.currentTimeMillis());
            } catch (RemoteException e) {
                e = e;
            } catch (OperationApplicationException e2) {
                e = e2;
                aoyo.mo47009a(e, cgjy.m145765l());
                this.f84306c.mo46980a(e, "Failed to write contacts to CP2.");
                aoyj.m69819a().mo46996a("restore_error:cp2_operation_exception");
                return z;
            } catch (RuntimeException e3) {
                e = e3;
                aoyo.mo47009a(e, cgjy.m145766m());
                this.f84306c.mo46980a(e, "Failed to restore contacts due to runtime exception.");
                aoyj a2 = aoyj.m69819a();
                String valueOf = String.valueOf(e.getMessage());
                a2.mo46996a(valueOf.length() != 0 ? new String("restore_error:runtime_error:") : "restore_error:runtime_error:".concat(valueOf));
                return z;
            }
        } catch (RemoteException e4) {
            e = e4;
            z = false;
            aoyo.mo47009a(e, cgjy.m145765l());
            this.f84306c.mo46980a(e, "Contacts write failed during the execution of a remote method.");
            aoyj.m69819a().mo46996a("restore_error:cp2_remote_exception");
            return z;
        } catch (OperationApplicationException e5) {
            e = e5;
            z = false;
            aoyo.mo47009a(e, cgjy.m145765l());
            this.f84306c.mo46980a(e, "Failed to write contacts to CP2.");
            aoyj.m69819a().mo46996a("restore_error:cp2_operation_exception");
            return z;
        } catch (RuntimeException e6) {
            e = e6;
            z = false;
            aoyo.mo47009a(e, cgjy.m145766m());
            this.f84306c.mo46980a(e, "Failed to restore contacts due to runtime exception.");
            aoyj a22 = aoyj.m69819a();
            String valueOf2 = String.valueOf(e.getMessage());
            a22.mo46996a(valueOf2.length() != 0 ? new String("restore_error:runtime_error:") : "restore_error:runtime_error:".concat(valueOf2));
            return z;
        }
        return z;
    }
}
