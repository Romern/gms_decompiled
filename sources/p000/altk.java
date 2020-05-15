package p000;

import android.content.Context;
import android.content.res.Resources;
import com.felicanetworks.mfc.C0126R;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* renamed from: altk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altk {

    /* renamed from: d */
    private static altk f74218d;

    /* renamed from: a */
    public String[] f74219a;

    /* renamed from: b */
    public short[] f74220b;

    /* renamed from: c */
    public boolean f74221c;

    private altk(Context context) {
        int read;
        System.currentTimeMillis();
        Resources resources = context.getResources();
        BufferedInputStream bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(C0126R.raw.pinyins)));
        try {
            int parseInt = Integer.parseInt(bufferedReader.readLine());
            this.f74219a = new String[parseInt];
            int i = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                this.f74219a[i] = readLine;
                i++;
            }
            if (i == parseInt) {
                srz.m36171a(bufferedReader);
                bufferedReader = new BufferedInputStream(resources.openRawResource(C0126R.raw.indexes));
                try {
                    byte[] bArr = new byte[41984];
                    int i2 = 0;
                    do {
                        read = bufferedReader.read(bArr, i2, 41984 - i2);
                        i2 += read;
                        if (read == -1) {
                            break;
                        }
                    } while (read + i2 != 41984);
                    this.f74220b = new short[20992];
                    for (int i3 = 0; i3 < 20992; i3++) {
                        int i4 = i3 + i3;
                        short s = (short) ((bArr[i4 + 1] & 255) | (bArr[i4] << 8));
                        if (s < 0 || s >= this.f74219a.length) {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append("Invalid character to pinyin index: ");
                            sb.append(i3);
                            throw new RuntimeException(sb.toString());
                        }
                        this.f74220b[i3] = s;
                    }
                    srz.m36171a((Closeable) bufferedReader);
                    System.currentTimeMillis();
                    this.f74221c = true;
                } catch (Exception e) {
                    amdk.m62659b("PeoplePinyin", "Malformed or missing indexes.txt for HanziPinyin. %s", e.getMessage());
                    this.f74221c = false;
                    this.f74219a = null;
                    this.f74220b = null;
                } catch (Throwable th) {
                    srz.m36171a((Closeable) bufferedReader);
                    throw th;
                }
            } else {
                throw new RuntimeException("Mismatched counts.");
            }
        } catch (Exception e2) {
            amdk.m62659b("PeoplePinyin", "Malformed or missing input files for HanziPinyin. %s", e2.getMessage());
            this.f74221c = false;
            this.f74219a = null;
            this.f74220b = null;
        } finally {
            srz.m36171a(bufferedReader);
        }
    }

    /* renamed from: a */
    public static synchronized altk m61768a(Context context) {
        altk altk;
        synchronized (altk.class) {
            if (f74218d == null) {
                f74218d = new altk(context);
            }
            altk = f74218d;
        }
        return altk;
    }

    /* renamed from: a */
    public static final void m61769a(StringBuilder sb, ArrayList arrayList, int i) {
        String sb2 = sb.toString();
        arrayList.add(new altj(i, sb2, sb2));
        sb.setLength(0);
    }
}
