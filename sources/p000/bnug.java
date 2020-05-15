package p000;

import java.util.logging.Level;

/* renamed from: bnug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnug extends bntd {

    /* renamed from: a */
    private final bnue f132158a;

    /* renamed from: b */
    private final bnui f132159b;

    /* renamed from: c */
    private final bnuf f132160c;

    /* renamed from: d */
    private final bntc f132161d;

    public bnug() {
        bnue bnue = (bnue) bnvb.m110482a("flogger.backend_factory", bnue.class);
        this.f132158a = bnue == null ? bnuj.f132163a : bnue;
        bnui bnui = (bnui) bnvb.m110482a("flogger.logging_context", bnui.class);
        this.f132159b = bnui == null ? bnuh.f132162a : bnui;
        bnuf bnuf = (bnuf) bnvb.m110482a("flogger.clock", bnuf.class);
        this.f132160c = bnuf == null ? bnul.f132165a : bnuf;
        this.f132161d = bnuk.f132164a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bnsx mo68474b(String str) {
        return this.f132158a.mo68491a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bntc mo68475b() {
        return this.f132161d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bntj mo68477d() {
        return this.f132159b.mo68493a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo68478f() {
        return this.f132160c.mo68492a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo68479h() {
        String name = getClass().getName();
        String valueOf = String.valueOf(this.f132158a);
        String valueOf2 = String.valueOf(this.f132160c);
        String valueOf3 = String.valueOf(this.f132159b);
        String valueOf4 = String.valueOf(this.f132161d);
        int length = String.valueOf(name).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Platform: ");
        sb.append(name);
        sb.append("\nBackendFactory: ");
        sb.append(valueOf);
        sb.append("\nClock: ");
        sb.append(valueOf2);
        sb.append("\nLoggingContext: ");
        sb.append(valueOf3);
        sb.append("\nLogCallerFinder: ");
        sb.append(valueOf4);
        sb.append("\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo68476b(String str, Level level, boolean z) {
        return this.f132159b.mo68494b();
    }
}
