package p000;

import java.io.File;

/* renamed from: bemw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bemw implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bend f111844a;

    public bemw(bend bend) {
        this.f111844a = bend;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        String str = (String) obj;
        bend bend = this.f111844a;
        String str2 = bend.f111855i;
        new File((str2 == null ? bend.f111848b.getDatabasePath(str) : new File(str2, str)).getPath().concat(".bak")).delete();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
    }
}
