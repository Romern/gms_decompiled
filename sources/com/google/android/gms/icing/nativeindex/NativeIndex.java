package com.google.android.gms.icing.nativeindex;

import android.util.SparseIntArray;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NativeIndex {

    /* renamed from: a */
    public static final boolean f79070a;

    /* renamed from: b */
    public long f79071b;

    static {
        boolean z = false;
        try {
            System.loadLibrary("AppDataSearch");
            int nativeGetVersionCode = nativeGetVersionCode() / 1000;
            if (nativeGetVersionCode == 201515) {
                z = true;
                f79070a = z;
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Version mismatch: lib: ");
            sb.append(nativeGetVersionCode);
            sb.append(" vs apk: ");
            sb.append(201515);
            throw new UnsatisfiedLinkError(sb.toString());
        } catch (LinkageError e) {
            absg.m48195b(e, "Native load error: %s", e.getMessage());
        }
    }

    public NativeIndex(File file, abtm abtm) {
        if (!file.exists()) {
            file.mkdir();
        }
        this.f79071b = nativeCreate(m66681a(file.getCanonicalPath()), abtm.mo73642k());
    }

    /* renamed from: a */
    public static int m66677a(double d) {
        return Math.max((int) Math.round(d * 255.0d), 1);
    }

    /* renamed from: b */
    private static final abuh m66682b(byte[] bArr) {
        try {
            return (abuh) bxvk.m124016a(abuh.f58387q, bArr, bxus.m123744c());
        } catch (bxwf e) {
            absg.m48189a(e, "Failed parsing query response");
            return null;
        }
    }

    private static native boolean nativeAddCorpus(long j, long j2, int i, byte[] bArr);

    private static native void nativeAddPendingDeleteUsageReport(long j, long j2, byte[] bArr, int i, int i2);

    public static native boolean nativeAddUsageReport(long j, byte[] bArr);

    private static native int nativeAdvanceLastSeqno(long j, int i, long j2);

    private static native boolean nativeApplyPendingDeleteUsageReports(long j);

    public static native boolean nativeClear(long j);

    public static native boolean nativeClearUsageReportData(long j);

    public static native boolean nativeClearUsageReportDataForIdAndUri(long j, long j2, byte[] bArr);

    private static native void nativeCommit(long j);

    private static native byte[] nativeCompact(long j, double d, int i, byte[] bArr, long[] jArr, int[] iArr, int[] iArr2, int[] iArr3);

    public static native boolean nativeCopyIndexToDirectory(long j, String str, byte[] bArr);

    private static native long nativeCreate(byte[] bArr, byte[] bArr2);

    public static native boolean nativeDeleteCorpus(long j, int i);

    private static native int nativeDeleteDocument(long j, long j2, int i, byte[] bArr);

    private static native void nativeDestroy(long j);

    private static native byte[] nativeExecuteQuery(long j, byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    public static native void nativeFlush(long j);

    private static native byte[] nativeGetCompactStatus(long j);

    public static native long nativeGetCorpusDocumentsSize(long j, int i);

    public static native byte[] nativeGetDebugInfo(long j, int i);

    private static native long nativeGetDiskUsage(byte[] bArr);

    private static native byte[] nativeGetDocuments(long j, byte[][] bArr, byte[] bArr2);

    private static native long nativeGetLastSeqno(long j, int i, boolean z);

    public static native int[] nativeGetPhraseAffinityScores(long j, byte[] bArr);

    public static native byte[] nativeGetStatus(long j, boolean z);

    public static native byte[] nativeGetStorageState(long j);

    private static native byte[] nativeGetUsageStats(long j);

    private static native int nativeGetVersionCode();

    private static native byte[] nativeIndexDocument(long j, long j2, byte[] bArr, byte[] bArr2);

    private static native byte[] nativeIndexThing(long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    private static native byte[] nativeInit(long j);

    private static native double nativeMinFreeFraction(long j);

    private static native int nativeNumDocuments(long j);

    private static native int nativeNumPostingLists(long j);

    public static native void nativeOnMaintenance(long j, boolean z);

    public static native void nativeOnSleep(long j);

    private static native byte[] nativePatch(long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    private static native boolean nativeRebuildIndex(long j, byte[] bArr);

    public static native byte[] nativeRestoreIndex(long j, byte[] bArr);

    public static native byte[] nativeSuggest(long j, byte[] bArr, int[] iArr, int i);

    public static native int nativeTagDocument(long j, long j2, int i, byte[] bArr, byte[] bArr2, int i2, boolean z);

    private static native boolean nativeUpdateNativeConfig(long j, byte[] bArr);

    public static native boolean nativeUpgrade(long j, int i, int i2);

    /* renamed from: c */
    public final void mo43407c() {
        nativeCommit(this.f79071b);
    }

    /* renamed from: d */
    public final boml mo43408d() {
        try {
            return (boml) bxvk.m124016a(boml.f133668d, nativeGetCompactStatus(this.f79071b), bxus.m123744c());
        } catch (bxwf e) {
            absg.m48189a(e, "Failed parsing compact status");
            return null;
        }
    }

    /* renamed from: e */
    public final int mo43409e() {
        return nativeNumDocuments(this.f79071b);
    }

    /* renamed from: f */
    public final int mo43410f() {
        return nativeNumPostingLists(this.f79071b);
    }

    public final void finalize() {
        mo43406b();
        super.finalize();
    }

    /* renamed from: g */
    public final double mo43412g() {
        return nativeMinFreeFraction(this.f79071b);
    }

    /* renamed from: h */
    public final abuw mo43413h() {
        byte[] nativeGetUsageStats = nativeGetUsageStats(this.f79071b);
        if (nativeGetUsageStats == null) {
            return null;
        }
        try {
            return (abuw) bxvk.m124016a(abuw.f58491b, nativeGetUsageStats, bxus.m123744c());
        } catch (bxwf e) {
            absg.m48189a(e, "Failed parsing usage stats");
            return null;
        }
    }

    /* renamed from: i */
    public final boolean mo43414i() {
        return nativeApplyPendingDeleteUsageReports(this.f79071b);
    }

    /* renamed from: a */
    public static long m66678a(File file) {
        if (!f79070a) {
            return -1;
        }
        try {
            absg.m48185a("getDiskUsage: %s", file.getCanonicalPath());
            return nativeGetDiskUsage(m66681a(file.getCanonicalPath()));
        } catch (IOException e) {
            absg.m48195b(e, "Bad path: %s", file);
            return -1;
        }
    }

    /* renamed from: a */
    public static bqaw m66679a(int i) {
        return (bqaw) bmxu.m108565a(bqaw.m112488a(i), bqaw.UNRECOGNIZED);
    }

    /* renamed from: b */
    public final bpxk mo43405b(long j, byte[] bArr, aclb aclb, absr absr, abtj abtj) {
        try {
            return (bpxk) bxvk.m124016a(bpxk.f139724d, nativePatch(this.f79071b, j, bArr, aclb.mo73642k(), absr.mo73642k(), abtj.mo73642k()), bxus.m123744c());
        } catch (bxwf e) {
            absg.m48189a(e, "Failed to parse native index document stats.");
            return null;
        }
    }

    /* renamed from: a */
    public static String m66680a(bqaw bqaw) {
        bqaw bqaw2 = bqaw.OK;
        int ordinal = bqaw.ordinal();
        if (ordinal == 0) {
            return "ok";
        }
        if (ordinal == 1 || ordinal == 2) {
            return "ok trimmed";
        }
        if (ordinal == 3) {
            return "ok duplicate uri replaced";
        }
        if (ordinal == 4) {
            return "ok modified";
        }
        if (ordinal == 6) {
            return "error uri not found";
        }
        if (ordinal == 7) {
            return "error i/o";
        }
        int a = bqaw.mo3214a();
        StringBuilder sb = new StringBuilder(26);
        sb.append("error internal ");
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m66681a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("UTF-8 not supported");
        }
    }

    /* renamed from: a */
    public final long mo43391a(int i, boolean z) {
        return nativeGetLastSeqno(this.f79071b, i, z);
    }

    /* renamed from: b */
    public final void mo43406b() {
        long j = this.f79071b;
        if (j != 0) {
            nativeDestroy(j);
        }
        this.f79071b = 0;
    }

    /* renamed from: a */
    public final abta mo43392a(byte[] bArr) {
        try {
            return (abta) bxvk.m124016a(abta.f58189d, bArr, bxus.m123744c());
        } catch (bxwf e) {
            absg.m48189a(e, "Failed parsing document store status");
            return null;
        }
    }

    /* renamed from: a */
    public final abtk mo43393a() {
        byte[] nativeInit = nativeInit(this.f79071b);
        if (nativeInit == null) {
            return null;
        }
        try {
            return (abtk) bxvk.m124016a(abtk.f58246d, nativeInit, bxus.m123744c());
        } catch (bxwf e) {
            absg.m48189a(e, "Failed parsing init status");
            return null;
        }
    }

    /* renamed from: a */
    public final abuh mo43394a(String str, abud abud, int i, int i2) {
        return m66682b(nativeExecuteQuery(this.f79071b, m66681a(str), abud.mo73642k(), 100000, i, i2));
    }

    /* renamed from: a */
    public final abuh mo43395a(String[] strArr, abud abud) {
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = m66681a(strArr[i]);
            i++;
            i2++;
        }
        return m66682b(nativeGetDocuments(this.f79071b, bArr, abud.mo73642k()));
    }

    /* renamed from: a */
    public final bomn mo43396a(double d, int i, abtj abtj, long[] jArr, int[] iArr, SparseIntArray sparseIntArray) {
        SparseIntArray sparseIntArray2 = sparseIntArray;
        int[] iArr2 = new int[sparseIntArray.size()];
        int[] iArr3 = new int[sparseIntArray.size()];
        for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
            iArr2[i2] = sparseIntArray2.keyAt(i2);
            iArr3[i2] = sparseIntArray2.valueAt(i2);
        }
        try {
            return (bomn) bxvk.m124016a(bomn.f133673d, nativeCompact(this.f79071b, d, i, abtj.mo73642k(), jArr, iArr, iArr2, iArr3), bxus.m123744c());
        } catch (bxwf e) {
            absg.m48189a(e, "Failed parsing compaction stats");
            bxvd da = bomn.f133673d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bomn) da.f164949b).f133676b = 18;
            return (bomn) da.mo74062i();
        }
    }

    /* renamed from: a */
    public final bpxk mo43397a(long j, abqe abqe, abtj abtj) {
        try {
            return (bpxk) bxvk.m124016a(bpxk.f139724d, nativeIndexDocument(this.f79071b, j, abqe.mo73642k(), abtj.mo73642k()), bxus.m123744c());
        } catch (bxwf e) {
            absg.m48189a(e, "Failed to parse native index document stats.");
            return null;
        }
    }

    /* renamed from: a */
    public final bpxk mo43398a(long j, byte[] bArr, aclb aclb, absr absr, abtj abtj) {
        try {
            return (bpxk) bxvk.m124016a(bpxk.f139724d, nativeIndexThing(this.f79071b, j, bArr, aclb.mo73642k(), absr.mo73642k(), abtj.mo73642k()), bxus.m123744c());
        } catch (bxwf e) {
            absg.m48189a(e, "Failed to parse native index document stats.");
            return null;
        }
    }

    /* renamed from: a */
    public final bqaw mo43399a(int i, long j) {
        return m66679a(nativeAdvanceLastSeqno(this.f79071b, i, j));
    }

    /* renamed from: a */
    public final bqaw mo43400a(long j, int i, String str) {
        return m66679a(nativeDeleteDocument(this.f79071b, j, i, m66681a(str)));
    }

    /* renamed from: a */
    public final void mo43401a(long j, int i, int i2) {
        nativeAddPendingDeleteUsageReport(this.f79071b, j, m66681a(""), i, i2);
    }

    /* renamed from: a */
    public final boolean mo43402a(long j, int i, abtg abtg) {
        return nativeAddCorpus(this.f79071b, j, i, abtg.mo73642k());
    }

    /* renamed from: a */
    public final boolean mo43403a(abtj abtj) {
        return nativeRebuildIndex(this.f79071b, abtj.mo73642k());
    }

    /* renamed from: a */
    public final boolean mo43404a(abtm abtm) {
        return nativeUpdateNativeConfig(this.f79071b, abtm.mo73642k());
    }
}
