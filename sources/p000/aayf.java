package p000;

import java.io.File;

/* renamed from: aayf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aayf extends soa {

    /* renamed from: a */
    final /* synthetic */ File f56818a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aayf(File file) {
        super(10);
        this.f56818a = file;
    }

    public final void run() {
        if (this.f56818a.exists() && this.f56818a.canWrite()) {
            this.f56818a.delete();
        }
    }
}
