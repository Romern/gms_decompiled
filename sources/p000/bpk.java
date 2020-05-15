package p000;

import java.io.ByteArrayInputStream;

/* renamed from: bpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpk {
    /* renamed from: a */
    public static final bpc m3436a(bpo bpo) {
        return new bpm(bpo);
    }

    /* renamed from: b */
    public static final bpl m3439b(byte[] bArr) {
        bpl bpl = new bpl();
        if (bArr != null) {
            for (bpc bpc : new bpn().mo3376b(new ByteArrayInputStream(bArr))) {
                bpl.mo3367a(bpc);
            }
        }
        return bpl;
    }

    /* renamed from: c */
    public static final bpo m3440c(byte[] bArr) {
        return new bpo(bArr);
    }

    /* renamed from: a */
    public static final bpc m3437a(byte[] bArr) {
        if (bArr != null) {
            return new bpn().mo3375a(new ByteArrayInputStream(bArr));
        }
        throw new IllegalArgumentException("The given TLV is null");
    }

    /* renamed from: a */
    public static final bpc m3438a(byte[] bArr, byte[] bArr2) {
        bpo c = m3440c(bArr);
        bpm bpm = new bpm(c);
        if (!c.mo3378b() || bArr2 == null) {
            bpm.mo3353a(bArr2);
        } else if (bArr2.length > 0) {
            for (bpc bpc : new bpn().mo3376b(new ByteArrayInputStream(bArr2))) {
                bpm.mo3351a(bpc);
            }
        }
        return bpm;
    }
}
