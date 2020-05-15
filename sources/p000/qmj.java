package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;

/* renamed from: qmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qmj {

    /* renamed from: e */
    private static volatile qmj f41700e = null;

    /* renamed from: a */
    private final Object f41701a = new Object();

    /* renamed from: b */
    private Uri f41702b = null;

    /* renamed from: c */
    private long f41703c;

    /* renamed from: d */
    private Object[] f41704d = null;

    private qmj() {
        qlp.m32393a();
    }

    /* renamed from: a */
    public static int m32437a(djz djz, String str, int i) {
        djc a = m32438a(djz, m32439a(str));
        if (a == null || a.f13311c < ((long) i)) {
            return -1;
        }
        return dlb.m8783a(djz, m32442b(str));
    }

    /* renamed from: b */
    private static String m32442b(String str) {
        if (str.startsWith("com.google.android.gms.")) {
            return str;
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("com.google.android.gms.") : "com.google.android.gms.".concat(valueOf);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkt.a(djz, java.util.Collection):java.util.List
     arg types: [djz, bngx]
     candidates:
      dkt.a(djz, java.util.List):int
      dkt.a(djz, byte[]):int
      dkt.a(djz, java.util.Collection):java.util.List */
    /* renamed from: a */
    private static djc m32438a(djz djz, String str) {
        List a = dkt.m8754a(djz, (Collection) bngx.m109356a(str));
        if (a.isEmpty()) {
            String valueOf = String.valueOf(str);
            Log.w("ProviderHelper", valueOf.length() == 0 ? new String("Unknown dynamite feature ") : "Unknown dynamite feature ".concat(valueOf));
            return null;
        }
        djc djc = (djc) a.get(0);
        if (!djc.f13312d) {
            return djc;
        }
        String valueOf2 = String.valueOf(str);
        Log.w("ProviderHelper", valueOf2.length() == 0 ? new String("Ignoring optional dynamite feature ") : "Ignoring optional dynamite feature ".concat(valueOf2));
        return null;
    }

    /* renamed from: b */
    public final void mo24109b() {
        synchronized (this.f41701a) {
            this.f41703c = 0;
            this.f41702b = null;
            this.f41704d = null;
        }
        qmc.m32424a(true);
    }

    /* renamed from: a */
    private static String m32439a(String str) {
        return str.startsWith("com.google.android.gms.") ? str.substring(23) : str;
    }

    /* renamed from: a */
    public static qmj m32440a() {
        qmj qmj = f41700e;
        if (qmj == null) {
            synchronized (qmj.class) {
                qmj = f41700e;
                if (qmj == null) {
                    qmj = new qmj();
                    f41700e = qmj;
                }
            }
        }
        return qmj;
    }

    /* renamed from: a */
    private final void m32441a(dfs dfs, Uri uri, Object[] objArr) {
        objArr[0] = 0;
        synchronized (this.f41701a) {
            this.f41704d = objArr;
            this.f41703c = dfs.f13020a;
            this.f41702b = uri;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r8 = java.lang.String.valueOf(r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r8.length() == 0) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        new java.lang.String("No config found: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        "No config found: ".concat(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r6.mo8902j();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        mo24109b();
        r0 = r6.mo8884a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r21 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e1 A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:1:0x0008] */
    /* renamed from: a */
    public final Cursor mo24108a(Context context, sts sts, Uri uri, boolean z, boolean z2) {
        dfs dfs;
        Object[] objArr;
        boolean z3;
        dka a;
        djy djy;
        Object[] objArr2;
        Context context2 = context;
        sts sts2 = sts;
        Uri uri2 = uri;
        try {
            dfy a2 = dfy.m8329a(context);
            dfs = new dfs();
            djz djz = a2.mo8884a(dfs);
            int length = qmi.f41699b.length;
            objArr = new Object[length];
            synchronized (this.f41701a) {
                long j = this.f41703c;
                if (j == 0 || dfs.f13020a != j || !uri2.equals(this.f41702b) || (objArr2 = this.f41704d) == null) {
                    z3 = false;
                } else {
                    System.arraycopy(objArr2, 0, objArr, 0, length);
                    z3 = true;
                }
            }
            if (!z3) {
                if (djz != null) {
                    String str = uri.getPathSegments().get(1);
                    String b = m32442b(str);
                    String a3 = m32439a(str);
                    djc a4 = m32438a(djz, a3);
                    if (a4 != null) {
                        if (Binder.getCallingUid() != Process.myUid()) {
                            if (sts2 != null && sts.m36312b()) {
                                Log.e("ProviderHelper", "Device is not certified!");
                                String[] strArr = sts2.f45134b;
                                int length2 = strArr.length;
                                int i = 0;
                                while (true) {
                                    if (i < length2) {
                                        if (strArr[i].equals(a3)) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        sts2.mo26076a(2);
                                        m32441a(dfs, uri2, objArr);
                                        break;
                                    }
                                }
                            }
                        }
                        int a5 = dlb.m8783a(djz, b);
                        djz djz2 = djz;
                        boolean z4 = z;
                        while (true) {
                            a = djz2.mo9172a("com.google.android.gms.dynamiteloader");
                            if (a != null) {
                                djy = djz2.mo9169a(a.mo9183R());
                            } else {
                                djy = null;
                            }
                            if (a5 < 0 || djy == null) {
                                if (!z4) {
                                    break;
                                }
                                qmc.m32416a();
                                qmc.m32419a(context2, 1, b);
                                djz2 = a2.mo8884a(dfs);
                                a5 = m32437a(djz2, str, 0);
                                z4 = false;
                            } else {
                                break;
                            }
                        }
                        if (a5 >= 0) {
                            if (djy != null) {
                                if (z2) {
                                    int i2 = Build.VERSION.SDK_INT;
                                    if (djy.mo9149a() == 3) {
                                        dha.m8466a(djy.mo9151b());
                                    }
                                    djy a6 = djz2.mo9169a(djz2.mo9176b(a5).mo9183R());
                                    if (a6.mo9149a() == 3) {
                                        dha.m8466a(a6.mo9151b());
                                    }
                                }
                                String b2 = djy.mo9151b();
                                int i3 = Build.VERSION.SDK_INT;
                                long j2 = dfs.f13020a;
                                ByteBuffer allocate = ByteBuffer.allocate(8);
                                allocate.putLong(j2);
                                byte[] array = allocate.array();
                                objArr[0] = Long.valueOf(a4.f13311c);
                                objArr[1] = array;
                                objArr[2] = b2;
                                objArr[4] = array;
                                objArr[5] = Integer.valueOf(a5);
                                objArr[6] = Long.valueOf(dfs.f13020a);
                                objArr[7] = Integer.valueOf(a.mo9186e());
                                synchronized (this.f41701a) {
                                    this.f41704d = objArr;
                                    this.f41703c = dfs.f13020a;
                                    this.f41702b = uri2;
                                }
                            }
                        }
                        qlp.m32393a().mo8861a(context2, 12, b);
                        m32441a(dfs, uri2, objArr);
                    } else {
                        m32441a(dfs, uri2, objArr);
                    }
                } else {
                    m32441a(dfs, uri2, objArr);
                }
            }
        } catch (InvalidConfigException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Failed to get module config: ");
            sb.append(valueOf);
            Log.w("ProviderHelper", sb.toString());
            m32441a(dfs, uri2, objArr);
        } catch (IllegalArgumentException e2) {
        }
        objArr[8] = Integer.valueOf(dfq.m8314a().mo8864c() ? 1 : 0);
        objArr[9] = Integer.valueOf(dfq.m8314a().mo8869h() ? 1 : 0);
        MatrixCursor matrixCursor = new MatrixCursor(qmi.f41699b);
        matrixCursor.addRow(objArr);
        return matrixCursor;
        String valueOf2 = String.valueOf(e);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
        sb2.append("Failed to load module descriptor: ");
        sb2.append(valueOf2);
        Log.w("ProviderHelper", sb2.toString());
        return null;
    }
}
