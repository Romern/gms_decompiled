package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: cjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cjb implements cja {
    /* renamed from: a */
    public final Class mo3934a() {
        return InputStream.class;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3935a(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3936a(Object obj) {
        ((InputStream) obj).close();
    }
}
