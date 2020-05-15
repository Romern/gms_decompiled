package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* renamed from: cavf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cavf extends cavh {

    /* renamed from: b */
    private final Method f176125b;

    /* renamed from: c */
    private final Method f176126c;

    /* renamed from: d */
    private final Method f176127d;

    /* renamed from: e */
    private final Class f176128e;

    /* renamed from: f */
    private final Class f176129f;

    public cavf(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f176125b = method;
        this.f176126c = method2;
        this.f176127d = method3;
        this.f176128e = cls;
        this.f176129f = cls2;
    }

    /* renamed from: a */
    public final String mo74954a(SSLSocket sSLSocket) {
        try {
            cavg cavg = (cavg) Proxy.getInvocationHandler(this.f176126c.invoke(null, sSLSocket));
            int i = cavg.f176130c;
            if (cavg.f176131a) {
                return null;
            }
            String str = cavg.f176132b;
            if (str != null) {
                return str;
            }
            cavb.f176115a.logp(Level.INFO, "com.squareup.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public final void mo74957b(SSLSocket sSLSocket) {
        try {
            this.f176127d.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public final void mo74956a(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            caui caui = (caui) list.get(i);
            if (caui != caui.HTTP_1_0) {
                arrayList.add(caui.f176031e);
            }
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cavh.class.getClassLoader(), new Class[]{this.f176128e, this.f176129f}, new cavg(arrayList));
            this.f176125b.invoke(null, sSLSocket, newProxyInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }
}
