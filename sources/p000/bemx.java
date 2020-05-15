package p000;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: bemx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bemx implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bend f111845a;

    public bemx(bend bend) {
        this.f111845a = bend;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        if (!new File(((SQLiteDatabase) obj).getPath()).exists()) {
            synchronized (this.f111845a.f111857k) {
                this.f111845a.mo60809c();
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
    }
}
