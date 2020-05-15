package p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pjh {

    /* renamed from: c */
    private static final qav f39344c = new qav("CastMessageDesegmenter");

    /* renamed from: a */
    final Map f39345a = new HashMap();

    /* renamed from: b */
    public piz f39346b;

    /* renamed from: d */
    private final pjf f39347d;

    public pjh(pjf pjf) {
        this.f39347d = pjf;
    }

    /* renamed from: a */
    private final void m30555a(bpeq bpeq, blsw blsw, int i) {
        pjf pjf = this.f39347d;
        if (pjf != null) {
            pje a = pje.m30552a(bpeq, blsw);
            if (!pjf.f39340b.containsKey(a)) {
                pjf.f39340b.put(a, new pid());
            }
            ((pid) pjf.f39340b.get(a)).mo23163a((double) i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjc.a(java.lang.Object, java.lang.String):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      pjc.a(java.lang.String, com.google.android.gms.cast.LaunchOptions):void
      pjc.a(java.lang.String, java.lang.String):void
      pil.a(java.lang.String, com.google.android.gms.cast.LaunchOptions):void
      pil.a(java.lang.String, java.lang.String):void
      pjc.a(java.lang.Object, java.lang.String):void */
    /* renamed from: a */
    private final void m30556a(String str, String str2) {
        piz piz = this.f39346b;
        if (piz != null) {
            piz.f39267a.mo23240a((Object) str, str2);
        }
    }

    /* renamed from: a */
    private final void m30557a(byte[] bArr, String str) {
        piz piz = this.f39346b;
        if (piz != null) {
            piz.f39267a.mo23240a(bArr, str);
        }
    }

    /* renamed from: a */
    public final synchronized void mo23264a() {
        this.f39345a.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x00e3=Splitter:B:60:0x00e3, B:79:0x011e=Splitter:B:79:0x011e} */
    /* renamed from: a */
    public final synchronized void mo23265a(blsx blsx) {
        String str = blsx.f127643e;
        String str2 = blsx.f127642d;
        int a = blsu.m107537a(blsx.f127644f);
        boolean z = true;
        if (a != 0) {
            if (a == 2) {
                boolean z2 = blsx.f127647i;
                if (!TextUtils.isEmpty(blsx.f127645g)) {
                    if ((blsx.f127639a & 64) != 0) {
                        if (blsx.f127646h.mo73744a() != 0) {
                            pjg pjg = (pjg) this.f39345a.get(str);
                            if (pjg != null) {
                                if (pjg.f39343b != z) {
                                    f39344c.mo23675c("Received continuation chunk of unexpected type", new Object[0]);
                                    bpeq bpeq = bpeq.CONSUME_CHUNK_RESULT_FAIL_MISMATCHING_CONTINUATION_PAYLOAD_TYPE;
                                    blsw a2 = blsw.m107539a(blsx.f127640b);
                                    if (a2 == null) {
                                        a2 = blsw.CASTV2_1_0;
                                    }
                                    m30555a(bpeq, a2, blsx.f127646h.mo73744a());
                                    return;
                                }
                            } else if (z2) {
                                pjg = new pjg(z);
                                this.f39345a.put(str, pjg);
                            } else {
                                if (!z) {
                                    m30556a(blsx.f127646h.mo73781l(), str);
                                } else {
                                    m30557a(blsx.f127646h.getKey(), str);
                                }
                                bpeq bpeq2 = bpeq.CONSUME_CHUNK_RESULT_SUCCESS;
                                blsw a3 = blsw.m107539a(blsx.f127640b);
                                if (a3 == null) {
                                    a3 = blsw.CASTV2_1_0;
                                }
                                m30555a(bpeq2, a3, blsx.f127646h.mo73744a());
                                return;
                            }
                            pjg.f39342a = pjg.f39342a.mo73770a(blsx.f127646h);
                            if (!z2) {
                                ByteString bxtx = pjg.f39342a;
                                if (pjg.f39343b) {
                                    m30557a(bxtx.getKey(), str);
                                } else {
                                    m30556a(bxtx.mo73781l(), str);
                                }
                                this.f39345a.remove(str);
                            }
                            bpeq bpeq3 = bpeq.CONSUME_CHUNK_RESULT_SUCCESS;
                            blsw a4 = blsw.m107539a(blsx.f127640b);
                            if (a4 == null) {
                                a4 = blsw.CASTV2_1_0;
                            }
                            m30555a(bpeq3, a4, blsx.f127646h.mo73744a());
                            return;
                        }
                    }
                    bpeq bpeq4 = bpeq.CONSUME_CHUNK_RESULT_FAIL_NO_PAYLOAD;
                    blsw a5 = blsw.m107539a(blsx.f127640b);
                    if (a5 == null) {
                        a5 = blsw.CASTV2_1_0;
                    }
                    m30555a(bpeq4, a5, 0);
                    return;
                }
                if (!z2 && !z) {
                    if (!this.f39345a.containsKey(str)) {
                        m30556a(blsx.f127645g, str);
                        bpeq bpeq5 = bpeq.CONSUME_CHUNK_RESULT_SUCCESS;
                        blsw a6 = blsw.m107539a(blsx.f127640b);
                        if (a6 == null) {
                            a6 = blsw.CASTV2_1_0;
                        }
                        m30555a(bpeq5, a6, blsx.f127645g.length());
                        return;
                    }
                }
                bpeq bpeq6 = bpeq.CONSUME_CHUNK_RESULT_FAIL_STRING_PAYLOAD_NOT_ALLOWED;
                blsw a7 = blsw.m107539a(blsx.f127640b);
                if (a7 == null) {
                    a7 = blsw.CASTV2_1_0;
                }
                m30555a(bpeq6, a7, blsx.f127645g.length());
                return;
            }
        }
        int a8 = blsu.m107537a(blsx.f127644f);
        if (a8 == 0) {
            z = false;
        } else if (a8 == 1) {
            z = false;
        } else {
            return;
        }
        boolean z22 = blsx.f127647i;
        if (!TextUtils.isEmpty(blsx.f127645g)) {
        }
    }
}
