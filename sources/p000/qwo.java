package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: qwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qwo {

    /* renamed from: a */
    public final qws f42317a;

    /* renamed from: b */
    public ArrayList f42318b;

    /* renamed from: c */
    public boolean f42319c;

    /* renamed from: d */
    public String f42320d;

    /* renamed from: e */
    public int f42321e;

    /* renamed from: f */
    public cagz f42322f;

    /* renamed from: g */
    public String f42323g;

    /* renamed from: h */
    boolean f42324h;

    /* renamed from: i */
    public final bxvf f42325i;

    /* renamed from: j */
    private final qwq f42326j;

    /* renamed from: k */
    private ArrayList f42327k;

    /* renamed from: l */
    private ArrayList f42328l;

    /* renamed from: m */
    private ArrayList f42329m;

    /* renamed from: n */
    private String f42330n;

    public qwo(qws qws, bxtx bxtx, qwq qwq) {
        this.f42327k = null;
        this.f42328l = null;
        this.f42329m = null;
        this.f42318b = null;
        this.f42319c = true;
        this.f42325i = (bxvf) cagi.f173096t.mo74144da();
        this.f42324h = false;
        this.f42317a = qws;
        this.f42321e = qws.f42341h;
        this.f42320d = qws.f42340g;
        this.f42330n = qws.f42342i;
        this.f42323g = qws.f42343j;
        this.f42322f = qws.f42346m;
        bxvf bxvf = this.f42325i;
        long currentTimeMillis = System.currentTimeMillis();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cagi cagi = (cagi) bxvf.f164949b;
        cagi.f173098a = 1 | cagi.f173098a;
        cagi.f173099b = currentTimeMillis;
        bxvf bxvf2 = this.f42325i;
        long a = qwr.m33017a(((cagi) bxvf2.f164949b).f173099b);
        if (bxvf2.f164950c) {
            bxvf2.mo74035c();
            bxvf2.f164950c = false;
        }
        cagi cagi2 = (cagi) bxvf2.f164949b;
        cagi2.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        cagi2.f173107j = a;
        if (aytw.m84813a(qws.f42338e)) {
            bxvf bxvf3 = this.f42325i;
            boolean a2 = aytw.m84813a(qws.f42338e);
            if (bxvf3.f164950c) {
                bxvf3.mo74035c();
                bxvf3.f164950c = false;
            }
            cagi cagi3 = (cagi) bxvf3.f164949b;
            cagi3.f173098a |= 8388608;
            cagi3.f173115s = a2;
        }
        if (SystemClock.elapsedRealtime() != 0) {
            bxvf bxvf4 = this.f42325i;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (bxvf4.f164950c) {
                bxvf4.mo74035c();
                bxvf4.f164950c = false;
            }
            cagi cagi4 = (cagi) bxvf4.f164949b;
            cagi4.f173098a |= 2;
            cagi4.f173100c = elapsedRealtime;
        }
        if (bxtx != null) {
            bxvf bxvf5 = this.f42325i;
            if (bxvf5.f164950c) {
                bxvf5.mo74035c();
                bxvf5.f164950c = false;
            }
            cagi cagi5 = (cagi) bxvf5.f164949b;
            bxtx.getClass();
            cagi5.f173098a |= 1024;
            cagi5.f173106i = bxtx;
        }
        this.f42326j = qwq;
    }

    /* renamed from: a */
    public final LogEventParcelable mo24321a() {
        String[] strArr;
        byte[][] bArr;
        qws qws = this.f42317a;
        rjo rjo = qws.f42331a;
        String str = qws.f42339f;
        Context context = qws.f42338e;
        if (qws.f42334d == -1) {
            synchronized (qws.class) {
                if (qws.f42334d == -1) {
                    try {
                        qws.f42334d = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("ClearcutLogger", "This can't happen.", e);
                    }
                }
            }
        }
        int i = qws.f42334d;
        int i2 = this.f42321e;
        String str2 = this.f42320d;
        String str3 = this.f42330n;
        String str4 = this.f42323g;
        qws qws2 = this.f42317a;
        boolean z = qws2.f42344k;
        cagz cagz = this.f42322f;
        bxsw bxsw = qws2.f42345l;
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(str, i, i2, str2, str3, str4, z, cagz);
        cagi cagi = (cagi) this.f42325i.mo74062i();
        qwq qwq = this.f42326j;
        int[] a = qws.m33020a(this.f42327k);
        ArrayList arrayList = this.f42328l;
        if (arrayList != null) {
            strArr = (String[]) arrayList.toArray(qws.f42332b);
        } else {
            strArr = null;
        }
        int[] a2 = qws.m33020a(this.f42329m);
        ArrayList arrayList2 = this.f42318b;
        if (arrayList2 != null) {
            bArr = (byte[][]) arrayList2.toArray(qws.f42333c);
        } else {
            bArr = null;
        }
        return new LogEventParcelable(playLoggerContext, cagi, qwq, a, strArr, a2, bArr, this.f42319c);
    }

    @Deprecated
    /* renamed from: b */
    public final rke mo24327b() {
        if (!this.f42324h) {
            this.f42324h = true;
            return this.f42317a.f42347n.mo24338a(this);
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }

    /* renamed from: c */
    public final void mo24330c(String str) {
        qws qws = this.f42317a;
        rjo rjo = qws.f42331a;
        if (!qws.f42344k) {
            this.f42330n = str;
            return;
        }
        throw new IllegalStateException("setUploadAccountName forbidden on anonymous logger");
    }

    public final String toString() {
        ArrayList arrayList;
        StringBuilder sb = new StringBuilder("ClearcutLogger.LogEventBuilder[");
        sb.append("uploadAccount: ");
        sb.append(this.f42330n);
        sb.append(", logSourceName: ");
        sb.append(this.f42320d);
        sb.append(", logSource#: ");
        sb.append(this.f42321e);
        sb.append(", qosTier: ");
        sb.append(this.f42322f);
        sb.append(", loggingId: ");
        sb.append(this.f42323g);
        sb.append(", MessageProducer: ");
        sb.append(this.f42326j);
        sb.append(", veMessageProducer: ");
        sb.append((Object) null);
        sb.append(", testCodes: ");
        sb.append(qws.m33018a((Iterable) this.f42327k));
        sb.append(", dimensions: ");
        sb.append(qws.m33018a((Iterable) null));
        sb.append(", mendelPackages: ");
        sb.append(qws.m33018a((Iterable) this.f42328l));
        sb.append(", experimentIds: ");
        sb.append(qws.m33018a((Iterable) this.f42329m));
        sb.append(", experimentTokens: ");
        sb.append(qws.m33018a((Iterable) null));
        sb.append(", experimentTokensBytes: ");
        ArrayList arrayList2 = this.f42318b;
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(Arrays.toString((byte[]) arrayList2.get(i)));
            }
        } else {
            arrayList = null;
        }
        sb.append(qws.m33018a((Iterable) arrayList));
        sb.append(", addPhenotype: ");
        sb.append(this.f42319c);
        sb.append(", logVerifier: ");
        sb.append((Object) null);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo24328b(int i) {
        bxvf bxvf = this.f42325i;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cagi cagi = (cagi) bxvf.f164949b;
        cagi cagi2 = cagi.f173096t;
        cagi.f173098a |= 16;
        cagi.f173102e = i;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo24329b(String str) {
        bxvf bxvf = this.f42325i;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cagi cagi = (cagi) bxvf.f164949b;
        cagi cagi2 = cagi.f173096t;
        str.getClass();
        cagi.f173098a |= 8;
        cagi.f173101d = str;
    }

    /* renamed from: a */
    public final void mo24322a(int i) {
        if (this.f42327k == null) {
            this.f42327k = new ArrayList();
        }
        this.f42327k.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo24323a(long j) {
        bxvf bxvf = this.f42325i;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cagi cagi = (cagi) bxvf.f164949b;
        cagi cagi2 = cagi.f173096t;
        cagi.f173098a |= 64;
        cagi.f173104g = j;
    }

    /* renamed from: a */
    public final void mo24324a(long j, long j2) {
        bxvf bxvf = this.f42325i;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cagi cagi = (cagi) bxvf.f164949b;
        cagi cagi2 = cagi.f173096t;
        cagi.f173098a |= 1;
        cagi.f173099b = j;
        bxvf bxvf2 = this.f42325i;
        if (bxvf2.f164950c) {
            bxvf2.mo74035c();
            bxvf2.f164950c = false;
        }
        cagi cagi3 = (cagi) bxvf2.f164949b;
        cagi3.f173098a |= 2;
        cagi3.f173100c = j2;
        bxvf bxvf3 = this.f42325i;
        qws qws = this.f42317a;
        rjo rjo = qws.f42331a;
        qwr qwr = qws.f42348o;
        long a = qwr.m33017a(((cagi) bxvf3.f164949b).f173099b);
        if (bxvf3.f164950c) {
            bxvf3.mo74035c();
            bxvf3.f164950c = false;
        }
        cagi cagi4 = (cagi) bxvf3.f164949b;
        cagi4.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        cagi4.f173107j = a;
    }

    public qwo(qws qws, qwq qwq) {
        this(qws, null, qwq);
    }

    /* renamed from: a */
    public final void mo24325a(String str) {
        qws qws = this.f42317a;
        rjo rjo = qws.f42331a;
        if (qws.f42344k) {
            Log.e("ClearcutLogger", "addMendelPackage forbidden on anonymous logger");
        }
        if (this.f42328l == null) {
            this.f42328l = new ArrayList();
        }
        this.f42328l.add(str);
    }

    /* renamed from: a */
    public final void mo24326a(int[] iArr) {
        qws qws = this.f42317a;
        rjo rjo = qws.f42331a;
        if (qws.f42344k) {
            Log.e("ClearcutLogger", "addExperimentIds forbidden on anonymous logger");
        }
        if (iArr != null && (r0 = iArr.length) != 0) {
            if (this.f42329m == null) {
                this.f42329m = new ArrayList();
            }
            for (int i : iArr) {
                this.f42329m.add(Integer.valueOf(i));
            }
        }
    }
}
