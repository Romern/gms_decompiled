package p000;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.projection.common.BufferPool;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.TrustManager;

/* renamed from: oka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oka {

    /* renamed from: a */
    public static final bnsn f37827a = odk.m28481a("CAR.GAL.SECURITY");

    /* renamed from: n */
    static final byte[] f37828n;

    /* renamed from: o */
    static final byte[] f37829o = {-21, -35, -29, -92, Byte.MAX_VALUE, -99, -127, 104, 19, -68, 106, 4, 37, -101, -28, 60, -76, 37, -78, 26, 14, 33, -94, -29, 4, 1, 55, -79, -64, 8, 24, -81, -48, -36, -8, 122, -46, 113, 94, -2, 41, -38, -69, -59, 70, 21, -17, -111, 36, 29, 61, 46, 94, -14, -73, 20, 59, -17, -126, -79, 125, -6, -43, 123, -34, -76, -71, -97, 56, 14, -28, 9, Byte.MIN_VALUE, -120, -104, -35, -10, 22, 66, -83, 48, 83, -59, -92, 71, 62, 104, 37, 33, -73, -111, -92, -122, 39, 46, -54, 85, -27, -89, -6, -84, -110, 83, 80, 41, -42, -78, -41, -106, 94, -121, -90, 106, 110, 78, 71, -27, 78, -104, -65, 44, -36, 86, -9, 114, 57, 89, Byte.MIN_VALUE, 65, -117, 83, 77, -54, 80, 68, -78, 23, 73, 126, -39, 27, -69, 15, 78, -61, 102, -10, -41, -87, 10, -72, -77, -74, 72, 121, -70, -126, 42, -42, 65, 105, 26, 55, -81, 11, -28, 22, 0, 28, -45, -106, 54, -33, -3, 2, 74, -41, -42, -99, -112, 37, 71, -2, 120, -78, -6, 116, 81, 21, 103, -14, 78, 45, 99, 48, -21, -51, 101, -76, 26, -24, -44, 104, 115, -10, 107, 34, 52, -73, 34, 113, 47, -91, -64, -22, -65, 75, 121, -92, -27, 101, 111, -90, -76, -13, 77, 90, -35, 118, 65, -13, 46, -120, -104, -31, -109, 94, -125, -101, -97, -98, 56, 110, 95, 84, 42, -42, -85, 26, -120, 66, -4, -102, 109, 49, -77, 92, -98, 28, -13, 74, -105, 114, -72, 4, -72, 126, -39, -5, -117, 6, -54, 60, -117, -118, -4, -84, -10, 60, 66, 11, -62, -66, 3, 109, 68, -31, -124, 87, 89, -49, -85, 110, -57, 53, 3, -46, -60, -46, -14, -48, 80, -109, -62, 118, -23, 14, -14, -109, -32, -105, -91, 74, -66, -96, -119, 68, -42, 86, -63, -57, -19, 20, -24, 10, -105, 59, 90, -38, -78, 111, 104, 7, -43, -91, -28, -52, 48, 108, -45, -6, 48, 79, 62, -31, -33, 10, 94, 48, 23, -108, 81, 99, -23, 58, -57, 34, 20, 53, -118, -52, -44, -94, -95, 99, 104, 27, 57, -88, 104, 66, 14, -39, 71, -62, 72, -70, 86, -66, 107, -6, -46, -122, 22, 87, 93, -77, -11, -69, 46, 83, -48, 70, -48, 124, -109, 14, -33, 89, -99, 51, -70, 38, 52, 105, -106, -109, 14, -33, -92, 26, -5, -27, -80, -122, 91, 104, -47, -66, -69, 43, 109, 75, 91, 103, -33, 18, 64, -47, -20, -99, -55, -49, 101, -74, 34, 9, 75, -76, -67, -108, -28, Byte.MAX_VALUE, 75, -51, 3, -78, 113, -20, -8, -22, 15, 112, 102, -66, -76, -78, -106, -33, 12, 82, -23, -107, -39, 22, 56, 84, -39, -10, 2, 45, -109, 2, -120, -119, 99, -79, 85, -61, -9, -29, -42, -92, -5, -87, -105, 60, -29, -105, -64, 107, -48, -123, 76, 84, -37, 42, -104, 56, -121, -103, -76, -23, -3, 11, -78, 101, 10, 70, 33, 19, 49, 95, 92, 11, 73, 51, -47, -116, -95, 72, -26, 51, -73, 29, 107, -28, 75, 69, 20, 58, 107, 46, 109, 15, -2, -66, 124, 82, 54, 52, 80, -43, 103, 95, -53, 24, -51, -74, -95, -58, 18, -111, -30, -66, 56, -82, -76, 70, 124, 40, 52, -64, 121, -21, 9, 91, -21, -109, 116, 28, 89, 47, -97, 115, -16, 75, 19, 118, -38, -5, -94, 14, -82, 83, -11, 125, 21, -18, -17, -106, 66, 63, -37, -70, 98, -8, 125, 38, -31, -38, -70, -80, 116, 114, 71, -107, -120, 91, -97, -107, 112, 79, 9, 59, 59, 108, 111, -107, 126, 2, Byte.MAX_VALUE, -37, 125, -61, 19, -43, 12, 29, 106, 0, 58, 104, 105, 119, -65, -87, -2, -66, -115, -47, 13, -79, 77, -90, 35, -93, -6, -66, 47, Byte.MAX_VALUE, 59, 66, 69, -84, -17, -89, 37, 54, -45, 101, -81, 49, 43, -83, 15, 55, 123, -1, -22, 42, -21, -94, -120, 20, -23, 10, 63, 106, 69, -55, -10, -122, 3, -38, 72, 65, 36, -86, -87, 6, -82, 75, -125, Byte.MAX_VALUE, -39, -113, 80, 97, -60, 31, -83, 104, 117, 50, -118, 9, 94, 110, -36, 118, 94, 110, 54, -63, -113, 98, 125, -114, -33, 94, -57, 8, -75, 7, 106, 119, Byte.MIN_VALUE, -127, -72, 71, -77, 115, -104, 119, -105, -108, -110, 68, 18, -114, 3, 87, 111, -71, 95, 64, -62, 105, 9, -54, -13, 95, -97, -85, 70, 85, 6, -74, 85, -91, 124, -36, 62, 1, -48, 46, -108, 43, -126, 5, -115, -18, -122, -43, -49, -63, -85, 72, -20, 14, 0, 16, -60, 11, -15, 39, 31, 9, 99, 39, -66, 35, 65, 0, 116, -56, 31, 122, -111, 45, -12, 64, 0, 36, 40, 95, 51, 126, -89, 28, 39, 78, -33, 118, -38, 95, -112, 112, -10, -13, 104, 69, 31, -116, 115, -98, 31, -1, -109, 76, -4, -114, 38, -87, 54, 119, -68, -47, 2, 70, 94, -74, -82, -52, -122, 7, 92, 30, -93, -111, -116, -60, -85, -53, -116, 43, 122, 73, 116, -82, -26, -119, 29, -123, 16, -55, 18, 105, 84, 5, 10, 114, -101, 115, 68, 109, -54, 19, -54, -22, 30, 99, -53, 98, -54, 12, 115, 33, 89, 98, 31, -78, -38, Byte.MAX_VALUE, -29, -127, 112, 62, -38, -96, 106, 51, 96, 50, -31, -107, 42, 1, 38, -30, -88, -116, 72, -26, 88, 96, -109, 5, -85, 108, 35, 82, 17, 82, 123, -2, 119, 58, 83, 94, 17, 111, -122, Byte.MIN_VALUE, -70, 45, 7, 42, 69, -40, 104, -94, -109, -112, 101, -65, 46, -92, -33, -10, -91, -53, 59, 70, 87, -19, -79, 107, -92, -35, -85, 124, 99, -96, -123, -8, -57, 1, 54, -95, -74, 61, -51, -121, -18, -66, 124, -75, 46, -123, -96, -29, 110, 126, 72, -52, 113, 54, 9, -32, -31, 75, -26, 10, -85, -85, -78, 118, 91, 24, -78, 68, 112, -73, 36, 7, -76, -54, -80, -72, 44, 108, -126, 101, -112, 16, -118, 27, 108, 93, -121, 17, 119, -117, 63, -20, -16, -38, 99, 108, -1, -69, -99, 19, -119, -93, -16, -85, -92, -96, 53, -3, 1, 90, -90, -112, 81, -32, -30, 50, 73, -58, -114, -72, -92, 96, 6, -98, -61, -110, -54, 83, 31, -33, 84, 28, -43, -68, -52, -27, -51, 25, -5, -106, 109, -42, -121, -102, -108, -80, 20, 83, -107, -3, 44, 1, 33, -25, -55, 78, -76, -33, -103, 32, 73, 11, -92, -64, 31, 115, -50, -17, -112, -115, -94, -58, -52, 0, -99, -56, 97, -37, -115, 115, 125, 31, -8, -43, 81, -32, 109, -5, -42, 6, 122, -56, -24, 89, 91, -111, 51, 109, 84, 98, 81, 122, 79, -112, 20, 28, 100, 62, 17, -69, 55, -13, -69, 31, -122, -113, 111, -79, -76, 116, -121, 82, 36, 23, -4, 5, 81, -50, 28, -37, -83, -25, -2, 51, 23, 10, 97, 23, -4, -51, 66, -4, -57, -1, 48, -71, -23, 36, 37, -4, -85, -89, 91, 13, -127, 33, 51, 106, 55, -30, -82, -53, -26, 10, -104, 24, 76, -53, -40, 89, 53, 0, -9, 108, 21, 90, 83, -79, -101, 25, 117, 4, -35, 55, -25, 71, -84, 11, 29, -14, -17, 21, 104, 81, -57, 15, -101, 33, -1, -50, -51, -18, -38, -54, -87, 26, -41, 18, 98, 45, 69, 11, 125, -67, 54, 17, 3, 86, 15, 68, -110, 7, -83, 73, 3, -6, 7, -45, -14, 56, -47, -110, -65, 2, 22, -45, -85, 32, -32, -54, -64, 107, 110, -69, 81, -93, -90, -57, 14, 105, -73, -115, -32, 51, 74, -55, -80, -116, Byte.MIN_VALUE, 121, -8, 18, -109, -28, -34, -90, -46, 120, 70, 49, 66, 23, -98, 116, -84, 81, 80, 103, -20, -67, -52, 70, -47, -74, -34, -98, 47, -80, 39, -23, 26, 111, 20, -59, 43, 43, -54, -17, -99, 19, 31, 85, 84, -62, -58, 28, -49, -109, 33, -114, -117, 40, 9, 16, 99, -74, -26, 72, 100, 22, -5, -27, -36, 77, 104, -80, 23, -117, -45, 86, 104, 119, -106, 93, 70, -121, 64, 102, 13, 108, 62, 26, 117, 59, -54, -105, 125, -75, -106, -23, 77, -35, -110, -4, -46, -1, -60, 78, -3, 22, 100, -109, 118, 18, -69, 65, -45, -55, 38, -125, 37, 43, -77, 110, 94, -20, 15, 45, 18, -65, -110, 14, -69, 94, -65, -16, 6, 65, -78, 107, -71, -37, -113, 106, 58, 33, -111, 54, Byte.MIN_VALUE, -83, -65, 16, 19, 21, 42, -117, -124, -74, 108, -114, -111, 93, 97, 88, -33, -114, -1, -91, -22, -81, 20, 21, -94, 17, 117, -111, -25, -102, -88, 76, -19, -89, 115, -96, -94, 39, -5, 65, 111, -13, -1, 17, -120, 103, -72, 41, 108, -9, 22, 115, -99, -14, 29, -49, -79, 83, 19, -39, -106, 53, 118, 118, 120, -26, 58, -110, -76, 88, -47, -2, -14, -33, 38, 11, 15, 100, -83, -97, -112, 8, 68, -55, 105, 110, -120, 14, 103, -115, -40, -91, 43, -39, -37, -36, 17, 24, 70, 97, 13, -39, 84, 19, -69, -41, 52, 69, -108, 22, -69, -39, -61, 88, 15, 53, 49, 14, 117, Byte.MAX_VALUE, -88, 74, -113, 63, -49, 3, -91, 56, -65, 15, -8, 76, 90, 85, -82, 125, -74, -38, 10, 36, -84, -24, -80, -51, 64, 33, -60, -22, -106, 84, 90, 58, -7, -95, 39, 107, 79, -27, -6, -84, 20, -89, 56, -85, 19, -33, -63, -13, 8, 9, 70, -19, 116, 120, -6, -7, -37, -21, -4, 27, 104, 77, 74, 6, -67, 20, 15, -81, 112, -120, -79, 35, -115, -10, -6, 55, -111, -14, 15, 104, 8, 126, 15, -1, 124, -4, 0, 55, -50, -3, -25, 99, -19, 46, 72, -54, 79, 117, -110, 66, -37, -24, -74, -21, -86, -53, 61, -100, Byte.MAX_VALUE, 36, -98, 39, 37, 7, 102, -74, -90, -33, 48, 31, 12, -54, -11, -6, -59, 73, -7, -6, 1, -74, 42, 48, -66, -117, 21, 61, 124, 109, 60, -83, -100, Byte.MIN_VALUE, 11, -1, -17, 33, 89, -62, 49, 82, Byte.MAX_VALUE, -25, -14, -17, -65, -112, 91, 53, 50};

    /* renamed from: b */
    public String f37830b;

    /* renamed from: c */
    public String f37831c;

    /* renamed from: d */
    public String f37832d;

    /* renamed from: e */
    public int f37833e;

    /* renamed from: f */
    String f37834f;

    /* renamed from: g */
    byte[] f37835g;

    /* renamed from: h */
    byte[] f37836h;

    /* renamed from: i */
    public final ByteBuffer[] f37837i;

    /* renamed from: j */
    public SSLContext f37838j;

    /* renamed from: k */
    public SSLEngine f37839k;

    /* renamed from: l */
    public int f37840l;

    /* renamed from: m */
    public int f37841m;

    /* renamed from: p */
    private final Object f37842p;

    static {
        byte[] bArr = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        // fill-array-data instruction
        bArr[0] = 24;
        bArr[1] = 15;
        bArr[2] = -104;
        bArr[3] = 57;
        bArr[4] = 64;
        bArr[5] = -25;
        bArr[6] = -101;
        bArr[7] = 97;
        bArr[8] = 30;
        bArr[9] = 48;
        bArr[10] = -76;
        bArr[11] = -109;
        bArr[12] = -12;
        bArr[13] = 106;
        bArr[14] = -113;
        bArr[15] = 46;
        bArr[16] = 15;
        bArr[17] = -123;
        bArr[18] = 15;
        bArr[19] = 93;
        bArr[20] = -30;
        bArr[21] = 96;
        bArr[22] = -7;
        bArr[23] = 116;
        bArr[24] = -68;
        bArr[25] = 13;
        bArr[26] = 24;
        bArr[27] = 76;
        bArr[28] = -91;
        bArr[29] = 41;
        bArr[30] = -75;
        bArr[31] = 64;
        bArr[32] = 73;
        bArr[33] = 53;
        bArr[34] = -44;
        bArr[35] = 1;
        bArr[36] = 118;
        bArr[37] = -73;
        bArr[38] = -36;
        bArr[39] = -112;
        bArr[40] = 70;
        bArr[41] = -55;
        bArr[42] = 111;
        bArr[43] = 24;
        bArr[44] = 28;
        bArr[45] = 19;
        bArr[46] = -110;
        bArr[47] = 45;
        bArr[48] = 114;
        bArr[49] = -45;
        bArr[50] = -51;
        bArr[51] = -92;
        bArr[52] = -77;
        bArr[53] = 26;
        bArr[54] = -51;
        bArr[55] = 68;
        bArr[56] = 64;
        bArr[57] = -86;
        bArr[58] = 5;
        bArr[59] = 50;
        bArr[60] = -95;
        bArr[61] = 127;
        bArr[62] = 70;
        bArr[63] = 119;
        bArr[64] = 123;
        bArr[65] = 42;
        bArr[66] = 80;
        bArr[67] = 69;
        bArr[68] = 73;
        bArr[69] = 47;
        bArr[70] = 94;
        bArr[71] = 109;
        bArr[72] = -32;
        bArr[73] = -16;
        bArr[74] = -119;
        bArr[75] = -7;
        bArr[76] = -114;
        bArr[77] = 79;
        bArr[78] = 87;
        bArr[79] = -2;
        bArr[80] = -1;
        bArr[81] = -111;
        bArr[82] = -102;
        bArr[83] = 125;
        bArr[84] = -101;
        bArr[85] = 75;
        bArr[86] = -16;
        bArr[87] = -26;
        bArr[88] = 81;
        bArr[89] = -33;
        bArr[90] = 14;
        bArr[91] = 89;
        bArr[92] = 39;
        bArr[93] = -104;
        bArr[94] = 10;
        bArr[95] = 127;
        bArr[96] = -91;
        bArr[97] = -47;
        bArr[98] = -71;
        bArr[99] = 0;
        bArr[100] = -121;
        bArr[101] = -85;
        bArr[102] = -50;
        bArr[103] = 90;
        bArr[104] = 98;
        bArr[105] = -111;
        bArr[106] = -42;
        bArr[107] = -95;
        bArr[108] = 88;
        bArr[109] = -72;
        bArr[110] = 25;
        bArr[111] = -88;
        bArr[112] = 75;
        bArr[113] = 45;
        bArr[114] = 71;
        bArr[115] = 66;
        bArr[116] = -71;
        bArr[117] = 109;
        bArr[118] = 15;
        bArr[119] = -19;
        bArr[120] = -114;
        bArr[121] = 0;
        bArr[122] = 87;
        bArr[123] = -40;
        bArr[124] = -41;
        bArr[125] = -81;
        bArr[126] = -12;
        bArr[127] = -89;
        bArr[128] = -105;
        bArr[129] = 95;
        bArr[130] = 13;
        bArr[131] = 45;
        bArr[132] = 64;
        bArr[133] = -30;
        bArr[134] = -49;
        bArr[135] = -41;
        bArr[136] = -34;
        bArr[137] = 30;
        bArr[138] = 43;
        bArr[139] = -40;
        bArr[140] = 84;
        bArr[141] = 104;
        bArr[142] = 71;
        bArr[143] = -109;
        bArr[144] = 97;
        bArr[145] = -50;
        bArr[146] = 78;
        bArr[147] = -88;
        bArr[148] = 76;
        bArr[149] = -88;
        bArr[150] = -35;
        bArr[151] = -82;
        bArr[152] = 68;
        bArr[153] = 18;
        bArr[154] = 122;
        bArr[155] = -3;
        bArr[156] = 24;
        bArr[157] = -10;
        bArr[158] = 72;
        bArr[159] = -98;
        bArr[160] = 114;
        bArr[161] = 85;
        bArr[162] = 37;
        bArr[163] = -27;
        bArr[164] = -118;
        bArr[165] = -87;
        bArr[166] = -23;
        bArr[167] = -80;
        bArr[168] = 95;
        bArr[169] = 28;
        bArr[170] = -68;
        bArr[171] = -37;
        bArr[172] = -67;
        bArr[173] = 52;
        bArr[174] = -98;
        bArr[175] = 9;
        bArr[176] = -117;
        bArr[177] = 17;
        bArr[178] = 63;
        bArr[179] = 56;
        bArr[180] = 99;
        bArr[181] = 19;
        bArr[182] = -29;
        bArr[183] = -8;
        bArr[184] = 102;
        bArr[185] = 43;
        bArr[186] = 83;
        bArr[187] = 103;
        bArr[188] = 24;
        bArr[189] = -62;
        bArr[190] = -16;
        bArr[191] = 102;
        bArr[192] = 8;
        bArr[193] = -94;
        bArr[194] = 55;
        bArr[195] = -56;
        bArr[196] = 127;
        bArr[197] = -7;
        bArr[198] = -111;
        bArr[199] = -32;
        bArr[200] = -13;
        bArr[201] = 46;
        bArr[202] = 33;
        bArr[203] = 31;
        bArr[204] = 106;
        bArr[205] = 32;
        bArr[206] = 27;
        bArr[207] = 104;
        bArr[208] = -3;
        bArr[209] = -76;
        bArr[210] = 106;
        bArr[211] = 80;
        bArr[212] = -43;
        bArr[213] = -22;
        bArr[214] = 1;
        bArr[215] = 92;
        bArr[216] = 103;
        bArr[217] = -6;
        bArr[218] = -83;
        bArr[219] = -105;
        bArr[220] = 86;
        bArr[221] = -127;
        bArr[222] = 11;
        bArr[223] = 55;
        bArr[224] = 72;
        bArr[225] = 93;
        bArr[226] = -31;
        bArr[227] = 93;
        bArr[228] = -15;
        bArr[229] = 64;
        bArr[230] = -118;
        bArr[231] = -39;
        bArr[232] = -31;
        bArr[233] = 98;
        bArr[234] = -106;
        bArr[235] = 121;
        bArr[236] = 117;
        bArr[237] = -67;
        bArr[238] = -37;
        bArr[239] = -20;
        bArr[240] = 12;
        bArr[241] = -69;
        bArr[242] = 55;
        bArr[243] = 87;
        bArr[244] = -13;
        bArr[245] = 81;
        bArr[246] = 34;
        bArr[247] = 94;
        bArr[248] = -82;
        bArr[249] = -90;
        bArr[250] = -55;
        bArr[251] = 89;
        bArr[252] = -122;
        bArr[253] = 39;
        bArr[254] = -34;
        bArr[255] = 97;
        f37828n = bArr;
    }

    public oka() {
        this.f37833e = 0;
        this.f37834f = "-----BEGIN CERTIFICATE-----\nMIIDLDCCAhQCAgHdMA0GCSqGSIb3DQEBCwUAMFsxCzAJBgNVBAYTAlVTMRMwEQYD\nVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MR8wHQYDVQQK\nDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDcwNDAwMDAwMFoXDTIwMTEz\nMDEwNTIxOVowXDELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAU\nBgNVBAcMDU1vdW50YWluIFZpZXcxEzARBgNVBAoMCkNhclNlcnZpY2UxCzAJBgNV\nBAsMAjM0MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwh0D0JUoEO/t\nLZ2KxU7nbrsoq4p1Sb2SUinRZR8aaqrMMSPxSG4qCEn6C0k6I7PnL06egLANWDTg\n6LQaRZaAZubHKRV4vA4CF1W0jsW3QSrNbjWz1cBsN0c032W0s98dP4SICJl69G4O\n5/eFVSlgngpea7zpuagKBibanX1uxM8GZiIdeoIX4yVxTGNmm9CkfmAtBs5CUzOB\n3/XcuOB51hrwgxUPs4k5iprxmAfyRL82Rm46eH7kQJ3JscW8gBTRz2vbn0+axwBS\nruUtWJA7nVtMjWhsExPzGg8Hoptglv3Imbk+tkDUGQAx6kQLtW2qhJLAOJtmilUn\njVOtVDn8+QIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQBv/tusy2qB/vJ8SgqL2CYV\nJV/gZB6pNc/V/IGHnw9qQ41ISrDndcYid69ii9N5ncnLIetuxFGN7ZYnAxuBDBvT\n3b1JgL6vRZ++iC/uWjziz7cKaWcaRzfcK0e4NbtRVBS5bhRXla4Js/N1WRFfZ4t3\ndJtxgH93hUYs3g7j0tNLXDYrpycOLjsVw/IKifUgH8LCI6X3uXx7ysMuQ7X8ezU9\ns0fbjfC/8ETVT+OXJyP+1jDFu/47doj8CcEHGiLwXDW5o2vYEi9a2TVzFNwz94h1\nI0hFKthkEnsNvtJcB6b+nCbXqVDDWooU4zs3iWkNdldTKy53br6lgIpO4Z5g1Lgq\n-----END CERTIFICATE-----\n";
        this.f37835g = f37828n;
        this.f37836h = f37829o;
        this.f37837i = new ByteBuffer[64];
        this.f37842p = new Object();
        mo22240a();
    }

    /* renamed from: a */
    private static final ByteBuffer m28980a(ByteBuffer[] byteBufferArr, int i, int i2) {
        if (i == 0) {
            return BufferPool.getBuffer(0);
        }
        ByteBuffer buffer = BufferPool.getBuffer(i2);
        for (int i3 = 0; i3 < i; i3++) {
            if (byteBufferArr[i3].hasRemaining()) {
                buffer.put(byteBufferArr[i3]);
            }
            byteBufferArr[i3].clear();
        }
        buffer.position(0);
        buffer.limit(i2);
        return buffer;
    }

    /* renamed from: b */
    private final void m28983b() {
        X509Certificate x509Certificate = (X509Certificate) this.f37839k.getSession().getPeerCertificates()[0];
        this.f37830b = x509Certificate.getSubjectDN().getName();
        this.f37832d = x509Certificate.getNotAfter().toString();
        this.f37831c = x509Certificate.getNotBefore().toString();
        bnsi d = f37827a.mo68390d();
        d.mo68432a("oka", "b", 417, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Peer certificate subject name: %s", this.f37830b);
        bnsi d2 = f37827a.mo68390d();
        d2.mo68432a("oka", "b", 418, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Valid Times:");
        bnsi d3 = f37827a.mo68390d();
        d3.mo68432a("oka", "b", 419, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d3.mo68420a("    notBefore= %s", this.f37831c);
        bnsi d4 = f37827a.mo68390d();
        d4.mo68432a("oka", "b", 420, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d4.mo68420a("    notAfter= %s", this.f37832d);
        X509Certificate x509Certificate2 = (X509Certificate) this.f37839k.getSession().getLocalCertificates()[0];
        x509Certificate2.getSubjectDN().getName();
        x509Certificate2.getNotBefore();
        x509Certificate2.getNotAfter();
        if (this.f37830b.contains("CarService")) {
            throw new SSLPeerUnverifiedException("Head Unit must not use CarService certificate");
        } else if (!this.f37830b.contains("Google Automotive Link")) {
            this.f37833e = 3;
        } else {
            throw new SSLPeerUnverifiedException("Head Unit cannot send certificate of the CA. It must send it's own certificate");
        }
    }

    public oka(Bundle bundle) {
        this.f37833e = 0;
        this.f37834f = "-----BEGIN CERTIFICATE-----\nMIIDLDCCAhQCAgHdMA0GCSqGSIb3DQEBCwUAMFsxCzAJBgNVBAYTAlVTMRMwEQYD\nVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MR8wHQYDVQQK\nDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDcwNDAwMDAwMFoXDTIwMTEz\nMDEwNTIxOVowXDELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAU\nBgNVBAcMDU1vdW50YWluIFZpZXcxEzARBgNVBAoMCkNhclNlcnZpY2UxCzAJBgNV\nBAsMAjM0MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwh0D0JUoEO/t\nLZ2KxU7nbrsoq4p1Sb2SUinRZR8aaqrMMSPxSG4qCEn6C0k6I7PnL06egLANWDTg\n6LQaRZaAZubHKRV4vA4CF1W0jsW3QSrNbjWz1cBsN0c032W0s98dP4SICJl69G4O\n5/eFVSlgngpea7zpuagKBibanX1uxM8GZiIdeoIX4yVxTGNmm9CkfmAtBs5CUzOB\n3/XcuOB51hrwgxUPs4k5iprxmAfyRL82Rm46eH7kQJ3JscW8gBTRz2vbn0+axwBS\nruUtWJA7nVtMjWhsExPzGg8Hoptglv3Imbk+tkDUGQAx6kQLtW2qhJLAOJtmilUn\njVOtVDn8+QIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQBv/tusy2qB/vJ8SgqL2CYV\nJV/gZB6pNc/V/IGHnw9qQ41ISrDndcYid69ii9N5ncnLIetuxFGN7ZYnAxuBDBvT\n3b1JgL6vRZ++iC/uWjziz7cKaWcaRzfcK0e4NbtRVBS5bhRXla4Js/N1WRFfZ4t3\ndJtxgH93hUYs3g7j0tNLXDYrpycOLjsVw/IKifUgH8LCI6X3uXx7ysMuQ7X8ezU9\ns0fbjfC/8ETVT+OXJyP+1jDFu/47doj8CcEHGiLwXDW5o2vYEi9a2TVzFNwz94h1\nI0hFKthkEnsNvtJcB6b+nCbXqVDDWooU4zs3iWkNdldTKy53br6lgIpO4Z5g1Lgq\n-----END CERTIFICATE-----\n";
        this.f37835g = f37828n;
        this.f37836h = f37829o;
        this.f37837i = new ByteBuffer[64];
        this.f37842p = new Object();
        this.f37833e = 3;
        this.f37830b = bundle.getString("peer_cert_name");
        this.f37832d = bundle.getString("peer_cert_not_after");
        this.f37831c = bundle.getString("peer_cert_not_before");
        this.f37840l = bundle.getInt("net_buffer_size");
        this.f37841m = bundle.getInt("app_buffer_size");
        this.f37838j = (SSLContext) ojq.m28925a(SSLContext.class, bundle.getBinder("ssl_context"));
        this.f37839k = (SSLEngine) ojq.m28925a(SSLEngine.class, bundle.getBinder("ssl_engine"));
        mo22240a();
    }

    /* renamed from: a */
    public static void m28981a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < 48; i2++) {
                byte b = bArr2[i2] & 255;
                bArr2[i2] = (byte) (((((b >> 7) | (b + b)) + 33) ^ bArr3[i2 % bArr3.length]) ^ bArr[i]);
            }
        }
    }

    /* renamed from: a */
    private static boolean m28982a(byte[] bArr, byte[] bArr2) {
        if (!(bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0)) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(bArr2);
                if (Arrays.equals(instance.digest(), bArr)) {
                    return true;
                }
            } catch (NoSuchAlgorithmException e) {
            }
            bnsi b = f37827a.mo68387b();
            b.mo68432a("oka", "a", 753, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Checking validity - reject");
        }
        return false;
    }

    /* renamed from: b */
    static byte[] m28984b(String str) {
        if (str != null) {
            return Base64.decode(str, 0);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0188, code lost:
        if (r10 != null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ac, code lost:
        if (r15 <= 0) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ae, code lost:
        r3 = m28980a(r12, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b3, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b4, code lost:
        if (r13 == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b6, code lost:
        r0 = p000.oka.f37827a.mo68390d();
        r0.mo68432a("oka", "a", 406, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68420a("Final result: %s", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c6, code lost:
        return r3;
     */
    /* renamed from: a */
    public final ByteBuffer mo22238a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i = this.f37833e;
        if (i == 0 || i == 3) {
            return null;
        }
        if (i != 2) {
            try {
                this.f37839k.beginHandshake();
                this.f37833e = 2;
            } catch (SSLException e) {
                bnsi b = f37827a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("oka", "a", 324, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Error beginning SSL Handshake");
                this.f37833e = 4;
                return null;
            }
        }
        ByteBuffer buffer = BufferPool.getBuffer(0);
        ByteBuffer[] byteBufferArr = new ByteBuffer[5];
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            try {
                SSLEngineResult.HandshakeStatus handshakeStatus = this.f37839k.getHandshakeStatus();
                if (z) {
                    bnsi d = f37827a.mo68390d();
                    d.mo68432a("oka", "a", 347, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68420a("Current status: %s", handshakeStatus);
                }
                int i4 = ojy.f37821a[handshakeStatus.ordinal()];
                if (i4 == 1) {
                    this.f37839k.getDelegatedTask().run();
                    if (z) {
                        bnsi d2 = f37827a.mo68390d();
                        d2.mo68432a("oka", "a", 355, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d2.mo68405a("Finished running delegated task.");
                    }
                } else if (i4 == 2) {
                    ByteBuffer a = mo22239a(buffer, 0, 0, 0);
                    byteBufferArr[i2] = a;
                    i3 += a.remaining();
                    i2++;
                } else if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                        }
                    }
                    X509Certificate x509Certificate = (X509Certificate) this.f37839k.getSession().getPeerCertificates()[0];
                    this.f37830b = x509Certificate.getSubjectDN().getName();
                    this.f37832d = x509Certificate.getNotAfter().toString();
                    this.f37831c = x509Certificate.getNotBefore().toString();
                    bnsi d3 = f37827a.mo68390d();
                    d3.mo68432a("oka", "b", 417, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d3.mo68420a("Peer certificate subject name: %s", this.f37830b);
                    bnsi d4 = f37827a.mo68390d();
                    d4.mo68432a("oka", "b", 418, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d4.mo68405a("Valid Times:");
                    bnsi d5 = f37827a.mo68390d();
                    d5.mo68432a("oka", "b", 419, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d5.mo68420a("    notBefore= %s", this.f37831c);
                    bnsi d6 = f37827a.mo68390d();
                    d6.mo68432a("oka", "b", 420, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d6.mo68420a("    notAfter= %s", this.f37832d);
                    X509Certificate x509Certificate2 = (X509Certificate) this.f37839k.getSession().getLocalCertificates()[0];
                    x509Certificate2.getSubjectDN().getName();
                    x509Certificate2.getNotBefore();
                    x509Certificate2.getNotAfter();
                    if (this.f37830b.contains("CarService")) {
                        throw new SSLPeerUnverifiedException("Head Unit must not use CarService certificate");
                    } else if (!this.f37830b.contains("Google Automotive Link")) {
                        this.f37833e = 3;
                        if (z) {
                            bnsi d7 = f37827a.mo68390d();
                            d7.mo68432a("oka", "a", 382, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            d7.mo68405a("Finished handling handshake complete.");
                        }
                    } else {
                        throw new SSLPeerUnverifiedException("Head Unit cannot send certificate of the CA. It must send it's own certificate");
                    }
                } else {
                    if (byteBuffer2 != null) {
                        if (byteBuffer.hasRemaining()) {
                            mo22241a(byteBuffer2, (ByteBuffer) null);
                        }
                    }
                    try {
                        bnsi c = f37827a.mo68388c();
                        c.mo68432a("oka", "a", 370, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("Phone will wait for car to send more SSL handshake data");
                        z = true;
                        z2 = true;
                    } catch (Exception e2) {
                        e = e2;
                        z = true;
                        try {
                            bnsi b2 = f37827a.mo68387b();
                            b2.mo68437a(e);
                            b2.mo68432a("oka", "a", 388, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            b2.mo68405a("Error in SSL handshake");
                            this.f37833e = 4;
                        } finally {
                            if (buffer != null) {
                                BufferPool.m117794a(buffer);
                            }
                        }
                    }
                }
                if (z2) {
                    break;
                }
                try {
                    if (this.f37833e != 2) {
                        break;
                    }
                } catch (Exception e3) {
                    e = e3;
                    bnsi b22 = f37827a.mo68387b();
                    b22.mo68437a(e);
                    b22.mo68432a("oka", "a", 388, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b22.mo68405a("Error in SSL handshake");
                    this.f37833e = 4;
                }
            } catch (Exception e4) {
                e = e4;
                bnsi b222 = f37827a.mo68387b();
                b222.mo68437a(e);
                b222.mo68432a("oka", "a", 388, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b222.mo68405a("Error in SSL handshake");
                this.f37833e = 4;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1 A[Catch:{ all -> 0x00d0 }] */
    /* renamed from: a */
    public final ByteBuffer mo22239a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        SSLEngineResult wrap;
        ByteBuffer byteBuffer2;
        int limit = byteBuffer.limit();
        try {
            byteBuffer.position(i);
            byteBuffer.limit(i + i2);
            int i4 = 0;
            int i5 = 0;
            boolean z = false;
            do {
                ByteBuffer[] byteBufferArr = this.f37837i;
                if (byteBufferArr[i4] == null) {
                    byteBufferArr[i4] = ByteBuffer.allocateDirect(this.f37840l);
                }
                this.f37837i[i4].clear();
                if (i4 == 0) {
                    this.f37837i[0].position(i3);
                }
                synchronized (this.f37842p) {
                    wrap = this.f37839k.wrap(byteBuffer, this.f37837i[i4]);
                }
                this.f37837i[i4].flip();
                i5 += wrap.bytesProduced();
                i4++;
                int i6 = ojy.f37822b[wrap.getStatus().ordinal()];
                if (i6 == 1) {
                    bnsi c = f37827a.mo68388c();
                    c.mo68432a("oka", "a", 508, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Buffer overflow when encrypting bytes to send");
                } else if (i6 == 2) {
                    bnsi b = f37827a.mo68387b();
                    b.mo68432a("oka", "a", 514, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Buffer underflow when encrypting bytes to send");
                    z = true;
                } else if (i6 == 4) {
                    bnsi b2 = f37827a.mo68387b();
                    b2.mo68432a("oka", "a", 523, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68405a("SSLEngine closed when preparing bytes to send");
                    z = true;
                }
                if (z || !byteBuffer.hasRemaining()) {
                    if (i4 == 1) {
                        byteBuffer2 = m28980a(this.f37837i, i4, i5);
                    } else {
                        byteBuffer2 = this.f37837i[0];
                    }
                }
            } while (i4 < 64);
            if (i4 == 1) {
            }
            if (byteBuffer.hasRemaining()) {
                bnsi b3 = f37827a.mo68387b();
                b3.mo68432a("oka", "a", 539, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b3.mo68405a("Did not encrypt all the bytes in the input!");
            }
            byteBuffer.limit(limit);
            return byteBuffer2;
        } catch (Throwable th) {
            if (byteBuffer.hasRemaining()) {
                bnsi b4 = f37827a.mo68387b();
                b4.mo68432a("oka", "a", 539, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b4.mo68405a("Did not encrypt all the bytes in the input!");
            }
            byteBuffer.limit(limit);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22240a() {
        byte[] b = m28984b(ccvc.f180021a.mo6606a().mo76867a());
        String str = m28982a(m28984b(ccvc.f180021a.mo6606a().mo76868b()), b) ? new String(b) : "-----BEGIN CERTIFICATE-----\nMIIDLDCCAhQCAgHdMA0GCSqGSIb3DQEBCwUAMFsxCzAJBgNVBAYTAlVTMRMwEQYD\nVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MR8wHQYDVQQK\nDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDcwNDAwMDAwMFoXDTIwMTEz\nMDEwNTIxOVowXDELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAU\nBgNVBAcMDU1vdW50YWluIFZpZXcxEzARBgNVBAoMCkNhclNlcnZpY2UxCzAJBgNV\nBAsMAjM0MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwh0D0JUoEO/t\nLZ2KxU7nbrsoq4p1Sb2SUinRZR8aaqrMMSPxSG4qCEn6C0k6I7PnL06egLANWDTg\n6LQaRZaAZubHKRV4vA4CF1W0jsW3QSrNbjWz1cBsN0c032W0s98dP4SICJl69G4O\n5/eFVSlgngpea7zpuagKBibanX1uxM8GZiIdeoIX4yVxTGNmm9CkfmAtBs5CUzOB\n3/XcuOB51hrwgxUPs4k5iprxmAfyRL82Rm46eH7kQJ3JscW8gBTRz2vbn0+axwBS\nruUtWJA7nVtMjWhsExPzGg8Hoptglv3Imbk+tkDUGQAx6kQLtW2qhJLAOJtmilUn\njVOtVDn8+QIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQBv/tusy2qB/vJ8SgqL2CYV\nJV/gZB6pNc/V/IGHnw9qQ41ISrDndcYid69ii9N5ncnLIetuxFGN7ZYnAxuBDBvT\n3b1JgL6vRZ++iC/uWjziz7cKaWcaRzfcK0e4NbtRVBS5bhRXla4Js/N1WRFfZ4t3\ndJtxgH93hUYs3g7j0tNLXDYrpycOLjsVw/IKifUgH8LCI6X3uXx7ysMuQ7X8ezU9\ns0fbjfC/8ETVT+OXJyP+1jDFu/47doj8CcEHGiLwXDW5o2vYEi9a2TVzFNwz94h1\nI0hFKthkEnsNvtJcB6b+nCbXqVDDWooU4zs3iWkNdldTKy53br6lgIpO4Z5g1Lgq\n-----END CERTIFICATE-----\n";
        byte[] b2 = m28984b(ccvc.f180021a.mo6606a().mo76869c());
        if (!m28982a(m28984b(ccvc.f180021a.mo6606a().mo76870d()), b2)) {
            b2 = f37828n;
        }
        byte[] b3 = m28984b(ccvc.f180021a.mo6606a().mo76871e());
        if (!m28982a(m28984b(ccvc.f180021a.mo6606a().mo76872f()), b3)) {
            b3 = f37829o;
        }
        if (str != "-----BEGIN CERTIFICATE-----\nMIIDLDCCAhQCAgHdMA0GCSqGSIb3DQEBCwUAMFsxCzAJBgNVBAYTAlVTMRMwEQYD\nVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MR8wHQYDVQQK\nDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDcwNDAwMDAwMFoXDTIwMTEz\nMDEwNTIxOVowXDELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAU\nBgNVBAcMDU1vdW50YWluIFZpZXcxEzARBgNVBAoMCkNhclNlcnZpY2UxCzAJBgNV\nBAsMAjM0MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwh0D0JUoEO/t\nLZ2KxU7nbrsoq4p1Sb2SUinRZR8aaqrMMSPxSG4qCEn6C0k6I7PnL06egLANWDTg\n6LQaRZaAZubHKRV4vA4CF1W0jsW3QSrNbjWz1cBsN0c032W0s98dP4SICJl69G4O\n5/eFVSlgngpea7zpuagKBibanX1uxM8GZiIdeoIX4yVxTGNmm9CkfmAtBs5CUzOB\n3/XcuOB51hrwgxUPs4k5iprxmAfyRL82Rm46eH7kQJ3JscW8gBTRz2vbn0+axwBS\nruUtWJA7nVtMjWhsExPzGg8Hoptglv3Imbk+tkDUGQAx6kQLtW2qhJLAOJtmilUn\njVOtVDn8+QIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQBv/tusy2qB/vJ8SgqL2CYV\nJV/gZB6pNc/V/IGHnw9qQ41ISrDndcYid69ii9N5ncnLIetuxFGN7ZYnAxuBDBvT\n3b1JgL6vRZ++iC/uWjziz7cKaWcaRzfcK0e4NbtRVBS5bhRXla4Js/N1WRFfZ4t3\ndJtxgH93hUYs3g7j0tNLXDYrpycOLjsVw/IKifUgH8LCI6X3uXx7ysMuQ7X8ezU9\ns0fbjfC/8ETVT+OXJyP+1jDFu/47doj8CcEHGiLwXDW5o2vYEi9a2TVzFNwz94h1\nI0hFKthkEnsNvtJcB6b+nCbXqVDDWooU4zs3iWkNdldTKy53br6lgIpO4Z5g1Lgq\n-----END CERTIFICATE-----\n" && b2 != f37828n && b3 != f37829o) {
            this.f37834f = str;
            this.f37835g = b2;
            this.f37836h = b3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081 A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082 A[Catch:{ all -> 0x00a0 }] */
    /* renamed from: a */
    public final void mo22241a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3;
        SSLEngineResult unwrap;
        if (byteBuffer2 == null) {
            byteBuffer3 = BufferPool.getBuffer(this.f37841m);
        } else {
            byteBuffer3 = byteBuffer2;
        }
        int limit = byteBuffer.limit();
        int i = 0;
        boolean z = false;
        do {
            if (byteBuffer2 == null) {
                try {
                    byteBuffer3.clear();
                } catch (Throwable th) {
                    if (byteBuffer.hasRemaining()) {
                        bnsi b = f37827a.mo68387b();
                        b.mo68432a("oka", "a", 618, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68405a("Did not decrypt all the bytes in the input buffer!");
                    }
                    byteBuffer.limit(limit);
                    throw th;
                }
            }
            synchronized (this.f37842p) {
                unwrap = this.f37839k.unwrap(byteBuffer, byteBuffer3);
            }
            i++;
            int i2 = ojy.f37822b[unwrap.getStatus().ordinal()];
            if (i2 == 1) {
                bnsi d = f37827a.mo68390d();
                d.mo68432a("oka", "a", 591, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Buffer overflow when decrypting bytes received");
            } else if (i2 == 2) {
                bnsi b2 = f37827a.mo68387b();
                b2.mo68432a("oka", "a", 596, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("Buffer underflow when decrypting bytes received");
                z = true;
            } else if (i2 == 4) {
                bnsi b3 = f37827a.mo68387b();
                b3.mo68432a("oka", "a", 605, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b3.mo68405a("SSLEngine closed when preparing bytes to send");
                z = true;
            }
            if (z || !byteBuffer.hasRemaining()) {
                if (byteBuffer2 != null) {
                    BufferPool.m117794a(byteBuffer3);
                }
            }
        } while (i < 64);
        if (byteBuffer2 != null) {
        }
        if (byteBuffer.hasRemaining()) {
            bnsi b4 = f37827a.mo68387b();
            b4.mo68432a("oka", "a", 618, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b4.mo68405a("Did not decrypt all the bytes in the input buffer!");
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: a */
    public final boolean mo22242a(String str) {
        if (str == null) {
            try {
                this.f37838j = SSLContext.getInstance("TLSv1.2");
            } catch (Exception e) {
                bnsi b = f37827a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("oka", "a", 196, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Exception initializing SSL engine");
                return false;
            }
        } else {
            this.f37838j = SSLContext.getInstance("TLSv1.2", str);
        }
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.getProvider();
        byte[] bArr = new byte[48];
        m28981a(this.f37834f.getBytes(StandardCharsets.UTF_8), bArr, this.f37835g);
        m28981a("-----BEGIN CERTIFICATE-----\nMIIDiTCCAnGgAwIBAgIJAMFO56WkVE1CMA0GCSqGSIb3DQEBBQUAMFsxCzAJBgNV\nBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBW\naWV3MR8wHQYDVQQKDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDYwNjE4\nMjgxOVoXDTQ0MDYwNTE4MjgxOVowWzELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNh\nbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxHzAdBgNVBAoMFkdvb2ds\nZSBBdXRvbW90aXZlIExpbmswggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB\nAQDUH+iIbwwVb74NdI5eBv/ACFmh4ml/NOW7gUVWdYX50n8uQQsHHLCNIhk5VV2H\nhanvAZ/XXHPuVAPadE2HpnNqePKF/RDo4eJo/+rOief8gBYq/Z+OQTZeLdNm+GoI\nHBrEjU4Ms8IdLuFW0jF8LlIRgekjLHpc7duUl3QpwBlmAWQK40T/SZjprlmhyqfJ\ng1rxFdnGbrSibmCsTmb3m6WZyZUyrcwmd7t6q3pHbMABO+o02asPG/YPj/SJo4+i\nfb5/Nk56f3hH9pBiPKQXJnVUdVLKMXSRgydDBsGSBol4C0JL77MNDrMR5jdafJ4j\nmWmsa2+mnzoAv9AxEL9T0LiNAgMBAAGjUDBOMB0GA1UdDgQWBBS5dqvv8DPQiwrM\nfgn8xKR91k7wgjAfBgNVHSMEGDAWgBS5dqvv8DPQiwrMfgn8xKR91k7wgjAMBgNV\nHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQDKcnBsrbB0Jbz2VGJKP2lwYB6P\ndCTCCpQu7dVp61UQOX+zWfd2hnNMnLs/r1xPO+eyN0vmw7sD05phaIhbXVauKWZi\n9WqWHTaR+9s6CTyBOc1Mye0DMj+4vHt+WLmf0lYjkYUVYvR1EImX8ktXzkVmOqn+\ne30siqlZ8pQpsOgegIKfJ+pNQM8c3eXVv3KFMUgjZW33SziZL8IMsLvSO+1LtH37\nKqbTEMP6XUwVuZopgGvaHU74eT/WSRGlL7vX4OL5/UXXP4qsGH2Zp7uQlErv4H9j\nkMs37UL1vGb4M8RM7Eyu9/RulepSmqZUF+3i+3eby8iGq/3OWk9wgJf7AXnx\n-----END CERTIFICATE-----\n".getBytes(StandardCharsets.UTF_8), bArr, this.f37835g);
        for (int i = 0; i < 7; i++) {
            m28981a(bArr, bArr, this.f37835g);
        }
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        instance.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr, 32, 16));
        byte[] doFinal = instance.doFinal(this.f37836h);
        int length = doFinal.length - 54;
        byte[] bArr3 = new byte[length];
        System.arraycopy(doFinal, 28, bArr3, 0, length);
        ojz ojz = new ojz(KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(bArr3, 2))), this.f37834f);
        this.f37838j.init(new KeyManager[]{ojz}, new TrustManager[]{ojz.f37823a}, null);
        bnsi d = f37827a.mo68390d();
        d.mo68432a("oka", "a", 183, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68424a("Successfully initialized SSL context for protocol: %s using provider: %s", this.f37838j.getProtocol(), this.f37838j.getProvider().getName());
        SSLEngine createSSLEngine = this.f37838j.createSSLEngine();
        this.f37839k = createSSLEngine;
        createSSLEngine.setUseClientMode(false);
        this.f37839k.setNeedClientAuth(true);
        this.f37840l = this.f37839k.getSession().getPacketBufferSize();
        this.f37841m = this.f37839k.getSession().getApplicationBufferSize();
        this.f37833e = 1;
        return true;
    }
}
