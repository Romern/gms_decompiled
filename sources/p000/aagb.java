package p000;

import android.content.Context;
import com.google.ads.afma.C0149b;
import java.util.concurrent.Executor;

/* renamed from: aagb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aagb {

    /* renamed from: a */
    public static volatile int f28052a = 1;

    /* renamed from: b */
    private final Context f28053b;

    /* renamed from: c */
    private final Executor f28054c;

    /* renamed from: d */
    private final aucb f28055d;

    public aagb(Context context, Executor executor, aucb aucb) {
        this.f28053b = context;
        this.f28054c = executor;
        this.f28055d = aucb;
    }

    /* renamed from: a */
    public final void mo16842a(int i, long j) {
        mo16844a(i, j, null, null, null);
    }

    /* renamed from: a */
    public final void mo16843a(int i, long j, Exception exc) {
        mo16844a(i, j, exc, null, null);
    }

    /* renamed from: a */
    public final void mo16844a(int i, long j, Exception exc, String str, String str2) {
        bxvd da = C0149b.f7489i.mo74144da();
        String packageName = this.f28053b.getPackageName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0149b bVar = (C0149b) da.f164949b;
        packageName.getClass();
        int i2 = bVar.f7491a | 1;
        bVar.f7491a = i2;
        bVar.f7492b = packageName;
        bVar.f7491a = i2 | 2;
        bVar.f7493c = j;
        int i3 = f28052a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0149b bVar2 = (C0149b) da.f164949b;
        int i4 = i3 - 1;
        if (i3 != 0) {
            bVar2.f7498h = i4;
            bVar2.f7491a |= 2048;
            if (exc != null) {
                String d = bmzo.m108692d(exc);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                C0149b bVar3 = (C0149b) da.f164949b;
                d.getClass();
                bVar3.f7491a |= 4;
                bVar3.f7494d = d;
                String name = exc.getClass().getName();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                C0149b bVar4 = (C0149b) da.f164949b;
                name.getClass();
                bVar4.f7491a |= 8;
                bVar4.f7495e = name;
            }
            if (str2 != null) {
                C0149b bVar5 = (C0149b) da.f164949b;
                str2.getClass();
                bVar5.f7491a |= 16;
                bVar5.f7496f = str2;
            }
            if (str != null) {
                C0149b bVar6 = (C0149b) da.f164949b;
                str.getClass();
                bVar6.f7491a |= 1024;
                bVar6.f7497g = str;
            }
            this.f28055d.mo50365a(this.f28054c, new aaga(da, i));
            return;
        }
        throw null;
    }
}
