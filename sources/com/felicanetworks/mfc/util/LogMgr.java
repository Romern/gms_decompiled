package com.felicanetworks.mfc.util;

import android.util.Log;
import com.felicanetworks.mfc.mfi.FlavorConst;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LogMgr {
    public static final int API = 3;
    private static final int ARGS_LENGTH_MAX = 8;
    public static final int CLS = 5;
    public static final int DBG = 6;
    public static final int ERR = 1;
    public static final int PKG = 4;
    private static final String S_API = "[API]";
    private static final String S_CLS = "[CLS]";
    private static final String S_CMP = "[MFICU]";
    private static final String S_DBG = "[DBG]";
    private static final String S_ERR = "[ERR]";
    private static final String S_PKG = "[PKG]";
    private static final String S_TRC = "[TRC]";
    private static final String S_UNK = "[UNK]";
    private static final String S_WAR = "[WAR]";
    public static final int TRC = 7;
    public static final int WAR = 2;
    private static final Object[] argDummy = new Object[0];
    protected static boolean bUseHomeBrewingFromat = true;
    private static final boolean enable = false;
    private static final boolean enableClass = false;
    static Map enableClassName;
    public static int level = FlavorConst.LOG_LEVEL;
    private static Object[] sNew_args = new Object[8];
    private static volatile Object[] sObjs = new Object[8];

    /* renamed from: sb */
    private static StringBuffer f7454sb = new StringBuffer((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    private static StringBuffer sbConv = new StringBuffer(64);
    private static StringBuffer sbTag = new StringBuffer(128);
    private static StringBuilder sbuilder = new StringBuilder(128);

    static {
        HashMap hashMap = new HashMap();
        enableClassName = hashMap;
        hashMap.put("com.felicanetworks.mfc.Felica", 7);
        enableClassName.put("com.felicanetworks.mfc.FSC", 7);
        enableClassName.put("com.felicanetworks.mfc.PushSegmentParcelableWrapper", 7);
        enableClassName.put("com.felicanetworks.mfc.PushSegmentParcelableWrapper$1", 7);
    }

    static String ByteArray2String(byte[] bArr) {
        sbConv.setLength(0);
        String[] strArr = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        strArr[0] = "0x00";
        strArr[1] = "0x01";
        strArr[2] = "0x02";
        strArr[3] = "0x03";
        strArr[4] = "0x04";
        strArr[5] = "0x05";
        strArr[6] = "0x06";
        strArr[7] = "0x07";
        strArr[8] = "0x08";
        strArr[9] = "0x09";
        strArr[10] = "0x0A";
        strArr[11] = "0x0B";
        strArr[12] = "0x0C";
        strArr[13] = "0x0D";
        strArr[14] = "0x0E";
        strArr[15] = "0x0F";
        strArr[16] = "0x10";
        strArr[17] = "0x11";
        strArr[18] = "0x12";
        strArr[19] = "0x13";
        strArr[20] = "0x14";
        strArr[21] = "0x15";
        strArr[22] = "0x16";
        strArr[23] = "0x17";
        strArr[24] = "0x18";
        strArr[25] = "0x19";
        strArr[26] = "0x1A";
        strArr[27] = "0x1B";
        strArr[28] = "0x1C";
        strArr[29] = "0x1D";
        strArr[30] = "0x1E";
        strArr[31] = "0x1F";
        strArr[32] = "0x20";
        strArr[33] = "0x21";
        strArr[34] = "0x22";
        strArr[35] = "0x23";
        strArr[36] = "0x24";
        strArr[37] = "0x25";
        strArr[38] = "0x26";
        strArr[39] = "0x27";
        strArr[40] = "0x28";
        strArr[41] = "0x29";
        strArr[42] = "0x2A";
        strArr[43] = "0x2B";
        strArr[44] = "0x2C";
        strArr[45] = "0x2D";
        strArr[46] = "0x2E";
        strArr[47] = "0x2F";
        strArr[48] = "0x30";
        strArr[49] = "0x31";
        strArr[50] = "0x32";
        strArr[51] = "0x33";
        strArr[52] = "0x34";
        strArr[53] = "0x35";
        strArr[54] = "0x36";
        strArr[55] = "0x37";
        strArr[56] = "0x38";
        strArr[57] = "0x39";
        strArr[58] = "0x3A";
        strArr[59] = "0x3B";
        strArr[60] = "0x3C";
        strArr[61] = "0x3D";
        strArr[62] = "0x3E";
        strArr[63] = "0x3F";
        strArr[64] = "0x40";
        strArr[65] = "0x41";
        strArr[66] = "0x42";
        strArr[67] = "0x43";
        strArr[68] = "0x44";
        strArr[69] = "0x45";
        strArr[70] = "0x46";
        strArr[71] = "0x47";
        strArr[72] = "0x48";
        strArr[73] = "0x49";
        strArr[74] = "0x4A";
        strArr[75] = "0x4B";
        strArr[76] = "0x4C";
        strArr[77] = "0x4D";
        strArr[78] = "0x4E";
        strArr[79] = "0x4F";
        strArr[80] = "0x50";
        strArr[81] = "0x51";
        strArr[82] = "0x52";
        strArr[83] = "0x53";
        strArr[84] = "0x54";
        strArr[85] = "0x55";
        strArr[86] = "0x56";
        strArr[87] = "0x57";
        strArr[88] = "0x58";
        strArr[89] = "0x59";
        strArr[90] = "0x5A";
        strArr[91] = "0x5B";
        strArr[92] = "0x5C";
        strArr[93] = "0x5D";
        strArr[94] = "0x5E";
        strArr[95] = "0x5F";
        strArr[96] = "0x60";
        strArr[97] = "0x61";
        strArr[98] = "0x62";
        strArr[99] = "0x63";
        strArr[100] = "0x64";
        strArr[101] = "0x65";
        strArr[102] = "0x66";
        strArr[103] = "0x67";
        strArr[104] = "0x68";
        strArr[105] = "0x69";
        strArr[106] = "0x6A";
        strArr[107] = "0x6B";
        strArr[108] = "0x6C";
        strArr[109] = "0x6D";
        strArr[110] = "0x6E";
        strArr[111] = "0x6F";
        strArr[112] = "0x70";
        strArr[113] = "0x71";
        strArr[114] = "0x72";
        strArr[115] = "0x73";
        strArr[116] = "0x74";
        strArr[117] = "0x75";
        strArr[118] = "0x76";
        strArr[119] = "0x77";
        strArr[120] = "0x78";
        strArr[121] = "0x79";
        strArr[122] = "0x7A";
        strArr[123] = "0x7B";
        strArr[124] = "0x7C";
        strArr[125] = "0x7D";
        strArr[126] = "0x7E";
        strArr[127] = "0x7F";
        strArr[128] = "0x80";
        strArr[129] = "0x81";
        strArr[130] = "0x82";
        strArr[131] = "0x83";
        strArr[132] = "0x84";
        strArr[133] = "0x85";
        strArr[134] = "0x86";
        strArr[135] = "0x87";
        strArr[136] = "0x88";
        strArr[137] = "0x89";
        strArr[138] = "0x8A";
        strArr[139] = "0x8B";
        strArr[140] = "0x8C";
        strArr[141] = "0x8D";
        strArr[142] = "0x8E";
        strArr[143] = "0x8F";
        strArr[144] = "0x90";
        strArr[145] = "0x91";
        strArr[146] = "0x92";
        strArr[147] = "0x93";
        strArr[148] = "0x94";
        strArr[149] = "0x95";
        strArr[150] = "0x96";
        strArr[151] = "0x97";
        strArr[152] = "0x98";
        strArr[153] = "0x99";
        strArr[154] = "0x9A";
        strArr[155] = "0x9B";
        strArr[156] = "0x9C";
        strArr[157] = "0x9D";
        strArr[158] = "0x9E";
        strArr[159] = "0x9F";
        strArr[160] = "0xA0";
        strArr[161] = "0xA1";
        strArr[162] = "0xA2";
        strArr[163] = "0xA3";
        strArr[164] = "0xA4";
        strArr[165] = "0xA5";
        strArr[166] = "0xA6";
        strArr[167] = "0xA7";
        strArr[168] = "0xA8";
        strArr[169] = "0xA9";
        strArr[170] = "0xAA";
        strArr[171] = "0xAB";
        strArr[172] = "0xAC";
        strArr[173] = "0xAD";
        strArr[174] = "0xAE";
        strArr[175] = "0xAF";
        strArr[176] = "0xB0";
        strArr[177] = "0xB1";
        strArr[178] = "0xB2";
        strArr[179] = "0xB3";
        strArr[180] = "0xB4";
        strArr[181] = "0xB5";
        strArr[182] = "0xB6";
        strArr[183] = "0xB7";
        strArr[184] = "0xB8";
        strArr[185] = "0xB9";
        strArr[186] = "0xBA";
        strArr[187] = "0xBB";
        strArr[188] = "0xBC";
        strArr[189] = "0xBD";
        strArr[190] = "0xBE";
        strArr[191] = "0xBF";
        strArr[192] = "0xC0";
        strArr[193] = "0xC1";
        strArr[194] = "0xC2";
        strArr[195] = "0xC3";
        strArr[196] = "0xC4";
        strArr[197] = "0xC5";
        strArr[198] = "0xC6";
        strArr[199] = "0xC7";
        strArr[200] = "0xC8";
        strArr[201] = "0xC9";
        strArr[202] = "0xCA";
        strArr[203] = "0xCB";
        strArr[204] = "0xCC";
        strArr[205] = "0xCD";
        strArr[206] = "0xCE";
        strArr[207] = "0xCF";
        strArr[208] = "0xD0";
        strArr[209] = "0xD1";
        strArr[210] = "0xD2";
        strArr[211] = "0xD3";
        strArr[212] = "0xD4";
        strArr[213] = "0xD5";
        strArr[214] = "0xD6";
        strArr[215] = "0xD7";
        strArr[216] = "0xD8";
        strArr[217] = "0xD9";
        strArr[218] = "0xDA";
        strArr[219] = "0xDB";
        strArr[220] = "0xDC";
        strArr[221] = "0xDD";
        strArr[222] = "0xDE";
        strArr[223] = "0xDF";
        strArr[224] = "0xE0";
        strArr[225] = "0xE1";
        strArr[226] = "0xE2";
        strArr[227] = "0xE3";
        strArr[228] = "0xE4";
        strArr[229] = "0xE5";
        strArr[230] = "0xE6";
        strArr[231] = "0xE7";
        strArr[232] = "0xE8";
        strArr[233] = "0xE9";
        strArr[234] = "0xEA";
        strArr[235] = "0xEB";
        strArr[236] = "0xEC";
        strArr[237] = "0xED";
        strArr[238] = "0xEE";
        strArr[239] = "0xEF";
        strArr[240] = "0xF0";
        strArr[241] = "0xF1";
        strArr[242] = "0xF2";
        strArr[243] = "0xF3";
        strArr[244] = "0xF4";
        strArr[245] = "0xF5";
        strArr[246] = "0xF6";
        strArr[247] = "0xF7";
        strArr[248] = "0xF8";
        strArr[249] = "0xF9";
        strArr[250] = "0xFA";
        strArr[251] = "0xFB";
        strArr[252] = "0xFC";
        strArr[253] = "0xFD";
        strArr[254] = "0xFE";
        strArr[255] = "0xFF";
        if (bArr == null) {
            return "{NULL}";
        }
        int length = bArr.length;
        if (length == 0) {
            return "{0#}";
        }
        if (length == 1) {
            sbConv.append("{1#");
            sbConv.append(strArr[bArr[0] & 255]);
            sbConv.append("}");
            return sbConv.toString();
        } else if (length == 2) {
            sbConv.append("{2#");
            sbConv.append(strArr[bArr[0] & 255]);
            sbConv.append(',');
            sbConv.append(strArr[bArr[1] & 255]);
            sbConv.append("}");
            return sbConv.toString();
        } else if (length != 3) {
            sbConv.append('{');
            sbConv.append(length);
            sbConv.append('#');
            sbConv.append(strArr[bArr[0] & 255]);
            sbConv.append(',');
            sbConv.append(strArr[bArr[1] & 255]);
            sbConv.append(',');
            sbConv.append(strArr[bArr[2] & 255]);
            sbConv.append("...}");
            return sbConv.toString();
        } else {
            f7454sb.toString();
            sbConv.append("{3#");
            sbConv.append(strArr[bArr[0] & 255]);
            sbConv.append(',');
            sbConv.append(strArr[bArr[1] & 255]);
            sbConv.append(',');
            sbConv.append(strArr[bArr[2] & 255]);
            sbConv.append("}");
            return sbConv.toString();
        }
    }

    static String IntegerArray2String(int[] iArr) {
        sbConv.setLength(0);
        if (iArr == null) {
            return "{NULL}";
        }
        int length = iArr.length;
        if (length == 0) {
            return "{0#}";
        }
        if (length == 1) {
            sbConv.append("{1#");
            sbConv.append(iArr[0]);
            sbConv.append("}");
            return sbConv.toString();
        } else if (length == 2) {
            sbConv.append("{2#");
            sbConv.append(iArr[0]);
            sbConv.append(',');
            sbConv.append(iArr[1]);
            sbConv.append("}");
            return sbConv.toString();
        } else if (length != 3) {
            sbConv.append('{');
            sbConv.append(length);
            sbConv.append('#');
            sbConv.append(iArr[0]);
            sbConv.append(',');
            sbConv.append(iArr[1]);
            sbConv.append(',');
            sbConv.append(iArr[2]);
            sbConv.append("...}");
            return sbConv.toString();
        } else {
            sbConv.append("{3#");
            sbConv.append(iArr[0]);
            sbConv.append(',');
            sbConv.append(iArr[1]);
            sbConv.append(',');
            sbConv.append(iArr[2]);
            sbConv.append("}");
            return sbConv.toString();
        }
    }

    public static boolean checkEnableClass(StackTraceElement stackTraceElement, int i) {
        Integer num;
        String className = stackTraceElement.getClassName();
        if (className == null || (num = (Integer) enableClassName.get(className)) == null || i > num.intValue()) {
            return false;
        }
        return true;
    }

    static String format(String str, Object[] objArr, long j) {
        Integer num;
        if (!bUseHomeBrewingFromat) {
            return String.format(str, objArr);
        }
        f7454sb.setLength(0);
        int length = str.length();
        int i = (int) j;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '%' && i2 <= length - 1) {
                i2++;
                char charAt2 = str.charAt(i2);
                if (!(charAt2 == 'f' || charAt2 == 's' || charAt2 == 'x')) {
                    switch (charAt2) {
                        case 'b':
                        case 'c':
                        case 'd':
                            break;
                        default:
                            f7454sb.append(charAt2);
                            break;
                    }
                }
                if (i3 < i) {
                    num = objArr[i3];
                } else {
                    num = null;
                }
                i3++;
                if (charAt2 != 'f') {
                    if (charAt2 != 's') {
                        if (charAt2 != 'x') {
                            switch (charAt2) {
                                case 'b':
                                    if (num != null) {
                                        String str2 = "false";
                                        if (!(num instanceof Boolean)) {
                                            StringBuffer stringBuffer = f7454sb;
                                            if (Boolean.getBoolean(num.toString())) {
                                                str2 = "true";
                                            }
                                            stringBuffer.append(str2);
                                            break;
                                        } else {
                                            StringBuffer stringBuffer2 = f7454sb;
                                            if (((Boolean) num).booleanValue()) {
                                                str2 = "true";
                                            }
                                            stringBuffer2.append(str2);
                                            break;
                                        }
                                    } else {
                                        f7454sb.append("null");
                                        continue;
                                    }
                                case 'c':
                                    if (num != null) {
                                        if (!(num instanceof Character)) {
                                            f7454sb.append(num.toString().charAt(0));
                                            break;
                                        } else {
                                            f7454sb.append((Character) num);
                                            break;
                                        }
                                    } else {
                                        f7454sb.append("null");
                                        continue;
                                    }
                                case 'd':
                                    if (num != null) {
                                        if (!(num instanceof Integer)) {
                                            if (!(num instanceof Long)) {
                                                if (!(num instanceof Byte)) {
                                                    try {
                                                        f7454sb.append(Integer.valueOf(num.toString()));
                                                        break;
                                                    } catch (Exception e) {
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append("args[");
                                                        sb.append(i3 - 1);
                                                        sb.append("]: fmt = \"");
                                                        sb.append(str);
                                                        sb.append("\", obj = ");
                                                        sb.append(num);
                                                        sb.append(", msg = ");
                                                        sb.append(e.getMessage());
                                                        Log.w("LogMgr", sb.toString());
                                                        f7454sb.append(num.toString());
                                                        break;
                                                    }
                                                } else {
                                                    f7454sb.append((Byte) num);
                                                    break;
                                                }
                                            } else {
                                                f7454sb.append((Long) num);
                                                break;
                                            }
                                        } else {
                                            f7454sb.append(num);
                                            break;
                                        }
                                    } else {
                                        f7454sb.append("null");
                                        continue;
                                    }
                            }
                        } else if (num == null) {
                            f7454sb.append("null");
                        } else if (num instanceof Integer) {
                            f7454sb.append(Integer.toHexString(num.intValue()));
                        } else if (num instanceof Long) {
                            f7454sb.append(Long.toHexString(((Long) num).longValue()));
                        } else if (num instanceof Byte) {
                            f7454sb.append(Integer.toHexString(((Byte) num).byteValue() & 255));
                        } else {
                            try {
                                f7454sb.append(Integer.toHexString(Integer.valueOf(num.toString()).intValue()));
                            } catch (Exception e2) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("args[");
                                sb2.append(i3 - 1);
                                sb2.append("]: fmt = \"");
                                sb2.append(str);
                                sb2.append("\", obj = ");
                                sb2.append(num);
                                sb2.append(", msg = ");
                                sb2.append(e2.getMessage());
                                Log.w("LogMgr", sb2.toString());
                                f7454sb.append(num.toString());
                            }
                        }
                    } else if (num == null) {
                        f7454sb.append("null");
                    } else if (num instanceof String) {
                        f7454sb.append((String) num);
                    } else {
                        f7454sb.append(num.toString());
                    }
                } else if (num == null) {
                    f7454sb.append("null");
                } else if (num instanceof Double) {
                    f7454sb.append((Double) num);
                } else if (num instanceof Float) {
                    f7454sb.append((Float) num);
                } else {
                    f7454sb.append(Double.parseDouble(num.toString()));
                }
            } else {
                f7454sb.append(charAt);
            }
            i2++;
        }
        return f7454sb.toString();
    }

    protected static String getLevel(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(1, S_ERR);
        hashMap.put(2, S_WAR);
        hashMap.put(3, S_API);
        hashMap.put(4, S_PKG);
        hashMap.put(5, S_CLS);
        hashMap.put(6, S_DBG);
        hashMap.put(7, S_TRC);
        String str = (String) hashMap.get(Integer.valueOf(i));
        return str == null ? S_UNK : str;
    }

    public static boolean getUseHomeBrewingFromat() {
        return bUseHomeBrewingFromat;
    }

    public static void log(int i, String str) {
    }

    protected static void log(int i, String str, Object[] objArr, long j) {
    }

    public static void logArray(int i, byte[] bArr) {
    }

    public static void logArray(int i, byte[] bArr, int i2, int i3) {
    }

    private static synchronized void logArray(int i, byte[] bArr, int i2, int i3, StackTraceElement stackTraceElement) {
        synchronized (LogMgr.class) {
        }
    }

    protected static void output(int i, StackTraceElement stackTraceElement, String str, Object[] objArr, long j) {
        Object obj;
        sbTag.setLength(0);
        sbTag.append(S_CMP);
        sbTag.append(getLevel(i));
        sbTag.append('[');
        sbTag.append(stackTraceElement.getFileName());
        sbTag.append("][");
        sbTag.append(stackTraceElement.getMethodName());
        sbTag.append("(L:");
        sbTag.append(stackTraceElement.getLineNumber());
        sbTag.append(")]");
        String stringBuffer = sbTag.toString();
        int i2 = 0;
        while (((long) i2) < j) {
            Object obj2 = objArr[i2];
            if ((obj2 instanceof byte[]) || (obj2 instanceof int[])) {
                for (int i3 = 0; ((long) i3) < j; i3++) {
                    Object obj3 = objArr[i3];
                    if (obj3 instanceof byte[]) {
                        sNew_args[i3] = ByteArray2String((byte[]) objArr[i3]);
                    } else if (obj3 instanceof int[]) {
                        sNew_args[i3] = IntegerArray2String((int[]) objArr[i3]);
                    } else {
                        sNew_args[i3] = objArr[i3];
                    }
                }
                if (i == 1) {
                    Log.e(stringBuffer, format(str, sNew_args, j));
                    return;
                } else if (i != 2) {
                    Log.i(stringBuffer, format(str, sNew_args, j));
                    return;
                } else {
                    Log.w(stringBuffer, format(str, sNew_args, j));
                    return;
                }
            } else {
                i2++;
            }
        }
        if (!str.equals("%s") || j != 1 || (obj = objArr[0]) == null || !(obj instanceof String)) {
            if (i == 1) {
                Log.e(stringBuffer, format(str, objArr, j));
            } else if (i != 2) {
                Log.i(stringBuffer, format(str, objArr, j));
            } else {
                Log.w(stringBuffer, format(str, objArr, j));
            }
        } else if (i == 1) {
            Log.e(stringBuffer, (String) obj);
        } else if (i != 2) {
            Log.i(stringBuffer, (String) obj);
        } else {
            Log.w(stringBuffer, (String) obj);
        }
    }

    public static void printStackTrace(int i, Throwable th) {
    }

    public static boolean setUseHomeBrewingFromat(boolean z) {
        boolean z2 = bUseHomeBrewingFromat;
        bUseHomeBrewingFromat = z;
        return z2;
    }

    static String toHexString(int i, int i2) {
        char[] cArr = {'0', '0', '0', '0', '0', '0', '0'};
        String hexString = Integer.toHexString(i);
        int length = i2 - hexString.length();
        if (length <= 0) {
            return hexString;
        }
        if (length == 1) {
            return '0' + hexString;
        }
        if (length <= 7) {
            return String.valueOf(cArr, 0, length) + hexString;
        }
        String str = "";
        for (int i3 = 0; i3 < length; i3++) {
            str = str + '0';
        }
        return str + hexString;
    }

    public static void log(int i, String str, Object obj) {
        sObjs[0] = obj;
    }

    public static void log(int i, String str, Object obj, Object obj2) {
        sObjs[0] = obj;
        sObjs[1] = obj2;
    }

    public static void log(int i, String str, Object obj, Object obj2, Object obj3) {
        sObjs[0] = obj;
        sObjs[1] = obj2;
        sObjs[2] = obj3;
    }

    public static void log(int i, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        sObjs[0] = obj;
        sObjs[1] = obj2;
        sObjs[2] = obj3;
        sObjs[3] = obj4;
    }

    public static void log(int i, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        sObjs[0] = obj;
        sObjs[1] = obj2;
        sObjs[2] = obj3;
        sObjs[3] = obj4;
        sObjs[4] = obj5;
    }

    public static void log(int i, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        sObjs[0] = obj;
        sObjs[1] = obj2;
        sObjs[2] = obj3;
        sObjs[3] = obj4;
        sObjs[4] = obj5;
        sObjs[5] = obj6;
    }

    public static void log(int i, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        sObjs[0] = obj;
        sObjs[1] = obj2;
        sObjs[2] = obj3;
        sObjs[3] = obj4;
        sObjs[4] = obj5;
        sObjs[5] = obj6;
        sObjs[6] = obj7;
    }

    public static void log(int i, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        sObjs[0] = obj;
        sObjs[1] = obj2;
        sObjs[2] = obj3;
        sObjs[3] = obj4;
        sObjs[4] = obj5;
        sObjs[5] = obj6;
        sObjs[6] = obj7;
        sObjs[7] = obj8;
    }
}
