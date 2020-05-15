package p000;

import com.felicanetworks.mfc.CyclicData;
import com.felicanetworks.mfc.Data;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.RandomData;
import java.nio.ByteBuffer;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: cijy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cijy {

    /* renamed from: a */
    public static final int[] f190486a = {0, 1, 2, 3, 4, 5};

    /* renamed from: c */
    public static final Currency f190487c;

    /* renamed from: d */
    public static final Map f190488d;

    /* renamed from: e */
    public static final Map f190489e;

    /* renamed from: f */
    public static final Map f190490f;

    /* renamed from: g */
    private static final Locale f190491g;

    /* renamed from: b */
    public final Felica f190492b;

    static {
        Locale locale = new Locale("ja", "JP");
        f190491g = locale;
        f190487c = Currency.getInstance(locale);
        HashMap hashMap = new HashMap();
        f190488d = hashMap;
        hashMap.put("1", 14);
        f190488d.put("2", 1);
        f190488d.put("4", 13);
        HashMap hashMap2 = new HashMap();
        f190489e = hashMap2;
        hashMap2.put("01", 1);
        f190489e.put("12", 1);
        f190489e.put("14", 1);
        f190489e.put("15", 1);
        f190489e.put("16", 1);
        f190489e.put("18", 1);
        f190489e.put("20", 1);
        f190489e.put("21", 1);
        f190489e.put("26", 1);
        f190489e.put("27", 1);
        f190489e.put("29", 1);
        f190489e.put("02", 2);
        f190489e.put("06", 2);
        f190489e.put("07", 2);
        f190489e.put("08", 2);
        f190489e.put("09", 2);
        HashMap hashMap3 = new HashMap();
        f190490f = hashMap3;
        hashMap3.put("01", true);
        f190490f.put("12", true);
        f190490f.put("14", true);
        f190490f.put("15", true);
        f190490f.put("16", true);
        f190490f.put("18", true);
        f190490f.put("20", true);
        f190490f.put("21", true);
        f190490f.put("26", true);
        f190490f.put("27", true);
        f190490f.put("29", true);
        f190490f.put("02", true);
        f190490f.put("06", true);
        f190490f.put("07", true);
        f190490f.put("08", true);
        f190490f.put("09", true);
    }

    public cijy(Felica felica) {
        this.f190492b = felica;
    }

    /* renamed from: a */
    public static String m150496a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append(new String(new char[]{"0123456789ABCDEF".charAt((b >> 4) & 15), "0123456789ABCDEF".charAt(b & 15)}));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static final byte[] m150497a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* renamed from: a */
    public static final byte[] m150498a(Data[] dataArr) {
        int length = dataArr.length;
        ByteBuffer allocate = ByteBuffer.allocate(length * 16);
        for (Data data : dataArr) {
            if (data.getType() == 1) {
                allocate.put(((RandomData) data).getBytes());
            } else if (data.getType() == 2) {
                allocate.put(((CyclicData) data).getBytes());
            }
        }
        return allocate.array();
    }
}
