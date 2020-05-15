package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bqc implements assh {
    static {
        bqc.class.getSimpleName();
    }

    public bqc() {
        List list = bqb.f5342a;
        int i = cbd.f6383a;
    }

    /* renamed from: a */
    public static bqi m3502a(asrz asrz) {
        boolean a = asrz.mo49425a();
        boolean b = asrz.mo49426b();
        asrz.mo49427c();
        return new bqi(a, b);
    }

    /* renamed from: a */
    private static final bqp m3503a(bpw bpw, byte[] bArr, JSONObject jSONObject) {
        bxd bxd = bpw.f5327a;
        bxd.f5952f = bArr;
        bxd.f5953g = bArr;
        cat cat = bxd.f5949c;
        try {
            bqp bqp = (bqp) bpw.f5328b.mo3389f().mo3421a(jSONObject);
            bxd.f5950d = new bxp(bqp.mo3420b());
            ((bpz) cat).f5335b = bqp.mo3419a();
            return bqp;
        } catch (JSONException e) {
            throw cbb.m3877a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ asrx mo3414a(JSONObject jSONObject, JSONObject jSONObject2) {
        byte[] bArr;
        bpq bpq;
        int i = cbd.f6383a;
        try {
            byte[] a = bpu.m3478a(jSONObject, "chipdata");
            if (jSONObject2 != null) {
                bArr = cbb.m3882a(new bzj(bpu.m3478a(jSONObject2, "qi")).mo3616j(), new bzk(bpu.m3478a(jSONObject2, "dq")).mo3616j(), new bzl(bpu.m3478a(jSONObject2, "dp")).mo3616j(), new bzm(bpu.m3478a(jSONObject2, "q")).mo3616j(), new bzn(bpu.m3478a(jSONObject2, "p")).mo3616j());
            } else {
                bArr = new byte[0];
            }
            cay cay = new cay();
            byte[] bArr2 = (byte[]) cax.m3864a(a, byz.f6234a).get(byz.f6234a);
            boolean z = bArr2 != null && bArr2.length > 0;
            cay.f6366a = z;
            if (z) {
                try {
                    String str = new String(new byn(new byz(byz.f6234a, bArr2).mo3582a(byn.f6185a)).mo3563i(), "ASCII");
                    bxg[] values = bxg.values();
                    int length = values.length;
                    int i2 = 0;
                    while (i2 < length) {
                        bxg bxg = values[i2];
                        if (!bxg.f5975r.equals(str)) {
                            i2++;
                        } else {
                            cay.f6367b = bxg;
                        }
                    }
                    throw new IllegalStateException(str.length() == 0 ? new String("Unsupported card type: ") : "Unsupported card type: ".concat(str));
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
            if (cay.f6366a) {
                bxg bxg2 = cay.f6367b;
                List list = bqb.f5342a;
                int i3 = bpq.f5322a;
                int size = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        bpq = null;
                        break;
                    }
                    bpq = (bpq) list.get(i4);
                    i4++;
                    if (bpq.mo3386c().equals(bxg2)) {
                        break;
                    }
                }
                Object[] objArr = {bxg2, bpq};
                if (bpq != null) {
                    byte[] a2 = cbb.m3882a(a, bArr);
                    bxd a3 = bpq.mo3383a();
                    bzd bzd = new bzd(bpq.mo3385b());
                    bxg c = bpq.mo3386c();
                    bzg bzg = (bzg) bzd.f6242a.get(c);
                    if (bzg != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a2);
                        while (byteArrayInputStream.available() > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            try {
                                if (byteArrayInputStream.available() >= 2) {
                                    byte read = (byte) byteArrayInputStream.read();
                                    byte read2 = (byte) byteArrayInputStream.read();
                                    bze bze = new bze(read, read2);
                                    int a4 = bys.m3809a(byteArrayInputStream);
                                    if (byteArrayInputStream.available() < a4) {
                                        String valueOf = String.valueOf(cbm.m3893a(new byte[]{read, read2}));
                                        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Parse exception, could not parse dgi data for tag ") : "Parse exception, could not parse dgi data for tag ".concat(valueOf));
                                    }
                                    byte[] bArr3 = new byte[a4];
                                    int read3 = byteArrayInputStream.read(bArr3);
                                    if (a4 != 0) {
                                        if (read3 != a4) {
                                            throw new IllegalArgumentException("Parse exception, could not parse dgi data");
                                        }
                                    }
                                    bys a5 = bzg.mo3477a(bze, bArr3);
                                    citu.m151009a(Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                                    if (linkedHashMap.containsKey(a5.f6228d)) {
                                        bze bze2 = a5.f6228d;
                                        new Object[1][0] = bze2;
                                        byte[] k = ((bys) linkedHashMap.get(bze2)).mo3617k();
                                        byte[] k2 = a5.mo3617k();
                                        int length2 = k.length;
                                        int length3 = k2.length;
                                        byte[] bArr4 = new byte[(length2 + length3)];
                                        System.arraycopy(k, 0, bArr4, 0, length2);
                                        System.arraycopy(k2, 0, bArr4, length2, length3);
                                        linkedHashMap.put(a5.f6228d, bzg.mo3477a(bze2, bArr4));
                                    } else {
                                        linkedHashMap.put(a5.f6228d, a5);
                                    }
                                } else {
                                    throw new IllegalArgumentException("Parse exception, could not parse dgi tag");
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            } catch (Throwable th) {
                                citu.m151009a(Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                                throw th;
                            }
                        }
                        a3.f5948b = bpq.mo3382a(linkedHashMap);
                        a3.f5949c = new bpz();
                        return new bpw(a3, bpq);
                    }
                    String valueOf2 = String.valueOf(c);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                    sb.append("No dgi factory for platform ");
                    sb.append(valueOf2);
                    throw new IllegalStateException(sb.toString());
                }
                String valueOf3 = String.valueOf(bxg2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 23);
                sb2.append("Unsupported card type: ");
                sb2.append(valueOf3);
                throw new IllegalStateException(sb2.toString());
            }
            throw new RuntimeException("Platform DGI not present");
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        } catch (JSONException e4) {
            throw cbb.m3877a((Throwable) e4);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ asry mo3415a(asrx asrx, JSONObject jSONObject, byte[] bArr, asrz asrz, Set set) {
        bpw bpw = (bpw) asrx;
        int i = cbd.f6383a;
        m3503a(bpw, bArr, jSONObject);
        bxd bxd = bpw.f5327a;
        cat cat = bxd.f5949c;
        bpq bpq = bpw.f5328b;
        cav d = bpq.mo3387d();
        bpv bpv = ((bpz) cat).f5334a;
        try {
            bxm a = d.mo3492a(bxd, m3502a(asrz), bxf.CONTACTLESS);
            bpv.f5323a = a;
            bpv.f5324b = bpq.mo3384a(cat);
            bpv.f5325c = bArr;
            a.mo3601i();
            a.mo3501k();
            return bpv;
        } catch (bqh e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ assc mo3416a(asrx asrx, JSONObject jSONObject, byte[] bArr, asse asse, asrz asrz) {
        bpw bpw = (bpw) asrx;
        int i = cbd.f6383a;
        bqp a = m3503a(bpw, bArr, jSONObject);
        bxd bxd = bpw.f5327a;
        cas e = bpw.f5328b.mo3388e();
        bpv bpv = ((bpz) bxd.f5949c).f5334a;
        int i2 = 1;
        try {
            byte[] a2 = e.mo3489a(bxd, new bpx(asse), m3502a(asrz));
            byl f = bxd.mo3580f();
            char[] b = cbm.m3897b(f.f5930l, false);
            try {
                byte[] bArr2 = f.f5930l;
                int length = bArr2.length - 1;
                while (length >= 0 && bArr2[length] == -1) {
                    length--;
                }
                if (length >= 0) {
                    int i3 = length + 1;
                    int i4 = i3 + i3;
                    if ((bArr2[length] & 15) == 15) {
                        i4--;
                    }
                    char[] cArr = new char[i4];
                    System.arraycopy(b, 0, cArr, 0, i4);
                    cbn.m3901a(b);
                    String str = new String(cArr);
                    String a3 = bqd.m3507a(bxd.mo3580f(), a.mo3420b(), a2);
                    bxb bxb = bxd.f5948b;
                    int a4 = bxb.mo3569a(bxb.mo3577k().mo3550a(1));
                    bxb bxb2 = bxd.f5948b;
                    return new bqa(a2, bpv, str, a4, bxb2.mo3569a(bxb2.mo3577k().mo3550a(0)) + 2000, a3);
                }
                throw new IllegalArgumentException("PAN congtains only '0xFF' bytes.");
            } catch (Throwable th) {
                cbn.m3901a(b);
                throw th;
            }
        } catch (C0071car e2) {
            int i5 = e2.f6365a;
            if (i5 != 1) {
                if (i5 != 2) {
                    i2 = i5 != 3 ? i5 == 4 ? 4 : 0 : 3;
                } else {
                    i2 = 2;
                }
            }
            throw new assb(i2, e2.getMessage());
        }
    }
}
