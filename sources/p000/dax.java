package p000;

import android.os.ConditionVariable;
import com.google.ads.afma.C0149b;
import com.google.android.gms.ads.internal.clearcut.C0330e;
import com.google.android.gms.ads.internal.clearcut.C0331f;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* renamed from: dax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dax {

    /* renamed from: b */
    public static final ConditionVariable f12715b = new ConditionVariable();

    /* renamed from: c */
    protected static volatile C0331f f12716c = null;

    /* renamed from: e */
    public static volatile Random f12717e = null;

    /* renamed from: a */
    public final dca f12718a;

    /* renamed from: d */
    protected volatile Boolean f12719d;

    public dax(dca dca) {
        this.f12718a = dca;
        dca.f12766b.execute(new daw(this));
    }

    /* renamed from: a */
    public final void mo8479a(int i, int i2, long j, String str, Exception exc) {
        try {
            f12715b.block();
            if (this.f12719d.booleanValue() && f12716c != null) {
                bxvd da = C0149b.f7489i.mo74144da();
                String packageName = this.f12718a.f12765a.getPackageName();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                C0149b bVar = (C0149b) da.f164949b;
                packageName.getClass();
                int i3 = bVar.f7491a | 1;
                bVar.f7491a = i3;
                bVar.f7492b = packageName;
                int i4 = i3 | 2;
                bVar.f7491a = i4;
                bVar.f7493c = j;
                if (str != null) {
                    str.getClass();
                    bVar.f7491a = i4 | 16;
                    bVar.f7496f = str;
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    bqye.m113760a(exc, new PrintWriter(stringWriter));
                    String stringWriter2 = stringWriter.toString();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    C0149b bVar2 = (C0149b) da.f164949b;
                    stringWriter2.getClass();
                    bVar2.f7491a |= 4;
                    bVar2.f7494d = stringWriter2;
                    String name = exc.getClass().getName();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    C0149b bVar3 = (C0149b) da.f164949b;
                    name.getClass();
                    bVar3.f7491a |= 8;
                    bVar3.f7495e = name;
                }
                C0330e a = f12716c.mo6570a(((C0149b) da.mo74062i()).mo73642k());
                a.f8097b = i;
                if (i2 != -1) {
                    a.f8096a = i2;
                }
                a.mo6569a();
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public final void mo8480a(int i, long j, String str) {
        mo8479a(i, -1, j, str, null);
    }
}
