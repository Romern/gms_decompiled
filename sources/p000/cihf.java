package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: cihf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihf extends cihi {

    /* renamed from: d */
    private final Method f190294d;

    /* renamed from: e */
    private final Method f190295e;

    public cihf(Provider provider, Method method, Method method2) {
        super(provider);
        this.f190294d = method;
        this.f190295e = method2;
    }

    /* renamed from: a */
    public final int mo86107a() {
        return 1;
    }

    /* renamed from: a */
    public final String mo86108a(SSLSocket sSLSocket) {
        try {
            return (String) this.f190295e.invoke(sSLSocket, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public final void mo86109a(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cihj cihj = (cihj) it.next();
            if (cihj != cihj.HTTP_1_0) {
                arrayList.add(cihj.f190314e);
            }
        }
        try {
            this.f190294d.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
