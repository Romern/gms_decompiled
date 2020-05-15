package p000;

import android.content.Context;
import java.io.IOException;

/* renamed from: qei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qei implements qeo {

    /* renamed from: a */
    final /* synthetic */ int f41074a;

    /* renamed from: b */
    private Object f41075b = null;

    public qei(int i) {
        this.f41074a = i;
    }

    /* renamed from: a */
    public final void mo23984a(Object obj) {
        if (this.f41075b == null) {
            this.f41075b = qeq.m32021a(obj, this.f41074a);
        }
    }

    /* renamed from: a */
    public final void mo23985a(StringBuilder sb, Context context) {
        try {
            Object obj = this.f41075b;
            if (obj != null) {
                sqy.m36056a(obj.toString(), sb);
            }
        } catch (IOException e) {
            qeq.f41085a.mo25419f("IOException writing StringBuilder", e, new Object[0]);
        }
    }
}
