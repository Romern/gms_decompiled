package com.felicanetworks.cmnlib.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CommonUtil {
    private static final String HEX_CHARS = "0123456789ABCDEF";

    public static String binToHexString(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(length + length);
        for (byte b : bArr) {
            stringBuffer.append(toHexString(b));
        }
        return stringBuffer.toString();
    }

    public static byte[] changeEndian(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return bArr2;
            }
            bArr2[(length - i) - 1] = bArr[i];
            i++;
        }
    }

    public static String[] getAppInfo(Context context, int i) {
        PackageManager packageManager = context.getPackageManager();
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
            if (i == runningServiceInfo.pid) {
                String packageName = runningServiceInfo.service.getPackageName();
                if (linkedHashMap.get(packageName) == null) {
                    linkedHashMap.put(packageName, packageName);
                }
            }
        }
        String[] strArr = (String[]) linkedHashMap.values().toArray(new String[linkedHashMap.size()]);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString());
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        return strArr2;
    }

    public static String getClassShortName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : str;
    }

    public static Date getSystemTime() {
        return new Date();
    }

    public static int[] hexStringListToIntList(String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = toInt(hexStringToBin(strArr[i]), false);
        }
        return iArr;
    }

    public static byte[] hexStringToBin(String str) {
        if (str == null || (str.length() & 1) == 1) {
            throw new IllegalArgumentException(str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            char charAt = str.charAt(i2);
            char charAt2 = str.charAt(i2 + 1);
            int indexOf = HEX_CHARS.indexOf(charAt);
            int indexOf2 = HEX_CHARS.indexOf(charAt2);
            if (indexOf < 0 || indexOf2 < 0) {
                throw new IllegalArgumentException("Invalid hex char." + str);
            }
            bArr[i] = (byte) (indexOf2 | (indexOf << 4));
        }
        return bArr;
    }

    public static String intToDecString(int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(String.format("%0" + i2 + "d", Integer.valueOf(i)));
        return stringBuffer.substring(stringBuffer.length() - i2, stringBuffer.length());
    }

    public static String intToHexString(int i, int i2) {
        if (i2 < 8) {
            int i3 = (8 - i2) * 4;
            i = (i << i3) >>> i3;
        }
        Locale locale = Locale.US;
        return String.format(locale, "%0" + i2 + "X", Integer.valueOf(i));
    }

    public static String paddingZero(String str, int i) {
        if (str.length() >= i) {
            return str;
        }
        int length = i - str.length();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append("0");
        }
        return ((Object) stringBuffer) + str;
    }

    public static String toHexString(byte b) {
        return new String(new char[]{HEX_CHARS.charAt((b >> 4) & 15), HEX_CHARS.charAt(b & 15)});
    }

    public static int toInt(byte[] bArr, boolean z) {
        int length = bArr.length;
        if (length <= 4) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                i += ((z ? bArr[(length - i3) - 1] : bArr[i3]) & 255) << i2;
                i2 += 8;
            }
            return i;
        }
        throw new ArrayIndexOutOfBoundsException("size over." + length);
    }

    public static String unescape(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                int i3 = i2 + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'u') {
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < 4) {
                        int i6 = i3 + 1;
                        char charAt3 = str.charAt(i3);
                        switch (charAt3) {
                            case '0':
                            case FelicaException.TYPE_CURRENTLY_ACTIVATING /*49*/:
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case FelicaException.TYPE_ACTIVATE_FAILED /*56*/:
                            case '9':
                                i5 = ((i5 << 4) + charAt3) - 48;
                                break;
                            default:
                                switch (charAt3) {
                                    case KeyInformation.AES128_DES56 /*65*/:
                                    case 'B':
                                    case KeyInformation.AES128_DES112 /*67*/:
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                        i5 = (((i5 << 4) + 10) + charAt3) - 65;
                                        break;
                                    default:
                                        switch (charAt3) {
                                            default:
                                                throw new IllegalArgumentException("Malformed \\uxxxx encoding.");
                                            case 'a':
                                            case 'b':
                                            case 'c':
                                            case 'd':
                                            case 'e':
                                            case 'f':
                                                i5 = (((i5 << 4) + 10) + charAt3) - 97;
                                                break;
                                        }
                                }
                        }
                        i4++;
                        i3 = i6;
                    }
                    i2 = i3;
                    charAt = (char) i5;
                } else if (charAt2 == '\\') {
                    i2 = i3;
                    charAt = '\\';
                } else if (charAt2 == 'n') {
                    i2 = i3;
                    charAt = 10;
                } else if (charAt2 == 'r') {
                    i2 = i3;
                    charAt = 13;
                } else if (charAt2 != 't') {
                    stringBuffer.append('\\');
                    i2 = i3;
                    charAt = charAt2;
                } else {
                    i2 = i3;
                    charAt = 9;
                }
            }
            stringBuffer.append(charAt);
            i = i2;
        }
        return stringBuffer.toString();
    }
}
