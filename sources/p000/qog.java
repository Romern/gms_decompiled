package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.container.zapp.WaitDownloadCompleteOperation;
import com.google.android.gms.net.PlayServicesCronetProvider;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: qog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qog implements emu {

    /* renamed from: f */
    private static qog f41836f;

    /* renamed from: a */
    public final Set f41837a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    public final Context f41838b;

    /* renamed from: c */
    final File f41839c;

    /* renamed from: d */
    public final qof f41840d;

    /* renamed from: e */
    final qoh f41841e = new qoh(this.f41839c);

    /* renamed from: g */
    private final bdce f41842g;

    private qog(Context context) {
        bdce bdce = new bdce(m32552c(context), context, sne.m35694a((int) cdjh.f180979a.mo6606a().mo77750o(), 10));
        this.f41838b = context;
        this.f41839c = context.getDir("chimeradlm", 0);
        this.f41842g = bdce;
        qof qof = new qof(this);
        this.f41840d = qof;
        bdce.mo57869a(qof);
    }

    /* renamed from: b */
    public static synchronized qog m32551b(Context context) {
        qog qog;
        synchronized (qog.class) {
            if (f41836f == null) {
                f41836f = new qog(context.getApplicationContext());
            }
            qog = f41836f;
        }
        return qog;
    }

    /* renamed from: c */
    private static bdcf m32552c(Context context) {
        try {
            akjj.m59878a(context);
            return new bdbm(new PlayServicesCronetProvider(context).createBuilder().build());
        } catch (UnsatisfiedLinkError | rfv | rfw e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
            sb.append("Cronet not available. fall back to okhttp transport: ");
            sb.append(valueOf);
            Log.i("ChimeraDLM", sb.toString());
            return new bdcg(new cauf());
        }
    }

    /* renamed from: a */
    public final boolean mo10293a(Context context) {
        return true;
    }

    /* renamed from: a */
    public final long mo10290a(Uri uri, String str, String str2, boolean z, boolean z2, String str3, String str4, int i) {
        boolean z3;
        long j;
        long j2;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(i);
        sb.append(".apk");
        String sb2 = sb.toString();
        String uri2 = uri.toString();
        qoi a = this.f41841e.mo24163a(sb2);
        if (a != null) {
            if (new File(this.f41839c, sb2).exists()) {
                j2 = a.f41857j;
            } else {
                j2 = 0;
            }
            this.f41841e.mo24169d(a.f41849b);
            j = j2;
            z3 = true;
        } else {
            j = 0;
            z3 = false;
        }
        qoi a2 = this.f41841e.mo24164a(uri2, sb2, z, qoo.m32583b(this.f41838b), j, SystemClock.elapsedRealtime(), z3, i);
        if (a2 == null) {
            return 0;
        }
        long j3 = a2.f41849b;
        mo24159a(j3, uri2, sb2, z);
        return j3;
    }

    /* renamed from: b */
    public final void mo10294b(long... jArr) {
        for (long j : jArr) {
            qoi a = this.f41841e.mo24162a(j);
            if (a != null) {
                this.f41842g.mo57870a(this.f41839c, a.f41851d);
                if (!cdjh.m133556f()) {
                    this.f41841e.mo24169d(j);
                }
            }
            this.f41837a.remove(Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo10291a(long j) {
        return this.f41841e.mo24168c(j);
    }

    /* renamed from: a */
    public final Map mo10292a(long... jArr) {
        return this.f41841e.mo24161a(this.f41837a, jArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24158a(long j, long j2, int i) {
        long j3 = j;
        qoi a = this.f41841e.mo24162a(j3);
        if (a == null) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Completing noexistent download: ");
            sb.append(j3);
            Log.e("ChimeraDLM", sb.toString());
            return;
        }
        bxvd da = bpuj.f139241k.mo74144da();
        boolean z = true;
        boolean z2 = i == 8;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpuj bpuj = (bpuj) da.f164949b;
        bpuj.f139243a |= 64;
        bpuj.f139250h = z2;
        int h = (int) cdjh.f180979a.mo6606a().mo77743h();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpuj bpuj2 = (bpuj) da.f164949b;
        int i2 = bpuj2.f139243a | 128;
        bpuj2.f139243a = i2;
        bpuj2.f139251i = h;
        long j4 = a.f41857j;
        int i3 = 4;
        int i4 = i2 | 4;
        bpuj2.f139243a = i4;
        bpuj2.f139246d = j2 - j4;
        if (a.f41854g == 0 && !a.f41859l) {
            z = false;
        }
        bpuj2.f139243a = i4 | 32;
        bpuj2.f139249g = z;
        long elapsedRealtime = SystemClock.elapsedRealtime() - a.f41855h;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpuj bpuj3 = (bpuj) da.f164949b;
        bpuj3.f139243a |= 16;
        bpuj3.f139248f = elapsedRealtime;
        int a2 = bpuh.m112292a(a.f41858k);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpuj bpuj4 = (bpuj) da.f164949b;
        int i5 = a2 - 1;
        if (a2 != 0) {
            bpuj4.f139252j = i5;
            int i6 = bpuj4.f139243a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bpuj4.f139243a = i6;
            if (a.f41856i) {
                i3 = 3;
            }
            bpuj4.f139247e = i3 - 1;
            bpuj4.f139243a = i6 | 8;
            this.f41841e.mo24165a(j, i, j2);
            qoo.m32581a(this.f41838b).mo24173a(j3, da);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24159a(long j, String str, String str2, boolean z) {
        this.f41837a.add(Long.valueOf(j));
        bdce bdce = this.f41842g;
        File file = this.f41839c;
        bdbv bdbv = new bdbv(bdce, str, file, str2, new qoe(this, j, str2), new bdbq(file, str2));
        bdbv.mo57855a(!z ? bdbu.WIFI_ONLY : bdbu.WIFI_OR_CELLULAR);
        qlp.m32393a().mo8861a(this.f41838b, 55, str2);
        if (this.f41840d.mo24153a()) {
            Intent startIntent = IntentOperation.getStartIntent(this.f41838b, WaitDownloadCompleteOperation.class, "com.google.android.gms.chimera.action.WAIT_DOWNLOAD_COMPLETE");
            if (startIntent != null) {
                this.f41838b.startService(startIntent);
            } else {
                Log.w("ChimeraDLM", "Unable to start WDCOperation");
            }
        }
        if (cdjh.f180979a.mo6606a().mo77759x()) {
            bdbv.f105303j = 25601;
        }
        bdbv.mo57857c();
    }
}
