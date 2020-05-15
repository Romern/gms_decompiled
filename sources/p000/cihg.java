package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* renamed from: cihg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihg extends cihi {

    /* renamed from: d */
    private final Method f190296d;

    /* renamed from: e */
    private final Method f190297e;

    /* renamed from: f */
    private final Method f190298f;

    /* renamed from: g */
    private final Class f190299g;

    /* renamed from: h */
    private final Class f190300h;

    public cihg(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f190296d = method;
        this.f190297e = method2;
        this.f190298f = method3;
        this.f190299g = cls;
        this.f190300h = cls2;
    }

    /* renamed from: a */
    public final int mo86107a() {
        return 1;
    }

    /* renamed from: b */
    public final void mo86110b(SSLSocket sSLSocket) {
        try {
            this.f190298f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError();
        } catch (InvocationTargetException e2) {
        }
    }

    /* renamed from: a */
    public final String mo86108a(SSLSocket sSLSocket) {
        try {
            cihh cihh = (cihh) Proxy.getInvocationHandler(this.f190297e.invoke(null, sSLSocket));
            int i = cihh.f190301c;
            if (cihh.f190302a) {
                return null;
            }
            String str = cihh.f190303b;
            if (str != null) {
                return str;
            }
            cihi.f190305a.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
        } catch (InvocationTargetException e) {
            throw new AssertionError();
        } catch (IllegalAccessException e2) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public final void mo86109a(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cihj cihj = (cihj) list.get(i);
            if (cihj != cihj.HTTP_1_0) {
                arrayList.add(cihj.f190314e);
            }
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cihi.class.getClassLoader(), new Class[]{this.f190299g, this.f190300h}, new cihh(arrayList));
            this.f190296d.invoke(null, sSLSocket, newProxyInstance);
        } catch (InvocationTargetException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
