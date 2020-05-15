package p000;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* renamed from: aqfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqfj {

    /* renamed from: a */
    private static final String[] f85963a = {"su"};

    /* renamed from: b */
    private static final String[] f85964b = {"/system/bin", "/system/xbin"};

    /* renamed from: c */
    private static final String[] f85965c = {"/bin", "/xbin"};

    static {
        aqfj.class.getCanonicalName();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097 A[SYNTHETIC, Splitter:B:34:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1 A[SYNTHETIC, Splitter:B:41:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014b  */
    /* renamed from: a */
    static List m71485a() {
        String[] strArr;
        String[] strArr2;
        LinkedList linkedList;
        BufferedReader bufferedReader;
        int length;
        ArrayList arrayList = new ArrayList();
        aqff aqff = new aqff();
        String str = System.getenv("PATH");
        String[] strArr3 = null;
        BufferedReader bufferedReader2 = null;
        strArr3 = null;
        strArr3 = null;
        strArr3 = null;
        if (!TextUtils.isEmpty(str)) {
            strArr = str.split(":");
        } else {
            strArr = null;
        }
        if (strArr == null || (length = strArr.length) == 0) {
            strArr2 = f85964b;
        } else {
            String[] strArr4 = f85964b;
            strArr2 = (String[]) Arrays.copyOf(strArr4, strArr4.length + length);
            System.arraycopy(strArr, 0, strArr2, f85964b.length, length);
        }
        File file = new File("/proc/self/mountinfo");
        ArrayList arrayList2 = new ArrayList();
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            String[] split = readLine.split("\\s+");
                            if (split.length >= 10 && !TextUtils.isEmpty(split[9]) && split[9].startsWith("/dev/block/loop") && !TextUtils.isEmpty(split[4])) {
                                arrayList2.add(split[4]);
                            }
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                            }
                        }
                    } catch (IOException e2) {
                        if (bufferedReader != null) {
                        }
                        if (strArr2 == null) {
                        }
                        String[] strArr5 = f85963a;
                        HashSet hashSet = new HashSet();
                        while (r7 < r5) {
                        }
                        linkedList = new LinkedList(hashSet);
                        while (!linkedList.isEmpty()) {
                        }
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
            } catch (IOException e3) {
                bufferedReader = null;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                    }
                }
                if (strArr2 == null) {
                }
                String[] strArr52 = f85963a;
                HashSet hashSet2 = new HashSet();
                while (r7 < r5) {
                }
                linkedList = new LinkedList(hashSet2);
                while (!linkedList.isEmpty()) {
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e5) {
                    }
                }
                throw th;
            }
        }
        if (arrayList2.size() > 0) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) arrayList2.get(i);
                if (new File(str2).isDirectory()) {
                    String[] strArr6 = f85965c;
                    for (String str3 : strArr6) {
                        String valueOf = String.valueOf(str2);
                        String valueOf2 = String.valueOf(str3);
                        arrayList3.add(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
                    }
                }
            }
            strArr3 = (String[]) arrayList3.toArray(new String[0]);
        }
        if (strArr2 == null) {
            strArr2 = strArr3;
        } else if (strArr3 != null) {
            int length2 = strArr2.length;
            int length3 = strArr3.length;
            strArr2 = (String[]) Arrays.copyOf(strArr2, length2 + length3);
            System.arraycopy(strArr3, 0, strArr2, length2, length3);
        }
        String[] strArr522 = f85963a;
        HashSet hashSet22 = new HashSet();
        if (!(strArr2 == null || strArr522 == null)) {
            for (String str4 : strArr2) {
                for (String str5 : strArr522) {
                    hashSet22.add(String.format("%s/%s", str4, str5));
                }
            }
        }
        linkedList = new LinkedList(hashSet22);
        while (!linkedList.isEmpty()) {
            String str6 = (String) linkedList.poll();
            File file2 = new File(str6);
            if (file2.exists() && file2.isFile()) {
                aqex aqex = new aqex();
                aqex.f85917a = str6;
                aqex.f85919c = file2.exists();
                aqex.f85923g = aqfy.m71560a(file2);
                try {
                    aqex.f85924h = aqff.mo47816a(str6);
                } catch (aqfe e6) {
                }
                try {
                    aqex.f85925i = aqff.mo47815a(file2);
                    boolean b = aqff.mo47817b(file2);
                    aqex.f85921e = b;
                    if (b) {
                        aqex.f85922f = aqff.mo47818c(file2);
                        if (!TextUtils.isEmpty(aqex.f85922f) && !hashSet22.contains(aqex.f85922f)) {
                            hashSet22.add(aqex.f85922f);
                            linkedList.offer(aqex.f85922f);
                        }
                    }
                } catch (aqfe e7) {
                }
                arrayList.add(aqex);
            }
        }
        return arrayList;
    }
}
