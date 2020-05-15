package p000;

import android.content.Context;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aghy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aghy extends agkr {

    /* renamed from: a */
    bqnk f65547a;

    public aghy(agmn agmn) {
        super(agmn);
    }

    /* renamed from: a */
    public final String mo35430a(String str, String str2) {
        sdo.m34959a((Object) str);
        if (str2 == null) {
            str2 = "";
        }
        bqnk bqnk = this.f65547a;
        if (bqnk != null) {
            try {
                return Base64.encodeToString(bqnk.mo69285a(str.getBytes("UTF-8"), str2.getBytes("UTF-8")), 0);
            } catch (Exception e) {
                mo35497E().f65571j.mo35436a("Error during encryption of value", e.getMessage());
                throw new SecurityException("Failed to encrypt data.", e);
            }
        } else {
            throw new SecurityException("Failed to get encryption primitive.");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02a7, code lost:
        if (r8 == 1) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02aa, code lost:
        if (r8 == 2) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02ad, code lost:
        if (r8 == 3) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02b0, code lost:
        if (r8 == 4) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02b2, code lost:
        r6 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02b5, code lost:
        r6 = r23 + 1;
        r5[r23] = (byte) (r21 >> 10);
        r5[r6] = (byte) (r21 >> 2);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02c7, code lost:
        r6 = r23 + 1;
        r5[r23] = (byte) (r21 >> 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02d0, code lost:
        r7.f141641b = r8;
        r5 = r7.f141639a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02d5, code lost:
        if (r6 == r5.length) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02d7, code lost:
        r7 = new byte[r6];
        java.lang.System.arraycopy(r5, 0, r7, 0, r6);
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02e0, code lost:
        r6 = p000.bqsd.f141509d.mo74144da();
        r7 = r12.getString("typeUrl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02ec, code lost:
        if (r6.f164950c != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02ef, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02f5, code lost:
        r7.getClass();
        ((p000.bqsd) r6.f164949b).f141511a = r7;
        r5 = p000.bxtx.m123261a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0304, code lost:
        if (r6.f164950c != false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0307, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x030d, code lost:
        r5.getClass();
        ((p000.bqsd) r6.f164949b).f141512b = r5;
        r5 = r12.getString("keyMaterialType");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0320, code lost:
        if (r5.equals("SYMMETRIC") != false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0328, code lost:
        if (r5.equals("ASYMMETRIC_PRIVATE") != false) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0330, code lost:
        if (r5.equals("ASYMMETRIC_PUBLIC") != false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0338, code lost:
        if (r5.equals("REMOTE") != false) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x033a, code lost:
        r3 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0346, code lost:
        if (r3.length() != 0) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0348, code lost:
        r3 = new java.lang.String("unknown key material type: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x034e, code lost:
        r3 = "unknown key material type: ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0355, code lost:
        throw new org.json.JSONException(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0356, code lost:
        r7 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0358, code lost:
        r7 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x035a, code lost:
        r7 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x035c, code lost:
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x035f, code lost:
        if (r6.f164950c != false) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0362, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0368, code lost:
        ((p000.bqsd) r6.f164949b).f141513c = p000.bqsc.m113308a(r7);
        r1 = (p000.bqsd) r6.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x037a, code lost:
        if (r13.f164950c != false) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x037e, code lost:
        r13.mo74035c();
        r13.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0384, code lost:
        r1.getClass();
        ((p000.bqsi) r13.f164949b).f141527a = r1;
        r11.mo69327a((p000.bqsi) r13.mo74062i());
        r10 = r10 + 1;
        r1 = r27;
        r7 = r16;
        r5 = r19;
        r3 = r20;
        r6 = r22;
        r8 = r24;
        r9 = r25;
     */
    /* renamed from: a */
    public final void mo35431a(InputStream inputStream) {
        int i;
        int i2;
        aghy aghy = this;
        String str = "value";
        String str2 = "outputPrefixType";
        String str3 = "keyId";
        String str4 = "status";
        String str5 = "keyData";
        sdo.m34959a(inputStream);
        try {
            bqpu.m113219a();
            JSONObject jSONObject = new JSONObject(new String(bqol.m113119a(new bqnl(inputStream).f141309b), bqnl.f141308a));
            if (!jSONObject.has("key") || jSONObject.getJSONArray("key").length() == 0) {
                throw new JSONException("invalid keyset");
            }
            bqsh bqsh = (bqsh) bqsj.f141531c.mo74144da();
            if (jSONObject.has("primaryKeyId")) {
                int i3 = jSONObject.getInt("primaryKeyId");
                if (bqsh.f164950c) {
                    bqsh.mo74035c();
                    bqsh.f164950c = false;
                }
                ((bqsj) bqsh.f164949b).f141533a = i3;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("key");
            int i4 = 0;
            loop0:
            while (i4 < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                if (!jSONObject2.has(str5) || !jSONObject2.has(str4) || !jSONObject2.has(str3) || !jSONObject2.has(str2)) {
                    throw new JSONException("invalid key");
                }
                bxvd da = bqsi.f141525e.mo74144da();
                String string = jSONObject2.getString(str4);
                String str6 = str4;
                if (string.equals("ENABLED")) {
                    i = 3;
                } else if (!string.equals("DISABLED")) {
                    String valueOf = String.valueOf(string);
                    throw new JSONException(valueOf.length() == 0 ? new String("unknown status: ") : "unknown status: ".concat(valueOf));
                } else {
                    i = 4;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bqsi) da.f164949b).f141528b = bqse.m113311a(i);
                int i5 = jSONObject2.getInt(str3);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bqsi) da.f164949b).f141529c = i5;
                String string2 = jSONObject2.getString(str2);
                if (string2.equals("TINK")) {
                    i2 = 3;
                } else if (string2.equals("RAW")) {
                    i2 = 5;
                } else if (string2.equals("LEGACY")) {
                    i2 = 4;
                } else if (!string2.equals("CRUNCHY")) {
                    String valueOf2 = String.valueOf(string2);
                    throw new JSONException(valueOf2.length() == 0 ? new String("unknown output prefix type: ") : "unknown output prefix type: ".concat(valueOf2));
                } else {
                    i2 = 6;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bqsi) da.f164949b).f141530d = bqsq.m113325a(i2);
                JSONObject jSONObject3 = jSONObject2.getJSONObject(str5);
                if (!jSONObject3.has("typeUrl") || !jSONObject3.has(str) || !jSONObject3.has("keyMaterialType")) {
                    throw new JSONException("invalid keyData");
                }
                byte[] bytes = jSONObject3.getString(str).getBytes(bquo.f141643a);
                int length = bytes.length;
                String str7 = str;
                bqun bqun = new bqun(new byte[((length * 3) / 4)]);
                int i6 = bqun.f141641b;
                String str8 = str2;
                if (i6 != 6) {
                    byte[] bArr = bqun.f141639a;
                    int[] iArr = bqun.f141642c;
                    String str9 = str3;
                    String str10 = str5;
                    int i7 = i6;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        JSONArray jSONArray2 = jSONArray;
                        if (i8 >= length) {
                            break;
                        }
                        if (i7 == 0) {
                            while (true) {
                                int i11 = i8 + 4;
                                if (i11 > length) {
                                    break;
                                }
                                int i12 = i11;
                                int i13 = (iArr[bytes[i8 + 1] & 255] << 12) | (iArr[bytes[i8] & 255] << 18) | (iArr[bytes[i8 + 2] & 255] << 6) | iArr[bytes[i8 + 3] & 255];
                                if (i13 < 0) {
                                    i9 = i13;
                                    break;
                                }
                                bArr[i10 + 2] = (byte) i13;
                                bArr[i10 + 1] = (byte) (i13 >> 8);
                                bArr[i10] = (byte) (i13 >> 16);
                                i10 += 3;
                                i9 = i13;
                                i8 = i12;
                            }
                            if (i8 >= length) {
                                break;
                            }
                        }
                        int i14 = i8 + 1;
                        int i15 = iArr[bytes[i8] & 255];
                        if (i7 == 0) {
                            if (i15 < 0) {
                                if (i15 != -1) {
                                    break loop0;
                                }
                            } else {
                                i7++;
                                i9 = i15;
                                i8 = i14;
                                jSONArray = jSONArray2;
                            }
                        } else {
                            if (i7 == 1) {
                                if (i15 < 0) {
                                    if (i15 != -1) {
                                        break loop0;
                                    }
                                } else {
                                    i7++;
                                    i9 = i15 | (i9 << 6);
                                    i8 = i14;
                                    jSONArray = jSONArray2;
                                }
                            } else if (i7 == 2) {
                                if (i15 < 0) {
                                    if (i15 != -2) {
                                        if (i15 != -1) {
                                            break loop0;
                                        }
                                    } else {
                                        bArr[i10] = (byte) (i9 >> 4);
                                        i10++;
                                        i7 = 4;
                                    }
                                } else {
                                    i7++;
                                    i9 = i15 | (i9 << 6);
                                }
                                i8 = i14;
                                jSONArray = jSONArray2;
                            } else if (i7 != 3) {
                                if (i7 == 4) {
                                    if (i15 != -2) {
                                        if (i15 != -1) {
                                            break loop0;
                                        }
                                    } else {
                                        i7++;
                                        i8 = i14;
                                        jSONArray = jSONArray2;
                                    }
                                } else if (i7 == 5) {
                                    if (i15 != -1) {
                                        break loop0;
                                    }
                                }
                            } else {
                                if (i15 < 0) {
                                    if (i15 != -2) {
                                        if (i15 != -1) {
                                            break loop0;
                                        }
                                    } else {
                                        bArr[i10 + 1] = (byte) (i9 >> 2);
                                        bArr[i10] = (byte) (i9 >> 10);
                                        i10 += 2;
                                        i7 = 5;
                                    }
                                } else {
                                    int i16 = i15 | (i9 << 6);
                                    bArr[i10 + 2] = (byte) i16;
                                    bArr[i10 + 1] = (byte) (i16 >> 8);
                                    bArr[i10] = (byte) (i16 >> 16);
                                    i10 += 3;
                                    i9 = i16;
                                    i7 = 0;
                                }
                                i8 = i14;
                                jSONArray = jSONArray2;
                            }
                            i8 = i14;
                            jSONArray = jSONArray2;
                        }
                        i8 = i14;
                        jSONArray = jSONArray2;
                    }
                    bqun.f141641b = 6;
                }
                throw new IllegalArgumentException("bad base-64");
            }
            bqsj bqsj = (bqsj) bqsh.mo74062i();
            bqnx.m113073a(bqsj);
            aghy.f65547a = bqpx.m113222a(bqns.m113055a(bqsj));
        } catch (JSONException e) {
            throw new IOException(e);
        } catch (IOException | GeneralSecurityException e2) {
            mo35497E().f65571j.mo35436a("Failed to initialize encryption primitives", e2.getMessage());
            this.f65547a = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35305a() {
        InputStream open;
        Context n = this.f65930j.mo35690n();
        sdo.m34966a(n, "Context passed for initialization is null");
        try {
            open = n.getAssets().open("public_keys/public-keyset-prod.json");
            mo35431a(open);
            if (open == null) {
                return false;
            }
            open.close();
            return false;
        } catch (IOException e) {
            mo35497E().f65571j.mo35435a("Failed to read public key for encryption");
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
