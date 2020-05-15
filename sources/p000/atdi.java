package p000;

import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: atdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdi implements atcy {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        if (r5 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (r5.length <= 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        p000.czl.m8003a(r8, "cannot handle replenishments with null or empty bundle");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r5 = p000.ctj.m7550a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r0 = (org.json.JSONObject) new org.json.JSONTokener(p000.czm.m8009a(r0)).nextValue();
        r8 = r0.optJSONObject("constraints");
        r0 = p000.ctj.m7552a(r0);
        r9 = r5.f12016c;
        r0 = p000.ctj.m7551a(r0, r5.f12017d);
        java.util.Collections.sort(r0, p000.ctp.m7577a());
        r11 = new java.util.ArrayList(r9.size() + r0.size());
        r11.addAll(r9);
        r11.addAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        if (r8 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e8, code lost:
        r16 = new p000.ctk(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f0, code lost:
        r16 = r5.f12018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r11.isEmpty() != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        r17 = p000.ctj.m7549a(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        r17 = r5.f12017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0105, code lost:
        r0 = new p000.ctj(r5.f12014a, r5.f12015b, java.util.Collections.unmodifiableList(r11), r16, r17).mo8262b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0163, code lost:
        throw new p000.ctt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0164, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016b, code lost:
        throw new p000.cts(r0);
     */
    /* renamed from: a */
    public final atcv mo49808a(askf askf, atcv atcv, bmtc bmtc, byte[] bArr, long j) {
        atdh atdh;
        bmsr bmsr;
        byte[] bArr2;
        bmtc bmtc2 = bmtc;
        long j2 = j;
        if (atcv == null) {
            atdh = new atdh(bycz.f165744e);
        } else {
            atdh = (atdh) atcv;
        }
        if (bmtc2.f130815a == 5) {
            bmsr = (bmsr) bmtc2.f130816b;
        } else {
            bmsr = bmsr.f130740b;
        }
        byte[] k = bmsr.f130742a.getKey();
        bxvd bxvd = atdh.f90118a;
        byte[] k2 = ((bycz) bxvd.f164949b).f165747b.getKey();
        czl.m8003a(k != null && k.length > 0, "cannot update bundles with null or empty update payloads");
        try {
            Object nextValue = new JSONTokener(czm.m8009a(k)).nextValue();
            if (nextValue instanceof JSONObject) {
                int optInt = ((JSONObject) nextValue).optInt("call_type", 2);
                int i = 0;
                while (true) {
                    if (i >= cti.m7548a().length) {
                        break;
                    } else if (cti.m7548a()[i] != optInt) {
                        i++;
                    } else if (cti.m7548a()[i] == 1) {
                        try {
                            ctj a = ctj.m7550a(k);
                            List a2 = ctj.m7551a(a.f12016c, -1);
                            Collections.sort(a2, ctp.m7577a());
                            bArr2 = a.mo8261b(a2).mo8262b();
                        } catch (JSONException e) {
                            throw new ctt(e);
                        }
                    }
                }
                ByteString a3 = ByteString.m123261a(bArr2);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bycz bycz = (bycz) bxvd.f164949b;
                bycz bycz2 = bycz.f165744e;
                a3.getClass();
                bycz.f165746a = 1 | bycz.f165746a;
                bycz.f165747b = a3;
                long j3 = 0;
                if (j2 != 0) {
                    j3 = System.currentTimeMillis() - j2;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bycz bycz3 = (bycz) bxvd.f164949b;
                int i2 = bycz3.f165746a | 2;
                bycz3.f165746a = i2;
                bycz3.f165748c = j3;
                bycz3.f165746a = i2 | 4;
                bycz3.f165749d = j2;
                return atdh;
            }
            throw new cts("top-level bundle object should be a json object ('{...}')");
        } catch (JSONException e2) {
            throw new ctt(e2);
        }
    }

    /* renamed from: a */
    public final btmd mo49809a() {
        return btmd.f149473c;
    }

    /* renamed from: a */
    public final CryptoParameters mo49810a(atcv atcv) {
        return CryptoParameters.f108620c;
    }
}
