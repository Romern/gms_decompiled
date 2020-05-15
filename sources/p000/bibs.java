package p000;

import android.content.Context;
import android.os.Binder;

/* renamed from: bibs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibs extends shl {

    /* renamed from: a */
    private static final String f120159a = cghh.f186930a.mo6606a().mo83785b();

    public bibs(Context context, String str, String str2, String str3) {
        super(context, f120159a, 443, Binder.getCallingUid(), 10240);
        mo25556a("X-Goog-Api-Key", str);
        mo25556a("X-Android-Package", str2);
        mo25556a("X-Android-Cert", str3);
    }
}
