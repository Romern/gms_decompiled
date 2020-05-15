package p000;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ancp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ancp {

    /* renamed from: a */
    public static final ancp f76639a = new ancp();

    /* renamed from: b */
    public static final AtomicInteger f76640b = new AtomicInteger();

    /* renamed from: a */
    public static void m64027a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            int i = Build.VERSION.SDK_INT;
            int fd = parcelFileDescriptor.getFd();
            StringBuilder sb = new StringBuilder(11);
            sb.append(fd);
            sb.toString();
        }
    }

    /* renamed from: a */
    public final anco[] mo41706a() {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        anco[] ancoArr = new anco[2];
        for (int i = 0; i < 2; i++) {
            ancoArr[i] = new anco(createPipe[i]);
        }
        return ancoArr;
    }
}
