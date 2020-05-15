package p000;

import android.content.Context;
import android.database.Cursor;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Iterator;
import javax.crypto.SecretKey;

/* renamed from: nbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbo {

    /* renamed from: a */
    private static final lvn f35194a = new lvn("TertiaryKeyManager");

    /* renamed from: b */
    private final lwv f35195b;

    /* renamed from: c */
    private final nbn f35196c;

    /* renamed from: d */
    private final nbp f35197d;

    /* renamed from: e */
    private final lwp f35198e;

    /* renamed from: f */
    private final String f35199f;

    /* renamed from: g */
    private boolean f35200g;

    /* renamed from: h */
    private SecretKey f35201h;

    public nbo(Context context, SecureRandom secureRandom, nbp nbp, lwp lwp, String str) {
        this.f35198e = lwp;
        this.f35199f = str;
        this.f35196c = new nbn(secureRandom);
        this.f35195b = lwv.m24579a(context, lwp);
        this.f35197d = nbp;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0098, code lost:
        if (r4 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a1, code lost:
        if (r4 != null) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d8  */
    /* renamed from: d */
    private final void m25892d() {
        bmxv bmxv;
        Throwable th;
        DataOutputStream dataOutputStream;
        Throwable th2;
        Cursor query;
        Throwable th3;
        bmxv bmxv2;
        if (this.f35201h == null) {
            nbp nbp = this.f35197d;
            String str = this.f35199f;
            nbr nbr = nbp.f35203b;
            nbr.mo20440a();
            if (nbr.f35210c.size() < nbp.f35204c) {
                nbq nbq = nbp.f35202a;
                if (nbq.mo20439a(str) >= nbq.f35207c) {
                    f35194a.mo25414c("Tertiary key rotation was required for %s", this.f35199f);
                    bmxv = bmvz.f131120a;
                    if (!bmxv.mo66813a()) {
                        f35194a.mo25412b("Generating new tertiary key for %s", this.f35199f);
                        bmxv b = bmxv.m108566b(this.f35196c.f35193a.generateKey());
                        this.f35200g = true;
                        nbp nbp2 = this.f35197d;
                        nbp2.f35202a.f35206b.edit().putInt(this.f35199f, 0).apply();
                        nbr nbr2 = nbp2.f35203b;
                        nbr2.f35210c.add(Long.valueOf(System.currentTimeMillis()));
                        nbr2.mo20440a();
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(nbr2.f35209b);
                            try {
                                dataOutputStream = new DataOutputStream(fileOutputStream);
                                Iterator it = nbr2.f35210c.iterator();
                                while (it.hasNext()) {
                                    dataOutputStream.writeLong(((Long) it.next()).longValue());
                                }
                                dataOutputStream.close();
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th = th4;
                                fileOutputStream.close();
                                throw th;
                            }
                        } catch (IOException e) {
                            nbr.f35208a.mo25417e("Error saving tertiary_key_rotation_windowed_count", e, new Object[0]);
                        } catch (Throwable th5) {
                            bqye.m113761a(th, th5);
                        }
                        lwv lwv = this.f35195b;
                        String str2 = this.f35199f;
                        lwv.m24580a(str2);
                        try {
                            long a = lwv.f33130b.mo19714a().mo19719a(new lwz(lwv.f33129a.f33123a, str2, lwu.m24578a(lwv.f33129a.f33124b, (SecretKey) ((bmyg) b).f131198a).serializeToBytes()));
                            lwv.f33130b.mo19715b();
                            if (a != -1) {
                                bmxv = b;
                            } else {
                                throw new IOException("Failed to commit to db");
                            }
                        } catch (Throwable th6) {
                            lwv.f33130b.mo19715b();
                            throw th6;
                        }
                    }
                    this.f35201h = (SecretKey) bmxv.mo66814b();
                    nbp nbp3 = this.f35197d;
                    String str3 = this.f35199f;
                    nbq nbq2 = nbp3.f35202a;
                    int a2 = nbq2.mo20439a(str3) + 1;
                    nbq2.f35206b.edit().putInt(str3, a2).apply();
                    nbq.f35205a.mo25412b("Recorded an incremental backup for %s. %d more backups until key rotation due.", str3, Integer.valueOf(Math.max(0, nbq2.f35207c - a2)));
                    return;
                }
            }
            f35194a.logVerbose("Tertiary key rotation was not required", new Object[0]);
            lwv lwv2 = this.f35195b;
            String str4 = this.f35199f;
            lwv.m24580a(str4);
            try {
                lxa a3 = lwv2.f33130b.mo19714a();
                String str5 = lwv2.f33129a.f33123a;
                query = a3.f33135a.mo19717b().query("tertiary_keys", new String[]{"_id", "secondary_key_alias", "package_name", "wrapped_key_bytes"}, "secondary_key_alias = ? AND package_name = ?", new String[]{str5, str4}, null, null, null);
                if (query.getCount() != 0) {
                    query.moveToFirst();
                    bmxv2 = bmxv.m108566b(new lwz(str5, str4, query.getBlob(query.getColumnIndexOrThrow("wrapped_key_bytes"))));
                } else {
                    bmxv2 = bmvz.f131120a;
                }
                query.close();
                lwv2.f33130b.mo19715b();
                if (bmxv2.mo66813a()) {
                    byte[] bArr = ((lwz) bmxv2.mo66814b()).f33134c;
                    bxus b2 = bxus.m123743b();
                    bmxv = bmxv.m108566b(lwu.m24577a(lwv2.f33129a.f33124b, (mde) GeneratedMessageLite.m124016a(mde.f33472f, bArr, b2)));
                } else {
                    bmxv = bmvz.f131120a;
                }
                if (!bmxv.mo66813a()) {
                }
                this.f35201h = (SecretKey) bmxv.mo66814b();
                nbp nbp32 = this.f35197d;
                String str32 = this.f35199f;
                nbq nbq22 = nbp32.f35202a;
                int a22 = nbq22.mo20439a(str32) + 1;
                nbq22.f35206b.edit().putInt(str32, a22).apply();
                nbq.f35205a.mo25412b("Recorded an incremental backup for %s. %d more backups until key rotation due.", str32, Integer.valueOf(Math.max(0, nbq22.f35207c - a22)));
                return;
            } catch (Throwable th7) {
                lwv2.f33130b.mo19715b();
                throw th7;
            }
        } else {
            return;
        }
        throw th2;
        throw th3;
    }

    /* renamed from: a */
    public final SecretKey mo20436a() {
        m25892d();
        return this.f35201h;
    }

    /* renamed from: b */
    public final mde mo20437b() {
        m25892d();
        return lwu.m24578a(this.f35198e.f33124b, this.f35201h);
    }

    /* renamed from: c */
    public final boolean mo20438c() {
        m25892d();
        return this.f35200g;
    }
}
