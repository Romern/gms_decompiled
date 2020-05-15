package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: xls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xls {

    /* renamed from: e */
    private static final bnic f52685e = bnic.m109489a(xqv.f52936a);

    /* renamed from: f */
    private static final bnic f52686f = bnic.m109492a(xqv.f52936a, xqv.f52940e, xqv.f52941f, xqv.f52939d);

    /* renamed from: g */
    private static final sek f52687g = new sek(new String[]{"AuthenticatorPublicKeyCredentialUserEntity"}, (short[]) null);

    /* renamed from: a */
    public final byte[] f52688a;

    /* renamed from: b */
    public final String f52689b;

    /* renamed from: c */
    public final String f52690c;

    /* renamed from: d */
    public final String f52691d;

    public xls(byte[] bArr, String str, String str2, String str3) {
        this.f52688a = (byte[]) bmxy.m108581a(bArr);
        this.f52689b = str;
        this.f52690c = str2;
        this.f52691d = str3;
    }

    /* renamed from: a */
    public static xls m43150a(bypx bypx) {
        bmxy.m108581a(bypx);
        if (bypx instanceof bypu) {
            bnim bnim = ((bypu) bypx).f167361a;
            if (bnim.f131670c.containsAll(f52685e)) {
                bnrd a = bnpf.m110057c(bnim.f131670c, f52686f).iterator();
                while (a.hasNext()) {
                    f52687g.mo25414c("Unrecognized key present in user entity map: %s", (bypx) a.next());
                }
                xlr xlr = new xlr();
                bypx bypx2 = (bypx) bnim.get(xqv.f52936a);
                bmxy.m108581a(bypx2);
                if (bypx2 instanceof bypp) {
                    byte[] k = ((bypp) bypx2).f167357a.mo73780k();
                    bmxy.m108581a(k);
                    xlr.f52681a = k;
                    if (bnim.containsKey(xqv.f52940e)) {
                        bypx bypx3 = (bypx) bnim.get(xqv.f52940e);
                        bmxy.m108581a(bypx3);
                        if (bypx3 instanceof bypv) {
                            xlr.f52683c = ((bypv) bypx3).f167363a;
                        } else {
                            String valueOf = String.valueOf(bypx3);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
                            sb.append("Found a non-textstring CBOR value: ");
                            sb.append(valueOf);
                            sb.append(" for icon label in map for user entity");
                            throw new IOException(sb.toString());
                        }
                    }
                    if (bnim.containsKey(xqv.f52939d)) {
                        bypx bypx4 = (bypx) bnim.get(xqv.f52939d);
                        bmxy.m108581a(bypx4);
                        if (bypx4 instanceof bypv) {
                            xlr.f52682b = ((bypv) bypx4).f167363a;
                        } else {
                            String valueOf2 = String.valueOf(bypx4);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 73);
                            sb2.append("Found a non-textstring CBOR value: ");
                            sb2.append(valueOf2);
                            sb2.append(" for name label in map for user entity");
                            throw new IOException(sb2.toString());
                        }
                    }
                    if (bnim.containsKey(xqv.f52941f)) {
                        bypx bypx5 = (bypx) bnim.get(xqv.f52941f);
                        bmxy.m108581a(bypx5);
                        if (bypx5 instanceof bypv) {
                            xlr.f52684d = ((bypv) bypx5).f167363a;
                        } else {
                            String valueOf3 = String.valueOf(bypx5);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 80);
                            sb3.append("Found a non-textstring CBOR value: ");
                            sb3.append(valueOf3);
                            sb3.append(" for displayName label in map for user entity");
                            throw new IOException(sb3.toString());
                        }
                    }
                    return new xls(xlr.f52681a, xlr.f52682b, xlr.f52683c, xlr.f52684d);
                }
                String valueOf4 = String.valueOf(bypx2);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 71);
                sb4.append("Found a non-bytestring CBOR value: ");
                sb4.append(valueOf4);
                sb4.append(" for id label in map for user entity");
                throw new IOException(sb4.toString());
            }
            throw new IOException("CBOR map representing user entity doesn't contain id label");
        }
        throw new IOException("CBOR value representing user entity isn't a CBOR map");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xls) {
            xls xls = (xls) obj;
            if (!Arrays.equals(this.f52688a, xls.f52688a) || !bmxi.m108538a(this.f52689b, xls.f52689b) || !bmxi.m108538a(this.f52690c, xls.f52690c) || !bmxi.m108538a(this.f52691d, xls.f52691d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f52688a)), this.f52689b, this.f52690c, this.f52691d});
    }
}
