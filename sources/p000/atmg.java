package p000;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: atmg */
final /* synthetic */ class atmg implements Callable {

    /* renamed from: a */
    private final Context f90481a;

    /* renamed from: b */
    private final String f90482b;

    /* renamed from: c */
    private final File f90483c;

    public atmg(Context context, String str, File file) {
        this.f90481a = context;
        this.f90482b = str;
        this.f90483c = file;
    }

    public final Object call() {
        return atmk.m76180a(this.f90481a, this.f90482b, this.f90483c);
    }
}
