package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bsfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bsfs implements Comparable {

    /* renamed from: c */
    public final int f144497c;

    /* renamed from: d */
    public final double f144498d;

    /* renamed from: e */
    public final double[] f144499e;

    public bsfs(double d) {
        this(5, d);
    }

    /* renamed from: b */
    public static bsfr m115706b(int i) {
        return new bsfr(i);
    }

    /* renamed from: a */
    public final double mo70516a(int i) {
        boolean z = true;
        bxbm.m122541a(this.f144499e != null);
        if (i >= this.f144499e.length) {
            z = false;
        }
        bxbm.m122541a(z);
        return this.f144499e[i];
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bsfs bsfs = (bsfs) obj;
        int compare = Double.compare(this.f144498d, bsfs.f144498d);
        return compare == 0 ? Integer.compare(this.f144497c, bsfs.f144497c) : compare;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bsfs(double d, double d2) {
        this(7, d, r0);
        bsfr b = m115706b(1);
        b.mo70514a(0, d2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bsfs(double d, double d2, double d3) {
        this(6, d, r0);
        bsfr b = m115706b(2);
        b.mo70514a(0, d2);
        b.mo70514a(1, d3);
    }

    public bsfs(int i, double d) {
        this.f144497c = i;
        this.f144498d = d;
        this.f144499e = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bsfs(int i, double d, double d2, double d3, double d4) {
        this(i, d, r4);
        boolean z;
        int i2 = i;
        if (i2 == 1) {
            z = true;
        } else {
            z = i2 == 2;
        }
        bxbm.m122543a(z, "Position EvidenceType must be one of [%s,%s], but was %s!", 1, 2, Integer.valueOf(i));
        bsfr b = m115706b(3);
        b.mo70514a(0, d2);
        b.mo70514a(1, d3);
        b.mo70514a(2, d4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bsfs(int i, double d, double d2, double d3, double d4, byte[] bArr) {
        this(i, d, r1);
        int i2;
        int i3 = i;
        if (i3 == 100 || i3 == 101 || i3 == 102 || i3 == 103 || i3 == 104 || i3 == 105) {
            i2 = i3;
        } else {
            i2 = 106;
        }
        bxbm.m122543a(true, "Position EvidenceType must be one of [%s,%s,%s,%s,%s,%s,%s], but was %s!", 100, 101, 102, Integer.valueOf((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR), Integer.valueOf((int) ErrorInfo.TYPE_SDU_FAILED), Integer.valueOf((int) ErrorInfo.TYPE_SDU_MEMORY_FULL), 106, Integer.valueOf(i2));
        bsfr b = m115706b(3);
        b.mo70514a(0, d2);
        b.mo70514a(1, d3);
        b.mo70514a(2, d4);
    }

    public bsfs(int i, double d, bsfr bsfr) {
        this.f144497c = i;
        bxbm.m122540a(bsfr, "arrayBuilder must not be null, use alternative constructor.");
        this.f144498d = d;
        this.f144499e = bsfr.mo70515a();
    }

    public bsfs(int i, double d, double[] dArr) {
        this.f144497c = i;
        this.f144498d = d;
        this.f144499e = dArr;
    }
}
