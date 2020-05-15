package p000;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: dgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dgh extends dez {

    /* renamed from: e */
    private static volatile dgh f13056e;

    public dgh(Context context) {
        super(context, "current_features.fb");
    }

    /* renamed from: a */
    public static Intent m8388a(ModuleManager.FeatureList featureList) {
        return new Intent("com.google.android.chimera.container.REQUEST_FEATURES_WITH_UI").putExtra("chimera.FEATURE_LIST", featureList.getProtoBytes());
    }

    /* renamed from: d */
    public final List mo8953d() {
        return mo8951a((String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b6 A[RETURN] */
    /* renamed from: e */
    public final brtm mo8954e() {
        brtm brtm;
        Throwable th;
        brtm brtm2;
        File file = this.f12991b;
        if (mo8639c()) {
            file = dft.m8317a(dge.m8385a(this.f12990a));
        }
        synchronized (this) {
            brtm = null;
            try {
                FileInputStream fileInputStream = new FileInputStream(dez.m8264a(file, "current_features.fb"));
                try {
                    brtm2 = dft.m8324b(fileInputStream);
                    try {
                        if (brtm2.mo9168Q() != 1) {
                            int Q = brtm2.mo9168Q();
                            StringBuilder sb = new StringBuilder(46);
                            sb.append("Wrong version: expects 1 but found ");
                            sb.append(Q);
                            Log.e("FeatureMgr", sb.toString());
                        } else {
                            brtm = brtm2;
                        }
                        try {
                            fileInputStream.close();
                        } catch (InvalidConfigException | IOException e) {
                            e = e;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            try {
                                bqye.m113761a(th, th3);
                            } catch (InvalidConfigException | IOException e2) {
                                brtm = brtm2;
                                e = e2;
                                String valueOf = String.valueOf(e);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 31);
                                sb2.append("Failed to read feature config: ");
                                sb2.append(valueOf);
                                String sb3 = sb2.toString();
                                if (!(e instanceof FileNotFoundException)) {
                                }
                                if (brtm != null) {
                                }
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    brtm2 = null;
                    fileInputStream.close();
                    throw th;
                }
            } catch (InvalidConfigException | IOException e3) {
                e = e3;
                String valueOf2 = String.valueOf(e);
                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                sb22.append("Failed to read feature config: ");
                sb22.append(valueOf2);
                String sb32 = sb22.toString();
                if (!(e instanceof FileNotFoundException)) {
                    Log.w("FeatureMgr", sb32);
                }
                if (brtm != null) {
                }
            }
        }
        if (brtm != null) {
            return brtm;
        }
        brtj brtj = new brtj(100);
        brtm.m114591a(brtj, brtm.m114590a(brtj, 1, 0, 0, -1));
        ByteBuffer f = brtj.mo69888f();
        f.remaining();
        return brtm.m114593c(f);
    }

    /* renamed from: a */
    public static dgh m8389a(Context context) {
        dgh dgh = f13056e;
        if (dgh == null) {
            synchronized (dgh.class) {
                dgh = f13056e;
                if (dgh == null) {
                    dgh = new dgh(context);
                    f13056e = dgh;
                }
            }
        }
        return dgh;
    }

    /* renamed from: a */
    public final List mo8951a(String str) {
        C1225nr nrVar = new C1225nr();
        dfq.m8314a();
        String f = cdjh.f180979a.mo6606a().mo77741f();
        if (!f.isEmpty()) {
            for (String str2 : f.split(",")) {
                nrVar.add(str2);
            }
        }
        dfq.m8314a();
        boolean g = cdjh.m133557g();
        brtm e = mo8954e();
        int v = e.mo69933v();
        ArrayList arrayList = new ArrayList(v);
        brtm brtm = new brtm();
        for (int i = 0; i < v; i++) {
            e.mo69919b(brtm, i);
            String y = brtm.mo69936y();
            String A = brtm.mo69892A();
            if (str == null || str.equals(A)) {
                if (A.equals(":server_requester")) {
                    dfq.m8314a();
                    if (!cdjl.m133598d()) {
                    }
                }
                if (!A.equals("system_image") || (g && !nrVar.contains(y))) {
                    bxvd da = djd.f13314d.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    djd djd = (djd) da.f164949b;
                    y.getClass();
                    djd.f13316a |= 1;
                    djd.f13317b = y;
                    long z = brtm.mo69937z();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    djd djd2 = (djd) da.f164949b;
                    djd2.f13316a |= 2;
                    djd2.f13318c = z;
                    arrayList.add((djd) da.mo74062i());
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x021a, code lost:
        if (r28 == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x021c, code lost:
        r4 = r1.f12990a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0222, code lost:
        if (r25.isEmpty() != false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0224, code lost:
        r3 = p000.dje.f13319b.mo74144da();
        r3.mo74060h(r25);
        r3 = ((p000.dje) r3.mo74062i()).mo73642k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x023b, code lost:
        r1.f12990a.startService(p000.dgf.m8387a(r4, r3, r0, r30));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0247, code lost:
        if (r0 == null) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0249, code lost:
        p000.dkz.m8776a(r0, r10 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x024c, code lost:
        return r2;
     */
    /* renamed from: a */
    public final boolean mo8952a(String str, Collection collection, Collection collection2, boolean z, boolean z2, djk djk, String str2, dgg dgg) {
        boolean z3;
        brtm brtm;
        boolean z4;
        int i;
        long j;
        boolean z5;
        long j2;
        int a;
        boolean z6;
        djk djk2 = djk;
        dgg dgg2 = dgg;
        ByteBuffer a2 = djh.m8648a(str);
        C1245ok okVar = new C1245ok(collection.size());
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            djd djd = (djd) it.next();
            okVar.put(djh.m8648a(djd.f13317b), Long.valueOf(djd.f13318c));
            String str3 = djd.f13317b;
            long j3 = djd.f13318c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22);
            sb2.append("+");
            sb2.append(str3);
            sb2.append(":");
            sb2.append(j3);
            sb.append(sb2.toString());
        }
        C1225nr nrVar = new C1225nr(collection2.size());
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            ByteBuffer a3 = djh.m8648a(str4);
            if (!okVar.containsKey(a3)) {
                nrVar.add(a3);
                String valueOf = String.valueOf(str4);
                sb.append(valueOf.length() == 0 ? new String("-") : "-".concat(valueOf));
            } else {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 74);
                sb3.append("Attempted to request and unrequest the same feature: ");
                sb3.append(str4);
                sb3.append(". Ignoring unrequest.");
                Log.w("FeatureMgr", sb3.toString());
            }
        }
        synchronized (this) {
            brtm e = mo8954e();
            int v = e.mo69933v();
            int i2 = okVar.f26809h + v;
            brtj brtj = new brtj((i2 * 32) + 132);
            ArrayList arrayList = new ArrayList(i2);
            brtm brtm2 = new brtm();
            int i3 = 0;
            boolean z7 = false;
            while (i3 < v) {
                e.mo69919b(brtm2, i3);
                ByteBuffer __vector_as_bytebuffer = brtm2.__vector_as_bytebuffer(8, 1);
                int i4 = v;
                ByteBuffer __vector_as_bytebuffer2 = brtm2.__vector_as_bytebuffer(4, 1);
                long z8 = brtm2.mo69937z();
                if (nrVar.contains(__vector_as_bytebuffer2)) {
                    if (__vector_as_bytebuffer.equals(a2)) {
                        z7 = true;
                    } else if (z) {
                        z7 = true;
                    }
                    i3++;
                    v = i4;
                }
                if (!__vector_as_bytebuffer.equals(a2) || (a = okVar.mo15616a(__vector_as_bytebuffer2)) < 0) {
                    z5 = z7;
                    j2 = z8;
                } else {
                    long longValue = ((Long) okVar.mo15621c(a)).longValue();
                    if (longValue != z8) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    okVar.mo8152d(a);
                    z5 = z7 | z6;
                    j2 = longValue;
                }
                arrayList.add(Integer.valueOf(djh.m8644a(brtj, __vector_as_bytebuffer2, j2, __vector_as_bytebuffer)));
                z7 = z5;
                i3++;
                v = i4;
            }
            int i5 = 0;
            while (i5 < okVar.f26809h) {
                arrayList.add(Integer.valueOf(djh.m8644a(brtj, (ByteBuffer) okVar.mo15620b(i5), ((Long) okVar.mo15621c(i5)).longValue(), a2)));
                i5++;
                z7 = true;
            }
            byte[] bArr = null;
            if (z7) {
                int size = arrayList.size();
                int[] iArr = new int[size];
                for (int i6 = 0; i6 < size; i6++) {
                    iArr[i6] = ((Integer) arrayList.get(i6)).intValue();
                }
                if (dgg2 != null) {
                    i = djh.m8641a(brtj, dgg2.f13054a);
                    j = dgg2.f13055b;
                } else {
                    int a4 = djh.m8641a(brtj, e.mo69934w());
                    j = e.mo69935x();
                    i = a4;
                }
                int Q = e.mo9168Q();
                brtj.mo69870a(4, size, 4);
                int i7 = size - 1;
                while (i7 >= 0) {
                    brtj.mo69882c(iArr[i7]);
                    i7--;
                    brtj = brtj;
                }
                z4 = true;
                brtm.m114591a(brtj, brtm.m114590a(brtj, Q, brtj.mo69876b(), i, j));
                ByteBuffer f = brtj.mo69888f();
                f.remaining();
                brtm = brtm.m114593c(f);
                z3 = false;
            } else {
                z4 = true;
                z3 = false;
                brtm = null;
            }
            if (brtm != null) {
                FileInputStream a5 = dft.m8318a(brtm.getByteBuffer(), dez.m8264a(this.f12991b, "pending_features.fb"), dez.m8264a(this.f12991b, "current_features.fb"), new dfs(), false, true);
                if (a5 == null) {
                    return z3;
                }
                dhb.m8472a(a5);
                dgd.m8383a(this.f12990a, 54, sb.toString());
            }
        }
    }
}
