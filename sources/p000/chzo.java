package p000;

import java.net.URI;

/* renamed from: chzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chzo extends chuf {
    /* renamed from: a */
    public final String mo85666a() {
        return "dns";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo85679b() {
        return true;
    }

    /* renamed from: c */
    public final int mo85680c() {
        return 5;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ chue mo85665a(URI uri, chtx chtx) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        bmxy.m108582a(path, "targetPath");
        bmxy.m108597a(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String substring = path.substring(1);
        uri.getAuthority();
        return new chzn(substring, chtx, ciag.f189655l, bmza.m108656a(), chur.m149600a(getClass().getClassLoader()));
    }
}
