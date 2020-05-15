package p000;

import android.util.Log;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: sio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sio {
    /* renamed from: a */
    public static InputStream m35367a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        if (srz.m36173a(bArr)) {
            try {
                return new GZIPInputStream(byteArrayInputStream);
            } catch (IOException e) {
            }
        }
        return byteArrayInputStream;
    }

    /* renamed from: a */
    public abstract Map mo7367a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Object mo17863c(String str);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17834c(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        mo25614b(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo17879d(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        mo25616c(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo17864d(String str);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo17880e(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        mo25617d(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo17881f(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        mo25618e(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo17882g(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        mo25619f(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo17883h(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        mo25620g(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo17884i(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        mo25621h(str, arrayList);
    }

    public String toString() {
        Map a = mo7367a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a.keySet()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) a.get(str);
            if (mo7370a(fastJsonResponse$Field)) {
                Object b = m35370b(fastJsonResponse$Field, mo7371b(fastJsonResponse$Field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (b != null) {
                    switch (fastJsonResponse$Field.f30316d) {
                        case 8:
                            sb.append("\"");
                            sb.append(sqd.m35968b((byte[]) b));
                            sb.append("\"");
                            continue;
                        case 9:
                            sb.append("\"");
                            sb.append(sqd.m35970c((byte[]) b));
                            sb.append("\"");
                            continue;
                        case 10:
                            ssf.m36208a(sb, (HashMap) b);
                            continue;
                        default:
                            if (!fastJsonResponse$Field.f30315c) {
                                m35368a(sb, fastJsonResponse$Field, b);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) b;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m35368a(sb, fastJsonResponse$Field, obj);
                                    }
                                }
                                sb.append("]");
                                continue;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* renamed from: b */
    protected static final Object m35370b(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f30323k;
        return (stringToIntConverter == null || (obj = (String) stringToIntConverter.f30309c.get(((Integer) obj).intValue())) != null || !stringToIntConverter.f30308b.containsKey("gms_unknown")) ? obj : "gms_unknown";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo25616c(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo25617d(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo25618e(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo25619f(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo25620g(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo25621h(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo25622i(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    /* renamed from: a */
    private static final void m35368a(StringBuilder sb, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        int i = fastJsonResponse$Field.f30314b;
        if (i == 11) {
            sb.append(((sio) fastJsonResponse$Field.f30320h.cast(obj)).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(ssd.m36199a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: a */
    private static final boolean m35369a(String str, Object obj) {
        if (obj != null) {
            return true;
        }
        if (!Log.isLoggable("FastJsonResponse", 6)) {
            return false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
        sb.append("Output field (");
        sb.append(str);
        sb.append(") has a null value, but expected a primitive");
        Log.e("FastJsonResponse", sb.toString());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        boolean z;
        String str = fastJsonResponse$Field.f30318f;
        if (fastJsonResponse$Field.f30320h == null) {
            return mo17863c(str);
        }
        if (mo17863c(str) == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34972a(z, "Concrete field shouldn't be value object: %s", fastJsonResponse$Field.f30318f);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void mo25607a(FastJsonResponse$Field fastJsonResponse$Field, double d) {
        if (fastJsonResponse$Field.f30323k == null) {
            mo17873a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, d);
        } else {
            mo25608a(fastJsonResponse$Field, Double.valueOf(d));
        }
    }

    /* renamed from: a */
    public final void mo25608a(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        String str = fastJsonResponse$Field.f30318f;
        StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f30323k;
        Integer num = (Integer) stringToIntConverter.f30308b.get((String) obj);
        if (num == null) {
            num = (Integer) stringToIntConverter.f30308b.get("gms_unknown");
        }
        int i = fastJsonResponse$Field.f30316d;
        switch (i) {
            case 0:
                if (m35369a(str, num)) {
                    mo7391a(fastJsonResponse$Field, str, num.intValue());
                    return;
                }
                return;
            case 1:
                mo17876a(fastJsonResponse$Field, str, (BigInteger) num);
                return;
            case 2:
                if (m35369a(str, num)) {
                    mo7394a(fastJsonResponse$Field, str, ((Long) num).longValue());
                    return;
                }
                return;
            case 3:
            default:
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 4:
                if (m35369a(str, num)) {
                    mo17873a(fastJsonResponse$Field, str, ((Double) num).doubleValue());
                    return;
                }
                return;
            case 5:
                mo17875a(fastJsonResponse$Field, str, (BigDecimal) num);
                return;
            case 6:
                if (m35369a(str, num)) {
                    mo7395a(fastJsonResponse$Field, str, ((Boolean) num).booleanValue());
                    return;
                }
                return;
            case 7:
                mo7376a(fastJsonResponse$Field, str, (String) num);
                return;
            case 8:
            case 9:
                if (m35369a(str, num)) {
                    mo7392a(fastJsonResponse$Field, str, (byte[]) num);
                    return;
                }
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        mo25622i(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25614b(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    /* renamed from: b */
    public final void mo25615b(byte[] bArr) {
        InputStream a = m35367a(bArr);
        try {
            new sja().mo25625a(a, this);
            try {
                a.close();
            } catch (IOException e) {
            }
        } catch (Throwable th) {
            try {
                a.close();
            } catch (IOException e2) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo25599b(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17873a(FastJsonResponse$Field fastJsonResponse$Field, String str, double d) {
        mo25600a(str, d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17874a(FastJsonResponse$Field fastJsonResponse$Field, String str, float f) {
        mo25601a(str, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        mo25602a(str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        mo25603a(str, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        mo25604a(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17875a(FastJsonResponse$Field fastJsonResponse$Field, String str, BigDecimal bigDecimal) {
        mo25611a(str, bigDecimal);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17876a(FastJsonResponse$Field fastJsonResponse$Field, String str, BigInteger bigInteger) {
        mo25612a(str, bigInteger);
    }

    /* renamed from: a */
    public void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        mo25595a(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17877a(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
        mo25613a(str, map);
    }

    /* renamed from: a */
    public void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        mo25598a(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        mo25605a(str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7392a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        mo25606a(str, bArr);
    }

    /* renamed from: a */
    public final void mo25609a(FastJsonResponse$Field fastJsonResponse$Field, boolean z) {
        if (fastJsonResponse$Field.f30323k == null) {
            mo7395a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, z);
        } else {
            mo25608a(fastJsonResponse$Field, Boolean.valueOf(z));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, java.lang.Object):void
     arg types: [com.google.android.gms.common.server.response.FastJsonResponse$Field, byte[]]
     candidates:
      sio.a(java.lang.String, java.lang.Object):boolean
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, double):void
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, boolean):void
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, byte[]):void
      sio.a(java.lang.String, double):void
      sio.a(java.lang.String, float):void
      sio.a(java.lang.String, int):void
      sio.a(java.lang.String, long):void
      sio.a(java.lang.String, java.lang.String):void
      sio.a(java.lang.String, java.math.BigDecimal):void
      sio.a(java.lang.String, java.math.BigInteger):void
      sio.a(java.lang.String, java.util.ArrayList):void
      sio.a(java.lang.String, java.util.Map):void
      sio.a(java.lang.String, sio):void
      sio.a(java.lang.String, boolean):void
      sio.a(java.lang.String, byte[]):void
      sio.a(com.google.android.gms.common.server.response.FastJsonResponse$Field, java.lang.Object):void */
    /* renamed from: a */
    public final void mo25610a(FastJsonResponse$Field fastJsonResponse$Field, byte[] bArr) {
        if (fastJsonResponse$Field.f30323k == null) {
            mo7392a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, bArr);
        } else {
            mo25608a(fastJsonResponse$Field, (Object) bArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25600a(String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25601a(String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25602a(String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25603a(String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25604a(String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25611a(String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25612a(String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    /* renamed from: a */
    public void mo25595a(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25613a(String str, Map map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    /* renamed from: a */
    public void mo25598a(String str, sio sio) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25605a(String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25606a(String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.f30316d != 11) {
            return mo17864d(fastJsonResponse$Field.f30318f);
        }
        if (fastJsonResponse$Field.f30317e) {
            return mo25596a(fastJsonResponse$Field.f30318f);
        }
        return mo25599b(fastJsonResponse$Field.f30318f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo25596a(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }
}
