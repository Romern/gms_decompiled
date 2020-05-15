package p000;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: iq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1087iq {
    /* renamed from: a */
    public static C1087iq m15879a(C0013ak akVar) {
        return new C1092iv(akVar, ((C0062bt) akVar).getViewModelStore());
    }

    /* renamed from: a */
    public abstract C1140ko mo13248a(int i, Bundle bundle, C1085ip ipVar);

    /* renamed from: a */
    public abstract void mo13249a(int i);

    @Deprecated
    /* renamed from: a */
    public abstract void mo13250a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public boolean mo13251a() {
        throw null;
    }

    /* renamed from: b */
    public abstract C1140ko mo13252b(int i);

    /* renamed from: b */
    public abstract C1140ko mo13253b(int i, Bundle bundle, C1085ip ipVar);
}
