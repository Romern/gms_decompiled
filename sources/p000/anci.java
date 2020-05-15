package p000;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: anci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anci {

    /* renamed from: a */
    public final ParcelFileDescriptor f76623a;

    /* renamed from: b */
    public final ParcelFileDescriptor f76624b;

    private anci(File file) {
        this.f76623a = ParcelFileDescriptor.open(file, 268435456);
        try {
            this.f76624b = ParcelFileDescriptor.open(file, 268435456);
        } catch (Exception e) {
            srz.m36170a(this.f76623a);
            throw e;
        }
    }

    /* renamed from: a */
    public static anci m63989a(File file) {
        return new anci(file);
    }
}
