package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: aahr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aahr {

    /* renamed from: a */
    public final Context f28148a;

    /* renamed from: b */
    private final aagb f28149b;

    public aahr(Context context, aagb aagb) {
        this.f28148a = context;
        this.f28149b = aagb;
    }

    /* renamed from: b */
    private final String m21264b() {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String a = bmyy.OS_ARCH.mo66926a();
        if (!TextUtils.isEmpty(a) && hashSet.contains(a)) {
            return a;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (NoSuchFieldException e) {
            aagb aagb = this.f28149b;
            if (aagb != null) {
                aagb.mo16843a(2024, 0, e);
            }
        } catch (IllegalAccessException e2) {
            aagb aagb2 = this.f28149b;
            if (aagb2 != null) {
                aagb2.mo16843a(2024, 0, e2);
            }
        }
        if (Build.CPU_ABI != null) {
            return Build.CPU_ABI;
        }
        return Build.CPU_ABI2;
    }

    /* renamed from: a */
    public final dcg mo16874a() {
        String b = m21264b();
        if (TextUtils.isEmpty(b)) {
            mo16875a(null);
            return dcg.UNSUPPORTED;
        } else if (b.equalsIgnoreCase("i686") || b.equalsIgnoreCase("x86")) {
            return dcg.X86;
        } else {
            if (b.equalsIgnoreCase("x86_64")) {
                return dcg.X86_64;
            }
            if (b.equalsIgnoreCase("arm64-v8a")) {
                return dcg.ARM64;
            }
            if (b.equalsIgnoreCase("armeabi-v7a") || b.equalsIgnoreCase("armv71")) {
                return dcg.ARM7;
            }
            mo16875a(null);
            return dcg.UNSUPPORTED;
        }
    }

    /* renamed from: a */
    public final void mo16875a(byte[] bArr) {
        if (this.f28149b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("os.arch:");
            sb.append(bmyy.OS_ARCH.mo66926a());
            sb.append(";");
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null) {
                    sb.append("supported_abis:");
                    sb.append(Arrays.toString(strArr));
                    sb.append(";");
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
            }
            sb.append("CPU_ABI:");
            sb.append(Build.CPU_ABI);
            sb.append(";CPU_ABI2:");
            sb.append(Build.CPU_ABI2);
            sb.append(";");
            if (bArr != null) {
                sb.append("ELF:");
                sb.append(Arrays.toString(bArr));
                sb.append(";");
            }
            this.f28149b.mo16844a(4007, 0, null, null, sb.toString());
        }
    }
}
