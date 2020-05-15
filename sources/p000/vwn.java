package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: vwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwn {

    /* renamed from: a */
    private final String f50144a;

    /* renamed from: b */
    private final Context f50145b;

    /* renamed from: c */
    private final Throwable f50146c;

    public vwn(String str, Context context, Throwable th) {
        this.f50144a = str;
        this.f50145b = context;
        this.f50146c = th;
    }

    /* renamed from: a */
    public static byte[] m41495a(String str, Context context, Map map, Throwable th) {
        if (vwh.m41492a(str, cdrq.f181609a.mo6606a().mo78218a())) {
            String valueOf = String.valueOf(str);
            return (valueOf.length() == 0 ? new String("ERROR : no fallback for ") : "ERROR : no fallback for ".concat(valueOf)).getBytes();
        }
        try {
            return new vwn(str, context, th).mo28913a(map, null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 8);
            sb.append("ERROR : ");
            sb.append(valueOf2);
            return sb.toString().getBytes();
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        r0 = p000.vwq.m41498a(r2, (byte[]) r0.getMethod(r5.f50161g.mo28917a(p000.vwq.f50155c), byte[].class).invoke(r0.getMethod(r5.f50161g.mo28917a(p000.vwq.f50156d), java.lang.String.class).invoke(null, r5.f50161g.mo28917a(p000.vwq.f50154b)), r2));
        r2 = new p000.vwx(p000.vwq.f50157e, p000.vwq.f50158f);
        r5 = r7.length * 8;
        r2.f50167a[1] = p000.vwx.m41507a(r7, 0);
        r2.f50167a[2] = p000.vwx.m41507a(r7, 4);
        r2.f50167a[3] = p000.vwx.m41507a(r7, r3);
        r9 = 12;
        r2.f50167a[4] = p000.vwx.m41507a(r7, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x060c, code lost:
        if (r5 != 256) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x060e, code lost:
        r5 = r2.f50168b;
        r8 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0615, code lost:
        if (r5 != 128) goto L_0x09f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0617, code lost:
        r5 = r2.f50169c;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x061a, code lost:
        r2.f50167a[11] = p000.vwx.m41507a(r7, r8);
        r2.f50167a[12] = p000.vwx.m41507a(r7, r8 + 4);
        r2.f50167a[13] = p000.vwx.m41507a(r7, r8 + 8);
        r2.f50167a[14] = p000.vwx.m41507a(r7, r8 + 12);
        r2.f50167a[0] = p000.vwx.m41507a(r5, 0);
        r2.f50167a[5] = p000.vwx.m41507a(r5, 4);
        r2.f50167a[10] = p000.vwx.m41507a(r5, r3);
        r2.f50167a[15] = p000.vwx.m41507a(r5, 12);
        r2.f50167a[6] = p000.vwx.m41507a(r6, 0);
        r2.f50167a[7] = p000.vwx.m41507a(r6, 4);
        r5 = r2.f50167a;
        r5[r3] = 0;
        r5[9] = 0;
        r5 = r0.length;
        r8 = new byte[r5];
        r14 = new byte[64];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0690, code lost:
        if (r5 != 0) goto L_0x0694;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0694, code lost:
        r16 = 0;
        r26 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0698, code lost:
        r15 = r2.f50167a;
        r12 = 16;
        r11 = new int[16];
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x069f, code lost:
        if (r10 >= r12) goto L_0x06aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x06a1, code lost:
        r11[r10] = r15[r10];
        r10 = r10 + 1;
        r12 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x06aa, code lost:
        r10 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x06ac, code lost:
        if (r10 <= 0) goto L_0x0933;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x06ae, code lost:
        r12 = r11[4] ^ p000.vwx.m41506a(r11[0] + r11[r9], 7);
        r11[4] = r12;
        r9 = r11[r3] ^ p000.vwx.m41506a(r12 + r11[0], 9);
        r11[r3] = r9;
        r9 = p000.vwx.m41506a(r9 + r11[4], 13) ^ r11[12];
        r11[12] = r9;
        r11[0] = p000.vwx.m41506a(r9 + r11[r3], 18) ^ r11[0];
        r9 = r11[9] ^ p000.vwx.m41506a(r11[5] + r11[1], 7);
        r11[9] = r9;
        r9 = p000.vwx.m41506a(r9 + r11[5], 9) ^ r11[13];
        r11[13] = r9;
        r9 = p000.vwx.m41506a(r9 + r11[9], 13) ^ r11[1];
        r11[1] = r9;
        r11[5] = p000.vwx.m41506a(r9 + r11[13], 18) ^ r11[5];
        r9 = r11[14] ^ p000.vwx.m41506a(r11[10] + r11[6], 7);
        r11[14] = r9;
        r9 = p000.vwx.m41506a(r9 + r11[10], 9) ^ r11[2];
        r11[2] = r9;
        r9 = p000.vwx.m41506a(r9 + r11[14], 13) ^ r11[6];
        r11[6] = r9;
        r11[10] = p000.vwx.m41506a(r9 + r11[2], 18) ^ r11[10];
        r12 = r11[3] ^ p000.vwx.m41506a(r11[15] + r11[11], 7);
        r11[3] = r12;
        r9 = r11[7] ^ p000.vwx.m41506a(r12 + r11[15], 9);
        r11[7] = r9;
        r9 = p000.vwx.m41506a(r9 + r11[3], 13) ^ r11[11];
        r11[11] = r9;
        r11[15] = p000.vwx.m41506a(r9 + r11[7], 18) ^ r11[15];
        r9 = r11[1] ^ p000.vwx.m41506a(r11[0] + r11[3], 7);
        r11[1] = r9;
        r9 = p000.vwx.m41506a(r9 + r11[0], 9) ^ r11[2];
        r11[2] = r9;
        r9 = p000.vwx.m41506a(r9 + r11[1], 13) ^ r11[3];
        r11[3] = r9;
        r11[0] = p000.vwx.m41506a(r9 + r11[2], 18) ^ r11[0];
        r12 = r11[6] ^ p000.vwx.m41506a(r11[5] + r11[4], 7);
        r11[6] = r12;
        r9 = r11[7] ^ p000.vwx.m41506a(r12 + r11[5], 9);
        r11[7] = r9;
        r9 = p000.vwx.m41506a(r9 + r11[6], 13) ^ r11[4];
        r11[4] = r9;
        r11[5] = r11[5] ^ p000.vwx.m41506a(r9 + r11[7], 18);
        r9 = r11[11] ^ p000.vwx.m41506a(r11[10] + r11[9], 7);
        r11[11] = r9;
        r9 = p000.vwx.m41506a(r9 + r11[10], 9) ^ r11[r3];
        r11[r3] = r9;
        r9 = p000.vwx.m41506a(r9 + r11[11], 13) ^ r11[9];
        r11[9] = r9;
        r11[10] = p000.vwx.m41506a(r9 + r11[r3], 18) ^ r11[10];
        r9 = p000.vwx.m41506a(r11[15] + r11[14], 7) ^ r11[12];
        r11[12] = r9;
        r9 = r11[13] ^ p000.vwx.m41506a(r9 + r11[15], 9);
        r11[13] = r9;
        r9 = r11[14] ^ p000.vwx.m41506a(r9 + r11[12], 13);
        r11[14] = r9;
        r11[15] = r11[15] ^ p000.vwx.m41506a(r9 + r11[13], 18);
        r10 = r10 - 2;
        r9 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0933, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x093c, code lost:
        if (r9 >= 16) goto L_0x0949;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x093e, code lost:
        r11[r9] = r11[r9] + r15[r9];
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0949, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x094c, code lost:
        if (r9 < 16) goto L_0x09c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x094e, code lost:
        r9 = r2.f50167a;
        r9[r3] = p000.vwx.m41505a(r9[r3]);
        r9 = r2.f50167a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x095c, code lost:
        if (r9[r3] != 0) goto L_0x0969;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x095e, code lost:
        r9[9] = p000.vwx.m41505a(r9[9]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x096d, code lost:
        if (r5 <= 64) goto L_0x0997;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x096f, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0970, code lost:
        if (r9 < 64) goto L_0x0983;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0972, code lost:
        r5 = r5 - 64;
        r26 = r26 + 64;
        r16 = r16 + 64;
        r9 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0983, code lost:
        r8[r9 + r26] = (byte) ((r0[r9 + r16] ^ r14[r9]) & 255);
        r9 = r9 + 1;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0997, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0998, code lost:
        if (r2 >= r5) goto L_0x09ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x099a, code lost:
        r8[r2 + r26] = (byte) ((r0[r2 + r16] ^ r14[r2]) & 255);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x09c1, code lost:
        r24 = r9 * 4;
        r3 = r11[r9];
        r14[r24] = (byte) r3;
        r14[r24 + 1] = (byte) (r3 >>> 8);
        r14[r24 + 2] = (byte) (r3 >>> 16);
        r14[r24 + 3] = (byte) (r3 >> 24);
        r9 = r9 + 1;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x09f0, code lost:
        r2 = new java.lang.StringBuilder(18);
        r2.append("kbits: ");
        r2.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0a08, code lost:
        throw new java.lang.IllegalArgumentException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
        return p000.vwq.m41498a(r6, r7, r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x049b A[Catch:{ UnsupportedEncodingException -> 0x04af }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x049d A[Catch:{ UnsupportedEncodingException -> 0x04af }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04b6 A[Catch:{ UnsupportedEncodingException -> 0x04ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04b8 A[Catch:{ UnsupportedEncodingException -> 0x04ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0509 A[SYNTHETIC, Splitter:B:175:0x0509] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0a3c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x01df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01cc A[SYNTHETIC, Splitter:B:39:0x01cc] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d6 A[SYNTHETIC, Splitter:B:46:0x01d6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0211 A[LOOP:1: B:24:0x0161->B:53:0x0211, LOOP_END] */
    /* renamed from: a */
    public final byte[] mo28913a(Map map, byte[] bArr) {
        long j;
        String str;
        String str2;
        String str3;
        long j2;
        String str4;
        String str5;
        String str6;
        vws vws;
        vwl vwl;
        int i;
        boolean z;
        String str7;
        String str8;
        Throwable th;
        String str9;
        Throwable cause;
        String str10;
        Throwable cause2;
        String str11;
        String str12;
        String str13;
        byte[] bArr2;
        int[] iArr;
        String str14;
        String str15;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        Throwable th2;
        Map map2 = map;
        byte[] bArr3 = bArr;
        long currentTimeMillis = System.currentTimeMillis();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < stackTrace.length; i2++) {
            String stackTraceElement = stackTrace[i2].toString();
            if (stackTraceElement.contains("em.V") || ((stackTraceElement.startsWith("j") && stackTraceElement.contains("d.g")) || (stackTraceElement.startsWith("a") && stackTraceElement.contains("r.e") && stackTraceElement.indexOf(40) == 30))) {
                sb.append(", ");
                sb.append(stackTrace[i2].getClassName());
                sb.append(".");
                sb.append(stackTrace[i2].getMethodName());
            }
        }
        sb.append("$");
        vws vws2 = new vws(sb.toString());
        int[] iArr2 = {73, 196, 170, MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, 180, 182, 197, 170, MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, 37, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, 161, 143, 203, 204, 197, MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, 177, 107, 205, 185, BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, 178, 193, 177, 37, 132, 132, 202, 169, 178, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, 186, 114, 125, 169, ErrorInfo.TYPE_SDU_UNKNOWN, 177, BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, 185, 37, 195, 185, 193, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, 202, ErrorInfo.TYPE_SDU_UNKNOWN, 107, 190, 132, 127, 190, 165, 15, 37, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, 178, 202, 195, 197, 208, 180, 204, 178, 181, 170, 85, 143, 169, 193, 197, 208, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, 195, 194, 120, 191, 194, 139, ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, 208, 203, 170, 197, 185, 4, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, 185, 169, 132, MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, 177, 170, 194, 188, 205, 143, BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, 143};
        String valueOf = String.valueOf(sb.substring(0, Math.min(77, sb.length())));
        String valueOf2 = String.valueOf(vws2.mo28917a(iArr2));
        String str16 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        vws vws3 = new vws(str16);
        vws vws4 = new vws(String.class.getName());
        vwp vwp = new vwp(vws3);
        ArrayList arrayList = new ArrayList();
        vwp.mo28915a(vwp.f50152e.mo28917a(vwp.f50150d), arrayList);
        vwp.mo28915a(vwp.f50152e.mo28917a(vwp.f50147a), arrayList);
        Collections.sort(arrayList);
        arrayList.add(ssl.m36243a(new File(vwp.f50152e.mo28917a(vwp.f50148b)), vwp.f50152e.mo28917a(vwp.f50149c)));
        String a = ssl.m36244a(arrayList.toString().getBytes(), vwp.f50152e.mo28917a(vwp.f50149c));
        if (bArr3 == null) {
            int[] iArr3 = {BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, 196, 195, BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, 204, 226, 186, ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, 80};
            int[] iArr4 = {229, 102};
            int[] iArr5 = {BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, 208, 102, 196, 223, MfiClientException.TYPE_CARD_NOT_CACHED, 226, 196, 102, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, 188, BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, 117, 223, 191, 196, 196, 102, BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, 222, BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, 149, 183, 186, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, 102};
            int[] iArr6 = {102, 223, 191, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, MfiClientException.TYPE_MFICLIENT_NOT_STARTED, 183, 196, 196};
            str2 = "";
            int[] iArr7 = {220, 149, 190, 149, 183, BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, 102, 228, 188, 220, 226, BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, 191, 6, 37, 183};
            str = "UTF-8";
            j = currentTimeMillis;
            int i3 = 3;
            int[][] iArr8 = {new int[]{177, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, 117, 191, 149, 80}, new int[]{BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, 183, 186, 222, 223, BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, 171, BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, 220, 80}, iArr3};
            int i4 = 0;
            int[] iArr9 = iArr5;
            while (true) {
                if (i4 >= i3) {
                    str4 = vws3.mo28917a(iArr7);
                    break;
                }
                int[] iArr10 = iArr8[i4];
                String a2 = vws3.mo28917a(iArr9);
                String a3 = vws3.mo28917a(iArr10);
                iArr = iArr9;
                String a4 = vws3.mo28917a(iArr6);
                int[] iArr11 = iArr6;
                int[][] iArr12 = iArr8;
                StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + String.valueOf(a3).length() + String.valueOf(a4).length());
                sb2.append(a2);
                sb2.append(a3);
                sb2.append(a4);
                try {
                    bufferedReader = new BufferedReader(new FileReader(new File(sb2.toString())));
                    try {
                        str15 = bufferedReader.readLine();
                        bufferedReader.close();
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                        }
                    } catch (IOException e2) {
                        if (bufferedReader != null) {
                        }
                        str15 = null;
                        if (str15 != null) {
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                        }
                        throw th2;
                    }
                } catch (IOException e3) {
                    bufferedReader = null;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            str15 = null;
                        } catch (IOException e4) {
                            str15 = null;
                            if (str15 != null) {
                            }
                        }
                        if (str15 != null) {
                        }
                    }
                    str15 = null;
                    if (str15 != null) {
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    bufferedReader2 = null;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e5) {
                        }
                    }
                    throw th2;
                }
                if (str15 != null) {
                    String a5 = vws3.mo28917a(iArr10);
                    String a6 = vws3.mo28917a(iArr4);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a5).length() + String.valueOf(a6).length() + str15.length());
                    sb3.append(a5);
                    sb3.append(a6);
                    sb3.append(str15);
                    str4 = sb3.toString();
                    break;
                }
                i4++;
                iArr9 = iArr;
                iArr8 = iArr12;
                iArr6 = iArr11;
                i3 = 3;
            }
            j2 = System.currentTimeMillis() / 1000;
            String a7 = new vwi(vws4).f50134b.mo28917a(vwi.f50133a);
            ArrayList arrayList2 = new ArrayList();
            for (String str17 : map.keySet()) {
                if (map2.get(str17) == null) {
                    arrayList2.add(new Pair(str17, "null"));
                } else {
                    String a8 = ssl.m36244a(((String) map2.get(str17)).getBytes(), a7);
                    if (a8 != null && a8.length() > 6) {
                        a8 = a8.substring(0, 6);
                    }
                    arrayList2.add(new Pair(str17, a8));
                    map2 = map;
                }
            }
            str5 = vwt.m41502a(arrayList2);
            vwj vwj = new vwj();
            ArrayList arrayList3 = new ArrayList();
            Field[] fields = vwj.f50135a.getFields();
            int length = fields.length;
            int i5 = 0;
            while (i5 < length) {
                Field field = fields[i5];
                try {
                    field.setAccessible(true);
                    if (Modifier.isStatic(field.getModifiers())) {
                        str14 = str5;
                        try {
                            iArr = str4;
                            try {
                                arrayList3.add(new Pair(field.getName(), String.valueOf(field.get(null))));
                            } catch (IllegalAccessException e6) {
                            }
                        } catch (IllegalAccessException e7) {
                            iArr = str4;
                            i5++;
                            str5 = str14;
                            str4 = iArr;
                        }
                    } else {
                        str14 = str5;
                        iArr = str4;
                        arrayList3.add(new Pair(field.getName(), "?"));
                    }
                } catch (IllegalAccessException e8) {
                    str14 = str5;
                    iArr = str4;
                    i5++;
                    str5 = str14;
                    str4 = iArr;
                }
                i5++;
                str5 = str14;
                str4 = iArr;
            }
            str3 = vwt.m41502a(arrayList3);
            try {
                str6 = String.valueOf(spn.getAndroidId(new vwk(this.f50145b).f50136a));
            } catch (Exception e9) {
                str6 = "-";
            }
        } else {
            str = "UTF-8";
            j = currentTimeMillis;
            str2 = "";
            j2 = 0;
            str6 = str2;
            str5 = str6;
            str4 = str5;
            str3 = str4;
        }
        String a9 = ssl.m36244a(str16.getBytes(), vws4.mo28917a(new int[]{50, 27, 45, 48, 95, 116, 86}));
        vwm vwm = new vwm(vws3, this.f50145b);
        String[] strArr = {String.valueOf(j2), str4, str6, str5};
        if (bArr3 != null) {
            vwl = vwm.mo28912a(a9, bArr3);
            vws = vws4;
        } else {
            MessageDigest b = spn.m35868b(vwm.f50141a.mo28917a(new int[]{127, 4, 204, BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, 197, BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, 226, BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, 19, 202, BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, 115, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, 227, BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, 53, ErrorInfo.TYPE_SDU_UNKNOWN}));
            if (b == null) {
                vws = vws4;
                bArr2 = null;
            } else {
                int i6 = 0;
                while (true) {
                    vws = vws4;
                    if (i6 >= 4) {
                        break;
                    }
                    b.update(strArr[i6].getBytes());
                    i6++;
                    vws4 = vws;
                }
                bArr2 = b.digest();
            }
            vwl = vwm.mo28912a(a9, bArr2);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("5=");
        sb4.append(a);
        sb4.append("\n7=");
        sb4.append(vwl.f50137a);
        sb4.append("\n8=");
        sb4.append(vwl.f50138b);
        sb4.append("\n9=");
        sb4.append(vwl.f50139c);
        if (bArr3 == null) {
            Throwable cause3 = this.f50146c.getCause();
            sb4.append("\n0=");
            sb4.append(this.f50144a);
            sb4.append("\n1=");
            sb4.append(str4);
            sb4.append("\n2=");
            sb4.append(j2);
            sb4.append("\n3=");
            sb4.append(str5);
            sb4.append("\n4=");
            sb4.append(str6);
            sb4.append("\n6=");
            sb4.append(str3);
            sb4.append("\n10=");
            sb4.append(currentTimeMillis2 - j);
            try {
                str7 = str;
                try {
                    String encode = URLEncoder.encode(this.f50146c.toString(), str7);
                    sb4.append("\n11=");
                    sb4.append(encode);
                } catch (UnsupportedEncodingException e10) {
                }
            } catch (UnsupportedEncodingException e11) {
                str7 = str;
            }
            if (cause3 != null) {
                try {
                    str13 = cause3.toString();
                } catch (UnsupportedEncodingException e12) {
                }
            } else {
                str13 = str2;
            }
            String encode2 = URLEncoder.encode(str13, str7);
            sb4.append("\n12=");
            sb4.append(encode2);
            try {
                String encode3 = URLEncoder.encode(Log.getStackTraceString(this.f50146c), str7);
                sb4.append("\n13=");
                sb4.append(encode3);
            } catch (UnsupportedEncodingException e13) {
            }
            if (cause3 != null) {
                try {
                    str12 = Log.getStackTraceString(cause3);
                } catch (UnsupportedEncodingException e14) {
                }
            } else {
                str12 = str2;
            }
            String encode4 = URLEncoder.encode(str12, str7);
            sb4.append("\n14=");
            sb4.append(encode4);
            try {
                vwu vwu = new vwu(vws3);
                str8 = str2;
                try {
                    String join = TextUtils.join(str8, strArr);
                    if (!cdre.m134728b() || !cdre.f181591a.mo6606a().mo78205b()) {
                        throw new vww(4);
                    }
                    int i7 = Build.VERSION.SDK_INT;
                    String a10 = new vwv(vwu.f50164a).mo28918a(join);
                    sb4.append("\n15=");
                    sb4.append(a10);
                    sb4.append("\n19=");
                    th = this.f50146c;
                    while (true) {
                        if (th != null) {
                            if (!(th instanceof vyw)) {
                                if (th instanceof vyt) {
                                    str9 = Base64.encodeToString(((vyt) th).f50250a, 11);
                                    break;
                                }
                                th = th.getCause();
                            } else {
                                str9 = Base64.encodeToString(((vyw) th).f50257a, 11);
                                break;
                            }
                        } else {
                            str9 = str8;
                            break;
                        }
                    }
                    sb4.append(str9);
                    if (cdrk.f181602a.mo6606a().mo78213a()) {
                        try {
                            String encode5 = URLEncoder.encode(vwg.m41490b(this.f50145b), str7);
                            sb4.append("\n20=");
                            sb4.append(encode5);
                        } catch (UnsupportedEncodingException e15) {
                        }
                    }
                } catch (vww e16) {
                    e = e16;
                    vww vww = e;
                    sb4.append("\n16=");
                    sb4.append(vww.f50166a);
                    try {
                        cause2 = vww.getCause();
                        if (cause2 != null) {
                        }
                        String encode6 = URLEncoder.encode(str11, str7);
                        sb4.append("\n17=");
                        sb4.append(encode6);
                    } catch (UnsupportedEncodingException e17) {
                    }
                    try {
                        cause = vww.getCause();
                        if (cause != null) {
                        }
                        String encode7 = URLEncoder.encode(str10, str7);
                        sb4.append("\n18=");
                        sb4.append(encode7);
                    } catch (UnsupportedEncodingException e18) {
                    }
                    sb4.append("\n19=");
                    th = this.f50146c;
                    while (true) {
                        if (th != null) {
                        }
                        th = th.getCause();
                    }
                    sb4.append(str9);
                    if (cdrk.f181602a.mo6606a().mo78213a()) {
                    }
                    sb4.append("\n");
                    byte[] bytes = sb4.toString().getBytes();
                    if (bArr3 != null) {
                    }
                }
            } catch (vww e19) {
                e = e19;
                str8 = str2;
                vww vww2 = e;
                sb4.append("\n16=");
                sb4.append(vww2.f50166a);
                cause2 = vww2.getCause();
                if (cause2 != null) {
                    str11 = str8;
                } else {
                    str11 = cause2.toString();
                }
                String encode62 = URLEncoder.encode(str11, str7);
                sb4.append("\n17=");
                sb4.append(encode62);
                cause = vww2.getCause();
                if (cause != null) {
                    str10 = str8;
                } else {
                    str10 = Log.getStackTraceString(cause);
                }
                String encode72 = URLEncoder.encode(str10, str7);
                sb4.append("\n18=");
                sb4.append(encode72);
                sb4.append("\n19=");
                th = this.f50146c;
                while (true) {
                    if (th != null) {
                    }
                    th = th.getCause();
                }
                sb4.append(str9);
                if (cdrk.f181602a.mo6606a().mo78213a()) {
                }
                sb4.append("\n");
                byte[] bytes2 = sb4.toString().getBytes();
                if (bArr3 != null) {
                }
            }
        }
        sb4.append("\n");
        byte[] bytes22 = sb4.toString().getBytes();
        if (bArr3 != null) {
            return bytes22;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bytes22);
            gZIPOutputStream.close();
            bytes22 = byteArrayOutputStream.toByteArray();
        } catch (IOException e20) {
        }
        vws vws5 = vws;
        byte[] bytes3 = vws5.mo28917a(new int[]{29, 113, 97, 88, 9, 117, 9, 85, 91, 9, 74, 14, 93, 74, 114, ErrorInfo.TYPE_SDU_FAILED, 107, 90, 90, 73, 57, 36, 77, 62, 98, 76, 36, 115, 110, 57, 92, 74, 102, 57, 114, 76, ErrorInfo.TYPE_SDU_FAILED, 69, 107, 62, 30, 109, 72, 76, 92, 90, 53, 110, 74, 7, 15, 72, 75, 108, 57, 30}).getBytes();
        try {
            vwq vwq = new vwq(vws5);
            i = 8;
            byte[] a11 = vwq.mo28916a(8);
            int length2 = a11.length;
            byte b2 = 1;
            int i8 = 0;
            while (i8 < length2) {
                b2 ^= a11[i8];
                i8++;
                i = 8;
            }
            byte b3 = a11[2];
            a11[2] = (byte) (((b3 ^ b2) & 3) | (b3 & -4));
            byte[] a12 = vwq.mo28916a(32);
            z = true;
            while (true) {
                try {
                    Class<?> cls = Class.forName(vwq.f50161g.mo28917a(vwq.f50153a));
                    try {
                        break;
                    } catch (Exception e21) {
                        e = e21;
                    }
                } catch (Exception e22) {
                    e = e22;
                    throw new vwr(e);
                }
            }
        } catch (vwr e23) {
            if (z) {
                i = 8;
                z = false;
            } else {
                throw e23;
            }
        } catch (vwr e24) {
            return bytes3;
        }
    }
}
