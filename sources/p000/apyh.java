package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.net.PlayServicesCronetProvider;
import com.google.android.gms.safetynet.AttestationData;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* renamed from: apyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyh extends aaab {

    /* renamed from: a */
    private static final String f85134a;

    /* renamed from: b */
    private final apga f85135b;

    /* renamed from: c */
    private final byte[] f85136c;

    /* renamed from: d */
    private final String f85137d;

    /* renamed from: e */
    private final String f85138e;

    static {
        apyh.class.getSimpleName();
        StringBuilder sb = new StringBuilder(21);
        sb.append("SafetyNet/201515033");
        f85134a = sb.toString();
    }

    public apyh(apga apga, byte[] bArr, String str, String str2) {
        super(45, "attest");
        this.f85135b = apga;
        this.f85136c = bArr;
        this.f85137d = str;
        this.f85138e = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0650, code lost:
        if (r3 == null) goto L_0x068b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0685, code lost:
        if (r3 == null) goto L_0x068b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0688, code lost:
        p000.stp.m36307a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x068b, code lost:
        p000.shr.m35312a();
        r5 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0385 A[Catch:{ Exception -> 0x0389 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03b6 A[LOOP:8: B:188:0x03b4->B:189:0x03b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0659 A[SYNTHETIC, Splitter:B:290:0x0659] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x066d A[SYNTHETIC, Splitter:B:300:0x066d] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0680 A[SYNTHETIC, Splitter:B:310:0x0680] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x06fc  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0734 A[LOOP:11: B:348:0x072e->B:350:0x0734, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0751  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x077a  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x035a A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        ArrayDeque arrayDeque;
        apyg apyg;
        long j;
        ArrayDeque arrayDeque2;
        String str;
        String str2;
        apyk apyk;
        Status status;
        apya apya;
        apyb apyb;
        Status status2;
        AttestationData attestationData;
        apyk apyk2;
        ArrayDeque<Long> arrayDeque3;
        Map a;
        apyc apyc;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        HttpURLConnection httpURLConnection2;
        InputStream inputStream2;
        Throwable th;
        DataOutputStream dataOutputStream;
        int size;
        int i;
        ArrayDeque arrayDeque4;
        String str3;
        String str4;
        long j2;
        String str5;
        ArrayDeque arrayDeque5;
        File[] fileArr;
        String str6;
        Context context2 = context;
        if (context2 == null) {
            this.f85135b.mo47168a(Status.f30109c, (AttestationData) null);
        } else if (this.f85136c != null) {
            apyk apyk3 = new apyk(context2);
            String str7 = this.f85137d;
            String str8 = ",";
            String str9 = "snet_attestation_request_times_ms_";
            if (TextUtils.isEmpty(str7)) {
                arrayDeque = new ArrayDeque();
            } else {
                if (cgkt.m145945q()) {
                    SharedPreferences sharedPreferences = apyk3.f85144b;
                    String valueOf = String.valueOf(str7);
                    str6 = sharedPreferences.getString(valueOf.length() == 0 ? new String(str9) : str9.concat(valueOf), "");
                } else {
                    SharedPreferences sharedPreferences2 = apyk3.f85143a;
                    String valueOf2 = String.valueOf(str7);
                    str6 = sharedPreferences2.getString(valueOf2.length() == 0 ? new String(str9) : str9.concat(valueOf2), "");
                }
                Iterable<String> a2 = bmyx.m108643a(str8).mo66918a((CharSequence) str6);
                arrayDeque = new ArrayDeque();
                for (String str10 : a2) {
                    try {
                        arrayDeque.add(Long.valueOf(Long.valueOf(str10, 10).longValue()));
                    } catch (NumberFormatException e) {
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            while (!arrayDeque.isEmpty()) {
                Long l = (Long) arrayDeque.peek();
                if (l.longValue() < currentTimeMillis && l.longValue() + 120000 >= currentTimeMillis) {
                    break;
                }
                arrayDeque.remove();
            }
            if (arrayDeque.size() >= 10) {
                apyg = new apyg();
                apyg.f85132b = Status.f30111e;
                apyg.f85133c = null;
            } else {
                Status status3 = Status.f30107a;
                bxvd da = apya.f85097k.mo74144da();
                ByteString a3 = ByteString.m123261a(this.f85136c);
                boolean z = false;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                apya apya2 = (apya) da.f164949b;
                a3.getClass();
                apya2.f85099a |= 1;
                apya2.f85100b = a3;
                apyk apyk4 = apyk3;
                long currentTimeMillis2 = System.currentTimeMillis();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                apya apya3 = (apya) da.f164949b;
                int i2 = apya3.f85099a | 32;
                apya3.f85099a = i2;
                apya3.f85107i = currentTimeMillis2;
                String str11 = this.f85137d;
                if (str11 != null) {
                    str11.getClass();
                    apya3.f85099a = i2 | 2;
                    apya3.f85101c = str11;
                }
                apuf a4 = new apug(context2).mo47623a(this.f85137d);
                if (a4 != null) {
                    byte[] bArr = a4.f84912a;
                    if (bArr != null) {
                        ByteString a5 = ByteString.m123261a(bArr);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apya apya4 = (apya) da.f164949b;
                        a5.getClass();
                        apya4.f85099a |= 4;
                        apya4.f85103e = a5;
                    }
                    byte[][] bArr2 = a4.f84913b;
                    if (bArr2 != null) {
                        int length = bArr2.length;
                        int i3 = 0;
                        while (i3 < length) {
                            ByteString a6 = ByteString.m123261a(a4.f84913b[i3]);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = z;
                            }
                            apya apya5 = (apya) da.f164949b;
                            a6.getClass();
                            if (!apya5.f85102d.mo73666a()) {
                                apya5.f85102d = GeneratedMessageLite.m124021a(apya5.f85102d);
                            }
                            apya5.f85102d.add(a6);
                            i3++;
                            z = false;
                        }
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    apya apya6 = (apya) da.f164949b;
                    apya6.f85099a |= 8;
                    apya6.f85104f = 201515033;
                    boolean a7 = sre.m36080a(context);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    apya apya7 = (apya) da.f164949b;
                    apya7.f85099a |= 64;
                    apya7.f85108j = a7;
                    ArrayList arrayList = new ArrayList();
                    List a8 = apzb.m71213a();
                    int size2 = a8.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        arrayDeque2 = arrayDeque;
                        str = str8;
                        str2 = str9;
                        j = currentTimeMillis;
                        Status status4 = status3;
                        apyk apyk5 = apyk4;
                        apyz apyz = (apyz) a8.get(i4);
                        if (apyz.f85206b) {
                            arrayList.add(apyz);
                        }
                        i4++;
                        status3 = status4;
                        apyk4 = apyk5;
                        str9 = str2;
                        str8 = str;
                        arrayDeque = arrayDeque2;
                        currentTimeMillis = j;
                    }
                    aqdo a9 = aqdp.m71407a();
                    bxvd da2 = apye.f85121d.mo74144da();
                    boolean z2 = a9.f85779a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    apye apye = (apye) da2.f164949b;
                    int i5 = apye.f85123a | 1;
                    apye.f85123a = i5;
                    apye.f85124b = z2;
                    boolean z3 = a9.f85780b;
                    apye.f85123a = i5 | 2;
                    apye.f85125c = z3;
                    apye apye2 = (apye) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    apya apya8 = (apya) da.f164949b;
                    apye2.getClass();
                    apya8.f85106h = apye2;
                    apya8.f85099a |= 16;
                    apza apza = new apza();
                    boolean z4 = a9.f85780b;
                    ArrayList arrayList2 = new ArrayList();
                    if (apza.f85214g) {
                        try {
                            String[] strArr = apza.f85208a;
                            status = status3;
                            try {
                                int length2 = strArr.length;
                                apyk = apyk4;
                                int i6 = 0;
                                while (i6 < length2) {
                                    try {
                                        int i7 = length2;
                                        File file = new File(strArr[i6]);
                                        String[] strArr2 = strArr;
                                        ArrayList arrayList3 = new ArrayList();
                                        if (!file.exists() || !file.isDirectory()) {
                                            arrayDeque2 = arrayDeque;
                                            str = str8;
                                            str2 = str9;
                                            j = currentTimeMillis;
                                        } else {
                                            File[] listFiles = file.listFiles();
                                            if (listFiles != null) {
                                                str2 = str9;
                                                try {
                                                    int length3 = listFiles.length;
                                                    str = str8;
                                                    int i8 = 0;
                                                    while (i8 < length3) {
                                                        try {
                                                            File file2 = listFiles[i8];
                                                            int i9 = length3;
                                                            try {
                                                                fileArr = listFiles;
                                                                try {
                                                                    arrayDeque2 = arrayDeque;
                                                                    j = currentTimeMillis;
                                                                    try {
                                                                        Object invoke = apza.f85210c.invoke(apza.f85209b, file2.getAbsolutePath());
                                                                        if (invoke != null) {
                                                                            int i10 = apza.f85212e.getInt(invoke);
                                                                            if ((apza.f85211d.getInt(invoke) & apza.f85213f) != 0 && i10 == 0) {
                                                                                try {
                                                                                    arrayList3.add(file2.getAbsolutePath());
                                                                                } catch (Exception e2) {
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (IllegalAccessException e3) {
                                                                    } catch (IllegalArgumentException e4) {
                                                                    } catch (InvocationTargetException e5) {
                                                                        if (apza.f85215h <= 35) {
                                                                        }
                                                                        apza.f85215h++;
                                                                    }
                                                                } catch (IllegalAccessException e6) {
                                                                    arrayDeque2 = arrayDeque;
                                                                    j = currentTimeMillis;
                                                                    i8++;
                                                                    length3 = i9;
                                                                    listFiles = fileArr;
                                                                    arrayDeque = arrayDeque2;
                                                                    currentTimeMillis = j;
                                                                } catch (IllegalArgumentException e7) {
                                                                    arrayDeque2 = arrayDeque;
                                                                    j = currentTimeMillis;
                                                                    i8++;
                                                                    length3 = i9;
                                                                    listFiles = fileArr;
                                                                    arrayDeque = arrayDeque2;
                                                                    currentTimeMillis = j;
                                                                } catch (InvocationTargetException e8) {
                                                                    arrayDeque2 = arrayDeque;
                                                                    j = currentTimeMillis;
                                                                    if (apza.f85215h <= 35) {
                                                                    }
                                                                    apza.f85215h++;
                                                                    i8++;
                                                                    length3 = i9;
                                                                    listFiles = fileArr;
                                                                    arrayDeque = arrayDeque2;
                                                                    currentTimeMillis = j;
                                                                }
                                                            } catch (IllegalAccessException e9) {
                                                                arrayDeque2 = arrayDeque;
                                                                j = currentTimeMillis;
                                                                fileArr = listFiles;
                                                                i8++;
                                                                length3 = i9;
                                                                listFiles = fileArr;
                                                                arrayDeque = arrayDeque2;
                                                                currentTimeMillis = j;
                                                            } catch (IllegalArgumentException e10) {
                                                                arrayDeque2 = arrayDeque;
                                                                j = currentTimeMillis;
                                                                fileArr = listFiles;
                                                                i8++;
                                                                length3 = i9;
                                                                listFiles = fileArr;
                                                                arrayDeque = arrayDeque2;
                                                                currentTimeMillis = j;
                                                            } catch (InvocationTargetException e11) {
                                                                arrayDeque2 = arrayDeque;
                                                                j = currentTimeMillis;
                                                                fileArr = listFiles;
                                                                if (apza.f85215h <= 35) {
                                                                    try {
                                                                        Thread.sleep(35);
                                                                    } catch (InterruptedException e12) {
                                                                    }
                                                                }
                                                                apza.f85215h++;
                                                                i8++;
                                                                length3 = i9;
                                                                listFiles = fileArr;
                                                                arrayDeque = arrayDeque2;
                                                                currentTimeMillis = j;
                                                            }
                                                            i8++;
                                                            length3 = i9;
                                                            listFiles = fileArr;
                                                            arrayDeque = arrayDeque2;
                                                            currentTimeMillis = j;
                                                        } catch (Exception e13) {
                                                            arrayDeque5 = arrayDeque;
                                                            j = currentTimeMillis;
                                                            size = arrayList2.size();
                                                            while (i < size) {
                                                            }
                                                            if (!arrayList.isEmpty()) {
                                                            }
                                                            apya = (apya) da.mo74062i();
                                                            bxvd da3 = apyb.f85109d.mo74144da();
                                                            if (apya != null) {
                                                            }
                                                            apyg apyg2 = new apyg();
                                                            apyg2.f85131a = 0;
                                                            apyb = (apyb) da3.f164949b;
                                                            if ((apyb.f85111a & 1) != 0) {
                                                            }
                                                            status2 = Status.f30109c;
                                                            attestationData = null;
                                                            apyg2.f85132b = status2;
                                                            apyg2.f85133c = attestationData;
                                                            if (!cgkt.m145945q()) {
                                                            }
                                                            arrayDeque3 = arrayDeque2;
                                                            arrayDeque3.add(Long.valueOf(j));
                                                            String str12 = this.f85137d;
                                                            StringBuilder sb = new StringBuilder();
                                                            while (r2.hasNext()) {
                                                            }
                                                            sb.deleteCharAt(sb.length() - 1);
                                                            if (!cgkt.m145945q()) {
                                                            }
                                                            apyg = apyg2;
                                                            this.f85135b.mo47168a(apyg.f85132b, apyg.f85133c);
                                                        }
                                                    }
                                                    arrayDeque2 = arrayDeque;
                                                } catch (Exception e14) {
                                                    arrayDeque5 = arrayDeque;
                                                    str = str8;
                                                    j = currentTimeMillis;
                                                    size = arrayList2.size();
                                                    while (i < size) {
                                                    }
                                                    if (!arrayList.isEmpty()) {
                                                    }
                                                    apya = (apya) da.mo74062i();
                                                    bxvd da32 = apyb.f85109d.mo74144da();
                                                    if (apya != null) {
                                                    }
                                                    apyg apyg22 = new apyg();
                                                    apyg22.f85131a = 0;
                                                    apyb = (apyb) da32.f164949b;
                                                    if ((apyb.f85111a & 1) != 0) {
                                                    }
                                                    status2 = Status.f30109c;
                                                    attestationData = null;
                                                    apyg22.f85132b = status2;
                                                    apyg22.f85133c = attestationData;
                                                    if (!cgkt.m145945q()) {
                                                    }
                                                    arrayDeque3 = arrayDeque2;
                                                    arrayDeque3.add(Long.valueOf(j));
                                                    String str122 = this.f85137d;
                                                    StringBuilder sb2 = new StringBuilder();
                                                    while (r2.hasNext()) {
                                                    }
                                                    sb2.deleteCharAt(sb2.length() - 1);
                                                    if (!cgkt.m145945q()) {
                                                    }
                                                    apyg = apyg22;
                                                    this.f85135b.mo47168a(apyg.f85132b, apyg.f85133c);
                                                }
                                            } else {
                                                arrayDeque2 = arrayDeque;
                                                str = str8;
                                                str2 = str9;
                                            }
                                            j = currentTimeMillis;
                                        }
                                        arrayList2.addAll(arrayList3);
                                        i6++;
                                        length2 = i7;
                                        strArr = strArr2;
                                        str9 = str2;
                                        str8 = str;
                                        arrayDeque = arrayDeque2;
                                        currentTimeMillis = j;
                                    } catch (Exception e15) {
                                        arrayDeque5 = arrayDeque;
                                        str = str8;
                                        str2 = str9;
                                        j = currentTimeMillis;
                                        size = arrayList2.size();
                                        while (i < size) {
                                        }
                                        if (!arrayList.isEmpty()) {
                                        }
                                        apya = (apya) da.mo74062i();
                                        bxvd da322 = apyb.f85109d.mo74144da();
                                        if (apya != null) {
                                        }
                                        apyg apyg222 = new apyg();
                                        apyg222.f85131a = 0;
                                        apyb = (apyb) da322.f164949b;
                                        if ((apyb.f85111a & 1) != 0) {
                                        }
                                        status2 = Status.f30109c;
                                        attestationData = null;
                                        apyg222.f85132b = status2;
                                        apyg222.f85133c = attestationData;
                                        if (!cgkt.m145945q()) {
                                        }
                                        arrayDeque3 = arrayDeque2;
                                        arrayDeque3.add(Long.valueOf(j));
                                        String str1222 = this.f85137d;
                                        StringBuilder sb22 = new StringBuilder();
                                        while (r2.hasNext()) {
                                        }
                                        sb22.deleteCharAt(sb22.length() - 1);
                                        if (!cgkt.m145945q()) {
                                        }
                                        apyg = apyg222;
                                        this.f85135b.mo47168a(apyg.f85132b, apyg.f85133c);
                                    }
                                }
                                arrayDeque2 = arrayDeque;
                                str = str8;
                                str2 = str9;
                                j = currentTimeMillis;
                                if (z4) {
                                    if (arrayList2.isEmpty()) {
                                        Process exec = Runtime.getRuntime().exec(String.format("logcat -t %d", Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR)));
                                        if (exec != null) {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                                            while (true) {
                                                String readLine = bufferedReader.readLine();
                                                if (readLine == null) {
                                                    break;
                                                }
                                                Matcher matcher = apza.f85216i.matcher(readLine);
                                                if (matcher.matches()) {
                                                    str5 = matcher.group(1);
                                                    String[] strArr3 = apza.f85208a;
                                                    int length4 = strArr3.length;
                                                    int i11 = 0;
                                                    while (true) {
                                                        if (i11 < length4) {
                                                            if (str5.startsWith(strArr3[i11])) {
                                                                break;
                                                            }
                                                            i11++;
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                    if (str5 == null) {
                                                        arrayList2.add(str5);
                                                    }
                                                }
                                                str5 = null;
                                                if (str5 == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e16) {
                                arrayDeque4 = arrayDeque;
                                str3 = str8;
                                str4 = str9;
                                j2 = currentTimeMillis;
                                apyk = apyk4;
                                size = arrayList2.size();
                                while (i < size) {
                                }
                                if (!arrayList.isEmpty()) {
                                }
                                apya = (apya) da.mo74062i();
                                bxvd da3222 = apyb.f85109d.mo74144da();
                                if (apya != null) {
                                }
                                apyg apyg2222 = new apyg();
                                apyg2222.f85131a = 0;
                                apyb = (apyb) da3222.f164949b;
                                if ((apyb.f85111a & 1) != 0) {
                                }
                                status2 = Status.f30109c;
                                attestationData = null;
                                apyg2222.f85132b = status2;
                                apyg2222.f85133c = attestationData;
                                if (!cgkt.m145945q()) {
                                }
                                arrayDeque3 = arrayDeque2;
                                arrayDeque3.add(Long.valueOf(j));
                                String str12222 = this.f85137d;
                                StringBuilder sb222 = new StringBuilder();
                                while (r2.hasNext()) {
                                }
                                sb222.deleteCharAt(sb222.length() - 1);
                                if (!cgkt.m145945q()) {
                                }
                                apyg = apyg2222;
                                this.f85135b.mo47168a(apyg.f85132b, apyg.f85133c);
                            }
                        } catch (Exception e17) {
                            arrayDeque4 = arrayDeque;
                            str3 = str8;
                            str4 = str9;
                            j2 = currentTimeMillis;
                            status = status3;
                            apyk = apyk4;
                            size = arrayList2.size();
                            while (i < size) {
                            }
                            if (!arrayList.isEmpty()) {
                            }
                            apya = (apya) da.mo74062i();
                            bxvd da32222 = apyb.f85109d.mo74144da();
                            if (apya != null) {
                            }
                            apyg apyg22222 = new apyg();
                            apyg22222.f85131a = 0;
                            apyb = (apyb) da32222.f164949b;
                            if ((apyb.f85111a & 1) != 0) {
                            }
                            status2 = Status.f30109c;
                            attestationData = null;
                            apyg22222.f85132b = status2;
                            apyg22222.f85133c = attestationData;
                            if (!cgkt.m145945q()) {
                            }
                            arrayDeque3 = arrayDeque2;
                            arrayDeque3.add(Long.valueOf(j));
                            String str122222 = this.f85137d;
                            StringBuilder sb2222 = new StringBuilder();
                            while (r2.hasNext()) {
                            }
                            sb2222.deleteCharAt(sb2222.length() - 1);
                            if (!cgkt.m145945q()) {
                            }
                            apyg = apyg22222;
                            this.f85135b.mo47168a(apyg.f85132b, apyg.f85133c);
                        }
                    } else {
                        arrayDeque2 = arrayDeque;
                        str = str8;
                        str2 = str9;
                        j = currentTimeMillis;
                        status = status3;
                        apyk = apyk4;
                    }
                    size = arrayList2.size();
                    for (i = 0; i < size; i++) {
                        apyz apyz2 = new apyz();
                        apyz2.f85205a = (String) arrayList2.get(i);
                        arrayList.add(apyz2);
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList.size();
                        int size3 = arrayList.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            apyz apyz3 = (apyz) arrayList.get(i12);
                            bxvd da4 = apyf.f85126d.mo74144da();
                            String str13 = apyz3.f85205a;
                            if (str13 != null) {
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                apyf apyf = (apyf) da4.f164949b;
                                str13.getClass();
                                apyf.f85128a |= 1;
                                apyf.f85129b = str13;
                            }
                            byte[] bArr3 = apyz3.f85207c;
                            if (bArr3 != null) {
                                ByteString a10 = ByteString.m123261a(bArr3);
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                apyf apyf2 = (apyf) da4.f164949b;
                                a10.getClass();
                                apyf2.f85128a |= 2;
                                apyf2.f85130c = a10;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            apya apya9 = (apya) da.f164949b;
                            apyf apyf3 = (apyf) da4.mo74062i();
                            apyf3.getClass();
                            if (!apya9.f85105g.mo73666a()) {
                                apya9.f85105g = GeneratedMessageLite.m124021a(apya9.f85105g);
                            }
                            apya9.f85105g.add(apyf3);
                        }
                    }
                    apya = (apya) da.mo74062i();
                } else {
                    arrayDeque2 = arrayDeque;
                    str = str8;
                    str2 = str9;
                    j = currentTimeMillis;
                    status = status3;
                    apyk = apyk4;
                    apya = null;
                }
                bxvd da322222 = apyb.f85109d.mo74144da();
                if (apya != null) {
                    ByteString aL = apya.mo73639aL();
                    if (da322222.f164950c) {
                        da322222.mo74035c();
                        da322222.f164950c = false;
                    }
                    apyb apyb2 = (apyb) da322222.f164949b;
                    aL.getClass();
                    apyb2.f85111a |= 1;
                    apyb2.f85112b = aL;
                }
                apyg apyg222222 = new apyg();
                apyg222222.f85131a = 0;
                apyb = (apyb) da322222.f164949b;
                if ((apyb.f85111a & 1) != 0 || (a = apuh.m71024a(apyb.f85112b.getKey())) == null) {
                    status2 = Status.f30109c;
                    attestationData = null;
                } else {
                    String a11 = vvp.m41461a(context2, "attest", a);
                    if (da322222.f164950c) {
                        da322222.mo74035c();
                        da322222.f164950c = false;
                    }
                    apyb apyb3 = (apyb) da322222.f164949b;
                    a11.getClass();
                    apyb3.f85111a |= 2;
                    apyb3.f85113c = a11;
                    if (!TextUtils.isEmpty(apyb3.f85113c)) {
                        apyb apyb4 = (apyb) da322222.mo74062i();
                        shr.m35316b(6146);
                        try {
                            String valueOf3 = String.valueOf(!TextUtils.isEmpty(this.f85138e) ? this.f85138e : "AIzaSyDqVnJBjE5ymo--oBJt3On7HQx9xNm1RHA");
                            String str14 = valueOf3.length() == 0 ? new String("https://www.googleapis.com/androidcheck/v1/attestations/attest?alt=PROTO&key=") : "https://www.googleapis.com/androidcheck/v1/attestations/attest?alt=PROTO&key=".concat(valueOf3);
                            String str15 = f85134a;
                            String str16 = Build.DEVICE;
                            String str17 = Build.ID;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str15).length() + 10 + String.valueOf(str16).length() + String.valueOf(str17).length());
                            sb3.append(str15);
                            sb3.append(" (");
                            sb3.append(str16);
                            sb3.append(" ");
                            sb3.append(str17);
                            sb3.append("); gzip");
                            String sb4 = sb3.toString();
                            URL url = new URL(str14);
                            if (!cgkt.m145934f()) {
                                httpURLConnection = (HttpURLConnection) stp.m36306a(url, 6146);
                            } else {
                                shr.m35316b(6148);
                                httpURLConnection = (HttpURLConnection) new PlayServicesCronetProvider(context2).createBuilder().build().openConnection(url);
                            }
                            try {
                                if (cgkt.f187180a.mo6606a().mo84024a()) {
                                    String h = spn.m35895h(context2, this.f85137d);
                                    httpURLConnection.setRequestProperty("X-Android-Package", this.f85137d);
                                    httpURLConnection.setRequestProperty("X-Android-Cert", h);
                                }
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
                                httpURLConnection.setRequestProperty("User-Agent", sb4);
                                httpURLConnection.setConnectTimeout(30000);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setDoInput(true);
                                httpURLConnection.setDoOutput(true);
                                int i13 = apyb4.f164961ai;
                                if (i13 == -1) {
                                    i13 = bxxm.f165037a.mo74228a(apyb4).mo74223b(apyb4);
                                    apyb4.f164961ai = i13;
                                }
                                httpURLConnection.setRequestProperty("Content-Length", Integer.toString(i13));
                                httpURLConnection.setUseCaches(false);
                                try {
                                    dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                                    try {
                                        apyb4.mo73638a(dataOutputStream);
                                        dataOutputStream.close();
                                        if (httpURLConnection.getResponseCode() == 200) {
                                            inputStream = httpURLConnection.getInputStream();
                                            try {
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                byte[] bArr4 = new byte[4096];
                                                while (true) {
                                                    int read = inputStream.read(bArr4);
                                                    if (read < 0) {
                                                        break;
                                                    } else if (read > 0) {
                                                        byteArrayOutputStream.write(bArr4, 0, read);
                                                    }
                                                }
                                                apyc = (apyc) GeneratedMessageLite.m124016a(apyc.f85114c, byteArrayOutputStream.toByteArray(), bxus.m123744c());
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (IOException e18) {
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    stp.m36307a(httpURLConnection);
                                                }
                                                shr.m35312a();
                                            } catch (IOException e19) {
                                            } catch (Throwable th2) {
                                                httpURLConnection2 = httpURLConnection;
                                                inputStream2 = inputStream;
                                                th = th2;
                                                if (inputStream2 != null) {
                                                }
                                                if (httpURLConnection2 != null) {
                                                }
                                                shr.m35312a();
                                                throw th;
                                            }
                                            if (apyc != null && (apyc.f85116a & 1) == 0 && !TextUtils.isEmpty(apyc.f85117b)) {
                                                attestationData = new AttestationData(apyc.f85117b);
                                                status2 = status;
                                            } else {
                                                apyg222222.f85131a = 1;
                                                status2 = new Status(7);
                                                attestationData = null;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (dataOutputStream != null) {
                                            dataOutputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    dataOutputStream = null;
                                    if (dataOutputStream != null) {
                                    }
                                    throw th;
                                }
                            } catch (IOException e20) {
                                inputStream = null;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e21) {
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                httpURLConnection2 = httpURLConnection;
                                inputStream2 = null;
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e22) {
                                    }
                                }
                                if (httpURLConnection2 != null) {
                                    stp.m36307a(httpURLConnection2);
                                }
                                shr.m35312a();
                                throw th;
                            }
                        } catch (IOException e23) {
                            inputStream = null;
                            httpURLConnection = null;
                            if (inputStream != null) {
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            inputStream2 = null;
                            httpURLConnection2 = null;
                            if (inputStream2 != null) {
                            }
                            if (httpURLConnection2 != null) {
                            }
                            shr.m35312a();
                            throw th;
                        }
                    } else {
                        status2 = Status.f30109c;
                        attestationData = null;
                    }
                }
                apyg222222.f85132b = status2;
                apyg222222.f85133c = attestationData;
                if (!cgkt.m145945q()) {
                    apyk2 = apyk;
                } else if (apyg222222.f85132b.mo17710c()) {
                    String str18 = this.f85137d;
                    String str19 = apyg222222.f85133c.f107314a;
                    if (TextUtils.isEmpty(str19)) {
                        apyk2 = apyk;
                    } else {
                        String valueOf4 = String.valueOf(str18);
                        apyk2 = apyk;
                        apyk2.mo47702a(valueOf4.length() == 0 ? new String("snet_saved_attestation_response_") : "snet_saved_attestation_response_".concat(valueOf4), str19);
                    }
                } else {
                    apyk2 = apyk;
                }
                if (apyg222222.f85132b.mo17710c() || apyg222222.f85131a == 1) {
                    arrayDeque3 = arrayDeque2;
                    arrayDeque3.add(Long.valueOf(j));
                    String str1222222 = this.f85137d;
                    if (!arrayDeque3.isEmpty() && !TextUtils.isEmpty(str1222222)) {
                        StringBuilder sb22222 = new StringBuilder();
                        for (Long l2 : arrayDeque3) {
                            sb22222.append(l2);
                            sb22222.append(str);
                        }
                        sb22222.deleteCharAt(sb22222.length() - 1);
                        if (!cgkt.m145945q()) {
                            String valueOf5 = String.valueOf(str1222222);
                            String str20 = valueOf5.length() == 0 ? new String(str2) : str2.concat(valueOf5);
                            String sb5 = sb22222.toString();
                            SharedPreferences.Editor edit = apyk2.f85144b.edit();
                            edit.putString(str20, sb5);
                            edit.commit();
                        } else {
                            String str21 = str2;
                            String valueOf6 = String.valueOf(str1222222);
                            apyk2.mo47702a(valueOf6.length() == 0 ? new String(str21) : str21.concat(valueOf6), sb22222.toString());
                        }
                    }
                }
                apyg = apyg222222;
            }
            this.f85135b.mo47168a(apyg.f85132b, apyg.f85133c);
        } else {
            this.f85135b.mo47168a(new Status(10), (AttestationData) null);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f85135b.mo47168a(status, (AttestationData) null);
    }
}
