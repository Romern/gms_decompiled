package p000;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: qnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qnv extends dez {

    /* renamed from: h */
    private static qnv f41803h;

    /* renamed from: e */
    public final boolean f41804e;

    /* renamed from: f */
    public final UserManager f41805f;

    /* renamed from: g */
    public long f41806g = 0;

    private qnv(Context context) {
        super(context, "shared_module_provider.pb");
        int i = Build.VERSION.SDK_INT;
        this.f41805f = (UserManager) context.getSystemService("user");
        this.f41804e = dia.m8551a(context);
        this.f41806g = dia.m8552b(context);
    }

    /* renamed from: a */
    public static qnv m32530a(Context context) {
        if (f41803h == null) {
            synchronized (qnv.class) {
                if (f41803h == null) {
                    f41803h = new qnv(context);
                }
            }
        }
        return f41803h;
    }

    /* renamed from: d */
    public final qnz mo24142d() {
        FileInputStream fileInputStream;
        File a = dez.m8264a(this.f12991b, "shared_module_provider.pb");
        if (!a.exists()) {
            return qnz.f41820b;
        }
        try {
            fileInputStream = new FileInputStream(a);
            qnz qnz = (qnz) GeneratedMessageLite.m124011a(qnz.f41820b, fileInputStream, bxus.m123743b());
            fileInputStream.close();
            return qnz;
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("SharedModuleManager", valueOf.length() == 0 ? new String("Error reading user update request map: ") : "Error reading user update request map: ".concat(valueOf));
            return qnz.f41820b;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final qnx mo24141a(qnx qnx, long j) {
        qnz qnz;
        int i = Build.VERSION.SDK_INT;
        synchronized (this) {
            qnz d = mo24142d();
            if (this.f41805f != null) {
                bxvd da = qnz.f41820b.mo74144da();
                for (Map.Entry entry : Collections.unmodifiableMap(d.f41822a).entrySet()) {
                    if (this.f41805f.getUserForSerialNumber(((Long) entry.getKey()).longValue()) == null) {
                        long j2 = this.f41806g;
                        StringBuilder sb = new StringBuilder(53);
                        sb.append("Removing record for deleted user ");
                        sb.append(j2);
                        Log.i("SharedModuleManager", sb.toString());
                    } else if (entry.getValue() != null) {
                        da.mo73970a(this.f41806g, (qnx) entry.getValue());
                    }
                }
                d = (qnz) da.mo74062i();
            }
            bxvd bxvd = (bxvd) d.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) d);
            bxvd.mo73970a(j, qnx);
            qnz = (qnz) bxvd.mo74062i();
            dft.m8316a(qnz.serializeToBytes(), dez.m8264a(this.f12991b, "shared_module_provider.pb.tmp"), dez.m8264a(this.f12991b, "shared_module_provider.pb"), false);
        }
        C1225nr nrVar = new C1225nr();
        C1225nr nrVar2 = new C1225nr();
        C1225nr nrVar3 = new C1225nr();
        for (Map.Entry entry2 : Collections.unmodifiableMap(qnz.f41822a).entrySet()) {
            if (entry2.getValue() != null) {
                nrVar.addAll(((qnx) entry2.getValue()).f41816a);
                nrVar2.addAll(((qnx) entry2.getValue()).f41817b);
                nrVar3.addAll(((qnx) entry2.getValue()).f41818c);
            }
        }
        bxvd da2 = qnx.f41814d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        qnx qnx2 = (qnx) da2.f164949b;
        qnx2.mo24145a();
        bxsy.m123078a(nrVar, qnx2.f41816a);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        qnx qnx3 = (qnx) da2.f164949b;
        qnx3.mo24146b();
        bxsy.m123078a(nrVar2, qnx3.f41817b);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        qnx qnx4 = (qnx) da2.f164949b;
        qnx4.mo24147c();
        bxsy.m123078a(nrVar3, qnx4.f41818c);
        return (qnx) da2.mo74062i();
    }
}
