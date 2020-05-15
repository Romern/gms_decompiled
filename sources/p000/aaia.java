package p000;

import java.io.File;
import java.util.Arrays;

/* renamed from: aaia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaia {

    /* renamed from: a */
    public final dci f28157a;

    /* renamed from: b */
    public final File f28158b;

    /* renamed from: c */
    public final File f28159c;

    /* renamed from: d */
    public byte[] f28160d;

    /* renamed from: e */
    private final File f28161e;

    /* renamed from: f */
    private byte[] f28162f;

    public aaia(dci dci, File file, File file2, File file3) {
        this.f28157a = dci;
        this.f28158b = file;
        this.f28159c = file3;
        this.f28161e = file2;
    }

    /* renamed from: a */
    public final byte[] mo16888a() {
        if (this.f28162f == null) {
            this.f28162f = aaic.m21300a(this.f28161e);
        }
        byte[] bArr = this.f28162f;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo16889b() {
        return System.currentTimeMillis() / 1000 > this.f28157a.f12816d;
    }
}
