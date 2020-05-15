package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: basd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class basd {

    /* renamed from: a */
    public final byte[] f101653a;

    /* renamed from: b */
    public final byte[] f101654b;

    /* renamed from: c */
    public final long f101655c;

    /* renamed from: d */
    private final bxuq f101656d;

    public basd(byte[] bArr, byte[] bArr2, long j, bxuq bxuq) {
        this.f101653a = bArr;
        this.f101654b = bArr2;
        this.f101655c = j;
        this.f101656d = bxuq;
    }

    /* renamed from: a */
    public final bxxc mo55930a() {
        bxus a = bxus.m123742a();
        bxuq bxuq = this.f101656d;
        if (bxvj.class.isAssignableFrom(bxuq.getClass())) {
            a.mo73904a((bxvj) bxuq);
        }
        bygn bygn = (bygn) GeneratedMessageLite.m124016a(bygn.f166357a, this.f101653a, a);
        bxvj bxvj = (bxvj) this.f101656d;
        bygn.mo74135a(bxvj);
        if (bygn.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = (bxvj) this.f101656d;
            bygn.mo74135a(bxvj2);
            Object b = bygn.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            return (bxxc) b;
        }
        throw new bxwf("Missing MessageSet extension");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            basd basd = (basd) obj;
            if (Arrays.equals(this.f101653a, basd.f101653a) && Arrays.equals(this.f101654b, basd.f101654b) && this.f101655c == basd.f101655c) {
                bxuq bxuq = this.f101656d;
                int a = bxuq != null ? bxuq.mo73900a() : 0;
                bxuq bxuq2 = basd.f101656d;
                if (a == (bxuq2 != null ? bxuq2.mo73900a() : 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((Arrays.hashCode(this.f101653a) + 527) * 31) + Arrays.hashCode(this.f101654b)) * 31) + Long.valueOf(this.f101655c).hashCode()) * 31;
        bxuq bxuq = this.f101656d;
        return hashCode + Integer.valueOf(bxuq != null ? bxuq.mo73900a() : 0).hashCode();
    }

    public final String toString() {
        String str;
        try {
            String valueOf = String.valueOf(mo55930a());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
            sb.append("{");
            sb.append(valueOf);
            sb.append("}");
            str = sb.toString();
        } catch (bxwf e) {
            str = e.getMessage();
        }
        return String.format(Locale.ENGLISH, "MdhFootprint{data=%s, secondaryId=%s, serverEventIdTimestamp=%d}", str, Arrays.toString(this.f101654b), Long.valueOf(this.f101655c));
    }
}
