package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.Formatter;

/* renamed from: aodo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aodo extends shd {

    /* renamed from: a */
    public final shj f78225a;

    public aodo(shj shj) {
        this.f78225a = shj;
        shj.f44447g = 6400;
    }

    /* renamed from: a */
    public final void mo42554a(ClientContext clientContext, String str) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("applications/%1$s/moments", shd.m35267a(str));
        this.f78225a.mo25539a(clientContext, 3, sb.toString(), null);
    }
}
