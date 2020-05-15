package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.felicanetworks.sdu.ErrorInfo;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: vwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwm {

    /* renamed from: d */
    static Class f50140d = null;

    /* renamed from: a */
    final vws f50141a;

    /* renamed from: b */
    final Context f50142b;

    /* renamed from: c */
    Object f50143c;

    public vwm(vws vws, Context context) {
        this.f50141a = vws;
        this.f50142b = context;
    }

    /* renamed from: a */
    private static synchronized Class m41493a(vwm vwm, String str) {
        Class cls;
        vwm vwm2 = vwm;
        synchronized (vwm.class) {
            if (f50140d == null) {
                int[] iArr = {225, 207, 192, 207, 154, 190, 195, 192, 182, 193, 191, 203, 154, 192, 102, 192, 202, 154, 190, 218, 195, 192, 216, 206, 182, 193, 191, 196, 208, 196, 206, 219, 190, 222, 181, 183, 149, 188};
                int[] iArr2 = {205, 208, 221, 197, 68, 127, 202, 102, 121, 212, 206, 214, 214, 137, 203, 221, 121, 214, 102, 71, 207, 228, 219, 214, 222, 45, 121, 127, 115, 215, 71, 228, 191, 205, 212, 192, 192, 195, 149, 182};
                int[] iArr3 = {197, 200, 68, 127};
                int[] iArr4 = new int[ErrorInfo.TYPE_SDU_MEMORY_FULL];
                iArr4[0] = 203;
                iArr4[1] = 188;
                iArr4[2] = 190;
                iArr4[3] = 38;
                iArr4[4] = 210;
                iArr4[5] = 181;
                iArr4[6] = 205;
                iArr4[7] = 224;
                iArr4[8] = 227;
                iArr4[9] = 202;
                iArr4[10] = 182;
                iArr4[11] = 190;
                iArr4[12] = 190;
                iArr4[13] = 226;
                iArr4[14] = 182;
                iArr4[15] = 202;
                iArr4[16] = 214;
                iArr4[17] = 117;
                iArr4[18] = 183;
                iArr4[19] = 200;
                iArr4[20] = 200;
                iArr4[21] = 181;
                iArr4[22] = 207;
                iArr4[23] = 188;
                iArr4[24] = 188;
                iArr4[25] = 226;
                iArr4[26] = 213;
                iArr4[27] = 188;
                iArr4[28] = 181;
                iArr4[29] = 191;
                iArr4[30] = 133;
                iArr4[31] = 193;
                iArr4[32] = 196;
                iArr4[33] = 223;
                iArr4[34] = 215;
                iArr4[35] = 183;
                iArr4[36] = 181;
                iArr4[37] = 192;
                iArr4[38] = 217;
                iArr4[39] = 154;
                iArr4[40] = 190;
                iArr4[41] = 214;
                iArr4[42] = 195;
                iArr4[43] = 192;
                iArr4[44] = 200;
                iArr4[45] = 210;
                iArr4[46] = 182;
                iArr4[47] = 210;
                iArr4[48] = 202;
                iArr4[49] = 193;
                iArr4[50] = 191;
                iArr4[51] = 202;
                iArr4[52] = 226;
                iArr4[53] = 154;
                iArr4[54] = 227;
                iArr4[55] = 192;
                iArr4[56] = 208;
                iArr4[57] = 226;
                iArr4[58] = 203;
                iArr4[59] = 221;
                iArr4[60] = 181;
                iArr4[61] = 192;
                iArr4[62] = 217;
                iArr4[63] = 154;
                iArr4[64] = 190;
                iArr4[65] = 218;
                iArr4[66] = 206;
                iArr4[67] = 210;
                iArr4[68] = 195;
                iArr4[69] = 228;
                iArr4[70] = 218;
                iArr4[71] = 200;
                iArr4[72] = 192;
                iArr4[73] = 209;
                iArr4[74] = 201;
                iArr4[75] = 182;
                iArr4[76] = 202;
                iArr4[77] = 214;
                iArr4[78] = 193;
                iArr4[79] = 191;
                iArr4[80] = 196;
                iArr4[81] = 220;
                iArr4[82] = 219;
                iArr4[83] = 196;
                iArr4[84] = 190;
                iArr4[85] = 181;
                iArr4[86] = 20;
                iArr4[87] = 154;
                iArr4[88] = 190;
                iArr4[89] = 195;
                iArr4[90] = 206;
                iArr4[91] = 223;
                iArr4[92] = 192;
                iArr4[93] = 217;
                iArr4[94] = 225;
                iArr4[95] = 219;
                iArr4[96] = 204;
                iArr4[97] = 182;
                iArr4[98] = 207;
                iArr4[99] = 193;
                iArr4[100] = 191;
                iArr4[101] = 196;
                iArr4[102] = 196;
                iArr4[103] = 209;
                iArr4[104] = 190;
                File dir = vwm2.f50142b.getDir(vwm2.f50141a.mo28917a(new int[]{213, 227, 37, 133}), 0);
                String absolutePath = dir.getAbsolutePath();
                String valueOf = String.valueOf(dir.getAbsolutePath());
                String valueOf2 = String.valueOf(vwm2.f50141a.mo28917a(new int[]{222, 219, 200, 102, 216, 200, 37, 181, 191, 206, 229, 145, 214, 201, 217, 165}));
                String str2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                String a = vwm2.f50141a.mo28917a(iArr3);
                String a2 = vwm2.f50141a.mo28917a(iArr2);
                String a3 = vwm2.f50141a.mo28917a(iArr);
                try {
                    byte[] bArr = new byte[16];
                    byte[] bytes = str.getBytes();
                    int i = 0;
                    while (true) {
                        if (i < 16) {
                            if (i >= bytes.length) {
                                break;
                            }
                            bArr[i] = bytes[i];
                            i++;
                        } else {
                            break;
                        }
                    }
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, a);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{1, 33, 13, 28, 87, 122, 25, 5, 4, 30, 22, 101, 5, 50, 12, 0});
                    AssetFileDescriptor openFd = vwm2.f50142b.getAssets().openFd(a3);
                    openFd.close();
                    byte[] bArr2 = new byte[((int) openFd.getLength())];
                    InputStream open = vwm2.f50142b.getAssets().open(a3);
                    open.read(bArr2);
                    open.close();
                    Cipher f = spn.m35886f(a2);
                    if (f != null) {
                        f.init(2, secretKeySpec, ivParameterSpec);
                        byte[] doFinal = f.doFinal(bArr2);
                        FileOutputStream fileOutputStream = new FileOutputStream(str2);
                        fileOutputStream.write(doFinal);
                        fileOutputStream.close();
                    }
                } catch (Exception e) {
                }
                Class loadClass = new DexClassLoader(str2, absolutePath, "", vwm.getClass().getClassLoader()).loadClass(vwm2.f50141a.mo28917a(iArr4));
                srj.m36120a(dir);
                f50140d = loadClass;
            }
            cls = f50140d;
        }
        return cls;
    }

    /* renamed from: a */
    public final vwl mo28912a(String str, byte[] bArr) {
        byte[] bArr2 = bArr;
        vwl vwl = new vwl();
        try {
            Class a = m41493a(this, str);
            float[] fArr = {0.35502917f, 0.47196686f, 0.24689609f, 0.66850024f, 0.7746259f, 0.5967446f, 0.06270856f, 0.19201201f, 0.35090452f, 0.5573558f, 0.470259f, 0.9866341f};
            if (bArr2 != null && bArr2.length >= 48) {
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                for (int i = 0; i < 12; i++) {
                    int abs = Math.abs(order.getInt());
                    if (abs < 0) {
                        abs = 0;
                    }
                    fArr[i] = ((float) abs) / 2.14748365E9f;
                }
            }
            this.f50143c = a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Method method = a.getMethod(this.f50141a.mo28917a(new int[]{182, 183, 186, 144, 145, 193}), new Class[0]);
            Method method2 = a.getMethod(this.f50141a.mo28917a(new int[]{154, 214, 214, 183, 209, 149, 206, 226, 211, 216, 192, 208, 210, 183, 209, 154}), float[].class);
            Method method3 = a.getMethod(this.f50141a.mo28917a(new int[]{229, 182, 214, 206, 183, 186, 4, 191, 196, 211, 208, 171, 53}), new Class[0]);
            Method method4 = a.getMethod(this.f50141a.mo28917a(new int[]{222, 182, 219, 224, 214, 207, 210, 183, 202, 200, 210, 186, 225, 4, 191, 205, 196, 204, 216, 171, 212, 199}), new Class[0]);
            synchronized (vwm.class) {
                method2.invoke(this.f50143c, fArr);
            }
            vwl.f50137a = (String) method.invoke(this.f50143c, new Object[0]);
            vwl.f50138b = String.valueOf(method3.invoke(this.f50143c, new Object[0]));
            vwl.f50139c = String.valueOf(method4.invoke(this.f50143c, new Object[0]));
        } catch (Exception e) {
        }
        return vwl;
    }
}
