package p000;

import android.content.Context;
import java.io.File;

/* renamed from: anff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum anff {
    REGISTRATION;
    

    /* renamed from: b */
    private final String f76765b;

    private anff() {
        this.f76765b = r3;
    }

    /* renamed from: a */
    public final File mo41772a(Context context) {
        return new File(new File(context.getFilesDir(), "phenotype/flat_file/"), this.f76765b);
    }
}
