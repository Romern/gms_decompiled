package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.chimera.container.FileApkIntentOperation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qlp implements dfo, emy {

    /* renamed from: b */
    private static volatile qlp f41663b = null;

    /* renamed from: a */
    public final List f41664a = new ArrayList();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgd.a(dfo, boolean):void
     arg types: [qlp, int]
     candidates:
      dgd.a(android.content.Context, int):void
      dgd.a(dfo, boolean):void */
    /* renamed from: a */
    public static qlp m32393a() {
        qlp qlp = f41663b;
        if (qlp == null) {
            synchronized (qlp.class) {
                qlp = f41663b;
                if (qlp == null) {
                    qlp = new qlp();
                    dgd.m8384a((dfo) qlp, true);
                    f41663b = qlp;
                }
            }
        }
        return qlp;
    }

    /* renamed from: b */
    public final void mo10311b(Context context, int i, String str) {
        mo8861a(context, i != 1 ? i != 2 ? i != 3 ? 77 : 76 : 75 : 74, str);
    }

    /* renamed from: a */
    public final void mo8860a(Context context, int i) {
        mo24090a(context, i, null, null);
    }

    /* renamed from: a */
    public final void mo8861a(Context context, int i, String str) {
        mo24090a(context, i, str, null);
    }

    /* renamed from: a */
    public final void mo24090a(Context context, int i, String str, Iterable iterable) {
        int i2 = i - 1;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("[");
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        Log.i("ChmraDebugLogger", sb.toString());
        bxvd da = bpvf.f139321t.mo74144da();
        bpuc bpuc = (bpuc) bpuf.f139232f.mo74144da();
        if (bpuc.f164950c) {
            bpuc.mo74035c();
            bpuc.f164950c = false;
        }
        bpuf bpuf = (bpuf) bpuc.f164949b;
        bpuf.f139235b = i2;
        bpuf.f139234a |= 1;
        if (str != null) {
            if (str.length() > 128) {
                str = str.substring(0, 128);
            }
            if (bpuc.f164950c) {
                bpuc.mo74035c();
                bpuc.f164950c = false;
            }
            bpuf bpuf2 = (bpuf) bpuc.f164949b;
            str.getClass();
            bpuf2.f139234a |= 2;
            bpuf2.f139236c = str;
        }
        if (iterable != null) {
            bpuf bpuf3 = (bpuf) bpuc.f164949b;
            if (!bpuf3.f139237d.mo73666a()) {
                bpuf3.f139237d = GeneratedMessageLite.m124021a(bpuf3.f139237d);
            }
            bxsy.m123078a(iterable, bpuf3.f139237d);
        }
        if (cdjl.m133600f()) {
            synchronized (this.f41664a) {
                int size = this.f41664a.size();
                if (size > 0) {
                    if (size > 9) {
                        int i3 = size - 9;
                        for (int i4 = i3; i4 < size; i4++) {
                            bpuc.mo68986a((String) this.f41664a.get(i4));
                        }
                        StringBuilder sb2 = new StringBuilder(21);
                        sb2.append("truncated ");
                        sb2.append(i3);
                        bpuc.mo68986a(sb2.toString());
                    } else {
                        List list = this.f41664a;
                        if (bpuc.f164950c) {
                            bpuc.mo74035c();
                            bpuc.f164950c = false;
                        }
                        bpuf bpuf4 = (bpuf) bpuc.f164949b;
                        bpuf4.mo68987a();
                        bxsy.m123078a(list, bpuf4.f139238e);
                    }
                }
            }
        }
        bpuf bpuf5 = (bpuf) bpuc.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvf bpvf = (bpvf) da.f164949b;
        bpuf5.getClass();
        bpvf.f139331i = bpuf5;
        bpvf.f139323a |= 16;
        FileApkIntentOperation.m22393a(context, 20, ((bpvf) da.mo74062i()).serializeToBytes());
    }
}
